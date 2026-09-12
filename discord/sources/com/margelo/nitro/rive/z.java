package com.margelo.nitro.rive;

import android.app.Activity;
import com.margelo.nitro.core.HybridObject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends xn.h implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HybridObject f7003e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7004i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(HybridObject hybridObject, Object obj, Continuation continuation, int i7) {
        super(1, continuation);
        this.f7002d = i7;
        this.f7003e = hybridObject;
        this.f7004i = obj;
    }

    @Override // xn.a
    public final Continuation create(Continuation continuation) {
        switch (this.f7002d) {
            case 0:
                return new z((HybridRiveFile) this.f7003e, (ArtboardBy) this.f7004i, continuation, 0);
            case 1:
                return new z((HybridRiveFile) this.f7003e, (String) this.f7004i, continuation, 1);
            case 2:
                return new z((HybridRiveView) this.f7003e, (Function0) this.f7004i, continuation, 2);
            case 3:
                return new z((HybridViewModel) this.f7003e, (String) this.f7004i, continuation, 3);
            default:
                return new z((HybridViewModelInstance) this.f7003e, (String) this.f7004i, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.f7002d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((z) create(continuation)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f7002d;
        Object obj2 = this.f7004i;
        HybridObject hybridObject = this.f7003e;
        switch (i7) {
            case 0:
                wn.a aVar = wn.a.f22354d;
                ib.a.L(obj);
                return ((HybridRiveFile) hybridObject).defaultArtboardViewModel((ArtboardBy) obj2);
            case 1:
                wn.a aVar2 = wn.a.f22354d;
                ib.a.L(obj);
                return ((HybridRiveFile) hybridObject).viewModelByName((String) obj2);
            case 2:
                wn.a aVar3 = wn.a.f22354d;
                ib.a.L(obj);
                Activity currentActivity = ((HybridRiveView) hybridObject).getContext().getCurrentActivity();
                if (currentActivity != null) {
                    currentActivity.runOnUiThread(new s0(1, (Function0) obj2));
                }
                return Unit.f14616a;
            case 3:
                wn.a aVar4 = wn.a.f22354d;
                ib.a.L(obj);
                return ((HybridViewModel) hybridObject).createInstanceByName((String) obj2);
            default:
                wn.a aVar5 = wn.a.f22354d;
                ib.a.L(obj);
                return ((HybridViewModelInstance) hybridObject).viewModel((String) obj2);
        }
    }
}
