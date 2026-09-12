package f4;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.play_billing.u0;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f8850y = v3.q.f("WorkForegroundRunnable");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g4.j f8851d = new g4.j();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f8852e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e4.o f8853i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v3.p f8854v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s f8855w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h4.b f8856x;

    public q(Context context, e4.o oVar, v3.p pVar, s sVar, h4.b bVar) {
        this.f8852e = context;
        this.f8853i = oVar;
        this.f8854v = pVar;
        this.f8855w = sVar;
        this.f8856x = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f8853i.f8012q || Build.VERSION.SDK_INT >= 31) {
            this.f8851d.j(null);
            return;
        }
        g4.j jVar = new g4.j();
        h4.b bVar = this.f8856x;
        bVar.f10330d.execute(new com.mkuczera.haptic.a(5, this, jVar));
        jVar.a(new u0(this, jVar, 9, false), bVar.f10330d);
    }
}
