package ig;

import af.w;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import cr.q;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11774a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc.b f11775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f11777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f11778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Exception f11779f;

    public l() {
        gc.b bVar = new gc.b();
        bVar.f9561a = new Object();
        this.f11775b = bVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final void a(Executor executor, b bVar) {
        this.f11775b.e(new j(executor, bVar));
        t();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.f11775b.e(new j(h.f11764a, onCompleteListener));
        t();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final void b(Executor executor, OnCompleteListener onCompleteListener) {
        this.f11775b.e(new j(executor, onCompleteListener));
        t();
    }

    @Override // com.google.android.gms.tasks.Task
    public final l c(Executor executor, c cVar) {
        this.f11775b.e(new j(executor, cVar));
        t();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final l d(d dVar) {
        e(h.f11764a, dVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final l e(Executor executor, d dVar) {
        this.f11775b.e(new j(executor, dVar));
        t();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task f(Executor executor, a aVar) {
        l lVar = new l();
        this.f11775b.e(new i(executor, aVar, lVar, 0));
        t();
        return lVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task g(Executor executor, a aVar) {
        l lVar = new l();
        this.f11775b.e(new i(executor, aVar, lVar, 1));
        t();
        return lVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception h() {
        Exception exc;
        synchronized (this.f11774a) {
            exc = this.f11779f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object i() {
        Object obj;
        synchronized (this.f11774a) {
            try {
                w.i("Task is not yet complete", this.f11776c);
                if (this.f11777d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f11779f;
                if (exc != null) {
                    throw new e(exc);
                }
                obj = this.f11778e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object j() {
        Object obj;
        synchronized (this.f11774a) {
            try {
                w.i("Task is not yet complete", this.f11776c);
                if (this.f11777d) {
                    throw new CancellationException("Task is already canceled.");
                }
                if (IOException.class.isInstance(this.f11779f)) {
                    throw ((Throwable) IOException.class.cast(this.f11779f));
                }
                Exception exc = this.f11779f;
                if (exc != null) {
                    throw new e(exc);
                }
                obj = this.f11778e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean k() {
        return this.f11777d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean l() {
        boolean z5;
        synchronized (this.f11774a) {
            z5 = this.f11776c;
        }
        return z5;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean m() {
        boolean z5;
        synchronized (this.f11774a) {
            try {
                z5 = false;
                if (this.f11776c && !this.f11777d && this.f11779f == null) {
                    z5 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z5;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task n(Executor executor, f fVar) {
        l lVar = new l();
        this.f11775b.e(new j(executor, fVar, lVar));
        t();
        return lVar;
    }

    public final l o(c cVar) {
        c(h.f11764a, cVar);
        return this;
    }

    public final void p(Exception exc) {
        w.h(exc, "Exception must not be null");
        synchronized (this.f11774a) {
            s();
            this.f11776c = true;
            this.f11779f = exc;
        }
        this.f11775b.f(this);
    }

    public final void q(Object obj) {
        synchronized (this.f11774a) {
            s();
            this.f11776c = true;
            this.f11778e = obj;
        }
        this.f11775b.f(this);
    }

    public final void r() {
        synchronized (this.f11774a) {
            try {
                if (this.f11776c) {
                    return;
                }
                this.f11776c = true;
                this.f11777d = true;
                this.f11775b.f(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void s() {
        String strConcat;
        if (this.f11776c) {
            int i7 = q.f7389d;
            if (!l()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excH = h();
            if (excH != null) {
                strConcat = "failure";
            } else if (m()) {
                strConcat = "result ".concat(String.valueOf(i()));
            } else {
                strConcat = this.f11777d ? "cancellation" : "unknown issue";
            }
        }
    }

    public final void t() {
        synchronized (this.f11774a) {
            try {
                if (this.f11776c) {
                    this.f11775b.f(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
