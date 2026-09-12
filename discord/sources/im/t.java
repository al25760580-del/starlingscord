package im;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends f {
    public double S;
    public double T;
    public y W;
    public float X;
    public float Y;
    public final boolean R = true;
    public float U = Float.NaN;
    public float V = Float.NaN;
    public final fj.c Z = new fj.c(18, this);

    @Override // im.f
    public final void B() {
        this.W = null;
        this.U = Float.NaN;
        this.V = Float.NaN;
        E();
    }

    @Override // im.f
    public final void E() {
        this.T = 0.0d;
        this.S = 1.0d;
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

    /* JADX WARN: Code duplicated, block: B:101:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:121:0x020c  */
    /* JADX WARN: Code duplicated, block: B:133:0x023b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x023d  */
    /* JADX WARN: Code duplicated, block: B:135:0x023f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0241  */
    /* JADX WARN: Code duplicated, block: B:138:0x0247  */
    /* JADX WARN: Code duplicated, block: B:141:0x0261  */
    /* JADX WARN: Code duplicated, block: B:169:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x0104  */
    /* JADX WARN: Code duplicated, block: B:71:0x010b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0117  */
    /* JADX WARN: Code duplicated, block: B:74:0x011d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0122  */
    /* JADX WARN: Code duplicated, block: B:77:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x012d  */
    /* JADX WARN: Code duplicated, block: B:84:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x014f  */
    /* JADX WARN: Code duplicated, block: B:90:0x017b  */
    /* JADX WARN: Code duplicated, block: B:91:0x017e  */
    @Override // im.f
    public final void y(MotionEvent event, MotionEvent sourceEvent) {
        boolean z5;
        boolean z6;
        int actionIndex;
        int i7;
        float f2;
        int i10;
        float x5;
        float y5;
        float f7;
        float f10;
        int i11;
        float fAbs;
        float fAbs2;
        float f11;
        float fHypot;
        int i12;
        t tVar;
        double d6;
        float f12;
        float f13;
        double d7;
        double d8;
        boolean z7;
        float fAbs3;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (this.f11896h == 0) {
            int actionMasked = sourceEvent.getActionMasked();
            if (actionMasked == 0) {
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
                View view = this.f11894f;
                Intrinsics.checkNotNull(view);
                Context context = view.getContext();
                E();
                this.W = new y(context, this.Z);
                this.Y = ViewConfiguration.get(context).getScaledTouchSlop();
                this.U = event.getX();
                this.V = event.getY();
            } else if (actionMasked == 5) {
                d();
            }
        }
        y detector = this.W;
        if (detector != null) {
            int i13 = detector.f11991l;
            fj.c cVar = detector.f11982a;
            detector.f11990i = sourceEvent.getEventTime();
            int actionMasked2 = sourceEvent.getActionMasked();
            if (detector.f11985d) {
                detector.f11995p.onTouchEvent(sourceEvent);
            }
            int pointerCount = sourceEvent.getPointerCount();
            boolean z10 = (sourceEvent.getButtonState() & 32) != 0;
            boolean z11 = detector.f11994o == 2 && !z10;
            boolean z12 = actionMasked2 == 1 || actionMasked2 == 3 || z11;
            if (actionMasked2 == 0 || z12) {
                if (detector.k) {
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(detector, "detector");
                    detector.k = false;
                    detector.f11989h = 0.0f;
                    detector.f11994o = 0;
                } else if (detector.a() && z12) {
                    detector.k = false;
                    detector.f11989h = 0.0f;
                    detector.f11994o = 0;
                }
                if (!z12) {
                    if (!detector.k && detector.f11986e && !detector.a() && !z12 && z10) {
                        detector.f11992m = sourceEvent.getX();
                        detector.f11993n = sourceEvent.getY();
                        detector.f11994o = 2;
                        detector.f11989h = 0.0f;
                    }
                    if (actionMasked2 != 0 || actionMasked2 == 6 || actionMasked2 == 5 || z11) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (actionMasked2 == 6) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        actionIndex = sourceEvent.getActionIndex();
                    } else {
                        actionIndex = -1;
                    }
                    if (z6) {
                        i7 = pointerCount - 1;
                    } else {
                        i7 = pointerCount;
                    }
                    if (detector.a()) {
                        f10 = detector.f11992m;
                        f7 = detector.f11993n;
                        if (sourceEvent.getY() < f7) {
                            f2 = 0.0f;
                            detector.f11996q = true;
                        } else {
                            f2 = 0.0f;
                            detector.f11996q = false;
                        }
                    } else {
                        f2 = 0.0f;
                        x5 = 0.0f;
                        y5 = 0.0f;
                        for (i10 = 0; i10 < pointerCount; i10++) {
                            if (actionIndex == i10) {
                                x5 = sourceEvent.getX(i10) + x5;
                                y5 = sourceEvent.getY(i10) + y5;
                            }
                        }
                        float f14 = i7;
                        float f15 = x5 / f14;
                        f7 = y5 / f14;
                        f10 = f15;
                    }
                    fAbs = f2;
                    fAbs2 = fAbs;
                    for (i11 = 0; i11 < pointerCount; i11++) {
                        if (actionIndex == i11) {
                            fAbs = Math.abs(sourceEvent.getX(i11) - f10) + fAbs;
                            fAbs2 = Math.abs(sourceEvent.getY(i11) - f7) + fAbs2;
                        }
                    }
                    float f16 = i7;
                    f11 = (fAbs / f16) * 2.0f;
                    fHypot = 2.0f * (fAbs2 / f16);
                    if (detector.a()) {
                        fHypot = (float) Math.hypot(f11, fHypot);
                    }
                    boolean z13 = detector.k;
                    detector.f11983b = f10;
                    detector.f11984c = f7;
                    if (!detector.a() && detector.k && (fHypot < 0 || z5)) {
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(detector, "detector");
                        detector.k = false;
                        detector.f11989h = fHypot;
                    }
                    if (z5) {
                        detector.f11987f = fHypot;
                        detector.f11988g = fHypot;
                        detector.f11989h = fHypot;
                    }
                    if (detector.a()) {
                        i12 = i13;
                    } else {
                        i12 = 0;
                    }
                    if (!detector.k && fHypot >= i12 && (z13 || Math.abs(fHypot - detector.f11989h) > i13)) {
                        detector.f11987f = fHypot;
                        detector.f11988g = fHypot;
                        detector.j = detector.f11990i;
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(detector, "detector");
                        ((t) cVar.f9267e).X = detector.f11987f;
                        detector.k = true;
                    }
                    if (actionMasked2 == 2) {
                        detector.f11987f = fHypot;
                        if (detector.k) {
                            cVar.getClass();
                            Intrinsics.checkNotNullParameter(detector, "detector");
                            tVar = (t) cVar.f9267e;
                            d6 = tVar.S;
                            f12 = 1.0f;
                            if (detector.a()) {
                                boolean z14 = detector.f11996q;
                                z7 = (!z14 && detector.f11987f < detector.f11988g) || (!z14 && detector.f11987f > detector.f11988g);
                                fAbs3 = Math.abs(1.0f - (detector.f11987f / detector.f11988g)) * 0.5f;
                                if (detector.f11988g > i13) {
                                    if (z7) {
                                        f12 = 1.0f + fAbs3;
                                    } else {
                                        f12 = 1.0f - fAbs3;
                                    }
                                }
                            } else {
                                f13 = detector.f11988g;
                                if (f13 > f2) {
                                    f12 = detector.f11987f / f13;
                                }
                            }
                            d7 = ((double) f12) * d6;
                            tVar.S = d7;
                            d8 = (detector.f11990i - detector.j) / 1000.0d;
                            if (d8 > 0.0d) {
                                tVar.T = (d7 - d6) / d8;
                            }
                            if (Math.abs(tVar.X - detector.f11987f) >= tVar.Y && tVar.f11896h == 2) {
                                tVar.a(false);
                            }
                        }
                        detector.f11988g = detector.f11987f;
                        detector.j = detector.f11990i;
                    }
                }
            } else {
                if (!detector.k) {
                    detector.f11992m = sourceEvent.getX();
                    detector.f11993n = sourceEvent.getY();
                    detector.f11994o = 2;
                    detector.f11989h = 0.0f;
                }
                if (actionMasked2 != 0) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (actionMasked2 == 6) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    actionIndex = sourceEvent.getActionIndex();
                } else {
                    actionIndex = -1;
                }
                if (z6) {
                    i7 = pointerCount - 1;
                } else {
                    i7 = pointerCount;
                }
                if (detector.a()) {
                    f10 = detector.f11992m;
                    f7 = detector.f11993n;
                    if (sourceEvent.getY() < f7) {
                        f2 = 0.0f;
                        detector.f11996q = true;
                    } else {
                        f2 = 0.0f;
                        detector.f11996q = false;
                    }
                } else {
                    f2 = 0.0f;
                    x5 = 0.0f;
                    y5 = 0.0f;
                    while (i10 < pointerCount) {
                        if (actionIndex == i10) {
                            x5 = sourceEvent.getX(i10) + x5;
                            y5 = sourceEvent.getY(i10) + y5;
                        }
                    }
                    float f17 = i7;
                    float f18 = x5 / f17;
                    f7 = y5 / f17;
                    f10 = f18;
                }
                fAbs = f2;
                fAbs2 = fAbs;
                while (i11 < pointerCount) {
                    if (actionIndex == i11) {
                        fAbs = Math.abs(sourceEvent.getX(i11) - f10) + fAbs;
                        fAbs2 = Math.abs(sourceEvent.getY(i11) - f7) + fAbs2;
                    }
                }
                float f19 = i7;
                f11 = (fAbs / f19) * 2.0f;
                fHypot = 2.0f * (fAbs2 / f19);
                if (detector.a()) {
                    fHypot = (float) Math.hypot(f11, fHypot);
                }
                boolean z15 = detector.k;
                detector.f11983b = f10;
                detector.f11984c = f7;
                if (!detector.a()) {
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(detector, "detector");
                    detector.k = false;
                    detector.f11989h = fHypot;
                }
                if (z5) {
                    detector.f11987f = fHypot;
                    detector.f11988g = fHypot;
                    detector.f11989h = fHypot;
                }
                if (detector.a()) {
                    i12 = i13;
                } else {
                    i12 = 0;
                }
                if (!detector.k) {
                    detector.f11987f = fHypot;
                    detector.f11988g = fHypot;
                    detector.j = detector.f11990i;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(detector, "detector");
                    ((t) cVar.f9267e).X = detector.f11987f;
                    detector.k = true;
                }
                if (actionMasked2 == 2) {
                    detector.f11987f = fHypot;
                    if (detector.k) {
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(detector, "detector");
                        tVar = (t) cVar.f9267e;
                        d6 = tVar.S;
                        f12 = 1.0f;
                        if (detector.a()) {
                            boolean z16 = detector.f11996q;
                            if (z16) {
                            }
                            fAbs3 = Math.abs(1.0f - (detector.f11987f / detector.f11988g)) * 0.5f;
                            if (detector.f11988g > i13) {
                                if (z7) {
                                    f12 = 1.0f + fAbs3;
                                } else {
                                    f12 = 1.0f - fAbs3;
                                }
                            }
                        } else {
                            f13 = detector.f11988g;
                            if (f13 > f2) {
                                f12 = detector.f11987f / f13;
                            }
                        }
                        d7 = ((double) f12) * d6;
                        tVar.S = d7;
                        d8 = (detector.f11990i - detector.j) / 1000.0d;
                        if (d8 > 0.0d) {
                            tVar.T = (d7 - d6) / d8;
                        }
                        if (Math.abs(tVar.X - detector.f11987f) >= tVar.Y) {
                            tVar.a(false);
                        }
                    }
                    detector.f11988g = detector.f11987f;
                    detector.j = detector.f11990i;
                }
            }
        }
        y yVar = this.W;
        if (yVar != null) {
            PointF point = new PointF(yVar.f11983b, yVar.f11984c);
            Intrinsics.checkNotNullParameter(point, "point");
            g gVar = this.F;
            if (gVar != null) {
                gVar.l(o(), point);
            } else {
                point.x = Float.NaN;
                point.y = Float.NaN;
            }
            this.U = point.x;
            this.V = point.y;
        }
        if (sourceEvent.getActionMasked() == 1) {
            int i14 = this.f11896h;
            if (i14 == 0) {
                e();
            } else if (i14 != 4) {
                m();
            } else {
                k();
            }
        }
    }
}
