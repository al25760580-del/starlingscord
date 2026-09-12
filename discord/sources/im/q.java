package im;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;
import com.facebook.react.views.text.ReactTextView;
import com.facebook.react.views.textinput.ReactEditText;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends f {
    public static final rn.u Z = rn.l.b(new i5.a(1));
    public static final m a0 = new m(0);
    public boolean S;
    public boolean T;
    public boolean U;
    public Boolean V;
    public View W;
    public k Y;
    public final boolean R = true;
    public o X = a0;

    public q() {
        this.E = true;
    }

    @Override // im.f
    public final void A() {
        View view;
        KeyEvent.Callback callback = this.f11894f;
        if (callback instanceof o) {
            this.X = (o) callback;
        } else if (callback instanceof ReactEditText) {
            this.X = new n(this, (ReactEditText) callback);
        } else if (callback instanceof ReactSwipeRefreshLayout) {
            this.X = new p(this, (ReactSwipeRefreshLayout) callback);
        } else if ((callback instanceof ReactScrollView) || (callback instanceof ReactHorizontalScrollView)) {
            this.X = new m(2);
        } else if (callback instanceof ReactTextView) {
            this.X = new m(3);
        } else if (callback instanceof ReactViewGroup) {
            this.X = new m(1);
        }
        Boolean bool = this.V;
        if (bool == null || (view = this.f11894f) == null || !ga.k.r(view, bool)) {
            return;
        }
        this.W = view;
    }

    @Override // im.f
    public final void B() {
        this.X = a0;
        this.Y = null;
        View view = this.W;
        if (view != null) {
            ga.k.r(view, null);
        }
        this.W = null;
    }

    @Override // im.f
    public final void D() {
        super.D();
        this.S = false;
        this.T = false;
        this.U = false;
        this.E = true;
        this.V = Boolean.TRUE;
    }

    @Override // im.f
    public final boolean G(f handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return M(handler);
    }

    @Override // im.f
    public final boolean H(ArrayList recorded) {
        Intrinsics.checkNotNullParameter(recorded, "recorded");
        return this.X.d(recorded, this);
    }

    @Override // im.f
    public final boolean I(f handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Boolean boolH = this.X.h(handler);
        if (boolH != null) {
            return boolH.booleanValue();
        }
        if (super.I(handler)) {
            return true;
        }
        if ((handler instanceof q) && handler.f11896h == 4) {
            q qVar = (q) handler;
            if (qVar.T && !qVar.U) {
                return false;
            }
        }
        boolean zM = M(handler);
        int i7 = handler.f11896h;
        int i10 = this.f11896h;
        if (!(i10 == 4 && i7 == 4 && zM) && i10 == 4 && zM) {
            return !this.X.a() || handler.f11892d > 0;
        }
        return false;
    }

    public final boolean M(f other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (this.T) {
            return this.U && other.t();
        }
        return true;
    }

    public final void N() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setAction(3);
        o oVar = this.X;
        View view = this.f11894f;
        Intrinsics.checkNotNull(motionEventObtain);
        oVar.g(view, motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // im.f
    public final void g(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        k kVar = new k(this.k, this.D, this.I);
        if (Intrinsics.areEqual(kVar, this.Y)) {
            return;
        }
        this.Y = kVar;
        super.g(event);
    }

    @Override // im.f
    public final void h(int i7, int i10) {
        this.Y = null;
        super.h(i7, i10);
    }

    @Override // im.f
    public final boolean t() {
        return this.R;
    }

    @Override // im.f
    public final void w() {
        N();
    }

    @Override // im.f
    public final void x() {
        N();
    }

    @Override // im.f
    public final void y(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        View view = this.f11894f;
        Intrinsics.checkNotNull(view);
        if (event.getActionMasked() == 1) {
            if (this.f11896h != 0 || this.X.b(event)) {
                this.X.g(view, event);
                int i7 = this.f11896h;
                if ((i7 == 0 || i7 == 2) && this.X.e(view)) {
                    a(false);
                }
                if (this.f11896h == 0) {
                    e();
                } else {
                    k();
                }
            } else {
                e();
            }
            this.X.i(event);
            return;
        }
        int i10 = this.f11896h;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 4) {
                this.X.g(view, event);
                return;
            }
            return;
        }
        if (i10 != 2 && this.X.b(event)) {
            d();
        }
        if (this.S) {
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).onInterceptTouchEvent(event);
            }
            this.X.g(view, event);
            a(false);
            return;
        }
        if ((view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(event)) {
            this.X.g(view, event);
            a(false);
        } else if (this.X.c()) {
            this.X.f(event);
        }
    }
}
