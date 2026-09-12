package jq;

import kotlin.jvm.internal.Intrinsics;
import pp.i0;
import vo.l0;
import vo.n0;
import vo.o0;
import vo.y;
import yo.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends h0 implements b {
    public final i0 Y;
    public final rp.f Z;
    public final pf.b a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final rp.g f14062b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final l f14063c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(vo.l containingDeclaration, l0 l0Var, wo.h annotations, y modality, ep.p visibility, boolean z5, up.e name, vo.c kind, boolean z6, boolean z7, boolean z10, boolean z11, boolean z12, i0 proto, rp.f nameResolver, pf.b typeTable, rp.g versionRequirementTable, l lVar) {
        super(containingDeclaration, l0Var, annotations, modality, visibility, z5, name, kind, n0.C, z6, z7, z12, z10, z11);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(modality, "modality");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        this.Y = proto;
        this.Z = nameResolver;
        this.a0 = typeTable;
        this.f14062b0 = versionRequirementTable;
        this.f14063c0 = lVar;
    }

    @Override // yo.h0
    public final h0 D0(vo.l newOwner, y newModality, ep.p newVisibility, l0 l0Var, vo.c kind, up.e newName) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(newModality, "newModality");
        Intrinsics.checkNotNullParameter(newVisibility, "newVisibility");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(newName, "newName");
        o0 source = n0.C;
        Intrinsics.checkNotNullParameter(source, "source");
        return new t(newOwner, l0Var, getAnnotations(), newModality, newVisibility, this.f23445y, newName, kind, this.L, this.M, isExternal(), this.P, this.N, this.Y, this.Z, this.a0, this.f14062b0, this.f14063c0);
    }

    @Override // jq.m
    public final pf.b G() {
        return this.a0;
    }

    @Override // jq.m
    public final rp.f N() {
        return this.Z;
    }

    @Override // jq.m
    public final l P() {
        return this.f14063c0;
    }

    @Override // yo.h0, vo.x
    public final boolean isExternal() {
        return com.discord.chat.presentation.list.a.t(rp.d.E, this.Y.f18318v, "get(...)");
    }

    @Override // jq.m
    public final vp.a t() {
        return this.Y;
    }
}
