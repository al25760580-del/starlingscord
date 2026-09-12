package mq;

import kotlin.jvm.internal.Intrinsics;
import lq.d0;
import lq.e1;
import lq.p0;
import lq.y0;
import lq.z;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends lq.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f16014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f16015b;

    public a(b bVar, y0 y0Var) {
        this.f16014a = bVar;
        this.f16015b = y0Var;
    }

    @Override // lq.c
    public final pq.e D(p0 state, pq.d type) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        b bVar = this.f16014a;
        d0 d0VarO = bVar.O(type);
        Intrinsics.checkNotNull(d0VarO, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
        z zVarH = this.f16015b.h(d0VarO, e1.INVARIANT);
        Intrinsics.checkNotNullExpressionValue(zVarH, "safeSubstitute(...)");
        d0 d0VarJ = bVar.J(zVarH);
        Intrinsics.checkNotNull(d0VarJ);
        return d0VarJ;
    }
}
