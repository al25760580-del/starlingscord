package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1rSDK {

    @NotNull
    public final String AFAdRevenueData;
    public final Intent getMediationNetwork;
    public final String getMonetizationNetwork;

    public AFh1rSDK(@NotNull Activity activity, @NotNull AFi1kSDK aFi1kSDK) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(aFi1kSDK, "");
        this.getMediationNetwork = activity.getIntent();
        this.AFAdRevenueData = aFi1kSDK.getCurrencyIso4217Code(activity);
        this.getMonetizationNetwork = aFi1kSDK.getMediationNetwork(activity);
    }
}
