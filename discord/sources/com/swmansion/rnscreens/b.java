package com.swmansion.rnscreens;

import androidx.activity.OnBackPressedCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends OnBackPressedCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f7170d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(true);
        this.f7170d = cVar;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        this.f7170d.setIconified(true);
    }
}
