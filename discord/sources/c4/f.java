package c4;

import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4.b f3453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f3456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3457e;

    public f(Context context, h4.b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f3453a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f3454b = applicationContext;
        this.f3455c = new Object();
        this.f3456d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.f3455c) {
            Object obj2 = this.f3457e;
            if (obj2 == null || !Intrinsics.areEqual(obj2, obj)) {
                this.f3457e = obj;
                this.f3453a.f10330d.execute(new a1.k(5, CollectionsKt.i0(this.f3456d), this));
                Unit unit = Unit.f14616a;
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
