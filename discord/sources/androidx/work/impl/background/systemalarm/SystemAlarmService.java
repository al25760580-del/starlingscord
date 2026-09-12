package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.w;
import f4.o;
import f4.p;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import v3.q;
import y3.i;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends w {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f2835v = q.f("SystemAlarmService");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f2836e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2837i;

    public final void a() {
        this.f2837i = true;
        q.d().a(f2835v, "All commands completed in dispatcher");
        String str = o.f8847a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (p.f8848a) {
            linkedHashMap.putAll(p.f8849b);
            Unit unit = Unit.f14616a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                q.d().g(o.f8847a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.w, android.app.Service
    public final void onCreate() {
        super.onCreate();
        i iVar = new i(this);
        this.f2836e = iVar;
        if (iVar.F != null) {
            q.d().b(i.H, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            iVar.F = this;
        }
        this.f2837i = false;
    }

    @Override // androidx.lifecycle.w, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f2837i = true;
        i iVar = this.f2836e;
        iVar.getClass();
        q.d().a(i.H, "Destroying SystemAlarmDispatcher");
        iVar.f23189v.e(iVar);
        iVar.F = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        super.onStartCommand(intent, i7, i10);
        if (this.f2837i) {
            q.d().e(f2835v, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            i iVar = this.f2836e;
            iVar.getClass();
            q qVarD = q.d();
            String str = i.H;
            qVarD.a(str, "Destroying SystemAlarmDispatcher");
            iVar.f23189v.e(iVar);
            iVar.F = null;
            i iVar2 = new i(this);
            this.f2836e = iVar2;
            if (iVar2.F != null) {
                q.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                iVar2.F = this;
            }
            this.f2837i = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f2836e.a(i10, intent);
        return 3;
    }
}
