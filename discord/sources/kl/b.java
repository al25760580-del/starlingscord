package kl;

import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import f0.e;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f14572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WifiManager f14573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TelephonyManager f14574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReactApplicationContext f14575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14576e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14577f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14578g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14579h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f14580i;

    public b(ReactApplicationContext reactApplicationContext) {
        this.f14575d = reactApplicationContext;
        this.f14572a = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.f14573b = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService("wifi");
        this.f14574c = (TelephonyManager) reactApplicationContext.getSystemService("phone");
    }

    public static String b(InetAddress inetAddress) {
        short networkPrefixLength;
        for (InterfaceAddress interfaceAddress : NetworkInterface.getByInetAddress(inetAddress).getInterfaceAddresses()) {
            if (interfaceAddress.getAddress().getAddress().length == 4) {
                networkPrefixLength = interfaceAddress.getNetworkPrefixLength();
                int i7 = (-1) << (32 - networkPrefixLength);
                Locale locale = Locale.US;
                return ((i7 >> 24) & 255) + "." + ((i7 >> 16) & 255) + "." + ((i7 >> 8) & 255) + "." + (i7 & 255);
            }
        }
        networkPrefixLength = 0;
        int i10 = (-1) << (32 - networkPrefixLength);
        Locale locale2 = Locale.US;
        return ((i10 >> 24) & 255) + "." + ((i10 >> 16) & 255) + "." + ((i10 >> 8) & 255) + "." + (i10 & 255);
    }

    public final WritableMap a(String str) {
        String str2;
        WifiInfo connectionInfo;
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReactApplicationContext reactApplicationContext = this.f14575d;
        int iA = y0.b.a(reactApplicationContext, "android.permission.ACCESS_WIFI_STATE");
        WifiManager wifiManager = this.f14573b;
        if (iA == 0) {
            writableMapCreateMap.putBoolean("isWifiEnabled", wifiManager != null ? wifiManager.isWifiEnabled() : false);
        }
        writableMapCreateMap.putString("type", str != null ? str : kk.b.b(this.f14577f));
        boolean z5 = (e.a(this.f14577f, 4) || e.a(this.f14577f, 5)) ? false : true;
        writableMapCreateMap.putBoolean("isConnected", z5);
        writableMapCreateMap.putBoolean("isInternetReachable", this.f14579h && (str == null || str.equals(kk.b.b(this.f14577f))));
        if (str == null) {
            str = kk.b.b(this.f14577f);
        }
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        switch (str) {
            case "ethernet":
                try {
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    while (networkInterfaces.hasMoreElements()) {
                        Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                        while (true) {
                            if (inetAddresses.hasMoreElements()) {
                                InetAddress inetAddressNextElement = inetAddresses.nextElement();
                                if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                                    writableMapCreateMap2.putString("ipAddress", inetAddressNextElement.getHostAddress());
                                    writableMapCreateMap2.putString("subnet", b(inetAddressNextElement));
                                    break;
                                }
                            }
                        }
                    }
                    break;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    break;
                }
                break;
            case "cellular":
                int i7 = this.f14578g;
                if (i7 != 0) {
                    if (i7 == 1) {
                        str2 = "2g";
                    } else if (i7 == 2) {
                        str2 = "3g";
                    } else if (i7 == 3) {
                        str2 = "4g";
                    } else {
                        if (i7 != 4) {
                            throw null;
                        }
                        str2 = "5g";
                    }
                    writableMapCreateMap2.putString("cellularGeneration", str2);
                }
                String networkOperatorName = this.f14574c.getNetworkOperatorName();
                if (networkOperatorName != null) {
                    writableMapCreateMap2.putString("carrier", networkOperatorName);
                    break;
                }
                break;
            case "wifi":
                if (y0.b.a(reactApplicationContext, "android.permission.ACCESS_WIFI_STATE") == 0 && wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                    try {
                        String ssid = connectionInfo.getSSID();
                        if (ssid != null && !ssid.contains("<unknown ssid>")) {
                            writableMapCreateMap2.putString("ssid", ssid.replace("\"", ""));
                        }
                        break;
                    } catch (Exception unused) {
                    }
                    try {
                        String bssid = connectionInfo.getBSSID();
                        if (bssid != null) {
                            writableMapCreateMap2.putString("bssid", bssid);
                        }
                        break;
                    } catch (Exception unused2) {
                    }
                    try {
                        writableMapCreateMap2.putInt("strength", WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100));
                        break;
                    } catch (Exception unused3) {
                    }
                    try {
                        writableMapCreateMap2.putInt("frequency", connectionInfo.getFrequency());
                        break;
                    } catch (Exception unused4) {
                    }
                    try {
                        byte[] byteArray = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                        hf.a.i(byteArray);
                        writableMapCreateMap2.putString("ipAddress", InetAddress.getByAddress(byteArray).getHostAddress());
                        break;
                    } catch (Exception unused5) {
                    }
                    try {
                        byte[] byteArray2 = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                        hf.a.i(byteArray2);
                        writableMapCreateMap2.putString("subnet", b(InetAddress.getByAddress(byteArray2)));
                        break;
                    } catch (Exception unused6) {
                    }
                    try {
                        writableMapCreateMap2.putInt("linkSpeed", connectionInfo.getLinkSpeed());
                        break;
                    } catch (Exception unused7) {
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            writableMapCreateMap2.putInt("rxLinkSpeed", connectionInfo.getRxLinkSpeedMbps());
                        }
                        break;
                    } catch (Exception unused8) {
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            writableMapCreateMap2.putInt("txLinkSpeed", connectionInfo.getTxLinkSpeedMbps());
                        }
                    } catch (Exception unused9) {
                    }
                    break;
                }
                break;
        }
        if (z5) {
            ConnectivityManager connectivityManager = this.f14572a;
            writableMapCreateMap2.putBoolean("isConnectionExpensive", connectivityManager != null ? connectivityManager.isActiveNetworkMetered() : true);
        }
        writableMapCreateMap.putMap("details", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    public final void c(int i7, int i10, boolean z5) {
        Boolean bool = this.f14580i;
        if (bool != null) {
            z5 = bool.booleanValue();
        }
        boolean z6 = i7 != this.f14577f;
        boolean z7 = i10 != this.f14578g;
        boolean z10 = z5 != this.f14579h;
        if (z6 || z7 || z10) {
            this.f14577f = i7;
            this.f14578g = i10;
            this.f14579h = z5;
            if (this.f14576e) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f14575d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", a(null));
            }
        }
    }
}
