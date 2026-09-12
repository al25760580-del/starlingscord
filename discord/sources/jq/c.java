package jq;

import kotlin.jvm.internal.Intrinsics;
import vo.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends yo.h implements b {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final pp.n f14014c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final rp.f f14015d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final pf.b f14016e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final rp.g f14017f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final l f14018g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vo.f containingDeclaration, vo.k kVar, wo.h annotations, boolean z5, vo.c kind, pp.n proto, rp.f nameResolver, pf.b typeTable, rp.g versionRequirementTable, l lVar, n0 n0Var) {
        super(containingDeclaration, kVar, annotations, z5, kind, n0Var == null ? n0.C : n0Var);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        this.f14014c0 = proto;
        this.f14015d0 = nameResolver;
        this.f14016e0 = typeTable;
        this.f14017f0 = versionRequirementTable;
        this.f14018g0 = lVar;
    }

    @Override // yo.s, vo.u
    public final boolean C() {
        return false;
    }

    @Override // yo.h, yo.s
    public final /* bridge */ /* synthetic */ yo.s D0(up.e eVar, vo.c cVar, vo.l lVar, vo.u uVar, n0 n0Var, wo.h hVar) {
        return S0(lVar, uVar, cVar, hVar, n0Var);
    }

    @Override // jq.m
    public final pf.b G() {
        return this.f14016e0;
    }

    @Override // yo.h
    /* JADX INFO: renamed from: M0 */
    public final /* bridge */ /* synthetic */ yo.h D0(up.e eVar, vo.c cVar, vo.l lVar, vo.u uVar, n0 n0Var, wo.h hVar) {
        return S0(lVar, uVar, cVar, hVar, n0Var);
    }

    @Override // jq.m
    public final rp.f N() {
        return this.f14015d0;
    }

    @Override // jq.m
    public final l P() {
        return this.f14018g0;
    }

    public final c S0(vo.l newOwner, vo.u uVar, vo.c kind, wo.h annotations, n0 source) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        c cVar = new c((vo.f) newOwner, (vo.k) uVar, annotations, this.f23444b0, kind, this.f14014c0, this.f14015d0, this.f14016e0, this.f14017f0, this.f14018g0, source);
        cVar.T = this.T;
        return cVar;
    }

    @Override // yo.s, vo.x
    public final boolean isExternal() {
        return false;
    }

    @Override // yo.s, vo.u
    public final boolean isInline() {
        return false;
    }

    @Override // yo.s, vo.u
    public final boolean isSuspend() {
        return false;
    }

    @Override // jq.m
    public final vp.a t() {
        return this.f14014c0;
    }
}
