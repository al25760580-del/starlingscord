package com.margelo.nitro.rive;

import java.net.URI;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends xn.h implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6926e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f6927i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ HybridRiveFileFactory f6928v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ReferencedAssetsType f6929w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(String str, HybridRiveFileFactory hybridRiveFileFactory, ReferencedAssetsType referencedAssetsType, Continuation continuation, int i7) {
        super(1, continuation);
        this.f6925d = i7;
        this.f6927i = str;
        this.f6928v = hybridRiveFileFactory;
        this.f6929w = referencedAssetsType;
    }

    @Override // xn.a
    public final Continuation create(Continuation continuation) {
        switch (this.f6925d) {
            case 0:
                return new d0(this.f6927i, this.f6928v, this.f6929w, continuation, 0);
            case 1:
                return new d0(this.f6927i, this.f6928v, this.f6929w, continuation, 1);
            default:
                return new d0(this.f6927i, this.f6928v, this.f6929w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.f6925d) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((d0) create(continuation)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f6925d) {
            case 0:
                String str = this.f6927i;
                wn.a aVar = wn.a.f22354d;
                int i7 = this.f6926e;
                try {
                    if (i7 == 0) {
                        ib.a.L(obj);
                        String path = new URI(str).getPath();
                        if (path == null) {
                            throw new Error("fromFileURL: Invalid URL: ".concat(str));
                        }
                        hr.e eVar = ar.k0.f2938a;
                        hr.d dVar = hr.d.f11103i;
                        c0 c0Var = new c0(path, this.f6928v, this.f6929w, null, 0);
                        this.f6926e = 1;
                        obj = ar.b0.A(dVar, c0Var, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.a.L(obj);
                    }
                    s sVar = (s) obj;
                    HybridRiveFile hybridRiveFile = new HybridRiveFile();
                    hybridRiveFile.setRiveFile(sVar.f6975a);
                    hybridRiveFile.setReferencedAssetCache(sVar.f6976b);
                    hybridRiveFile.setAssetLoader(sVar.f6977c);
                    return hybridRiveFile;
                } catch (Exception e10) {
                    throw new Error(a3.e.l("Failed to load Rive file: ", e10.getMessage()));
                }
            case 1:
                wn.a aVar2 = wn.a.f22354d;
                int i10 = this.f6926e;
                try {
                    if (i10 == 0) {
                        ib.a.L(obj);
                        hr.e eVar2 = ar.k0.f2938a;
                        hr.d dVar2 = hr.d.f11103i;
                        c0 c0Var2 = new c0(this.f6927i, this.f6928v, this.f6929w, null, 1);
                        this.f6926e = 1;
                        obj = ar.b0.A(dVar2, c0Var2, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.a.L(obj);
                    }
                    s sVar2 = (s) obj;
                    HybridRiveFile hybridRiveFile2 = new HybridRiveFile();
                    hybridRiveFile2.setRiveFile(sVar2.f6975a);
                    hybridRiveFile2.setReferencedAssetCache(sVar2.f6976b);
                    hybridRiveFile2.setAssetLoader(sVar2.f6977c);
                    return hybridRiveFile2;
                } catch (Exception e11) {
                    throw new Error(a3.e.l("Failed to load Rive file: ", e11.getMessage()));
                }
            default:
                wn.a aVar3 = wn.a.f22354d;
                int i11 = this.f6926e;
                try {
                    if (i11 == 0) {
                        ib.a.L(obj);
                        hr.e eVar3 = ar.k0.f2938a;
                        hr.d dVar3 = hr.d.f11103i;
                        c0 c0Var3 = new c0(this.f6927i, this.f6928v, this.f6929w, null, 2);
                        this.f6926e = 1;
                        obj = ar.b0.A(dVar3, c0Var3, this);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.a.L(obj);
                    }
                    s sVar3 = (s) obj;
                    HybridRiveFile hybridRiveFile3 = new HybridRiveFile();
                    hybridRiveFile3.setRiveFile(sVar3.f6975a);
                    hybridRiveFile3.setReferencedAssetCache(sVar3.f6976b);
                    hybridRiveFile3.setAssetLoader(sVar3.f6977c);
                    return hybridRiveFile3;
                } catch (Exception e12) {
                    throw new Error(a3.e.l("Failed to download Rive file: ", e12.getMessage()), e12);
                }
        }
    }
}
