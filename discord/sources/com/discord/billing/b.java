package com.discord.billing;

import a5.k;
import ar.p;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryProductDetailsResult;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3973b;

    public /* synthetic */ b(int i7, Object obj) {
        this.f3972a = i7;
        this.f3973b = obj;
    }

    @Override // a5.k
    public void a(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        BillingManager.C01051.C00171.invokeSuspend$lambda$0((p) this.f3973b, billingResult, queryProductDetailsResult);
    }

    public void b(BillingResult billingResult, List list) {
        switch (this.f3972a) {
            case 0:
                BillingManager.AnonymousClass3.invokeSuspend$lambda$0((BillingManager) this.f3973b, billingResult, list);
                break;
            default:
                BillingManager.AnonymousClass3.invokeSuspend$lambda$1((BillingManager) this.f3973b, billingResult, list);
                break;
        }
    }
}
