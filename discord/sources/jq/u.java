package jq;

import kotlin.jvm.internal.Intrinsics;
import pp.a0;
import vo.n0;
import yo.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends k0 implements b {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final a0 f14064b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final rp.f f14065c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final pf.b f14066d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final rp.g f14067e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final l f14068f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(vo.l containingDeclaration, k0 k0Var, wo.h annotations, up.e name, vo.c kind, a0 proto, rp.f nameResolver, pf.b typeTable, rp.g versionRequirementTable, l lVar, n0 n0Var) {
        super(containingDeclaration, k0Var, annotations, name, kind, n0Var == null ? n0.C : n0Var);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        this.f14064b0 = proto;
        this.f14065c0 = nameResolver;
        this.f14066d0 = typeTable;
        this.f14067e0 = versionRequirementTable;
        this.f14068f0 = lVar;
    }

    @Override // yo.k0, yo.s
    public final yo.s D0(up.e eVar, vo.c kind, vo.l newOwner, vo.u uVar, n0 source, wo.h annotations) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        k0 k0Var = (k0) uVar;
        if (eVar == null) {
            eVar = getName();
            Intrinsics.checkNotNullExpressionValue(eVar, "getName(...)");
        }
        u uVar2 = new u(newOwner, k0Var, annotations, eVar, kind, this.f14064b0, this.f14065c0, this.f14066d0, this.f14067e0, this.f14068f0, source);
        uVar2.T = this.T;
        return uVar2;
    }

    @Override // jq.m
    public final pf.b G() {
        return this.f14066d0;
    }

    @Override // jq.m
    public final rp.f N() {
        return this.f14065c0;
    }

    @Override // jq.m
    public final l P() {
        return this.f14068f0;
    }

    @Override // jq.m
    public final vp.a t() {
        return this.f14064b0;
    }
}
