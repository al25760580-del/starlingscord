package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.w;
import com.google.android.gms.internal.play_billing.u0;
import d4.b;
import java.util.UUID;
import v3.q;
import w3.o;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends w {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f2844x = q.f("SystemFgService");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f2845e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2846i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b f2847v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public NotificationManager f2848w;

    public final void a() {
        this.f2845e = new Handler(Looper.getMainLooper());
        this.f2848w = (NotificationManager) getApplicationContext().getSystemService("notification");
        b bVar = new b(getApplicationContext());
        this.f2847v = bVar;
        if (bVar.F != null) {
            q.d().b(b.G, "A callback already exists.");
        } else {
            bVar.F = this;
        }
    }

    @Override // androidx.lifecycle.w, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.w, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f2847v.f();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        super.onStartCommand(intent, i7, i10);
        boolean z5 = this.f2846i;
        String str = f2844x;
        if (z5) {
            q.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f2847v.f();
            a();
            this.f2846i = false;
        }
        if (intent == null) {
            return 3;
        }
        b bVar = this.f2847v;
        bVar.getClass();
        String str2 = b.G;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            q.d().e(str2, "Started foreground service " + intent);
            bVar.f7584e.a(new u0(bVar, intent.getStringExtra("KEY_WORKSPEC_ID"), 5, false));
            bVar.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            bVar.d(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            q.d().e(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = bVar.F;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f2846i = true;
            q.d().a(str, "All commands completed.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        q.d().e(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        o oVar = bVar.f7583d;
        UUID uuidFromString = UUID.fromString(stringExtra);
        oVar.getClass();
        oVar.f22049d.a(new f4.b(oVar, uuidFromString, 0));
        return 3;
    }
}
