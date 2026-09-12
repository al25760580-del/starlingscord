package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.a;
import androidx.core.view.u0;
import androidx.customview.widget.ViewDragHelper;
import og.c;
import og.d;
import v0.b;

/* JADX INFO: loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewDragHelper f6264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6267d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f6268e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f6269f = 0.5f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f6270g = new c(this);

    @Override // v0.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zI = this.f6265b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zI = coordinatorLayout.i(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f6265b = zI;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f6265b = false;
        }
        if (zI) {
            if (this.f6264a == null) {
                this.f6264a = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.f6270g);
            }
            if (!this.f6266c && this.f6264a.r(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // v0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i7) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            u0.m(1048576, view);
            u0.j(0, view);
            if (s(view)) {
                u0.n(view, a.f1622m, null, new d(this));
            }
        }
        return false;
    }

    @Override // v0.b
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f6264a == null) {
            return false;
        }
        if (this.f6266c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f6264a.k(motionEvent);
        return true;
    }

    public boolean s(View view) {
        return true;
    }
}
