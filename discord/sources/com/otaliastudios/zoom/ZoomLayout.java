package com.otaliastudios.zoom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.discord.zoom_layout.ZoomLayoutFixed;
import dl.a;
import dl.f;
import dl.i;
import dl.j;
import hl.b;
import hl.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w3.q;

/* JADX INFO: loaded from: classes3.dex */
public class ZoomLayout extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    @NotNull
    public static final Companion Companion = new Companion();

    @NotNull
    private static final ZoomLogger LOG;
    private static final String TAG = "ZoomLayout";

    @NotNull
    private final ZoomEngine engine;
    private boolean hasClickableChildren;

    public static final class Companion {
    }

    static {
        Intrinsics.checkNotNullExpressionValue("ZoomLayout", "TAG");
        Intrinsics.checkNotNullParameter("ZoomLayout", "tag");
        LOG = new ZoomLogger("ZoomLayout");
    }

    public ZoomLayout(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ZoomEngine zoomEngine = new ZoomEngine(context);
        super(context, null, 0);
        this.engine = zoomEngine;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, a.f7670a, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, R.styleable.ZoomEngine, defStyleAttr, 0)");
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(12, true);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(13, true);
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(19, true);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(11, true);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(20, true);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(3, true);
        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(14, true);
        boolean z15 = typedArrayObtainStyledAttributes.getBoolean(10, true);
        boolean z16 = typedArrayObtainStyledAttributes.getBoolean(18, true);
        boolean z17 = typedArrayObtainStyledAttributes.getBoolean(15, true);
        boolean z18 = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z19 = typedArrayObtainStyledAttributes.getBoolean(4, false);
        float f2 = typedArrayObtainStyledAttributes.getFloat(8, 0.8f);
        float f7 = typedArrayObtainStyledAttributes.getFloat(6, 2.5f);
        int integer = typedArrayObtainStyledAttributes.getInteger(9, 0);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(7, 0);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(16, 0);
        int i7 = typedArrayObtainStyledAttributes.getInt(17, 0);
        int i10 = typedArrayObtainStyledAttributes.getInt(0, 51);
        long j = typedArrayObtainStyledAttributes.getInt(2, 280);
        typedArrayObtainStyledAttributes.recycle();
        Intrinsics.checkNotNullParameter(this, "container");
        if (zoomEngine.f7021c != null) {
            throw new IllegalStateException("container already set");
        }
        ZoomLayoutFixed zoomLayoutFixed = (ZoomLayoutFixed) this;
        zoomEngine.f7021c = zoomLayoutFixed;
        addOnAttachStateChangeListener(new i(0, zoomEngine));
        zoomEngine.b(new j(zoomLayoutFixed));
        setTransformation(integer3, i7);
        setAlignment(i10);
        setOverScrollHorizontal(z5);
        setOverScrollVertical(z6);
        setHorizontalPanEnabled(z7);
        setVerticalPanEnabled(z10);
        setOverPinchable(z11);
        setZoomEnabled(z12);
        setFlingEnabled(z13);
        setScrollEnabled(z14);
        setOneFingerScrollEnabled(z15);
        setTwoFingersScrollEnabled(z16);
        setThreeFingersScrollEnabled(z17);
        setAllowFlingInOverscroll(z18);
        setAnimationDuration(j);
        setMinZoom(f2, integer);
        setMaxZoom(f7, integer2);
        setHasClickableChildren(z19);
        setWillNotDraw(false);
    }

    public final void a() {
        if (!this.hasClickableChildren) {
            invalidate();
        } else if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.setPivotX(0.0f);
            childAt.setPivotY(0.0f);
            childAt.setTranslationX(this.engine.f7027i.f10100e.left);
            childAt.setTranslationY(this.engine.f7027i.f10100e.top);
            childAt.setScaleX(this.engine.f7027i.f());
            childAt.setScaleY(this.engine.f7027i.f());
        }
        if ((isHorizontalScrollBarEnabled() || isVerticalScrollBarEnabled()) && !awakenScrollBars()) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int i7, ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(params, "params");
        if (getChildCount() > 0) {
            throw new RuntimeException(Intrinsics.stringPlus(TAG, " accepts only a single child."));
        }
        super.addView(child, i7, params);
    }

    public boolean cancelAnimations() {
        return this.engine.c();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return (int) (-this.engine.f7027i.f10100e.left);
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return (int) this.engine.f7027i.f10100e.width();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return (int) (-this.engine.f7027i.f10100e.top);
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        return (int) this.engine.f7027i.f10100e.height();
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NotNull Canvas canvas, @NotNull View child, long j) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.hasClickableChildren) {
            return super.drawChild(canvas, child, j);
        }
        int iSave = canvas.save();
        gl.a aVar = this.engine.f7027i;
        Matrix matrix = aVar.f10104i;
        matrix.set(aVar.f10102g);
        canvas.concat(matrix);
        boolean zDrawChild = super.drawChild(canvas, child, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    @NotNull
    public final ZoomEngine getEngine() {
        return this.engine;
    }

    public float getMaxZoom() {
        return this.engine.f7026h.f10946y;
    }

    public int getMaxZoomType() {
        return this.engine.f7026h.E;
    }

    public float getMinZoom() {
        return this.engine.f7026h.f10944w;
    }

    public int getMinZoomType() {
        return this.engine.f7026h.f10945x;
    }

    @NotNull
    public AbsolutePoint getPan() {
        AbsolutePoint absolutePointD = this.engine.f7027i.d();
        return new AbsolutePoint(absolutePointD.f7012a, absolutePointD.f7013b);
    }

    public float getPanX() {
        gl.a aVar = this.engine.f7027i;
        return aVar.f10100e.left / aVar.f();
    }

    public float getPanY() {
        gl.a aVar = this.engine.f7027i;
        return aVar.f10100e.top / aVar.f();
    }

    public float getRealZoom() {
        return this.engine.f7027i.f();
    }

    @NotNull
    public ScaledPoint getScaledPan() {
        ScaledPoint scaledPointE = this.engine.f7027i.e();
        return new ScaledPoint(scaledPointE.f7016a, scaledPointE.f7017b);
    }

    public float getScaledPanX() {
        return this.engine.f7027i.f10100e.left;
    }

    public float getScaledPanY() {
        return this.engine.f7027i.f10100e.top;
    }

    public float getZoom() {
        return this.engine.d();
    }

    public void moveTo(float f2, float f7, float f10, boolean z5) {
        this.engine.e(f2, f7, f10, z5);
    }

    public void moveToCenter(Float f2, boolean z5) {
        ZoomEngine zoomEngine = this.engine;
        c cVar = zoomEngine.f7026h;
        gl.a aVar = zoomEngine.f7027i;
        Float fValueOf = f2 == null ? null : Float.valueOf(lo.j.c(f2.floatValue(), cVar.B0() / cVar.f10943v, cVar.A0() / cVar.f10943v));
        float fD = fValueOf == null ? zoomEngine.d() : fValueOf.floatValue();
        float f7 = cVar.f10943v * fD;
        zoomEngine.e(fD, -((aVar.f10101f.width() / 2.0f) - ((aVar.j / f7) / 2.0f)), -((aVar.f10101f.height() / 2.0f) - ((aVar.k / f7) / 2.0f)), z5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public void onGlobalLayout() {
        if (getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        ZoomEngine zoomEngine = this.engine;
        float width = childAt.getWidth();
        float height = childAt.getHeight();
        ZoomLogger zoomLogger = ZoomEngine.f7018l;
        zoomEngine.g(width, height, false);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        ZoomEngine zoomEngine = this.engine;
        zoomEngine.getClass();
        Intrinsics.checkNotNullParameter(ev, "ev");
        el.a aVar = zoomEngine.f7024f;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(ev, "ev");
        return (aVar.a(ev) > 1) || (this.hasClickableChildren && super.onInterceptTouchEvent(ev));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode == 0 || mode2 == 0) {
            throw new RuntimeException(Intrinsics.stringPlus(TAG, " must be used with fixed dimensions (e.g. match_parent)"));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        measureChildren(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        ZoomEngine zoomEngine = this.engine;
        zoomEngine.getClass();
        Intrinsics.checkNotNullParameter(ev, "ev");
        el.a aVar = zoomEngine.f7024f;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(ev, "ev");
        return (aVar.a(ev) > 0) || (this.hasClickableChildren && super.onTouchEvent(ev));
    }

    public void panBy(float f2, float f7, boolean z5) {
        ZoomEngine zoomEngine = this.engine;
        gl.a aVar = zoomEngine.f7027i;
        int i7 = gl.c.k;
        gl.c cVarV = q.v(new f(f2, f7));
        if (z5) {
            aVar.a(cVarV);
        } else {
            zoomEngine.c();
            aVar.b(cVarV);
        }
    }

    public void panTo(float f2, float f7, boolean z5) {
        ZoomEngine zoomEngine = this.engine;
        gl.a aVar = zoomEngine.f7027i;
        float f10 = f2 - (aVar.f10100e.left / aVar.f());
        float f11 = f7 - (aVar.f10100e.top / aVar.f());
        gl.a aVar2 = zoomEngine.f7027i;
        int i7 = gl.c.k;
        gl.c cVarV = q.v(new f(f10, f11));
        if (z5) {
            aVar2.a(cVarV);
        } else {
            zoomEngine.c();
            aVar2.b(cVarV);
        }
    }

    public void realZoomTo(float f2, boolean z5) {
        this.engine.f(f2, z5);
    }

    public void setAlignment(int i7) {
        this.engine.f7025g.E = i7;
    }

    public void setAllowFlingInOverscroll(boolean z5) {
        this.engine.j.J = z5;
    }

    public void setAnimationDuration(long j) {
        this.engine.f7027i.f10107n = j;
    }

    public void setFlingEnabled(boolean z5) {
        this.engine.j.E = z5;
    }

    public final void setHasClickableChildren(boolean z5) {
        LOG.a("setHasClickableChildren:", "old:", Boolean.valueOf(this.hasClickableChildren), "new:", Boolean.valueOf(z5));
        if (this.hasClickableChildren && !z5 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.setScaleX(1.0f);
            childAt.setScaleY(1.0f);
            childAt.setTranslationX(0.0f);
            childAt.setTranslationY(0.0f);
        }
        this.hasClickableChildren = z5;
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        if (this.hasClickableChildren) {
            a();
        } else {
            invalidate();
        }
    }

    public void setHorizontalPanEnabled(boolean z5) {
        this.engine.f7025g.f10940x = z5;
    }

    public void setMaxZoom(float f2) {
        ZoomEngine zoomEngine = this.engine;
        zoomEngine.getClass();
        Intrinsics.checkNotNullParameter(zoomEngine, "this");
        zoomEngine.h(f2, 0);
    }

    public void setMinZoom(float f2) {
        ZoomEngine zoomEngine = this.engine;
        zoomEngine.getClass();
        Intrinsics.checkNotNullParameter(zoomEngine, "this");
        zoomEngine.i(f2, 0);
    }

    public void setOneFingerScrollEnabled(boolean z5) {
        this.engine.j.G = z5;
    }

    public void setOverPanRange(@NotNull OverPanRangeProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        ZoomEngine zoomEngine = this.engine;
        zoomEngine.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        b bVar = zoomEngine.f7025g;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(provider, "<set-?>");
        bVar.F = provider;
    }

    public void setOverPinchable(boolean z5) {
        this.engine.f7026h.H = z5;
    }

    public void setOverScrollHorizontal(boolean z5) {
        this.engine.f7025g.f10938v = z5;
    }

    public void setOverScrollVertical(boolean z5) {
        this.engine.f7025g.f10939w = z5;
    }

    public void setOverZoomRange(@NotNull OverZoomRangeProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        ZoomEngine zoomEngine = this.engine;
        zoomEngine.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        c cVar = zoomEngine.f7026h;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(provider, "<set-?>");
        cVar.F = provider;
    }

    public void setScrollEnabled(boolean z5) {
        this.engine.j.F = z5;
    }

    public void setThreeFingersScrollEnabled(boolean z5) {
        this.engine.j.I = z5;
    }

    public void setTransformation(int i7) {
        ZoomEngine zoomEngine = this.engine;
        zoomEngine.getClass();
        Intrinsics.checkNotNullParameter(zoomEngine, "this");
        zoomEngine.f7019a = i7;
        zoomEngine.f7020b = 0;
    }

    public void setTwoFingersScrollEnabled(boolean z5) {
        this.engine.j.H = z5;
    }

    public void setVerticalPanEnabled(boolean z5) {
        this.engine.f7025g.f10941y = z5;
    }

    public void setZoomEnabled(boolean z5) {
        this.engine.f7026h.G = z5;
    }

    public void zoomBy(float f2, boolean z5) {
        ZoomEngine zoomEngine = this.engine;
        zoomEngine.f(zoomEngine.d() * f2 * zoomEngine.f7026h.f10943v, z5);
    }

    public void zoomIn() {
        ZoomEngine zoomEngine = this.engine;
        zoomEngine.f(zoomEngine.d() * 1.3f * zoomEngine.f7026h.f10943v, true);
    }

    public void zoomOut() {
        ZoomEngine zoomEngine = this.engine;
        zoomEngine.f(zoomEngine.d() * 0.7f * zoomEngine.f7026h.f10943v, true);
    }

    public void zoomTo(float f2, boolean z5) {
        ZoomEngine zoomEngine = this.engine;
        zoomEngine.f(f2 * zoomEngine.f7026h.f10943v, z5);
    }

    public void setMaxZoom(float f2, int i7) {
        this.engine.h(f2, i7);
    }

    public void setMinZoom(float f2, int i7) {
        this.engine.i(f2, i7);
    }

    public void setTransformation(int i7, int i10) {
        ZoomEngine zoomEngine = this.engine;
        zoomEngine.f7019a = i7;
        zoomEngine.f7020b = i10;
    }
}
