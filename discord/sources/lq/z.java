package lq;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z implements wo.a, pq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15269d;

    public abstract eq.o J();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (t0() != zVar.t0()) {
            return false;
        }
        d1 a10 = w0();
        d1 b10 = zVar.w0();
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        mq.m context = mq.m.f16035d;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return c.z(context, a10, b10);
    }

    @Override // wo.a
    public final wo.h getAnnotations() {
        return k.a(q0());
    }

    public final int hashCode() {
        int iHashCode;
        int i7 = this.f15269d;
        if (i7 != 0) {
            return i7;
        }
        if (c.j(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (t0() ? 1 : 0) + ((l0().hashCode() + (r0().hashCode() * 31)) * 31);
        }
        this.f15269d = iHashCode;
        return iHashCode;
    }

    public abstract List l0();

    public abstract l0 q0();

    public abstract q0 r0();

    public abstract boolean t0();

    public abstract z v0(mq.f fVar);

    public abstract d1 w0();
}
