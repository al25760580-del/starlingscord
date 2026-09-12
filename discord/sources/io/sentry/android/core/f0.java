package io.sentry.android.core;

import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.j2;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements Closeable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f0 f12181w = new f0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile e0 f12183e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.sentry.util.a f12182d = new io.sentry.util.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m0 f12184i = new m0(3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile Boolean f12185v = null;

    public final void c(c0 c0Var) {
        io.sentry.r rVarA = this.f12182d.a();
        try {
            g(j2.f12781d);
            if (this.f12183e != null) {
                this.f12183e.f12178d.add(c0Var);
            }
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        l();
    }

    public final void f(ILogger iLogger) {
        e0 e0Var = this.f12183e;
        if (e0Var != null) {
            try {
                ProcessLifecycleOwner.F.f2323x.a(e0Var);
            } catch (Throwable th2) {
                this.f12183e = null;
                iLogger.g(SentryLevel.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th2);
            }
        }
    }

    public final void g(ILogger iLogger) {
        if (this.f12183e != null) {
            return;
        }
        try {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.F;
            this.f12183e = new e0(this);
            if (io.sentry.android.core.internal.util.e.f12290a.c()) {
                f(iLogger);
                return;
            }
            m0 m0Var = this.f12184i;
            ((Handler) m0Var.f12350d).post(new com.mkuczera.haptic.a(16, this, iLogger));
        } catch (ClassNotFoundException unused) {
            iLogger.q(SentryLevel.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th2) {
            iLogger.g(SentryLevel.ERROR, "AppState could not register lifecycle observer", th2);
        }
    }

    public final void i(c0 c0Var) {
        io.sentry.r rVarA = this.f12182d.a();
        try {
            if (this.f12183e != null) {
                this.f12183e.f12178d.remove(c0Var);
            }
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l() {
        if (this.f12183e == null) {
            return;
        }
        io.sentry.r rVarA = this.f12182d.a();
        try {
            e0 e0Var = this.f12183e;
            this.f12183e.f12178d.clear();
            this.f12183e = null;
            rVarA.close();
            if (io.sentry.android.core.internal.util.e.f12290a.c()) {
                if (e0Var != null) {
                    ProcessLifecycleOwner.F.f2323x.c(e0Var);
                }
            } else {
                m0 m0Var = this.f12184i;
                ((Handler) m0Var.f12350d).post(new p(this, e0Var));
            }
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
