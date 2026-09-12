package com.facebook.imagepipeline.producers;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Future f4945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f4946b;

    public b0(Future future, v0 v0Var) {
        this.f4945a = future;
        this.f4946b = v0Var;
    }

    @Override // com.facebook.imagepipeline.producers.f
    public final void a() {
        if (this.f4945a.cancel(false)) {
            this.f4946b.a();
        }
    }
}
