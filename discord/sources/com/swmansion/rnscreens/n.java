package com.swmansion.rnscreens;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Screen f7216e;

    public /* synthetic */ n(Screen screen, int i7) {
        this.f7215d = i7;
        this.f7216e = screen;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f7215d;
        Screen screen = this.f7216e;
        switch (i7) {
            case 0:
                ConcurrentHashMap concurrentHashMap = NativeProxy.f7127a;
                screen.startRemovalTransition();
                break;
            default:
                Screen.Companion companion = Screen.Companion;
                screen.getParent().requestLayout();
                screen.onSheetYTranslationChanged$react_native_screens_release();
                break;
        }
    }
}
