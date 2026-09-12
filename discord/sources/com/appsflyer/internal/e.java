package com.appsflyer.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3870e;

    public /* synthetic */ e(int i7, Object obj) {
        this.f3869d = i7;
        this.f3870e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3869d) {
            case 0:
                return ((AFa1uSDK.C0015AFa1uSDK) this.f3870e).getMonetizationNetwork();
            default:
                return ((AFc1dSDK) this.f3870e).o_();
        }
    }
}
