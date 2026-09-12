package z3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import e4.h;
import e4.i;
import e4.j;
import e4.o;
import e4.p;
import f4.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import v3.q;
import v3.y;
import v3.z;
import w3.g;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f23591x = q.f("SystemJobScheduler");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f23592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JobScheduler f23593e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f23594i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final WorkDatabase f23595v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v3.b f23596w;

    public b(Context context, WorkDatabase workDatabase, v3.b bVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context, bVar.f21381c);
        this.f23592d = context;
        this.f23593e = jobScheduler;
        this.f23594i = aVar;
        this.f23595v = workDatabase;
        this.f23596w = bVar;
    }

    public static void b(JobScheduler jobScheduler, int i7) {
        try {
            jobScheduler.cancel(i7);
        } catch (Throwable th2) {
            q.d().c(f23591x, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i7)), th2);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            q.d().c(f23591x, "getAllPendingJobs() is not reliable on this device.", th2);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // w3.g
    public final boolean a() {
        return true;
    }

    @Override // w3.g
    public final void c(String str) {
        ArrayList arrayList;
        Context context = this.f23592d;
        JobScheduler jobScheduler = this.f23593e;
        ArrayList<JobInfo> arrayListE = e(context, jobScheduler);
        if (arrayListE == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListE) {
                j jVarF = f(jobInfo);
                if (jVarF != null && str.equals(jVarF.f7984a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b(jobScheduler, ((Integer) it.next()).intValue());
        }
        i iVarP = this.f23595v.p();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) iVarP.f7980e;
        workDatabase_Impl.b();
        h hVar = (h) iVarP.f7983w;
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
        } finally {
            workDatabase_Impl.k();
            hVar.e(jVarA);
        }
    }

    @Override // w3.g
    public final void d(o... oVarArr) {
        int iIntValue;
        v3.b bVar = this.f23596w;
        WorkDatabase workDatabase = this.f23595v;
        ue.i iVar = new ue.i(workDatabase);
        for (o oVar : oVarArr) {
            workDatabase.c();
            try {
                p pVarT = workDatabase.t();
                String str = oVar.f7998a;
                o oVarN = pVarT.n(str);
                String str2 = f23591x;
                if (oVarN == null) {
                    q.d().g(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.o();
                } else if (oVarN.f7999b != z.f21435d) {
                    q.d().g(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.o();
                } else {
                    j generationalId = a.a.h(oVar);
                    e4.g gVarO = workDatabase.p().o(generationalId);
                    if (gVarO != null) {
                        iIntValue = gVarO.f7976c;
                    } else {
                        bVar.getClass();
                        Object objN = ((WorkDatabase) iVar.f21117d).n(new f(bVar.f21386h, 0, iVar));
                        Intrinsics.checkNotNullExpressionValue(objN, "workDatabase.runInTransa…            id\n        })");
                        iIntValue = ((Number) objN).intValue();
                    }
                    if (gVarO == null) {
                        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
                        workDatabase.p().q(new e4.g(generationalId.f7984a, generationalId.f7985b, iIntValue));
                    }
                    g(oVar, iIntValue);
                    workDatabase.o();
                }
                workDatabase.k();
            } catch (Throwable th2) {
                workDatabase.k();
                throw th2;
            }
        }
    }

    public final void g(o oVar, int i7) {
        JobScheduler jobScheduler = this.f23593e;
        JobInfo jobInfoA = this.f23594i.a(oVar, i7);
        q qVarD = q.d();
        StringBuilder sb2 = new StringBuilder("Scheduling work ID ");
        String str = oVar.f7998a;
        sb2.append(str);
        sb2.append("Job ID ");
        sb2.append(i7);
        String string = sb2.toString();
        String str2 = f23591x;
        qVarD.a(str2, string);
        try {
            if (jobScheduler.schedule(jobInfoA) == 0) {
                q.d().g(str2, "Unable to schedule work ID " + str);
                if (oVar.f8012q && oVar.f8013r == y.f21432d) {
                    oVar.f8012q = false;
                    q.d().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    g(oVar, i7);
                }
            }
        } catch (IllegalStateException e10) {
            ArrayList arrayListE = e(this.f23592d, jobScheduler);
            String str3 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(arrayListE != null ? arrayListE.size() : 0), Integer.valueOf(this.f23595v.t().j().size()), Integer.valueOf(this.f23596w.j));
            q.d().b(str2, str3);
            throw new IllegalStateException(str3, e10);
        } catch (Throwable th2) {
            q.d().c(str2, "Unable to schedule " + oVar, th2);
        }
    }
}
