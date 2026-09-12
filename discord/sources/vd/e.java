package vd;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import h5.m;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements g, lc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f21650a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lc.g[] f21655f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public lc.f f21658i;
    public h j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f21659l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21651b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f21652c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f21653d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lc.f[] f21654e = new j[2];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21656g = 2;

    public e() {
        d[] dVarArr = new d[2];
        int i7 = 0;
        while (true) {
            if (i7 >= this.f21656g) {
                break;
            }
            this.f21654e[i7] = new j(1);
            i7++;
        }
        this.f21655f = dVarArr;
        this.f21657h = 2;
        for (int i10 = 0; i10 < this.f21657h; i10++) {
            this.f21655f[i10] = new d(this, 1);
        }
        m mVar = new m(this);
        this.f21650a = mVar;
        mVar.start();
        int i11 = this.f21656g;
        lc.f[] fVarArr = this.f21654e;
        je.b.k(i11 == fVarArr.length);
        for (lc.f fVar : fVarArr) {
            fVar.i(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        }
    }

    @Override // lc.d
    public final void a(j jVar) {
        synchronized (this.f21651b) {
            try {
                h hVar = this.j;
                if (hVar != null) {
                    throw hVar;
                }
                je.b.g(jVar == this.f21658i);
                this.f21652c.addLast(jVar);
                if (!this.f21652c.isEmpty() && this.f21657h > 0) {
                    this.f21651b.notify();
                }
                this.f21658i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // lc.d
    public final Object c() {
        synchronized (this.f21651b) {
            try {
                h hVar = this.j;
                if (hVar != null) {
                    throw hVar;
                }
                if (this.f21653d.isEmpty()) {
                    return null;
                }
                return (lc.g) this.f21653d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // lc.d
    public final Object d() {
        lc.f fVar;
        synchronized (this.f21651b) {
            try {
                h hVar = this.j;
                if (hVar != null) {
                    throw hVar;
                }
                je.b.k(this.f21658i == null);
                int i7 = this.f21656g;
                if (i7 == 0) {
                    fVar = null;
                } else {
                    lc.f[] fVarArr = this.f21654e;
                    int i10 = i7 - 1;
                    this.f21656g = i10;
                    fVar = fVarArr[i10];
                }
                this.f21658i = fVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public abstract f e(byte[] bArr, int i7, boolean z5);

    public final h f(lc.f fVar, lc.g gVar, boolean z5) {
        j jVar = (j) fVar;
        d dVar = (d) gVar;
        try {
            ByteBuffer byteBuffer = jVar.f15010v;
            byteBuffer.getClass();
            dVar.g(jVar.f15012x, e(byteBuffer.array(), byteBuffer.limit(), z5), jVar.F);
            dVar.f14999e &= Integer.MAX_VALUE;
            return null;
        } catch (h e10) {
            return e10;
        }
    }

    @Override // lc.d
    public final void flush() {
        synchronized (this.f21651b) {
            try {
                this.k = true;
                lc.f fVar = this.f21658i;
                if (fVar != null) {
                    fVar.e();
                    lc.f[] fVarArr = this.f21654e;
                    int i7 = this.f21656g;
                    this.f21656g = i7 + 1;
                    fVarArr[i7] = fVar;
                    this.f21658i = null;
                }
                while (!this.f21652c.isEmpty()) {
                    lc.f fVar2 = (lc.f) this.f21652c.removeFirst();
                    fVar2.e();
                    lc.f[] fVarArr2 = this.f21654e;
                    int i10 = this.f21656g;
                    this.f21656g = i10 + 1;
                    fVarArr2[i10] = fVar2;
                }
                while (!this.f21653d.isEmpty()) {
                    ((lc.g) this.f21653d.removeFirst()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean g() {
        h hVar;
        h hVarF;
        synchronized (this.f21651b) {
            while (!this.f21659l) {
                try {
                    if (!this.f21652c.isEmpty() && this.f21657h > 0) {
                        break;
                    }
                    this.f21651b.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f21659l) {
                return false;
            }
            lc.f fVar = (lc.f) this.f21652c.removeFirst();
            lc.g[] gVarArr = this.f21655f;
            int i7 = this.f21657h - 1;
            this.f21657h = i7;
            lc.g gVar = gVarArr[i7];
            boolean z5 = this.k;
            this.k = false;
            if (fVar.c(4)) {
                gVar.a(4);
            } else {
                if (fVar.c(Integer.MIN_VALUE)) {
                    gVar.a(Integer.MIN_VALUE);
                }
                if (fVar.c(134217728)) {
                    gVar.a(134217728);
                }
                try {
                    hVarF = f(fVar, gVar, z5);
                } catch (OutOfMemoryError e10) {
                    hVar = new h("Unexpected decode error", e10);
                    hVarF = hVar;
                } catch (RuntimeException e11) {
                    hVar = new h("Unexpected decode error", e11);
                    hVarF = hVar;
                }
                if (hVarF != null) {
                    synchronized (this.f21651b) {
                        this.j = hVarF;
                    }
                    return false;
                }
            }
            synchronized (this.f21651b) {
                try {
                    if (this.k || gVar.c(Integer.MIN_VALUE)) {
                        gVar.e();
                    } else {
                        this.f21653d.addLast(gVar);
                    }
                    fVar.e();
                    lc.f[] fVarArr = this.f21654e;
                    int i10 = this.f21656g;
                    this.f21656g = i10 + 1;
                    fVarArr[i10] = fVar;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
    }

    @Override // lc.d
    public final void release() {
        synchronized (this.f21651b) {
            this.f21659l = true;
            this.f21651b.notify();
        }
        try {
            this.f21650a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // vd.g
    public final void b(long j) {
    }
}
