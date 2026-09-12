package lq;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kq.o f15175e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Function0 f15176i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final kq.i f15177v;

    public b0(kq.o storageManager, Function0 computation) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.f15175e = storageManager;
        this.f15176i = computation;
        kq.l lVar = (kq.l) storageManager;
        lVar.getClass();
        this.f15177v = new kq.i(lVar, computation);
    }

    @Override // lq.z
    public final eq.o J() {
        return x0().J();
    }

    @Override // lq.z
    public final List l0() {
        return x0().l0();
    }

    @Override // lq.z
    public final l0 q0() {
        return x0().q0();
    }

    @Override // lq.z
    public final q0 r0() {
        return x0().r0();
    }

    @Override // lq.z
    public final boolean t0() {
        return x0().t0();
    }

    public final String toString() {
        kq.i iVar = this.f15177v;
        return (iVar.f14779i == kq.k.f14783d || iVar.f14779i == kq.k.f14784e) ? "<Not computed yet>" : x0().toString();
    }

    @Override // lq.z
    /* JADX INFO: renamed from: v0 */
    public final z y0(mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new b0(this.f15175e, new fp.b(8, kotlinTypeRefiner, this));
    }

    @Override // lq.z
    public final d1 w0() {
        z zVarX0 = x0();
        while (zVarX0 instanceof b0) {
            zVarX0 = ((b0) zVarX0).x0();
        }
        Intrinsics.checkNotNull(zVarX0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (d1) zVarX0;
    }

    public final z x0() {
        return (z) this.f15177v.invoke();
    }
}
