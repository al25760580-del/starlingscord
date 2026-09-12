package com.discord.billing;

import com.facebook.react.bridge.Promise;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3986e;

    public /* synthetic */ e(int i7, Object obj) {
        this.f3985d = i7;
        this.f3986e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3985d) {
            case 0:
                return BillingManagerModule.purchase$lambda$4((Promise) this.f3986e, (BillingManagerException) obj);
            case 1:
                return BillingManagerModule.loadPurchases$lambda$10((Promise) this.f3986e, (Exception) obj);
            case 2:
                return BillingManagerModule.getProducts$lambda$13((Promise) this.f3986e, (BillingManagerException) obj);
            case 3:
                return BillingManagerModule.subscribe$lambda$6((Promise) this.f3986e, (BillingManagerException) obj);
            case 4:
                return BillingManagerModule.consumePurchase$lambda$8((Promise) this.f3986e, (BillingManagerException) obj);
            case 5:
                return BillingManagerModule.getUserCountry$lambda$11((Promise) this.f3986e, (String) obj);
            case 6:
                return BillingManagerModule.getUserCountry$lambda$12((Promise) this.f3986e, (BillingManagerException) obj);
            default:
                return BillingManagerModule.billingManager$lambda$0((BillingManagerModule) this.f3986e, ((Integer) obj).intValue());
        }
    }
}
