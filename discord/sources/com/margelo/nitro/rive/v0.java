package com.margelo.nitro.rive;

import android.util.Log;
import androidx.core.performance.play.services.PlayServicesDevicePerformance;
import androidx.work.CoroutineWorker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends xn.h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6985e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6986i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(Object obj, Continuation continuation, int i7) {
        super(2, continuation);
        this.f6984d = i7;
        this.f6986i = obj;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f6984d) {
            case 0:
                return new v0((HybridRiveView) this.f6986i, continuation, 0);
            case 1:
                return new v0((dr.t) this.f6986i, continuation, 1);
            case 2:
                return new v0((PlayServicesDevicePerformance) this.f6986i, continuation, 2);
            default:
                return new v0((CoroutineWorker) this.f6986i, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f6984d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((v0) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6984d) {
            case 0:
                wn.a aVar = wn.a.f22354d;
                int i7 = this.f6985e;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                    return obj;
                }
                ib.a.L(obj);
                em.m view = ((HybridRiveView) this.f6986i).getView();
                this.f6985e = 1;
                Object objW = view.f8469i.w(this);
                return objW == aVar ? aVar : objW;
            case 1:
                wn.a aVar2 = wn.a.f22354d;
                int i10 = this.f6985e;
                if (i10 == 0) {
                    ib.a.L(obj);
                    dr.t tVar = (dr.t) this.f6986i;
                    this.f6985e = 1;
                    Object objCollect = tVar.collect(er.u.f8713d, this);
                    if (objCollect != aVar2) {
                        objCollect = Unit.f14616a;
                    }
                    if (objCollect == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
                return Unit.f14616a;
            case 2:
                PlayServicesDevicePerformance playServicesDevicePerformance = (PlayServicesDevicePerformance) this.f6986i;
                g1.a aVar3 = playServicesDevicePerformance.f1573c;
                String str = playServicesDevicePerformance.f1572b;
                wn.a aVar4 = wn.a.f22354d;
                int i11 = this.f6985e;
                if (i11 == 0) {
                    ib.a.L(obj);
                    dr.t tVar2 = new dr.t(((e2.z) playServicesDevicePerformance.f1571a.f9267e).f7948c, playServicesDevicePerformance);
                    this.f6985e = 1;
                    obj = dr.z.j(tVar2, this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
                Integer num = (Integer) obj;
                Log.v(str, "Stored mpc is " + num);
                Log.v(str, "Default mpc is " + aVar3.f9457a);
                int iMax = Math.max(num != null ? num.intValue() : 0, aVar3.f9457a);
                Log.v(str, "Mpc value used " + iMax);
                return new Integer(iMax);
            default:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.f6986i;
                g4.j jVar = coroutineWorker.f2809x;
                wn.a aVar5 = wn.a.f22354d;
                int i12 = this.f6985e;
                try {
                    if (i12 == 0) {
                        ib.a.L(obj);
                        this.f6985e = 1;
                        obj = coroutineWorker.f();
                        if (obj == aVar5) {
                            return aVar5;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.a.L(obj);
                    }
                    jVar.j((v3.o) obj);
                    break;
                } catch (Throwable th2) {
                    jVar.k(th2);
                }
                return Unit.f14616a;
        }
    }
}
