package okio;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mf.e;

/* JADX INFO: loaded from: classes.dex */
public class a extends Timeout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f17422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f17423i;
    public static a j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f17425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17426g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f17422h = millis;
        f17423i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void i() {
        long j5 = this.f17421c;
        boolean z5 = this.f17419a;
        if (j5 != 0 || z5) {
            synchronized (a.class) {
                try {
                    if (this.f17424e) {
                        throw new IllegalStateException("Unbalanced enter/exit");
                    }
                    this.f17424e = true;
                    if (j == null) {
                        j = new a();
                        e eVar = new e("Okio Watchdog");
                        eVar.setDaemon(true);
                        eVar.start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (j5 != 0 && z5) {
                        this.f17426g = Math.min(j5, c() - jNanoTime) + jNanoTime;
                    } else if (j5 != 0) {
                        this.f17426g = j5 + jNanoTime;
                    } else {
                        if (!z5) {
                            throw new AssertionError();
                        }
                        this.f17426g = c();
                    }
                    long j7 = this.f17426g - jNanoTime;
                    a aVar = j;
                    Intrinsics.checkNotNull(aVar);
                    while (true) {
                        a aVar2 = aVar.f17425f;
                        if (aVar2 == null) {
                            break;
                        }
                        Intrinsics.checkNotNull(aVar2);
                        if (j7 < aVar2.f17426g - jNanoTime) {
                            break;
                        }
                        aVar = aVar.f17425f;
                        Intrinsics.checkNotNull(aVar);
                    }
                    this.f17425f = aVar.f17425f;
                    aVar.f17425f = this;
                    if (aVar == j) {
                        a.class.notify();
                    }
                    Unit unit = Unit.f14616a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final boolean j() {
        synchronized (a.class) {
            if (!this.f17424e) {
                return false;
            }
            this.f17424e = false;
            a aVar = j;
            while (aVar != null) {
                a aVar2 = aVar.f17425f;
                if (aVar2 == this) {
                    aVar.f17425f = this.f17425f;
                    this.f17425f = null;
                    return false;
                }
                aVar = aVar2;
            }
            return true;
        }
    }

    public void k() {
    }
}
