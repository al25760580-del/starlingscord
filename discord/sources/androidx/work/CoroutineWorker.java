package androidx.work;

import android.content.Context;
import ar.b0;
import ar.b1;
import ar.k0;
import com.google.common.util.concurrent.ListenableFuture;
import com.margelo.nitro.rive.v0;
import fr.d;
import g4.j;
import hr.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import sm.f;
import v3.k;
import v3.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lv3/p;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoroutineWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineWorker.kt\nandroidx/work/CoroutineWorker\n+ 2 ListenableFuture.kt\nandroidx/work/ListenableFutureKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,144:1\n40#2,8:145\n48#2:162\n60#2,7:163\n40#2,8:172\n48#2:189\n60#2,7:190\n314#3,9:153\n323#3,2:170\n314#3,9:180\n323#3,2:197\n*S KotlinDebug\n*F\n+ 1 CoroutineWorker.kt\nandroidx/work/CoroutineWorker\n*L\n110#1:145,8\n110#1:162\n110#1:163,7\n125#1:172,8\n125#1:189\n125#1:190,7\n110#1:153,9\n110#1:170,2\n125#1:180,9\n125#1:197,2\n*E\n"})
public abstract class CoroutineWorker extends p {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b1 f2808w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j f2809x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f2810y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f2808w = new b1();
        j jVar = new j();
        Intrinsics.checkNotNullExpressionValue(jVar, "create()");
        this.f2809x = jVar;
        jVar.a(new f(4, this), params.f2816d.f10327a);
        this.f2810y = k0.f2938a;
    }

    @Override // v3.p
    public final ListenableFuture a() {
        b1 b1Var = new b1();
        e eVar = this.f2810y;
        eVar.getClass();
        d dVarB = b0.b(kotlin.coroutines.e.c(eVar, b1Var));
        k kVar = new k(b1Var);
        b0.t(dVarB, null, new a4.k(kVar, this, null, 4), 3);
        return kVar;
    }

    @Override // v3.p
    public final void c() {
        this.f2809x.cancel(false);
    }

    @Override // v3.p
    public final j d() {
        e eVar = this.f2810y;
        eVar.getClass();
        b0.t(b0.b(kotlin.coroutines.e.c(eVar, this.f2808w)), null, new v0(this, null, 3), 3);
        return this.f2809x;
    }

    public abstract Object f();
}
