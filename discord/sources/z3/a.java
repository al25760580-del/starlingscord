package z3;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import e4.o;
import v3.q;
import v3.r;
import v3.s;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f23588c = q.f("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f23589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f23590b;

    public a(Context context, s sVar) {
        this.f23590b = sVar;
        this.f23589a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JobInfo a(o oVar, int i7) {
        int i10;
        v3.e eVar = oVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", oVar.f7998a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", oVar.f8015t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", oVar.c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i7, this.f23589a).setRequiresCharging(eVar.f21395b);
        boolean z5 = eVar.f21396c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z5).setExtras(persistableBundle);
        r rVar = eVar.f21394a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30 || rVar != r.f21425x) {
            int iOrdinal = rVar.ordinal();
            if (iOrdinal == 0) {
                i10 = 0;
            } else if (iOrdinal != 1) {
                i10 = 2;
                if (iOrdinal != 2) {
                    i10 = 3;
                    if (iOrdinal != 3) {
                        i10 = 4;
                        if (iOrdinal != 4 || i11 < 26) {
                            q.d().a(f23588c, "API version too low. Cannot convert network type value " + rVar);
                            i10 = 1;
                        }
                    }
                }
            } else {
                i10 = 1;
            }
            extras.setRequiredNetworkType(i10);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z5) {
            extras.setBackoffCriteria(oVar.f8008m, oVar.f8007l == v3.a.f21377e ? 0 : 1);
        }
        long jA = oVar.a();
        this.f23590b.getClass();
        long jMax = Math.max(jA - System.currentTimeMillis(), 0L);
        if (i11 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!oVar.f8012q) {
            extras.setImportantWhileForeground(true);
        }
        if (eVar.a()) {
            for (v3.d dVar : eVar.f21401h) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(dVar.f21391a, dVar.f21392b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(eVar.f21399f);
            extras.setTriggerContentMaxDelay(eVar.f21400g);
        }
        extras.setPersisted(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            extras.setRequiresBatteryNotLow(eVar.f21397d);
            extras.setRequiresStorageNotLow(eVar.f21398e);
        }
        Object[] objArr = oVar.k > 0;
        boolean z6 = jMax > 0;
        if (i12 >= 31 && oVar.f8012q && objArr == false && !z6) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
