package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kk.b;
import kotlin.jvm.internal.Intrinsics;
import rs.t;

/* JADX INFO: loaded from: classes.dex */
public class Timeout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f17418d = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17421c;

    public Timeout a() {
        this.f17419a = false;
        return this;
    }

    public Timeout b() {
        this.f17421c = 0L;
        return this;
    }

    public long c() {
        if (this.f17419a) {
            return this.f17420b;
        }
        throw new IllegalStateException("No deadline");
    }

    public Timeout d(long j) {
        this.f17419a = true;
        this.f17420b = j;
        return this;
    }

    public boolean e() {
        return this.f17419a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f17419a && this.f17420b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public Timeout g(long j, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(b.i(j, "timeout < 0: ").toString());
        }
        this.f17421c = unit.toNanos(j);
        return this;
    }

    public long h() {
        return this.f17421c;
    }
}
