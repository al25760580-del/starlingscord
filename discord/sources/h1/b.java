package h1;

import android.util.Log;
import androidx.core.performance.play.services.PlayServicesDevicePerformance;
import ar.b0;
import ar.p;
import b4.d;
import e2.a0;
import e2.i;
import e2.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ PlayServicesDevicePerformance f10281e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10282i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PlayServicesDevicePerformance playServicesDevicePerformance, int i7, Continuation continuation) {
        super(2, continuation);
        this.f10281e = playServicesDevicePerformance;
        this.f10282i = i7;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f10281e, this.f10282i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.f10280d;
        int i10 = this.f10282i;
        PlayServicesDevicePerformance playServicesDevicePerformance = this.f10281e;
        if (i7 == 0) {
            ib.a.L(obj);
            this.f10280d = 1;
            fj.c cVar = playServicesDevicePerformance.f1571a;
            d dVar = new d(new d(playServicesDevicePerformance, i10, (Continuation) null), (Continuation) null, 11);
            z zVar = (z) cVar.f9267e;
            d dVar2 = new d(dVar, null);
            zVar.getClass();
            p pVarA = b0.a();
            zVar.f7953h.A(new i(dVar2, pVarA, (a0) zVar.f7951f.getValue(), getContext()));
            Object objW = pVarA.w(this);
            wn.a aVar2 = wn.a.f22354d;
            if (objW != aVar) {
                objW = Unit.f14616a;
            }
            if (objW == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
        }
        Log.v(playServicesDevicePerformance.f1572b, "Saved mediaPerformanceClass " + i10);
        return Unit.f14616a;
    }
}
