package y3;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(AlarmManager alarmManager, int i7, long j, PendingIntent pendingIntent) {
        alarmManager.setExact(i7, j, pendingIntent);
    }
}
