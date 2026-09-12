package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1hSDK implements AFb1bSDK {

    @NotNull
    private final AFf1cSDK AFAdRevenueData;

    @NotNull
    private final AFc1eSDK getMonetizationNetwork;

    @NotNull
    private final AFc1gSDK getRevenue;

    public AFb1hSDK(@NotNull AFc1eSDK aFc1eSDK, @NotNull AFc1gSDK aFc1gSDK, @NotNull AFf1cSDK aFf1cSDK) {
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(aFc1gSDK, "");
        Intrinsics.checkNotNullParameter(aFf1cSDK, "");
        this.getMonetizationNetwork = aFc1eSDK;
        this.getRevenue = aFc1gSDK;
        this.AFAdRevenueData = aFf1cSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFb1hSDK aFb1hSDK, AppSetIdInfo appSetIdInfo) {
        Intrinsics.checkNotNullParameter(aFb1hSDK, "");
        AFc1eSDK aFc1eSDK = aFb1hSDK.getMonetizationNetwork;
        int scope = appSetIdInfo.getScope();
        String id2 = appSetIdInfo.getId();
        Intrinsics.checkNotNullExpressionValue(id2, "");
        aFc1eSDK.equals = new AFb1gSDK(scope, id2);
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean getMonetizationNetwork() {
        return !this.AFAdRevenueData.getMonetizationNetwork() && !this.getMonetizationNetwork.getMediationNetwork() && AFj1iSDK.getRevenue(this.getRevenue.getRevenue) && AFj1iSDK.getMonetizationNetwork(this.getRevenue.getRevenue);
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void getRevenue() {
        Context context = this.getRevenue.getRevenue;
        if (context != null) {
            try {
                Intrinsics.checkNotNullExpressionValue(AppSet.getClient(context).getAppSetIdInfo().d(new ig.d() { // from class: com.appsflyer.internal.f
                    @Override // ig.d
                    public final void onSuccess(Object obj) {
                        AFb1hSDK.getMediationNetwork(this.f3871d, (AppSetIdInfo) obj);
                    }
                }), "");
            } catch (Throwable th2) {
                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "Error while trying to  fetch App set ID", th2, false, false, false, false, 120, null);
                Unit unit = Unit.f14616a;
            }
        }
    }
}
