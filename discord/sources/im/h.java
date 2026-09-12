package im;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends f {
    public Handler S;
    public final boolean R = true;
    public final com.google.firebase.messaging.s T = new com.google.firebase.messaging.s(21, this);
    public z U = new z();

    public static Boolean O(View view, View view2, View view3) {
        if (Intrinsics.areEqual(view3, view2)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual(view3, view)) {
            return Boolean.FALSE;
        }
        if (!(view3 instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view3;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            Intrinsics.checkNotNull(childAt);
            Boolean boolO = O(view, view2, childAt);
            if (boolO != null) {
                return boolO;
            }
        }
        return null;
    }

    @Override // im.f
    public final void B() {
        this.U = new z();
    }

    @Override // im.f
    public final boolean G(f handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (!(handler instanceof h) || ((h) handler).N(this)) {
            return super.G(handler);
        }
        View view = handler.f11894f;
        Intrinsics.checkNotNull(view);
        View view2 = this.f11894f;
        Intrinsics.checkNotNull(view2);
        Boolean boolO = O(view, view2, view.getRootView());
        Intrinsics.checkNotNull(boolO);
        return boolO.booleanValue();
    }

    @Override // im.f
    public final boolean I(f handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (((handler instanceof h) && (N(handler) || ((h) handler).N(this))) || (handler instanceof jm.l)) {
            return true;
        }
        return super.I(handler);
    }

    @Override // im.f
    public final boolean J(f handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if ((handler instanceof h) && !N(handler) && !((h) handler).N(this)) {
            View view = this.f11894f;
            Intrinsics.checkNotNull(view);
            View view2 = handler.f11894f;
            Intrinsics.checkNotNull(view2);
            Boolean boolO = O(view, view2, view.getRootView());
            if (boolO != null) {
                return boolO.booleanValue();
            }
        }
        return super.J(handler);
    }

    public final void M() {
        int i7 = this.f11896h;
        if (i7 == 0) {
            e();
        } else if (i7 == 2) {
            m();
        } else {
            if (i7 != 4) {
                return;
            }
            k();
        }
    }

    public final boolean N(f fVar) {
        View view = fVar.f11894f;
        while (view != null) {
            if (Intrinsics.areEqual(view, this.f11894f)) {
                return true;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return false;
    }

    @Override // im.f
    public final boolean t() {
        return this.R;
    }

    @Override // im.f
    public final void y(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (event.getAction() == 0) {
            Handler handler = this.S;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.S = null;
            return;
        }
        if (event.getAction() != 1 || this.k) {
            return;
        }
        M();
    }

    @Override // im.f
    public final void z(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (event.getAction() == 10) {
            if (this.S == null) {
                this.S = new Handler(Looper.getMainLooper());
            }
            Handler handler = this.S;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(this.T, 4L);
            return;
        }
        if (!this.k) {
            M();
            return;
        }
        if (this.f11896h == 4 && event.getToolType(0) == 2) {
            this.U = ib.a.r(event);
            return;
        }
        if (this.f11896h == 0) {
            if (event.getAction() == 7 || event.getAction() == 9) {
                d();
                a(false);
            }
        }
    }
}
