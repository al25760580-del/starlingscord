package ei;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8345e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8346i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ t f8347v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8348w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t f8349x;

    public q(t tVar, int i7) {
        this.f8348w = i7;
        this.f8349x = tVar;
        this.f8347v = tVar;
        this.f8344d = tVar.f8363w;
        this.f8345e = tVar.isEmpty() ? -1 : 0;
        this.f8346i = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8345e >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object sVar;
        t tVar = this.f8347v;
        if (tVar.f8363w != this.f8344d) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f8345e;
        this.f8346i = i7;
        switch (this.f8348w) {
            case 0:
                sVar = this.f8349x.i()[i7];
                break;
            case 1:
                sVar = new s(this.f8349x, i7);
                break;
            default:
                sVar = this.f8349x.j()[i7];
                break;
        }
        int i10 = this.f8345e + 1;
        if (i10 >= tVar.f8364x) {
            i10 = -1;
        }
        this.f8345e = i10;
        return sVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        t tVar = this.f8347v;
        int i7 = tVar.f8363w;
        int i10 = this.f8344d;
        if (i7 != i10) {
            throw new ConcurrentModificationException();
        }
        int i11 = this.f8346i;
        if (!(i11 >= 0)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f8344d = i10 + 32;
        tVar.remove(tVar.i()[i11]);
        this.f8345e--;
        this.f8346i = -1;
    }
}
