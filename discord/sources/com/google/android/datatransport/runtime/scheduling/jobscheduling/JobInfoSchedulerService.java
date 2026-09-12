package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import bc.e;
import bc.k;
import fc.a;
import java.util.concurrent.Executor;
import n8.f;
import vb.i;
import vb.p;

/* JADX INFO: loaded from: classes3.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f5497d = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i7 = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        p.b(getApplicationContext());
        f fVarA = i.a();
        fVarA.h0(string);
        fVarA.f16511i = a.b(i7);
        if (string2 != null) {
            fVarA.f16512v = Base64.decode(string2, 0);
        }
        k kVar = p.a().f21550d;
        ((Executor) kVar.f3126x).execute(new e(i10, 0, kVar, fVarA.J(), new a1.k(3, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
