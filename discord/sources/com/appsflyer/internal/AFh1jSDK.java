package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFh1jSDK {
    public Map<String, Object> AFAdRevenueData;
    public String areAllFieldsValid;
    public int component1;
    public String component2;
    public String component3;
    public String component4;
    private final boolean copy;
    public Map<String, Object> getCurrencyIso4217Code;
    public String getMediationNetwork;
    public AppsFlyerRequestListener getMonetizationNetwork;
    public String getRevenue;
    private byte[] hashCode;

    public AFh1jSDK() {
        this(null, null, null);
    }

    public static boolean getCurrencyIso4217Code(double d6) {
        if (d6 < 0.0d || d6 >= 1.0d) {
            return false;
        }
        if (d6 == 0.0d) {
            return true;
        }
        int i7 = (int) (1.0d / d6);
        if (i7 + 1 > 0) {
            return ((int) ((Math.random() * ((double) i7)) + 1.0d)) != i7;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }

    public final byte[] AFAdRevenueData() {
        return this.hashCode;
    }

    public boolean areAllFieldsValid() {
        return true;
    }

    public boolean component1() {
        return true;
    }

    public boolean component3() {
        return false;
    }

    public abstract AFe1mSDK getCurrencyIso4217Code();

    public final boolean getMediationNetwork() {
        return this.component4 == null && this.getRevenue == null;
    }

    public boolean getMonetizationNetwork() {
        return true;
    }

    public final boolean getRevenue() {
        return this.copy;
    }

    public AFh1jSDK(String str, String str2, Boolean bool) {
        this.getCurrencyIso4217Code = new HashMap();
        this.component4 = str;
        this.component3 = str2;
        this.copy = bool != null ? bool.booleanValue() : true;
    }

    public final AFh1jSDK getMonetizationNetwork(Map<String, ?> map) {
        synchronized (map) {
            this.getCurrencyIso4217Code.putAll(map);
        }
        return this;
    }

    public final AFh1jSDK getMonetizationNetwork(String str, Object obj) {
        synchronized (this.getCurrencyIso4217Code) {
            this.getCurrencyIso4217Code.put(str, obj);
        }
        return this;
    }

    public final AFh1jSDK getMonetizationNetwork(int i7) {
        this.component1 = i7;
        synchronized (this.getCurrencyIso4217Code) {
            try {
                if (this.getCurrencyIso4217Code.containsKey("counter")) {
                    this.getCurrencyIso4217Code.put("counter", Integer.toString(i7));
                }
                if (this.getCurrencyIso4217Code.containsKey("launch_counter")) {
                    this.getCurrencyIso4217Code.put("launch_counter", Integer.toString(i7));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    public final AFh1jSDK getMonetizationNetwork(byte[] bArr) {
        this.hashCode = bArr;
        return this;
    }
}
