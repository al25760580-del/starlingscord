package com.facebook.react.runtime;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f5274e;

    public /* synthetic */ c(ReactHostImpl reactHostImpl, int i7) {
        this.f5273d = i7;
        this.f5274e = reactHostImpl;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5273d) {
            case 0:
                return this.f5274e.waitThenCallGetOrCreateReactInstanceTask();
            default:
                return this.f5274e.getOrCreateStartTask();
        }
    }
}
