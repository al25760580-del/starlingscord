package d4;

import a4.i;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.appcompat.widget.u0;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.datepicker.g;
import e4.j;
import f4.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import v3.h;
import v3.q;
import w3.o;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a4.e, w3.c {
    public static final String G = q.f("SystemFgDispatcher");
    public final i E;
    public SystemForegroundService F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f7583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h4.b f7584e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f7585i = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j f7586v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f7587w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashMap f7588x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final HashMap f7589y;

    public b(Context context) {
        o oVarA = o.a(context);
        this.f7583d = oVarA;
        this.f7584e = oVarA.f22049d;
        this.f7586v = null;
        this.f7587w = new LinkedHashMap();
        this.f7589y = new HashMap();
        this.f7588x = new HashMap();
        this.E = new i(oVarA.j);
        oVarA.f22051f.a(this);
    }

    public static Intent a(Context context, j jVar, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f21406a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f21407b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f21408c);
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f7984a);
        intent.putExtra("KEY_GENERATION", jVar.f7985b);
        return intent;
    }

    public static Intent c(Context context, j jVar, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f7984a);
        intent.putExtra("KEY_GENERATION", jVar.f7985b);
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f21406a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f21407b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f21408c);
        return intent;
    }

    @Override // a4.e
    public final void b(e4.o oVar, a4.c cVar) {
        if (cVar instanceof a4.b) {
            String str = oVar.f7998a;
            q.d().a(G, "Constraints unmet for WorkSpec " + str);
            j jVarH = a.a.h(oVar);
            o oVar2 = this.f7583d;
            h4.b bVar = oVar2.f22049d;
            w3.e processor = oVar2.f22051f;
            w3.j token = new w3.j(jVarH);
            Intrinsics.checkNotNullParameter(processor, "processor");
            Intrinsics.checkNotNullParameter(token, "token");
            bVar.a(new m(processor, token, true, -512));
        }
    }

    public final void d(Intent intent) {
        int i7 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        j jVar = new j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        q qVarD = q.d();
        StringBuilder sbO = com.discord.chat.presentation.list.a.o("Notifying with (id:", ", workSpecId: ", stringExtra, intExtra, ", notificationType :");
        sbO.append(intExtra2);
        sbO.append(")");
        qVarD.a(G, sbO.toString());
        if (notification == null || this.F == null) {
            return;
        }
        h hVar = new h(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f7587w;
        linkedHashMap.put(jVar, hVar);
        if (this.f7586v == null) {
            this.f7586v = jVar;
            SystemForegroundService systemForegroundService = this.F;
            systemForegroundService.f2845e.post(new c(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.F;
        systemForegroundService2.f2845e.post(new u0(systemForegroundService2, intExtra, notification, 1));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i7 |= ((h) ((Map.Entry) it.next()).getValue()).f21407b;
        }
        h hVar2 = (h) linkedHashMap.get(this.f7586v);
        if (hVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.F;
            systemForegroundService3.f2845e.post(new c(systemForegroundService3, hVar2.f21406a, hVar2.f21408c, i7));
        }
    }

    @Override // w3.c
    public final void e(j jVar, boolean z5) {
        Map.Entry entry;
        synchronized (this.f7585i) {
            try {
                Job job = ((e4.o) this.f7588x.remove(jVar)) != null ? (Job) this.f7589y.remove(jVar) : null;
                if (job != null) {
                    job.f(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h hVar = (h) this.f7587w.remove(jVar);
        if (jVar.equals(this.f7586v)) {
            if (this.f7587w.size() > 0) {
                Iterator it = this.f7587w.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f7586v = (j) entry.getKey();
                if (this.F != null) {
                    h hVar2 = (h) entry.getValue();
                    SystemForegroundService systemForegroundService = this.F;
                    systemForegroundService.f2845e.post(new c(systemForegroundService, hVar2.f21406a, hVar2.f21408c, hVar2.f21407b));
                    SystemForegroundService systemForegroundService2 = this.F;
                    systemForegroundService2.f2845e.post(new g(hVar2.f21406a, 1, systemForegroundService2));
                }
            } else {
                this.f7586v = null;
            }
        }
        SystemForegroundService systemForegroundService3 = this.F;
        if (hVar == null || systemForegroundService3 == null) {
            return;
        }
        q.d().a(G, "Removing Notification (id: " + hVar.f21406a + ", workSpecId: " + jVar + ", notificationType: " + hVar.f21407b);
        systemForegroundService3.f2845e.post(new g(hVar.f21406a, 1, systemForegroundService3));
    }

    public final void f() {
        this.F = null;
        synchronized (this.f7585i) {
            try {
                Iterator it = this.f7589y.values().iterator();
                while (it.hasNext()) {
                    ((Job) it.next()).f(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f7583d.f22051f.e(this);
    }
}
