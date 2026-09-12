package l4;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ExecutorService f14824e = Executors.newCachedThreadPool(new x4.d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f14825a = new LinkedHashSet(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f14826b = new LinkedHashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f14827c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile a0 f14828d = null;

    public c0(i iVar) {
        d(new a0(iVar));
    }

    public final synchronized void a(y yVar) {
        Throwable th2;
        try {
            a0 a0Var = this.f14828d;
            if (a0Var != null && (th2 = a0Var.f14821b) != null) {
                yVar.onResult(th2);
            }
            this.f14826b.add(yVar);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void b(y yVar) {
        i iVar;
        try {
            a0 a0Var = this.f14828d;
            if (a0Var != null && (iVar = a0Var.f14820a) != null) {
                yVar.onResult(iVar);
            }
            this.f14825a.add(yVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        a0 a0Var = this.f14828d;
        if (a0Var == null) {
            return;
        }
        i iVar = a0Var.f14820a;
        if (iVar != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.f14825a).iterator();
                while (it.hasNext()) {
                    ((y) it.next()).onResult(iVar);
                }
            }
            return;
        }
        Throwable th2 = a0Var.f14821b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.f14826b);
            if (arrayList.isEmpty()) {
                x4.c.c("Lottie encountered an error but no failure listener was added:", th2);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((y) it2.next()).onResult(th2);
            }
        }
    }

    public final void d(a0 a0Var) {
        if (this.f14828d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f14828d = a0Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.f14827c.post(new io.sentry.android.core.p(18, this));
        }
    }

    public c0(Callable callable, boolean z5) {
        if (z5) {
            try {
                d((a0) callable.call());
                return;
            } catch (Throwable th2) {
                d(new a0(th2));
                return;
            }
        }
        ExecutorService executorService = f14824e;
        b0 b0Var = new b0(callable);
        b0Var.f14823e = this;
        executorService.execute(b0Var);
    }
}
