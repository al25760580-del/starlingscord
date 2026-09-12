package im;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ga.l f11971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f11974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f11975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f11976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f11977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f11979i = new int[2];
    public boolean j;

    public v(ga.l lVar) {
        this.f11971a = lVar;
    }

    public final void a(MotionEvent motionEvent) {
        this.f11973c = this.f11972b;
        this.f11972b = motionEvent.getEventTime();
        int[] iArr = this.f11979i;
        int iFindPointerIndex = motionEvent.findPointerIndex(iArr[0]);
        int iFindPointerIndex2 = motionEvent.findPointerIndex(iArr[1]);
        if (iFindPointerIndex == -1 || iFindPointerIndex2 == -1) {
            return;
        }
        float x5 = motionEvent.getX(iFindPointerIndex);
        float y5 = motionEvent.getY(iFindPointerIndex);
        float x6 = motionEvent.getX(iFindPointerIndex2);
        float y8 = motionEvent.getY(iFindPointerIndex2);
        this.f11976f = (x5 + x6) * 0.5f;
        this.f11977g = (y5 + y8) * 0.5f;
        double d6 = -Math.atan2(y8 - y5, x6 - x5);
        if (this.j) {
            this.f11974d = d6;
            this.j = false;
        }
        double d7 = Double.isNaN(this.f11974d) ? 0.0d : this.f11974d - d6;
        this.f11975e = d7;
        this.f11974d = d6;
        if (d7 > 3.141592653589793d) {
            this.f11975e = d7 - 3.141592653589793d;
        } else if (d7 < -3.141592653589793d) {
            this.f11975e = d7 + 3.141592653589793d;
        }
        double d8 = this.f11975e;
        if (d8 > 1.5707963267948966d) {
            this.f11975e = d8 - 3.141592653589793d;
        } else if (d8 < -1.5707963267948966d) {
            this.f11975e = d8 + 3.141592653589793d;
        }
    }
}
