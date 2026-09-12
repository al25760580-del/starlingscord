package com.margelo.nitro.rive;

import app.rive.runtime.kotlin.core.File;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends xn.h implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HybridRiveFile f6908e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(HybridRiveFile hybridRiveFile, Continuation continuation, int i7) {
        super(1, continuation);
        this.f6907d = i7;
        this.f6908e = hybridRiveFile;
    }

    @Override // xn.a
    public final Continuation create(Continuation continuation) {
        switch (this.f6907d) {
            case 0:
                return new a0(this.f6908e, continuation, 0);
            case 1:
                return new a0(this.f6908e, continuation, 1);
            default:
                return new a0(this.f6908e, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.f6907d) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((a0) create(continuation)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f6907d;
        HybridRiveFile hybridRiveFile = this.f6908e;
        switch (i7) {
            case 0:
                wn.a aVar = wn.a.f22354d;
                ib.a.L(obj);
                return new Double(hybridRiveFile.getArtboardCount());
            case 1:
                wn.a aVar2 = wn.a.f22354d;
                ib.a.L(obj);
                return hybridRiveFile.getArtboardNames();
            default:
                wn.a aVar3 = wn.a.f22354d;
                ib.a.L(obj);
                File riveFile = hybridRiveFile.getRiveFile();
                if (riveFile == null) {
                    return new String[0];
                }
                int viewModelCount = riveFile.getViewModelCount();
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < viewModelCount; i10++) {
                    try {
                        arrayList.add(riveFile.getViewModelByIndex(i10).getName());
                    } catch (Exception unused) {
                    }
                }
                return arrayList.toArray(new String[0]);
        }
    }
}
