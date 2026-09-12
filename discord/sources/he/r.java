package he;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f10670a;

    public final void a(int i7) {
        s sVar = this.f10670a;
        synchronized (sVar) {
            int i10 = sVar.f10695i;
            if (i10 == 0 || sVar.f10691e) {
                if (i10 == i7) {
                    return;
                }
                sVar.f10695i = i7;
                if (i7 != 1 && i7 != 0 && i7 != 8) {
                    sVar.f10696l = sVar.a(i7);
                    sVar.f10690d.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    sVar.b(sVar.f10692f > 0 ? (int) (jElapsedRealtime - sVar.f10693g) : 0, sVar.f10694h, sVar.f10696l);
                    sVar.f10693g = jElapsedRealtime;
                    sVar.f10694h = 0L;
                    sVar.k = 0L;
                    sVar.j = 0L;
                    r0 r0Var = sVar.f10689c;
                    r0Var.f10674b.clear();
                    r0Var.f10676d = -1;
                    r0Var.f10677e = 0;
                    r0Var.f10678f = 0;
                }
            }
        }
    }
}
