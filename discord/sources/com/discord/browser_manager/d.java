package com.discord.browser_manager;

import com.facebook.react.bridge.Promise;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4002d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BrowserManagerModule f4003e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ BrowserManagerModule$openPlayStoreInline$listener$1 f4004i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Promise f4005v;

    public /* synthetic */ d(BrowserManagerModule browserManagerModule, BrowserManagerModule$openPlayStoreInline$listener$1 browserManagerModule$openPlayStoreInline$listener$1, Promise promise) {
        this.f4003e = browserManagerModule;
        this.f4004i = browserManagerModule$openPlayStoreInline$listener$1;
        this.f4005v = promise;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4002d) {
            case 0:
                return BrowserManagerModule.openPlayStoreInline$lambda$7(this.f4005v, this.f4003e, this.f4004i, ((Boolean) obj).booleanValue());
            default:
                return BrowserManagerModule.openPlayStoreInline$lambda$8(this.f4003e, this.f4004i, this.f4005v, (Exception) obj);
        }
    }

    public /* synthetic */ d(Promise promise, BrowserManagerModule browserManagerModule, BrowserManagerModule$openPlayStoreInline$listener$1 browserManagerModule$openPlayStoreInline$listener$1) {
        this.f4005v = promise;
        this.f4003e = browserManagerModule;
        this.f4004i = browserManagerModule$openPlayStoreInline$listener$1;
    }
}
