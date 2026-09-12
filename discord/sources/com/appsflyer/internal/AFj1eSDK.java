package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001;B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u0017\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\u0014J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\nJ\r\u0010#\u001a\u00020\b¢\u0006\u0004\b#\u0010\nJ\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\nJ\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\nJ\r\u0010&\u001a\u00020\b¢\u0006\u0004\b&\u0010\nJ\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\nJ\r\u0010(\u001a\u00020\b¢\u0006\u0004\b(\u0010\nJ\r\u0010)\u001a\u00020\b¢\u0006\u0004\b)\u0010\nJ\u0017\u0010*\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b*\u0010\u001cJ\u000f\u0010+\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010\nJ\u000f\u0010,\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010\nJ\u000f\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010\nJ\u000f\u0010.\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010\nJ\u001d\u00101\u001a\u00020\b*\u00020\b2\b\b\u0002\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\u00020\b*\u00020\b2\b\b\u0002\u00103\u001a\u00020/H\u0002¢\u0006\u0004\b4\u00102J\u0013\u00105\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u001cJ'\u00107\u001a\u000206*\u0002062\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:¨\u0006<"}, d2 = {"Lcom/appsflyer/internal/util/EventUrlResolver;", "", "Lcom/appsflyer/internal/components/IdProvider;", "idProvider", "Lcom/appsflyer/internal/util/ServerConfigUrlFormatter;", "serverConfigUrlFormatter", "<init>", "(Lcom/appsflyer/internal/components/IdProvider;Lcom/appsflyer/internal/util/ServerConfigUrlFormatter;)V", "", "getAdRevenueUrl", "()Ljava/lang/String;", "getAppsTrackingUrl", "getArsBilling4", "getArsBilling5", "getDdlUrl", "getEventsTrackingUrl", "getFirstLaunchUrl", "Lcom/appsflyer/internal/model/event/AFEvent;", "event", "getLaunchUrl", "(Lcom/appsflyer/internal/model/event/AFEvent;)Ljava/lang/String;", "getManualValidateOneTimePurchaseUrl", "getManualValidateSubscriptionPurchaseUrl", "getPlayIntegrityUrl", "getReferrerTrackingUrl", "getRegisterUrl", "billingVersion", "getUrlForArs", "(Ljava/lang/String;)Ljava/lang/String;", "devKey", "timestamp", "getUrlForDdlEvent", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getUrlForEvent", "getUrlForManualOneTimePurchaseValidation", "getUrlForManualSubscriptionPurchaseValidation", "getUrlForPlayIntegrityReporting", "getUrlForPrivacySandbox", "getUrlForRdMonitor", "getUrlForRegister", "getUrlForValidatePurchase", "getUrlForValidatePurchaseWithWebHandler", "getUrlForViap", "getValidatePurchaseUrl", "getValidatePurchaseWithWebHandlerUrl", "getViapBilling4", "getViapBilling5", "", "isAdRevenueEvent", "appendBuildNumber", "(Ljava/lang/String;Z)Ljava/lang/String;", "isRegisterEvent", "appendConfiguredChannel", "appendPackageName", "Landroid/net/Uri$Builder;", "appendSigQueryParam", "(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;", "Lcom/appsflyer/internal/components/IdProvider;", "Lcom/appsflyer/internal/util/ServerConfigUrlFormatter;", "Companion", "SDK_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEventUrlResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventUrlResolver.kt\ncom/appsflyer/internal/util/EventUrlResolver\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n*L\n1#1,349:1\n39#2:350\n*S KotlinDebug\n*F\n+ 1 EventUrlResolver.kt\ncom/appsflyer/internal/util/EventUrlResolver\n*L\n192#1:350\n*E\n"})
public final class AFj1eSDK {

    @NotNull
    public static final String AFAdRevenueData;

    @NotNull
    public static final String areAllFieldsValid;

    @NotNull
    public static final String component1;

    @NotNull
    public static final String component2;

    @NotNull
    public static final String component3;

    @NotNull
    public static final String component4;

    @NotNull
    private static final String copydefault;

    @NotNull
    public static final String getCurrencyIso4217Code;

    @NotNull
    public static final String getMediationNetwork;

    @NotNull
    public static final AFa1vSDK getRevenue = new AFa1vSDK(null);

    @NotNull
    public final AFk1ySDK getMonetizationNetwork;

    @NotNull
    private final AFc1pSDK toString;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006"}, d2 = {"Lcom/appsflyer/internal/AFj1eSDK$AFa1vSDK;", "", "<init>", "()V", "", "copydefault", "Ljava/lang/String;", "getMonetizationNetwork", "getCurrencyIso4217Code", "getMediationNetwork", "getRevenue", "areAllFieldsValid", "component2", "AFAdRevenueData", "component3", "component1", "component4"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1vSDK {
        private AFa1vSDK() {
        }

        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String strJ = kk.b.j(AFa1uSDK.AFAdRevenueData, "/androidevent?app_id=");
        copydefault = strJ;
        AFAdRevenueData = a3.e.l("https://%sattr.%s/api/v", strJ);
        getCurrencyIso4217Code = "https://%sadrevenue.%s/api/v2/generic/v6.17.3/android?app_id=";
        getMediationNetwork = a3.e.l("https://%sconversions.%s/api/v", strJ);
        component2 = a3.e.l("https://%slaunches.%s/api/v", strJ);
        areAllFieldsValid = a3.e.l("https://%sinapps.%s/api/v", strJ);
        component1 = a3.e.l("https://%sregister.%s/api/v", strJ);
        component4 = a3.e.l("https://%svalidate.%s/api/v", strJ);
        component3 = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
    }

    private AFj1eSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull AFk1ySDK aFk1ySDK) {
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFk1ySDK, "");
        this.toString = aFc1pSDK;
        this.getMonetizationNetwork = aFk1ySDK;
    }

    @NotNull
    public static String AFAdRevenueData() {
        return "https://privacy-sandbox.appsflyersdk.com/api/trigger";
    }

    public static String getMediationNetwork(String str, boolean z5) {
        return kk.b.j(str, !z5 ? "&buildnumber=6.17.3" : "");
    }

    @NotNull
    public final String getMonetizationNetwork(String str, String str2) {
        String packageName = this.toString.getRevenue.getRevenue.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String strAreAllFieldsValid = this.toString.areAllFieldsValid();
        if (strAreAllFieldsValid != null && !StringsKt.K(strAreAllFieldsValid)) {
            strAreAllFieldsValid = a3.e.l("-", StringsKt.b0(strAreAllFieldsValid).toString());
        }
        if (strAreAllFieldsValid == null) {
            strAreAllFieldsValid = "";
        }
        String string = StringsKt.b0(strAreAllFieldsValid).toString();
        Uri.Builder builderAppendPath = Uri.parse(this.getMonetizationNetwork.getCurrencyIso4217Code("https://%sdlsdk.%s/v1.0/android/")).buildUpon().appendPath(packageName + string);
        Intrinsics.checkNotNullExpressionValue(builderAppendPath, "");
        if (str == null || str2 == null) {
            String str3 = str == null ? "devKey" : "timestamp";
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, str3.concat(" is null at attempt to generate ddl event url"), new IllegalStateException(str3.concat(" is null")), true, false, false, true);
        } else {
            builderAppendPath.appendQueryParameter("af_sig", AFj1bSDK.getRevenue(str2.concat(str), str));
        }
        String string2 = builderAppendPath.appendQueryParameter("sdk_version", AFa1uSDK.AFAdRevenueData).build().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public final String getRevenue(String str) {
        return kk.b.j(str, this.toString.getRevenue.getRevenue.getPackageName());
    }

    public /* synthetic */ AFj1eSDK(AFc1pSDK aFc1pSDK, AFk1ySDK aFk1ySDK, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1pSDK, (i7 & 2) != 0 ? new AFk1wSDK() : aFk1ySDK);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFj1eSDK(@NotNull AFc1pSDK aFc1pSDK) {
        this(aFc1pSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
    }

    public final String getMonetizationNetwork(String str, boolean z5) {
        if (z5) {
            return str;
        }
        String strAreAllFieldsValid = this.toString.areAllFieldsValid();
        String strConcat = strAreAllFieldsValid != null ? "&channel=".concat(strAreAllFieldsValid) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        return kk.b.j(str, strConcat);
    }
}
