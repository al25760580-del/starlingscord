package mq;

import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import lq.d0;
import lq.d1;
import lq.l0;
import lq.q0;
import lq.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends d0 implements pq.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pq.b f16020e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f16021i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d1 f16022v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l0 f16023w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f16024x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f16025y;

    public h(pq.b captureStatus, i constructor, d1 d1Var, l0 attributes, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(captureStatus, "captureStatus");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f16020e = captureStatus;
        this.f16021i = constructor;
        this.f16022v = d1Var;
        this.f16023w = attributes;
        this.f16024x = z5;
        this.f16025y = z6;
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: A0 */
    public final d0 x0(boolean z5) {
        return new h(this.f16020e, this.f16021i, this.f16022v, this.f16023w, z5, 32);
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: B0 */
    public final d0 z0(l0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new h(this.f16020e, this.f16021i, this.f16022v, newAttributes, this.f16024x, this.f16025y);
    }

    @Override // lq.d1
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public final h y0(f kotlinTypeRefiner) {
        d1 d1Var;
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        i iVar = this.f16021i;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        t0 t0VarD = iVar.f16026a.d(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(t0VarD, "refine(...)");
        fp.b bVar = iVar.f16027b != null ? new fp.b(9, iVar, kotlinTypeRefiner) : null;
        i iVar2 = iVar.f16028c;
        if (iVar2 == null) {
            iVar2 = iVar;
        }
        i iVar3 = new i(t0VarD, bVar, iVar2, iVar.f16029d);
        d1 type = this.f16022v;
        if (type != null) {
            Intrinsics.checkNotNullParameter(type, "type");
            d1Var = type;
        } else {
            d1Var = null;
        }
        return new h(this.f16020e, iVar3, d1Var, this.f16023w, this.f16024x, 32);
    }

    @Override // lq.z
    public final eq.o J() {
        return nq.l.a(nq.h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // lq.z
    public final List l0() {
        return n0.f14659d;
    }

    @Override // lq.z
    public final l0 q0() {
        return this.f16023w;
    }

    @Override // lq.z
    public final q0 r0() {
        return this.f16021i;
    }

    @Override // lq.z
    public final boolean t0() {
        return this.f16024x;
    }

    @Override // lq.d0, lq.d1
    public final d1 x0(boolean z5) {
        return new h(this.f16020e, this.f16021i, this.f16022v, this.f16023w, z5, 32);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(pq.b bVar, i iVar, d1 d1Var, l0 l0Var, boolean z5, int i7) {
        if ((i7 & 8) != 0) {
            l0.f15225e.getClass();
            l0Var = l0.f15226i;
        }
        this(bVar, iVar, d1Var, l0Var, (i7 & 16) != 0 ? false : z5, false);
    }
}
