package com.swmansion.rnscreens;

import com.facebook.react.views.view.ReactViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenContentWrapper extends ReactViewGroup {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s f7148d;

    public final s getDelegate$react_native_screens_release() {
        return this.f7148d;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        s sVar = this.f7148d;
        if (sVar != null) {
            sVar.onContentWrapperLayout(z5, i7, i10, i11, i12);
        }
    }

    public final void setDelegate$react_native_screens_release(s sVar) {
        this.f7148d = sVar;
    }
}
