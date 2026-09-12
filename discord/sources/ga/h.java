package ga;

import android.os.SystemClock;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import gc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements e, i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f9539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f9540e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f9541i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Supplier f9542v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public MemoryCacheParams f9543w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f9544x;

    public h(m mVar, Supplier supplier) {
        new WeakHashMap();
        this.f9541i = mVar;
        this.f9539d = new c(new ue.i(this, mVar));
        this.f9540e = new c(new ue.i(this, mVar));
        this.f9542v = supplier;
        MemoryCacheParams memoryCacheParams = (MemoryCacheParams) supplier.get();
        n8.i.d(memoryCacheParams, "mMemoryCacheParamsSupplier returned null");
        this.f9543w = memoryCacheParams;
        this.f9544x = SystemClock.uptimeMillis();
    }

    public static void f(d dVar) {
        ue.i iVar;
        if (dVar == null || (iVar = dVar.f9538e) == null) {
            return;
        }
        iVar.l(dVar.f9534a, false);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    public final r8.b a(Object obj, CloseableReference closeableReference, ue.i iVar) {
        d dVar;
        r8.b bVarH;
        CloseableReference closeableReferenceI;
        boolean z5;
        obj.getClass();
        closeableReference.getClass();
        g();
        synchronized (this) {
            dVar = (d) this.f9539d.e(obj);
            d dVar2 = (d) this.f9540e.e(obj);
            bVarH = null;
            if (dVar2 != null) {
                synchronized (this) {
                    n8.i.e(!dVar2.f9537d);
                    dVar2.f9537d = true;
                    closeableReferenceI = i(dVar2);
                }
                CloseableReference.l(closeableReferenceI);
                f(dVar);
                d();
                return bVarH;
            }
            closeableReferenceI = null;
            int iE = this.f9541i.e(closeableReference.q());
            synchronized (this) {
                if (iE <= this.f9543w.f4804e) {
                    synchronized (this) {
                        int iA = this.f9540e.a() - this.f9539d.a();
                        if (iA <= this.f9543w.f4801b - 1) {
                            synchronized (this) {
                                z5 = this.f9540e.c() - this.f9539d.c() <= this.f9543w.f4800a - iE;
                            }
                        }
                    }
                }
            }
        }
        if (z5) {
            d dVar3 = new d(obj, closeableReference, iVar, -1);
            this.f9540e.d(obj, dVar3);
            bVarH = h(dVar3);
        }
        CloseableReference.l(closeableReferenceI);
        f(dVar);
        d();
        return bVarH;
    }

    @Override // ga.i
    public final synchronized boolean b(o oVar) {
        return !this.f9540e.b(oVar).isEmpty();
    }

    public final synchronized void c(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                synchronized (this) {
                    dVar.getClass();
                    n8.i.e(!dVar.f9537d);
                    dVar.f9537d = true;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049 A[LOOP:0: B:17:0x0043->B:19:0x0049, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063 A[LOOP:1: B:22:0x005d->B:24:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006d A[ORIG_RETURN, RETURN] */
    public final void d() {
        int i7;
        int i10;
        int iA;
        int iMin;
        int i11;
        int i12;
        ArrayList arrayListJ;
        Iterator it;
        Iterator it2;
        synchronized (this) {
            MemoryCacheParams memoryCacheParams = this.f9543w;
            i7 = memoryCacheParams.f4803d;
            i10 = memoryCacheParams.f4801b;
            synchronized (this) {
                iA = this.f9540e.a() - this.f9539d.a();
            }
            arrayListJ = j(iMin, Math.min(i11, i12 - (this.f9540e.c() - this.f9539d.c())));
            c(arrayListJ);
            if (arrayListJ != null) {
                it2 = arrayListJ.iterator();
                while (it2.hasNext()) {
                    CloseableReference.l(i((d) it2.next()));
                }
            }
            if (arrayListJ != null) {
                it = arrayListJ.iterator();
                while (it.hasNext()) {
                    f((d) it.next());
                }
            }
        }
        iMin = Math.min(i7, i10 - iA);
        MemoryCacheParams memoryCacheParams2 = this.f9543w;
        i11 = memoryCacheParams2.f4802c;
        i12 = memoryCacheParams2.f4800a;
        synchronized (this) {
            arrayListJ = j(iMin, Math.min(i11, i12 - (this.f9540e.c() - this.f9539d.c())));
            c(arrayListJ);
        }
        if (arrayListJ != null) {
            it2 = arrayListJ.iterator();
            while (it2.hasNext()) {
                CloseableReference.l(i((d) it2.next()));
            }
        }
        if (arrayListJ != null) {
            it = arrayListJ.iterator();
            while (it.hasNext()) {
                f((d) it.next());
            }
        }
    }

    @Override // ga.i
    public final CloseableReference e(Object obj, CloseableReference closeableReference) {
        return a(obj, closeableReference, null);
    }

    public final synchronized void g() {
        if (this.f9544x + this.f9543w.f4805f > SystemClock.uptimeMillis()) {
            return;
        }
        this.f9544x = SystemClock.uptimeMillis();
        MemoryCacheParams memoryCacheParams = (MemoryCacheParams) this.f9542v.get();
        n8.i.d(memoryCacheParams, "mMemoryCacheParamsSupplier returned null");
        this.f9543w = memoryCacheParams;
    }

    @Override // ga.i
    public final CloseableReference get(Object obj) {
        d dVar;
        Object obj2;
        r8.b bVarH;
        obj.getClass();
        synchronized (this) {
            try {
                dVar = (d) this.f9539d.e(obj);
                c cVar = this.f9540e;
                synchronized (cVar) {
                    obj2 = cVar.f9532b.get(obj);
                }
                d dVar2 = (d) obj2;
                bVarH = dVar2 != null ? h(dVar2) : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f(dVar);
        g();
        d();
        return bVarH;
    }

    public final synchronized r8.b h(d dVar) {
        synchronized (this) {
            n8.i.e(!dVar.f9537d);
            dVar.f9536c++;
        }
        return CloseableReference.O(dVar.f9535b.q(), new e4.l(this, dVar), CloseableReference.f4623x);
        return CloseableReference.O(dVar.f9535b.q(), new e4.l(this, dVar), CloseableReference.f4623x);
    }

    public final synchronized CloseableReference i(d dVar) {
        dVar.getClass();
        return (dVar.f9537d && dVar.f9536c == 0) ? dVar.f9535b : null;
    }

    public final synchronized ArrayList j(int i7, int i10) {
        Object next;
        int iMax = Math.max(i7, 0);
        int iMax2 = Math.max(i10, 0);
        if (this.f9539d.a() <= iMax && this.f9539d.c() <= iMax2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (this.f9539d.a() <= iMax && this.f9539d.c() <= iMax2) {
                return arrayList;
            }
            c cVar = this.f9539d;
            synchronized (cVar) {
                next = cVar.f9532b.isEmpty() ? null : cVar.f9532b.keySet().iterator().next();
            }
            if (next == null) {
                throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.f9539d.a()), Integer.valueOf(this.f9539d.c())));
            }
            this.f9539d.e(next);
            arrayList.add((d) this.f9540e.e(next));
        }
    }

    @Override // ga.i
    public final int k(n8.g gVar) {
        ArrayList arrayListF;
        ArrayList arrayListF2;
        synchronized (this) {
            arrayListF = this.f9539d.f(gVar);
            arrayListF2 = this.f9540e.f(gVar);
            c(arrayListF2);
        }
        Iterator it = arrayListF2.iterator();
        while (it.hasNext()) {
            CloseableReference.l(i((d) it.next()));
        }
        Iterator it2 = arrayListF.iterator();
        while (it2.hasNext()) {
            f((d) it2.next());
        }
        g();
        d();
        return arrayListF2.size();
    }
}
