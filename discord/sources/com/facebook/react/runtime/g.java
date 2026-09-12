package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Continuation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f5286e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f5287i;

    public /* synthetic */ g(ReactHostImpl reactHostImpl, String str, int i7) {
        this.f5285d = i7;
        this.f5286e = reactHostImpl;
        this.f5287i = str;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f5285d) {
            case 0:
                return ReactHostImpl.getOrCreateReloadTask$lambda$58(this.f5286e, "getOrCreateReloadTask()", this.f5287i, task);
            case 1:
                return ReactHostImpl.reload$lambda$8$lambda$6$lambda$5(this.f5286e, this.f5287i, task);
            case 2:
                return ReactHostImpl.getOrCreateDestroyTask$lambda$66(this.f5286e, "getOrCreateDestroyTask()", this.f5287i, task);
            default:
                return ReactHostImpl.getOrCreateReactInstanceTask$lambda$45$lambda$41(this.f5286e, this.f5287i, task);
        }
    }
}
