package com.facebook.imagepipeline.producers;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5037b;

    public /* synthetic */ o(int i7, Object obj) {
        this.f5036a = i7;
        this.f5037b = obj;
    }

    @Override // com.facebook.imagepipeline.producers.f
    public final void a() {
        switch (this.f5036a) {
            case 0:
                break;
            case 1:
                ((AtomicBoolean) this.f5037b).set(true);
                break;
            case 2:
                ((l0) this.f5037b).a();
                break;
            case 3:
                ((n0) this.f5037b).a();
                break;
            case 4:
                ((p0) this.f5037b).a();
                break;
            case 5:
                ((n0) this.f5037b).a();
                break;
            default:
                y0 y0Var = (y0) this.f5037b;
                if (y0Var.m()) {
                    y0Var.f5061b.a();
                }
                break;
        }
    }

    @Override // com.facebook.imagepipeline.producers.f
    public void b() {
        switch (this.f5036a) {
            case 0:
                p pVar = (p) this.f5037b;
                if (pVar.f5040c.P()) {
                    pVar.f5045h.c();
                }
                break;
        }
    }

    private final void e() {
    }
}
