package he;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements g, u0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ei.r0 f10680n = ei.e0.p(4400000L, 3200000L, 2300000L, 1600000L, 810000L);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ei.r0 f10681o = ei.e0.p(1400000L, 990000L, 730000L, 510000L, 230000L);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ei.r0 f10682p = ei.e0.p(2100000L, 1400000L, 1000000L, 890000L, 640000L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ei.r0 f10683q = ei.e0.p(2600000L, 1700000L, 1300000L, 1000000L, 700000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ei.r0 f10684r = ei.e0.p(5700000L, 3700000L, 2300000L, 1700000L, 990000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ei.r0 f10685s = ei.e0.p(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static s f10686t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei.w0 f10687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue.i f10688b = new ue.i(12, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f10689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final je.y f10690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10695i;
    public long j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f10696l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10697m;

    public s(Context context, HashMap map, int i7, je.y yVar, boolean z5) {
        this.f10687a = ei.w0.a(map);
        this.f10689c = new r0(i7);
        this.f10690d = yVar;
        this.f10691e = z5;
        if (context == null) {
            this.f10695i = 0;
            this.f10696l = a(0);
            return;
        }
        je.u uVarC = je.u.c(context);
        int iD = uVarC.d();
        this.f10695i = iD;
        this.f10696l = a(iD);
        r rVar = new r(this);
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = (CopyOnWriteArrayList) uVarC.f13850c;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(rVar));
        ((Handler) uVarC.f13849b).post(new io.sentry.react.d(2, uVarC, rVar));
    }

    public final long a(int i7) {
        Integer numValueOf = Integer.valueOf(i7);
        ei.w0 w0Var = this.f10687a;
        Long l6 = (Long) w0Var.get(numValueOf);
        if (l6 == null) {
            l6 = (Long) w0Var.get(0);
        }
        if (l6 == null) {
            l6 = 1000000L;
        }
        return l6.longValue();
    }

    public final void b(int i7, long j, long j5) {
        int i10;
        long j7;
        long j10;
        if (i7 == 0 && j == 0 && j5 == this.f10697m) {
            return;
        }
        this.f10697m = j5;
        for (e eVar : (CopyOnWriteArrayList) this.f10688b.f21117d) {
            if (eVar.f10601c) {
                i10 = i7;
                j7 = j;
                j10 = j5;
            } else {
                i10 = i7;
                j7 = j;
                j10 = j5;
                eVar.f10599a.post(new d(eVar, i10, j7, j10, 0));
            }
            i7 = i10;
            j = j7;
            j5 = j10;
        }
    }
}
