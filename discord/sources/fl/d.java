package fl;

import a3.h;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.OverScroller;
import androidx.appcompat.widget.i0;
import com.discord.zoom_layout.ZoomLayoutFixed;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomEngine;
import com.otaliastudios.zoom.ZoomLogger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements GestureDetector.OnGestureListener {
    public static final ZoomLogger K;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hl.b f9304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final el.a f9305e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gl.a f9306i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final GestureDetector f9307v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final OverScroller f9308w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final hl.a f9309x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final hl.a f9310y;

    static {
        String tag = d.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(tag, "TAG");
        Intrinsics.checkNotNullParameter(tag, "tag");
        K = new ZoomLogger(tag);
    }

    public d(Context context, hl.b panManager, el.a stateController, gl.a matrixController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(panManager, "panManager");
        Intrinsics.checkNotNullParameter(stateController, "stateController");
        Intrinsics.checkNotNullParameter(matrixController, "matrixController");
        this.f9304d = panManager;
        this.f9305e = stateController;
        this.f9306i = matrixController;
        GestureDetector gestureDetector = new GestureDetector(context, this);
        gestureDetector.setOnDoubleTapListener(null);
        Unit unit = Unit.f14616a;
        this.f9307v = gestureDetector;
        this.f9308w = new OverScroller(context);
        this.f9309x = new hl.a();
        this.f9310y = new hl.a();
        this.E = true;
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f9308w.forceFinished(true);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f7) {
        hl.b bVar;
        boolean z5;
        if (!this.E || (!(z5 = (bVar = this.f9304d).f10940x) && !bVar.f10941y)) {
            return false;
        }
        int i7 = (int) (z5 ? f2 : 0.0f);
        int i10 = (int) (bVar.f10941y ? f7 : 0.0f);
        hl.a aVar = this.f9309x;
        bVar.B0(true, aVar);
        hl.a aVar2 = this.f9310y;
        bVar.B0(false, aVar2);
        int i11 = aVar.f10933a;
        int i12 = aVar.f10934b;
        int i13 = aVar.f10935c;
        int i14 = aVar2.f10933a;
        int i15 = aVar2.f10934b;
        int i16 = aVar2.f10935c;
        if ((this.J || (!aVar.f10936d && !aVar2.f10936d)) && ((i11 < i13 || i14 < i16 || bVar.f10938v || bVar.f10939w) && this.f9305e.b(4))) {
            this.f9307v.setIsLongpressEnabled(false);
            float fD0 = bVar.f10938v ? bVar.D0() : 0.0f;
            float fE0 = bVar.f10939w ? bVar.E0() : 0.0f;
            Object[] objArr = {"startFling", "velocityX:", Integer.valueOf(i7), "velocityY:", Integer.valueOf(i10)};
            ZoomLogger zoomLogger = K;
            zoomLogger.a(objArr);
            zoomLogger.a("startFling", "flingX:", "min:", Integer.valueOf(i11), "max:", Integer.valueOf(i13), "start:", Integer.valueOf(i12), "overScroll:", Float.valueOf(fE0));
            zoomLogger.a("startFling", "flingY:", "min:", Integer.valueOf(i14), "max:", Integer.valueOf(i16), "start:", Integer.valueOf(i15), "overScroll:", Float.valueOf(fD0));
            this.f9308w.fling(i12, i15, i7, i10, i11, i13, i14, i16, (int) fD0, (int) fE0);
            h action = new h(14, this);
            Intrinsics.checkNotNullParameter(action, "action");
            i0 i0Var = this.f9306i.f10099d;
            Intrinsics.checkNotNullParameter(action, "action");
            ZoomLayoutFixed zoomLayoutFixed = ((ZoomEngine) i0Var.f1004e).f7021c;
            if (zoomLayoutFixed != null) {
                zoomLayoutFixed.post(action);
                return true;
            }
            Intrinsics.throwUninitializedPropertyAccessException("container");
            throw null;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f7) {
        if (this.F) {
            boolean z5 = motionEvent2 != null && motionEvent2.getPointerCount() == 1;
            boolean z6 = motionEvent2 != null && motionEvent2.getPointerCount() == 2;
            boolean z7 = motionEvent2 != null && motionEvent2.getPointerCount() == 3;
            if ((this.G || !z5) && ((this.H || !z6) && (this.I || !z7))) {
                hl.b bVar = this.f9304d;
                if ((bVar.f10940x || bVar.f10941y) && this.f9305e.b(1)) {
                    ScaledPoint scaledPoint = new ScaledPoint(-f2, -f7);
                    ScaledPoint scaledPointC0 = bVar.C0();
                    float f10 = scaledPointC0.f7016a;
                    ZoomLogger zoomLogger = K;
                    if ((f10 < 0.0f && scaledPoint.f7016a > 0.0f) || (f10 > 0.0f && scaledPoint.f7016a < 0.0f)) {
                        float fPow = (1.0f - ((float) Math.pow(Math.abs(f10) / bVar.D0(), 0.4d))) * 0.6f;
                        zoomLogger.a("onScroll", "applying friction X:", Float.valueOf(fPow));
                        scaledPoint.f7016a *= fPow;
                    }
                    float f11 = scaledPointC0.f7017b;
                    if ((f11 < 0.0f && scaledPoint.f7017b > 0.0f) || (f11 > 0.0f && scaledPoint.f7017b < 0.0f)) {
                        float fPow2 = (1.0f - ((float) Math.pow(Math.abs(f11) / bVar.E0(), 0.4d))) * 0.6f;
                        zoomLogger.a("onScroll", "applying friction Y:", Float.valueOf(fPow2));
                        scaledPoint.f7017b *= fPow2;
                    }
                    if (!bVar.f10940x) {
                        scaledPoint.f7016a = 0.0f;
                    }
                    if (!bVar.f10941y) {
                        scaledPoint.f7017b = 0.0f;
                    }
                    if (scaledPoint.f7016a == 0.0f && scaledPoint.f7017b == 0.0f) {
                        return true;
                    }
                    this.f9306i.c(new dl.c(scaledPoint, 3));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
