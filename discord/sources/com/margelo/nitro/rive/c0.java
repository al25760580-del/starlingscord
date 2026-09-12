package com.margelo.nitro.rive;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends xn.h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6917e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f6918i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ HybridRiveFileFactory f6919v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ReferencedAssetsType f6920w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(String str, HybridRiveFileFactory hybridRiveFileFactory, ReferencedAssetsType referencedAssetsType, Continuation continuation, int i7) {
        super(2, continuation);
        this.f6916d = i7;
        this.f6918i = str;
        this.f6919v = hybridRiveFileFactory;
        this.f6920w = referencedAssetsType;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f6916d) {
            case 0:
                return new c0(this.f6918i, this.f6919v, this.f6920w, continuation, 0);
            case 1:
                return new c0(this.f6918i, this.f6919v, this.f6920w, continuation, 1);
            default:
                return new c0(this.f6918i, this.f6919v, this.f6920w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f6916d) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((c0) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i7 = this.f6916d;
        ReferencedAssetsType referencedAssetsType = this.f6920w;
        HybridRiveFileFactory hybridRiveFileFactory = this.f6919v;
        String str = this.f6918i;
        switch (i7) {
            case 0:
                wn.a aVar = wn.a.f22354d;
                int i10 = this.f6917e;
                if (i10 == 0) {
                    ib.a.L(obj);
                    this.f6917e = 1;
                    hr.e eVar = ar.k0.f2938a;
                    obj = ar.b0.A(hr.d.f11103i, new t(str, null, 0), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
                return hybridRiveFileFactory.buildRiveFile((byte[]) obj, referencedAssetsType);
            case 1:
                wn.a aVar2 = wn.a.f22354d;
                int i11 = this.f6917e;
                if (i11 == 0) {
                    ib.a.L(obj);
                    this.f6917e = 1;
                    hr.e eVar2 = ar.k0.f2938a;
                    obj = ar.b0.A(hr.d.f11103i, new t(str, null, 3), this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
                return hybridRiveFileFactory.buildRiveFile((byte[]) obj, referencedAssetsType);
            default:
                wn.a aVar3 = wn.a.f22354d;
                int i12 = this.f6917e;
                if (i12 == 0) {
                    ib.a.L(obj);
                    this.f6917e = 1;
                    hr.e eVar3 = ar.k0.f2938a;
                    obj = ar.b0.A(hr.d.f11103i, new t(str, null, 1), this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
                return hybridRiveFileFactory.buildRiveFile((byte[]) obj, referencedAssetsType);
        }
    }
}
