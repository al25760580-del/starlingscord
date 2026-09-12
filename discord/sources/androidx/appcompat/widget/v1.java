package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class v1 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w1 f1142e;

    public /* synthetic */ v1(w1 w1Var, int i7) {
        this.f1141d = i7;
        this.f1142e = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1141d) {
            case 0:
                ViewParent parent = this.f1142e.f1152v.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                w1 w1Var = this.f1142e;
                w1Var.a();
                View view = w1Var.f1152v;
                if (view.isEnabled() && !view.isLongClickable() && w1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    w1Var.f1155y = true;
                    break;
                }
                break;
        }
    }
}
