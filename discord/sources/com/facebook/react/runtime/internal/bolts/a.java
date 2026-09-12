package com.facebook.react.runtime.internal.bolts;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Continuation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f5295e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Continuation f5296i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Executor f5297v;

    public /* synthetic */ a(TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, int i7) {
        this.f5294d = i7;
        this.f5295e = taskCompletionSource;
        this.f5296i = continuation;
        this.f5297v = executor;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f5294d) {
            case 0:
                return Task.continueWithTask$lambda$11$lambda$10(this.f5295e, this.f5296i, this.f5297v, task);
            default:
                return Task.continueWith$lambda$9$lambda$8(this.f5295e, this.f5296i, this.f5297v, task);
        }
    }
}
