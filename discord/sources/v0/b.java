package v0;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public boolean a(View view) {
        return false;
    }

    public boolean b(View view, View view2) {
        return false;
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i7) {
        return false;
    }

    public boolean i(CoordinatorLayout coordinatorLayout, View view, int i7, int i10, int i11) {
        return false;
    }

    public boolean j(View view) {
        return false;
    }

    public void l(CoordinatorLayout coordinatorLayout, View view, int i7, int i10, int i11, int[] iArr) {
        iArr[0] = iArr[0] + i10;
        iArr[1] = iArr[1] + i11;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z5) {
        return false;
    }

    public Parcelable o(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i10) {
        return false;
    }

    public boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public void f() {
    }

    public void c(d dVar) {
    }

    public void e(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void n(View view, Parcelable parcelable) {
    }

    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i7) {
    }

    public void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i10, int[] iArr, int i11) {
    }
}
