package com.appsflyer.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 "}, d2 = {"Lcom/appsflyer/internal/AFi1ySDK;", "", "", "p0", "", "p1", "", "", "p2", "", "p3", "p4", "p5", "<init>", "(JFLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getMonetizationNetwork", "()Z", "getCurrencyIso4217Code", "Ljava/lang/String;", "getMediationNetwork", "I", "AFAdRevenueData", "F", "component3", "getRevenue", "Ljava/util/List;", "component2", "J", "component4"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFi1ySDK {
    public final float AFAdRevenueData;

    /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
    @NotNull
    public final String getRevenue;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public final int getMonetizationNetwork;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    public List<String> component2;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @NotNull
    public final String getMediationNetwork;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    public long component4;

    public AFi1ySDK(long j, float f2, @NotNull List<String> list, int i7, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component4 = j;
        this.AFAdRevenueData = f2;
        this.component2 = list;
        this.getMonetizationNetwork = i7;
        this.getMediationNetwork = str;
        this.getRevenue = str2;
    }

    public final boolean equals(Object p3) {
        if (this == p3) {
            return true;
        }
        if (!Intrinsics.areEqual(AFi1ySDK.class, p3 != null ? p3.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(p3, "");
        AFi1ySDK aFi1ySDK = (AFi1ySDK) p3;
        return this.component4 == aFi1ySDK.component4 && this.AFAdRevenueData == aFi1ySDK.AFAdRevenueData && Intrinsics.areEqual(this.component2, aFi1ySDK.component2) && this.getMonetizationNetwork == aFi1ySDK.getMonetizationNetwork && Intrinsics.areEqual(this.getMediationNetwork, aFi1ySDK.getMediationNetwork) && Intrinsics.areEqual(this.getRevenue, aFi1ySDK.getRevenue);
    }

    public final boolean getMonetizationNetwork() {
        long millis = TimeUnit.SECONDS.toMillis(this.component4);
        AFa1uSDK monetizationNetwork = AFa1uSDK.getMonetizationNetwork();
        return millis > ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{monetizationNetwork}, 389316487, -389316474, System.identityHashCode(monetizationNetwork))).component4().getCurrencyIso4217Code();
    }

    public final int hashCode() {
        return this.getRevenue.hashCode() + ((this.getMediationNetwork.hashCode() + ((a3.e.f(this.component2, a3.e.a(Long.hashCode(this.component4) * 31, 31, this.AFAdRevenueData), 31) + this.getMonetizationNetwork) * 31)) * 31);
    }
}
