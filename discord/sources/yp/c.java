package yp;

import java.util.Collection;
import java.util.List;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import lq.e1;
import lq.t0;
import lq.z;
import mq.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f23502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f23503b;

    public c(t0 projection) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        this.f23502a = projection;
        projection.a();
        e1 e1Var = e1.INVARIANT;
    }

    @Override // yp.b
    public final t0 a() {
        return this.f23502a;
    }

    @Override // lq.q0
    public final so.i f() {
        so.i iVarF = this.f23502a.b().r0().f();
        Intrinsics.checkNotNullExpressionValue(iVarF, "getBuiltIns(...)");
        return iVarF;
    }

    @Override // lq.q0
    public final /* bridge */ /* synthetic */ vo.i g() {
        return null;
    }

    @Override // lq.q0
    public final List getParameters() {
        return n0.f14659d;
    }

    @Override // lq.q0
    public final Collection h() {
        t0 t0Var = this.f23502a;
        z zVarB = t0Var.a() == e1.OUT_VARIANCE ? t0Var.b() : f().p();
        Intrinsics.checkNotNull(zVarB);
        return c0.c(zVarB);
    }

    @Override // lq.q0
    public final boolean i() {
        return false;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f23502a + ')';
    }
}
