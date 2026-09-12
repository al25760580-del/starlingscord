package com.discord.analytics.touch;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ViewTreeObserver.OnWindowFocusChangeListener {
    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z5) {
        TouchLogger.startWindowMonitoring$lambda$8(z5);
    }
}
