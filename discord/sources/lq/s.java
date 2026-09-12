package lq;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s extends d1 implements pq.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0 f15248e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d0 f15249i;

    public s(d0 lowerBound, d0 upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        this.f15248e = lowerBound;
        this.f15249i = upperBound;
    }

    public abstract d0 A0();

    public abstract String B0(wp.h hVar, wp.h hVar2);

    @Override // lq.z
    public eq.o J() {
        return A0().J();
    }

    @Override // lq.z
    public final List l0() {
        return A0().l0();
    }

    @Override // lq.z
    public final l0 q0() {
        return A0().q0();
    }

    @Override // lq.z
    public final q0 r0() {
        return A0().r0();
    }

    @Override // lq.z
    public final boolean t0() {
        return A0().t0();
    }

    public String toString() {
        return wp.f.f22424c.X(this);
    }
}
