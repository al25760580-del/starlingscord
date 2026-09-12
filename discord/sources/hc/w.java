package hc;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import gc.u1;
import gc.v1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import je.e0;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final gb.a f10485h = new gb.a(27);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Random f10486i = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10490d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f10492f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f10487a = new v1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f10488b = new u1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f10489c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Timeline f10491e = Timeline.f5588d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10493g = -1;

    public final synchronized boolean a(AnalyticsListener$EventTime analyticsListener$EventTime, String str) {
        v vVar = (v) this.f10489c.get(str);
        if (vVar == null) {
            return false;
        }
        vVar.c(analyticsListener$EventTime.f5594c, analyticsListener$EventTime.f5595d);
        return vVar.a(analyticsListener$EventTime.f5594c, analyticsListener$EventTime.f5595d);
    }

    public final void b(v vVar) {
        long j = vVar.f10480c;
        if (j != -1) {
            this.f10493g = j;
        }
        this.f10492f = null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [hc.y, java.lang.Object] */
    public final synchronized void c(AnalyticsListener$EventTime analyticsListener$EventTime) {
        ?? r5;
        try {
            String str = this.f10492f;
            if (str != null) {
                v vVar = (v) this.f10489c.get(str);
                vVar.getClass();
                b(vVar);
            }
            Iterator it = this.f10489c.values().iterator();
            while (it.hasNext()) {
                v vVar2 = (v) it.next();
                it.remove();
                if (vVar2.f10482e && (r5 = this.f10490d) != 0) {
                    r5.b(analyticsListener$EventTime, vVar2.f10478a, false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final v d(int i7, md.s sVar) {
        HashMap map = this.f10489c;
        v vVar = null;
        long j = LongCompanionObject.MAX_VALUE;
        for (v vVar2 : map.values()) {
            vVar2.c(i7, sVar);
            if (vVar2.a(i7, sVar)) {
                long j5 = vVar2.f10480c;
                if (j5 == -1 || j5 < j) {
                    vVar = vVar2;
                    j = j5;
                } else if (j5 == j) {
                    int i10 = e0.f13788a;
                    if (vVar.f10481d != null && vVar2.f10481d != null) {
                        vVar = vVar2;
                    }
                }
            }
        }
        if (vVar != null) {
            return vVar;
        }
        String str = (String) f10485h.get();
        v vVar3 = new v(this, str, i7, sVar);
        map.put(str, vVar3);
        return vVar3;
    }

    public final synchronized String e(Timeline timeline, md.s sVar) {
        return d(timeline.g(sVar.f15689a, this.f10488b).f9888i, sVar).f10478a;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [hc.y, java.lang.Object] */
    public final void f(AnalyticsListener$EventTime analyticsListener$EventTime) {
        md.s sVar;
        Timeline timeline = analyticsListener$EventTime.f5593b;
        int i7 = analyticsListener$EventTime.f5594c;
        md.s sVar2 = analyticsListener$EventTime.f5595d;
        boolean zP = timeline.p();
        HashMap map = this.f10489c;
        if (zP) {
            String str = this.f10492f;
            if (str != null) {
                v vVar = (v) map.get(str);
                vVar.getClass();
                b(vVar);
                return;
            }
            return;
        }
        v vVar2 = (v) map.get(this.f10492f);
        this.f10492f = d(i7, sVar2).f10478a;
        g(analyticsListener$EventTime);
        if (sVar2 != null) {
            long j = sVar2.f15692d;
            if (sVar2.a()) {
                if (vVar2 != null && vVar2.f10480c == j && (sVar = vVar2.f10481d) != null && sVar.f15690b == sVar2.f15690b && sVar.f15691c == sVar2.f15691c) {
                    return;
                }
                this.f10490d.a(d(i7, new md.s(j, sVar2.f15689a)).f10478a);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x0014, B:10:0x0018, B:12:0x0028, B:21:0x003a, B:23:0x0046, B:25:0x004c, B:15:0x002f, B:31:0x0057, B:33:0x0063, B:34:0x0067, B:36:0x006c, B:38:0x0072, B:40:0x0089, B:41:0x00db, B:43:0x00df, B:44:0x00e9, B:46:0x00f3, B:48:0x00f7), top: B:53:0x0005 }] */
    /* JADX WARN: Type inference failed for: r3v10, types: [hc.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [hc.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [hc.y, java.lang.Object] */
    public final synchronized void g(AnalyticsListener$EventTime analyticsListener$EventTime) {
        long j;
        this.f10490d.getClass();
        if (analyticsListener$EventTime.f5593b.p()) {
            return;
        }
        md.s sVar = analyticsListener$EventTime.f5595d;
        if (sVar != null) {
            long j5 = sVar.f15692d;
            v vVar = (v) this.f10489c.get(this.f10492f);
            if (vVar != null) {
                j = vVar.f10480c;
                if (j == -1) {
                    j = this.f10493g + 1;
                }
            } else {
                j = this.f10493g + 1;
            }
            if (j5 < j) {
                return;
            }
            v vVar2 = (v) this.f10489c.get(this.f10492f);
            if (vVar2 != null && vVar2.f10480c == -1 && vVar2.f10479b != analyticsListener$EventTime.f5594c) {
                return;
            }
        }
        v vVarD = d(analyticsListener$EventTime.f5594c, analyticsListener$EventTime.f5595d);
        if (this.f10492f == null) {
            this.f10492f = vVarD.f10478a;
        }
        md.s sVar2 = analyticsListener$EventTime.f5595d;
        if (sVar2 != null && sVar2.a()) {
            md.s sVar3 = analyticsListener$EventTime.f5595d;
            md.s sVar4 = new md.s(sVar3.f15689a, sVar3.f15692d, sVar3.f15690b);
            v vVarD2 = d(analyticsListener$EventTime.f5594c, sVar4);
            if (!vVarD2.f10482e) {
                vVarD2.f10482e = true;
                analyticsListener$EventTime.f5593b.g(analyticsListener$EventTime.f5595d.f15689a, this.f10488b);
                this.f10490d.d(new AnalyticsListener$EventTime(analyticsListener$EventTime.f5592a, analyticsListener$EventTime.f5593b, analyticsListener$EventTime.f5594c, sVar4, Math.max(0L, e0.U(this.f10488b.d(analyticsListener$EventTime.f5595d.f15690b)) + e0.U(this.f10488b.f9890w)), analyticsListener$EventTime.f5597f, analyticsListener$EventTime.f5598g, analyticsListener$EventTime.f5599h, analyticsListener$EventTime.f5600i, analyticsListener$EventTime.j), vVarD2.f10478a);
            }
        }
        if (!vVarD.f10482e) {
            vVarD.f10482e = true;
            this.f10490d.d(analyticsListener$EventTime, vVarD.f10478a);
        }
        if (vVarD.f10478a.equals(this.f10492f) && !vVarD.f10483f) {
            vVarD.f10483f = true;
            this.f10490d.c(analyticsListener$EventTime, vVarD.f10478a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [hc.y, java.lang.Object] */
    public final synchronized void h(AnalyticsListener$EventTime analyticsListener$EventTime, int i7) {
        try {
            this.f10490d.getClass();
            boolean z5 = i7 == 0;
            Iterator it = this.f10489c.values().iterator();
            while (it.hasNext()) {
                v vVar = (v) it.next();
                if (vVar.b(analyticsListener$EventTime)) {
                    it.remove();
                    if (vVar.f10482e) {
                        boolean zEquals = vVar.f10478a.equals(this.f10492f);
                        boolean z6 = z5 && zEquals && vVar.f10483f;
                        if (zEquals) {
                            b(vVar);
                        }
                        this.f10490d.b(analyticsListener$EventTime, vVar.f10478a, z6);
                    }
                }
            }
            f(analyticsListener$EventTime);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [hc.y, java.lang.Object] */
    public final synchronized void i(AnalyticsListener$EventTime analyticsListener$EventTime) {
        try {
            this.f10490d.getClass();
            Timeline timeline = this.f10491e;
            this.f10491e = analyticsListener$EventTime.f5593b;
            Iterator it = this.f10489c.values().iterator();
            while (it.hasNext()) {
                v vVar = (v) it.next();
                if (!vVar.d(timeline, this.f10491e) || vVar.b(analyticsListener$EventTime)) {
                    it.remove();
                    if (vVar.f10482e) {
                        if (vVar.f10478a.equals(this.f10492f)) {
                            b(vVar);
                        }
                        this.f10490d.b(analyticsListener$EventTime, vVar.f10478a, false);
                    }
                }
            }
            f(analyticsListener$EventTime);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
