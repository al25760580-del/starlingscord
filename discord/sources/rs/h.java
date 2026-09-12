package rs;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Timeout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Timeout f19569e;

    public h(Timeout delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f19569e = delegate;
    }

    @Override // okio.Timeout
    public final Timeout a() {
        return this.f19569e.a();
    }

    @Override // okio.Timeout
    public final Timeout b() {
        return this.f19569e.b();
    }

    @Override // okio.Timeout
    public final long c() {
        return this.f19569e.c();
    }

    @Override // okio.Timeout
    public final Timeout d(long j) {
        return this.f19569e.d(j);
    }

    @Override // okio.Timeout
    public final boolean e() {
        return this.f19569e.e();
    }

    @Override // okio.Timeout
    public final void f() throws InterruptedIOException {
        this.f19569e.f();
    }

    @Override // okio.Timeout
    public final Timeout g(long j, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f19569e.g(j, unit);
    }

    @Override // okio.Timeout
    public final long h() {
        return this.f19569e.h();
    }
}
