package com.discord;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainApplication f3926e;

    public /* synthetic */ a(MainApplication mainApplication, int i7) {
        this.f3925d = i7;
        this.f3926e = mainApplication;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3925d) {
            case 0:
                return MainApplication.reactNativeInitializationTask$lambda$5(this.f3926e);
            default:
                return MainApplication.performInitialization$lambda$10(this.f3926e);
        }
    }
}
