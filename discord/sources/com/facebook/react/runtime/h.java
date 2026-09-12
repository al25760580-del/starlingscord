package com.facebook.react.runtime;

import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements QueueThreadExceptionHandler, BridgelessAtomicRef.Provider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f5288d;

    public /* synthetic */ h(ReactHostImpl reactHostImpl) {
        this.f5288d = reactHostImpl;
    }

    @Override // com.facebook.react.runtime.BridgelessAtomicRef.Provider
    public Object get() {
        return ReactHostImpl.getOrCreateReactInstanceTask$lambda$45(this.f5288d, "getOrCreateReactInstanceTask()");
    }

    @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
    public void handleException(Exception exc) {
        ReactHostImpl.getOrCreateReactInstanceTask$lambda$45$lambda$41$lambda$39(this.f5288d, exc);
    }
}
