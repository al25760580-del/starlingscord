package com.facebook.react.runtime.internal.bolts;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Continuation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Continuation f5299e;

    public /* synthetic */ b(Continuation continuation, int i7) {
        this.f5298d = i7;
        this.f5299e = continuation;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f5298d) {
            case 0:
                return Task.onSuccess$lambda$12(this.f5299e, task);
            default:
                return Task.onSuccessTask$lambda$13(this.f5299e, task);
        }
    }
}
