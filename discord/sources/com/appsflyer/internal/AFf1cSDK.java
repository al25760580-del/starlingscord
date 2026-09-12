package com.appsflyer.internal;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1cSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 0;
    private static int copydefault = 1;
    private long AFAdRevenueData;
    private volatile String areAllFieldsValid;
    private volatile String component1;
    Map<String, Object> getCurrencyIso4217Code;

    @NonNull
    private final AFc1gSDK getMonetizationNetwork;

    @NonNull
    private final AFf1eSDK getRevenue;
    private static char[] component4 = {6849, 65232, 53971, 46742, 35473, 28323, 16961, 9801, 14948, 7687, 61969, 54818};
    private static long component3 = -3612185266591219208L;
    private boolean getMediationNetwork = false;
    private volatile boolean component2 = false;

    public AFf1cSDK(@NonNull AFc1gSDK aFc1gSDK, @NonNull AFf1eSDK aFf1eSDK) {
        this.getMonetizationNetwork = aFc1gSDK;
        this.getRevenue = aFf1eSDK;
    }

    private static void a(int i7, int i10, char c8, Object[] objArr) {
        int i11;
        AFk1hSDK aFk1hSDK = new AFk1hSDK();
        long[] jArr = new long[i7];
        aFk1hSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i12 = aFk1hSDK.getCurrencyIso4217Code;
            if (i12 >= i7) {
                break;
            }
            $11 = ($10 + 7) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            jArr[i12] = (((long) ((char) (((long) component4[i10 + i12]) ^ 8195019394385815022L))) ^ (((long) i12) * (8195019394385815022L ^ component3))) ^ ((long) c8);
            aFk1hSDK.getCurrencyIso4217Code = i12 + 1;
        }
        char[] cArr = new char[i7];
        aFk1hSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i13 = aFk1hSDK.getCurrencyIso4217Code;
            if (i13 >= i7) {
                objArr[0] = new String(cArr);
                return;
            }
            int i14 = $10 + 67;
            $11 = i14 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i14 % 2 == 0) {
                cArr[i13] = (char) jArr[i13];
                i11 = i13 >>> 1;
            } else {
                cArr[i13] = (char) jArr[i13];
                i11 = i13 + 1;
            }
            aFk1hSDK.getCurrencyIso4217Code = i11;
        }
    }

    private long areAllFieldsValid() {
        int i7 = copydefault + 25;
        copy = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 == 0) {
            return this.AFAdRevenueData;
        }
        int i10 = 66 / 0;
        return this.AFAdRevenueData;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    private boolean component1() {
        int i7 = copy + 25;
        copydefault = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 == 0) {
            int i10 = 16 / 0;
            if (this.getCurrencyIso4217Code != null) {
                if (!this.getCurrencyIso4217Code.isEmpty()) {
                    copydefault = (copy + 47) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    return true;
                }
            }
        } else if (this.getCurrencyIso4217Code != null) {
            if (!this.getCurrencyIso4217Code.isEmpty()) {
                copydefault = (copy + 47) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                return true;
            }
        }
        int i11 = copydefault + 43;
        copy = i11 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i11 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i7, int i10, int i11) {
        int i12 = ~i10;
        int i13 = ((i7 | i12) * 983) + (i10 * 984) + (i7 * (-1965));
        int i14 = ~i7;
        int i15 = ~i11;
        int i16 = (((~(i14 | i10)) | (~(i15 | i14))) * 983) + (((~(i12 | i15)) | i14) * (-983)) + i13;
        if (i16 != 1) {
            return i16 != 2 ? getMediationNetwork(objArr) : getMonetizationNetwork(objArr);
        }
        return getRevenue(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public final boolean AFAdRevenueData() {
        int i7 = copydefault + 57;
        copy = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            int i10 = 32 / 0;
            if (this.getMediationNetwork) {
                if (!component1()) {
                    return true;
                }
            }
        } else if (this.getMediationNetwork) {
            if (!component1()) {
                return true;
            }
        }
        copy = (copydefault + 109) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return false;
    }

    public final void component2() {
        copydefault = (copy + 75) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        this.getCurrencyIso4217Code.put("ttr", Long.valueOf(System.currentTimeMillis() - this.AFAdRevenueData));
        this.getCurrencyIso4217Code.put("lvl_timestamp", Long.valueOf(areAllFieldsValid()));
        copydefault = (copy + 11) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    public final void getCurrencyIso4217Code(@NonNull String str) {
        copydefault = (copy + 67) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        this.areAllFieldsValid = str;
        copydefault = (copy + 15) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    public final String getMediationNetwork() {
        copy = (copydefault + 65) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        String str = this.component1;
        copy = (copydefault + 119) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return str;
    }

    public final void getMonetizationNetwork(String str) {
        int i7 = copy + 77;
        copydefault = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 == 0) {
            this.component1 = str;
            int i10 = 49 / 0;
        } else {
            this.component1 = str;
        }
        copy = (copydefault + 47) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFf1cSDK aFf1cSDK = (AFf1cSDK) objArr[0];
        copydefault = (copy + 115) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        boolean z5 = aFf1cSDK.component2;
        int i7 = copydefault + 75;
        copy = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 == 0) {
            return Boolean.valueOf(z5);
        }
        throw null;
    }

    public final void getRevenue(boolean z5) {
        int i7 = copydefault + 63;
        copy = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            this.component2 = z5;
            throw null;
        }
        this.component2 = z5;
        copydefault = (copy + 117) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    public final String getMediationNetwork(AFc1oSDK aFc1oSDK) {
        String str;
        copy = (copydefault + 57) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        boolean z5 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String monetizationNetwork = aFc1oSDK.getMonetizationNetwork("imeiCached", null);
        if (z5 && AFk1xSDK.getRevenue(this.areAllFieldsValid)) {
            copydefault = (copy + 75) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            Context context = this.getMonetizationNetwork.getRevenue;
            if (context == null || !getMediationNetwork(context)) {
                str = null;
            } else {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    str = (String) telephonyManager.getClass().getMethod("getDeviceId", null).invoke(telephonyManager, null);
                    if (str == null) {
                        if (monetizationNetwork != null) {
                            AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(monetizationNetwork)));
                        } else {
                            monetizationNetwork = null;
                        }
                        str = monetizationNetwork;
                    }
                } catch (InvocationTargetException e10) {
                    if (monetizationNetwork != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                    } else {
                        monetizationNetwork = null;
                    }
                    StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                    sb2.append(e10.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e10);
                } catch (Exception e11) {
                    if (monetizationNetwork != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                    } else {
                        monetizationNetwork = null;
                    }
                    StringBuilder sb3 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                    sb3.append(e11.getMessage());
                    AFLogger.afErrorLog(sb3.toString(), e11);
                }
            }
        } else if (this.areAllFieldsValid != null) {
            copy = (copydefault + 5) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            str = this.areAllFieldsValid;
        } else {
            str = null;
        }
        if (!AFk1xSDK.getRevenue(str)) {
            int i7 = copy + 111;
            copydefault = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i7 % 2 == 0) {
                aFc1oSDK.AFAdRevenueData("imeiCached", str);
                throw null;
            }
            aFc1oSDK.AFAdRevenueData("imeiCached", str);
            return str;
        }
        AFLogger.afInfoLog("IMEI was not collected.");
        int i10 = copy + 47;
        copydefault = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i10 % 2 == 0) {
            int i11 = 91 / 0;
        }
        return null;
    }

    public final String getCurrencyIso4217Code() {
        int i7 = copy + 111;
        copydefault = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            return this.areAllFieldsValid;
        }
        throw null;
    }

    public static void getCurrencyIso4217Code(AFh1jSDK aFh1jSDK) {
        try {
            new AFb1sSDK(aFh1jSDK).afInfoLog();
            int i7 = copydefault + 15;
            copy = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i7 % 2 != 0) {
                throw null;
            }
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e10);
        }
    }

    public static void getMonetizationNetwork(Map<String, Object> map, AFc1pSDK aFc1pSDK) {
        copydefault = (copy + 75) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (AFk1xSDK.getRevenue(aFc1pSDK.getMediationNetwork)) {
            copy = (copydefault + 59) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            String monetizationNetwork = aFc1pSDK.getMonetizationNetwork("com.appsflyer.security.uuid");
            if (AFk1xSDK.getRevenue(monetizationNetwork)) {
                monetizationNetwork = AFc1pSDK.getMonetizationNetwork();
            }
            aFc1pSDK.getMediationNetwork = monetizationNetwork.substring(0, 8);
            copy = (copydefault + 19) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        String str = aFc1pSDK.getMediationNetwork;
        try {
            Object[] objArr = new Object[1];
            a((Process.myPid() >> 22) + 12, View.MeasureSpec.makeMeasureSpec(0, 0), (char) (48974 - TextUtils.indexOf("", "", 0, 0)), objArr);
            long j = Long.parseLong(String.valueOf(map.get(((String) objArr[0]).intern())));
            char[] charArray = str.toCharArray();
            int i7 = ((int) (j % 94)) + 33;
            for (int i10 = 0; i10 < charArray.length; i10++) {
                charArray[i10] = (char) (charArray[i10] ^ i7);
            }
            map.put("sbid", new String(charArray));
        } catch (Exception e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception occurred while generating sbid ", e10);
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        try {
            try {
                Object[] objArr2 = {(Map) objArr[1], ((AFf1cSDK) objArr[0]).getMonetizationNetwork.getRevenue};
                Map map = AFa1jSDK.unregisterClient;
                Object declaredConstructor = map.get(-1144864810);
                if (declaredConstructor == null) {
                    declaredConstructor = ((Class) AFa1jSDK.AFAdRevenueData(125 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 36 - View.MeasureSpec.getSize(0))).getDeclaredConstructor(Map.class, Context.class);
                    map.put(-1144864810, declaredConstructor);
                }
                Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr2);
                copydefault = (copy + 125) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                return objNewInstance;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", th3);
            return new HashMap();
        }
    }

    @NonNull
    public final Map<String, Object> getRevenue() {
        HashMap map = new HashMap();
        if (component1()) {
            int i7 = copy + 37;
            copydefault = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i7 % 2 == 0) {
                map.put("lvl", this.getCurrencyIso4217Code);
                throw null;
            }
            map.put("lvl", this.getCurrencyIso4217Code);
        } else if (this.getMediationNetwork) {
            this.getCurrencyIso4217Code = new HashMap();
            component2();
            this.getCurrencyIso4217Code.put("error", "pending LVL response");
            map.put("lvl", this.getCurrencyIso4217Code);
        }
        copydefault = (copy + 113) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return map;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFf1cSDK aFf1cSDK = (AFf1cSDK) objArr[0];
        AFc1pSDK aFc1pSDK = (AFc1pSDK) objArr[1];
        aFf1cSDK.AFAdRevenueData = System.currentTimeMillis();
        aFf1cSDK.getMediationNetwork = aFf1cSDK.getRevenue.AFAdRevenueData(aFf1cSDK.getMonetizationNetwork(aFc1pSDK), aFf1cSDK.getMonetizationNetwork.getRevenue, new AFf1eSDK.AFa1tSDK() { // from class: com.appsflyer.internal.AFf1cSDK.3
            @Override // com.appsflyer.internal.AFf1eSDK.AFa1tSDK
            public final void AFAdRevenueData(@NonNull String str, @NonNull String str2) {
                AFf1cSDK.this.getCurrencyIso4217Code = new ConcurrentHashMap();
                AFf1cSDK.this.getCurrencyIso4217Code.put("signedData", str);
                AFf1cSDK.this.getCurrencyIso4217Code.put("signature", str2);
                AFf1cSDK.this.component2();
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }

            @Override // com.appsflyer.internal.AFf1eSDK.AFa1tSDK
            public final void AFAdRevenueData(String str, Exception exc) {
                AFf1cSDK.this.getCurrencyIso4217Code = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AFf1cSDK.this.component2();
                AFf1cSDK.this.getCurrencyIso4217Code.put("error", message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }
        });
        int i7 = copy + 107;
        copydefault = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final void getRevenue(AFc1pSDK aFc1pSDK) {
        getRevenue(new Object[]{this, aFc1pSDK}, 826598914, -826598912, System.identityHashCode(this));
    }

    private long getMonetizationNetwork(AFc1pSDK aFc1pSDK) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AFb1jSDK.getRevenue(aFc1pSDK.getMonetizationNetwork));
        sb2.append(areAllFieldsValid());
        long monetizationNetwork = AFj1bSDK.getMonetizationNetwork(AFj1bSDK.getMonetizationNetwork(sb2.toString()));
        copy = (copydefault + 41) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return monetizationNetwork;
    }

    public final Map<String, Object> getMediationNetwork(Map<String, Object> map) {
        AFc1iSDK aFc1iSDK = new AFc1iSDK(map, this.getMonetizationNetwork.getRevenue);
        int i7 = copy + 83;
        copydefault = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            return aFc1iSDK;
        }
        throw null;
    }

    private static boolean getMediationNetwork(Context context) {
        int i7 = copydefault + 83;
        copy = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
                return true;
            }
        } else if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return true;
        }
        copy = (copydefault + 87) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        int i10 = copy + 11;
        copydefault = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        int i11 = i10 % 2;
        AFa1uSDK.getMonetizationNetwork();
        if (i11 != 0) {
            return !AFa1uSDK.getRevenue(context);
        }
        AFa1uSDK.getRevenue(context);
        throw null;
    }

    public final Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        return (Map) getRevenue(new Object[]{this, map}, 855506449, -855506448, System.identityHashCode(this));
    }

    public final boolean getMonetizationNetwork() {
        return ((Boolean) getRevenue(new Object[]{this}, 680071429, -680071429, System.identityHashCode(this))).booleanValue();
    }
}
