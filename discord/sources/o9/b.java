package o9;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m9.a f17174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m9.b f17175e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17176i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f17177v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f17178w;

    public b(c cVar, m9.a animationBackend, m9.b bitmapFrameCache, int i7, int i10) {
        Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        this.f17178w = cVar;
        this.f17174d = animationBackend;
        this.f17175e = bitmapFrameCache;
        this.f17176i = i7;
        this.f17177v = i10;
    }

    public final boolean a(int i7, int i10) {
        CloseableReference closeableReferenceE;
        c cVar = this.f17178w;
        m9.a aVar = this.f17174d;
        int i11 = 2;
        try {
            if (i10 == 1) {
                closeableReferenceE = this.f17175e.e();
            } else {
                if (i10 != 2) {
                    return false;
                }
                try {
                    closeableReferenceE = ((PlatformBitmapFactory) cVar.f17179d).a(aVar.k, aVar.f15479l, (Bitmap.Config) cVar.f17181i);
                    i11 = -1;
                } catch (RuntimeException e10) {
                    cVar.getClass();
                    o8.a.s(c.class, "Failed to create frame bitmap", e10);
                    return false;
                }
            }
            CloseableReference closeableReference = closeableReferenceE;
            boolean zB = b(i7, closeableReference, i10);
            CloseableReference.l(closeableReference);
            return (zB || i11 == -1) ? zB : a(i7, i11);
        } catch (Throwable th2) {
            CloseableReference.l(null);
            throw th2;
        }
    }

    public final boolean b(int i7, CloseableReference closeableReference, int i10) {
        if (!CloseableReference.z(closeableReference) || closeableReference == null) {
            return false;
        }
        r9.a aVar = (r9.a) this.f17178w.f17180e;
        Object objQ = closeableReference.q();
        Intrinsics.checkNotNullExpressionValue(objQ, "get(...)");
        if (!aVar.m(i7, (Bitmap) objQ)) {
            return false;
        }
        this.f17178w.getClass();
        o8.a.q("Frame %d ready.", Integer.valueOf(i7), c.class);
        synchronized (((SparseArray) this.f17178w.f17183w)) {
            this.f17175e.k(i7, closeableReference);
            Unit unit = Unit.f14616a;
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f17175e.contains(this.f17176i)) {
                this.f17178w.getClass();
                o8.a.q("Frame %d is cached already.", Integer.valueOf(this.f17176i), c.class);
                c cVar = this.f17178w;
                synchronized (((SparseArray) cVar.f17183w)) {
                    ((SparseArray) cVar.f17183w).remove(this.f17177v);
                    Unit unit = Unit.f14616a;
                }
                return;
            }
            if (a(this.f17176i, 1)) {
                this.f17178w.getClass();
                o8.a.q("Prepared frame %d.", Integer.valueOf(this.f17176i), c.class);
            } else {
                this.f17178w.getClass();
                o8.a.f(c.class, "Could not prepare frame %d.", Integer.valueOf(this.f17176i));
            }
            c cVar2 = this.f17178w;
            synchronized (((SparseArray) cVar2.f17183w)) {
                ((SparseArray) cVar2.f17183w).remove(this.f17177v);
                Unit unit2 = Unit.f14616a;
            }
        } catch (Throwable th2) {
            c cVar3 = this.f17178w;
            synchronized (((SparseArray) cVar3.f17183w)) {
                ((SparseArray) cVar3.f17183w).remove(this.f17177v);
                Unit unit3 = Unit.f14616a;
                throw th2;
            }
        }
    }
}
