package com.margelo.nitro.rive;

import android.content.Context;
import android.util.Log;
import android.view.Choreographer;
import app.rive.runtime.kotlin.core.Rive;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends xn.h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6965d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i7, Continuation continuation, int i10) {
        super(i7, continuation);
        this.f6965d = i10;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f6965d) {
            case 0:
                return new o0(2, continuation, 0);
            default:
                return new o0(2, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f6965d) {
            case 0:
                break;
        }
        return ((o0) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6965d) {
            case 0:
                wn.a aVar = wn.a.f22354d;
                ib.a.L(obj);
                synchronized (em.g.f8459a) {
                    try {
                        Context context = em.g.f8462d;
                        if (context == null) {
                            em.g.f8461c = "Context not available. Ensure RivePackage is registered.";
                            Log.e("RiveInitializer", "Manual init failed: " + em.g.f8461c);
                        } else if (!em.g.f8460b) {
                            try {
                                Rive.init$default(Rive.INSTANCE, context, null, 2, null);
                                em.g.f8460b = true;
                                em.g.f8461c = null;
                            } catch (Throwable th2) {
                                em.g.f8461c = em.g.a(th2);
                                Log.e("RiveInitializer", "Manual init failed: " + em.g.f8461c, th2);
                            }
                            break;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return Unit.f14616a;
            default:
                wn.a aVar2 = wn.a.f22354d;
                ib.a.L(obj);
                return Choreographer.getInstance();
        }
    }
}
