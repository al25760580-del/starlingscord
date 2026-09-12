package f4;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g4.j f8857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UUID f8858e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v3.h f8859i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f8860v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f8861w;

    public r(s sVar, g4.j jVar, UUID uuid, v3.h hVar, Context context) {
        this.f8861w = sVar;
        this.f8857d = jVar;
        this.f8858e = uuid;
        this.f8859i = hVar;
        this.f8860v = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f8857d.f9490d instanceof g4.a)) {
                String string = this.f8858e.toString();
                e4.o oVarN = this.f8861w.f8864c.n(string);
                if (oVarN == null || oVarN.f7999b.a()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((w3.e) this.f8861w.f8863b).f(string, this.f8859i);
                this.f8860v.startService(d4.b.a(this.f8860v, a.a.h(oVarN), this.f8859i));
            }
            this.f8857d.j(null);
        } catch (Throwable th2) {
            this.f8857d.k(th2);
        }
    }
}
