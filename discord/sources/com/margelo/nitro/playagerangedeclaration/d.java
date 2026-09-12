package com.margelo.nitro.playagerangedeclaration;

import android.util.Log;
import ar.b0;
import ar.k;
import ar.k0;
import com.facebook.react.bridge.ReactApplicationContext;
import com.margelo.nitro.NitroModules;
import com.margelo.nitro.rive.HybridFallbackFont;
import com.margelo.nitro.rive.HybridRiveView;
import com.margelo.nitro.rive.t;
import com.margelo.nitro.rive.v0;
import fr.q;
import ig.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xn.h;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends h implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6903e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6904i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Continuation continuation, int i7) {
        super(1, continuation);
        this.f6902d = i7;
        this.f6904i = obj;
    }

    @Override // xn.a
    public final Continuation create(Continuation continuation) {
        switch (this.f6902d) {
            case 0:
                return new d((PlayAgeRangeDeclaration) this.f6904i, continuation, 0);
            case 1:
                return new d((String) this.f6904i, continuation, 1);
            default:
                return new d((HybridRiveView) this.f6904i, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.f6902d) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i7 = this.f6902d;
        int i10 = 0;
        Continuation continuation = null;
        Object obj2 = this.f6904i;
        switch (i7) {
            case 0:
                wn.a aVar = wn.a.f22354d;
                int i11 = this.f6903e;
                try {
                    if (i11 == 0) {
                        ib.a.L(obj);
                        NitroModules.Companion.getClass();
                        ReactApplicationContext context = NitroModules.applicationContext;
                        if (context == null) {
                            throw new IllegalStateException("Application context not available");
                        }
                        Intrinsics.checkNotNullParameter(context, "context");
                        ph.c cVar = new ph.c(new ph.g(context));
                        Intrinsics.checkNotNullExpressionValue(cVar, "create(...)");
                        kh.f fVar = new kh.f(14);
                        Intrinsics.checkNotNullExpressionValue(fVar, "build(...)");
                        this.f6903e = 1;
                        k kVar = new k(1, wn.f.b(this));
                        kVar.t();
                        l lVarH = cVar.h(fVar);
                        ga.l lVar = new ga.l(new c(kVar, 0));
                        lVarH.getClass();
                        lVarH.e(ig.h.f11764a, lVar);
                        lVarH.o(new fj.c(8, kVar));
                        obj = kVar.r();
                        if (obj == aVar) {
                            Intrinsics.checkNotNullParameter(this, "frame");
                        }
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.a.L(obj);
                    }
                    return (PlayAgeRangeDeclarationResult) obj;
                } catch (Exception e10) {
                    Log.e("PlayAgeRangeDeclaration", "Initialization error", e10);
                    return new PlayAgeRangeDeclarationResult(false, null, null, a3.e.l("AGE_SIGNALS_INIT_ERROR: ", e10.getMessage()), null, null, null);
                }
            case 1:
                wn.a aVar2 = wn.a.f22354d;
                int i12 = this.f6903e;
                if (i12 == 0) {
                    ib.a.L(obj);
                    hr.e eVar = k0.f2938a;
                    hr.d dVar = hr.d.f11103i;
                    t tVar = new t((String) obj2, continuation, 2);
                    this.f6903e = 1;
                    obj = b0.A(dVar, tVar, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
                return new HybridFallbackFont((byte[]) obj);
            default:
                wn.a aVar3 = wn.a.f22354d;
                int i13 = this.f6903e;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                    return obj;
                }
                ib.a.L(obj);
                hr.e eVar2 = k0.f2938a;
                br.d dVar2 = q.f9394a;
                v0 v0Var = new v0((HybridRiveView) obj2, continuation, i10);
                this.f6903e = 1;
                Object objA = b0.A(dVar2, v0Var, this);
                return objA == aVar3 ? aVar3 : objA;
        }
    }
}
