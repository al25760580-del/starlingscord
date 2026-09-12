package n9;

import android.util.SparseArray;
import ca.c;
import com.facebook.common.references.CloseableReference;
import com.google.firebase.messaging.r;
import ga.e;
import ga.h;
import kotlin.jvm.internal.Intrinsics;
import na.g;
import na.j;
import pa.s;
import ue.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements m9.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f16518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16519e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseArray f16520i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r8.b f16521v;

    public b(r animatedFrameCache, boolean z5) {
        Intrinsics.checkNotNullParameter(animatedFrameCache, "animatedFrameCache");
        this.f16518d = animatedFrameCache;
        this.f16519e = z5;
        this.f16520i = new SparseArray();
    }

    public final synchronized void a(int i7) {
        CloseableReference closeableReference = (CloseableReference) this.f16520i.get(i7);
        if (closeableReference != null) {
            this.f16520i.delete(i7);
            closeableReference.close();
            o8.a.o(b.class, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i7), this.f16520i);
        }
    }

    @Override // m9.b
    public final synchronized CloseableReference c() {
        return s.k(CloseableReference.g(this.f16521v));
    }

    @Override // m9.b
    public final synchronized void clear() {
        try {
            CloseableReference.l(this.f16521v);
            this.f16521v = null;
            int size = this.f16520i.size();
            for (int i7 = 0; i7 < size; i7++) {
                CloseableReference.l((CloseableReference) this.f16520i.valueAt(i7));
            }
            this.f16520i.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // m9.b
    public final synchronized boolean contains(int i7) {
        boolean zContainsKey;
        r rVar = this.f16518d;
        e eVar = (e) rVar.f6611e;
        c cVar = new c((a) rVar.f6610d, i7);
        h hVar = (h) eVar;
        synchronized (hVar) {
            ga.c cVar2 = hVar.f9540e;
            synchronized (cVar2) {
                zContainsKey = cVar2.f9532b.containsKey(cVar);
            }
        }
        return zContainsKey;
    }

    @Override // m9.b
    public final synchronized CloseableReference e() {
        if (!this.f16519e) {
            return null;
        }
        return s.k(this.f16518d.e());
    }

    @Override // m9.b
    public final synchronized CloseableReference f(int i7) {
        r rVar;
        rVar = this.f16518d;
        return s.k(((h) ((e) rVar.f6611e)).get(new c((a) rVar.f6610d, i7)));
    }

    @Override // m9.b
    public final synchronized void k(int i7, CloseableReference bitmapReference) {
        r8.b bVarB;
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
        try {
            j jVar = j.f16536d;
            int i10 = g.F;
            g gVar = new g(bitmapReference, jVar, 0, 0);
            Intrinsics.checkNotNullExpressionValue(gVar, "of(...)");
            bVarB = CloseableReference.B(gVar);
            if (bVarB == null) {
                CloseableReference.l(bVarB);
                return;
            }
            try {
                r rVar = this.f16518d;
                r8.b bVarA = ((h) ((e) rVar.f6611e)).a(new c((a) rVar.f6610d, i7), bVarB, (i) rVar.f6612i);
                if (CloseableReference.z(bVarA)) {
                    CloseableReference.l((CloseableReference) this.f16520i.get(i7));
                    this.f16520i.put(i7, bVarA);
                    o8.a.o(b.class, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i7), this.f16520i);
                }
                bVarB.close();
            } catch (Throwable th2) {
                th = th2;
                CloseableReference.l(bVarB);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bVarB = null;
        }
    }

    @Override // m9.b
    public final synchronized void l(int i7, CloseableReference bitmapReference) {
        r8.b bVarB;
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
        a(i7);
        try {
            j jVar = j.f16536d;
            int i10 = g.F;
            g gVar = new g(bitmapReference, jVar, 0, 0);
            Intrinsics.checkNotNullExpressionValue(gVar, "of(...)");
            bVarB = CloseableReference.B(gVar);
            if (bVarB != null) {
                try {
                    CloseableReference.l(this.f16521v);
                    r rVar = this.f16518d;
                    this.f16521v = ((h) ((e) rVar.f6611e)).a(new c((a) rVar.f6610d, i7), bVarB, (i) rVar.f6612i);
                } catch (Throwable th2) {
                    th = th2;
                    CloseableReference.l(bVarB);
                    throw th;
                }
            }
            CloseableReference.l(bVarB);
        } catch (Throwable th3) {
            th = th3;
            bVarB = null;
        }
    }
}
