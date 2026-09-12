package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimePickerView f6499d;

    public k(TimePickerView timePickerView) {
        this.f6499d = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i7 = TimePickerView.f6488e;
        this.f6499d.getClass();
        return false;
    }
}
