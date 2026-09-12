package v4;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f21481a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f21482b = io.sentry.internal.debugmeta.c.D0("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f21483c = io.sentry.internal.debugmeta.c.D0("x", "y");

    public static BaseInterpolator a(PointF pointF, PointF pointF2) {
        pointF.x = x4.g.b(pointF.x, -1.0f, 1.0f);
        pointF.y = x4.g.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = x4.g.b(pointF2.x, -1.0f, 1.0f);
        float fB = x4.g.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        hs.c cVar = x4.h.f22636a;
        try {
            return new PathInterpolator(pointF.x, pointF.y, pointF2.x, fB);
        } catch (IllegalArgumentException e10) {
            return "The Path cannot loop back on itself.".equals(e10.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX WARN: Code duplicated, block: B:99:0x01f6  */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    public static y4.a b(w4.a aVar, l4.i iVar, float f2, d0 d0Var, boolean z5, boolean z6) {
        Object obj;
        BaseInterpolator baseInterpolatorA;
        BaseInterpolator baseInterpolatorA2;
        BaseInterpolator baseInterpolatorA3;
        Object obj2;
        y4.a aVar2;
        io.sentry.internal.debugmeta.c cVar;
        io.sentry.internal.debugmeta.c cVar2;
        PointF pointF;
        io.sentry.internal.debugmeta.c cVar3 = f21482b;
        LinearInterpolator linearInterpolator = f21481a;
        if (!z5 || !z6) {
            io.sentry.internal.debugmeta.c cVar4 = cVar3;
            if (!z5) {
                return new y4.a(d0Var.f(aVar, f2));
            }
            aVar.f();
            PointF pointFB = null;
            PointF pointFB2 = null;
            PointF pointFB3 = null;
            PointF pointFB4 = null;
            boolean z7 = false;
            Object objF = null;
            float fU = 0.0f;
            Object objF2 = null;
            while (aVar.n()) {
                cVar4 = cVar4;
                switch (aVar.P(cVar4)) {
                    case 0:
                        fU = (float) aVar.u();
                        continue;
                    case 1:
                        objF = d0Var.f(aVar, f2);
                        break;
                    case 2:
                        objF2 = d0Var.f(aVar, f2);
                        break;
                    case 3:
                        pointFB4 = n.b(aVar, 1.0f);
                        break;
                    case 4:
                        pointFB = n.b(aVar, 1.0f);
                        break;
                    case 5:
                        z7 = aVar.y() == 1;
                        break;
                    case 6:
                        pointFB2 = n.b(aVar, f2);
                        break;
                    case 7:
                        pointFB3 = n.b(aVar, f2);
                        break;
                    default:
                        aVar.T();
                        break;
                }
            }
            aVar.i();
            if (!z7) {
                if (pointFB4 == null || pointFB == null) {
                    obj = objF2;
                } else {
                    baseInterpolatorA = a(pointFB4, pointFB);
                    obj = objF2;
                }
                y4.a aVar3 = new y4.a(iVar, objF, obj, baseInterpolatorA, fU, (Float) null);
                aVar3.f23205o = pointFB2;
                aVar3.f23206p = pointFB3;
                return aVar3;
            }
            obj = objF;
            baseInterpolatorA = linearInterpolator;
            y4.a aVar4 = new y4.a(iVar, objF, obj, baseInterpolatorA, fU, (Float) null);
            aVar4.f23205o = pointFB2;
            aVar4.f23206p = pointFB3;
            return aVar4;
        }
        aVar.f();
        PointF pointF2 = null;
        PointF pointFB5 = null;
        PointF pointFB6 = null;
        boolean z10 = false;
        PointF pointFB7 = null;
        PointF pointFB8 = null;
        PointF pointF3 = null;
        Object objF3 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        float fU2 = 0.0f;
        Object objF4 = null;
        while (aVar.n()) {
            int iP = aVar.P(cVar3);
            io.sentry.internal.debugmeta.c cVar5 = f21483c;
            linearInterpolator = linearInterpolator;
            switch (iP) {
                case 0:
                    cVar = cVar3;
                    fU2 = (float) aVar.u();
                    cVar3 = cVar;
                    break;
                case 1:
                    cVar = cVar3;
                    objF3 = d0Var.f(aVar, f2);
                    cVar3 = cVar;
                    break;
                case 2:
                    cVar = cVar3;
                    objF4 = d0Var.f(aVar, f2);
                    cVar3 = cVar;
                    break;
                case 3:
                    cVar = cVar3;
                    boolean z11 = z10;
                    Object obj3 = objF3;
                    PointF pointF6 = pointF4;
                    if (aVar.B() == 3) {
                        aVar.f();
                        float fU3 = 0.0f;
                        float fU4 = 0.0f;
                        float fU5 = 0.0f;
                        float fU6 = 0.0f;
                        while (aVar.n()) {
                            int iP2 = aVar.P(cVar5);
                            if (iP2 != 0) {
                                if (iP2 != 1) {
                                    aVar.T();
                                } else if (aVar.B() == 7) {
                                    fU6 = (float) aVar.u();
                                    fU4 = fU6;
                                } else {
                                    aVar.c();
                                    fU4 = (float) aVar.u();
                                    fU6 = aVar.B() == 7 ? (float) aVar.u() : fU4;
                                    aVar.g();
                                }
                            } else if (aVar.B() == 7) {
                                fU5 = (float) aVar.u();
                                fU3 = fU5;
                            } else {
                                aVar.c();
                                fU3 = (float) aVar.u();
                                fU5 = aVar.B() == 7 ? (float) aVar.u() : fU3;
                                aVar.g();
                            }
                        }
                        PointF pointF7 = new PointF(fU3, fU4);
                        pointF4 = new PointF(fU5, fU6);
                        aVar.i();
                        pointF3 = pointF7;
                    } else {
                        pointFB7 = n.b(aVar, f2);
                        pointF4 = pointF6;
                    }
                    z10 = z11;
                    objF3 = obj3;
                    cVar3 = cVar;
                    break;
                case 4:
                    boolean z12 = z10;
                    if (aVar.B() == 3) {
                        aVar.f();
                        float fU7 = 0.0f;
                        float fU8 = 0.0f;
                        float fU9 = 0.0f;
                        float fU10 = 0.0f;
                        while (aVar.n()) {
                            Object obj4 = objF3;
                            int iP3 = aVar.P(cVar5);
                            if (iP3 != 0) {
                                cVar2 = cVar3;
                                if (iP3 != 1) {
                                    aVar.T();
                                } else if (aVar.B() == 7) {
                                    fU10 = (float) aVar.u();
                                    pointF4 = pointF4;
                                    fU8 = fU10;
                                } else {
                                    pointF = pointF4;
                                    aVar.c();
                                    fU8 = (float) aVar.u();
                                    fU10 = aVar.B() == 7 ? (float) aVar.u() : fU8;
                                    aVar.g();
                                    pointF4 = pointF;
                                }
                            } else {
                                cVar2 = cVar3;
                                pointF = pointF4;
                                if (aVar.B() == 7) {
                                    fU9 = (float) aVar.u();
                                    pointF4 = pointF;
                                    fU7 = fU9;
                                } else {
                                    aVar.c();
                                    fU7 = (float) aVar.u();
                                    fU9 = aVar.B() == 7 ? (float) aVar.u() : fU7;
                                    aVar.g();
                                    pointF4 = pointF;
                                }
                            }
                            objF3 = obj4;
                            cVar3 = cVar2;
                        }
                        cVar = cVar3;
                        PointF pointF8 = new PointF(fU7, fU8);
                        pointF2 = new PointF(fU9, fU10);
                        aVar.i();
                        pointF5 = pointF8;
                    } else {
                        cVar = cVar3;
                        pointFB8 = n.b(aVar, f2);
                    }
                    z10 = z12;
                    cVar3 = cVar;
                    break;
                case 5:
                    z10 = aVar.y() == 1;
                    linearInterpolator = linearInterpolator;
                    break;
                case 6:
                    pointFB5 = n.b(aVar, f2);
                    linearInterpolator = linearInterpolator;
                    break;
                case 7:
                    pointFB6 = n.b(aVar, f2);
                    linearInterpolator = linearInterpolator;
                    break;
                default:
                    aVar.T();
                    linearInterpolator = linearInterpolator;
                    break;
            }
        }
        BaseInterpolator baseInterpolatorA4 = linearInterpolator;
        boolean z13 = z10;
        Object obj5 = objF3;
        PointF pointF9 = pointF4;
        aVar.i();
        if (z13) {
            obj2 = obj5;
        } else {
            if (pointFB7 == null || pointFB8 == null) {
                if (pointF3 != null && pointF9 != null && pointF5 != null && pointF2 != null) {
                    baseInterpolatorA2 = a(pointF3, pointF5);
                    baseInterpolatorA3 = a(pointF9, pointF2);
                    obj2 = objF4;
                    baseInterpolatorA4 = null;
                }
                if (baseInterpolatorA2 != null || baseInterpolatorA3 == null) {
                    aVar2 = new y4.a(iVar, obj5, obj2, baseInterpolatorA4, fU2, (Float) null);
                } else {
                    aVar2 = new y4.a(iVar, obj5, obj2, baseInterpolatorA2, baseInterpolatorA3, fU2);
                }
                aVar2.f23205o = pointFB5;
                aVar2.f23206p = pointFB6;
                return aVar2;
            }
            baseInterpolatorA4 = a(pointFB7, pointFB8);
            obj2 = objF4;
        }
        baseInterpolatorA2 = null;
        baseInterpolatorA3 = null;
        if (baseInterpolatorA2 != null) {
            aVar2 = new y4.a(iVar, obj5, obj2, baseInterpolatorA4, fU2, (Float) null);
        } else {
            aVar2 = new y4.a(iVar, obj5, obj2, baseInterpolatorA4, fU2, (Float) null);
        }
        aVar2.f23205o = pointFB5;
        aVar2.f23206p = pointFB6;
        return aVar2;
    }
}
