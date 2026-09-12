package fl;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.ScaleGestureDetector;
import com.otaliastudios.zoom.AbsolutePoint;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomLogger;
import dl.h;
import kotlin.jvm.internal.Intrinsics;
import w3.q;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ScaleGestureDetector.OnScaleGestureListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ZoomLogger f9296h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hl.c f9297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hl.b f9298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final el.a f9299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gl.a f9300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScaleGestureDetector f9301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbsolutePoint f9302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbsolutePoint f9303g;

    static {
        String tag = c.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(tag, "TAG");
        Intrinsics.checkNotNullParameter(tag, "tag");
        f9296h = new ZoomLogger(tag);
    }

    public c(Context context, hl.c zoomManager, hl.b panManager, el.a stateController, gl.a matrixController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(zoomManager, "zoomManager");
        Intrinsics.checkNotNullParameter(panManager, "panManager");
        Intrinsics.checkNotNullParameter(stateController, "stateController");
        Intrinsics.checkNotNullParameter(matrixController, "matrixController");
        this.f9297a = zoomManager;
        this.f9298b = panManager;
        this.f9299c = stateController;
        this.f9300d = matrixController;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.f9301e = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.f9302f = new AbsolutePoint(Float.NaN, Float.NaN);
        this.f9303g = new AbsolutePoint(0.0f, 0.0f);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        if (!this.f9297a.G || !this.f9299c.b(2)) {
            return false;
        }
        PointF pointF = new PointF(-detector.getFocusX(), -detector.getFocusY());
        gl.a aVar = this.f9300d;
        RectF rectF = aVar.f10100e;
        AbsolutePoint absolutePoint = ScaledPoint.b(new ScaledPoint(rectF.left + pointF.x, rectF.top + pointF.y), aVar.f());
        AbsolutePoint absolutePoint2 = this.f9302f;
        boolean zIsNaN = Float.isNaN(absolutePoint2.f7012a);
        ZoomLogger zoomLogger = f9296h;
        if (zIsNaN) {
            absolutePoint2.b(absolutePoint);
            zoomLogger.a("onScale:", "Setting initial focus:", absolutePoint2);
        } else {
            Intrinsics.checkNotNullParameter(absolutePoint, "absolutePoint");
            AbsolutePoint absolutePoint3 = new AbsolutePoint(absolutePoint2.f7012a - absolutePoint.f7012a, absolutePoint2.f7013b - absolutePoint.f7013b);
            AbsolutePoint absolutePoint4 = this.f9303g;
            absolutePoint4.b(absolutePoint3);
            zoomLogger.a("onScale:", "Got focus offset:", absolutePoint4);
        }
        aVar.c(new b(detector.getScaleFactor() * aVar.f(), this, detector, 1));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        float f2;
        float f7;
        PointF pointF;
        Float fValueOf = Float.valueOf(Float.NaN);
        Intrinsics.checkNotNullParameter(detector, "detector");
        AbsolutePoint absolutePoint = this.f9302f;
        Float fValueOf2 = Float.valueOf(absolutePoint.f7012a);
        Float fValueOf3 = Float.valueOf(absolutePoint.f7013b);
        hl.c cVar = this.f9297a;
        Object[] objArr = {"onScaleEnd:", "mInitialAbsFocusPoint.x:", fValueOf2, "mInitialAbsFocusPoint.y:", fValueOf3, "mOverZoomEnabled;", Boolean.valueOf(cVar.H)};
        ZoomLogger zoomLogger = f9296h;
        zoomLogger.a(objArr);
        Float fValueOf4 = Float.valueOf(0.0f);
        boolean z5 = cVar.H;
        el.a aVar = this.f9299c;
        int i7 = 0;
        hl.b bVar = this.f9298b;
        if (z5 || bVar.f10938v || bVar.f10939w) {
            float fA0 = cVar.A0();
            float fB0 = cVar.B0();
            gl.a aVar2 = this.f9300d;
            float fZ0 = cVar.z0(aVar2.f(), false);
            zoomLogger.a("onScaleEnd:", "zoom:", Float.valueOf(aVar2.f()), "newZoom:", Float.valueOf(fZ0), "max:", Float.valueOf(fA0), "min:", Float.valueOf(fB0));
            AbsolutePoint absolutePointB = ScaledPoint.b(bVar.C0(), aVar2.f());
            if (absolutePointB.f7012a == 0.0f && absolutePointB.f7013b == 0.0f && Float.compare(fZ0, aVar2.f()) == 0) {
                aVar.b(0);
            } else {
                float f10 = aVar2.f();
                RectF rectF = aVar2.f10101f;
                if (f10 <= 1.0f) {
                    AbsolutePoint absolutePoint2 = new AbsolutePoint((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f);
                    float f11 = aVar2.f();
                    ScaledPoint outPoint = new ScaledPoint();
                    Intrinsics.checkNotNullParameter(outPoint, "outPoint");
                    outPoint.a(Float.valueOf(absolutePoint2.f7012a * f11), Float.valueOf(absolutePoint2.f7013b * f11));
                    ScaledPoint scaledPoint = aVar2.e();
                    Intrinsics.checkNotNullParameter(scaledPoint, "scaledPoint");
                    ScaledPoint scaledPoint2 = new ScaledPoint(outPoint.f7016a - scaledPoint.f7016a, outPoint.f7017b - scaledPoint.f7017b);
                    pointF = new PointF(scaledPoint2.f7016a, scaledPoint2.f7017b);
                    pointF.set(-pointF.x, -pointF.y);
                } else {
                    float f12 = absolutePointB.f7012a;
                    if (f12 > 0.0f) {
                        f2 = aVar2.j;
                    } else {
                        f2 = f12 < 0.0f ? 0.0f : aVar2.j / 2.0f;
                    }
                    float f13 = absolutePointB.f7013b;
                    if (f13 > 0.0f) {
                        f7 = aVar2.k;
                    } else {
                        f7 = f13 < 0.0f ? 0.0f : aVar2.k / 2.0f;
                    }
                    pointF = new PointF(f2, f7);
                }
                AbsolutePoint absolutePointA = aVar2.d().a(absolutePointB);
                int i10 = 1;
                if (Float.compare(fZ0, aVar2.f()) != 0) {
                    AbsolutePoint point = aVar2.d();
                    Intrinsics.checkNotNullParameter(point, "point");
                    AbsolutePoint absolutePoint3 = new AbsolutePoint(point.f7012a, point.f7013b);
                    float f14 = aVar2.f();
                    aVar2.c(new a(fZ0, pointF, i7));
                    AbsolutePoint absolutePointB2 = ScaledPoint.b(bVar.C0(), aVar2.f());
                    absolutePointA.b(aVar2.d().a(absolutePointB2));
                    aVar2.c(new a(f14, absolutePoint3, i10));
                    absolutePointB = absolutePointB2;
                }
                if (absolutePointB.f7012a == 0.0f && absolutePointB.f7013b == 0.0f) {
                    h update = new h(fZ0, i10);
                    Intrinsics.checkNotNullParameter(update, "update");
                    int i11 = gl.c.k;
                    aVar2.a(q.v(update));
                } else {
                    b update2 = new b(fZ0, absolutePointA, pointF, i7);
                    Intrinsics.checkNotNullParameter(update2, "update");
                    int i12 = gl.c.k;
                    aVar2.a(q.v(update2));
                }
            }
        } else {
            aVar.b(0);
        }
        absolutePoint.c(fValueOf, fValueOf);
        this.f9303g.c(fValueOf4, fValueOf4);
    }
}
