package com.margelo.nitro.rive;

import app.rive.runtime.kotlin.core.RiveRenderImage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends xn.h implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f6952e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(p pVar, Continuation continuation) {
        super(1, continuation);
        this.f6952e = pVar;
    }

    @Override // xn.a
    public final Continuation create(Continuation continuation) {
        return new l0(this.f6952e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((l0) create((Continuation) obj)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.f6951d;
        if (i7 == 0) {
            ib.a.L(obj);
            p pVar = this.f6952e;
            g gVarA = pVar.a();
            this.f6951d = 1;
            obj = gVarA.a(pVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
        }
        byte[] bArr = (byte[]) obj;
        return new HybridRiveImage(RiveRenderImage.Companion.fromEncoded$default(RiveRenderImage.INSTANCE, bArr, null, 2, null), bArr.length);
    }
}
