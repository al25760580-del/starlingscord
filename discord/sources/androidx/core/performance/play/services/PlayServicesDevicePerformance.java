package androidx.core.performance.play.services;

import a3.q;
import android.util.Log;
import androidx.fragment.app.r;
import ar.b0;
import ar.k0;
import ar.q1;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.StackTraceHelper;
import e2.z;
import fj.c;
import g1.a;
import gc.o;
import h2.f;
import hr.e;
import kf.d;
import kf.g;
import kf.h;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rn.l;
import rn.u;
import ye.b;

/* JADX INFO: loaded from: classes.dex */
public final class PlayServicesDevicePerformance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f1571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f1573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h2.c f1574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f1575e;

    public PlayServicesDevicePerformance(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        h client = new h(context, null, d.f14427a, b.D, ye.h.f23298c);
        q produceFile = new q(5, context);
        n0 migrations = n0.f14659d;
        e eVar = k0.f2938a;
        hr.d dVar = hr.d.f11103i;
        q1 q1Var = new q1();
        dVar.getClass();
        fr.d scope = b0.b(kotlin.coroutines.e.c(dVar, q1Var));
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        int i7 = 7;
        q produceFile2 = new q(i7, produceFile);
        f serializer = f.f10292a;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile2, "produceFile");
        int i10 = 6;
        i8.c cVar = new i8.c(i10);
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        c performanceStore = new c(new z(produceFile2, c0.c(new b4.d(migrations, (Continuation) null, 4)), cVar, scope));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(performanceStore, "performanceStore");
        this.f1571a = performanceStore;
        this.f1572b = "PlayServicesDevicePerformance";
        this.f1573c = new a();
        Intrinsics.checkNotNullParameter("mpc_value", StackTraceHelper.NAME_KEY);
        this.f1574d = new h2.c("mpc_value");
        this.f1575e = l.b(new q(i10, this));
        Log.v("PlayServicesDevicePerformance", "Getting mediaPerformanceClass from com.google.android.gms.deviceperformance.DevicePerformanceClient");
        lh.d dVarF = lh.d.f();
        dVarF.f15092e = new xe.d[]{zf.b.f23986a};
        dVarF.f15091d = g.f14429d;
        dVarF.f15089b = 28601;
        ig.l lVarB = client.b(0, dVarF.e());
        Intrinsics.checkNotNullExpressionValue(lVarB, "doRead(\n      TaskApiCal…Y)\n        .build()\n    )");
        o oVar = new o(i7, new r(3, this));
        lVarB.getClass();
        lVarB.e(ig.h.f11764a, oVar);
        lVarB.o(new o(8, this));
    }
}
