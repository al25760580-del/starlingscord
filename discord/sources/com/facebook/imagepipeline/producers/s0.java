package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5066c;

    public /* synthetic */ s0(int i7, Object obj) {
        this.f5065b = i7;
        this.f5066c = obj;
    }

    @Override // com.facebook.imagepipeline.producers.c
    public final void f() {
        switch (this.f5065b) {
            case 0:
                try {
                    sa.a.w();
                    t0 t0Var = (t0) this.f5066c;
                    synchronized (t0Var) {
                        try {
                            if (t0Var.f5077g == this) {
                                t0Var.f5077g = null;
                                t0Var.f5076f = null;
                                t0.b(t0Var.f5073c);
                                t0Var.f5073c = null;
                                t0Var.i(3);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    sa.a.w();
                    return;
                } catch (Throwable th3) {
                    sa.a.w();
                    throw th3;
                }
            default:
                ja.b bVar = (ja.b) this.f5066c;
                synchronized (bVar) {
                    n8.i.e(bVar.f());
                }
                return;
        }
    }

    @Override // com.facebook.imagepipeline.producers.c
    public final void g(Throwable throwable) {
        switch (this.f5065b) {
            case 0:
                try {
                    sa.a.w();
                    ((t0) this.f5066c).f(this, throwable);
                    return;
                } finally {
                    sa.a.w();
                }
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                ja.b bVar = (ja.b) this.f5066c;
                d1 producerContext = bVar.f13718h;
                Intrinsics.checkNotNullParameter(producerContext, "producerContext");
                if (bVar.h(throwable, producerContext.getExtras())) {
                    bVar.f13719i.g(producerContext, throwable);
                    return;
                }
                return;
        }
    }

    @Override // com.facebook.imagepipeline.producers.c
    public final void h(int i7, Object obj) {
        switch (this.f5065b) {
            case 0:
                Closeable closeable = (Closeable) obj;
                try {
                    sa.a.w();
                    ((t0) this.f5066c).g(this, closeable, i7);
                    return;
                } finally {
                    sa.a.w();
                }
            default:
                ja.b bVar = (ja.b) this.f5066c;
                d1 d1Var = bVar.f13718h;
                switch (bVar.j) {
                    case 0:
                        bVar.l(CloseableReference.g((CloseableReference) obj), i7, d1Var);
                        return;
                    default:
                        bVar.l(obj, i7, d1Var);
                        return;
                }
        }
    }

    @Override // com.facebook.imagepipeline.producers.c
    public final void i(float f2) {
        switch (this.f5065b) {
            case 0:
                try {
                    sa.a.w();
                    ((t0) this.f5066c).h(this, f2);
                    return;
                } finally {
                    sa.a.w();
                }
            default:
                ((ja.b) this.f5066c).i(f2);
                return;
        }
    }
}
