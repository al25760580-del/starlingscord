package s;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19611e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19612i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f19613v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f19614w;

    public a(int i7) {
        this.f19610d = i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19611e < this.f19610d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f19611e;
        switch (this.f19613v) {
            case 0:
                objF = ((e) this.f19614w).f(i7);
                break;
            case 1:
                objF = ((e) this.f19614w).i(i7);
                break;
            default:
                objF = ((f) this.f19614w).f19625e[i7];
                break;
        }
        this.f19611e++;
        this.f19612i = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f19612i) {
            Intrinsics.checkNotNullParameter("Call next() before removing an element.", "message");
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i7 = this.f19611e - 1;
        this.f19611e = i7;
        switch (this.f19613v) {
            case 0:
                ((e) this.f19614w).g(i7);
                break;
            case 1:
                ((e) this.f19614w).g(i7);
                break;
            default:
                ((f) this.f19614w).a(i7);
                break;
        }
        this.f19610d--;
        this.f19612i = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f19626i);
        this.f19613v = 2;
        this.f19614w = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i7) {
        this(eVar.f1222i);
        this.f19613v = i7;
        switch (i7) {
            case 1:
                this.f19614w = eVar;
                this(eVar.f1222i);
                break;
            default:
                this.f19614w = eVar;
                break;
        }
    }
}
