package zp;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import lq.l0;
import lq.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f24072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rn.u f24073b;

    public o(LinkedHashSet linkedHashSet) {
        l0.f15225e.getClass();
        l0 attributes = l0.f15226i;
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(this, "constructor");
        lq.c.v(nq.l.a(nq.h.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), n0.f14659d, attributes, this, false);
        this.f24073b = rn.l.b(new l());
        this.f24072a = linkedHashSet;
    }

    @Override // lq.q0
    public final so.i f() {
        throw null;
    }

    @Override // lq.q0
    public final vo.i g() {
        return null;
    }

    @Override // lq.q0
    public final List getParameters() {
        return n0.f14659d;
    }

    @Override // lq.q0
    public final Collection h() {
        return (List) this.f24073b.getValue();
    }

    @Override // lq.q0
    public final boolean i() {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntegerLiteralType");
        sb2.append("[" + CollectionsKt.O(this.f24072a, ",", null, null, m.f24070d, 30) + ']');
        return sb2.toString();
    }
}
