package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\rR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/AFf1hSDK;", "", "Lcom/appsflyer/internal/AFc1pSDK;", "p0", "Lcom/appsflyer/internal/AFf1iSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1pSDK;Lcom/appsflyer/internal/AFf1iSDK;)V", "", "getMonetizationNetwork", "()J", "", "getRevenue", "()Z", "Lcom/appsflyer/internal/AFc1pSDK;", "getCurrencyIso4217Code", "getMediationNetwork", "Lkotlin/Lazy;", "AFAdRevenueData", "Lcom/appsflyer/internal/AFf1iSDK;", "AFa1zSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFf1hSDK {

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    private final AFf1iSDK getRevenue;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    private final Lazy AFAdRevenueData;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @NotNull
    private final Lazy getMediationNetwork;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    private final AFc1pSDK getCurrencyIso4217Code;
    private static final long AFAdRevenueData = TimeUnit.HOURS.toSeconds(24);

    public AFf1hSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull AFf1iSDK aFf1iSDK) {
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFf1iSDK, "");
        this.getCurrencyIso4217Code = aFc1pSDK;
        this.getRevenue = aFf1iSDK;
        this.AFAdRevenueData = rn.l.b(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1hSDK.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1hSDK.this.getCurrencyIso4217Code.getMonetizationNetwork("com.appsflyer.rc.sandbox")));
            }
        });
        this.getMediationNetwork = rn.l.b(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1hSDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1hSDK.this.getCurrencyIso4217Code.getMonetizationNetwork("com.appsflyer.rc.staging")));
            }
        });
    }

    public final boolean AFAdRevenueData() {
        return ((Boolean) this.getMediationNetwork.getValue()).booleanValue();
    }

    public final boolean getCurrencyIso4217Code() {
        return ((Boolean) this.AFAdRevenueData.getValue()).booleanValue();
    }

    public final long getMonetizationNetwork() {
        Object objO;
        String monetizationNetwork = this.getCurrencyIso4217Code.getMonetizationNetwork("com.appsflyer.rc.cache.max-age-fallback");
        if (monetizationNetwork == null) {
            return AFAdRevenueData;
        }
        try {
            q qVar = Result.f14614e;
            objO = Long.valueOf(Long.parseLong(monetizationNetwork));
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        Throwable thA = Result.a(objO);
        if (thA != null) {
            AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + thA.getMessage(), thA);
            objO = Long.valueOf(AFAdRevenueData);
        }
        return ((Number) objO).longValue();
    }

    public final boolean getRevenue() {
        AFi1ySDK aFi1ySDK;
        AFi1wSDK aFi1wSDK = this.getRevenue.AFAdRevenueData;
        if (aFi1wSDK == null) {
            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFi1zSDK aFi1zSDK = aFi1wSDK.getMonetizationNetwork;
        boolean monetizationNetwork = (aFi1zSDK == null || (aFi1ySDK = aFi1zSDK.getMediationNetwork) == null) ? false : aFi1ySDK.getMonetizationNetwork();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AFf1iSDK aFf1iSDK = this.getRevenue;
        return monetizationNetwork || jCurrentTimeMillis - aFf1iSDK.getCurrencyIso4217Code > TimeUnit.SECONDS.toMillis(aFf1iSDK.getRevenue);
    }
}
