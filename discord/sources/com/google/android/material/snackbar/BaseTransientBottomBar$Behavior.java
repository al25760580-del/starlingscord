package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import kh.f;
import l1.c;

/* JADX INFO: loaded from: classes3.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f6436h;

    public BaseTransientBottomBar$Behavior() {
        f fVar = new f(12);
        this.f6268e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f6269f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f6267d = 0;
        this.f6436h = fVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, v0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f6436h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (c.f14814b == null) {
                    c.f14814b = new c(1);
                }
                synchronized (c.f14814b.f14815a) {
                }
            }
        } else if (coordinatorLayout.i(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (c.f14814b == null) {
                c.f14814b = new c(1);
            }
            synchronized (c.f14814b.f14815a) {
            }
        }
        return super.g(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean s(View view) {
        this.f6436h.getClass();
        return view instanceof mh.c;
    }
}
