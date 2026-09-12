package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.discord.R;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends androidx.core.view.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f6492a;

    public c(ClockFaceView clockFaceView) {
        this.f6492a = clockFaceView;
    }

    @Override // androidx.core.view.b
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfoCompat.f1613a.setTraversalAfter((View) this.f6492a.E.get(iIntValue - 1));
        }
        accessibilityNodeInfoCompat.r(g.a.a(0, 1, iIntValue, 1, view.isSelected()));
        accessibilityNodeInfoCompat.p(true);
        accessibilityNodeInfoCompat.b(androidx.core.view.accessibility.a.f1618g);
    }

    @Override // androidx.core.view.b
    public final boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
        if (i7 != 16) {
            return super.performAccessibilityAction(view, i7, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f6492a;
        view.getHitRect(clockFaceView.f6478w);
        float fCenterX = clockFaceView.f6478w.centerX();
        float fCenterY = clockFaceView.f6478w.centerY();
        clockFaceView.f6477v.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f6477v.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
