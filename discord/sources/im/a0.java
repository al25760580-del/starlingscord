package im;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends f {
    public float Z;
    public float a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f11866b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f11867c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f11868d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f11869e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Handler f11870f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f11871g0;
    public float R = Float.MIN_VALUE;
    public float S = Float.MIN_VALUE;
    public float T = Float.MIN_VALUE;
    public long U = 500;
    public long V = 200;
    public int W = 1;
    public int X = 1;
    public int Y = 1;
    public final com.google.firebase.messaging.s h0 = new com.google.firebase.messaging.s(24, this);

    public a0() {
        this.E = true;
    }

    @Override // im.f
    public final void B() {
        this.f11871g0 = 0;
        this.Y = 0;
        Handler handler = this.f11870f0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // im.f
    public final void D() {
        super.D();
        this.R = Float.MIN_VALUE;
        this.S = Float.MIN_VALUE;
        this.T = Float.MIN_VALUE;
        this.U = 500L;
        this.V = 200L;
        this.W = 1;
        this.X = 1;
        this.E = true;
    }

    public final void M() {
        Handler handler = this.f11870f0;
        if (handler == null) {
            this.f11870f0 = new Handler(Looper.getMainLooper());
        } else {
            Intrinsics.checkNotNull(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f11870f0;
        Intrinsics.checkNotNull(handler2);
        handler2.postDelayed(this.h0, this.U);
    }

    @Override // im.f
    public final void a(boolean z5) {
        super.a(z5);
        k();
    }

    @Override // im.f
    public final void w() {
        Handler handler = this.f11870f0;
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
        int actionMasked = sourceEvent.getActionMasked();
        if (i7 == 0) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
            this.f11866b0 = 0.0f;
            this.f11867c0 = 0.0f;
            this.Z = e4.f.A(sourceEvent, true);
            this.a0 = e4.f.B(sourceEvent, true);
        }
        if (actionMasked == 5 || actionMasked == 6) {
            this.f11866b0 = (this.f11868d0 - this.Z) + this.f11866b0;
            this.f11867c0 = (this.f11869e0 - this.a0) + this.f11867c0;
            this.f11868d0 = e4.f.A(sourceEvent, true);
            float fB = e4.f.B(sourceEvent, true);
            this.f11869e0 = fB;
            this.Z = this.f11868d0;
            this.a0 = fB;
        } else {
            this.f11868d0 = e4.f.A(sourceEvent, true);
            this.f11869e0 = e4.f.B(sourceEvent, true);
        }
        if (this.Y < sourceEvent.getPointerCount()) {
            this.Y = sourceEvent.getPointerCount();
        }
        float f2 = (this.f11868d0 - this.Z) + this.f11866b0;
        if (this.R == Float.MIN_VALUE || Math.abs(f2) <= this.R) {
            float f7 = (this.f11869e0 - this.a0) + this.f11867c0;
            if (this.S == Float.MIN_VALUE || Math.abs(f7) <= this.S) {
                float f10 = (f2 * f2) + (f7 * f7);
                float f11 = this.T;
                if (f11 == Float.MIN_VALUE || f10 <= f11 * f11) {
                    if (i7 == 0) {
                        if (actionMasked == 0 || actionMasked == 11) {
                            d();
                        }
                        M();
                        return;
                    }
                    if (i7 == 2) {
                        if (actionMasked != 0) {
                            if (actionMasked != 1) {
                                if (actionMasked != 11) {
                                    if (actionMasked != 12) {
                                        return;
                                    }
                                }
                            }
                            Handler handler = this.f11870f0;
                            if (handler == null) {
                                this.f11870f0 = new Handler(Looper.getMainLooper());
                            } else {
                                Intrinsics.checkNotNull(handler);
                                handler.removeCallbacksAndMessages(null);
                            }
                            int i10 = this.f11871g0 + 1;
                            this.f11871g0 = i10;
                            if (i10 == this.W && this.Y >= this.X) {
                                a(false);
                                return;
                            }
                            Handler handler2 = this.f11870f0;
                            Intrinsics.checkNotNull(handler2);
                            handler2.postDelayed(this.h0, this.V);
                            return;
                        }
                        M();
                        return;
                    }
                    return;
                }
            }
        }
        m();
    }
}
