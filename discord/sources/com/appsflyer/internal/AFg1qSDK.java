package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import j$.util.DesugarTimeZone;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import rn.q;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1qSDK implements AFg1rSDK {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f3856i = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f3857w;

    @NotNull
    private final AFg1sSDK AFAdRevenueData;

    @NotNull
    private final Lazy AFKeystoreWrapper;

    @NotNull
    private final AFc1pSDK areAllFieldsValid;

    @NotNull
    private final AFc1oSDK component1;

    @NotNull
    private final AFg1vSDK component2;

    @NotNull
    private final AFh1tSDK component3;

    @NotNull
    private final AFi1sSDK component4;

    @NotNull
    private final AFf1cSDK copy;

    @NotNull
    private final Lazy copydefault;

    @NotNull
    private final AFc1gSDK equals;

    @NotNull
    private final AFi1lSDK getCurrencyIso4217Code;

    @NotNull
    private final Context getMediationNetwork;

    @NotNull
    private final AFj1pSDK getMonetizationNetwork;

    @NotNull
    private final String getRevenue;

    @NotNull
    private final AFg1xSDK hashCode;

    @NotNull
    private final AFc1eSDK toString;
    private static char[] AFInAppEventType = {35909, 35928, 35921, 35926, 35927, 35903, 35904, 35924, 35933, 35910, 35931, 35879, 35908, 35905, 35911};
    private static int AFLogger = 1912311267;
    private static boolean AFInAppEventParameterName = true;
    private static boolean registerClient = true;

    public AFg1qSDK(@NotNull String str, @NotNull Context context, @NotNull AFi1lSDK aFi1lSDK, @NotNull AFg1sSDK aFg1sSDK, @NotNull AFj1pSDK aFj1pSDK, @NotNull AFg1vSDK aFg1vSDK, @NotNull AFh1tSDK aFh1tSDK, @NotNull AFc1oSDK aFc1oSDK, @NotNull AFc1pSDK aFc1pSDK, @NotNull AFi1sSDK aFi1sSDK, @NotNull AFf1cSDK aFf1cSDK, @NotNull AFc1gSDK aFc1gSDK, @NotNull AFg1xSDK aFg1xSDK, @NotNull AFc1eSDK aFc1eSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1sSDK, "");
        Intrinsics.checkNotNullParameter(aFj1pSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        Intrinsics.checkNotNullParameter(aFh1tSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFi1sSDK, "");
        Intrinsics.checkNotNullParameter(aFf1cSDK, "");
        Intrinsics.checkNotNullParameter(aFc1gSDK, "");
        Intrinsics.checkNotNullParameter(aFg1xSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        this.getRevenue = str;
        this.getMediationNetwork = context;
        this.getCurrencyIso4217Code = aFi1lSDK;
        this.AFAdRevenueData = aFg1sSDK;
        this.getMonetizationNetwork = aFj1pSDK;
        this.component2 = aFg1vSDK;
        this.component3 = aFh1tSDK;
        this.component1 = aFc1oSDK;
        this.areAllFieldsValid = aFc1pSDK;
        this.component4 = aFi1sSDK;
        this.copy = aFf1cSDK;
        this.equals = aFc1gSDK;
        this.hashCode = aFg1xSDK;
        this.toString = aFc1eSDK;
        this.copydefault = rn.l.b(new Function0<AppsFlyerProperties>() { // from class: com.appsflyer.internal.AFg1qSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AppsFlyerProperties invoke() {
                return AppsFlyerProperties.getInstance();
            }
        });
        this.AFKeystoreWrapper = rn.l.b(new Function0<SimpleDateFormat>() { // from class: com.appsflyer.internal.AFg1qSDK.3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            }
        });
    }

    private void AFInAppEventParameterName(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        long j = this.component3.hashCode;
        if (j != 0) {
            f3857w = (f3856i + 41) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            map.put("prev_session_dur", Long.valueOf(j));
            f3856i = (f3857w + 31) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        f3857w = (f3856i + 111) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    private void AFInAppEventType(@NotNull Map<String, Object> map) {
        getMediationNetwork(new Object[]{this, map}, -2015365334, 2015365335, System.identityHashCode(this));
    }

    private static void AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        int i7 = f3857w + 41;
        f3856i = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFa1zSDK.getMonetizationNetwork();
            AFa1zSDK.getRevenue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        Object monetizationNetwork = AFa1zSDK.getMonetizationNetwork();
        String revenue = AFa1zSDK.getRevenue();
        if (monetizationNetwork == null || revenue == null || Integer.parseInt(revenue) <= 0) {
            return;
        }
        f3857w = (f3856i + 57) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        map.put("reinstallCounter", revenue);
        map.put("originalAppsflyerId", monetizationNetwork);
    }

    private void AFLogger(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String string = getMonetizationNetwork().getString(AppsFlyerProperties.EXTENSION);
        if (string != null) {
            f3857w = (f3856i + 39) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (string.length() == 0) {
                return;
            }
            f3857w = (f3856i + 117) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            map.put(AppsFlyerProperties.EXTENSION, string);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007a -> B:20:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(java.lang.String r10, java.lang.String r11, int[] r12, int r13, java.lang.Object[] r14) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1qSDK.a(java.lang.String, java.lang.String, int[], int, java.lang.Object[]):void");
    }

    private void afDebugLog(@NotNull Map<String, Object> map) {
        String revenue;
        Intrinsics.checkNotNullParameter(map, "");
        if (getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            f3856i = (f3857w + 113) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            try {
                this.getMediationNetwork.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                revenue = this.areAllFieldsValid.getRevenue(this.getMediationNetwork);
                f3857w = (f3856i + 105) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            } catch (Throwable unused) {
                revenue = null;
            }
            if (revenue != null) {
                f3857w = (f3856i + 119) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                map.put("fb", revenue);
            }
        }
    }

    private static long areAllFieldsValid() {
        f3856i = (f3857w + 121) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        f3856i = (f3857w + 3) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return jCurrentTimeMillis;
    }

    private void component1(@NotNull Map<String, Object> map) {
        f3856i = (f3857w + 53) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        Intrinsics.checkNotNullParameter(map, "");
        AFf1cSDK.getMonetizationNetwork(map, this.areAllFieldsValid);
        int i7 = f3856i + 43;
        f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private String component2() {
        String string = getMonetizationNetwork().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string == null) {
            f3856i = (f3857w + 75) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            string = getCurrencyIso4217Code("AF_STORE");
        }
        int i7 = f3856i + 95;
        f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 == 0) {
            return string;
        }
        throw null;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        f3856i = (f3857w + 85) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        Intrinsics.checkNotNullParameter(map, "");
        if (aFg1qSDK.getMonetizationNetwork().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            return null;
        }
        String mediationNetwork = aFg1qSDK.copy.getMediationNetwork(aFg1qSDK.component1);
        if (mediationNetwork != null && mediationNetwork.length() != 0) {
            int i7 = f3857w + 87;
            f3856i = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i7 % 2 == 0) {
                map.put("imei", mediationNetwork);
                int i10 = 7 / 0;
            } else {
                map.put("imei", mediationNetwork);
            }
        }
        String revenue = aFg1qSDK.getRevenue(str);
        if (revenue != null) {
            int i11 = f3857w + 43;
            f3856i = i11 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i11 % 2 == 0) {
                aFg1qSDK.component1.AFAdRevenueData("androidIdCached", revenue);
                map.put("android_id", revenue);
                int i12 = 37 / 0;
            } else {
                aFg1qSDK.component1.AFAdRevenueData("androidIdCached", revenue);
                map.put("android_id", revenue);
            }
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
        }
        AFb1mSDK currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(aFg1qSDK.getMediationNetwork);
        if (currencyIso4217Code != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = currencyIso4217Code.getMediationNetwork;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            linkedHashMap.put("isManual", bool);
            String str2 = currencyIso4217Code.getCurrencyIso4217Code;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            linkedHashMap.put("val", str2);
            Boolean bool2 = currencyIso4217Code.getRevenue;
            if (bool2 != null) {
                linkedHashMap.put("isLat", bool2);
            }
            map.put("oaid", linkedHashMap);
        }
        return null;
    }

    private boolean component4() {
        f3857w = (f3856i + 59) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        boolean z5 = Boolean.parseBoolean(this.component1.getMonetizationNetwork("sentSuccessfully", null));
        f3857w = (f3856i + 69) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return z5;
    }

    private final void copy(Map<String, Object> map) {
        UiModeManager uiModeManager;
        int i7 = f3857w + 19;
        f3856i = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0 || Build.VERSION.SDK_INT >= 117) {
            uiModeManager = (UiModeManager) this.getMediationNetwork.getSystemService(UiModeManager.class);
        } else {
            Object systemService = this.getMediationNetwork.getSystemService("uimode");
            uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
        }
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return;
        }
        map.put("tv", Boolean.TRUE);
        f3856i = (f3857w + 63) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    private void copydefault(@NotNull Map<String, Object> map) {
        long seconds;
        TimeUnit timeUnit;
        long j;
        Intrinsics.checkNotNullParameter(map, "");
        long currencyIso4217Code = this.component1.getCurrencyIso4217Code("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.component1.getRevenue("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
        if (currencyIso4217Code > 0) {
            int i7 = f3857w + 121;
            f3856i = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i7 % 2 == 0) {
                timeUnit = TimeUnit.MILLISECONDS;
                j = jCurrentTimeMillis % currencyIso4217Code;
            } else {
                timeUnit = TimeUnit.MILLISECONDS;
                j = jCurrentTimeMillis - currencyIso4217Code;
            }
            seconds = timeUnit.toSeconds(j);
        } else {
            f3857w = (f3856i + 13) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            seconds = -1;
        }
        map.put("timepassedsincelastlaunch", String.valueOf(seconds));
    }

    private void d(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (this.component1.getRevenue("is_stop_tracking_used")) {
            f3856i = (f3857w + 49) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            map.put("istu", String.valueOf(this.component1.getMediationNetwork("is_stop_tracking_used", false)));
            f3856i = (f3857w + 79) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        int i7 = f3856i + 125;
        f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0058  */
    /* JADX WARN: Code duplicated, block: B:12:0x005e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0049  */
    private void e(@NotNull Map<String, Object> map) {
        int i7;
        int i10 = f3857w + 5;
        f3856i = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            boolean mediationNetwork = AFg1tSDK.getMediationNetwork(this.getMediationNetwork);
            AFLogger.afDebugLog("didConfigureTokenRefreshService=" + mediationNetwork);
            int i11 = 45 / 0;
            if (!mediationNetwork) {
                i7 = f3856i + 33;
                f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                if (i7 % 2 == 0) {
                    map.put("tokenRefreshConfigured", Boolean.FALSE);
                    throw null;
                }
                map.put("tokenRefreshConfigured", Boolean.FALSE);
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            boolean mediationNetwork2 = AFg1tSDK.getMediationNetwork(this.getMediationNetwork);
            AFLogger.afDebugLog("didConfigureTokenRefreshService=" + mediationNetwork2);
            if (!mediationNetwork2) {
                i7 = f3856i + 33;
                f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                if (i7 % 2 == 0) {
                    map.put("tokenRefreshConfigured", Boolean.FALSE);
                    throw null;
                }
                map.put("tokenRefreshConfigured", Boolean.FALSE);
            }
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1tSDK.getCurrencyIso4217Code(this.component1)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    private final void equals(Map<String, Object> map) {
        int i7 = f3857w + 85;
        f3856i = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 == 0) {
            int i10 = 2 / 0;
            if (!getMonetizationNetwork().isOtherSdkStringDisabled()) {
                map.put("batteryLevel", String.valueOf(this.AFAdRevenueData.AFAdRevenueData(this.getMediationNetwork).getRevenue));
            }
        } else if (!getMonetizationNetwork().isOtherSdkStringDisabled()) {
            map.put("batteryLevel", String.valueOf(this.AFAdRevenueData.AFAdRevenueData(this.getMediationNetwork).getRevenue));
        }
        int i11 = f3856i + 69;
        f3857w = i11 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @NotNull
    private String getCurrencyIso4217Code(@NotNull SimpleDateFormat simpleDateFormat, int i7) {
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String monetizationNetwork = this.component1.getMonetizationNetwork("appsFlyerFirstInstall", null);
        if (monetizationNetwork == null) {
            int i10 = f3856i + 125;
            f3857w = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i10 % 2 == 0 ? i7 > 1 : i7 > 0) {
                monetizationNetwork = "";
            } else {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                String str = simpleDateFormat.format(new Date());
                f3857w = (f3856i + 121) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                monetizationNetwork = str;
            }
            this.component1.AFAdRevenueData("appsFlyerFirstInstall", monetizationNetwork);
            f3856i = (f3857w + 59) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, a3.e.l("AppsFlyer: first launch date: ", monetizationNetwork), false, 4, null);
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        return monetizationNetwork;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0092  */
    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i7, int i10, int i11) {
        int i12 = ~i10;
        int i13 = ~i11;
        switch ((((~(i7 | i10)) | (~(i11 | i12))) * 49) + (((~((~i7) | i13)) | i12 | (~(i7 | i11))) * (-49)) + (((~(i12 | i13)) | (~(i12 | i7))) * 98) + (i10 * (-97)) + (i7 * 50)) {
            case 1:
                return AFAdRevenueData(objArr);
            case 2:
                return getMonetizationNetwork(objArr);
            case 3:
                return getRevenue(objArr);
            case 4:
                return getMediationNetwork(objArr);
            case 5:
                return areAllFieldsValid(objArr);
            case 6:
                return component1(objArr);
            case 7:
                return component3(objArr);
            case 8:
                return component2(objArr);
            case 9:
                return component4(objArr);
            case 10:
                return copydefault(objArr);
            case 11:
                AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
                if (aFg1qSDK.getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
                    f3857w = (f3856i + 93) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                } else {
                    f3856i = (f3857w + 57) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    if (aFg1qSDK.getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                        f3857w = (f3856i + 93) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    } else {
                        f3857w = (f3856i + 81) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        AFa1uSDK.getMonetizationNetwork();
                        if (AFa1uSDK.getRevenue(aFg1qSDK.getMediationNetwork)) {
                            f3856i = (f3857w + 59) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                            return Boolean.FALSE;
                        }
                    }
                }
                return Boolean.TRUE;
            case 12:
                AFg1qSDK aFg1qSDK2 = (AFg1qSDK) objArr[0];
                f3857w = (f3856i + 83) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                Long lValueOf = Long.valueOf(aFg1qSDK2.areAllFieldsValid.n_().firstInstallTime);
                f3856i = (f3857w + 45) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                return lValueOf;
            default:
                return getCurrencyIso4217Code(objArr);
        }
    }

    private final AppsFlyerProperties getMonetizationNetwork() {
        int i7 = f3856i + 79;
        f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 == 0) {
            return (AppsFlyerProperties) this.copydefault.getValue();
        }
        int i10 = 88 / 0;
        return (AppsFlyerProperties) this.copydefault.getValue();
    }

    private void hashCode(@NotNull Map<String, Object> map) {
        int i7 = f3857w + 101;
        f3856i = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getMediationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getMediationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            throw null;
        }
    }

    private void i(@NotNull Map<String, Object> map) {
        AFb1mSDK aFb1mSDKL_;
        int i7 = f3856i + 57;
        f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            aFb1mSDKL_ = AFb1kSDK.l_(this.getMediationNetwork.getContentResolver());
            int i10 = 54 / 0;
            if (aFb1mSDKL_ == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            aFb1mSDKL_ = AFb1kSDK.l_(this.getMediationNetwork.getContentResolver());
            if (aFb1mSDKL_ == null) {
                return;
            }
        }
        f3856i = (f3857w + 97) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        map.put("amazon_aid", aFb1mSDKL_.getCurrencyIso4217Code);
        map.put("amazon_aid_limit", String.valueOf(aFb1mSDKL_.getRevenue));
    }

    private void registerClient(@NotNull Map<String, Object> map) {
        f3856i = (f3857w + 51) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(this.areAllFieldsValid.getMediationNetwork(this.getMediationNetwork)));
        int i7 = f3857w + 91;
        f3856i = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private final void toString(Map<String, Object> map) {
        int i7 = f3856i + 117;
        f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            AFg1kSDK.AFAdRevenueData(this.getMediationNetwork);
            throw null;
        }
        if (AFg1kSDK.AFAdRevenueData(this.getMediationNetwork)) {
            map.put("inst_app", Boolean.TRUE);
            f3856i = (f3857w + 29) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
    }

    private static void unregisterClient(@NotNull Map<String, Object> map) {
        getMediationNetwork(new Object[]{map}, -43428876, 43428885, (int) System.currentTimeMillis());
    }

    private void w(@NotNull Map<String, Object> map) {
        int i7 = f3856i + 31;
        f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.copy.getMediationNetwork();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String mediationNetwork = this.copy.getMediationNetwork();
        if (mediationNetwork == null || mediationNetwork.length() == 0) {
            return;
        }
        int i10 = f3857w + 83;
        f3856i = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i10 % 2 != 0) {
            map.put("appsflyerKey", mediationNetwork);
        } else {
            map.put("appsflyerKey", mediationNetwork);
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void AFAdRevenueData(@NotNull AFh1jSDK aFh1jSDK) {
        boolean zAreEqual;
        AFd1aSDK aFd1aSDK;
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        if (this.areAllFieldsValid.component1()) {
            AFh1pSDK aFh1pSDK = this.areAllFieldsValid.AFAdRevenueData.component2;
            if (aFh1pSDK == null) {
                f3856i = (f3857w + 101) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                return;
            }
            String str = aFh1pSDK.getMonetizationNetwork;
            if (str != null && str.length() != 0) {
                aFh1jSDK.getMonetizationNetwork("gaidError", aFh1pSDK.getMonetizationNetwork);
            }
            String str2 = aFh1pSDK.getRevenue;
            if (str2 != null) {
                f3856i = (f3857w + 121) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                if (aFh1pSDK.getCurrencyIso4217Code != null) {
                    aFh1jSDK.getMonetizationNetwork("advertiserId", str2);
                    aFh1jSDK.getMonetizationNetwork("advertiserIdEnabled", String.valueOf(aFh1pSDK.getCurrencyIso4217Code));
                    aFh1jSDK.getMonetizationNetwork("isGaidWithGps", String.valueOf(aFh1pSDK.getMediationNetwork));
                }
            }
        } else {
            int i7 = f3856i + 37;
            f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i7 % 2 != 0) {
                Map<String, Object> monetizationNetwork = AFa1uSDK.getMonetizationNetwork(aFh1jSDK.getCurrencyIso4217Code);
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                monetizationNetwork.put("ad_ids_disabled", Boolean.TRUE);
                throw null;
            }
            Map<String, Object> monetizationNetwork2 = AFa1uSDK.getMonetizationNetwork(aFh1jSDK.getCurrencyIso4217Code);
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork2, "");
            monetizationNetwork2.put("ad_ids_disabled", Boolean.TRUE);
        }
        AFh1pSDK aFh1pSDK2 = this.areAllFieldsValid.AFAdRevenueData.component2;
        if (aFh1pSDK2 != null) {
            f3856i = (f3857w + 45) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            zAreEqual = Intrinsics.areEqual(aFh1pSDK2.component3, Boolean.TRUE);
        } else {
            zAreEqual = false;
        }
        aFh1jSDK.getMonetizationNetwork("GAID_retry", String.valueOf(zAreEqual));
        if (!d0.g(AFe1mSDK.CONVERSION, AFe1mSDK.LAUNCH).contains(aFh1jSDK.getCurrencyIso4217Code()) || (aFd1aSDK = this.toString.component4) == null) {
            return;
        }
        int i10 = f3857w + 7;
        f3856i = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i10 % 2 == 0) {
            Map<String, Object> monetizationNetwork3 = AFa1uSDK.getMonetizationNetwork(aFh1jSDK.getCurrencyIso4217Code);
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork3, "");
            monetizationNetwork3.put("fetchAdIdLatency", Long.valueOf(aFd1aSDK.getRevenue));
            throw null;
        }
        Map<String, Object> monetizationNetwork4 = AFa1uSDK.getMonetizationNetwork(aFh1jSDK.getCurrencyIso4217Code);
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork4, "");
        monetizationNetwork4.put("fetchAdIdLatency", Long.valueOf(aFd1aSDK.getRevenue));
        int i11 = f3856i + 33;
        f3857w = i11 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i11 % 2 != 0) {
            int i12 = 92 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getRevenue(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFi1pSDK aFi1pSDK = this.component4.getMediationNetwork;
        AFi1tSDK aFi1tSDKAFAdRevenueData = aFi1pSDK != null ? aFi1pSDK.AFAdRevenueData() : null;
        if (aFi1tSDKAFAdRevenueData != null) {
            map.put("network", aFi1tSDKAFAdRevenueData.getRevenue);
            map.put("ivc", Boolean.valueOf(aFi1tSDKAFAdRevenueData.getCurrencyIso4217Code()));
            if (getMonetizationNetwork().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                f3857w = (f3856i + 95) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            } else {
                f3857w = (f3856i + 89) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                String str = aFi1tSDKAFAdRevenueData.getCurrencyIso4217Code;
                if (str != null) {
                    map.put("operator", str);
                }
                String str2 = aFi1tSDKAFAdRevenueData.getMediationNetwork;
                if (str2 != null) {
                    map.put("carrier", str2);
                    return;
                }
            }
            int i7 = f3856i + 7;
            f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i7 % 2 != 0) {
                throw null;
            }
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        Intrinsics.checkNotNullParameter(map, "");
        AFh1tSDK aFh1tSDK = aFg1qSDK.component3;
        HashMap map2 = new HashMap(aFh1tSDK.AFAdRevenueData);
        aFh1tSDK.AFAdRevenueData.clear();
        aFh1tSDK.getCurrencyIso4217Code.getCurrencyIso4217Code("gcd");
        Intrinsics.checkNotNullExpressionValue(map2, "");
        if (map2.isEmpty()) {
            f3857w = (f3856i + 29) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            return null;
        }
        int i7 = (f3856i + 111) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        f3857w = i7;
        int i10 = i7 + 31;
        f3856i = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i10 % 2 != 0) {
            Map<String, Object> monetizationNetwork = AFa1uSDK.getMonetizationNetwork((Map<String, Object>) map);
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            monetizationNetwork.put("gcd", map2);
            return null;
        }
        Map<String, Object> monetizationNetwork2 = AFa1uSDK.getMonetizationNetwork((Map<String, Object>) map);
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork2, "");
        monetizationNetwork2.put("gcd", map2);
        int i11 = 88 / 0;
        return null;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        Map map = (Map) objArr[0];
        int i7 = f3856i + 107;
        f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        try {
            if (i7 % 2 != 0) {
                Intrinsics.checkNotNullParameter(map, "");
                map.put("lang", Locale.getDefault().getDisplayLanguage());
                throw null;
            }
            Intrinsics.checkNotNullParameter(map, "");
            map.put("lang", Locale.getDefault().getDisplayLanguage());
            try {
                map.put("lang_code", Locale.getDefault().getLanguage());
                f3856i = (f3857w + 51) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            } catch (Exception e10) {
                AFLogger.afErrorLog("Exception while collecting display language code. ", e10);
            }
            try {
                map.put(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
                return null;
            } catch (Exception e11) {
                AFLogger.afErrorLog("Exception while collecting country name. ", e11);
                return null;
            }
        } catch (Exception e12) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e12);
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getMonetizationNetwork(@NotNull AFh1jSDK aFh1jSDK) {
        f3857w = (f3856i + 21) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        Map<String, Object> map = aFh1jSDK.getCurrencyIso4217Code;
        if (aFh1jSDK.getMediationNetwork()) {
            String str = aFh1jSDK.areAllFieldsValid;
            AFc1eSDK aFc1eSDK = this.toString;
            getCurrencyIso4217Code(aFh1jSDK, str, aFc1eSDK.getMonetizationNetwork, aFc1eSDK.getCurrencyIso4217Code);
        } else if (!(aFh1jSDK instanceof AFh1fSDK)) {
            Intrinsics.checkNotNullExpressionValue(map, "");
            String str2 = aFh1jSDK.component4;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            getMediationNetwork(new Object[]{this, map, str2}, 1127076864, -1127076862, System.identityHashCode(this));
        }
        if (d0.g(AFe1mSDK.CONVERSION, AFe1mSDK.LAUNCH, AFe1mSDK.INAPP).contains(aFh1jSDK.getCurrencyIso4217Code())) {
            Intrinsics.checkNotNullExpressionValue(map, "");
            hashCode(map);
        }
        if (aFh1jSDK.getMonetizationNetwork()) {
            f3856i = (f3857w + 29) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            Intrinsics.checkNotNullExpressionValue(map, "");
            component1(map);
            f3856i = (f3857w + 81) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        w(map);
        AFKeystoreWrapper(map);
        getMediationNetwork(new Object[]{this, map}, -2015365334, 2015365335, System.identityHashCode(this));
        AFLogger(map);
        getMediationNetwork(map);
        AFAdRevenueData(map, aFh1jSDK.getMediationNetwork());
        e(map);
        d(map);
        AFAdRevenueData(map, aFh1jSDK);
        map.put("af_events_api", "1");
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        f3857w = (f3856i + 79) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        String monetizationNetwork = aFg1qSDK.component1.getMonetizationNetwork("androidIdCached", null);
        try {
            String string = Settings.Secure.getString(aFg1qSDK.getMediationNetwork.getContentResolver(), "android_id");
            if (string != null) {
                f3857w = (f3856i + 13) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                return string;
            }
        } catch (Exception e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10);
        }
        if (monetizationNetwork == null) {
            return null;
        }
        AFLogger.afDebugLog("use cached AndroidId: " + monetizationNetwork);
        int i7 = f3857w + 3;
        f3856i = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        AFg1sSDK.AFa1uSDK aFa1uSDKAFAdRevenueData = aFg1qSDK.AFAdRevenueData.AFAdRevenueData(aFg1qSDK.getMediationNetwork);
        float f2 = aFa1uSDKAFAdRevenueData.getRevenue;
        String str = aFa1uSDKAFAdRevenueData.AFAdRevenueData;
        map.put("btl", String.valueOf(f2));
        if (str != null) {
            f3856i = (f3857w + 95) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            map.put("btch", str);
        }
        int i7 = f3856i + 31;
        f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            int i10 = 14 / 0;
        }
        return null;
    }

    private final String equals() {
        File fileAFAdRevenueData = AFAdRevenueData(getMediationNetwork("ro.appsflyer.preinstall.path"));
        if (getMonetizationNetwork(fileAFAdRevenueData)) {
            fileAFAdRevenueData = AFAdRevenueData(getCurrencyIso4217Code("AF_PRE_INSTALL_PATH"));
        }
        if (getMonetizationNetwork(fileAFAdRevenueData)) {
            fileAFAdRevenueData = AFAdRevenueData("/data/local/tmp/pre_install.appsflyer");
        }
        if (getMonetizationNetwork(fileAFAdRevenueData)) {
            fileAFAdRevenueData = AFAdRevenueData("/etc/pre_install.appsflyer");
            f3857w = (f3856i + 51) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (getMonetizationNetwork(fileAFAdRevenueData)) {
            f3856i = (f3857w + 101) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            return null;
        }
        String packageName = this.getMediationNetwork.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        return getMonetizationNetwork(fileAFAdRevenueData, packageName);
    }

    private final boolean copy() {
        return ((Boolean) getMediationNetwork(new Object[]{this}, -932948428, 932948439, System.identityHashCode(this))).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        if (r1.toString.equals != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        if (r1.toString.equals != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        com.appsflyer.internal.AFg1qSDK.f3857w = (com.appsflyer.internal.AFg1qSDK.f3856i + 93) % com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        com.appsflyer.internal.AFh1ySDK.i$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.internal.AFg1cSDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        com.appsflyer.internal.AFh1ySDK.i$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.internal.AFg1cSDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object copydefault(java.lang.Object[] r18) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1qSDK.copydefault(java.lang.Object[]):java.lang.Object");
    }

    private final SimpleDateFormat getMediationNetwork() {
        f3857w = (f3856i + 87) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.AFKeystoreWrapper.getValue();
        int i7 = f3857w + 45;
        f3856i = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    private void component2(@NotNull Map<String, ? extends Object> map) {
        getMediationNetwork(new Object[]{this, map}, -2029029470, 2029029475, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getMediationNetwork(@NotNull AFh1jSDK aFh1jSDK) {
        f3857w = (f3856i + 55) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        Map<String, Object> map = aFh1jSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(map, "");
        AFAdRevenueData(map);
        Map<String, Object> map2 = aFh1jSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        getCurrencyIso4217Code(map2, aFh1jSDK.component1);
        Map<String, Object> map3 = aFh1jSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(map3, "");
        AFAdRevenueData(map3, aFh1jSDK.component1);
        Map<String, Object> map4 = aFh1jSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        registerClient(map4);
        Map<String, Object> map5 = aFh1jSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(map5, "");
        afDebugLog(map5);
        Map<String, Object> map6 = aFh1jSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(map6, "");
        AFe1mSDK currencyIso4217Code = aFh1jSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        getMediationNetwork(new Object[]{this, map6, currencyIso4217Code}, -1926240735, 1926240745, System.identityHashCode(this));
        int i7 = f3856i + 119;
        f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @SuppressLint({"HardwareIds"})
    private final String component1() {
        return (String) getMediationNetwork(new Object[]{this}, 969328908, -969328900, System.identityHashCode(this));
    }

    private static void areAllFieldsValid(@NotNull Map<String, Object> map) throws UnsupportedEncodingException {
        f3857w = (f3856i + 59) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a(null, "\u008f\u0089\u0087\u0083\u008e", null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        f3857w = (f3856i + 21) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    private final void component4(Map<String, Object> map) {
        getMediationNetwork(new Object[]{this, map}, -217749996, 217750002, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getRevenue(@NotNull AFh1jSDK aFh1jSDK) {
        int i7 = f3856i + 89;
        f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFh1jSDK, "");
            Map<String, Object> map = aFh1jSDK.getCurrencyIso4217Code;
            Intrinsics.checkNotNullExpressionValue(map, "");
            map.put("open_referrer", aFh1jSDK.getMediationNetwork);
            String str = aFh1jSDK.component2;
            if (str == null || StringsKt.K(str)) {
                return;
            }
            int i10 = f3856i + 41;
            f3857w = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i10 % 2 == 0) {
                map.put("af_web_referrer", aFh1jSDK.component2);
                return;
            } else {
                map.put("af_web_referrer", aFh1jSDK.component2);
                throw null;
            }
        }
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        Map<String, Object> map2 = aFh1jSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        map2.put("open_referrer", aFh1jSDK.getMediationNetwork);
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> map, int i7, int i10) {
        boolean z5;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i7));
        map.put("iaecounter", String.valueOf(i10));
        if (component4()) {
            f3857w = (f3856i + 61) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            z5 = false;
        } else {
            f3856i = (f3857w + 115) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            z5 = true;
        }
        map.put("isFirstCall", String.valueOf(z5));
        f3856i = (f3857w + 37) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x007a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0085  */
    /* JADX WARN: Code duplicated, block: B:14:0x008f  */
    private void getCurrencyIso4217Code(@NotNull Map<String, Object> map, boolean z5) {
        int i7;
        Intrinsics.checkNotNullParameter(map, "");
        HashMap map2 = new HashMap();
        map2.put("cpu_abi", getMediationNetwork("ro.product.cpu.abi"));
        map2.put("cpu_abi2", getMediationNetwork("ro.product.cpu.abi2"));
        map2.put("arch", getMediationNetwork("os.arch"));
        map2.put("build_display_id", getMediationNetwork("ro.build.display.id"));
        if (z5) {
            int i10 = f3857w + 41;
            f3856i = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i10 % 2 == 0) {
                getMediationNetwork(new Object[]{this, map2}, -217749996, 217750002, System.identityHashCode(this));
                if (this.areAllFieldsValid.getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 1) <= 5) {
                    i7 = f3856i + 85;
                    f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    if (i7 % 2 == 0) {
                        map2.putAll(this.getMonetizationNetwork.AFAdRevenueData());
                    } else {
                        map2.putAll(this.getMonetizationNetwork.AFAdRevenueData());
                        throw null;
                    }
                }
            } else {
                getMediationNetwork(new Object[]{this, map2}, -217749996, 217750002, System.identityHashCode(this));
                if (this.areAllFieldsValid.getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 0) <= 2) {
                    i7 = f3856i + 85;
                    f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    if (i7 % 2 == 0) {
                        map2.putAll(this.getMonetizationNetwork.AFAdRevenueData());
                    } else {
                        map2.putAll(this.getMonetizationNetwork.AFAdRevenueData());
                        throw null;
                    }
                }
            }
        }
        map2.put("dim", this.component2.getMediationNetwork(this.getMediationNetwork));
        map.put("deviceData", map2);
    }

    private void component3(@NotNull Map<String, Object> map) {
        getMediationNetwork(new Object[]{this, map}, 1978462197, -1978462194, System.identityHashCode(this));
    }

    @NotNull
    private static String component3() {
        return (String) getMediationNetwork(new Object[0], -879088668, 879088672, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double dPow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / dPow)) + "/" + ((long) (blockCountLong / dPow));
        int i7 = f3857w + 117;
        f3856i = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getMonetizationNetwork(@NotNull Map<String, Object> map) {
        Object objO;
        f3856i = (f3857w + 27) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        Intrinsics.checkNotNullParameter(map, "");
        String str = this.toString.getMediationNetwork;
        if (str != null) {
            int i7 = f3856i + 25;
            f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i7 % 2 == 0) {
                if (map.get("af_deeplink") != null) {
                    AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                } else {
                    try {
                        q qVar = Result.f14614e;
                        JSONObject jSONObject = new JSONObject(str);
                        jSONObject.put("isPush", "true");
                        map.put("af_deeplink", jSONObject.toString());
                        objO = Unit.f14616a;
                    } catch (Throwable th2) {
                        q qVar2 = Result.f14614e;
                        objO = ib.a.o(th2);
                    }
                    Throwable thA = Result.a(objO);
                    if (thA != null) {
                        f3856i = (f3857w + 123) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", thA, false, false, false, false, 120, null);
                    }
                }
            } else {
                map.get("af_deeplink");
                throw null;
            }
        }
        this.toString.getMediationNetwork = null;
        f3857w = (f3856i + 53) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i7 = f3856i + 77;
        f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            String string = aFg1qSDK.getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_ID);
            String string2 = aFg1qSDK.getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_VERSION);
            if (string != null) {
                map.put("onelink_id", string);
            }
            if (string2 != null) {
                map.put("onelink_ver", string2);
                f3857w = (f3856i + 121) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            }
            return null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        aFg1qSDK.getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_ID);
        aFg1qSDK.getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_VERSION);
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getMediationNetwork(@NotNull Map<String, Object> map) {
        f3856i = (f3857w + 77) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        Intrinsics.checkNotNullParameter(map, "");
        String revenue = AFb1jSDK.getRevenue(this.areAllFieldsValid.getMonetizationNetwork);
        if (revenue != null) {
            map.put("uid", revenue);
            boolean mediationNetwork = this.areAllFieldsValid.getMonetizationNetwork.getMediationNetwork("CUSTOM_INSTALL_ID_APPLIED", false);
            Intrinsics.checkNotNullExpressionValue(Boolean.valueOf(mediationNetwork), "");
            if (mediationNetwork) {
                map.put("custom_install_id", Boolean.TRUE);
                return;
            }
            return;
        }
        int i7 = f3857w + 93;
        f3856i = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static List<AFe1mSDK> copydefault() {
        f3857w = (f3856i + 103) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        List<AFe1mSDK> listG = d0.g(AFe1mSDK.CONVERSION, AFe1mSDK.LAUNCH, AFe1mSDK.INAPP, AFe1mSDK.MANUAL_PURCHASE_VALIDATION, AFe1mSDK.ARS_VALIDATE, AFe1mSDK.PURCHASE_VALIDATE, AFe1mSDK.ADREVENUE);
        f3857w = (f3856i + 67) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return listG;
    }

    private final void getCurrencyIso4217Code(Map<String, Object> map, int i7) {
        f3857w = (f3856i + 75) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        try {
            if (this.areAllFieldsValid.n_().versionCode > this.component1.getMediationNetwork("versionCode", 0)) {
                f3857w = (f3856i + 39) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                this.component1.getRevenue("versionCode", this.areAllFieldsValid.n_().versionCode);
            }
            map.put("app_version_code", String.valueOf(this.areAllFieldsValid.n_().versionCode));
            map.put("app_version_name", this.areAllFieldsValid.n_().versionName);
            map.put("targetSDKver", Integer.valueOf(this.areAllFieldsValid.getRevenue.getRevenue.getApplicationInfo().targetSdkVersion));
            map.put("date1", getMediationNetwork().format(new Date(((Long) getMediationNetwork(new Object[]{this}, -1521351773, 1521351785, System.identityHashCode(this))).longValue())));
            map.put("date2", getMediationNetwork().format(new Date(this.areAllFieldsValid.n_().lastUpdateTime)));
            Object[] objArr = new Object[1];
            a(null, "\u008d\u0085\u0087\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, 126 - TextUtils.lastIndexOf("", '0', 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            SimpleDateFormat mediationNetwork = getMediationNetwork();
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            map.put(strIntern, getCurrencyIso4217Code(mediationNetwork, i7));
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th2, true);
        }
    }

    private void AFAdRevenueData(@NotNull Map<String, Object> map, int i7) {
        boolean z5;
        Intrinsics.checkNotNullParameter(map, "");
        String strAreAllFieldsValid = this.areAllFieldsValid.areAllFieldsValid();
        String strAFAdRevenueData = AFAdRevenueData(this.component1, strAreAllFieldsValid);
        boolean z6 = false;
        if (strAFAdRevenueData == null || Intrinsics.areEqual(strAFAdRevenueData, strAreAllFieldsValid)) {
            z5 = false;
        } else {
            f3856i = (f3857w + 17) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            z5 = true;
        }
        if (strAFAdRevenueData == null) {
            int i10 = f3856i + 79;
            f3857w = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (strAreAllFieldsValid != null) {
                z6 = true;
            }
        }
        if (z5 || z6) {
            map.put("af_latestchannel", strAreAllFieldsValid);
        }
        String monetizationNetwork = getMonetizationNetwork(i7);
        if (monetizationNetwork != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            Object lowerCase = monetizationNetwork.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            map.put("af_installstore", lowerCase);
        }
        String strAFAdRevenueData2 = AFAdRevenueData(i7);
        if (strAFAdRevenueData2 != null) {
            int i11 = f3856i + 11;
            f3857w = i11 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i11 % 2 != 0) {
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                Object lowerCase2 = strAFAdRevenueData2.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                map.put("af_preinstall_name", lowerCase2);
                throw null;
            }
            Locale locale3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            Object lowerCase3 = strAFAdRevenueData2.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            map.put("af_preinstall_name", lowerCase3);
        } else {
            f3856i = (f3857w + 77) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        String strComponent2 = component2();
        if (strComponent2 != null) {
            Locale locale4 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale4, "");
            Object lowerCase4 = strComponent2.toLowerCase(locale4);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
            map.put("af_currentstore", lowerCase4);
        }
    }

    @SuppressLint({"PrivateApi"})
    private static String getMediationNetwork(String str) {
        f3857w = (f3856i + 95) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.checkNotNull(objInvoke, "");
            String str2 = (String) objInvoke;
            int i7 = f3857w + 69;
            f3856i = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i7 % 2 != 0) {
                return str2;
            }
            throw null;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return null;
        }
    }

    private final String getRevenue(String str) {
        int i7;
        if (getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false) && (str == null || str.length() == 0)) {
            int i10 = f3857w + 39;
            f3856i = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i10 % 2 == 0) {
                copy();
                throw null;
            }
            if (!copy()) {
                return null;
            }
            str = (String) getMediationNetwork(new Object[]{this}, 969328908, -969328900, System.identityHashCode(this));
            i7 = f3856i + 55;
        } else {
            if (str == null) {
                return null;
            }
            i7 = f3856i + 85;
        }
        f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return str;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        f3856i = (f3857w + 81) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String monetizationNetwork = aFg1qSDK.component1.getMonetizationNetwork("prev_event_name", null);
            if (monetizationNetwork != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", aFg1qSDK.component1.getCurrencyIso4217Code("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", monetizationNetwork);
                map.put("prev_event", jSONObject);
            }
            aFg1qSDK.component1.AFAdRevenueData("prev_event_name", str);
            aFg1qSDK.component1.getRevenue("prev_event_timestamp", System.currentTimeMillis());
            int i7 = f3856i + 59;
            f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i7 % 2 == 0) {
                return null;
            }
            throw null;
        } catch (Exception e10) {
            AFLogger.afErrorLog("Error while processing previous event.", e10);
            return null;
        }
    }

    private String getRevenue() {
        return (String) getMediationNetwork(new Object[]{this}, -1875348758, 1875348758, System.identityHashCode(this));
    }

    private void getMediationNetwork(@NotNull Map<String, Object> map, @NotNull String str) {
        getMediationNetwork(new Object[]{this, map, str}, 1127076864, -1127076862, System.identityHashCode(this));
    }

    private final void AFAdRevenueData(Map<String, Object> map) {
        try {
            long jLongValue = ((Long) getMediationNetwork(new Object[]{this}, -1521351773, 1521351785, System.identityHashCode(this))).longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(jLongValue)));
            int i7 = f3856i + 15;
            f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i7 % 2 != 0) {
                throw null;
            }
        } catch (Exception e10) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e10);
        }
    }

    private String getMonetizationNetwork(int i7) {
        int i10 = f3857w + 57;
        f3856i = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        String strComponent2 = null;
        if (i10 % 2 == 0) {
            this.component1.getRevenue("INSTALL_STORE");
            throw null;
        }
        if (this.component1.getRevenue("INSTALL_STORE")) {
            return this.component1.getMonetizationNetwork("INSTALL_STORE", null);
        }
        if (i7 <= 1) {
            strComponent2 = component2();
        } else {
            int i11 = (f3857w + 117) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            f3856i = i11;
            f3857w = (i11 + 23) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        this.component1.AFAdRevenueData("INSTALL_STORE", strComponent2);
        return strComponent2;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getCurrencyIso4217Code(@NotNull AFh1jSDK aFh1jSDK) throws UnsupportedEncodingException {
        f3856i = (f3857w + 1) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        Map<String, Object> map = aFh1jSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(map, "");
        getCurrencyIso4217Code(map, aFh1jSDK.getMediationNetwork());
        areAllFieldsValid(map);
        getMediationNetwork(new Object[]{map}, -43428876, 43428885, (int) System.currentTimeMillis());
        getRevenue(map);
        getMediationNetwork(new Object[]{this, map, this.toString.AFAdRevenueData}, -361587280, 361587287, System.identityHashCode(this));
        i(map);
        map.put("cell", w0.g(new Pair("mcc", Integer.valueOf(this.getMediationNetwork.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(this.getMediationNetwork.getResources().getConfiguration().mnc))));
        map.put("sig", (String) getMediationNetwork(new Object[]{this}, -1875348758, 1875348758, System.identityHashCode(this)));
        map.put("last_boot_time", Long.valueOf(areAllFieldsValid()));
        map.put("disk", (String) getMediationNetwork(new Object[0], -879088668, 879088672, (int) System.currentTimeMillis()));
        f3856i = (f3857w + 85) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    private void AFAdRevenueData(@NotNull Map<String, Object> map, boolean z5) {
        f3857w = (f3856i + 53) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.getRevenue);
        if (z5) {
            map.put("platform_extension_v2", this.getCurrencyIso4217Code.AFAdRevenueData());
            f3857w = (f3856i + 125) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
    }

    private static void getMonetizationNetwork(@NotNull Map<String, Object> map, String str) {
        f3856i = (f3857w + 43) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null) {
            f3856i = (f3857w + 77) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            map.put("phone", str);
            f3857w = (f3856i + 1) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
    }

    private String AFAdRevenueData(int i7) {
        String monetizationNetwork;
        f3857w = (f3856i + 53) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        String string = getMonetizationNetwork().getString("preInstallName");
        if (string != null) {
            int i10 = f3857w + 15;
            f3856i = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i10 % 2 == 0) {
                int i11 = 12 / 0;
            }
            return string;
        }
        if (this.component1.getRevenue("preInstallName")) {
            monetizationNetwork = this.component1.getMonetizationNetwork("preInstallName", null);
        } else {
            if (i7 <= 1) {
                int i12 = f3856i + 99;
                f3857w = i12 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                if (i12 % 2 == 0) {
                    String strEquals = equals();
                    if (strEquals == null) {
                        int i13 = f3857w + 19;
                        f3856i = i13 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        if (i13 % 2 != 0) {
                            strEquals = getCurrencyIso4217Code("AF_PRE_INSTALL_NAME");
                        } else {
                            getCurrencyIso4217Code("AF_PRE_INSTALL_NAME");
                            throw null;
                        }
                    }
                    string = strEquals;
                } else {
                    equals();
                    throw null;
                }
            }
            if (string != null) {
                this.component1.AFAdRevenueData("preInstallName", string);
            }
            monetizationNetwork = string;
        }
        if (monetizationNetwork != null) {
            f3856i = (f3857w + 73) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            getMonetizationNetwork().set("preInstallName", monetizationNetwork);
        }
        return monetizationNetwork;
    }

    private static boolean getMonetizationNetwork(File file) {
        f3857w = (f3856i + 93) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (file == null || !file.exists()) {
            return true;
        }
        f3856i = (f3857w + 39) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0059 A[EXC_TOP_SPLITTER, PHI: r2
      0x0059: PHI (r2v6 java.io.InputStreamReader) = (r2v14 java.io.InputStreamReader), (r2v15 java.io.InputStreamReader) binds: [B:21:0x0057, B:30:0x007c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r2v7 */
    private static String getMonetizationNetwork(File file, String str) {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        int i7 = f3857w;
        int i10 = i7 + 87;
        f3856i = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        ?? r5 = i10 % 2;
        if (r5 == 0) {
            throw null;
        }
        try {
            if (file == null) {
                int i11 = i7 + 39;
                f3856i = i11 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                if (i11 % 2 == 0) {
                    int i12 = 58 / 0;
                }
                return null;
            }
            try {
                Properties properties = new Properties();
                inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                try {
                    properties.load(inputStreamReader);
                    AFLogger.afInfoLog("Found PreInstall property!");
                    String property = properties.getProperty(str);
                    try {
                        inputStreamReader.close();
                        return property;
                    } catch (Throwable th2) {
                        AFLogger.afErrorLog(th2.getMessage(), th2);
                        return property;
                    }
                } catch (FileNotFoundException unused) {
                    AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                    r5 = inputStreamReader;
                    inputStreamReader2 = inputStreamReader;
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader2.close();
                            r5 = inputStreamReader2;
                        } catch (Throwable th3) {
                            AFLogger.afErrorLog(th3.getMessage(), th3);
                            r5 = inputStreamReader2;
                        }
                    }
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    AFLogger.afErrorLog(th.getMessage(), th);
                    r5 = inputStreamReader;
                    inputStreamReader2 = inputStreamReader;
                    if (inputStreamReader != null) {
                        inputStreamReader2.close();
                        r5 = inputStreamReader2;
                    }
                    return null;
                }
            } catch (FileNotFoundException unused2) {
                inputStreamReader = null;
            } catch (Throwable th5) {
                th = th5;
                inputStreamReader = null;
            }
        } catch (Throwable th6) {
            if (r5 != 0) {
                try {
                    r5.close();
                } catch (Throwable th7) {
                    AFLogger.afErrorLog(th7.getMessage(), th7);
                }
            }
            throw th6;
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> map) {
        String[] strArr;
        f3857w = (f3856i + 15) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        Intrinsics.checkNotNullParameter(map, "");
        String string = getMonetizationNetwork().getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            f3856i = (f3857w + 53) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            map.put(AppsFlyerProperties.APP_ID, string);
        }
        String string2 = getMonetizationNetwork().getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            if (string2.length() != 3) {
                StringBuilder sb2 = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb2.append(string2);
                sb2.append("' is not a legal value.");
                String string3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "");
                AFLogger.afWarnLog(string3);
                f3857w = (f3856i + 87) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            }
            map.put("currency", string2);
        }
        String string4 = getMonetizationNetwork().getString(AppsFlyerProperties.IS_UPDATE);
        if (string4 != null) {
            map.put("isUpdate", string4);
        }
        String string5 = getMonetizationNetwork().getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string5 != null) {
            int i7 = f3857w + 123;
            f3856i = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i7 % 2 != 0) {
                map.put("customData", string5);
            } else {
                map.put("customData", string5);
                throw null;
            }
        }
        String string6 = getMonetizationNetwork().getString(AppsFlyerProperties.APP_USER_ID);
        if (string6 != null) {
            map.put("appUserId", string6);
        }
        String string7 = getMonetizationNetwork().getString(AppsFlyerProperties.USER_EMAILS);
        if (string7 != null) {
            f3856i = (f3857w + 39) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            map.put("user_emails", string7);
        }
        AFb1uSDK aFb1uSDK = this.toString.getRevenue;
        if (aFb1uSDK == null || (strArr = aFb1uSDK.getMediationNetwork) == null) {
            return;
        }
        int i10 = f3856i + 19;
        f3857w = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i10 % 2 == 0) {
            map.put("sharing_filter", strArr);
        } else {
            map.put("sharing_filter", strArr);
            throw null;
        }
    }

    private void AFAdRevenueData(@NotNull Map<String, Object> map, String str) {
        int i7 = f3857w + 101;
        f3856i = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            if (str != null && str.length() != 0) {
                int i10 = f3856i + 17;
                f3857w = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                if (i10 % 2 == 0) {
                    map.put("referrer", str);
                    f3857w = (f3856i + 67) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                } else {
                    map.put("referrer", str);
                    throw null;
                }
            }
            String monetizationNetwork = this.component1.getMonetizationNetwork("extraReferrers", null);
            if (monetizationNetwork != null) {
                map.put("extraReferrers", monetizationNetwork);
            }
            String referrer = getMonetizationNetwork().getReferrer(this.component1);
            if (referrer != null && referrer.length() != 0) {
                int i11 = f3857w + 67;
                f3856i = i11 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                if (i11 % 2 == 0) {
                    int i12 = 10 / 0;
                    if (map.get("referrer") != null) {
                        return;
                    }
                } else if (map.get("referrer") != null) {
                    return;
                }
                map.put("referrer", referrer);
                return;
            }
            f3857w = (f3856i + 17) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getMonetizationNetwork(@NotNull Map<String, Object> map, @NotNull AFe1mSDK aFe1mSDK) {
        getMediationNetwork(new Object[]{this, map, aFe1mSDK}, -1926240735, 1926240745, System.identityHashCode(this));
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i7 = f3856i + 119;
        f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(aFg1qSDK.hashCode.getCurrencyIso4217Code());
            int i10 = 68 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(aFg1qSDK.hashCode.getCurrencyIso4217Code());
        }
        int i11 = f3856i + 53;
        f3857w = i11 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i11 % 2 != 0) {
            int i12 = 1 / 0;
        }
        return null;
    }

    private static String AFAdRevenueData(AFc1oSDK aFc1oSDK, String str) {
        f3857w = (f3856i + 77) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        String monetizationNetwork = aFc1oSDK.getMonetizationNetwork("CACHED_CHANNEL", null);
        if (monetizationNetwork != null) {
            f3856i = (f3857w + 27) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            return monetizationNetwork;
        }
        aFc1oSDK.AFAdRevenueData("CACHED_CHANNEL", str);
        return str;
    }

    private static File AFAdRevenueData(String str) {
        if (str != null) {
            try {
                if (StringsKt.b0(str).toString().length() > 0) {
                    return new File(StringsKt.b0(str).toString());
                }
                f3856i = (f3857w + 3) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getMessage(), th2);
            }
        }
        f3857w = (f3856i + 5) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) throws NoSuchAlgorithmException {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        f3856i = (f3857w + 55) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        String strN_ = AFj1iSDK.N_(aFg1qSDK.getMediationNetwork.getApplicationContext().getPackageManager(), aFg1qSDK.getMediationNetwork.getApplicationContext().getPackageName());
        int i7 = f3856i + 121;
        f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            int i10 = 27 / 0;
        }
        return strN_;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final long getCurrencyIso4217Code() {
        f3857w = (f3856i + 7) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        long jCurrentTimeMillis = System.currentTimeMillis();
        f3856i = (f3857w + 105) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return jCurrentTimeMillis;
    }

    private void getCurrencyIso4217Code(@NotNull AFh1jSDK aFh1jSDK, String str, String str2, AFb1rSDK aFb1rSDK) {
        f3856i = (f3857w + 53) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        Map<String, Object> map = aFh1jSDK.getCurrencyIso4217Code;
        if (aFh1jSDK.getCurrencyIso4217Code() == AFe1mSDK.CONVERSION) {
            f3856i = (f3857w + 13) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            Intrinsics.checkNotNullExpressionValue(map, "");
            equals(map);
            copy(map);
            toString(map);
            AFa1zSDK.getMonetizationNetwork(this.equals, this.areAllFieldsValid);
            f3856i = (f3857w + 3) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        copydefault(map);
        getMediationNetwork(new Object[]{this, map}, 1978462197, -1978462194, System.identityHashCode(this));
        getMediationNetwork(new Object[]{this, map}, -2029029470, 2029029475, System.identityHashCode(this));
        getMonetizationNetwork(map, str2);
        AFAdRevenueData(map, str);
        AFInAppEventParameterName(map);
        if (aFb1rSDK != null) {
            int i7 = f3856i + 9;
            f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i7 % 2 == 0) {
                aFb1rSDK.getMonetizationNetwork(map);
            } else {
                aFb1rSDK.getMonetizationNetwork(map);
                int i10 = 18 / 0;
            }
        }
    }

    private static void AFAdRevenueData(@NotNull Map<String, Object> map, @NotNull AFh1jSDK aFh1jSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        String str = aFh1jSDK.component4;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFh1jSDK.AFAdRevenueData;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    @NotNull
    public final Long AFAdRevenueData() {
        return (Long) getMediationNetwork(new Object[]{this}, -1521351773, 1521351785, System.identityHashCode(this));
    }

    private final String getCurrencyIso4217Code(String str) {
        f3857w = (f3856i + 63) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        String monetizationNetwork = this.areAllFieldsValid.getMonetizationNetwork(str);
        int i7 = f3856i + 3;
        f3857w = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 == 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    private void getCurrencyIso4217Code(@NotNull Map<String, Object> map, String str) {
        getMediationNetwork(new Object[]{this, map, str}, -361587280, 361587287, System.identityHashCode(this));
    }
}
