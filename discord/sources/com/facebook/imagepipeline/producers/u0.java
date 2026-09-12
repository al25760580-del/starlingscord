package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.io.Closeable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5082a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f5083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5085d;

    public u0(z0 z0Var, String str, String str2) {
        this.f5083b = z0Var;
        this.f5084c = str;
        this.f5085d = str2;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public final void b(Consumer consumer, ProducerContext producerContext) {
        t0 t0Var;
        int i7;
        boolean z5;
        try {
            sa.a.w();
            producerContext.O().c(producerContext, this.f5084c);
            Pair pairD = d(producerContext);
            do {
                synchronized (this) {
                    synchronized (this) {
                        t0Var = (t0) this.f5082a.get(pairD);
                    }
                }
                i7 = 1;
                if (t0Var == null) {
                    synchronized (this) {
                        t0Var = new t0(this, pairD);
                        this.f5082a.put(pairD, t0Var);
                        z5 = true;
                    }
                } else {
                    z5 = false;
                }
            } while (!t0Var.a(consumer, producerContext));
            if (z5) {
                if (!producerContext.u()) {
                    i7 = 2;
                }
                t0Var.i(i7);
            }
            sa.a.w();
        } catch (Throwable th2) {
            sa.a.w();
            throw th2;
        }
    }

    public abstract Closeable c(Closeable closeable);

    public abstract Pair d(ProducerContext producerContext);

    public final synchronized void e(Object obj, t0 t0Var) {
        if (this.f5082a.get(obj) == t0Var) {
            this.f5082a.remove(obj);
        }
    }
}
