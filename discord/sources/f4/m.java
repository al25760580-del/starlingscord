package f4;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w3.e f8842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w3.j f8843e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f8844i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8845v;

    public m(w3.e processor, w3.j token, boolean z5, int i7) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f8842d = processor;
        this.f8843e = token;
        this.f8844i = z5;
        this.f8845v = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zD;
        w3.r rVarB;
        if (this.f8844i) {
            w3.e eVar = this.f8842d;
            w3.j jVar = this.f8843e;
            int i7 = this.f8845v;
            eVar.getClass();
            String str = jVar.f22032a.f7984a;
            synchronized (eVar.k) {
                rVarB = eVar.b(str);
            }
            zD = w3.e.d(str, rVarB, i7);
        } else {
            w3.e eVar2 = this.f8842d;
            w3.j jVar2 = this.f8843e;
            int i10 = this.f8845v;
            eVar2.getClass();
            String str2 = jVar2.f22032a.f7984a;
            synchronized (eVar2.k) {
                try {
                    if (eVar2.f22021f.get(str2) != null) {
                        v3.q.d().a(w3.e.f22015l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) eVar2.f22023h.get(str2);
                        if (set != null && set.contains(jVar2)) {
                            zD = w3.e.d(str2, eVar2.b(str2), i10);
                        }
                    }
                    zD = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        v3.q.d().a(v3.q.f("StopWorkRunnable"), "StopWorkRunnable for " + this.f8843e.f22032a.f7984a + "; Processor.stopWork = " + zD);
    }
}
