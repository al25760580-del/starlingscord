package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFe1gSDK extends AFe1eSDK<String> {

    @NotNull
    private final AFe1mSDK areAllFieldsValid;

    @NotNull
    private final Map<String, Object> copy;

    @NotNull
    private final AFc1pSDK copydefault;

    @NotNull
    private final AFc1oSDK equals;

    @NotNull
    private final AFf1gSDK hashCode;

    @NotNull
    private final AFg1rSDK toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1gSDK(@NotNull AFe1mSDK aFe1mSDK, @NotNull AFe1mSDK[] aFe1mSDKArr, @NotNull AFc1bSDK aFc1bSDK, String str, @NotNull Map<String, ? extends Object> map) {
        super(aFe1mSDK, aFe1mSDKArr, aFc1bSDK, null);
        Intrinsics.checkNotNullParameter(aFe1mSDK, "");
        Intrinsics.checkNotNullParameter(aFe1mSDKArr, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.areAllFieldsValid = aFe1mSDK;
        this.copy = map;
        AFc1pSDK currencyIso4217Code = aFc1bSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        this.copydefault = currencyIso4217Code;
        AFc1oSDK aFc1oSDKComponent2 = aFc1bSDK.component2();
        Intrinsics.checkNotNullExpressionValue(aFc1oSDKComponent2, "");
        this.equals = aFc1oSDKComponent2;
        AFg1rSDK aFg1rSDKComponent4 = aFc1bSDK.component4();
        Intrinsics.checkNotNullExpressionValue(aFg1rSDKComponent4, "");
        this.toString = aFg1rSDKComponent4;
        AFf1gSDK aFf1gSDKForce = aFc1bSDK.force();
        Intrinsics.checkNotNullExpressionValue(aFf1gSDKForce, "");
        this.hashCode = aFf1gSDKForce;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    public boolean component2() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean copydefault() {
        return true;
    }

    public abstract AFd1jSDK<String> getMediationNetwork(@NotNull Map<String, Object> map, @NotNull String str, String str2);

    public String getMediationNetwork(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    public String getMonetizationNetwork(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFd1jSDK<String> getRevenue(@NotNull String str) {
        AFd1dSDK aFd1dSDK;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> mapN = w0.n(this.copy);
        String mediationNetwork = getMediationNetwork(mapN);
        String monetizationNetwork = getMonetizationNetwork(mapN);
        Map<String, Object> mapN2 = w0.n(mapN);
        getMediationNetwork(mapN2, mediationNetwork);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strComponent4 = this.copydefault.component4();
        if (strComponent4 != null && !StringsKt.K(strComponent4)) {
            linkedHashMap.put("advertising_id", strComponent4);
        }
        AFb1mSDK currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(this.copydefault.getRevenue.getRevenue);
        String str2 = null;
        String str3 = currencyIso4217Code != null ? currencyIso4217Code.getCurrencyIso4217Code : null;
        if (str3 != null && !StringsKt.K(str3)) {
            linkedHashMap.put("oaid", str3);
        }
        AFb1mSDK aFb1mSDKL_ = AFb1kSDK.l_(this.copydefault.getRevenue.getRevenue.getContentResolver());
        String str4 = aFb1mSDKL_ != null ? aFb1mSDKL_.getCurrencyIso4217Code : null;
        if (str4 != null && !StringsKt.K(str4)) {
            linkedHashMap.put("amazon_aid", str4);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            mapN2.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        } else {
            String mediationNetwork2 = ((AFe1eSDK) this).component2.getMediationNetwork(this.equals);
            if (mediationNetwork2 != null && !StringsKt.K(mediationNetwork2)) {
                linkedHashMap.put("imei", mediationNetwork2);
            }
        }
        String revenue = AFb1jSDK.getRevenue(this.copydefault.getMonetizationNetwork);
        if (revenue == null) {
            revenue = "";
        }
        linkedHashMap.put("appsflyer_id", revenue);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "6.17.3");
        if (monetizationNetwork != null && !StringsKt.K(monetizationNetwork)) {
            linkedHashMap.put("sdk_connector_version", monetizationNetwork);
        }
        this.toString.getMonetizationNetwork(linkedHashMap, this.areAllFieldsValid);
        mapN2.put("device_data", linkedHashMap);
        this.hashCode.getMediationNetwork(mapN2, this.areAllFieldsValid);
        AFd1jSDK<String> mediationNetwork3 = getMediationNetwork(mapN2, str, mediationNetwork);
        if (mediationNetwork3 != null && (aFd1dSDK = mediationNetwork3.getRevenue) != null) {
            str2 = aFd1dSDK.getRevenue;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(mapN2);
            AFg1bSDK.getMediationNetwork(toString() + ": preparing data: ", jSONObject);
            AFd1mSDK aFd1mSDK = this.component4;
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            aFd1mSDK.getMonetizationNetwork(str2, string);
        }
        return mediationNetwork3;
    }

    public void getMediationNetwork(@NotNull Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("app_id", this.copydefault.getRevenue.getRevenue.getPackageName());
        String revenue = AFc1pSDK.getRevenue();
        if (revenue != null) {
            map.put("cuid", revenue);
        }
        map.put("app_version_name", this.copydefault.n_().versionName);
        if (component2()) {
            map.put("event_timestamp", Long.valueOf(this.toString.getCurrencyIso4217Code()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }
}
