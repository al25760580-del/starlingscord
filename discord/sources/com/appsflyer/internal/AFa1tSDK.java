package com.appsflyer.internal;

import com.appsflyer.internal.AFe1nSDK.AnonymousClass3;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1tSDK implements Runnable {

    @NotNull
    private final AFh1jSDK AFAdRevenueData;
    private final Map<String, Object> getMonetizationNetwork;

    @NotNull
    private final AFc1bSDK getRevenue;

    public AFa1tSDK(@NotNull AFc1bSDK aFc1bSDK, @NotNull AFh1jSDK aFh1jSDK, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        this.getRevenue = aFc1bSDK;
        this.AFAdRevenueData = aFh1jSDK;
        this.getMonetizationNetwork = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFe1lSDK aFf1sSDK;
        if (this.AFAdRevenueData.getMediationNetwork()) {
            AFf1rSDK aFf1rSDK = new AFf1rSDK(this.AFAdRevenueData, this.getRevenue);
            aFf1rSDK.hashCode = this.getMonetizationNetwork;
            aFf1sSDK = aFf1rSDK;
        } else {
            aFf1sSDK = this.AFAdRevenueData instanceof AFh1nSDK ? new AFf1sSDK((AFh1nSDK) this.AFAdRevenueData, this.getRevenue) : new AFf1uSDK(this.AFAdRevenueData, this.getRevenue);
        }
        AFe1nSDK aFe1nSDKCopydefault = this.getRevenue.copydefault();
        aFe1nSDKCopydefault.AFAdRevenueData.execute(aFe1nSDKCopydefault.new AnonymousClass3(aFf1sSDK));
        this.getRevenue.AFInAppEventParameterName();
        if (AFe1ySDK.getRevenue()) {
            AFe1qSDK aFe1qSDKAFAdRevenueData = this.getRevenue.AFAdRevenueData();
            AFh1jSDK aFh1jSDK = this.AFAdRevenueData;
            Intrinsics.checkNotNullParameter(aFh1jSDK, "");
            if (AFj1iSDK.AFAdRevenueData(aFe1qSDKAFAdRevenueData.AFAdRevenueData.getRevenue)) {
                AFe1rSDK.Companion companion = AFe1rSDK.INSTANCE;
                AFe1rSDK monetizationNetwork = AFe1rSDK.Companion.getMonetizationNetwork(aFh1jSDK);
                if (monetizationNetwork == null) {
                    return;
                }
                aFe1qSDKAFAdRevenueData.AFAdRevenueData(monetizationNetwork, AFe1qSDK.AnonymousClass1.getRevenue);
            }
        }
    }
}
