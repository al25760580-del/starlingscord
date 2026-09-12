package lq;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements q0, pq.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f15264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f15265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15266c;

    public y(AbstractCollection typesToIntersect) {
        Intrinsics.checkNotNullParameter(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(typesToIntersect);
        this.f15265b = linkedHashSet;
        this.f15266c = linkedHashSet.hashCode();
    }

    public final d0 b() {
        l0.f15225e.getClass();
        return c.w(l0.f15226i, this, kotlin.collections.n0.f14659d, false, w3.q.m("member scope for intersection type", this.f15265b), new bp.i(12, this));
    }

    public final String c(Function1 getProperTypeRelatedToStringify) {
        Intrinsics.checkNotNullParameter(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return CollectionsKt.O(CollectionsKt.e0(this.f15265b, new x(0, getProperTypeRelatedToStringify)), " & ", "{", "}", new bp.i(11, getProperTypeRelatedToStringify), 24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        return Intrinsics.areEqual(this.f15265b, ((y) obj).f15265b);
    }

    @Override // lq.q0
    public final so.i f() {
        so.i iVarF = ((z) this.f15265b.iterator().next()).r0().f();
        Intrinsics.checkNotNullExpressionValue(iVarF, "getBuiltIns(...)");
        return iVarF;
    }

    @Override // lq.q0
    public final vo.i g() {
        return null;
    }

    @Override // lq.q0
    public final List getParameters() {
        return kotlin.collections.n0.f14659d;
    }

    @Override // lq.q0
    public final Collection h() {
        return this.f15265b;
    }

    public final int hashCode() {
        return this.f15266c;
    }

    @Override // lq.q0
    public final boolean i() {
        return false;
    }

    public final String toString() {
        return c(w.f15259e);
    }
}
