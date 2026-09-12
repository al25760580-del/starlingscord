package com.margelo.nitro.core;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rn.q;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vn.c f6898e;

    public /* synthetic */ g(vn.c cVar, int i7) {
        this.f6897d = i7;
        this.f6898e = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i7 = this.f6897d;
        vn.c cVar = this.f6898e;
        switch (i7) {
            case 0:
                q qVar = Result.f14614e;
                cVar.resumeWith(obj);
                break;
            default:
                Throwable error = (Throwable) obj;
                Intrinsics.checkNotNullParameter(error, "error");
                q qVar2 = Result.f14614e;
                cVar.resumeWith(ib.a.o(error));
                break;
        }
        return Unit.f14616a;
    }
}
