package androidx.work.impl.workers;

import a.a;
import a5.l0;
import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.facebook.react.devsupport.StackTraceHelper;
import e4.i;
import e4.l;
import e4.p;
import e4.r;
import i4.b;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v3.e;
import v3.g;
import v3.n;
import v3.o;
import v3.q;
import v3.y;
import v3.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final o f() throws Throwable {
        a3.o oVar;
        i iVar;
        l lVar;
        r rVar;
        w3.o oVarA = w3.o.a(this.f21413d);
        Intrinsics.checkNotNullExpressionValue(oVarA, "getInstance(applicationContext)");
        WorkDatabase workDatabase = oVarA.f22048c;
        Intrinsics.checkNotNullExpressionValue(workDatabase, "workManager.workDatabase");
        p pVarT = workDatabase.t();
        l lVarR = workDatabase.r();
        r rVarU = workDatabase.u();
        i iVarP = workDatabase.p();
        oVarA.f22047b.f21381c.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        pVarT.getClass();
        a3.o oVarG = a3.o.g(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        oVarG.x(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) pVarT.f8019a;
        workDatabase_Impl.b();
        Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
        try {
            int iK = a.k(cursorM, StackTraceHelper.ID_KEY);
            int iK2 = a.k(cursorM, "state");
            int iK3 = a.k(cursorM, "worker_class_name");
            int iK4 = a.k(cursorM, "input_merger_class_name");
            int iK5 = a.k(cursorM, "input");
            int iK6 = a.k(cursorM, "output");
            int iK7 = a.k(cursorM, "initial_delay");
            int iK8 = a.k(cursorM, "interval_duration");
            int iK9 = a.k(cursorM, "flex_duration");
            int iK10 = a.k(cursorM, "run_attempt_count");
            int iK11 = a.k(cursorM, "backoff_policy");
            oVar = oVarG;
            try {
                int iK12 = a.k(cursorM, "backoff_delay_duration");
                int iK13 = a.k(cursorM, "last_enqueue_time");
                int iK14 = a.k(cursorM, "minimum_retention_duration");
                int iK15 = a.k(cursorM, "schedule_requested_at");
                int iK16 = a.k(cursorM, "run_in_foreground");
                int iK17 = a.k(cursorM, "out_of_quota_policy");
                int iK18 = a.k(cursorM, "period_count");
                int iK19 = a.k(cursorM, "generation");
                int iK20 = a.k(cursorM, "next_schedule_time_override");
                int iK21 = a.k(cursorM, "next_schedule_time_override_generation");
                int iK22 = a.k(cursorM, "stop_reason");
                int iK23 = a.k(cursorM, "required_network_type");
                int iK24 = a.k(cursorM, "requires_charging");
                int iK25 = a.k(cursorM, "requires_device_idle");
                int iK26 = a.k(cursorM, "requires_battery_not_low");
                int iK27 = a.k(cursorM, "requires_storage_not_low");
                int iK28 = a.k(cursorM, "trigger_content_update_delay");
                int iK29 = a.k(cursorM, "trigger_max_content_delay");
                int iK30 = a.k(cursorM, "content_uri_triggers");
                int i7 = iK14;
                ArrayList arrayList = new ArrayList(cursorM.getCount());
                while (cursorM.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM.isNull(iK) ? null : cursorM.getString(iK);
                    z zVarI = l0.I(cursorM.getInt(iK2));
                    String string2 = cursorM.isNull(iK3) ? null : cursorM.getString(iK3);
                    String string3 = cursorM.isNull(iK4) ? null : cursorM.getString(iK4);
                    g gVarA = g.a(cursorM.isNull(iK5) ? null : cursorM.getBlob(iK5));
                    g gVarA2 = g.a(cursorM.isNull(iK6) ? null : cursorM.getBlob(iK6));
                    long j = cursorM.getLong(iK7);
                    long j5 = cursorM.getLong(iK8);
                    long j7 = cursorM.getLong(iK9);
                    int i10 = cursorM.getInt(iK10);
                    v3.a aVarF = l0.F(cursorM.getInt(iK11));
                    long j10 = cursorM.getLong(iK12);
                    long j11 = cursorM.getLong(iK13);
                    int i11 = i7;
                    long j12 = cursorM.getLong(i11);
                    int i12 = iK9;
                    int i13 = iK15;
                    long j13 = cursorM.getLong(i13);
                    iK15 = i13;
                    int i14 = iK16;
                    boolean z5 = cursorM.getInt(i14) != 0;
                    iK16 = i14;
                    int i15 = iK17;
                    y yVarH = l0.H(cursorM.getInt(i15));
                    iK17 = i15;
                    int i16 = iK18;
                    int i17 = cursorM.getInt(i16);
                    iK18 = i16;
                    int i18 = iK19;
                    int i19 = cursorM.getInt(i18);
                    iK19 = i18;
                    int i20 = iK20;
                    long j14 = cursorM.getLong(i20);
                    iK20 = i20;
                    int i21 = iK21;
                    int i22 = cursorM.getInt(i21);
                    iK21 = i21;
                    int i23 = iK22;
                    int i24 = cursorM.getInt(i23);
                    iK22 = i23;
                    int i25 = iK23;
                    v3.r rVarG = l0.G(cursorM.getInt(i25));
                    iK23 = i25;
                    int i26 = iK24;
                    boolean z6 = cursorM.getInt(i26) != 0;
                    iK24 = i26;
                    int i27 = iK25;
                    boolean z7 = cursorM.getInt(i27) != 0;
                    iK25 = i27;
                    int i28 = iK26;
                    boolean z10 = cursorM.getInt(i28) != 0;
                    iK26 = i28;
                    int i29 = iK27;
                    boolean z11 = cursorM.getInt(i29) != 0;
                    iK27 = i29;
                    int i30 = iK28;
                    long j15 = cursorM.getLong(i30);
                    iK28 = i30;
                    int i31 = iK29;
                    long j16 = cursorM.getLong(i31);
                    iK29 = i31;
                    int i32 = iK30;
                    if (!cursorM.isNull(i32)) {
                        blob = cursorM.getBlob(i32);
                    }
                    iK30 = i32;
                    arrayList.add(new e4.o(string, zVarI, string2, string3, gVarA, gVarA2, j, j5, j7, new e(rVarG, z6, z7, z10, z11, j15, j16, l0.j(blob)), i10, aVarF, j10, j11, j12, j13, z5, yVarH, i17, i19, j14, i22, i24));
                    iK9 = i12;
                    i7 = i11;
                }
                cursorM.close();
                oVar.i();
                ArrayList arrayListI = pVarT.i();
                ArrayList arrayListC = pVarT.c();
                if (arrayList.isEmpty()) {
                    iVar = iVarP;
                    lVar = lVarR;
                    rVar = rVarU;
                } else {
                    q qVarD = q.d();
                    String str = b.f11389a;
                    qVarD.e(str, "Recently completed work:\n\n");
                    iVar = iVarP;
                    lVar = lVarR;
                    rVar = rVarU;
                    q.d().e(str, b.a(lVar, rVar, iVar, arrayList));
                }
                if (!arrayListI.isEmpty()) {
                    q qVarD2 = q.d();
                    String str2 = b.f11389a;
                    qVarD2.e(str2, "Running work:\n\n");
                    q.d().e(str2, b.a(lVar, rVar, iVar, arrayListI));
                }
                if (!arrayListC.isEmpty()) {
                    q qVarD3 = q.d();
                    String str3 = b.f11389a;
                    qVarD3.e(str3, "Enqueued work:\n\n");
                    q.d().e(str3, b.a(lVar, rVar, iVar, arrayListC));
                }
                n nVar = new n(g.f21404c);
                Intrinsics.checkNotNullExpressionValue(nVar, "success()");
                return nVar;
            } catch (Throwable th2) {
                th = th2;
                cursorM.close();
                oVar.i();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            oVar = oVarG;
        }
    }
}
