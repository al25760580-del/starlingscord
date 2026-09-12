package androidx.work.impl.workers;

import a4.b;
import a4.c;
import a4.e;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import com.google.firebase.messaging.s;
import e4.o;
import g4.j;
import i4.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import v3.p;
import v3.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Lv3/p;", "La4/e;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConstraintTrackingWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"})
public final class ConstraintTrackingWorker extends p implements e {
    public final j E;
    public p F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final WorkerParameters f2850w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f2851x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f2852y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f2850w = workerParameters;
        this.f2851x = new Object();
        this.E = new j();
    }

    @Override // a4.e
    public final void b(o workSpec, c state) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(state, "state");
        q.d().a(a.f11388a, "Constraints changed for " + workSpec);
        if (state instanceof b) {
            synchronized (this.f2851x) {
                this.f2852y = true;
                Unit unit = Unit.f14616a;
            }
        }
    }

    @Override // v3.p
    public final void c() {
        p pVar = this.F;
        if (pVar == null || pVar.f21415i != -256) {
            return;
        }
        pVar.e(Build.VERSION.SDK_INT >= 31 ? this.f21415i : 0);
    }

    @Override // v3.p
    public final j d() {
        this.f21414e.f2815c.execute(new s(16, this));
        j future = this.E;
        Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }
}
