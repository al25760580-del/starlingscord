package yp;

import eq.o;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import lq.d0;
import lq.d1;
import lq.l0;
import lq.q0;
import lq.t0;
import lq.z;
import mq.f;
import nq.h;
import nq.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends d0 implements pq.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t0 f23498e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f23499i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f23500v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l0 f23501w;

    public a(t0 typeProjection, c constructor, boolean z5, l0 attributes) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f23498e = typeProjection;
        this.f23499i = constructor;
        this.f23500v = z5;
        this.f23501w = attributes;
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: A0 */
    public final d0 x0(boolean z5) {
        if (z5 == this.f23500v) {
            return this;
        }
        return new a(this.f23498e, this.f23499i, z5, this.f23501w);
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: B0 */
    public final d0 z0(l0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new a(this.f23498e, this.f23499i, this.f23500v, newAttributes);
    }

    @Override // lq.z
    public final o J() {
        return l.a(h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // lq.z
    public final List l0() {
        return n0.f14659d;
    }

    @Override // lq.z
    public final l0 q0() {
        return this.f23501w;
    }

    @Override // lq.z
    public final q0 r0() {
        return this.f23499i;
    }

    @Override // lq.z
    public final boolean t0() {
        return this.f23500v;
    }

    @Override // lq.d0
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Captured(");
        sb2.append(this.f23498e);
        sb2.append(')');
        sb2.append(this.f23500v ? "?" : "");
        return sb2.toString();
    }

    @Override // lq.z
    /* JADX INFO: renamed from: v0 */
    public final z y0(f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        t0 t0VarD = this.f23498e.d(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(t0VarD, "refine(...)");
        return new a(t0VarD, this.f23499i, this.f23500v, this.f23501w);
    }

    @Override // lq.d0, lq.d1
    public final d1 x0(boolean z5) {
        if (z5 == this.f23500v) {
            return this;
        }
        return new a(this.f23498e, this.f23499i, z5, this.f23501w);
    }

    @Override // lq.d1
    public final d1 y0(f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        t0 t0VarD = this.f23498e.d(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(t0VarD, "refine(...)");
        return new a(t0VarD, this.f23499i, this.f23500v, this.f23501w);
    }
}
