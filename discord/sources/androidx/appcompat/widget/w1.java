package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class w1 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public int E;
    public final int[] F = new int[2];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1150e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1151i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f1152v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v1 f1153w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public v1 f1154x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1155y;

    public w1(View view) {
        this.f1152v = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1149d = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1150e = tapTimeout;
        this.f1151i = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        v1 v1Var = this.f1154x;
        View view = this.f1152v;
        if (v1Var != null) {
            view.removeCallbacks(v1Var);
        }
        v1 v1Var2 = this.f1153w;
        if (v1Var2 != null) {
            view.removeCallbacks(v1Var2);
        }
    }

    public abstract n.z b();

    public abstract boolean c();

    public boolean d() {
        n.z zVarB = b();
        if (zVarB == null || !zVarB.isShowing()) {
            return true;
        }
        zVarB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z5;
        t1 t1VarG;
        boolean z6 = this.f1155y;
        View view2 = this.f1152v;
        if (z6) {
            n.z zVarB = b();
            if (zVarB != null && zVarB.isShowing() && (t1VarG = zVarB.g()) != null && t1VarG.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.F;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                t1VarG.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = t1VarG.b(motionEventObtainNoHistory, this.E);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z7 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z7) {
                    z5 = true;
                } else if (d()) {
                    z5 = false;
                } else {
                    z5 = true;
                }
            } else if (d()) {
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.E = motionEvent.getPointerId(0);
                    if (this.f1153w == null) {
                        this.f1153w = new v1(this, 0);
                    }
                    view2.postDelayed(this.f1153w, this.f1150e);
                    if (this.f1154x == null) {
                        this.f1154x = new v1(this, 1);
                    }
                    view2.postDelayed(this.f1154x, this.f1151i);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.E);
                    if (iFindPointerIndex >= 0) {
                        float x5 = motionEvent.getX(iFindPointerIndex);
                        float y5 = motionEvent.getY(iFindPointerIndex);
                        float f2 = this.f1149d;
                        float f7 = -f2;
                        if (x5 < f7 || y5 < f7 || x5 >= (view2.getRight() - view2.getLeft()) + f2 || y5 >= (view2.getBottom() - view2.getTop()) + f2) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z5 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z5 = false;
            } else {
                z5 = false;
            }
            if (z5) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f1155y = z5;
        return z5 || z6;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1155y = false;
        this.E = -1;
        v1 v1Var = this.f1153w;
        if (v1Var != null) {
            this.f1152v.removeCallbacks(v1Var);
        }
    }
}
