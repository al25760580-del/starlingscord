package y3;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.appcompat.widget.u0;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import e4.j;
import e4.l;
import e4.r;
import f4.w;
import java.util.ArrayList;
import java.util.Iterator;
import v3.q;
import w3.o;

/* JADX INFO: loaded from: classes.dex */
public final class i implements w3.c {
    public static final String H = q.f("SystemAlarmDispatcher");
    public Intent E;
    public SystemAlarmService F;
    public final r G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f23186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h4.b f23187e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f23188i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final w3.e f23189v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o f23190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f23191x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f23192y;

    public i(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f23186d = applicationContext;
        l lVar = new l(21);
        o oVarA = o.a(systemAlarmService);
        v3.b bVar = oVarA.f22047b;
        this.f23190w = oVarA;
        this.f23191x = new c(applicationContext, bVar.f21381c, lVar);
        this.f23188i = new w(bVar.f21384f);
        w3.e eVar = oVarA.f22051f;
        this.f23189v = eVar;
        h4.b bVar2 = oVarA.f22049d;
        this.f23187e = bVar2;
        this.G = new r(eVar, bVar2);
        eVar.a(this);
        this.f23192y = new ArrayList();
        this.E = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(int i7, Intent intent) {
        q qVarD = q.d();
        String str = H;
        qVarD.a(str, "Adding command " + intent + " (" + i7 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            q.d().g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f23192y) {
                try {
                    Iterator it = this.f23192y.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i7);
        synchronized (this.f23192y) {
            try {
                boolean zIsEmpty = this.f23192y.isEmpty();
                this.f23192y.add(intent);
                if (zIsEmpty) {
                    c();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c() {
        b();
        PowerManager.WakeLock wakeLockA = f4.o.a(this.f23186d, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f23190w.f22049d.a(new h(this, 0));
        } finally {
            wakeLockA.release();
        }
    }

    @Override // w3.c
    public final void e(j jVar, boolean z5) {
        h4.a aVar = this.f23187e.f10330d;
        String str = c.f23164x;
        Intent intent = new Intent(this.f23186d, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z5);
        c.c(intent, jVar);
        aVar.execute(new u0(this, intent, 0, 5));
    }
}
