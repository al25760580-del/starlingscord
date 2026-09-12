package lq;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p extends d0 {
    public abstract d0 C0();

    @Override // lq.d1
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d0 y0(mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        d0 type = C0();
        kotlinTypeRefiner.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNull(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return E0(type);
    }

    public abstract p E0(d0 d0Var);

    @Override // lq.z
    public final eq.o J() {
        return C0().J();
    }

    @Override // lq.z
    public final List l0() {
        return C0().l0();
    }

    @Override // lq.z
    public l0 q0() {
        return C0().q0();
    }

    @Override // lq.z
    public final q0 r0() {
        return C0().r0();
    }

    @Override // lq.z
    public boolean t0() {
        return C0().t0();
    }
}
