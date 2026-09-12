package com.facebook.imagepipeline.backends.okhttp3;

import android.os.Looper;
import com.facebook.imagepipeline.producers.f;
import com.google.firebase.messaging.s;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Call f4795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OkHttpNetworkFetcher f4796b;

    public a(Call call, OkHttpNetworkFetcher okHttpNetworkFetcher) {
        this.f4795a = call;
        this.f4796b = okHttpNetworkFetcher;
    }

    @Override // com.facebook.imagepipeline.producers.f
    public final void a() {
        boolean zAreEqual = Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
        Call call = this.f4795a;
        if (zAreEqual) {
            this.f4796b.cancellationExecutor.execute(new s(8, call));
        } else {
            call.cancel();
        }
    }
}
