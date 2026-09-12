package fs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f9414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f9417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f9418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9419f;

    public b(c taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f9414a = taskRunner;
        this.f9415b = name;
        this.f9418e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = ds.b.f7815a;
        synchronized (this.f9414a) {
            try {
                if (b()) {
                    this.f9414a.d(this);
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        a aVar = this.f9417d;
        if (aVar != null) {
            Intrinsics.checkNotNull(aVar);
            if (aVar.f9411b) {
                this.f9419f = true;
            }
        }
        ArrayList arrayList = this.f9418e;
        int size = arrayList.size() - 1;
        boolean z5 = false;
        if (size < 0) {
            return false;
        }
        while (true) {
            int i7 = size - 1;
            if (((a) arrayList.get(size)).f9411b) {
                a aVar2 = (a) arrayList.get(size);
                if (c.f9421i.isLoggable(Level.FINE)) {
                    io.sentry.config.a.b(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z5 = true;
            }
            if (i7 < 0) {
                return z5;
            }
            size = i7;
        }
    }

    public final void c(a task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f9414a) {
            if (!this.f9416c) {
                if (e(task, j, false)) {
                    this.f9414a.d(this);
                }
                Unit unit = Unit.f14616a;
            } else if (task.f9411b) {
                if (c.f9421i.isLoggable(Level.FINE)) {
                    io.sentry.config.a.b(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (c.f9421i.isLoggable(Level.FINE)) {
                    io.sentry.config.a.b(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085 A[LOOP:0: B:23:0x0071->B:28:0x0085, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0089 A[EDGE_INSN: B:40:0x0089->B:30:0x0089 BREAK  A[LOOP:0: B:23:0x0071->B:28:0x0085], SYNTHETIC] */
    public final boolean e(a task, long j, boolean z5) {
        Iterator it;
        int size;
        String strStringPlus;
        Intrinsics.checkNotNullParameter(task, "task");
        task.getClass();
        Intrinsics.checkNotNullParameter(this, "queue");
        b bVar = task.f9412c;
        if (bVar != this) {
            if (bVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f9412c = this;
        }
        u4.c cVar = this.f9414a.f9422a;
        long jNanoTime = System.nanoTime();
        long j5 = jNanoTime + j;
        ArrayList arrayList = this.f9418e;
        int iIndexOf = arrayList.indexOf(task);
        if (iIndexOf == -1) {
            task.f9413d = j5;
            if (c.f9421i.isLoggable(Level.FINE)) {
                if (z5) {
                    strStringPlus = Intrinsics.stringPlus("run again after ", io.sentry.config.a.u(j5 - jNanoTime));
                } else {
                    strStringPlus = Intrinsics.stringPlus("scheduled after ", io.sentry.config.a.u(j5 - jNanoTime));
                }
                io.sentry.config.a.b(task, this, strStringPlus);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((a) it.next()).f9413d - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size == 0) {
                return true;
            }
        } else if (task.f9413d > j5) {
            arrayList.remove(iIndexOf);
            task.f9413d = j5;
            if (c.f9421i.isLoggable(Level.FINE)) {
                if (z5) {
                    strStringPlus = Intrinsics.stringPlus("run again after ", io.sentry.config.a.u(j5 - jNanoTime));
                } else {
                    strStringPlus = Intrinsics.stringPlus("scheduled after ", io.sentry.config.a.u(j5 - jNanoTime));
                }
                io.sentry.config.a.b(task, this, strStringPlus);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((a) it.next()).f9413d - jNanoTime > j) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size == 0) {
                return true;
            }
        } else if (c.f9421i.isLoggable(Level.FINE)) {
            io.sentry.config.a.b(task, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void f() {
        byte[] bArr = ds.b.f7815a;
        synchronized (this.f9414a) {
            try {
                this.f9416c = true;
                if (b()) {
                    this.f9414a.d(this);
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String toString() {
        return this.f9415b;
    }
}
