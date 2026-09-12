package hq;

import kotlin.jvm.internal.Intrinsics;
import vo.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends a3.r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pp.k f11070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f11071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final up.b f11072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pp.j f11073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f11074i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(pp.k classProto, rp.f nameResolver, pf.b typeTable, n0 n0Var, u uVar) {
        super(nameResolver, typeTable, n0Var);
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        this.f11070e = classProto;
        this.f11071f = uVar;
        this.f11072g = mo.c0.s(nameResolver, classProto.f18343w);
        pp.j jVar = (pp.j) rp.d.f19517f.g(classProto.f18342v);
        this.f11073h = jVar == null ? pp.j.CLASS : jVar;
        this.f11074i = com.discord.chat.presentation.list.a.t(rp.d.f19518g, classProto.f18342v, "get(...)");
        Intrinsics.checkNotNullExpressionValue(rp.d.f19519h.g(classProto.f18342v), "get(...)");
    }

    @Override // a3.r
    public final up.c d() {
        return this.f11072g.a();
    }
}
