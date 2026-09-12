package com.discord.browser_manager;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BrowserManagerModule f4007e;

    public /* synthetic */ e(BrowserManagerModule browserManagerModule, int i7) {
        this.f4006d = i7;
        this.f4007e = browserManagerModule;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4006d) {
            case 0:
                return BrowserManagerModule.openTrackedCustomTab$lambda$4$lambda$3(this.f4007e);
            default:
                return BrowserManagerModule.resumeTrackedCustomTab$lambda$6$lambda$5(this.f4007e);
        }
    }
}
