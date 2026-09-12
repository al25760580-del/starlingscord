package sh;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 {
    public static final a5.o k = new a5.o("ExtractorLooper", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f20114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f20115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1 f20116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b1 f20117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1 f20118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f20119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m1 f20120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w0 f20121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f20122i = new AtomicBoolean(false);
    public final th.f j;

    public n0(v0 v0Var, th.f fVar, e0 e0Var, q1 q1Var, b1 b1Var, d1 d1Var, k1 k1Var, m1 m1Var, w0 w0Var) {
        this.f20114a = v0Var;
        this.j = fVar;
        this.f20115b = e0Var;
        this.f20116c = q1Var;
        this.f20117d = b1Var;
        this.f20118e = d1Var;
        this.f20119f = k1Var;
        this.f20120g = m1Var;
        this.f20121h = w0Var;
    }

    public final void a() {
        hj.j jVarA;
        th.f fVar = this.j;
        a5.o oVar = k;
        oVar.a("Run extractor loop", new Object[0]);
        AtomicBoolean atomicBoolean = this.f20122i;
        if (!atomicBoolean.compareAndSet(false, true)) {
            oVar.e("runLoop already looping; return", new Object[0]);
            return;
        }
        while (true) {
            try {
                jVarA = this.f20121h.a();
            } catch (l0 e10) {
                oVar.b("Error while getting next extraction task: %s", e10.getMessage());
                int i7 = e10.f20090d;
                if (i7 >= 0) {
                    ((v1) fVar.a()).b(i7);
                    b(i7, e10);
                }
                jVarA = null;
            }
            if (jVarA == null) {
                atomicBoolean.set(false);
                return;
            }
            try {
                if (jVarA instanceof d0) {
                    this.f20115b.a((d0) jVarA);
                } else if (jVarA instanceof p1) {
                    this.f20116c.a((p1) jVarA);
                } else if (jVarA instanceof a1) {
                    this.f20117d.a((a1) jVarA);
                } else if (jVarA instanceof c1) {
                    this.f20118e.a((c1) jVarA);
                } else if (jVarA instanceof j1) {
                    this.f20119f.a((j1) jVarA);
                } else if (jVarA instanceof l1) {
                    this.f20120g.a((l1) jVarA);
                } else {
                    oVar.b("Unknown task type: %s", jVarA.getClass().getName());
                }
            } catch (Exception e11) {
                oVar.b("Error during extraction task: %s", e11.getMessage());
                ((v1) fVar.a()).b(jVarA.f10849a);
                b(jVarA.f10849a, e11);
            }
        }
    }

    public final void b(int i7, Exception exc) {
        v0 v0Var = this.f20114a;
        try {
            ReentrantLock reentrantLock = v0Var.f20211d;
            try {
                reentrantLock.lock();
                v0Var.a(i7).f20176c.f20164d = 5;
                reentrantLock.unlock();
                v0Var.b(new a5.b0(i7, 19, v0Var));
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } catch (l0 unused) {
            k.b("Error during error handling: %s", exc.getMessage());
        }
    }
}
