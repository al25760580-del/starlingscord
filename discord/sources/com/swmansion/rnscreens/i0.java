package com.swmansion.rnscreens;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f7203a;

    public final void a(ScreenStackHeaderConfig config, Screen screen) {
        Intrinsics.checkNotNullParameter(config, "config");
        int height = config.F ? 0 : config.getToolbar().getHeight();
        Integer num = this.f7203a;
        if (num != null && height == num.intValue()) {
            return;
        }
        this.f7203a = Integer.valueOf(height);
        if (screen != null) {
            screen.notifyHeaderHeightChange$react_native_screens_release(height);
        }
    }
}
