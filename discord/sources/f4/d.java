package f4;

import a5.l0;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import v3.z;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f8824w = v3.q.f("ForceStopRunnable");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f8825x = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f8826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w3.o f8827e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fj.c f8828i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8829v = 0;

    public d(Context context, w3.o oVar) {
        this.f8826d = context.getApplicationContext();
        this.f8827e = oVar;
        this.f8828i = oVar.f22052g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i7 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i7);
        long jCurrentTimeMillis = System.currentTimeMillis() + f8825x;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0222  */
    /* JADX WARN: Code duplicated, block: B:109:0x023a  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    public final void a() {
        boolean z5;
        fj.c cVar = this.f8828i;
        w3.o oVar = this.f8827e;
        WorkDatabase workDatabase = oVar.f22048c;
        v3.b bVar = oVar.f22047b;
        fj.c cVar2 = oVar.f22052g;
        WorkDatabase workDatabase2 = oVar.f22048c;
        String str = z3.b.f23591x;
        Context context = this.f8826d;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList<JobInfo> arrayListE = z3.b.e(context, jobScheduler);
        e4.i iVarP = workDatabase.p();
        iVarP.getClass();
        a3.o oVarG = a3.o.g(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) iVarP.f7980e;
        workDatabase_Impl.b();
        Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
        try {
            ArrayList arrayList = new ArrayList(cursorM.getCount());
            while (cursorM.moveToNext()) {
                arrayList.add(cursorM.isNull(0) ? null : cursorM.getString(0));
            }
            cursorM.close();
            oVarG.i();
            HashSet hashSet = new HashSet(arrayListE != null ? arrayListE.size() : 0);
            if (arrayListE != null && !arrayListE.isEmpty()) {
                for (JobInfo jobInfo : arrayListE) {
                    e4.j jVarF = z3.b.f(jobInfo);
                    if (jVarF != null) {
                        hashSet.add(jVarF.f7984a);
                    } else {
                        z3.b.b(jobScheduler, jobInfo.getId());
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!hashSet.contains((String) it.next())) {
                        v3.q.d().a(z3.b.f23591x, "Reconciling jobs");
                        z5 = true;
                        break;
                    }
                } else {
                    z5 = false;
                    break;
                }
            }
            if (z5) {
                workDatabase.c();
                try {
                    e4.p pVarT = workDatabase.t();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        pVarT.p(-1L, (String) it2.next());
                    }
                    workDatabase.o();
                    workDatabase.k();
                } catch (Throwable th2) {
                    workDatabase.k();
                    throw th2;
                }
            }
            e4.p pVarT2 = workDatabase2.t();
            e4.m mVarS = workDatabase2.s();
            workDatabase2.c();
            try {
                ArrayList<e4.o> arrayListI = pVarT2.i();
                boolean zIsEmpty = arrayListI.isEmpty();
                if (!zIsEmpty) {
                    for (e4.o oVar2 : arrayListI) {
                        z zVar = z.f21435d;
                        String str2 = oVar2.f7998a;
                        pVarT2.t(zVar, str2);
                        pVarT2.u(-512, str2);
                        pVarT2.p(-1L, str2);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) mVarS.f7993e;
                workDatabase_Impl2.b();
                e4.h hVar = (e4.h) mVarS.f7995v;
                h3.j jVarA = hVar.a();
                workDatabase_Impl2.c();
                try {
                    jVarA.c();
                    workDatabase_Impl2.o();
                    workDatabase_Impl2.k();
                    hVar.e(jVarA);
                    workDatabase2.o();
                    workDatabase2.k();
                    boolean z6 = !zIsEmpty || z5;
                    Long lF = ((WorkDatabase) cVar2.f9267e).l().F("reschedule_needed");
                    String str3 = f8824w;
                    if (lF != null && lF.longValue() == 1) {
                        v3.q.d().a(str3, "Rescheduling Workers.");
                        oVar.c();
                        cVar2.getClass();
                        Intrinsics.checkNotNullParameter("reschedule_needed", "key");
                        ((WorkDatabase) cVar2.f9267e).l().G(new e4.d("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        int i7 = Build.VERSION.SDK_INT;
                        int i10 = i7 >= 31 ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
                        if (i7 < 30) {
                            if (broadcast == null) {
                                c(context);
                                v3.q.d().a(str3, "Application was force-stopped, rescheduling.");
                                oVar.c();
                                bVar.f21381c.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                cVar.getClass();
                                ((WorkDatabase) cVar.f9267e).l().G(new e4.d("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
                                return;
                            }
                            if (z6) {
                                v3.q.d().a(str3, "Found unfinished work, scheduling it.");
                                w3.i.b(bVar, workDatabase2, oVar.f22050e);
                            }
                        }
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            Long lF2 = ((WorkDatabase) cVar.f9267e).l().F("last_force_stop_ms");
                            long jLongValue = lF2 != null ? lF2.longValue() : 0L;
                            for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                                ApplicationExitInfo applicationExitInfoC = com.google.firebase.messaging.n.c(historicalProcessExitReasons.get(i11));
                                if (applicationExitInfoC.getReason() == 10 && applicationExitInfoC.getTimestamp() >= jLongValue) {
                                    v3.q.d().a(str3, "Application was force-stopped, rescheduling.");
                                    oVar.c();
                                    bVar.f21381c.getClass();
                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                    cVar.getClass();
                                    ((WorkDatabase) cVar.f9267e).l().G(new e4.d("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2)));
                                    return;
                                }
                            }
                        }
                        if (z6) {
                            v3.q.d().a(str3, "Found unfinished work, scheduling it.");
                            w3.i.b(bVar, workDatabase2, oVar.f22050e);
                        }
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                        if (v3.q.d().f21419a <= 5) {
                            Log.w(str3, "Ignoring exception", e);
                        }
                    } catch (SecurityException e11) {
                        e = e11;
                        if (v3.q.d().f21419a <= 5) {
                            Log.w(str3, "Ignoring exception", e);
                        }
                    }
                } catch (Throwable th3) {
                    workDatabase_Impl2.k();
                    hVar.e(jVarA);
                    throw th3;
                }
            } catch (Throwable th4) {
                workDatabase2.k();
                throw th4;
            }
        } catch (Throwable th5) {
            cursorM.close();
            oVarG.i();
            throw th5;
        }
    }

    public final boolean b() {
        v3.b bVar = this.f8827e.f22047b;
        bVar.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f8824w;
        if (zIsEmpty) {
            v3.q.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean zA = k.a(this.f8826d, bVar);
        v3.q.d().a(str, "Is default app process = " + zA);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f8826d;
        String str = f8824w;
        w3.o oVar = this.f8827e;
        try {
            if (!b()) {
                oVar.b();
                return;
            }
            while (true) {
                try {
                    zs.a.J(context);
                    v3.q.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        oVar.b();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e10) {
                        int i7 = this.f8829v + 1;
                        this.f8829v = i7;
                        if (i7 >= 3) {
                            String str2 = l0.K(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            v3.q.d().c(str, str2, e10);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e10);
                            oVar.f22047b.getClass();
                            throw illegalStateException;
                        }
                        long j = ((long) i7) * 300;
                        String str3 = "Retrying after " + j;
                        if (v3.q.d().f21419a <= 3) {
                            Log.d(str, str3, e10);
                        }
                        try {
                            Thread.sleep(((long) this.f8829v) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e11) {
                    v3.q.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                    oVar.f22047b.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th2) {
            oVar.b();
            throw th2;
        }
    }
}
