package hc;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import gc.v1;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final md.s f10481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f10484g;

    public v(w wVar, String str, int i7, md.s sVar) {
        this.f10484g = wVar;
        this.f10478a = str;
        this.f10479b = i7;
        this.f10480c = sVar == null ? -1L : sVar.f15692d;
        if (sVar == null || !sVar.a()) {
            return;
        }
        this.f10481d = sVar;
    }

    public final boolean a(int i7, md.s sVar) {
        if (sVar == null) {
            return i7 == this.f10479b;
        }
        long j = sVar.f15692d;
        md.s sVar2 = this.f10481d;
        if (sVar2 == null) {
            return !sVar.a() && j == this.f10480c;
        }
        return j == sVar2.f15692d && sVar.f15690b == sVar2.f15690b && sVar.f15691c == sVar2.f15691c;
    }

    public final boolean b(AnalyticsListener$EventTime analyticsListener$EventTime) {
        md.s sVar = analyticsListener$EventTime.f5595d;
        Timeline timeline = analyticsListener$EventTime.f5593b;
        if (sVar == null) {
            return this.f10479b != analyticsListener$EventTime.f5594c;
        }
        long j = this.f10480c;
        if (j == -1) {
            return false;
        }
        if (sVar.f15692d > j) {
            return true;
        }
        md.s sVar2 = this.f10481d;
        if (sVar2 == null) {
            return false;
        }
        int i7 = sVar2.f15690b;
        int iB = timeline.b(sVar.f15689a);
        int iB2 = timeline.b(sVar2.f15689a);
        if (sVar.f15692d < sVar2.f15692d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!sVar.a()) {
            int i10 = sVar.f15693e;
            return i10 == -1 || i10 > i7;
        }
        int i11 = sVar.f15690b;
        int i12 = sVar.f15691c;
        if (i11 <= i7) {
            return i11 == i7 && i12 > sVar2.f15691c;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    public final void c(int i7, md.s sVar) {
        long j;
        if (this.f10480c == -1 && i7 == this.f10479b && sVar != null) {
            long j5 = sVar.f15692d;
            w wVar = this.f10484g;
            v vVar = (v) wVar.f10489c.get(wVar.f10492f);
            if (vVar != null) {
                j = vVar.f10480c;
                if (j == -1) {
                    j = wVar.f10493g + 1;
                }
            } else {
                j = wVar.f10493g + 1;
            }
            if (j5 >= j) {
                this.f10480c = j5;
            }
        }
    }

    public final boolean d(Timeline timeline, Timeline timeline2) {
        md.s sVar;
        int i7 = this.f10479b;
        if (i7 < timeline.o()) {
            w wVar = this.f10484g;
            v1 v1Var = wVar.f10487a;
            timeline.n(i7, v1Var);
            int i10 = v1Var.L;
            while (true) {
                if (i10 > v1Var.M) {
                    i7 = -1;
                    break;
                }
                int iB = timeline2.b(timeline.l(i10));
                if (iB != -1) {
                    i7 = timeline2.f(iB, wVar.f10488b, false).f9888i;
                    break;
                }
                i10++;
            }
        } else if (i7 >= timeline2.o()) {
            i7 = -1;
            break;
        }
        this.f10479b = i7;
        return i7 != -1 && ((sVar = this.f10481d) == null || timeline2.b(sVar.f15689a) != -1);
    }
}
