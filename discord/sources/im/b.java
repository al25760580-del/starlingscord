package im;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends f {
    public static final double Z = Math.cos(Math.toRadians(30.0d / 2.0d));
    public static final double a0 = Math.cos(Math.toRadians(60.0d / 2.0d));
    public Handler V;
    public int W;
    public VelocityTracker Y;
    public int R = 1;
    public int S = 1;
    public final long T = 800;
    public final long U = 2000;
    public final com.google.firebase.messaging.s X = new com.google.firebase.messaging.s(20, this);

    public static final boolean N(b bVar, b0 b0Var, int i7, double d6) {
        b0 vector;
        if ((bVar.S & i7) != i7) {
            return false;
        }
        b0 b0Var2 = b0.f11872d;
        switch (i7) {
            case 1:
                vector = b0.f11873e;
                break;
            case 2:
                vector = b0.f11872d;
                break;
            case 3:
            case 7:
            default:
                vector = b0.f11878l;
                break;
            case 4:
                vector = b0.f11874f;
                break;
            case 5:
                vector = b0.f11876h;
                break;
            case 6:
                vector = b0.j;
                break;
            case 8:
                vector = b0.f11875g;
                break;
            case 9:
                vector = b0.f11877i;
                break;
            case 10:
                vector = b0.k;
                break;
        }
        Intrinsics.checkNotNullParameter(vector, "vector");
        return (b0Var.f11880b * vector.f11880b) + (b0Var.f11879a * vector.f11879a) > d6;
    }

    @Override // im.f
    public final void B() {
        VelocityTracker velocityTracker = this.Y;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.Y = null;
        Handler handler = this.V;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // im.f
    public final void D() {
        super.D();
        this.R = 1;
        this.S = 1;
    }

    public final boolean M(MotionEvent motionEvent) {
        boolean z5;
        boolean z6;
        VelocityTracker velocityTracker = this.Y;
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        Intrinsics.checkNotNull(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
        b0 b0Var = b0.f11872d;
        VelocityTracker tracker = this.Y;
        Intrinsics.checkNotNull(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        tracker.computeCurrentVelocity(1000);
        b0 b0Var2 = new b0(tracker.getXVelocity(), tracker.getYVelocity());
        Integer[] numArr = {2, 1, 4, 8};
        ArrayList arrayList = new ArrayList(4);
        for (int i7 = 0; i7 < 4; i7++) {
            arrayList.add(Boolean.valueOf(N(this, b0Var2, numArr[i7].intValue(), Z)));
        }
        Integer[] numArr2 = {5, 9, 6, 10};
        ArrayList arrayList2 = new ArrayList(4);
        for (int i10 = 0; i10 < 4; i10++) {
            arrayList2.add(Boolean.valueOf(N(this, b0Var2, numArr2[i10].intValue(), a0)));
        }
        if (arrayList.isEmpty()) {
            z5 = false;
            break;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z5 = false;
                break;
            }
            if (((Boolean) it.next()).booleanValue()) {
                z5 = true;
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            z6 = false;
            break;
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z6 = false;
                break;
            }
            if (((Boolean) it2.next()).booleanValue()) {
                z6 = true;
                break;
            }
        }
        boolean z7 = z5 | z6;
        boolean z10 = b0Var2.f11881c > ((double) this.U);
        if (this.W != this.R || !z7 || !z10) {
            return false;
        }
        Handler handler = this.V;
        Intrinsics.checkNotNull(handler);
        handler.removeCallbacksAndMessages(null);
        a(false);
        return true;
    }

    @Override // im.f
    public final void a(boolean z5) {
        super.a(z5);
        k();
    }

    @Override // im.f
    public final void w() {
        Handler handler = this.V;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // im.f
    public final void y(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (K(sourceEvent)) {
            return;
        }
        int i7 = this.f11896h;
        if (i7 == 0) {
            this.Y = VelocityTracker.obtain();
            d();
            this.W = 1;
            Handler handler = this.V;
            if (handler == null) {
                this.V = new Handler(Looper.getMainLooper());
            } else {
                Intrinsics.checkNotNull(handler);
                handler.removeCallbacksAndMessages(null);
            }
            Handler handler2 = this.V;
            Intrinsics.checkNotNull(handler2);
            handler2.postDelayed(this.X, this.T);
        }
        if (i7 == 2) {
            M(sourceEvent);
            if (sourceEvent.getPointerCount() > this.W) {
                this.W = sourceEvent.getPointerCount();
            }
            if (sourceEvent.getActionMasked() != 1 || M(sourceEvent)) {
                return;
            }
            m();
        }
    }
}
