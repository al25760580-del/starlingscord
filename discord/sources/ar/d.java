package ar;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c[] f2903d;

    public d(c[] cVarArr) {
        this.f2903d = cVarArr;
    }

    @Override // ar.i
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f2903d) {
            m0 m0Var = cVar.f2899x;
            if (m0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handle");
                m0Var = null;
            }
            m0Var.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f2903d + ']';
    }
}
