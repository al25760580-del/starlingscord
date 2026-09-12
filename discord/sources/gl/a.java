package gl;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.i0;
import androidx.core.view.a1;
import com.otaliastudios.zoom.AbsolutePoint;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomEngine;
import com.otaliastudios.zoom.ZoomLogger;
import dl.d;
import e4.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import w3.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ZoomLogger f10094q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AccelerateDecelerateInterpolator f10095r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hl.c f10096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hl.b f10097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final el.a f10098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f10099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f10100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f10101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f10102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Matrix f10104i;
    public float j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ScaledPoint f10105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AbsolutePoint f10106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f10107n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f10108o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.appcompat.widget.c f10109p;

    static {
        String tag = a.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(tag, "TAG");
        Intrinsics.checkNotNullParameter(tag, "tag");
        f10094q = new ZoomLogger(tag);
        f10095r = new AccelerateDecelerateInterpolator();
    }

    public a(hl.c zoomManager, hl.b panManager, el.a stateController, i0 callback) {
        Intrinsics.checkNotNullParameter(zoomManager, "zoomManager");
        Intrinsics.checkNotNullParameter(panManager, "panManager");
        Intrinsics.checkNotNullParameter(stateController, "stateController");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f10096a = zoomManager;
        this.f10097b = panManager;
        this.f10098c = stateController;
        this.f10099d = callback;
        this.f10100e = new RectF();
        this.f10101f = new RectF();
        this.f10102g = new Matrix();
        this.f10104i = new Matrix();
        this.f10105l = new ScaledPoint();
        this.f10106m = new AbsolutePoint();
        this.f10107n = 280L;
        this.f10108o = new LinkedHashSet();
        this.f10109p = new androidx.appcompat.widget.c(1, this);
    }

    public final void a(c update) {
        float f2 = update.f10119a;
        AbsolutePoint absolutePointA = update.f10121c;
        Intrinsics.checkNotNullParameter(update, "update");
        if (this.f10103h) {
            int i7 = 3;
            if (this.f10098c.b(3)) {
                ArrayList arrayList = new ArrayList();
                ScaledPoint scaledPoint = update.f10122d;
                boolean z5 = update.f10123e;
                RectF rectF = this.f10100e;
                if (absolutePointA != null) {
                    if (z5) {
                        absolutePointA = d().a(absolutePointA);
                    }
                    PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("panX", rectF.left / f(), absolutePointA.f7012a);
                    Intrinsics.checkNotNullExpressionValue(propertyValuesHolderOfFloat, "ofFloat(\"panX\", panX, target.x)");
                    arrayList.add(propertyValuesHolderOfFloat);
                    PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat("panY", rectF.top / f(), absolutePointA.f7013b);
                    Intrinsics.checkNotNullExpressionValue(propertyValuesHolderOfFloat2, "ofFloat(\"panY\", panY, target.y)");
                    arrayList.add(propertyValuesHolderOfFloat2);
                } else if (scaledPoint != null) {
                    if (z5) {
                        ScaledPoint scaledPointE = e();
                        Intrinsics.checkNotNullParameter(scaledPoint, "scaledPoint");
                        scaledPoint = new ScaledPoint(scaledPointE.f7016a + scaledPoint.f7016a, scaledPointE.f7017b + scaledPoint.f7017b);
                    }
                    PropertyValuesHolder propertyValuesHolderOfFloat3 = PropertyValuesHolder.ofFloat("panX", rectF.left, scaledPoint.f7016a);
                    Intrinsics.checkNotNullExpressionValue(propertyValuesHolderOfFloat3, "ofFloat(\"panX\", scaledPanX, target.x)");
                    arrayList.add(propertyValuesHolderOfFloat3);
                    PropertyValuesHolder propertyValuesHolderOfFloat4 = PropertyValuesHolder.ofFloat("panY", rectF.top, scaledPoint.f7017b);
                    Intrinsics.checkNotNullExpressionValue(propertyValuesHolderOfFloat4, "ofFloat(\"panY\", scaledPanY, target.y)");
                    arrayList.add(propertyValuesHolderOfFloat4);
                }
                if (!Float.isNaN(f2)) {
                    PropertyValuesHolder propertyValuesHolderOfFloat5 = PropertyValuesHolder.ofFloat("zoom", f(), this.f10096a.z0(f2, update.f10120b));
                    Intrinsics.checkNotNullExpressionValue(propertyValuesHolderOfFloat5, "ofFloat(\"zoom\", zoom, newZoom)");
                    arrayList.add(propertyValuesHolderOfFloat5);
                }
                Object[] array = arrayList.toArray(new PropertyValuesHolder[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) array;
                ValueAnimator animator = ValueAnimator.ofPropertyValuesHolder((PropertyValuesHolder[]) Arrays.copyOf(propertyValuesHolderArr, propertyValuesHolderArr.length));
                animator.setDuration(this.f10107n);
                animator.setInterpolator(f10095r);
                animator.addListener(this.f10109p);
                animator.addUpdateListener(new a1(i7, this, update));
                animator.start();
                Intrinsics.checkNotNullExpressionValue(animator, "animator");
                this.f10108o.add(animator);
            }
        }
    }

    public final void b(c update) {
        float f2 = update.f10119a;
        Intrinsics.checkNotNullParameter(update, "update");
        if (this.f10103h) {
            AbsolutePoint absolutePoint = update.f10121c;
            boolean z5 = update.j;
            boolean z6 = update.f10123e;
            RectF rectF = this.f10101f;
            RectF rectF2 = this.f10100e;
            Matrix matrix = this.f10102g;
            if (absolutePoint != null) {
                if (!z6) {
                    AbsolutePoint absolutePoint2 = d();
                    Intrinsics.checkNotNullParameter(absolutePoint2, "absolutePoint");
                    absolutePoint = new AbsolutePoint(absolutePoint.f7012a - absolutePoint2.f7012a, absolutePoint.f7013b - absolutePoint2.f7013b);
                }
                matrix.preTranslate(absolutePoint.f7012a, absolutePoint.f7013b);
                matrix.mapRect(rectF2, rectF);
            } else {
                ScaledPoint scaledPoint = update.f10122d;
                if (scaledPoint != null) {
                    if (!z6) {
                        ScaledPoint scaledPoint2 = e();
                        Intrinsics.checkNotNullParameter(scaledPoint2, "scaledPoint");
                        scaledPoint = new ScaledPoint(scaledPoint.f7016a - scaledPoint2.f7016a, scaledPoint.f7017b - scaledPoint2.f7017b);
                    }
                    matrix.postTranslate(scaledPoint.f7016a, scaledPoint.f7017b);
                    matrix.mapRect(rectF2, rectF);
                }
            }
            if (!Float.isNaN(f2)) {
                float fZ0 = this.f10096a.z0(f2, update.f10120b) / f();
                Float f7 = update.f10125g;
                float fFloatValue = f7 != null ? f7.floatValue() : z5 ? 0.0f : this.j / 2.0f;
                Float f10 = update.f10126h;
                matrix.postScale(fZ0, fZ0, fFloatValue, f10 != null ? f10.floatValue() : z5 ? 0.0f : this.k / 2.0f);
                matrix.mapRect(rectF2, rectF);
            }
            boolean z7 = update.f10124f;
            hl.b bVar = this.f10097b;
            float fA0 = bVar.A0(true, z7);
            float fA1 = bVar.A0(false, z7);
            if (fA0 != 0.0f || fA1 != 0.0f) {
                matrix.postTranslate(fA0, fA1);
                matrix.mapRect(rectF2, rectF);
            }
            if (update.f10127i) {
                l lVar = ((ZoomEngine) this.f10099d.f1004e).f7023e;
                for (d dVar : (ArrayList) lVar.f7990i) {
                    ZoomEngine zoomEngine = (ZoomEngine) lVar.f7989e;
                    a aVar = zoomEngine.f7027i;
                    Matrix matrix2 = aVar.f10104i;
                    matrix2.set(aVar.f10102g);
                    dVar.onUpdate(zoomEngine, matrix2);
                }
            }
        }
    }

    public final void c(Function1 update) {
        Intrinsics.checkNotNullParameter(update, "update");
        int i7 = c.k;
        b(q.v(update));
    }

    public final AbsolutePoint d() {
        RectF rectF = this.f10100e;
        Float fValueOf = Float.valueOf(rectF.left / f());
        Float fValueOf2 = Float.valueOf(rectF.top / f());
        AbsolutePoint absolutePoint = this.f10106m;
        absolutePoint.c(fValueOf, fValueOf2);
        return absolutePoint;
    }

    public final ScaledPoint e() {
        RectF rectF = this.f10100e;
        Float fValueOf = Float.valueOf(rectF.left);
        Float fValueOf2 = Float.valueOf(rectF.top);
        ScaledPoint scaledPoint = this.f10105l;
        scaledPoint.a(fValueOf, fValueOf2);
        return scaledPoint;
    }

    public final float f() {
        return this.f10100e.width() / this.f10101f.width();
    }

    public final void g(float f2, boolean z5) {
        hl.c cVar;
        boolean z6;
        int i7;
        Matrix matrix = this.f10102g;
        RectF rectF = this.f10100e;
        RectF rectF2 = this.f10101f;
        matrix.mapRect(rectF, rectF2);
        if (rectF2.width() <= 0.0f || rectF2.height() <= 0.0f) {
            return;
        }
        float f7 = this.j;
        if (f7 <= 0.0f || this.k <= 0.0f) {
            return;
        }
        Object[] data = {"onSizeChanged:", "containerWidth:", Float.valueOf(f7), "containerHeight:", Float.valueOf(this.k), "contentWidth:", Float.valueOf(rectF2.width()), "contentHeight:", Float.valueOf(rectF2.height())};
        ZoomLogger zoomLogger = f10094q;
        zoomLogger.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        zoomLogger.d(ZoomLogger.b(2, Arrays.copyOf(data, 9)));
        boolean z7 = !this.f10103h || z5;
        this.f10103h = true;
        ZoomLogger zoomLogger2 = ZoomEngine.f7018l;
        Boolean boolValueOf = Boolean.valueOf(z7);
        Float fValueOf = Float.valueOf(f2);
        ZoomEngine zoomEngine = (ZoomEngine) this.f10099d.f1004e;
        a aVar = zoomEngine.f7027i;
        int i10 = zoomEngine.f7019a;
        hl.c cVar2 = zoomEngine.f7026h;
        Object[] data2 = {"onMatrixSizeChanged: firstTime:", boolValueOf, "oldZoom:", fValueOf, "transformation:", Integer.valueOf(i10), "transformationZoom:", Float.valueOf(cVar2.f10943v)};
        zoomLogger2.getClass();
        Intrinsics.checkNotNullParameter(data2, "data");
        zoomLogger2.d(ZoomLogger.b(2, Arrays.copyOf(data2, 8)));
        zoomEngine.f7024f.b(0);
        if (z7) {
            cVar = cVar2;
            cVar.f10943v = ZoomEngine.a(zoomEngine);
            aVar.c(new dl.b(zoomEngine, 0));
            float f10 = (aVar.f() * aVar.f10101f.width()) - aVar.j;
            float f11 = (aVar.f() * aVar.f10101f.height()) - aVar.k;
            int i11 = zoomEngine.f7020b;
            hl.b bVar = zoomEngine.f7025g;
            if (i11 == 0) {
                int i12 = bVar.E;
                int i13 = i12 & 240;
                int i14 = 16;
                if (i13 != 16) {
                    i7 = i13 != 32 ? 1 : 5;
                } else {
                    i7 = 3;
                }
                int i15 = i12 & (-241);
                z6 = true;
                if (i15 == 1) {
                    i14 = 48;
                } else if (i15 == 2) {
                    i14 = 80;
                }
                i11 = i7 | i14;
            } else {
                z6 = true;
            }
            bVar.getClass();
            aVar.c(new dl.c(new ScaledPoint(-hl.b.z0(i11, f10, z6), -hl.b.z0(i11, f11, false)), 0));
        } else {
            cVar = cVar2;
            cVar.f10943v = ZoomEngine.a(zoomEngine);
            aVar.c(new dl.b(zoomEngine, 1));
        }
        zoomLogger2.a("onMatrixSizeChanged: newTransformationZoom:", Float.valueOf(cVar.f10943v), "newRealZoom:", Float.valueOf(aVar.f()), "newZoom:", Float.valueOf(zoomEngine.d()));
    }
}
