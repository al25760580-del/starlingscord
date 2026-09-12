package w3;

import a5.l0;
import android.content.Context;
import android.database.Cursor;
import androidx.appcompat.widget.b4;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.android.gms.internal.play_billing.u0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import v3.b0;
import v3.s;
import v3.z;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {
    public static final String O = v3.q.f("WorkerWrapper");
    public final s E;
    public final e F;
    public final WorkDatabase G;
    public final e4.p H;
    public final e4.c I;
    public final ArrayList J;
    public String K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f22056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22057e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e4.o f22058i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v3.p f22059v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h4.b f22060w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final v3.b f22062y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public v3.o f22061x = new v3.l();
    public final g4.j L = new g4.j();
    public final g4.j M = new g4.j();
    public volatile int N = -256;

    public r(b4 b4Var) {
        this.f22056d = (Context) b4Var.f909d;
        this.f22060w = (h4.b) b4Var.f911i;
        this.F = (e) b4Var.f910e;
        e4.o oVar = (e4.o) b4Var.f914x;
        this.f22058i = oVar;
        this.f22057e = oVar.f7998a;
        this.f22059v = null;
        v3.b bVar = (v3.b) b4Var.f912v;
        this.f22062y = bVar;
        this.E = bVar.f21381c;
        WorkDatabase workDatabase = (WorkDatabase) b4Var.f913w;
        this.G = workDatabase;
        this.H = workDatabase.t();
        this.I = workDatabase.f();
        this.J = (ArrayList) b4Var.f915y;
    }

    public final void a(v3.o oVar) {
        boolean z5 = oVar instanceof v3.n;
        e4.o oVar2 = this.f22058i;
        String str = O;
        if (!z5) {
            if (oVar instanceof v3.m) {
                v3.q.d().e(str, "Worker result RETRY for " + this.K);
                c();
                return;
            }
            v3.q.d().e(str, "Worker result FAILURE for " + this.K);
            if (oVar2.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        v3.q.d().e(str, "Worker result SUCCESS for " + this.K);
        if (oVar2.c()) {
            d();
            return;
        }
        e4.c cVar = this.I;
        String str2 = this.f22057e;
        e4.p pVar = this.H;
        WorkDatabase workDatabase = this.G;
        workDatabase.c();
        try {
            pVar.t(z.f21437i, str2);
            pVar.s(str2, ((v3.n) this.f22061x).f21412a);
            this.E.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str3 : cVar.H(str2)) {
                if (pVar.k(str3) == z.f21439w) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f7966e;
                    a3.o oVarG = a3.o.g(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        oVarG.R(1);
                    } else {
                        oVarG.o(1, str3);
                    }
                    workDatabase_Impl.b();
                    Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
                    try {
                        boolean z6 = cursorM.moveToFirst() && cursorM.getInt(0) != 0;
                        cursorM.close();
                        oVarG.i();
                        if (z6) {
                            v3.q.d().e(str, "Setting status to enqueued for " + str3);
                            pVar.t(z.f21435d, str3);
                            pVar.r(jCurrentTimeMillis, str3);
                        }
                    } catch (Throwable th2) {
                        cursorM.close();
                        oVarG.i();
                        throw th2;
                    }
                }
            }
            workDatabase.o();
            workDatabase.k();
            e(false);
        } catch (Throwable th3) {
            workDatabase.k();
            e(false);
            throw th3;
        }
    }

    public final void b() {
        if (h()) {
            return;
        }
        this.G.c();
        try {
            z zVarK = this.H.k(this.f22057e);
            e4.m mVarS = this.G.s();
            String str = this.f22057e;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) mVarS.f7993e;
            workDatabase_Impl.b();
            e4.h hVar = (e4.h) mVarS.f7994i;
            h3.j jVarA = hVar.a();
            if (str == null) {
                jVarA.R(1);
            } else {
                jVarA.o(1, str);
            }
            workDatabase_Impl.c();
            try {
                jVarA.c();
                workDatabase_Impl.o();
                workDatabase_Impl.k();
                hVar.e(jVarA);
                if (zVarK == null) {
                    e(false);
                } else if (zVarK == z.f21436e) {
                    a(this.f22061x);
                } else if (!zVarK.a()) {
                    this.N = -512;
                    c();
                }
                this.G.o();
                this.G.k();
            } catch (Throwable th2) {
                workDatabase_Impl.k();
                hVar.e(jVarA);
                throw th2;
            }
        } catch (Throwable th3) {
            this.G.k();
            throw th3;
        }
    }

    public final void c() {
        String str = this.f22057e;
        e4.p pVar = this.H;
        WorkDatabase workDatabase = this.G;
        workDatabase.c();
        try {
            pVar.t(z.f21435d, str);
            this.E.getClass();
            pVar.r(System.currentTimeMillis(), str);
            pVar.q(this.f22058i.f8017v, str);
            pVar.p(-1L, str);
            workDatabase.o();
        } finally {
            workDatabase.k();
            e(true);
        }
    }

    public final void d() {
        String str = this.f22057e;
        e4.p pVar = this.H;
        WorkDatabase workDatabase = this.G;
        workDatabase.c();
        try {
            this.E.getClass();
            pVar.r(System.currentTimeMillis(), str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) pVar.f8019a;
            pVar.t(z.f21435d, str);
            workDatabase_Impl.b();
            e4.h hVar = (e4.h) pVar.j;
            h3.j jVarA = hVar.a();
            if (str == null) {
                jVarA.R(1);
            } else {
                jVarA.o(1, str);
            }
            workDatabase_Impl.c();
            try {
                jVarA.c();
                workDatabase_Impl.o();
                workDatabase_Impl.k();
                hVar.e(jVarA);
                pVar.q(this.f22058i.f8017v, str);
                workDatabase_Impl.b();
                e4.h hVar2 = (e4.h) pVar.f8024f;
                h3.j jVarA2 = hVar2.a();
                if (str == null) {
                    jVarA2.R(1);
                } else {
                    jVarA2.o(1, str);
                }
                workDatabase_Impl.c();
                try {
                    jVarA2.c();
                    workDatabase_Impl.o();
                    workDatabase_Impl.k();
                    hVar2.e(jVarA2);
                    pVar.p(-1L, str);
                    workDatabase.o();
                    workDatabase.k();
                    e(false);
                } catch (Throwable th2) {
                    workDatabase_Impl.k();
                    hVar2.e(jVarA2);
                    throw th2;
                }
            } catch (Throwable th3) {
                workDatabase_Impl.k();
                hVar.e(jVarA);
                throw th3;
            }
        } catch (Throwable th4) {
            workDatabase.k();
            e(false);
            throw th4;
        }
    }

    public final void e(boolean z5) {
        this.G.c();
        try {
            e4.p pVarT = this.G.t();
            pVarT.getClass();
            a3.o oVarG = a3.o.g(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) pVarT.f8019a;
            workDatabase_Impl.b();
            Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
            try {
                boolean z6 = cursorM.moveToFirst() && cursorM.getInt(0) != 0;
                cursorM.close();
                oVarG.i();
                if (!z6) {
                    f4.j.a(this.f22056d, RescheduleReceiver.class, false);
                }
                if (z5) {
                    this.H.t(z.f21435d, this.f22057e);
                    this.H.u(this.N, this.f22057e);
                    this.H.p(-1L, this.f22057e);
                }
                this.G.o();
                this.G.k();
                this.L.j(Boolean.valueOf(z5));
            } catch (Throwable th2) {
                cursorM.close();
                oVarG.i();
                throw th2;
            }
        } catch (Throwable th3) {
            this.G.k();
            throw th3;
        }
    }

    public final void f() {
        e4.p pVar = this.H;
        String str = this.f22057e;
        z zVarK = pVar.k(str);
        z zVar = z.f21436e;
        String str2 = O;
        if (zVarK == zVar) {
            v3.q.d().a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        v3.q.d().a(str2, "Status for " + str + " is " + zVarK + " ; not doing any work");
        e(false);
    }

    public final void g() {
        String str = this.f22057e;
        WorkDatabase workDatabase = this.G;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean zIsEmpty = linkedList.isEmpty();
                e4.p pVar = this.H;
                if (zIsEmpty) {
                    v3.g gVar = ((v3.l) this.f22061x).f21411a;
                    pVar.q(this.f22058i.f8017v, str);
                    pVar.s(str, gVar);
                    workDatabase.o();
                    return;
                }
                String str2 = (String) linkedList.remove();
                if (pVar.k(str2) != z.f21440x) {
                    pVar.t(z.f21438v, str2);
                }
                linkedList.addAll(this.I.H(str2));
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    public final boolean h() {
        if (this.N == -256) {
            return false;
        }
        v3.q.d().a(O, "Work interrupted for " + this.K);
        z zVarK = this.H.k(this.f22057e);
        if (zVarK == null) {
            e(false);
        } else {
            e(!zVarK.a());
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0094 A[Catch: all -> 0x007e, TryCatch #4 {all -> 0x007e, blocks: (B:14:0x0050, B:17:0x005c, B:22:0x0081, B:24:0x0087, B:26:0x008b, B:36:0x00c7, B:31:0x0094, B:33:0x00a5), top: B:111:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5 A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #4 {all -> 0x007e, blocks: (B:14:0x0050, B:17:0x005c, B:22:0x0081, B:24:0x0087, B:26:0x008b, B:36:0x00c7, B:31:0x0094, B:33:0x00a5), top: B:111:0x0050 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00a5, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        v3.i iVar;
        v3.g gVarA;
        boolean z5;
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        String str = this.f22057e;
        sb2.append(str);
        sb2.append(", tags={ ");
        ArrayList<String> arrayList = this.J;
        boolean z6 = true;
        for (String str2 : arrayList) {
            if (z6) {
                z6 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str2);
        }
        sb2.append(" } ]");
        this.K = sb2.toString();
        e4.o oVar = this.f22058i;
        if (h()) {
            return;
        }
        WorkDatabase workDatabase = this.G;
        workDatabase.c();
        try {
            z zVar = oVar.f7999b;
            String className = oVar.f8001d;
            String str3 = oVar.f8000c;
            z zVar2 = z.f21435d;
            String str4 = O;
            if (zVar != zVar2) {
                f();
                workDatabase.o();
                v3.q.d().a(str4, str3 + " is not in ENQUEUED state. Nothing more to do");
                workDatabase.k();
                return;
            }
            if (oVar.c()) {
                this.E.getClass();
                if (System.currentTimeMillis() < oVar.a()) {
                    v3.q.d().a(str4, "Delaying execution for " + str3 + " because it is being executed before schedule.");
                    e(true);
                    workDatabase.o();
                    workDatabase.k();
                    return;
                }
            } else if (oVar.f7999b == zVar2 && oVar.k > 0) {
                this.E.getClass();
                if (System.currentTimeMillis() < oVar.a()) {
                    v3.q.d().a(str4, "Delaying execution for " + str3 + " because it is being executed before schedule.");
                    e(true);
                    workDatabase.o();
                    workDatabase.k();
                    return;
                }
            }
            workDatabase.o();
            workDatabase.k();
            boolean zC = oVar.c();
            e4.p pVar = this.H;
            v3.b bVar = this.f22062y;
            if (zC) {
                gVarA = oVar.f8002e;
            } else {
                bVar.f21383e.getClass();
                Intrinsics.checkNotNullParameter(className, "className");
                Intrinsics.checkNotNullParameter(className, "className");
                String str5 = v3.j.f21409a;
                Intrinsics.checkNotNullParameter(className, "className");
                try {
                    Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
                    Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
                    iVar = (v3.i) objNewInstance;
                } catch (Exception e10) {
                    v3.q.d().c(v3.j.f21409a, "Trouble instantiating ".concat(className), e10);
                    iVar = null;
                }
                if (iVar == null) {
                    v3.q.d().b(str4, "Could not create Input Merger " + className);
                    g();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(oVar.f8002e);
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) pVar.f8019a;
                a3.o oVarG = a3.o.g(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                if (str == null) {
                    oVarG.R(1);
                } else {
                    oVarG.o(1, str);
                }
                workDatabase_Impl.b();
                Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
                try {
                    ArrayList arrayList3 = new ArrayList(cursorM.getCount());
                    while (cursorM.moveToNext()) {
                        arrayList3.add(v3.g.a(cursorM.isNull(0) ? null : cursorM.getBlob(0)));
                    }
                    cursorM.close();
                    oVarG.i();
                    arrayList2.addAll(arrayList3);
                    gVarA = iVar.a(arrayList2);
                } catch (Throwable th2) {
                    cursorM.close();
                    oVarG.i();
                    throw th2;
                }
            }
            UUID uuidFromString = UUID.fromString(str);
            ExecutorService executorService = bVar.f21379a;
            b0 b0Var = bVar.f21382d;
            e eVar = this.F;
            h4.b bVar2 = this.f22060w;
            f4.s sVar = new f4.s(workDatabase, eVar, bVar2);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.f2813a = uuidFromString;
            workerParameters.f2814b = gVarA;
            new HashSet(arrayList);
            workerParameters.f2815c = executorService;
            workerParameters.f2816d = bVar2;
            workerParameters.f2817e = b0Var;
            if (this.f22059v == null) {
                b0Var.getClass();
                this.f22059v = b0.a(this.f22056d, str3, workerParameters);
            }
            v3.p pVar2 = this.f22059v;
            if (pVar2 == null) {
                v3.q.d().b(str4, "Could not create Worker " + str3);
                g();
                return;
            }
            if (pVar2.f21416v) {
                v3.q.d().b(str4, "Received an already-used Worker " + str3 + "; Worker Factory should return new instances");
                g();
                return;
            }
            pVar2.f21416v = true;
            workDatabase.c();
            try {
                if (pVar.k(str) == zVar2) {
                    pVar.t(z.f21436e, str);
                    WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) pVar.f8019a;
                    workDatabase_Impl2.b();
                    e4.h hVar = (e4.h) pVar.f8027i;
                    h3.j jVarA = hVar.a();
                    if (str == null) {
                        z5 = true;
                        jVarA.R(1);
                    } else {
                        z5 = true;
                        jVarA.o(1, str);
                    }
                    workDatabase_Impl2.c();
                    try {
                        jVarA.c();
                        workDatabase_Impl2.o();
                        workDatabase_Impl2.k();
                        hVar.e(jVarA);
                        pVar.u(-256, str);
                    } catch (Throwable th3) {
                        workDatabase_Impl2.k();
                        hVar.e(jVarA);
                        throw th3;
                    }
                } else {
                    z5 = false;
                }
                workDatabase.o();
                workDatabase.k();
                if (!z5) {
                    f();
                    return;
                }
                if (h()) {
                    return;
                }
                f4.q qVar = new f4.q(this.f22056d, this.f22058i, this.f22059v, sVar, this.f22060w);
                bVar2.f10330d.execute(qVar);
                g4.j jVar = qVar.f8851d;
                io.sentry.react.d dVar = new io.sentry.react.d(28, this, jVar);
                boolean z7 = false;
                f4.n nVar = new f4.n(0);
                g4.j jVar2 = this.M;
                jVar2.a(dVar, nVar);
                jVar.a(new hi.o(this, jVar, 21, z7), bVar2.f10330d);
                jVar2.a(new u0(this, this.K, 22, z7), bVar2.f10327a);
            } catch (Throwable th4) {
                workDatabase.k();
                throw th4;
            }
        } catch (Throwable th5) {
            workDatabase.k();
            throw th5;
        }
    }
}
