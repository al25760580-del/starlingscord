package w3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v3.a0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends a0 {
    public static o k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static o f22044l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f22045m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v3.b f22047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkDatabase f22048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h4.b f22049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f22050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f22051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fj.c f22052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22053h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f22054i;
    public final c4.l j;

    static {
        v3.q.f("WorkManagerImpl");
        k = null;
        f22044l = null;
        f22045m = new Object();
    }

    public o(Context context, final v3.b bVar, h4.b bVar2, final WorkDatabase workDatabase, final List list, e eVar, c4.l lVar) {
        Context applicationContext = context.getApplicationContext();
        if (n.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        v3.q qVar = new v3.q(bVar.f21385g);
        synchronized (v3.q.f21417b) {
            v3.q.f21418c = qVar;
        }
        this.f22046a = applicationContext;
        this.f22049d = bVar2;
        this.f22048c = workDatabase;
        this.f22051f = eVar;
        this.j = lVar;
        this.f22047b = bVar;
        this.f22050e = list;
        this.f22052g = new fj.c(11, workDatabase);
        final f4.l lVar2 = bVar2.f10327a;
        String str = i.f22031a;
        eVar.a(new c() { // from class: w3.h
            @Override // w3.c
            public final void e(e4.j jVar, boolean z5) {
                lVar2.execute(new cb.a(10, list, jVar, bVar, workDatabase));
            }
        });
        bVar2.a(new f4.d(applicationContext, this));
    }

    public static o a(Context context) {
        o oVar;
        Object obj = f22045m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        oVar = k;
                        if (oVar == null) {
                            oVar = f22044l;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return oVar;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (oVar != null) {
            return oVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public final void b() {
        synchronized (f22045m) {
            try {
                this.f22053h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f22054i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f22054i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        ArrayList arrayListE;
        String str = z3.b.f23591x;
        Context context = this.f22046a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListE = z3.b.e(context, jobScheduler)) != null && !arrayListE.isEmpty()) {
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                z3.b.b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        WorkDatabase workDatabase = this.f22048c;
        e4.p pVarT = workDatabase.t();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) pVarT.f8019a;
        workDatabase_Impl.b();
        e4.h hVar = (e4.h) pVarT.f8029m;
        h3.j jVarA = hVar.a();
        workDatabase_Impl.c();
        try {
            jVarA.c();
            workDatabase_Impl.o();
            workDatabase_Impl.k();
            hVar.e(jVarA);
            i.b(this.f22047b, workDatabase, this.f22050e);
        } catch (Throwable th2) {
            workDatabase_Impl.k();
            hVar.e(jVarA);
            throw th2;
        }
    }
}
