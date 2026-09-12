package ag;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x extends s implements NavigableSet, h0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient Comparator f594v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public transient x f595w;

    public x(Comparator comparator) {
        this.f594v = comparator;
    }

    public static e0 r(Comparator comparator) {
        if (a0.f499e.equals(comparator)) {
            return e0.f520y;
        }
        m mVar = q.f567e;
        return new e0(c0.f510w, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f594v;
    }

    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        e0 e0Var = (e0) this;
        return e0Var.v(0, e0Var.s(obj, false));
    }

    public abstract Object last();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final x descendingSet() {
        x xVarR = this.f595w;
        if (xVarR == null) {
            e0 e0Var = (e0) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(e0Var.f594v);
            xVarR = e0Var.isEmpty() ? r(comparatorReverseOrder) : new e0(e0Var.f521x.i(), comparatorReverseOrder);
            this.f595w = xVarR;
            xVarR.f595w = this;
        }
        return xVarR;
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final e0 subSet(Object obj, boolean z5, Object obj2, boolean z6) {
        obj.getClass();
        obj2.getClass();
        if (this.f594v.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        e0 e0Var = (e0) this;
        e0 e0VarV = e0Var.v(e0Var.t(obj, z5), e0Var.f521x.size());
        return e0VarV.v(0, e0VarV.s(obj2, z6));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        e0 e0Var = (e0) this;
        return e0Var.v(e0Var.t(obj, true), e0Var.f521x.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z5) {
        obj.getClass();
        e0 e0Var = (e0) this;
        return e0Var.v(0, e0Var.s(obj, z5));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z5) {
        obj.getClass();
        e0 e0Var = (e0) this;
        return e0Var.v(e0Var.t(obj, z5), e0Var.f521x.size());
    }
}
