package com.appsflyer.internal;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b"}, d2 = {"Lcom/appsflyer/internal/AFh1pSDK;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getRevenue", "Ljava/lang/String;", "component1", "getMonetizationNetwork", "getMediationNetwork", "Ljava/lang/Boolean;", "getCurrencyIso4217Code", "AFAdRevenueData", "component2", "component4", "Ljava/util/Map;", "component3"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AFh1pSDK {
    public Boolean AFAdRevenueData;

    /* JADX INFO: renamed from: component1, reason: from kotlin metadata */
    public String getMonetizationNetwork;

    /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
    public Boolean component3;

    /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
    @NotNull
    public Map<String, Object> component1;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public Boolean getMediationNetwork;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    public Boolean getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    public Boolean component2;
    public String getRevenue;

    private AFh1pSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, @NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getRevenue = str;
        this.component2 = bool;
        this.getCurrencyIso4217Code = bool2;
        this.getMediationNetwork = bool3;
        this.AFAdRevenueData = bool4;
        this.getMonetizationNetwork = str2;
        this.component3 = bool5;
        this.component1 = map;
    }

    public final boolean equals(Object p3) {
        if (this == p3) {
            return true;
        }
        if (!(p3 instanceof AFh1pSDK)) {
            return false;
        }
        AFh1pSDK aFh1pSDK = (AFh1pSDK) p3;
        return Intrinsics.areEqual(this.getRevenue, aFh1pSDK.getRevenue) && Intrinsics.areEqual(this.component2, aFh1pSDK.component2) && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFh1pSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.getMediationNetwork, aFh1pSDK.getMediationNetwork) && Intrinsics.areEqual(this.AFAdRevenueData, aFh1pSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getMonetizationNetwork, aFh1pSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.component3, aFh1pSDK.component3) && Intrinsics.areEqual(this.component1, aFh1pSDK.component1);
    }

    public final int hashCode() {
        String str = this.getRevenue;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.component2;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.getCurrencyIso4217Code;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.getMediationNetwork;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.AFAdRevenueData;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.getMonetizationNetwork;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.component3;
        return this.component1.hashCode() + ((iHashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "AdvertisingIdData(advertisingId=" + this.getRevenue + ", isLimited=" + this.component2 + ", isEnabled=" + this.getCurrencyIso4217Code + ", isGaidWithGps=" + this.getMediationNetwork + ", isGaidWithSamsungCloudDev=" + this.AFAdRevenueData + ", gaidError=" + this.getMonetizationNetwork + ", retry=" + this.component3 + ", metadata=" + this.component1 + ")";
    }

    public /* synthetic */ AFh1pSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : bool, (i7 & 4) != 0 ? null : bool2, (i7 & 8) != 0 ? null : bool3, (i7 & 16) != 0 ? null : bool4, (i7 & 32) != 0 ? null : str2, (i7 & 64) != 0 ? null : bool5, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new HashMap() : map);
    }

    public AFh1pSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
