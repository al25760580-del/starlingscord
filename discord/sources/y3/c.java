package y3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.u0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import e4.j;
import e4.l;
import e4.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import v3.q;
import v3.r;
import v3.s;

/* JADX INFO: loaded from: classes.dex */
public final class c implements w3.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f23164x = q.f("CommandHandler");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f23165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f23166e = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f23167i = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s f23168v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f23169w;

    public c(Context context, s sVar, l lVar) {
        this.f23165d = context;
        this.f23168v = sVar;
        this.f23169w = lVar;
    }

    public static j b(Intent intent) {
        return new j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void c(Intent intent, j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f7984a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f7985b);
    }

    public final void a(Intent intent, int i7, i iVar) {
        List<w3.j> listU;
        ArrayList arrayList;
        String action = intent.getAction();
        int i10 = 5;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            q.d().a(f23164x, "Handling constraints changed " + intent);
            Context context = this.f23165d;
            e eVar = new e(context, this.f23168v, i7, iVar);
            ArrayList<o> arrayListJ = iVar.f23190w.f22048c.t().j();
            String str = d.f23170a;
            Iterator it = arrayListJ.iterator();
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z10 = false;
            while (it.hasNext()) {
                v3.e eVar2 = ((o) it.next()).j;
                z5 |= eVar2.f21397d;
                z6 |= eVar2.f21395b;
                z7 |= eVar2.f21398e;
                z10 |= eVar2.f21394a != r.f21420d;
                if (z5 && z6 && z7 && z10) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f2833a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z5).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z6).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z7).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z10);
            context.sendBroadcast(intent2);
            ArrayList<o> arrayList2 = new ArrayList(arrayListJ.size());
            eVar.f23172a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (o oVar : arrayListJ) {
                if (jCurrentTimeMillis >= oVar.a() && (!oVar.b() || eVar.f23174c.a(oVar))) {
                    arrayList2.add(oVar);
                }
            }
            for (o oVar2 : arrayList2) {
                String str3 = oVar2.f7998a;
                j jVarH = a.a.h(oVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                c(intent3, jVarH);
                q.d().a(e.f23171d, "Creating a delay_met command for workSpec with id (" + str3 + ")");
                iVar.f23187e.f10330d.execute(new u0(iVar, intent3, eVar.f23173b, i10));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            q.d().a(f23164x, "Handling reschedule " + intent + ", " + i7);
            iVar.f23190w.c();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            q.d().b(f23164x, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.f23165d;
            j jVarB = b(intent);
            q qVarD = q.d();
            String str4 = f23164x;
            qVarD.a(str4, "Handling schedule work for " + jVarB);
            WorkDatabase workDatabase = iVar.f23190w.f22048c;
            workDatabase.c();
            try {
                o oVarN = workDatabase.t().n(jVarB.f7984a);
                if (oVarN == null) {
                    q.d().g(str4, "Skipping scheduling " + jVarB + " because it's no longer in the DB");
                    return;
                }
                if (oVarN.f7999b.a()) {
                    q.d().g(str4, "Skipping scheduling " + jVarB + "because it is finished.");
                    return;
                }
                long jA = oVarN.a();
                if (oVarN.b()) {
                    q.d().a(str4, "Opportunistically setting an alarm for " + jVarB + "at " + jA);
                    b.b(context2, workDatabase, jVarB, jA);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    iVar.f23187e.f10330d.execute(new u0(iVar, intent4, i7, i10));
                } else {
                    q.d().a(str4, "Setting up Alarms for " + jVarB + "at " + jA);
                    b.b(context2, workDatabase, jVarB, jA);
                }
                workDatabase.o();
                return;
            } finally {
                workDatabase.k();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f23167i) {
                try {
                    j jVarB2 = b(intent);
                    q qVarD2 = q.d();
                    String str5 = f23164x;
                    qVarD2.a(str5, "Handing delay met for " + jVarB2);
                    if (this.f23166e.containsKey(jVarB2)) {
                        q.d().a(str5, "WorkSpec " + jVarB2 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        g gVar = new g(this.f23165d, i7, iVar, this.f23169w.w(jVarB2));
                        this.f23166e.put(jVarB2, gVar);
                        gVar.e();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                q.d().g(f23164x, "Ignoring intent " + intent);
                return;
            }
            j jVarB3 = b(intent);
            boolean z11 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            q.d().a(f23164x, "Handling onExecutionCompleted " + intent + ", " + i7);
            e(jVarB3, z11);
            return;
        }
        l lVar = this.f23169w;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i11 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            arrayList = new ArrayList(1);
            w3.j jVarV = lVar.v(new j(string, i11));
            if (jVarV != null) {
                listU = arrayList;
                arrayList.add(jVarV);
                listU = arrayList;
            }
        } else {
            listU = lVar.u(string);
        }
        listU = arrayList;
        for (w3.j workSpecId : listU) {
            q.d().a(f23164x, "Handing stopWork work for " + string);
            e4.r rVar = iVar.G;
            rVar.getClass();
            Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
            rVar.O(workSpecId, -512);
            j id2 = workSpecId.f22032a;
            Context context3 = this.f23165d;
            WorkDatabase workDatabase2 = iVar.f23190w.f22048c;
            String str6 = b.f23163a;
            e4.i iVarP = workDatabase2.p();
            e4.g gVarO = iVarP.o(id2);
            if (gVarO != null) {
                b.a(context3, id2, gVarO.f7976c);
                q.d().a(b.f23163a, "Removing SystemIdInfo for workSpecId (" + id2 + ")");
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(id2, "id");
                String str7 = id2.f7984a;
                int i12 = id2.f7985b;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) iVarP.f7980e;
                workDatabase_Impl.b();
                e4.h hVar = (e4.h) iVarP.f7982v;
                h3.j jVarA = hVar.a();
                if (str7 == null) {
                    jVarA.R(1);
                } else {
                    jVarA.o(1, str7);
                }
                jVarA.x(2, i12);
                workDatabase_Impl.c();
                try {
                    jVarA.c();
                    workDatabase_Impl.o();
                    workDatabase_Impl.k();
                    hVar.e(jVarA);
                } catch (Throwable th3) {
                    workDatabase_Impl.k();
                    hVar.e(jVarA);
                    throw th3;
                }
            }
            iVar.e(id2, false);
        }
    }

    @Override // w3.c
    public final void e(j jVar, boolean z5) {
        synchronized (this.f23167i) {
            try {
                g gVar = (g) this.f23166e.remove(jVar);
                this.f23169w.v(jVar);
                if (gVar != null) {
                    gVar.f(z5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
