package j4;

import androidx.datastore.preferences.protobuf.d1;
import com.google.android.gms.internal.play_billing.u0;
import f4.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import ue.i;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ExecutorService f13655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h4.a f13656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f13657i;
    public static final e j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Exception f13662e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13658a = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f13663f = new ArrayList();

    static {
        b bVar = b.f13649c;
        f13655g = bVar.f13650a;
        f13656h = bVar.f13651b;
        n nVar = a.f13645b.f13648a;
        new e((Boolean) null);
        f13657i = new e(Boolean.TRUE);
        j = new e(Boolean.FALSE);
        new e(0);
    }

    public e() {
    }

    public static e a(Callable callable, Executor executor) {
        i iVar = new i(20, false);
        try {
            executor.execute(new u0(15, iVar, callable));
        } catch (Exception e10) {
            iVar.s(new d1(e10));
        }
        return (e) iVar.f21117d;
    }

    public static e b(Exception exc) {
        e eVar = new e();
        synchronized (eVar.f13658a) {
            try {
                if (eVar.f13659b) {
                    throw new IllegalStateException("Cannot set the error on a completed task.");
                }
                eVar.f13659b = true;
                eVar.f13662e = exc;
                eVar.f13658a.notifyAll();
                eVar.e();
                return eVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Exception c() {
        Exception exc;
        synchronized (this.f13658a) {
            exc = this.f13662e;
        }
        return exc;
    }

    public final boolean d() {
        boolean z5;
        synchronized (this.f13658a) {
            z5 = c() != null;
        }
        return z5;
    }

    public final void e() {
        synchronized (this.f13658a) {
            Iterator it = this.f13663f.iterator();
            while (it.hasNext()) {
                try {
                    ((c) it.next()).a(this);
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f13663f = null;
        }
    }

    public final boolean f() {
        synchronized (this.f13658a) {
            try {
                if (this.f13659b) {
                    return false;
                }
                this.f13659b = true;
                this.f13660c = true;
                this.f13658a.notifyAll();
                e();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean g(Object obj) {
        synchronized (this.f13658a) {
            try {
                if (this.f13659b) {
                    return false;
                }
                this.f13659b = true;
                this.f13661d = obj;
                this.f13658a.notifyAll();
                e();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public e(Boolean bool) {
        g(bool);
    }

    public e(int i7) {
        f();
    }
}
