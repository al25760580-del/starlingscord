package com.discord.billing;

import com.android.billingclient.api.BillingResult;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BillingManager f3969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f3970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f3971c;

    public /* synthetic */ a(BillingManager billingManager, Function1 function1, Function0 function0) {
        this.f3969a = billingManager;
        this.f3970b = function1;
        this.f3971c = function0;
    }

    public final void a(BillingResult billingResult, String str) {
        BillingManager.AnonymousClass1.invokeSuspend$lambda$0(this.f3969a, this.f3970b, this.f3971c, billingResult, str);
    }
}
