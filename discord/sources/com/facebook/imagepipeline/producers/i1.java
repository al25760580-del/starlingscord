package com.facebook.imagepipeline.producers;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1 f5006c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var, Consumer consumer) {
        super(consumer);
        this.f5006c = j1Var;
    }

    @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.c
    public final void f() {
        this.f5061b.a();
        l();
    }

    @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.c
    public final void g(Throwable th2) {
        this.f5061b.onFailure(th2);
        l();
    }

    @Override // com.facebook.imagepipeline.producers.c
    public final void h(int i7, Object obj) {
        this.f5061b.b(i7, obj);
        if (c.d(i7)) {
            l();
        }
    }

    public final void l() {
        Pair pair;
        synchronized (this.f5006c) {
            try {
                pair = (Pair) this.f5006c.f5014c.poll();
                if (pair == null) {
                    this.f5006c.f5013b--;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (pair != null) {
            this.f5006c.f5015d.execute(new h1(this, pair));
        }
    }
}
