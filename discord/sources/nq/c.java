package nq;

import ep.p;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import vo.n0;
import vo.t;
import vo.u;
import vo.y;
import yo.k0;
import yo.s;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends k0 {
    @Override // yo.s
    /* JADX INFO: renamed from: C0 */
    public final k0 d0(vo.l newOwner, y modality, p visibility) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(modality, "modality");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        vo.c kind = vo.c.f21793e;
        Intrinsics.checkNotNullParameter(kind, "kind");
        return this;
    }

    @Override // yo.k0, yo.s
    public final s D0(up.e eVar, vo.c kind, vo.l newOwner, u uVar, n0 source, wo.h annotations) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        return this;
    }

    @Override // yo.s, vo.b
    public final Object R(vo.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    @Override // yo.s, vo.d
    public final /* bridge */ /* synthetic */ vo.d d0(vo.f fVar, y yVar, p pVar) {
        d0(fVar, yVar, pVar);
        return this;
    }

    @Override // yo.s, vo.d
    public final void g0(Collection overriddenDescriptors) {
        Intrinsics.checkNotNullParameter(overriddenDescriptors, "overriddenDescriptors");
    }

    @Override // yo.s, vo.u
    public final boolean isSuspend() {
        return false;
    }

    @Override // yo.k0, yo.s, vo.u
    public final t m0() {
        return new u4.b(28, this);
    }
}
