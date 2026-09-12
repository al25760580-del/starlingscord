package com.appsflyer.internal;

import android.annotation.SuppressLint;
import com.appsflyer.internal.AFe1nSDK.AnonymousClass3;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1qSDK {

    @NotNull
    public final AFc1gSDK AFAdRevenueData;

    @NotNull
    private final AFf1cSDK component2;

    @NotNull
    private final AFe1nSDK component4;

    @NotNull
    private final AFc1pSDK getCurrencyIso4217Code;

    @NotNull
    private final ExecutorService getMediationNetwork;

    @NotNull
    private final AFg1rSDK getMonetizationNetwork;

    @NotNull
    public final AFc1oSDK getRevenue;

    public AFe1qSDK(@NotNull AFc1oSDK aFc1oSDK, @NotNull AFc1gSDK aFc1gSDK, @NotNull AFc1pSDK aFc1pSDK, @NotNull ExecutorService executorService, @NotNull AFg1rSDK aFg1rSDK, @NotNull AFf1cSDK aFf1cSDK, @NotNull AFe1nSDK aFe1nSDK) {
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFc1gSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFg1rSDK, "");
        Intrinsics.checkNotNullParameter(aFf1cSDK, "");
        Intrinsics.checkNotNullParameter(aFe1nSDK, "");
        this.getRevenue = aFc1oSDK;
        this.AFAdRevenueData = aFc1gSDK;
        this.getCurrencyIso4217Code = aFc1pSDK;
        this.getMediationNetwork = executorService;
        this.getMonetizationNetwork = aFg1rSDK;
        this.component2 = aFf1cSDK;
        this.component4 = aFe1nSDK;
    }

    @SuppressLint({"NewApi"})
    public final void AFAdRevenueData() {
        if (this.getRevenue.getMediationNetwork("didSendRevenueTriggerOnLastBackground", true) || !AFj1iSDK.AFAdRevenueData(this.AFAdRevenueData.getRevenue)) {
            return;
        }
        AFAdRevenueData(AFe1rSDK.AFa1tSDK.INSTANCE, new Function1<AFe1uSDK, Unit>() { // from class: com.appsflyer.internal.AFe1qSDK.5
            {
                super(1);
            }

            public final void getMonetizationNetwork(@NotNull AFe1uSDK aFe1uSDK) {
                Intrinsics.checkNotNullParameter(aFe1uSDK, "");
                if (aFe1uSDK == AFe1uSDK.SUCCESS) {
                    AFe1qSDK.this.getRevenue.getCurrencyIso4217Code("didSendRevenueTriggerOnLastBackground", true);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                getMonetizationNetwork((AFe1uSDK) obj);
                return Unit.f14616a;
            }
        });
    }

    @SuppressLint({"NewApi"})
    public final void AFAdRevenueData(@NotNull AFe1rSDK aFe1rSDK, @NotNull Function1<? super AFe1uSDK, Unit> function1) {
        Intrinsics.checkNotNullParameter(aFe1rSDK, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AFe1aSDK aFe1aSDK = new AFe1aSDK(aFe1rSDK, this.getMediationNetwork, this.getCurrencyIso4217Code, this.AFAdRevenueData, this.getMonetizationNetwork, this.component2, function1);
        AFe1nSDK aFe1nSDK = this.component4;
        aFe1nSDK.AFAdRevenueData.execute(aFe1nSDK.new AnonymousClass3(aFe1aSDK));
    }
}
