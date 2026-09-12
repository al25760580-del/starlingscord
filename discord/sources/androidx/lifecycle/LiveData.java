package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData {
    public static final Object k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2309a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p.f f2310b = new p.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2311c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f2313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f2314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2316h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2317i;
    public final a3.h j;

    public LiveData() {
        Object obj = k;
        this.f2314f = obj;
        this.j = new a3.h(7, this);
        this.f2313e = obj;
        this.f2315g = -1;
    }

    public static void a(String str) {
        o.a.T().f17070b.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(s0.g.e("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(a0 a0Var) {
        if (a0Var.f2327e) {
            if (!a0Var.e()) {
                a0Var.a(false);
                return;
            }
            int i7 = a0Var.f2328i;
            int i10 = this.f2315g;
            if (i7 >= i10) {
                return;
            }
            a0Var.f2328i = i10;
            a0Var.f2326d.onChanged(this.f2313e);
        }
    }

    public final void c(a0 a0Var) {
        if (this.f2316h) {
            this.f2317i = true;
            return;
        }
        this.f2316h = true;
        do {
            this.f2317i = false;
            if (a0Var != null) {
                b(a0Var);
                a0Var = null;
            } else {
                p.f fVar = this.f2310b;
                fVar.getClass();
                p.d dVar = new p.d(fVar);
                fVar.f17722i.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((a0) ((Map.Entry) dVar.next()).getValue());
                    if (this.f2317i) {
                        break;
                    }
                }
            }
        } while (this.f2317i);
        this.f2316h = false;
    }

    public final void d(LifecycleOwner lifecycleOwner, Observer observer) {
        Object obj;
        a("observe");
        if (lifecycleOwner.getLifecycle().b() == Lifecycle.State.f2295d) {
            return;
        }
        z zVar = new z(this, lifecycleOwner, observer);
        p.f fVar = this.f2310b;
        p.c cVarA = fVar.a(observer);
        if (cVarA != null) {
            obj = cVarA.f17714e;
        } else {
            p.c cVar = new p.c(observer, zVar);
            fVar.f17723v++;
            p.c cVar2 = fVar.f17721e;
            if (cVar2 == null) {
                fVar.f17720d = cVar;
                fVar.f17721e = cVar;
            } else {
                cVar2.f17715i = cVar;
                cVar.f17716v = cVar2;
                fVar.f17721e = cVar;
            }
            obj = null;
        }
        a0 a0Var = (a0) obj;
        if (a0Var != null && !a0Var.d(lifecycleOwner)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (a0Var != null) {
            return;
        }
        lifecycleOwner.getLifecycle().a(zVar);
    }

    public void e() {
    }

    public void f() {
    }

    public void g(Observer observer) {
        a("removeObserver");
        a0 a0Var = (a0) this.f2310b.b(observer);
        if (a0Var == null) {
            return;
        }
        a0Var.b();
        a0Var.a(false);
    }

    public void h(Object obj) {
        a("setValue");
        this.f2315g++;
        this.f2313e = obj;
        c(null);
    }
}
