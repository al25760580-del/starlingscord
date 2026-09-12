package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f6491d;

    public b(ClockFaceView clockFaceView) {
        this.f6491d = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f6491d;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f6477v.f6484v) - clockFaceView.I;
        if (height != clockFaceView.f6496e) {
            clockFaceView.f6496e = height;
            clockFaceView.c();
            ClockHandView clockHandView = clockFaceView.f6477v;
            clockHandView.I = clockFaceView.f6496e;
            clockHandView.invalidate();
        }
        return true;
    }
}
