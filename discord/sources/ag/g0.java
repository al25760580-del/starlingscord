package ag;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends s {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient Object f525v;

    public g0(Object obj) {
        this.f525v = obj;
    }

    @Override // ag.l
    public final int a(Object[] objArr) {
        objArr[0] = this.f525v;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f525v.equals(obj);
    }

    @Override // ag.l
    public final i0 e() {
        return new y(this.f525v);
    }

    @Override // ag.s, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f525v.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new y(this.f525v);
    }

    @Override // ag.s
    public final q k() {
        Object[] objArr = {this.f525v};
        for (int i7 = 0; i7 < 1; i7++) {
            m mVar = q.f567e;
            if (objArr[i7] == null) {
                throw new NullPointerException(kk.b.h(i7, "at index "));
            }
        }
        return q.k(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return s0.g.e("[", this.f525v.toString(), "]");
    }
}
