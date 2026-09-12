package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements View.OnTouchListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f6500d;

    public l(GestureDetector gestureDetector) {
        this.f6500d = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f6500d.onTouchEvent(motionEvent);
        }
        return false;
    }
}
