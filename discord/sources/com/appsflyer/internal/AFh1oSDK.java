package com.appsflyer.internal;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.appsflyer.migration.internal.MigrationDataProvider;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.v0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1oSDK implements AFh1qSDK {
    private Long AFAdRevenueData;
    private boolean component2;
    private boolean component4;

    @NotNull
    private final AFc1pSDK getCurrencyIso4217Code;

    @NotNull
    private final AFj1rSDK getMediationNetwork;
    private JSONObject getMonetizationNetwork;
    private Long getRevenue;

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFe1mSDK.values().length];
            try {
                iArr[AFe1mSDK.LAUNCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1mSDK.ATTR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getCurrencyIso4217Code = iArr;
        }
    }

    public AFh1oSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull AFj1rSDK aFj1rSDK) {
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFj1rSDK, "");
        this.getCurrencyIso4217Code = aFc1pSDK;
        this.getMediationNetwork = aFj1rSDK;
    }

    private final void getCurrencyIso4217Code(String str, AFh1jSDK aFh1jSDK, JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put(str, jSONObject);
        HashMap map2 = new HashMap();
        map2.put("branch", map);
        HashMap map3 = new HashMap();
        map3.put("external", map2);
        aFh1jSDK.getMonetizationNetwork(map3);
        Map<String, Object> map4 = aFh1jSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        AFe1mSDK currencyIso4217Code = aFh1jSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        getRevenue(map4, currencyIso4217Code);
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final void AFAdRevenueData(@NotNull AFh1jSDK aFh1jSDK) {
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        JSONObject attributionData = MigrationDataProvider.getAttributionData();
        if (attributionData != null) {
            getCurrencyIso4217Code("attr", aFh1jSDK, attributionData);
            this.component4 = true;
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final boolean getMediationNetwork() {
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final void getMonetizationNetwork(@NotNull AFf1rSDK aFf1rSDK, @NotNull Function0<Unit> function0) {
        JSONObject revenue;
        Intrinsics.checkNotNullParameter(aFf1rSDK, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (this.getCurrencyIso4217Code.getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 0) == 1 && aFf1rSDK.getCurrencyIso4217Code == AFe1mSDK.CONVERSION && this.getMediationNetwork.getRevenue() && !getMediationNetwork() && (revenue = getRevenue()) != null) {
            this.getMonetizationNetwork = revenue;
            function0.invoke();
        }
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final void getRevenue(@NotNull AFh1jSDK aFh1jSDK) {
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        JSONObject jSONObject = this.getMonetizationNetwork;
        if (jSONObject != null) {
            Intrinsics.checkNotNull(jSONObject);
            getCurrencyIso4217Code("attr", aFh1jSDK, jSONObject);
        } else {
            JSONObject revenue = getRevenue();
            if (revenue != null) {
                getCurrencyIso4217Code("attr", aFh1jSDK, revenue);
            }
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final void u_(@NotNull Intent intent, @NotNull AFa1rSDK aFa1rSDK) throws Throwable {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        if (MigrationDataProvider.waitForDeepLinkingData(0L) != null) {
            this.component2 = true;
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        try {
            Object[] objArr = {data, aFa1rSDK};
            Map map = AFa1jSDK.unregisterClient;
            Object declaredConstructor = map.get(228484367);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1jSDK.AFAdRevenueData(ViewConfiguration.getJumpTapTimeout() >> 16, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 37 - (Process.myPid() >> 22))).getDeclaredConstructor(Uri.class, AFa1rSDK.class);
                map.put(228484367, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr);
            Object method = map.get(-891849335);
            if (method == null) {
                method = ((Class) AFa1jSDK.AFAdRevenueData((-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 37 - Color.argb(0, 0, 0, 0))).getMethod("getRevenue", null);
                map.put(-891849335, method);
            }
            Object objInvoke = ((Method) method).invoke(objNewInstance, null);
            Object method2 = map.get(-1788381861);
            if (method2 == null) {
                method2 = ((Class) AFa1jSDK.AFAdRevenueData((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37, (char) (39041 - (Process.myTid() >> 22)), (ViewConfiguration.getTouchSlop() >> 8) + 51)).getMethod("getRevenue", null);
                map.put(-1788381861, method2);
            }
            this.component2 = !((Boolean) ((Method) method2).invoke(objInvoke, null)).booleanValue();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final void getMediationNetwork(@NotNull AFh1jSDK aFh1jSDK) {
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObjectWaitForDeepLinkingData = MigrationDataProvider.waitForDeepLinkingData(3000L);
        if (jSONObjectWaitForDeepLinkingData != null) {
            this.getRevenue = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            getCurrencyIso4217Code("dl", aFh1jSDK, jSONObjectWaitForDeepLinkingData);
        }
        MigrationDataProvider.clear();
    }

    private final JSONObject getRevenue() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObjectWaitForAttributionData = MigrationDataProvider.waitForAttributionData(3000L);
        if (jSONObjectWaitForAttributionData != null) {
            this.AFAdRevenueData = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
        }
        return jSONObjectWaitForAttributionData;
    }

    private final void getRevenue(Map<String, Object> map, AFe1mSDK aFe1mSDK) {
        Long l6;
        int i7 = AFa1uSDK.getCurrencyIso4217Code[aFe1mSDK.ordinal()];
        if (i7 != 1) {
            l6 = i7 != 2 ? null : this.AFAdRevenueData;
        } else {
            l6 = this.getRevenue;
        }
        if (l6 != null) {
            long jLongValue = l6.longValue();
            Map<String, Object> monetizationNetwork = com.appsflyer.internal.AFa1uSDK.getMonetizationNetwork(map);
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            monetizationNetwork.put("migration", v0.b(new Pair("delay", Long.valueOf(jLongValue))));
        }
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final void getCurrencyIso4217Code() {
        this.component2 = false;
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final boolean getMonetizationNetwork() {
        return this.component2;
    }
}
