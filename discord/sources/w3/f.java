package w3;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22025c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f22026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context mContext, int i7, int i10) {
        super(i7, i10);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f22026d = mContext;
    }

    @Override // b3.a
    public final void a(h3.c db) {
        switch (this.f22025c) {
            case 0:
                Intrinsics.checkNotNullParameter(db, "db");
                if (this.f3056b >= 10) {
                    db.n(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f22026d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(db, "db");
                db.l("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f22026d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j5 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    db.c();
                    try {
                        db.n(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        db.n(new Object[]{"reschedule_needed", Long.valueOf(j5)});
                        sharedPreferences.edit().clear().apply();
                        db.B();
                        db.i();
                    } catch (Throwable th2) {
                        db.i();
                        throw th2;
                    }
                }
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(db, "sqLiteDatabase");
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i7 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i10 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    db.c();
                    try {
                        db.n(new Object[]{"next_job_scheduler_id", Integer.valueOf(i7)});
                        db.n(new Object[]{"next_alarm_manager_id", Integer.valueOf(i10)});
                        sharedPreferences2.edit().clear().apply();
                        db.B();
                        return;
                    } finally {
                        db.i();
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(9, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22026d = context;
    }
}
