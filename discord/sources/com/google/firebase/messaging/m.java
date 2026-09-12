package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements mi.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi.q f6597e;

    public /* synthetic */ m(mi.q qVar, int i7) {
        this.f6596d = i7;
        this.f6597e = qVar;
    }

    @Override // mi.e
    public final Object a(zl.e eVar) {
        switch (this.f6596d) {
            case 0:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.f6597e, eVar);
            default:
                return new vi.c((Context) eVar.b(Context.class), ((ji.f) eVar.b(ji.f.class)).c(), eVar.f(mi.q.a(vi.d.class)), eVar.c(fj.b.class), (Executor) eVar.d(this.f6597e));
        }
    }
}
