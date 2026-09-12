package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Continuation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f5272e;

    public /* synthetic */ b(ReactHostImpl reactHostImpl, int i7) {
        this.f5271d = i7;
        this.f5272e = reactHostImpl;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f5271d) {
            case 0:
                return ReactHostImpl._get_jsBundleLoader_$lambda$46(this.f5272e, task);
            case 1:
                return ReactHostImpl.reload$lambda$8$lambda$7(this.f5272e, task);
            default:
                return ReactHostImpl.getOrCreateStartTask$lambda$30(this.f5272e, task);
        }
    }
}
