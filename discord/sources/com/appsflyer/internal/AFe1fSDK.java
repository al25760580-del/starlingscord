package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*+B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\r\u0010\u0012J\u000f\u0010\u000b\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u000b\u0010\u0014J\u000f\u0010\u000e\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u000e\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0019\u0010\tJ\u001d\u0010\r\u001a\u00020\u001b*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\r\u0010\u001cR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0017\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000e\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0019\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u001b\u0010\u000b\u001a\u00020\u00078CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b \u0010\tR\u0014\u0010'\u001a\u00020&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0015\u0010\u001d\u001a\u00020\u00138BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b)\u0010%"}, d2 = {"Lcom/appsflyer/internal/AFe1fSDK;", "Lcom/appsflyer/internal/AFe1lSDK;", "Lcom/appsflyer/internal/AFh1pSDK;", "Lcom/appsflyer/internal/AFc1bSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFc1bSDK;)V", "", "copydefault", "()Z", "", "getCurrencyIso4217Code", "(I)Z", "getRevenue", "getMediationNetwork", "Landroid/content/Context;", "Lcom/appsflyer/internal/AFe1fSDK$AFa1tSDK;", "p1", "(Landroid/content/Context;Lcom/appsflyer/internal/AFe1fSDK$AFa1tSDK;)Z", "", "()J", "Lcom/appsflyer/internal/AFe1uSDK;", "()Lcom/appsflyer/internal/AFe1uSDK;", "getMonetizationNetwork", "(Landroid/content/Context;)I", "AFAdRevenueData", "", "", "(Lcom/appsflyer/internal/AFh1pSDK;Ljava/lang/String;)V", "areAllFieldsValid", "Lcom/appsflyer/internal/AFh1pSDK;", "Lcom/appsflyer/internal/AFc1gSDK;", "component2", "Lcom/appsflyer/internal/AFc1gSDK;", "Lcom/appsflyer/internal/AFc1pSDK;", "component3", "Lcom/appsflyer/internal/AFc1pSDK;", "Lkotlin/Lazy;", "Lcom/appsflyer/internal/AFc1eSDK;", "component1", "Lcom/appsflyer/internal/AFc1eSDK;", "component4", "AFa1vSDK", "AFa1tSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFetchAdvertisingIdTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchAdvertisingIdTask.kt\ncom/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n39#2:397\n1#3:398\n*S KotlinDebug\n*F\n+ 1 FetchAdvertisingIdTask.kt\ncom/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask\n*L\n202#1:397\n*E\n"})
public final class AFe1fSDK extends AFe1lSDK<AFh1pSDK> {

    /* JADX INFO: renamed from: areAllFieldsValid, reason: from kotlin metadata */
    @NotNull
    private final AFh1pSDK getRevenue;

    @NotNull
    private final AFc1eSDK component1;

    /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
    @NotNull
    private final AFc1gSDK getMonetizationNetwork;

    /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
    @NotNull
    private final AFc1pSDK getMediationNetwork;

    /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
    @NotNull
    private final Lazy areAllFieldsValid;

    /* JADX INFO: renamed from: copydefault, reason: from kotlin metadata */
    @NotNull
    private final Lazy getCurrencyIso4217Code;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010$R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFe1fSDK$AFa1tSDK;", "", "", "advertisingId", "", "isLimitAdTrackingEnabled", "advertisingIdWithGps", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "gaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFe1fSDK$AFa1tSDK;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AFa1tSDK {
        private String advertisingId;
        private boolean advertisingIdWithGps;

        @NotNull
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public AFa1tSDK() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ AFa1tSDK copy$default(AFa1tSDK aFa1tSDK, String str, Boolean bool, boolean z5, StringBuilder sb2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = aFa1tSDK.advertisingId;
            }
            if ((i7 & 2) != 0) {
                bool = aFa1tSDK.isLimitAdTrackingEnabled;
            }
            if ((i7 & 4) != 0) {
                z5 = aFa1tSDK.advertisingIdWithGps;
            }
            if ((i7 & 8) != 0) {
                sb2 = aFa1tSDK.gaidError;
            }
            return aFa1tSDK.copy(str, bool, z5, sb2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        @NotNull
        public final AFa1tSDK copy(String advertisingId, Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new AFa1tSDK(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AFa1tSDK)) {
                return false;
            }
            AFa1tSDK aFa1tSDK = (AFa1tSDK) other;
            return Intrinsics.areEqual(this.advertisingId, aFa1tSDK.advertisingId) && Intrinsics.areEqual(this.isLimitAdTrackingEnabled, aFa1tSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1tSDK.advertisingIdWithGps && Intrinsics.areEqual(this.gaidError, aFa1tSDK.gaidError);
        }

        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v9 */
        public final int hashCode() {
            String str = this.advertisingId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z5 = this.advertisingIdWithGps;
            ?? r5 = z5;
            if (z5) {
                r5 = 1;
            }
            return this.gaidError.hashCode() + ((iHashCode2 + r5) * 31);
        }

        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z5) {
            this.advertisingIdWithGps = z5;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        @NotNull
        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        public AFa1tSDK(String str, Boolean bool, boolean z5, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z5;
            this.gaidError = gaidError;
        }

        public /* synthetic */ AFa1tSDK(String str, Boolean bool, boolean z5, StringBuilder sb2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : bool, (i7 & 4) != 0 ? false : z5, (i7 & 8) != 0 ? new StringBuilder() : sb2);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", "reason", "", "onSuccess", "kinds", "", "SDK_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1uSDK implements CloudDevCallback {
        final /* synthetic */ AFa1tSDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1uSDK(AFa1tSDK aFa1tSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1tSDK;
            this.$latch = countDownLatch;
        }

        public final void onError(@NotNull String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFh1ySDK.w$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, a3.e.l("Could not fetch GAID using CloudDevSdk: ", reason), false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(@NotNull Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1fSDK(@NotNull AFc1bSDK aFc1bSDK) {
        super(AFe1mSDK.FETCH_ADVERTISING_ID, new AFe1mSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        AFc1gSDK aFc1gSDKRegisterClient = aFc1bSDK.registerClient();
        Intrinsics.checkNotNullExpressionValue(aFc1gSDKRegisterClient, "");
        this.getMonetizationNetwork = aFc1gSDKRegisterClient;
        AFc1pSDK currencyIso4217Code = aFc1bSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        this.getMediationNetwork = currencyIso4217Code;
        AFc1eSDK aFc1eSDKAfInfoLog = aFc1bSDK.afInfoLog();
        Intrinsics.checkNotNullExpressionValue(aFc1eSDKAfInfoLog, "");
        this.component1 = aFc1eSDKAfInfoLog;
        this.getRevenue = new AFh1pSDK(null, null, null, null, null, null, null, null, 255, null);
        this.areAllFieldsValid = rn.l.b(new Function0<Long>() { // from class: com.appsflyer.internal.AFe1fSDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Long invoke() {
                Long lA0;
                String monetizationNetwork = AFe1fSDK.this.getMediationNetwork.getMonetizationNetwork("com.appsflyer.fetch_ids.timeout");
                return Long.valueOf((monetizationNetwork == null || (lA0 = StringsKt.a0(monetizationNetwork)) == null) ? 1000L : lA0.longValue());
            }
        });
        this.getCurrencyIso4217Code = rn.l.b(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFe1fSDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFe1fSDK.this.getMediationNetwork.getMonetizationNetwork("com.appsflyer.enable_instant_plays")));
            }
        });
    }

    private static boolean areAllFieldsValid() {
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th2) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, th2 instanceof ClassNotFoundException ? "CloudDevSdk not found" : a3.e.l("Unexpected exception while checking if running in cloud environment: ", th2.getMessage()), th2, true, false, false, false, 112, null);
            return false;
        }
    }

    private final boolean component2() {
        return ((Boolean) this.getCurrencyIso4217Code.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045 A[LOOP:0: B:3:0x0005->B:15:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0048 A[EDGE_INSN: B:19:0x0048->B:16:0x0048 BREAK  A[LOOP:0: B:3:0x0005->B:15:0x0045], SYNTHETIC] */
    private final boolean copydefault() {
        boolean z5 = false;
        for (int i7 = 2; i7 > 0; i7--) {
            if (component2() && getMediationNetwork(i7)) {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using Samsung Cloud dev SDK", false, 4, null);
            } else {
                if (getCurrencyIso4217Code(i7)) {
                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using GMS", false, 4, null);
                } else {
                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Failed to fetch GAID", false, 4, null);
                    z5 = false;
                }
                if (!z5) {
                    break;
                }
            }
            z5 = true;
            if (!z5) {
                break;
                break;
            }
        }
        this.component1.component2 = this.getRevenue;
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004d  */
    private final boolean getCurrencyIso4217Code(int p3) {
        boolean z5;
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Trying to fetch GAID...", false, 4, null);
        AFa1tSDK aFa1tSDK = new AFa1tSDK(null, null, false, null, 15, null);
        Context context = this.getMonetizationNetwork.getRevenue;
        Intrinsics.checkNotNull(context);
        int monetizationNetwork = getMonetizationNetwork(context);
        Context context2 = this.getMonetizationNetwork.getRevenue;
        Intrinsics.checkNotNull(context2);
        if (!getRevenue(context2, aFa1tSDK)) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                Context context3 = this.getMonetizationNetwork.getRevenue;
                Intrinsics.checkNotNull(context3);
                if (getCurrencyIso4217Code(context3, aFa1tSDK)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            } else {
                z5 = false;
            }
            String string = aFa1tSDK.getGaidError().toString();
            if (string != null && !StringsKt.K(string)) {
                string = monetizationNetwork + ": " + StringsKt.b0(string).toString();
            }
            getRevenue(this.getRevenue, string);
            if (!z5) {
                return false;
            }
        }
        AFh1pSDK aFh1pSDK = this.getRevenue;
        aFh1pSDK.getRevenue = aFa1tSDK.getAdvertisingId();
        aFh1pSDK.component2 = aFa1tSDK.isLimitAdTrackingEnabled();
        Boolean boolIsLimitAdTrackingEnabled = aFa1tSDK.isLimitAdTrackingEnabled();
        aFh1pSDK.getCurrencyIso4217Code = boolIsLimitAdTrackingEnabled != null ? Boolean.valueOf(!boolIsLimitAdTrackingEnabled.booleanValue()) : null;
        aFh1pSDK.getMediationNetwork = Boolean.valueOf(aFa1tSDK.getAdvertisingIdWithGps());
        aFh1pSDK.AFAdRevenueData = Boolean.FALSE;
        aFh1pSDK.component3 = Boolean.valueOf(p3 != 2);
        return true;
    }

    private final boolean getRevenue(Context p3, AFa1tSDK p5) {
        try {
            AdvertisingIdClient$Info advertisingIdClient$InfoA = oe.a.a(p3);
            p5.setAdvertisingId(advertisingIdClient$InfoA.f5890a);
            p5.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdClient$InfoA.f5891b));
            p5.setAdvertisingIdWithGps(true);
            String advertisingId = p5.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                p5.getGaidError().append("emptyOrNull |");
            }
            if (Unit.f14616a != null) {
                return true;
            }
            p5.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, a3.e.l("Google Play Services is missing ", th2.getMessage()), th2, false, false, false, false, 88, null);
            StringBuilder gaidError = p5.getGaidError();
            gaidError.append(th2.getClass().getSimpleName());
            gaidError.append(" |");
            AFh1ySDK.i$default(aFLogger, aFg1cSDK, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    @NotNull
    public final AFe1uSDK getMediationNetwork() {
        if (this.component1.getRevenue()) {
            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1uSDK.FAILURE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Boolean boolValueOf = Boolean.valueOf(copydefault());
        Boolean bool = Boolean.FALSE;
        AFe1uSDK aFe1uSDK = d0.g(boolValueOf, bool, bool).contains(Boolean.TRUE) ? AFe1uSDK.SUCCESS : AFe1uSDK.FAILURE;
        AFc1eSDK aFc1eSDK = this.component1;
        AFd1aSDK aFd1aSDK = new AFd1aSDK(System.currentTimeMillis() - jCurrentTimeMillis);
        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, a3.e.h(aFd1aSDK.getRevenue, "QUEUE: FetchAdvertisingIdTask: took ", "ms"), false, 4, null);
        aFc1eSDK.getMediationNetwork(aFd1aSDK);
        return aFe1uSDK;
    }

    private static int getMonetizationNetwork(Context p3) {
        try {
            return xe.e.f22922d.b(p3, xe.f.f22923a);
        } catch (Throwable th2) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th2, false, false, false, false, 96, null);
            return -1;
        }
    }

    private final boolean getMediationNetwork(int p3) {
        return getRevenue(p3);
    }

    private final boolean getRevenue(int p3) {
        String str;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        if (areAllFieldsValid()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.getMonetizationNetwork.getRevenue;
            Intrinsics.checkNotNull(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1tSDK aFa1tSDK = new AFa1tSDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.getMonetizationNetwork.getRevenue;
                    Intrinsics.checkNotNull(context2);
                    cloudDevSdk2.request(context2, c0.c("gaid"), new AFa1uSDK(aFa1tSDK, countDownLatch));
                    countDownLatch.await(((Number) this.areAllFieldsValid.getValue()).longValue(), TimeUnit.MILLISECONDS);
                    if (aFa1tSDK.getGaidError().length() > 0) {
                        getRevenue(this.getRevenue, aFa1tSDK.getGaidError().toString());
                    }
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            str = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th2 instanceof ClassNotFoundException) {
                            str = "CloudDevSdk not found";
                        } else {
                            str = "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th2.getMessage();
                        }
                        AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, str, th2, true, false, false, false, 112, null);
                        StringBuilder gaidError = aFa1tSDK.getGaidError();
                        gaidError.append(th2.getClass().getSimpleName());
                        gaidError.append(" |");
                        if (aFa1tSDK.getGaidError().length() > 0) {
                        }
                    } catch (Throwable th3) {
                        if (aFa1tSDK.getGaidError().length() > 0) {
                            getRevenue(this.getRevenue, aFa1tSDK.getGaidError().toString());
                        }
                        throw th3;
                    }
                }
                String advertisingId = aFa1tSDK.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    return false;
                }
                AFh1pSDK aFh1pSDK = this.getRevenue;
                aFh1pSDK.getRevenue = aFa1tSDK.getAdvertisingId();
                Boolean bool = Boolean.FALSE;
                aFh1pSDK.component2 = bool;
                Boolean bool2 = Boolean.TRUE;
                aFh1pSDK.getCurrencyIso4217Code = bool2;
                aFh1pSDK.getMediationNetwork = bool;
                aFh1pSDK.AFAdRevenueData = bool2;
                aFh1pSDK.component3 = Boolean.valueOf(p3 != 2);
                return true;
            }
        }
        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    private final boolean getCurrencyIso4217Code(Context p3, AFa1tSDK p5) {
        try {
            AFb1qSDK.AFa1uSDK aFa1uSDKAFAdRevenueData = AFb1qSDK.AFAdRevenueData(p3);
            p5.setAdvertisingId(aFa1uSDKAFAdRevenueData.getCurrencyIso4217Code);
            p5.setLimitAdTrackingEnabled(Boolean.valueOf(aFa1uSDKAFAdRevenueData.getRevenue()));
            String advertisingId = p5.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                p5.getGaidError().append("emptyOrNull (bypass) |");
            }
            if (Unit.f14616a != null) {
                return true;
            }
            p5.getGaidError().append("gpsAdInfo-null (bypass) |");
            throw new IllegalStateException("GpsAdInfo is null (bypass)");
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, a3.e.l("Failed to fetch GAID: ", th2.getMessage()), th2, true, false, false, false, 64, null);
            StringBuilder gaidError = p5.getGaidError();
            gaidError.append(th2.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th2.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th2.toString();
            }
            AFh1ySDK.i$default(aFLogger, aFg1cSDK, localizedMessage, false, 4, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final long getCurrencyIso4217Code() {
        return ((Number) this.areAllFieldsValid.getValue()).longValue();
    }

    private static void getRevenue(AFh1pSDK aFh1pSDK, String str) {
        String strK;
        if (str == null) {
            return;
        }
        String str2 = aFh1pSDK.getMonetizationNetwork;
        if (str2 != null && (strK = kk.b.k(str2, " | ", str)) != null) {
            str = strK;
        }
        aFh1pSDK.getMonetizationNetwork = str;
    }
}
