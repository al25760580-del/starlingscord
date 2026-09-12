package androidx.lifecycle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends xn.h implements Function2 {
    public final /* synthetic */ CoroutineScope E;
    public final /* synthetic */ Function2 F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ref.ObjectRef f2360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ref.ObjectRef f2361e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CoroutineScope f2362i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Function2 f2363v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f2365x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f2366y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Lifecycle lifecycle, Lifecycle.State state, CoroutineScope coroutineScope, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f2365x = lifecycle;
        this.f2366y = state;
        this.E = coroutineScope;
        this.F = function2;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new h0(this.f2365x, this.f2366y, this.E, this.F, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #1 {all -> 0x00b8, blocks: (B:17:0x0039, B:28:0x0079, B:30:0x0097, B:24:0x006f, B:26:0x0073, B:27:0x0076), top: B:55:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:57:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, androidx.lifecycle.g0, androidx.lifecycle.u, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // xn.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Throwable th2;
        Ref.ObjectRef objectRef2;
        n nVar;
        n nVar2;
        Object objR;
        Job job;
        t tVar;
        Job job2;
        t tVar2;
        wn.a aVar = wn.a.f22354d;
        int i7 = this.f2364w;
        Lifecycle lifecycle = this.f2365x;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = this.f2361e;
            objectRef2 = this.f2360d;
            try {
                ib.a.L(obj);
                job2 = (Job) objectRef2.element;
                if (job2 != null) {
                    job2.f(null);
                }
                tVar2 = (t) objectRef.element;
                if (tVar2 != null) {
                    lifecycle.c(tVar2);
                }
                return Unit.f14616a;
            } catch (Throwable th3) {
                th2 = th3;
                job = (Job) objectRef2.element;
                if (job != null) {
                    job.f(null);
                }
                tVar = (t) objectRef.element;
                if (tVar != null) {
                    throw th2;
                }
                lifecycle.c(tVar);
                throw th2;
            }
        }
        ib.a.L(obj);
        if (lifecycle.b() == Lifecycle.State.f2295d) {
            return Unit.f14616a;
        }
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef = new Ref.ObjectRef();
        try {
            Lifecycle.State state = this.f2366y;
            CoroutineScope coroutineScope = this.E;
            Function2 function2 = this.F;
            this.f2360d = objectRef3;
            this.f2361e = objectRef;
            this.f2362i = coroutineScope;
            this.f2363v = function2;
            this.f2364w = 1;
            ar.k kVar = new ar.k(1, wn.f.b(this));
            kVar.t();
            n.Companion.getClass();
            Intrinsics.checkNotNullParameter(state, "state");
            int iOrdinal = state.ordinal();
            if (iOrdinal == 2) {
                nVar = n.ON_CREATE;
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        nVar2 = null;
                    } else {
                        nVar = n.ON_RESUME;
                    }
                    ?? g0Var = new g0(nVar2, objectRef3, coroutineScope, l.a(state), kVar, new jr.b(), function2);
                    objectRef.element = g0Var;
                    Intrinsics.checkNotNull(g0Var, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    lifecycle.a(g0Var);
                    objR = kVar.r();
                    if (objR == aVar) {
                        Intrinsics.checkNotNullParameter(this, "frame");
                    }
                    if (objR == aVar) {
                        return aVar;
                    }
                    objectRef2 = objectRef3;
                    job2 = (Job) objectRef2.element;
                    if (job2 != null) {
                        job2.f(null);
                    }
                    tVar2 = (t) objectRef.element;
                    if (tVar2 != null) {
                        lifecycle.c(tVar2);
                    }
                    return Unit.f14616a;
                }
                nVar = n.ON_START;
            }
            nVar2 = nVar;
            ?? g0Var2 = new g0(nVar2, objectRef3, coroutineScope, l.a(state), kVar, new jr.b(), function2);
            objectRef.element = g0Var2;
            Intrinsics.checkNotNull(g0Var2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
            lifecycle.a(g0Var2);
            objR = kVar.r();
            if (objR == aVar) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
            if (objR == aVar) {
                return aVar;
            }
            objectRef2 = objectRef3;
            job2 = (Job) objectRef2.element;
            if (job2 != null) {
                job2.f(null);
            }
            tVar2 = (t) objectRef.element;
            if (tVar2 != null) {
                lifecycle.c(tVar2);
            }
            return Unit.f14616a;
        } catch (Throwable th4) {
            th2 = th4;
            objectRef2 = objectRef3;
            job = (Job) objectRef2.element;
            if (job != null) {
                job.f(null);
            }
            tVar = (t) objectRef.element;
            if (tVar != null) {
                throw th2;
            }
            lifecycle.c(tVar);
            throw th2;
        }
    }
}
