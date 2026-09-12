package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFa1mSDK;", "", "", "p0", "Lcom/appsflyer/deeplink/DeepLink;", "p1", "<init>", "(ZLcom/appsflyer/deeplink/DeepLink;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getCurrencyIso4217Code", "Lcom/appsflyer/deeplink/DeepLink;", "AFAdRevenueData", "getRevenue", "Z", "()Z", "getMediationNetwork"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AFa1mSDK {

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public final DeepLink AFAdRevenueData;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    private final boolean getMediationNetwork;

    public AFa1mSDK(boolean z5, DeepLink deepLink) {
        this.getMediationNetwork = z5;
        this.AFAdRevenueData = deepLink;
    }

    public final boolean equals(Object p3) {
        if (this == p3) {
            return true;
        }
        if (!(p3 instanceof AFa1mSDK)) {
            return false;
        }
        AFa1mSDK aFa1mSDK = (AFa1mSDK) p3;
        return this.getMediationNetwork == aFa1mSDK.getMediationNetwork && Intrinsics.areEqual(this.AFAdRevenueData, aFa1mSDK.AFAdRevenueData);
    }

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from getter */
    public final boolean getGetMediationNetwork() {
        return this.getMediationNetwork;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z5 = this.getMediationNetwork;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        int i7 = r5 * 31;
        DeepLink deepLink = this.AFAdRevenueData;
        return i7 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @NotNull
    public final String toString() {
        return "DdlResponse(secondPing=" + this.getMediationNetwork + ", deepLink=" + this.AFAdRevenueData + ")";
    }

    public /* synthetic */ AFa1mSDK(boolean z5, DeepLink deepLink, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? true : z5, (i7 & 2) != 0 ? null : deepLink);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AFa1mSDK() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
