package jp;

import bp.q;
import e4.m;
import kotlin.jvm.functions.Function0;
import lq.q0;
import vo.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f14000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f14001e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f14002i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final q0 f14003v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q f14004w;

    public c(m mVar, r0 r0Var, a aVar, q0 q0Var, q qVar) {
        this.f14000d = mVar;
        this.f14001e = r0Var;
        this.f14002i = aVar;
        this.f14003v = q0Var;
        this.f14004w = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) this.f14000d.f7995v;
        vo.i iVarG = this.f14003v.g();
        return cVar.y0(this.f14001e, a.a(a.a(this.f14002i, null, false, null, iVarG != null ? iVarG.j() : null, 31), null, this.f14004w.d(), null, null, 59));
    }
}
