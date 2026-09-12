package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1cSDK implements AFb1aSDK {

    @NotNull
    private final ScheduledExecutorService AFAdRevenueData;

    @NotNull
    private final AFi1kSDK getCurrencyIso4217Code;

    @NotNull
    private final AFa1rSDK getMonetizationNetwork;
    private AFb1lSDK getRevenue;

    public AFb1cSDK(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFa1rSDK aFa1rSDK, @NotNull AFi1kSDK aFi1kSDK) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        Intrinsics.checkNotNullParameter(aFi1kSDK, "");
        this.AFAdRevenueData = scheduledExecutorService;
        this.getMonetizationNetwork = aFa1rSDK;
        this.getCurrencyIso4217Code = aFi1kSDK;
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void getCurrencyIso4217Code(@NotNull Context context, @NotNull AFb1aSDK.AFa1ySDK aFa1ySDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFa1ySDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (this.getRevenue != null) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "");
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.getRevenue);
        }
        this.getRevenue = null;
        AFb1lSDK aFb1lSDK = new AFb1lSDK(this.AFAdRevenueData, this.getMonetizationNetwork, this.getCurrencyIso4217Code, aFa1ySDK);
        this.getRevenue = aFb1lSDK;
        if (context instanceof Activity) {
            aFb1lSDK.onActivityResumed((Activity) context);
        }
        Application applicationO_ = AFj1iSDK.O_(context);
        if (applicationO_ != null) {
            applicationO_.registerActivityLifecycleCallbacks(this.getRevenue);
        }
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void getMonetizationNetwork() {
        AFb1aSDK.AFa1ySDK aFa1ySDK;
        AFb1lSDK aFb1lSDK = this.getRevenue;
        if (aFb1lSDK == null || (aFa1ySDK = aFb1lSDK.getRevenue) == null) {
            return;
        }
        aFa1ySDK.getMediationNetwork();
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final boolean getCurrencyIso4217Code() {
        return this.getRevenue != null;
    }
}
