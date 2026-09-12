package com.facebook.react;

import com.facebook.react.bridge.ReactApplicationContext;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ReactInstanceManager f5153e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5154i;

    public /* synthetic */ c(ReactInstanceManager reactInstanceManager, Object obj, int i7) {
        this.f5152d = i7;
        this.f5153e = reactInstanceManager;
        this.f5154i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5152d) {
            case 0:
                this.f5153e.lambda$runCreateReactContextOnNewThread$2((ReactInstanceManager.ReactContextInitParams) this.f5154i);
                break;
            default:
                this.f5153e.lambda$runCreateReactContextOnNewThread$1((ReactApplicationContext) this.f5154i);
                break;
        }
    }
}
