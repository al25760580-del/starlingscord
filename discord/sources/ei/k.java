package ei;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends c implements ListIterator {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f8321w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar) {
        super(lVar);
        this.f8321w = lVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        l lVar = this.f8321w;
        boolean zIsEmpty = lVar.isEmpty();
        b().add(obj);
        lVar.f8329x.f8336w++;
        if (zIsEmpty) {
            lVar.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f8287e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, int i7) {
        super(lVar, ((List) lVar.f8325e).listIterator(i7));
        this.f8321w = lVar;
    }
}
