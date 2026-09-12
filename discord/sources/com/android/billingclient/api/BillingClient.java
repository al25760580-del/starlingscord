package com.android.billingclient.api;

import a5.c;
import a5.h;
import a5.k;
import a5.o;
import android.app.Activity;
import com.discord.billing.BillingManager;
import com.discord.billing.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class BillingClient {
    public abstract void a(h hVar, com.discord.billing.a aVar);

    public abstract void b();

    public abstract void c(BillingManager.C01061.C00181.C00191 c00191);

    public abstract boolean d();

    public abstract BillingResult e(Activity activity, BillingFlowParams billingFlowParams);

    public abstract void f(QueryProductDetailsParams queryProductDetailsParams, k kVar);

    public abstract void g(o oVar, b bVar);

    public abstract void h(c cVar);
}
