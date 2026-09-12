package im;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends f {
    public long R;
    public final float S;
    public float T;
    public int U;
    public float V;
    public float W;
    public long X;
    public long Y;
    public Handler Z;
    public int a0;

    public i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.R = 500L;
        this.E = true;
        float f2 = context.getResources().getDisplayMetrics().density * 10.0f;
        this.S = f2;
        this.T = f2;
        this.U = 1;
    }

    public static Pair M(MotionEvent motionEvent, boolean z5) {
        if (z5) {
            int pointerCount = motionEvent.getPointerCount();
            float f2 = 0.0f;
            float y5 = 0.0f;
            for (int i7 = 0; i7 < pointerCount; i7++) {
                if (i7 != motionEvent.getActionIndex()) {
                    float x5 = motionEvent.getX(i7) + f2;
                    y5 = motionEvent.getY(i7) + y5;
                    f2 = x5;
                }
            }
            return new Pair(Float.valueOf(f2 / (motionEvent.getPointerCount() - 1)), Float.valueOf(y5 / (motionEvent.getPointerCount() - 1)));
        }
        IntRange intRangeI = lo.j.i(0, motionEvent.getPointerCount());
        ArrayList arrayList = new ArrayList(e0.l(intRangeI, 10));
        Iterator it = intRangeI.iterator();
        while (((lo.b) it).f15156i) {
            arrayList.add(Float.valueOf(motionEvent.getX(((s0) it).nextInt())));
        }
        float fD = (float) CollectionsKt.D(arrayList);
        IntRange intRangeI2 = lo.j.i(0, motionEvent.getPointerCount());
        ArrayList arrayList2 = new ArrayList(e0.l(intRangeI2, 10));
        Iterator it2 = intRangeI2.iterator();
        while (((lo.b) it2).f15156i) {
            arrayList2.add(Float.valueOf(motionEvent.getY(((s0) it2).nextInt())));
        }
        return new Pair(Float.valueOf(fD), Float.valueOf((float) CollectionsKt.D(arrayList2)));
    }

    @Override // im.f
    public final void B() {
        this.a0 = 0;
    }

    @Override // im.f
    public final void C() {
        Handler handler = this.Z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.Z = null;
        }
    }

    @Override // im.f
    public final void D() {
        super.D();
        this.R = 500L;
        this.T = this.S;
        this.E = true;
    }

    @Override // im.f
    public final void g(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.Y = SystemClock.uptimeMillis();
        super.g(event);
    }

    @Override // im.f
    public final void h(int i7, int i10) {
        this.Y = SystemClock.uptimeMillis();
        super.h(i7, i10);
    }

    @Override // im.f
    public final void y(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (K(sourceEvent)) {
            return;
        }
        if (this.f11896h == 0) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.Y = jUptimeMillis;
            this.X = jUptimeMillis;
            d();
            Pair pairM = M(sourceEvent, false);
            float fFloatValue = ((Number) pairM.f14612d).floatValue();
            float fFloatValue2 = ((Number) pairM.f14613e).floatValue();
            this.V = fFloatValue;
            this.W = fFloatValue2;
            this.a0++;
        }
        if (sourceEvent.getActionMasked() == 5) {
            this.a0++;
            Pair pairM2 = M(sourceEvent, false);
            float fFloatValue3 = ((Number) pairM2.f14612d).floatValue();
            float fFloatValue4 = ((Number) pairM2.f14613e).floatValue();
            this.V = fFloatValue3;
            this.W = fFloatValue4;
            if (this.a0 > this.U) {
                m();
                this.a0 = 0;
            }
        }
        if (this.f11896h == 2 && this.a0 == this.U && (sourceEvent.getActionMasked() == 0 || sourceEvent.getActionMasked() == 5 || sourceEvent.getActionMasked() == 11)) {
            Handler handler = new Handler(Looper.getMainLooper());
            this.Z = handler;
            long j = this.R;
            if (j > 0) {
                Intrinsics.checkNotNull(handler);
                handler.postDelayed(new com.google.firebase.messaging.s(22, this), this.R);
            } else if (j == 0) {
                a(false);
            }
        }
        if (sourceEvent.getActionMasked() == 1 || sourceEvent.getActionMasked() == 12) {
            this.a0--;
            Handler handler2 = this.Z;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                this.Z = null;
            }
            if (this.f11896h == 4) {
                k();
                return;
            } else {
                m();
                return;
            }
        }
        if (sourceEvent.getActionMasked() == 6) {
            int i7 = this.a0 - 1;
            this.a0 = i7;
            if (i7 < this.U && this.f11896h != 4) {
                m();
                this.a0 = 0;
                return;
            }
            Pair pairM3 = M(sourceEvent, true);
            float fFloatValue5 = ((Number) pairM3.f14612d).floatValue();
            float fFloatValue6 = ((Number) pairM3.f14613e).floatValue();
            this.V = fFloatValue5;
            this.W = fFloatValue6;
            return;
        }
        Pair pairM4 = M(sourceEvent, false);
        float fFloatValue7 = ((Number) pairM4.f14612d).floatValue();
        float fFloatValue8 = ((Number) pairM4.f14613e).floatValue();
        float f2 = fFloatValue7 - this.V;
        float f7 = fFloatValue8 - this.W;
        float f10 = (f7 * f7) + (f2 * f2);
        float f11 = this.T;
        if (f10 > f11 * f11) {
            if (this.f11896h == 4) {
                e();
            } else {
                m();
            }
        }
    }
}
