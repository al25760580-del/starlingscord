package androidx.work.impl;

import a3.b;
import a3.i;
import android.database.Cursor;
import android.os.Looper;
import e4.e;
import e4.l;
import e4.m;
import e4.p;
import e4.r;
import g3.d;
import g3.f;
import h3.c;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.collections.p0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000B\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class WorkDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile c f2818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f2819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f2820c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f2823f;
    public final LinkedHashMap j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f2821d = d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f2824g = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f2825h = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ThreadLocal f2826i = new ThreadLocal();

    public WorkDatabase() {
        Intrinsics.checkNotNullExpressionValue(Collections.synchronizedMap(new LinkedHashMap()), "synchronizedMap(mutableMapOf())");
        this.j = new LinkedHashMap();
    }

    public static Object q(Class cls, d dVar) {
        if (cls.isInstance(dVar)) {
            return dVar;
        }
        if (dVar instanceof a3.c) {
            return q(cls, ((a3.c) dVar).getDelegate());
        }
        return null;
    }

    public final void a() {
        if (!this.f2822e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!h().C().q() && this.f2826i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        c cVarC = h().C();
        this.f2821d.c(cVarC);
        if (cVarC.u()) {
            cVarC.f();
        } else {
            cVarC.c();
        }
    }

    public abstract i d();

    public abstract d e(b bVar);

    public abstract e4.c f();

    public List g(Map autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return n0.f14659d;
    }

    public final d h() {
        d dVar = this.f2820c;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalOpenHelper");
        return null;
    }

    public Set i() {
        return p0.f14661d;
    }

    public Map j() {
        return w0.d();
    }

    public final void k() {
        h().C().i();
        if (h().C().q()) {
            return;
        }
        i iVar = this.f2821d;
        if (iVar.f78e.compareAndSet(false, true)) {
            Executor executor = iVar.f74a.f2819b;
            if (executor == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
                executor = null;
            }
            executor.execute(iVar.f83l);
        }
    }

    public abstract e l();

    public final Cursor m(f query) {
        Intrinsics.checkNotNullParameter(query, "query");
        a();
        b();
        return h().C().y(query);
    }

    public final Object n(Callable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        c();
        try {
            Object objCall = body.call();
            o();
            return objCall;
        } finally {
            k();
        }
    }

    public final void o() {
        h().C().B();
    }

    public abstract e4.i p();

    public abstract l r();

    public abstract m s();

    public abstract p t();

    public abstract r u();
}
