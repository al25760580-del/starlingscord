package x8;

import android.util.Pair;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;
import hi.o;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f22642a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f22645d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Throwable f22646e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f22647f = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22644c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22643b = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentLinkedQueue f22648g = new ConcurrentLinkedQueue();

    @Override // com.facebook.datasource.DataSource
    public synchronized boolean a() {
        return this.f22645d != null;
    }

    @Override // com.facebook.datasource.DataSource
    public final synchronized Throwable b() {
        return this.f22646e;
    }

    @Override // com.facebook.datasource.DataSource
    public final synchronized float c() {
        return this.f22647f;
    }

    @Override // com.facebook.datasource.DataSource
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f22644c) {
                    return false;
                }
                this.f22644c = true;
                Object obj = this.f22645d;
                this.f22645d = null;
                if (obj != null) {
                    e(obj);
                }
                if (!isFinished()) {
                    g();
                }
                synchronized (this) {
                    this.f22648g.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.facebook.datasource.DataSource
    public final void d(DataSubscriber dataSubscriber, Executor executor) {
        boolean z5;
        dataSubscriber.getClass();
        executor.getClass();
        synchronized (this) {
            try {
                if (this.f22644c) {
                    return;
                }
                if (this.f22643b == 1) {
                    this.f22648g.add(Pair.create(dataSubscriber, executor));
                }
                boolean z6 = a() || isFinished() || k();
                if (z6) {
                    synchronized (this) {
                        z5 = this.f22643b == 3;
                    }
                    executor.execute(new ik.b(this, z5, dataSubscriber, k()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized boolean f() {
        return this.f22644c;
    }

    public final void g() {
        boolean z5;
        synchronized (this) {
            z5 = this.f22643b == 3;
        }
        boolean zK = k();
        for (Pair pair : this.f22648g) {
            ((Executor) pair.second).execute(new ik.b(this, z5, (DataSubscriber) pair.first, zK));
        }
    }

    @Override // com.facebook.datasource.DataSource
    public final Map getExtras() {
        return this.f22642a;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized Object getResult() {
        return this.f22645d;
    }

    public final boolean h(Throwable th2, Map map) {
        boolean z5;
        synchronized (this) {
            if (this.f22644c) {
                z5 = false;
            } else {
                z5 = true;
                if (this.f22643b != 1) {
                    z5 = false;
                } else {
                    this.f22643b = 3;
                    this.f22646e = th2;
                    this.f22642a = map;
                }
            }
        }
        if (z5) {
            g();
        }
        return z5;
    }

    public final boolean i(float f2) {
        boolean z5;
        synchronized (this) {
            z5 = false;
            if (!this.f22644c && this.f22643b == 1 && f2 >= this.f22647f) {
                this.f22647f = f2;
                z5 = true;
            }
        }
        if (z5) {
            for (Pair pair : this.f22648g) {
                ((Executor) pair.second).execute(new o(this, (DataSubscriber) pair.first, 25, false));
            }
        }
        return z5;
    }

    @Override // com.facebook.datasource.DataSource
    public final synchronized boolean isFinished() {
        return this.f22643b != 1;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0029 A[PHI: r1 r3
      0x0029: PHI (r1v2 boolean) = (r1v0 boolean), (r1v3 boolean) binds: [B:27:0x0033, B:21:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r3v7 java.lang.Object) = (r3v0 java.lang.Object), (r3v10 java.lang.Object) binds: [B:27:0x0033, B:21:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0019 -> B:32:0x003c). Please report as a decompilation issue!!! */
    public final boolean j(Object obj, boolean z5, Map map) {
        boolean z6;
        this.f22642a = map;
        Object obj2 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (this.f22644c) {
                            z6 = false;
                            if (obj != null) {
                                e(obj);
                            }
                        } else {
                            z6 = true;
                            if (this.f22643b != 1) {
                                z6 = false;
                                if (obj != null) {
                                    e(obj);
                                }
                            } else {
                                if (z5) {
                                    this.f22643b = 2;
                                    this.f22647f = 1.0f;
                                }
                                Object obj3 = this.f22645d;
                                if (obj3 != obj) {
                                    try {
                                        this.f22645d = obj;
                                        obj = obj3;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj2 = obj3;
                                        throw th;
                                    }
                                } else {
                                    obj = null;
                                }
                                if (obj != null) {
                                    e(obj);
                                }
                            }
                        }
                        if (z6) {
                            g();
                        }
                        return z6;
                    } catch (Throwable th3) {
                        obj2 = obj;
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            if (obj2 != null) {
                e(obj2);
            }
            throw th5;
        }
    }

    public final synchronized boolean k() {
        return f() && !isFinished();
    }

    public void e(Object obj) {
    }
}
