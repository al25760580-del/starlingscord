package vo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends yo.i {
    public final ArrayList E;
    public final lq.l F;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f21800y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(kq.l storageManager, h container, up.e name, boolean z5, int i7) {
        super(storageManager, container, name, n0.C);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f21800y = z5;
        IntRange intRangeI = lo.j.i(0, i7);
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(intRangeI, 10));
        Iterator it = intRangeI.iterator();
        while (((lo.b) it).f15156i) {
            int iNextInt = ((kotlin.collections.s0) it).nextInt();
            arrayList.add(yo.o0.F0(this, lq.e1.INVARIANT, up.e.e("T" + iNextInt), iNextInt, storageManager));
        }
        this.E = arrayList;
        this.F = new lq.l(this, w3.q.l(this), kotlin.collections.d1.b(bq.e.j(this).f().e()), storageManager);
    }

    @Override // yo.y
    public final eq.o B(mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return eq.n.f8648b;
    }

    @Override // vo.f
    public final yo.h E() {
        return null;
    }

    @Override // vo.f
    public final /* bridge */ /* synthetic */ eq.o F() {
        return eq.n.f8648b;
    }

    @Override // vo.f
    public final f H() {
        return null;
    }

    @Override // vo.f
    public final g c() {
        return g.f21808d;
    }

    @Override // vo.f, vo.x
    public final y e() {
        return y.f21852e;
    }

    @Override // wo.a
    public final wo.h getAnnotations() {
        return wo.g.f22379a;
    }

    @Override // vo.f, vo.x, vo.o
    public final ep.p getVisibility() {
        ep.p PUBLIC = p.f21828e;
        Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // yo.i, vo.x
    public final boolean isExternal() {
        return false;
    }

    @Override // vo.f
    public final boolean isInline() {
        return false;
    }

    @Override // vo.f
    public final boolean isValue() {
        return false;
    }

    @Override // vo.f
    public final s0 j0() {
        return null;
    }

    @Override // vo.f, vo.j
    public final List l() {
        return this.E;
    }

    @Override // vo.i
    public final lq.q0 n() {
        return this.F;
    }

    @Override // vo.f
    public final boolean o() {
        return false;
    }

    @Override // vo.x
    public final boolean o0() {
        return false;
    }

    @Override // vo.f
    public final Collection p() {
        return kotlin.collections.p0.f14661d;
    }

    @Override // vo.f
    public final boolean s() {
        return false;
    }

    @Override // vo.f
    public final boolean s0() {
        return false;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // vo.f
    public final Collection w() {
        return kotlin.collections.n0.f14659d;
    }

    @Override // vo.x
    public final boolean y() {
        return false;
    }

    @Override // vo.j
    public final boolean z() {
        return this.f21800y;
    }
}
