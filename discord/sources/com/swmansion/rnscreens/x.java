package com.swmansion.rnscreens;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends FrameLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        if (getVisibility() != 4) {
            super.clearFocus();
        }
    }
}
