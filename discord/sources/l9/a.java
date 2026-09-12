package l9;

import a3.h;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m9.a f14982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u8.a f14983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f14984c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m9.a f14987f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14985d = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f14988g = new h(27, this);

    public a(m9.a aVar, m9.a aVar2, u8.a aVar3, ScheduledExecutorService scheduledExecutorService) {
        this.f14982a = aVar;
        this.f14987f = aVar2;
        this.f14983b = aVar3;
        this.f14984c = scheduledExecutorService;
    }

    public final int a() {
        m9.a aVar = this.f14982a;
        Intrinsics.checkNotNull(aVar);
        return aVar.f15472c.h();
    }

    public final int b(int i7) {
        m9.a aVar = this.f14982a;
        Intrinsics.checkNotNull(aVar);
        return ((ca.a) aVar.f15472c.f18027e).f3551e[i7];
    }

    public final int c() {
        m9.a aVar = this.f14982a;
        Intrinsics.checkNotNull(aVar);
        return aVar.f15472c.l();
    }

    public final synchronized void d() {
        if (!this.f14985d) {
            this.f14985d = true;
            this.f14984c.schedule(this.f14988g, 1000L, TimeUnit.MILLISECONDS);
        }
    }
}
