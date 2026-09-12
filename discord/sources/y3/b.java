package y3;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import e4.j;
import kotlin.jvm.internal.Intrinsics;
import v3.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f23163a = q.f("Alarms");

    public static void a(Context context, j jVar, int i7) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = c.f23164x;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        c.c(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i7, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        q.d().a(f23163a, "Cancelling existing alarm with (workSpecId, systemId) (" + jVar + ", " + i7 + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, j generationalId, long j) {
        e4.i iVarP = workDatabase.p();
        e4.g gVarO = iVarP.o(generationalId);
        if (gVarO != null) {
            int i7 = gVarO.f7976c;
            a(context, generationalId, i7);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = c.f23164x;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            c.c(intent, generationalId);
            PendingIntent service = PendingIntent.getService(context, i7, intent, 201326592);
            if (alarmManager != null) {
                a.a(alarmManager, 0, j, service);
                return;
            }
            return;
        }
        Object objN = workDatabase.n(new f4.e(0, new ue.i(workDatabase)));
        Intrinsics.checkNotNullExpressionValue(objN, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int iIntValue = ((Number) objN).intValue();
        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
        iVarP.q(new e4.g(generationalId.f7984a, generationalId.f7985b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = c.f23164x;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        c.c(intent2, generationalId);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            a.a(alarmManager2, 0, j, service2);
        }
    }
}
