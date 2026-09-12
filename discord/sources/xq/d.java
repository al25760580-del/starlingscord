package xq;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Iterator f23021e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23022i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f23023v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Sequence f23024w;

    public d(g gVar) {
        this.f23020d = 1;
        this.f23024w = gVar;
        this.f23021e = gVar.f23029a.iterator();
        this.f23022i = -1;
    }

    public void a() {
        Object next;
        g gVar = (g) this.f23024w;
        do {
            Iterator it = this.f23021e;
            if (!it.hasNext()) {
                this.f23022i = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) gVar.f23031c.invoke(next)).booleanValue() != gVar.f23030b);
        this.f23023v = next;
        this.f23022i = 1;
    }

    public void b() {
        Iterator it = this.f23021e;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((e) this.f23024w).f23027c.invoke(next)).booleanValue()) {
                this.f23022i = 1;
                this.f23023v = next;
                return;
            }
        }
        this.f23022i = 0;
    }

    public void c() {
        Object next;
        do {
            Iterator it = this.f23021e;
            if (!it.hasNext()) {
                this.f23022i = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((e) this.f23024w).f23027c.invoke(next)).booleanValue());
        this.f23023v = next;
        this.f23022i = 1;
    }

    public boolean d() {
        Iterator it;
        Iterator it2 = (Iterator) this.f23023v;
        if (it2 != null && it2.hasNext()) {
            this.f23022i = 1;
            return true;
        }
        do {
            Iterator it3 = this.f23021e;
            if (!it3.hasNext()) {
                this.f23022i = 2;
                this.f23023v = null;
                return false;
            }
            Object next = it3.next();
            h hVar = (h) this.f23024w;
            it = (Iterator) hVar.f23034c.invoke(hVar.f23033b.invoke(next));
        } while (!it.hasNext());
        this.f23023v = it;
        this.f23022i = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f23020d) {
            case 0:
                if (this.f23022i == -1) {
                    c();
                }
                return this.f23022i == 1 || this.f23021e.hasNext();
            case 1:
                if (this.f23022i == -1) {
                    a();
                }
                return this.f23022i == 1;
            case 2:
                int i7 = this.f23022i;
                if (i7 == 1) {
                    return true;
                }
                if (i7 == 2) {
                    return false;
                }
                return d();
            default:
                if (this.f23022i == -1) {
                    b();
                }
                return this.f23022i == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f23020d) {
            case 0:
                if (this.f23022i == -1) {
                    c();
                }
                if (this.f23022i != 1) {
                    return this.f23021e.next();
                }
                Object obj = this.f23023v;
                this.f23023v = null;
                this.f23022i = 0;
                return obj;
            case 1:
                if (this.f23022i == -1) {
                    a();
                }
                if (this.f23022i == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f23023v;
                this.f23023v = null;
                this.f23022i = -1;
                return obj2;
            case 2:
                int i7 = this.f23022i;
                if (i7 == 2) {
                    throw new NoSuchElementException();
                }
                if (i7 == 0 && !d()) {
                    throw new NoSuchElementException();
                }
                this.f23022i = 0;
                Iterator it = (Iterator) this.f23023v;
                Intrinsics.checkNotNull(it);
                return it.next();
            default:
                if (this.f23022i == -1) {
                    b();
                }
                if (this.f23022i == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f23023v;
                this.f23023v = null;
                this.f23022i = -1;
                return obj3;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f23020d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(h hVar) {
        this.f23020d = 2;
        this.f23024w = hVar;
        this.f23021e = hVar.f23032a.iterator();
    }

    public d(e eVar, byte b10) {
        this.f23020d = 3;
        this.f23024w = eVar;
        this.f23021e = ((Sequence) eVar.f23026b).iterator();
        this.f23022i = -1;
    }

    public d(e eVar) {
        this.f23020d = 0;
        this.f23024w = eVar;
        this.f23021e = ((Sequence) eVar.f23026b).iterator();
        this.f23022i = -1;
    }
}
