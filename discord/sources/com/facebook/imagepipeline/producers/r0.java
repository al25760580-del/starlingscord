package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.imagepipeline.image.EncodedImage;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5064c;

    public /* synthetic */ r0(int i7, Object obj, Object obj2) {
        this.f5062a = i7;
        this.f5064c = obj;
        this.f5063b = obj2;
    }

    @Override // com.facebook.imagepipeline.producers.f
    public final void a() {
        boolean zRemove;
        ArrayList arrayList;
        e eVar;
        ArrayList arrayListL;
        ArrayList arrayListJ;
        EncodedImage encodedImage;
        switch (this.f5062a) {
            case 0:
                synchronized (((t0) this.f5064c)) {
                    try {
                        zRemove = ((t0) this.f5064c).f5072b.remove((Pair) this.f5063b);
                        arrayList = null;
                        if (!zRemove) {
                            eVar = null;
                            arrayListL = null;
                        } else if (((t0) this.f5064c).f5072b.isEmpty()) {
                            eVar = ((t0) this.f5064c).f5076f;
                            arrayListL = null;
                        } else {
                            ArrayList arrayListK = ((t0) this.f5064c).k();
                            arrayListL = ((t0) this.f5064c).l();
                            arrayListJ = ((t0) this.f5064c).j();
                            eVar = null;
                            arrayList = arrayListK;
                        }
                        arrayListJ = arrayListL;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                e.b(arrayList);
                e.d(arrayListL);
                e.a(arrayListJ);
                if (eVar != null) {
                    eVar.e();
                }
                if (zRemove) {
                    ((Consumer) ((Pair) this.f5063b).first).a();
                    return;
                }
                return;
            case 1:
                b1 b1Var = (b1) this.f5064c;
                h0 h0Var = b1Var.f4951g;
                synchronized (h0Var) {
                    encodedImage = h0Var.f4993e;
                    h0Var.f4993e = null;
                    h0Var.f4994f = 0;
                    break;
                }
                EncodedImage.closeSafely(encodedImage);
                b1Var.f4950f = true;
                ((Consumer) this.f5063b).a();
                return;
            default:
                n0 runnable = (n0) this.f5063b;
                runnable.a();
                g1 g1Var = (g1) ((f1) this.f5064c).f4985c;
                synchronized (g1Var) {
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    g1Var.f4987b.remove(runnable);
                }
                return;
        }
    }

    @Override // com.facebook.imagepipeline.producers.f
    public void b() {
        switch (this.f5062a) {
            case 0:
                e.a(((t0) this.f5064c).j());
                break;
            case 1:
                b1 b1Var = (b1) this.f5064c;
                if (b1Var.f4949e.P()) {
                    b1Var.f4951g.c();
                }
                break;
        }
    }

    @Override // com.facebook.imagepipeline.producers.f
    public void c() {
        switch (this.f5062a) {
            case 0:
                e.b(((t0) this.f5064c).k());
                break;
        }
    }

    @Override // com.facebook.imagepipeline.producers.f
    public void d() {
        switch (this.f5062a) {
            case 0:
                e.d(((t0) this.f5064c).l());
                break;
        }
    }

    public r0(n0 n0Var, f1 f1Var) {
        this.f5062a = 2;
        this.f5063b = n0Var;
        this.f5064c = f1Var;
    }
}
