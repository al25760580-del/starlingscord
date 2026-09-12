package com.discord.billing;

import com.facebook.react.bridge.Promise;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Promise f3984e;

    public /* synthetic */ d(Promise promise, int i7) {
        this.f3983d = i7;
        this.f3984e = promise;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3983d) {
            case 0:
                return BillingManagerModule.subscribe$lambda$5(this.f3984e);
            case 1:
                return BillingManagerModule.loadPurchases$lambda$9(this.f3984e);
            case 2:
                return BillingManagerModule.consumePurchase$lambda$7(this.f3984e);
            default:
                return BillingManagerModule.purchase$lambda$3(this.f3984e);
        }
    }
}
