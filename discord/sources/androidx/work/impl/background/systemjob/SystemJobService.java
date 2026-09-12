package androidx.work.impl.background.systemjob;

import a5.t;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import e4.j;
import e4.l;
import e4.r;
import h4.b;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import v3.q;
import w3.c;
import w3.e;
import w3.o;
import z3.d;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f2838w = q.f("SystemJobService");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f2839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f2840e = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f2841i = new l(21);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r f2842v;

    public static j a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // w3.c
    public final void e(j jVar, boolean z5) {
        JobParameters jobParameters;
        q.d().a(f2838w, jVar.f7984a + " executed on JobScheduler");
        synchronized (this.f2840e) {
            jobParameters = (JobParameters) this.f2840e.remove(jVar);
        }
        this.f2841i.v(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z5);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            o oVarA = o.a(getApplicationContext());
            this.f2839d = oVarA;
            e eVar = oVarA.f22051f;
            this.f2842v = new r(eVar, oVarA.f22049d);
            eVar.a(this);
        } catch (IllegalStateException e10) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
            }
            q.d().g(f2838w, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        o oVar = this.f2839d;
        if (oVar != null) {
            oVar.f22051f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f2839d == null) {
            q.d().a(f2838w, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j jVarA = a(jobParameters);
        if (jVarA == null) {
            q.d().b(f2838w, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f2840e) {
            try {
                if (this.f2840e.containsKey(jVarA)) {
                    q.d().a(f2838w, "Job is already being executed by SystemJobService: " + jVarA);
                    return false;
                }
                q.d().a(f2838w, "onStartJob for " + jVarA);
                this.f2840e.put(jVarA, jobParameters);
                int i7 = Build.VERSION.SDK_INT;
                io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(22);
                if (z3.c.b(jobParameters) != null) {
                    cVar.f12760i = Arrays.asList(z3.c.b(jobParameters));
                }
                if (z3.c.a(jobParameters) != null) {
                    cVar.f12759e = Arrays.asList(z3.c.a(jobParameters));
                }
                if (i7 >= 28) {
                    d.a(jobParameters);
                }
                r rVar = this.f2842v;
                w3.j workSpecId = this.f2841i.w(jVarA);
                rVar.getClass();
                Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
                ((b) rVar.f8035i).a(new t((e) rVar.f8034e, workSpecId, cVar));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        if (this.f2839d == null) {
            q.d().a(f2838w, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j jVarA = a(jobParameters);
        if (jVarA == null) {
            q.d().b(f2838w, "WorkSpec id not found!");
            return false;
        }
        q.d().a(f2838w, "onStopJob for " + jVarA);
        synchronized (this.f2840e) {
            this.f2840e.remove(jVarA);
        }
        w3.j workSpecId = this.f2841i.v(jVarA);
        if (workSpecId != null) {
            int iA = Build.VERSION.SDK_INT >= 31 ? z3.e.a(jobParameters) : -512;
            r rVar = this.f2842v;
            rVar.getClass();
            Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
            rVar.O(workSpecId, iA);
        }
        e eVar = this.f2839d.f22051f;
        String str = jVarA.f7984a;
        synchronized (eVar.k) {
            zContains = eVar.f22024i.contains(str);
        }
        return !zContains;
    }
}
