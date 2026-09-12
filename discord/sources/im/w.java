package im;

import android.graphics.PointF;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends f {
    public v S;
    public double T;
    public double U;
    public final boolean R = true;
    public float V = Float.NaN;
    public float W = Float.NaN;
    public final ga.l X = new ga.l(15, this);

    @Override // im.f
    public final void B() {
        this.S = null;
        this.V = Float.NaN;
        this.W = Float.NaN;
        E();
    }

    @Override // im.f
    public final void E() {
        this.U = 0.0d;
        this.T = 0.0d;
    }

    @Override // im.f
    public final void a(boolean z5) {
        if (this.f11896h != 4) {
            E();
        }
        super.a(z5);
    }

    @Override // im.f
    public final boolean t() {
        return this.R;
    }

    @Override // im.f
    public final void y(MotionEvent event, MotionEvent event2) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(event2, "sourceEvent");
        if (this.f11896h == 0) {
            int actionMasked = event2.getActionMasked();
            if (actionMasked == 0) {
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(event2, "sourceEvent");
                E();
                this.S = new v(this.X);
                this.V = event.getX();
                this.W = event.getY();
            } else if (actionMasked == 5) {
                d();
            }
        }
        v detector = this.S;
        if (detector != null) {
            ga.l lVar = detector.f11971a;
            int[] iArr = detector.f11979i;
            Intrinsics.checkNotNullParameter(event2, "event");
            int actionMasked2 = event2.getActionMasked();
            if (actionMasked2 == 0) {
                detector.f11978h = false;
                iArr[0] = event2.getPointerId(event2.getActionIndex());
                iArr[1] = -1;
            } else if (actionMasked2 != 1) {
                if (actionMasked2 != 2) {
                    if (actionMasked2 == 5) {
                        if (!detector.f11978h || detector.j) {
                            iArr[1] = event2.getPointerId(event2.getActionIndex());
                            detector.a(event2);
                        }
                        if (!detector.f11978h) {
                            detector.f11978h = true;
                            detector.f11973c = event2.getEventTime();
                            detector.f11974d = Double.NaN;
                            if (lVar != null) {
                                Intrinsics.checkNotNullParameter(detector, "detector");
                            }
                        }
                    } else if (actionMasked2 == 6 && detector.f11978h) {
                        int pointerId = event2.getPointerId(event2.getActionIndex());
                        if (pointerId == iArr[0]) {
                            iArr[0] = iArr[1];
                            iArr[1] = -1;
                            if (!detector.j) {
                                detector.j = true;
                            }
                        } else if (pointerId == iArr[1]) {
                            iArr[1] = -1;
                            if (!detector.j) {
                                detector.j = true;
                            }
                        }
                    }
                } else if (detector.f11978h) {
                    detector.a(event2);
                    if (!detector.j && lVar != null) {
                        Intrinsics.checkNotNullParameter(detector, "detector");
                        w wVar = (w) lVar.f9547e;
                        double d6 = wVar.T;
                        double d7 = detector.f11975e + d6;
                        wVar.T = d7;
                        long j = detector.f11972b - detector.f11973c;
                        if (j > 0) {
                            wVar.U = (d7 - d6) / j;
                        }
                        if (Math.abs(d7) >= 0.08726646259971647d && wVar.f11896h == 2) {
                            wVar.a(false);
                        }
                    }
                }
            } else if (detector.f11978h) {
                detector.j = false;
                detector.f11978h = false;
                if (lVar != null) {
                    Intrinsics.checkNotNullParameter(detector, "detector");
                    w wVar2 = (w) lVar.f9547e;
                    if (wVar2.f11896h == 4) {
                        wVar2.k();
                    } else {
                        wVar2.m();
                    }
                }
            }
        }
        v vVar = this.S;
        if (vVar != null) {
            PointF point = new PointF(vVar.f11976f, vVar.f11977g);
            Intrinsics.checkNotNullParameter(point, "point");
            g gVar = this.F;
            if (gVar != null) {
                gVar.l(o(), point);
            } else {
                point.x = Float.NaN;
                point.y = Float.NaN;
            }
            this.V = point.x;
            this.W = point.y;
        }
        if (event2.getActionMasked() == 1) {
            int i7 = this.f11896h;
            if (i7 == 0) {
                e();
            } else {
                if (i7 != 2) {
                    return;
                }
                m();
            }
        }
    }
}
