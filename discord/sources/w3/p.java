package w3;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p extends FunctionReferenceImpl implements Function6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f22055d = new p(6, q.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context p3 = (Context) obj;
        v3.b p5 = (v3.b) obj2;
        h4.b p6 = (h4.b) obj3;
        WorkDatabase p10 = (WorkDatabase) obj4;
        c4.l p11 = (c4.l) obj5;
        e p12 = (e) obj6;
        Intrinsics.checkNotNullParameter(p3, "p0");
        Intrinsics.checkNotNullParameter(p5, "p1");
        Intrinsics.checkNotNullParameter(p6, "p2");
        Intrinsics.checkNotNullParameter(p10, "p3");
        Intrinsics.checkNotNullParameter(p11, "p4");
        Intrinsics.checkNotNullParameter(p12, "p5");
        String str = i.f22031a;
        z3.b bVar = new z3.b(p3, p10, p5);
        f4.j.a(p3, SystemJobService.class, true);
        v3.q.d().a(i.f22031a, "Created SystemJobScheduler and enabled SystemJobService");
        Intrinsics.checkNotNullExpressionValue(bVar, "createBestAvailableBackg…kDatabase, configuration)");
        return d0.g(bVar, new x3.c(p3, p5, p11, p12, new e4.r(p12, p6), p6));
    }
}
