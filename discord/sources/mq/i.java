package mq;

import ep.x;
import java.util.Collection;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lq.t0;
import lq.z;
import vo.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements yp.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f16026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function0 f16027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f16028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f16029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f16030e;

    public /* synthetic */ i(t0 t0Var, jq.e eVar, r0 r0Var, int i7) {
        this(t0Var, (i7 & 2) != 0 ? null : eVar, (i) null, (i7 & 8) != 0 ? null : r0Var);
    }

    @Override // yp.b
    public final t0 a() {
        return this.f16026a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        i iVar = (i) obj;
        i iVar2 = this.f16028c;
        if (iVar2 == null) {
            iVar2 = this;
        }
        i iVar3 = iVar.f16028c;
        if (iVar3 != null) {
            obj = iVar3;
        }
        return iVar2 == obj;
    }

    @Override // lq.q0
    public final so.i f() {
        z zVarB = this.f16026a.b();
        Intrinsics.checkNotNullExpressionValue(zVarB, "getType(...)");
        return c9.a.o(zVarB);
    }

    @Override // lq.q0
    public final vo.i g() {
        return null;
    }

    @Override // lq.q0
    public final List getParameters() {
        return n0.f14659d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // lq.q0
    public final Collection h() {
        List list = (List) this.f16030e.getValue();
        return list == null ? n0.f14659d : list;
    }

    public final int hashCode() {
        i iVar = this.f16028c;
        return iVar != null ? iVar.hashCode() : super.hashCode();
    }

    @Override // lq.q0
    public final boolean i() {
        return false;
    }

    public final String toString() {
        return "CapturedType(" + this.f16026a + ')';
    }

    public i(t0 projection, Function0 function0, i iVar, r0 r0Var) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        this.f16026a = projection;
        this.f16027b = function0;
        this.f16028c = iVar;
        this.f16029d = r0Var;
        this.f16030e = rn.l.a(rn.m.f19486e, new x(14, this));
    }
}
