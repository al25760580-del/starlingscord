package com.facebook.react.runtime.internal.bolts;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Continuation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f5301e;

    public /* synthetic */ c(TaskCompletionSource taskCompletionSource, int i7) {
        this.f5300d = i7;
        this.f5301e = taskCompletionSource;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f5300d) {
            case 0:
                return Task.Companion.completeAfterTask$lambda$5$lambda$4(this.f5301e, task);
            default:
                return Task.Companion.call$lambda$2$lambda$0(this.f5301e, task);
        }
    }
}
