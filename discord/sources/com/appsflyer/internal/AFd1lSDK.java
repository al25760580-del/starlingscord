package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.discord.js_watchdog.JSWatchdogManagerKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1lSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static String AFAdRevenueData = null;
    private static boolean areAllFieldsValid = false;
    private static char[] component1 = null;
    private static int component3 = 0;
    private static int copy = 1;
    public static String getRevenue;
    private static int hashCode;
    private static boolean toString;
    private final AFj1eSDK component2;
    private final AFe1ySDK component4;
    private final AppsFlyerProperties getCurrencyIso4217Code;
    private final AFc1pSDK getMediationNetwork;
    private final AFd1kSDK getMonetizationNetwork;

    static {
        getMediationNetwork();
        getRevenue = "https://%sgcdsdk.%s/install_data/v5.0/";
        AFAdRevenueData = "https://%sonelink.%s/shortlink-sdk/v2";
        copy = (hashCode + 95) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    public AFd1lSDK(AFd1kSDK aFd1kSDK, AFc1pSDK aFc1pSDK, AppsFlyerProperties appsFlyerProperties, AFe1ySDK aFe1ySDK, AFj1eSDK aFj1eSDK) {
        this.getMonetizationNetwork = aFd1kSDK;
        this.getMediationNetwork = aFc1pSDK;
        this.getCurrencyIso4217Code = appsFlyerProperties;
        this.component4 = aFe1ySDK;
        this.component2 = aFj1eSDK;
    }

    private static void a(String str, String str2, int[] iArr, int i7, Object[] objArr) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            $10 = ($11 + 93) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            $11 = ($10 + 3) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1iSDK aFk1iSDK = new AFk1iSDK();
        char[] cArr2 = component1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i10 = 0; i10 < length; i10++) {
                cArr3[i10] = (char) (((long) cArr2[i10]) ^ 1825820251896122634L);
            }
            cArr2 = cArr3;
        }
        int i11 = (int) (1825820251896122634L ^ ((long) component3));
        if (toString) {
            int length2 = bArr.length;
            aFk1iSDK.getCurrencyIso4217Code = length2;
            char[] cArr4 = new char[length2];
            aFk1iSDK.getMediationNetwork = 0;
            while (true) {
                int i12 = aFk1iSDK.getMediationNetwork;
                int i13 = aFk1iSDK.getCurrencyIso4217Code;
                if (i12 >= i13) {
                    String str3 = new String(cArr4);
                    $11 = ($10 + 13) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    objArr[0] = str3;
                    return;
                }
                cArr4[i12] = (char) (cArr2[bArr[(i13 - 1) - i12] + i7] - i11);
                aFk1iSDK.getMediationNetwork = i12 + 1;
            }
        } else if (areAllFieldsValid) {
            $11 = ($10 + 37) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            int length3 = cArr.length;
            aFk1iSDK.getCurrencyIso4217Code = length3;
            char[] cArr5 = new char[length3];
            aFk1iSDK.getMediationNetwork = 0;
            while (true) {
                int i14 = aFk1iSDK.getMediationNetwork;
                int i15 = aFk1iSDK.getCurrencyIso4217Code;
                if (i14 >= i15) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i14] = (char) (cArr2[cArr[(i15 - 1) - i14] - i7] - i11);
                    aFk1iSDK.getMediationNetwork = i14 + 1;
                }
            }
        } else {
            int length4 = iArr.length;
            aFk1iSDK.getCurrencyIso4217Code = length4;
            char[] cArr6 = new char[length4];
            aFk1iSDK.getMediationNetwork = 0;
            while (true) {
                int i16 = aFk1iSDK.getMediationNetwork;
                int i17 = aFk1iSDK.getCurrencyIso4217Code;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i18 = $11 + 67;
                $10 = i18 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                if (i18 % 2 != 0) {
                    cArr6[i16] = (char) (cArr2[iArr[i17 * i16] + i7] >>> i11);
                } else {
                    cArr6[i16] = (char) (cArr2[iArr[(i17 - 1) - i16] - i7] - i11);
                    i16++;
                }
                aFk1iSDK.getMediationNetwork = i16;
            }
        }
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i7, int i10, int i11) throws UnsupportedEncodingException {
        int i12 = ~i7;
        int i13 = ~i10;
        int i14 = (~(i12 | i13)) | (~(i13 | i11));
        int i15 = ~i11;
        int i16 = i15 | i7;
        int i17 = ((~i16) * 886) + ((i7 | (~(i10 | i15))) * (-1772)) + ((i14 | (~(i16 | i10))) * 886) + (i10 * (-885)) + (i7 * 1773);
        if (i17 == 1) {
            return getRevenue(objArr);
        }
        if (i17 == 2) {
            return getCurrencyIso4217Code(objArr);
        }
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        UUID uuid = (UUID) objArr[3];
        String str3 = (String) objArr[4];
        String string = uuid.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFa1uSDK.getMonetizationNetwork().getHostName()));
        sb2.append("/");
        sb2.append(str);
        sb2.append("?id=");
        sb2.append(str2);
        String string2 = sb2.toString();
        Map<String, Object> mapAFAdRevenueData = aFd1lSDK.AFAdRevenueData();
        String strValueOf = String.valueOf(mapAFAdRevenueData.get("build_number"));
        HashMap map = new HashMap();
        map.put("Af-UUID", uuid.toString());
        map.put("Af-Meta-Sdk-Ver", strValueOf);
        map.put("Af-Meta-Counter", String.valueOf(mapAFAdRevenueData.get("counter")));
        map.put("Af-Meta-Model", String.valueOf(mapAFAdRevenueData.get("model")));
        map.put("Af-Meta-Platform", String.valueOf(mapAFAdRevenueData.get("platformextension")));
        map.put("Af-Meta-System-Version", String.valueOf(mapAFAdRevenueData.get("sdk")));
        Object[] objArr2 = new Object[1];
        a(null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, 126 - MotionEvent.axisFromString(""), objArr2);
        map.put(((String) objArr2[0]).intern(), getMediationNetwork(str3, string, "GET", string, str, str2, strValueOf));
        AFd1jSDK aFd1jSDK = (AFd1jSDK) getRevenue(new Object[]{aFd1lSDK, new AFd1dSDK(string2, null, "GET", map, false), new AFd1bSDK()}, 865808376, -865808374, System.identityHashCode(aFd1lSDK));
        hashCode = (copy + 57) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return aFd1jSDK;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006a A[PHI: r12
      0x006a: PHI (r12v9 com.appsflyer.internal.AFj1eSDK) = (r12v8 com.appsflyer.internal.AFj1eSDK), (r12v15 com.appsflyer.internal.AFj1eSDK) binds: [B:14:0x0068, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    public final AFd1jSDK<String> AFAdRevenueData(Map<String, Object> map, String str, String str2) {
        AFj1eSDK aFj1eSDK;
        String currencyIso4217Code;
        try {
            boolean z5 = true;
            Object[] objArr = {map, str};
            Map map2 = AFa1jSDK.unregisterClient;
            Object method = map2.get(203186425);
            if (method == null) {
                method = ((Class) AFa1jSDK.AFAdRevenueData(Drawable.resolveOpacity(0, 0) + 196, (char) (29635 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 37)).getMethod("getRevenue", Map.class, String.class);
                map2.put(203186425, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            int i7 = hashCode + 41;
            copy = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i7 % 2 == 0) {
                aFj1eSDK = this.component2;
                int i10 = 27 / 0;
                if (str2 != null) {
                    if (str2.length() != 0) {
                        z5 = false;
                    }
                }
            } else {
                aFj1eSDK = this.component2;
                if (str2 != null) {
                    if (str2.length() != 0) {
                        z5 = false;
                    }
                }
            }
            if (z5 || new Regex("4.?(\\d+)?.?(\\d+)").d(str2) || new Regex("3.?(\\d+)?.?(\\d+)").d(str2)) {
                currencyIso4217Code = aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
            } else {
                currencyIso4217Code = aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                copy = (hashCode + 37) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            }
            return (AFd1jSDK) getRevenue(new Object[]{this, new AFd1dSDK(aFj1eSDK.getMonetizationNetwork(aFj1eSDK.getRevenue(currencyIso4217Code), false), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1cSDK()}, 865808376, -865808374, System.identityHashCode(this));
        } catch (Throwable th2) {
            try {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            } catch (Throwable th3) {
                AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
                return null;
            }
        }
    }

    public final AFd1jSDK<String> getCurrencyIso4217Code(Map<String, Object> map, String str) {
        int i7 = copy + 47;
        hashCode = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        try {
            if (i7 % 2 != 0) {
                try {
                    Object[] objArr = {map, str};
                    Map map2 = AFa1jSDK.unregisterClient;
                    Object method = map2.get(203186425);
                    if (method == null) {
                        method = ((Class) AFa1jSDK.AFAdRevenueData(196 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (TextUtils.indexOf("", "", 0) + 29636), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36)).getMethod("getRevenue", Map.class, String.class);
                        map2.put(203186425, method);
                    }
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map map3 = AFa1jSDK.unregisterClient;
                Object method2 = map3.get(203186425);
                if (method2 == null) {
                    method2 = ((Class) AFa1jSDK.AFAdRevenueData(Color.rgb(0, 0, 0) + 16777412, (char) (29636 - TextUtils.getOffsetAfter("", 0)), 38 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).getMethod("getRevenue", Map.class, String.class);
                    map3.put(203186425, method2);
                }
                byte[] bArr = (byte[]) ((Method) method2).invoke(null, objArr2);
                AFj1eSDK aFj1eSDK = this.component2;
                AFd1jSDK<String> aFd1jSDK = (AFd1jSDK) getRevenue(new Object[]{this, new AFd1dSDK(aFj1eSDK.getRevenue(aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code("https://%svalidate-and-log.%s/api/v4.0/android/subscription/validateAndLog?app_id=")), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1cSDK()}, 865808376, -865808374, System.identityHashCode(this));
                int i10 = hashCode + 25;
                copy = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                if (i10 % 2 == 0) {
                    int i11 = 17 / 0;
                }
                return aFd1jSDK;
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        } catch (Throwable th4) {
            AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th4, false, false);
            return null;
        }
        AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th4, false, false);
        return null;
    }

    public final AFd1jSDK<String> getMediationNetwork(@NonNull String str, @NonNull Map<String, String> map, String str2, @NonNull UUID uuid, @NonNull String str3) throws UnsupportedEncodingException {
        String string = uuid.toString();
        HashMap map2 = new HashMap();
        map2.put("ttl", "-1");
        map2.put("uuid", string);
        map2.put("data", map);
        map2.put("meta", AFAdRevenueData());
        if (str2 != null) {
            int i7 = copy + 29;
            hashCode = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i7 % 2 != 0) {
                map2.put("brand_domain", str2);
                throw null;
            }
            map2.put("brand_domain", str2);
        }
        String string2 = AFg1hSDK.getCurrencyIso4217Code(map2).toString();
        HashMap map3 = new HashMap();
        Object[] objArr = new Object[1];
        a(null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        map3.put(((String) objArr[0]).intern(), getMediationNetwork(str3, string, "POST", string2));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFa1uSDK.getMonetizationNetwork().getHostName()));
        sb2.append("/");
        sb2.append(str);
        AFd1jSDK<String> mediationNetwork = getMediationNetwork(new AFd1dSDK(sb2.toString(), string2.getBytes(Charset.defaultCharset()), "POST", map3, false), (AFe1vSDK) new AFd1cSDK(), true);
        hashCode = (copy + 95) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return mediationNetwork;
    }

    @NonNull
    public final AFd1jSDK<AFi1wSDK> getMonetizationNetwork(boolean z5, boolean z6, @NonNull String str, int i7) {
        String str2;
        String str3;
        int i10 = hashCode + 107;
        copy = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            throw null;
        }
        AFe1ySDK aFe1ySDK = this.component4;
        Intrinsics.checkNotNullParameter(str, "");
        String str4 = z5 ? AFe1ySDK.getMonetizationNetwork : AFe1ySDK.getRevenue;
        if (z6) {
            copy = (hashCode + 93) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            str2 = "stg";
        } else {
            str2 = "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        if (AFe1ySDK.getRevenue()) {
            copy = (hashCode + 53) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            str3 = (String) aFe1ySDK.getCurrencyIso4217Code.getValue();
        } else {
            str3 = "";
        }
        String str5 = String.format(str4, Arrays.copyOf(new Object[]{str3, str2, aFe1ySDK.getCurrencyIso4217Code(), str}, 4));
        Intrinsics.checkNotNullExpressionValue(str5, "");
        AFd1dSDK aFd1dSDK = new AFd1dSDK(str5, "GET");
        aFd1dSDK.component3 = JSWatchdogManagerKt.FREEZE_CHECK_DELAY_MS;
        return (AFd1jSDK) getRevenue(new Object[]{this, aFd1dSDK, new AFd1eSDK()}, 865808376, -865808374, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        AFd1dSDK aFd1dSDK = (AFd1dSDK) objArr[1];
        AFe1vSDK aFe1vSDK = (AFe1vSDK) objArr[2];
        copy = (hashCode + 83) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        AFd1jSDK mediationNetwork = aFd1lSDK.getMediationNetwork(aFd1dSDK, aFe1vSDK, aFd1lSDK.getMonetizationNetwork());
        int i7 = hashCode + 123;
        copy = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            return mediationNetwork;
        }
        throw null;
    }

    private boolean getMonetizationNetwork() {
        hashCode = (copy + 99) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (this.getCurrencyIso4217Code.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
            return false;
        }
        hashCode = (copy + 29) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0108  */
    public final AFd1jSDK<String> AFAdRevenueData(AFh1jSDK aFh1jSDK, String str, AFc1gSDK aFc1gSDK) {
        String currencyIso4217Code;
        String currencyIso4217Code2;
        try {
            Object[] objArr = {aFh1jSDK, str, aFc1gSDK};
            Map map = AFa1jSDK.unregisterClient;
            Object method = map.get(-371358408);
            if (method == null) {
                method = ((Class) AFa1jSDK.AFAdRevenueData(View.resolveSizeAndState(0, 0, 0) + 196, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 29637), 37 - (ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("getMediationNetwork", AFh1jSDK.class, String.class, AFc1gSDK.class);
                map.put(-371358408, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            AFj1eSDK aFj1eSDK = this.component2;
            Intrinsics.checkNotNullParameter(aFh1jSDK, "");
            boolean mediationNetwork = aFh1jSDK.getMediationNetwork();
            boolean z5 = aFh1jSDK instanceof AFh1nSDK;
            boolean z6 = aFh1jSDK instanceof AFh1lSDK;
            boolean z7 = aFh1jSDK instanceof AFh1kSDK;
            boolean z10 = aFh1jSDK instanceof AFh1bSDK;
            boolean z11 = aFh1jSDK instanceof AFh1dSDK;
            boolean z12 = aFh1jSDK instanceof AFg1uSDK;
            if (aFh1jSDK instanceof AFh1iSDK) {
                currencyIso4217Code = aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code("https://%spia.%s/api/v1.0/pia-android-event?app_id=");
            } else {
                if (!z7) {
                    int i7 = hashCode;
                    int i10 = (i7 + 89) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    copy = i10;
                    if (z6) {
                        currencyIso4217Code = aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code(AFj1eSDK.AFAdRevenueData);
                        copy = (hashCode + 89) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    } else if (z5) {
                        currencyIso4217Code = aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code(AFj1eSDK.getCurrencyIso4217Code);
                    } else if (z10) {
                        int i11 = i10 + 77;
                        hashCode = i11 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        if (i11 % 2 == 0) {
                            currencyIso4217Code = aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code(AFj1eSDK.component4);
                        } else {
                            aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code(AFj1eSDK.component4);
                            throw null;
                        }
                    } else if (z11) {
                        int i12 = i7 + 111;
                        copy = i12 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        if (i12 % 2 != 0) {
                            currencyIso4217Code2 = aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code("https://%ssdk-services.%s/validate-android-signature");
                        } else {
                            aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code("https://%ssdk-services.%s/validate-android-signature");
                            throw null;
                        }
                    } else if (z12) {
                        currencyIso4217Code = aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code(AFj1eSDK.component1);
                    } else if (mediationNetwork) {
                        int i13 = i7 + 35;
                        copy = i13 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        if (i13 % 2 != 0 ? aFh1jSDK.component1 < 2 : aFh1jSDK.component1 < 5) {
                            currencyIso4217Code = aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code(AFj1eSDK.getMediationNetwork);
                        } else {
                            currencyIso4217Code = aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code(AFj1eSDK.component2);
                        }
                    } else {
                        currencyIso4217Code = aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code(AFj1eSDK.areAllFieldsValid);
                    }
                } else {
                    currencyIso4217Code = aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code(AFj1eSDK.AFAdRevenueData);
                    copy = (hashCode + 89) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                }
                return (AFd1jSDK) getRevenue(new Object[]{this, new AFd1dSDK(currencyIso4217Code2, bArr, "POST", Collections.EMPTY_MAP, aFh1jSDK.getRevenue()), new AFd1cSDK()}, 865808376, -865808374, System.identityHashCode(this));
            }
            currencyIso4217Code2 = aFj1eSDK.getMonetizationNetwork(AFj1eSDK.getMediationNetwork(aFj1eSDK.getRevenue(currencyIso4217Code), z5), z12);
            return (AFd1jSDK) getRevenue(new Object[]{this, new AFd1dSDK(currencyIso4217Code2, bArr, "POST", Collections.EMPTY_MAP, aFh1jSDK.getRevenue()), new AFd1cSDK()}, 865808376, -865808374, System.identityHashCode(this));
        } catch (Throwable th2) {
            try {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            } catch (Throwable th3) {
                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", th3, false, false);
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        if (r0 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFd1oSDK getMediationNetwork(java.util.Map<java.lang.String, java.lang.Object> r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1lSDK.getMediationNetwork(java.util.Map, java.lang.String):com.appsflyer.internal.AFd1oSDK");
    }

    @NonNull
    public final AFd1jSDK<AFa1mSDK> getMonetizationNetwork(AFa1pSDK aFa1pSDK) {
        AFd1jSDK<AFa1mSDK> aFd1jSDK = (AFd1jSDK) getRevenue(new Object[]{this, new AFd1dSDK(aFa1pSDK.component3, AFg1hSDK.getCurrencyIso4217Code(aFa1pSDK.getCurrencyIso4217Code).toString().getBytes(Charset.defaultCharset()), "POST", Collections.EMPTY_MAP, aFa1pSDK.getRevenue()), new AFa1qSDK()}, 865808376, -865808374, System.identityHashCode(this));
        hashCode = (copy + 61) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return aFd1jSDK;
    }

    public final AFd1jSDK<String> getRevenue(Map<String, Object> map, String str, String str2) {
        String currencyIso4217Code;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1jSDK.unregisterClient;
            Object method = map2.get(203186425);
            if (method == null) {
                method = ((Class) AFa1jSDK.AFAdRevenueData((Process.myPid() >> 22) + 196, (char) (KeyEvent.getDeadChar(0, 0) + 29636), 37 - Color.red(0))).getMethod("getRevenue", Map.class, String.class);
                map2.put(203186425, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            copy = (hashCode + 75) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            AFj1eSDK aFj1eSDK = this.component2;
            if (str2 != null && str2.length() != 0 && !new Regex("4.?(\\d+)?.?(\\d+)").d(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").d(str2)) {
                currencyIso4217Code = aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
                hashCode = (copy + 37) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            } else {
                hashCode = (copy + 49) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                currencyIso4217Code = aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
            }
            return (AFd1jSDK) getRevenue(new Object[]{this, new AFd1dSDK(aFj1eSDK.getMonetizationNetwork(aFj1eSDK.getRevenue(currencyIso4217Code), false), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1cSDK()}, 865808376, -865808374, System.identityHashCode(this));
        } catch (Throwable th2) {
            try {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            } catch (Throwable th3) {
                AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, "AFFinalizer: reflection init failed.", th3, false, false);
                return null;
            }
        }
    }

    private <T> AFd1jSDK<T> getCurrencyIso4217Code(AFd1dSDK aFd1dSDK, AFe1vSDK<T> aFe1vSDK) {
        return (AFd1jSDK) getRevenue(new Object[]{this, aFd1dSDK, aFe1vSDK}, 865808376, -865808374, System.identityHashCode(this));
    }

    private static String getMediationNetwork(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String strJoin = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append("v2");
        String revenue = AFj1bSDK.getRevenue(strJoin, sb2.toString());
        int i7 = copy + 89;
        hashCode = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            int i10 = 72 / 0;
        }
        return revenue;
    }

    private <T> AFd1jSDK<T> getMediationNetwork(AFd1dSDK aFd1dSDK, AFe1vSDK<T> aFe1vSDK, boolean z5) {
        aFd1dSDK.getMediationNetwork = z5;
        AFd1kSDK aFd1kSDK = this.getMonetizationNetwork;
        AFd1jSDK<T> aFd1jSDK = new AFd1jSDK<>(aFd1dSDK, aFd1kSDK.getMediationNetwork, aFd1kSDK.getRevenue, aFe1vSDK);
        int i7 = hashCode + 57;
        copy = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            return aFd1jSDK;
        }
        throw null;
    }

    public final AFd1jSDK<String> getRevenue(Map<String, Object> map, String str) {
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1jSDK.unregisterClient;
            Object method = map2.get(203186425);
            if (method == null) {
                method = ((Class) AFa1jSDK.AFAdRevenueData((Process.myTid() >> 22) + 196, (char) (TextUtils.lastIndexOf("", '0', 0) + 29637), View.resolveSizeAndState(0, 0, 0) + 37)).getMethod("getRevenue", Map.class, String.class);
                map2.put(203186425, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            hashCode = (copy + 35) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            AFj1eSDK aFj1eSDK = this.component2;
            AFd1jSDK<String> aFd1jSDK = (AFd1jSDK) getRevenue(new Object[]{this, new AFd1dSDK(aFj1eSDK.getRevenue(aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code("https://%svalidate-and-log.%s/api/v4.0/android/one_time_purchase/validateAndLog?app_id=")), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1cSDK()}, 865808376, -865808374, System.identityHashCode(this));
            copy = (hashCode + 69) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            return aFd1jSDK;
        } catch (Throwable th2) {
            try {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            } catch (Throwable th3) {
                AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
                return null;
            }
        }
    }

    public static void getMediationNetwork() {
        component1 = new char[]{36301, 36326, 36281, 36307, 36325, 36327, 36350, 36333, 36336, 36337, 36338, 36321, 36322, 36320};
        component3 = 1912311180;
        areAllFieldsValid = true;
        toString = true;
    }

    public final AFd1jSDK<Map<String, String>> getMediationNetwork(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        return (AFd1jSDK) getRevenue(new Object[]{this, str, str2, uuid, str3}, 1826287225, -1826287225, System.identityHashCode(this));
    }

    public final AFd1jSDK<Map<String, Object>> getMediationNetwork(String str, String str2) {
        return (AFd1jSDK) getRevenue(new Object[]{this, str, str2}, 2067226218, -2067226217, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        AFd1jSDK aFd1jSDK = (AFd1jSDK) getRevenue(new Object[]{aFd1lSDK, AFd1hSDK.AFAdRevenueData(aFd1lSDK.getMediationNetwork.getRevenue.getRevenue.getPackageName(), AFb1jSDK.getRevenue(aFd1lSDK.getMediationNetwork.getMonetizationNetwork), (String) objArr[1], (String) objArr[2]), new AFd1iSDK()}, 865808376, -865808374, System.identityHashCode(aFd1lSDK));
        int i7 = hashCode + 85;
        copy = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 == 0) {
            int i10 = 21 / 0;
        }
        return aFd1jSDK;
    }

    public final AFd1jSDK<String> getRevenue(AFh1gSDK aFh1gSDK) {
        AFd1jSDK<String> aFd1jSDK = (AFd1jSDK) getRevenue(new Object[]{this, new AFd1dSDK(aFh1gSDK.component3, aFh1gSDK.AFAdRevenueData(), "POST", Collections.EMPTY_MAP, true), new AFd1cSDK()}, 865808376, -865808374, System.identityHashCode(this));
        int i7 = copy + 117;
        hashCode = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            int i10 = 59 / 0;
        }
        return aFd1jSDK;
    }

    public final AFd1jSDK<String> AFAdRevenueData(@NonNull String str) {
        AFd1dSDK aFd1dSDK = new AFd1dSDK(str, null, "GET", Collections.EMPTY_MAP, false);
        aFd1dSDK.component3 = 10000;
        aFd1dSDK.getCurrencyIso4217Code = false;
        AFd1jSDK<String> aFd1jSDK = (AFd1jSDK) getRevenue(new Object[]{this, aFd1dSDK, new AFd1cSDK()}, 865808376, -865808374, System.identityHashCode(this));
        copy = (hashCode + 125) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return aFd1jSDK;
    }

    private Map<String, Object> AFAdRevenueData() throws UnsupportedEncodingException {
        HashMap map = new HashMap();
        map.put("build_number", "6.17.3");
        map.put("counter", Integer.valueOf(this.getMediationNetwork.getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 0)));
        map.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a(null, "\u008e\u0087\u0088\u008b\u008d", null, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        map.put("app_version_name", this.getMediationNetwork.n_().versionName);
        map.put("app_id", this.getMediationNetwork.getRevenue.getRevenue.getPackageName());
        map.put("platformextension", new AFa1ySDK().getMediationNetwork());
        copy = (hashCode + 13) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return map;
    }
}
