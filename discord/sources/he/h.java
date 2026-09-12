package he;

import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements DataSource {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f10612e = new ArrayList(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10613i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p f10614v;

    public h(boolean z5) {
        this.f10611d = z5;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void B(u0 u0Var) {
        u0Var.getClass();
        ArrayList arrayList = this.f10612e;
        if (arrayList.contains(u0Var)) {
            return;
        }
        arrayList.add(u0Var);
        this.f10613i++;
    }

    public final void b(int i7) {
        p pVar = this.f10614v;
        int i10 = je.e0.f13788a;
        for (int i11 = 0; i11 < this.f10613i; i11++) {
            u0 u0Var = (u0) this.f10612e.get(i11);
            boolean z5 = this.f10611d;
            s sVar = (s) u0Var;
            synchronized (sVar) {
                ei.r0 r0Var = s.f10680n;
                if (z5 && (pVar.f10657i & 8) != 8) {
                    sVar.f10694h += (long) i7;
                }
            }
        }
    }

    public final void c() {
        p pVar = this.f10614v;
        int i7 = je.e0.f13788a;
        for (int i10 = 0; i10 < this.f10613i; i10++) {
            u0 u0Var = (u0) this.f10612e.get(i10);
            boolean z5 = this.f10611d;
            s sVar = (s) u0Var;
            synchronized (sVar) {
                try {
                    ei.r0 r0Var = s.f10680n;
                    if (z5 && (pVar.f10657i & 8) != 8) {
                        je.b.k(sVar.f10692f > 0);
                        sVar.f10690d.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i11 = (int) (jElapsedRealtime - sVar.f10693g);
                        sVar.j += (long) i11;
                        long j = sVar.k;
                        long j5 = sVar.f10694h;
                        sVar.k = j + j5;
                        if (i11 > 0) {
                            sVar.f10689c.a((j5 * 8000.0f) / i11, (int) Math.sqrt(j5));
                            if (sVar.j >= 2000 || sVar.k >= 524288) {
                                sVar.f10696l = (long) sVar.f10689c.b();
                            }
                            sVar.b(i11, sVar.f10694h, sVar.f10696l);
                            sVar.f10693g = jElapsedRealtime;
                            sVar.f10694h = 0L;
                        }
                        sVar.f10692f--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f10614v = null;
    }

    public final void e() {
        for (int i7 = 0; i7 < this.f10613i; i7++) {
            ((u0) this.f10612e.get(i7)).getClass();
        }
    }

    public final void f(p pVar) {
        this.f10614v = pVar;
        for (int i7 = 0; i7 < this.f10613i; i7++) {
            u0 u0Var = (u0) this.f10612e.get(i7);
            boolean z5 = this.f10611d;
            s sVar = (s) u0Var;
            synchronized (sVar) {
                try {
                    ei.r0 r0Var = s.f10680n;
                    if (z5 && (pVar.f10657i & 8) != 8) {
                        if (sVar.f10692f == 0) {
                            sVar.f10690d.getClass();
                            sVar.f10693g = SystemClock.elapsedRealtime();
                        }
                        sVar.f10692f++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
