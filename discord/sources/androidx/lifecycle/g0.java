package androidx.lifecycle;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f2353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f2354e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f2355i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n f2356v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ar.k f2357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ jr.b f2358x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function2 f2359y;

    public g0(n nVar, Ref.ObjectRef objectRef, CoroutineScope coroutineScope, n nVar2, ar.k kVar, jr.b bVar, Function2 function2) {
        this.f2353d = nVar;
        this.f2354e = objectRef;
        this.f2355i = coroutineScope;
        this.f2356v = nVar2;
        this.f2357w = kVar;
        this.f2358x = bVar;
        this.f2359y = function2;
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [T, ar.p1] */
    @Override // androidx.lifecycle.t
    public final void c(LifecycleOwner lifecycleOwner, n event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        n nVar = this.f2353d;
        Ref.ObjectRef objectRef = this.f2354e;
        if (event == nVar) {
            objectRef.element = ar.b0.t(this.f2355i, null, new f0(this.f2358x, this.f2359y, null), 3);
            return;
        }
        if (event == this.f2356v) {
            Job job = (Job) objectRef.element;
            if (job != null) {
                job.f(null);
            }
            objectRef.element = null;
        }
        if (event == n.ON_DESTROY) {
            rn.q qVar = Result.f14614e;
            this.f2357w.resumeWith(Unit.f14616a);
        }
    }
}
