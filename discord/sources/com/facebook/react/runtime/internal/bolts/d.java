package com.facebook.react.runtime.internal.bolts;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Continuation f5303e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Task f5304i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f5305v;

    public /* synthetic */ d(Continuation continuation, Task task, TaskCompletionSource taskCompletionSource, int i7) {
        this.f5302d = i7;
        this.f5303e = continuation;
        this.f5304i = task;
        this.f5305v = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5302d) {
            case 0:
                Task.Companion.completeImmediately$lambda$3(this.f5303e, this.f5304i, this.f5305v);
                break;
            default:
                Task.Companion.completeAfterTask$lambda$5(this.f5303e, this.f5304i, this.f5305v);
                break;
        }
    }
}
