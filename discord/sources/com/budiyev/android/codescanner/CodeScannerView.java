package com.budiyev.android.codescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import h5.a;
import h5.h;
import h5.i;
import h5.j;
import h5.o;
import h5.q;
import h5.r;
import h5.s;
import h5.t;
import java.util.List;
import java.util.Objects;
import u4.c;

/* JADX INFO: loaded from: classes.dex */
public final class CodeScannerView extends ViewGroup {
    public Drawable E;
    public Drawable F;
    public final ImageView G;
    public a H;
    public int I;
    public int J;
    public int K;
    public Drawable L;
    public Drawable M;
    public q N;
    public j O;
    public CodeScanner P;
    public final int Q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SurfaceView f3915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f3916e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f3917i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f3918v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3919w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3920x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3921y;

    public CodeScannerView(@NonNull Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.f3915d = new SurfaceView(context);
        this.f3916e = new t(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        int iRound = Math.round(16.0f * f2);
        this.Q = Math.round(20.0f * f2);
        ImageView imageView = new ImageView(context);
        this.f3917i = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.f3917i.setOnClickListener(new h(this, 0));
        ImageView imageView2 = new ImageView(context);
        this.G = imageView2;
        imageView2.setScaleType(scaleType);
        this.G.setOnClickListener(new h(this, 1));
        a aVar = a.f10332e;
        a aVar2 = a.f10331d;
        if (attributeSet == null) {
            b(1.0f, 1.0f);
            setMaskColor(1996488704);
            setMaskVisible(true);
            setFrameColor(-1);
            setFrameVisible(true);
            setFrameThickness(Math.round(2.0f * f2));
            setFrameCornersSize(Math.round(f2 * 50.0f));
            setFrameCornersRadius(Math.round(f2 * 0.0f));
            setFrameCornersCapRounded(false);
            setFrameSize(0.75f);
            setFrameVerticalBias(0.5f);
            setAutoFocusButtonColor(-1);
            setFlashButtonColor(-1);
            setAutoFocusButtonVisible(true);
            setAutoFocusButtonPosition(aVar2);
            setFlashButtonVisible(true);
            setFlashButtonPosition(aVar);
            setAutoFocusButtonPaddingHorizontal(iRound);
            setAutoFocusButtonPaddingVertical(iRound);
            setFlashButtonPaddingHorizontal(iRound);
            setFlashButtonPaddingVertical(iRound);
            setAutoFocusButtonOnIcon(context.getDrawable(2131231440));
            setAutoFocusButtonOffIcon(context.getDrawable(2131231439));
            setFlashButtonOnIcon(context.getDrawable(2131231442));
            setFlashButtonOffIcon(context.getDrawable(2131231441));
        } else {
            TypedArray typedArray = null;
            try {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, r.f10376a, 0, 0);
                try {
                    setMaskColor(typedArrayObtainStyledAttributes.getColor(24, 1996488704));
                    setMaskVisible(typedArrayObtainStyledAttributes.getBoolean(25, true));
                    setFrameColor(typedArrayObtainStyledAttributes.getColor(16, -1));
                    setFrameVisible(typedArrayObtainStyledAttributes.getBoolean(23, true));
                    setFrameThickness(typedArrayObtainStyledAttributes.getDimensionPixelOffset(21, Math.round(2.0f * f2)));
                    setFrameCornersSize(typedArrayObtainStyledAttributes.getDimensionPixelOffset(19, Math.round(f2 * 50.0f)));
                    setFrameCornersRadius(typedArrayObtainStyledAttributes.getDimensionPixelOffset(18, Math.round(f2 * 0.0f)));
                    setFrameCornersCapRounded(typedArrayObtainStyledAttributes.getBoolean(17, false));
                    b(typedArrayObtainStyledAttributes.getFloat(15, 1.0f), typedArrayObtainStyledAttributes.getFloat(14, 1.0f));
                    setFrameSize(typedArrayObtainStyledAttributes.getFloat(20, 0.75f));
                    setFrameVerticalBias(typedArrayObtainStyledAttributes.getFloat(22, 0.5f));
                    setAutoFocusButtonVisible(typedArrayObtainStyledAttributes.getBoolean(6, true));
                    setAutoFocusButtonColor(typedArrayObtainStyledAttributes.getColor(0, -1));
                    int i7 = typedArrayObtainStyledAttributes.getInt(5, 0);
                    a aVar3 = a.f10333i;
                    a aVar4 = a.f10334v;
                    setAutoFocusButtonPosition(i7 != 1 ? i7 != 2 ? i7 != 3 ? aVar2 : aVar4 : aVar3 : aVar);
                    setAutoFocusButtonPaddingHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, iRound));
                    setAutoFocusButtonPaddingVertical(typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, iRound));
                    Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
                    if (drawable == null) {
                        drawable = context.getDrawable(2131231440);
                    }
                    setAutoFocusButtonOnIcon(drawable);
                    Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(1);
                    if (drawable2 == null) {
                        drawable2 = context.getDrawable(2131231439);
                    }
                    setAutoFocusButtonOffIcon(drawable2);
                    setFlashButtonVisible(typedArrayObtainStyledAttributes.getBoolean(13, true));
                    setFlashButtonColor(typedArrayObtainStyledAttributes.getColor(7, -1));
                    int i10 = typedArrayObtainStyledAttributes.getInt(12, 1);
                    setFlashButtonPosition(i10 != 1 ? i10 != 2 ? i10 != 3 ? aVar2 : aVar4 : aVar3 : aVar);
                    setFlashButtonPaddingHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, iRound));
                    setFlashButtonPaddingVertical(typedArrayObtainStyledAttributes.getDimensionPixelOffset(11, iRound));
                    Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(9);
                    if (drawable3 == null) {
                        drawable3 = context.getDrawable(2131231442);
                    }
                    setFlashButtonOnIcon(drawable3);
                    Drawable drawable4 = typedArrayObtainStyledAttributes.getDrawable(8);
                    if (drawable4 == null) {
                        drawable4 = context.getDrawable(2131231441);
                    }
                    setFlashButtonOffIcon(drawable4);
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th2) {
                    th = th2;
                    typedArray = typedArrayObtainStyledAttributes;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        if (isInEditMode()) {
            setAutoFocusEnabled(true);
            setFlashEnabled(true);
        }
        addView(this.f3915d, new i(-1, -1));
        addView(this.f3916e, new i(-1, -1));
        addView(this.f3917i, new i(-2, -2));
        addView(this.G, new i(-2, -2));
    }

    public final void a(ImageView imageView, a aVar, int i7, int i10) {
        int measuredWidth = imageView.getMeasuredWidth();
        int measuredHeight = imageView.getMeasuredHeight();
        int layoutDirection = getLayoutDirection();
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            if (layoutDirection == 1) {
                imageView.layout(i7 - measuredWidth, 0, i7, measuredHeight);
                return;
            } else {
                imageView.layout(0, 0, measuredWidth, measuredHeight);
                return;
            }
        }
        if (iOrdinal == 1) {
            if (layoutDirection == 1) {
                imageView.layout(0, 0, measuredWidth, measuredHeight);
                return;
            } else {
                imageView.layout(i7 - measuredWidth, 0, i7, measuredHeight);
                return;
            }
        }
        if (iOrdinal == 2) {
            if (layoutDirection == 1) {
                imageView.layout(i7 - measuredWidth, i10 - measuredHeight, i7, i10);
                return;
            } else {
                imageView.layout(0, i10 - measuredHeight, measuredWidth, i10);
                return;
            }
        }
        if (iOrdinal != 3) {
            return;
        }
        if (layoutDirection == 1) {
            imageView.layout(0, i10 - measuredHeight, measuredWidth, i10);
        } else {
            imageView.layout(i7 - measuredWidth, i10 - measuredHeight, i7, i10);
        }
    }

    public final void b(float f2, float f7) {
        if (f2 <= 0.0f || f7 <= 0.0f) {
            throw new IllegalArgumentException("Frame aspect ratio values should be greater than zero");
        }
        t tVar = this.f3916e;
        tVar.f10387y = f2;
        tVar.E = f7;
        tVar.a(tVar.getWidth(), tVar.getHeight());
        if (tVar.isLaidOut()) {
            tVar.invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof i;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new i(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new i(getContext(), attributeSet);
    }

    public int getAutoFocusButtonColor() {
        return this.f3921y;
    }

    @NonNull
    public Drawable getAutoFocusButtonOffIcon() {
        return this.F;
    }

    @NonNull
    public Drawable getAutoFocusButtonOnIcon() {
        return this.E;
    }

    public int getAutoFocusButtonPaddingHorizontal() {
        return this.f3919w;
    }

    public int getAutoFocusButtonPaddingVertical() {
        return this.f3920x;
    }

    @NonNull
    public a getAutoFocusButtonPosition() {
        return this.f3918v;
    }

    public int getFlashButtonColor() {
        return this.K;
    }

    @NonNull
    public Drawable getFlashButtonOffIcon() {
        return this.M;
    }

    @NonNull
    public Drawable getFlashButtonOnIcon() {
        return this.L;
    }

    public int getFlashButtonPaddingHorizontal() {
        return this.I;
    }

    public int getFlashButtonPaddingVertical() {
        return this.J;
    }

    @NonNull
    public a getFlashButtonPosition() {
        return this.H;
    }

    public float getFrameAspectRatioHeight() {
        return this.f3916e.E;
    }

    public float getFrameAspectRatioWidth() {
        return this.f3916e.f10387y;
    }

    public int getFrameColor() {
        return this.f3916e.f10382e.getColor();
    }

    public int getFrameCornersRadius() {
        return this.f3916e.f10386x;
    }

    public int getFrameCornersSize() {
        return this.f3916e.f10385w;
    }

    public s getFrameRect() {
        return this.f3916e.f10384v;
    }

    public float getFrameSize() {
        return this.f3916e.F;
    }

    public int getFrameThickness() {
        return (int) this.f3916e.f10382e.getStrokeWidth();
    }

    public float getFrameVerticalBias() {
        return this.f3916e.G;
    }

    public int getMaskColor() {
        return this.f3916e.f10381d.getColor();
    }

    @NonNull
    public SurfaceView getPreviewView() {
        return this.f3915d;
    }

    @NonNull
    public t getViewFinderView() {
        return this.f3916e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int childCount = getChildCount();
        if (childCount > 5) {
            throw new IllegalStateException("CodeScannerView can have zero or one child");
        }
        int i17 = i11 - i7;
        int i18 = i12 - i10;
        q qVar = this.N;
        if (qVar == null) {
            this.f3915d.layout(0, 0, i17, i18);
        } else {
            int i19 = qVar.f10374a;
            if (i19 > i17) {
                int i20 = (i19 - i17) / 2;
                i13 = 0 - i20;
                i14 = i20 + i17;
            } else {
                i13 = 0;
                i14 = i17;
            }
            int i21 = qVar.f10375b;
            if (i21 > i18) {
                int i22 = (i21 - i18) / 2;
                i15 = 0 - i22;
                i16 = i22 + i18;
            } else {
                i15 = 0;
                i16 = i18;
            }
            this.f3915d.layout(i13, i15, i14, i16);
        }
        this.f3916e.layout(0, 0, i17, i18);
        a(this.f3917i, this.f3918v, i17, i18);
        a(this.G, this.H, i17, i18);
        if (childCount == 5) {
            s sVar = this.f3916e.f10384v;
            int i23 = sVar != null ? sVar.f10380d : 0;
            View childAt = getChildAt(4);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            if (childAt.getVisibility() != 8) {
                i iVar = (i) childAt.getLayoutParams();
                int i24 = paddingLeft + ((ViewGroup.MarginLayoutParams) iVar).leftMargin;
                int i25 = paddingTop + ((ViewGroup.MarginLayoutParams) iVar).topMargin + i23;
                childAt.layout(i24, i25, childAt.getMeasuredWidth() + i24, childAt.getMeasuredHeight() + i25);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int childCount = getChildCount();
        if (childCount > 5) {
            throw new IllegalStateException("CodeScannerView can have zero or one child");
        }
        measureChildWithMargins(this.f3915d, i7, 0, i10, 0);
        measureChildWithMargins(this.f3916e, i7, 0, i10, 0);
        measureChildWithMargins(this.f3917i, i7, 0, i10, 0);
        measureChildWithMargins(this.G, i7, 0, i10, 0);
        if (childCount == 5) {
            s sVar = this.f3916e.f10384v;
            measureChildWithMargins(getChildAt(4), i7, 0, i10, sVar != null ? sVar.f10380d : 0);
        }
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i7), View.getDefaultSize(getSuggestedMinimumHeight(), i10));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        j jVar = this.O;
        if (jVar != null) {
            c cVar = (c) jVar;
            synchronized (((CodeScanner) cVar.f20946d).f3891a) {
                try {
                    CodeScanner codeScanner = (CodeScanner) cVar.f20946d;
                    if (i7 != codeScanner.D || i10 != codeScanner.E) {
                        boolean z5 = codeScanner.f3913y;
                        if (codeScanner.f3907s) {
                            ((CodeScanner) cVar.f20946d).b();
                        }
                        if (z5 || ((CodeScanner) cVar.f20946d).B) {
                            ((CodeScanner) cVar.f20946d).a(i7, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o oVar;
        int i7;
        int i10;
        int i11;
        int i12;
        List<String> supportedFocusModes;
        CodeScanner codeScanner = this.P;
        s frameRect = getFrameRect();
        int x5 = (int) motionEvent.getX();
        int y5 = (int) motionEvent.getY();
        if (codeScanner != null && frameRect != null && (((oVar = codeScanner.f3905q) == null || oVar.f10372h) && motionEvent.getAction() == 0 && (i7 = frameRect.f10377a) < x5 && (i10 = frameRect.f10378b) < y5 && (i11 = frameRect.f10379c) > x5 && (i12 = frameRect.f10380d) > y5)) {
            int i13 = this.Q;
            int i14 = x5 - i13;
            int i15 = y5 - i13;
            int i16 = x5 + i13;
            int i17 = y5 + i13;
            s sVar = new s(i14, i15, i16, i17);
            int i18 = i16 - i14;
            int i19 = i17 - i15;
            int i20 = i11 - i7;
            int i21 = i12 - i10;
            if (i14 < i7 || i15 < i10 || i16 > i11 || i17 > i12) {
                int iMin = Math.min(i18, i20);
                int iMin2 = Math.min(i19, i21);
                if (i14 < i7) {
                    i11 = i7 + iMin;
                } else if (i16 > i11) {
                    i7 = i11 - iMin;
                } else {
                    i11 = i16;
                    i7 = i14;
                }
                if (i15 < i10) {
                    i12 = i10 + iMin2;
                } else if (i17 > i12) {
                    i10 = i12 - iMin2;
                } else {
                    i12 = i17;
                    i10 = i15;
                }
                sVar = new s(i7, i10, i11, i12);
            }
            synchronized (codeScanner.f3891a) {
                if (codeScanner.f3907s && codeScanner.f3913y && !codeScanner.f3912x) {
                    try {
                        codeScanner.e(false);
                        o oVar2 = codeScanner.f3905q;
                        if (codeScanner.f3913y && oVar2 != null && oVar2.f10372h) {
                            q qVar = oVar2.f10367c;
                            int i22 = qVar.f10374a;
                            int i23 = qVar.f10375b;
                            int i24 = oVar2.f10370f;
                            if (i24 == 90 || i24 == 270) {
                                i22 = i23;
                                i23 = i22;
                            }
                            s sVarL = b.l(i22, i23, sVar, oVar2.f10368d, oVar2.f10369e);
                            Camera camera = oVar2.f10365a;
                            camera.cancelAutoFocus();
                            Camera.Parameters parameters = camera.getParameters();
                            b.e(parameters, sVarL, i22, i23, i24);
                            if (!"auto".equals(parameters.getFocusMode()) && (supportedFocusModes = parameters.getSupportedFocusModes()) != null && supportedFocusModes.contains("auto")) {
                                parameters.setFocusMode("auto");
                            }
                            camera.setParameters(parameters);
                            camera.autoFocus(codeScanner.f3898h);
                            codeScanner.f3912x = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAutoFocusButtonColor(int i7) {
        this.f3921y = i7;
        this.f3917i.setColorFilter(i7);
    }

    public void setAutoFocusButtonOffIcon(@NonNull Drawable drawable) {
        Objects.requireNonNull(drawable);
        boolean z5 = drawable != this.F;
        this.F = drawable;
        CodeScanner codeScanner = this.P;
        if (!z5 || codeScanner == null) {
            return;
        }
        setAutoFocusEnabled(codeScanner.f3909u);
    }

    public void setAutoFocusButtonOnIcon(@NonNull Drawable drawable) {
        Objects.requireNonNull(drawable);
        boolean z5 = drawable != this.E;
        this.E = drawable;
        CodeScanner codeScanner = this.P;
        if (!z5 || codeScanner == null) {
            return;
        }
        setAutoFocusEnabled(codeScanner.f3909u);
    }

    public void setAutoFocusButtonPaddingHorizontal(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Padding should be equal to or grater then zero");
        }
        boolean z5 = i7 != this.f3919w;
        this.f3919w = i7;
        if (z5) {
            int i10 = this.f3920x;
            this.f3917i.setPadding(i7, i10, i7, i10);
        }
    }

    public void setAutoFocusButtonPaddingVertical(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Padding should be equal to or grater then zero");
        }
        boolean z5 = i7 != this.f3920x;
        this.f3920x = i7;
        if (z5) {
            int i10 = this.f3919w;
            this.f3917i.setPadding(i10, i7, i10, i7);
        }
    }

    public void setAutoFocusButtonPosition(@NonNull a aVar) {
        Objects.requireNonNull(aVar);
        boolean z5 = aVar != this.f3918v;
        this.f3918v = aVar;
        if (z5 && isLaidOut()) {
            requestLayout();
        }
    }

    public void setAutoFocusButtonVisible(boolean z5) {
        this.f3917i.setVisibility(z5 ? 0 : 4);
    }

    public void setAutoFocusEnabled(boolean z5) {
        this.f3917i.setImageDrawable(z5 ? this.E : this.F);
    }

    public void setCodeScanner(@NonNull CodeScanner codeScanner) {
        if (this.P != null) {
            throw new IllegalStateException("Code scanner has already been set");
        }
        this.P = codeScanner;
        setAutoFocusEnabled(codeScanner.f3909u);
        setFlashEnabled(codeScanner.f3910v);
    }

    public void setFlashButtonColor(int i7) {
        this.K = i7;
        this.G.setColorFilter(i7);
    }

    public void setFlashButtonOffIcon(@NonNull Drawable drawable) {
        Objects.requireNonNull(drawable);
        boolean z5 = drawable != this.M;
        this.M = drawable;
        CodeScanner codeScanner = this.P;
        if (!z5 || codeScanner == null) {
            return;
        }
        setFlashEnabled(codeScanner.f3910v);
    }

    public void setFlashButtonOnIcon(@NonNull Drawable drawable) {
        Objects.requireNonNull(drawable);
        boolean z5 = drawable != this.L;
        this.L = drawable;
        CodeScanner codeScanner = this.P;
        if (!z5 || codeScanner == null) {
            return;
        }
        setFlashEnabled(codeScanner.f3910v);
    }

    public void setFlashButtonPaddingHorizontal(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Padding should be equal to or grater then zero");
        }
        boolean z5 = i7 != this.I;
        this.I = i7;
        if (z5) {
            int i10 = this.J;
            this.G.setPadding(i7, i10, i7, i10);
        }
    }

    public void setFlashButtonPaddingVertical(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Padding should be equal to or grater then zero");
        }
        boolean z5 = i7 != this.J;
        this.J = i7;
        if (z5) {
            int i10 = this.I;
            this.G.setPadding(i10, i7, i10, i7);
        }
    }

    public void setFlashButtonPosition(@NonNull a aVar) {
        Objects.requireNonNull(aVar);
        boolean z5 = aVar != this.H;
        this.H = aVar;
        if (z5) {
            requestLayout();
        }
    }

    public void setFlashButtonVisible(boolean z5) {
        this.G.setVisibility(z5 ? 0 : 4);
    }

    public void setFlashEnabled(boolean z5) {
        this.G.setImageDrawable(z5 ? this.L : this.M);
    }

    public void setFrameAspectRatioHeight(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Frame aspect ratio values should be greater than zero");
        }
        t tVar = this.f3916e;
        tVar.E = f2;
        tVar.a(tVar.getWidth(), tVar.getHeight());
        if (tVar.isLaidOut()) {
            tVar.invalidate();
        }
    }

    public void setFrameAspectRatioWidth(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Frame aspect ratio values should be greater than zero");
        }
        t tVar = this.f3916e;
        tVar.f10387y = f2;
        tVar.a(tVar.getWidth(), tVar.getHeight());
        if (tVar.isLaidOut()) {
            tVar.invalidate();
        }
    }

    public void setFrameColor(int i7) {
        t tVar = this.f3916e;
        tVar.f10382e.setColor(i7);
        if (tVar.isLaidOut()) {
            tVar.invalidate();
        }
    }

    public void setFrameCornersCapRounded(boolean z5) {
        t tVar = this.f3916e;
        tVar.f10382e.setStrokeCap(z5 ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        tVar.invalidate();
    }

    public void setFrameCornersRadius(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Frame corners radius can't be negative");
        }
        t tVar = this.f3916e;
        tVar.f10386x = i7;
        if (tVar.isLaidOut()) {
            tVar.invalidate();
        }
    }

    public void setFrameCornersSize(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Frame corners size can't be negative");
        }
        t tVar = this.f3916e;
        tVar.f10385w = i7;
        if (tVar.isLaidOut()) {
            tVar.invalidate();
        }
    }

    public void setFrameSize(float f2) {
        if (f2 < 0.1d || f2 > 1.0f) {
            throw new IllegalArgumentException("Max frame size value should be between 0.1 and 1, inclusive");
        }
        t tVar = this.f3916e;
        tVar.F = f2;
        tVar.a(tVar.getWidth(), tVar.getHeight());
        if (tVar.isLaidOut()) {
            tVar.invalidate();
        }
    }

    public void setFrameThickness(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Frame thickness can't be negative");
        }
        t tVar = this.f3916e;
        tVar.f10382e.setStrokeWidth(i7);
        if (tVar.isLaidOut()) {
            tVar.invalidate();
        }
    }

    public void setFrameVerticalBias(float f2) {
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("Max frame size value should be between 0 and 1, inclusive");
        }
        t tVar = this.f3916e;
        tVar.G = f2;
        tVar.a(tVar.getWidth(), tVar.getHeight());
        if (tVar.isLaidOut()) {
            tVar.invalidate();
        }
    }

    public void setFrameVisible(boolean z5) {
        this.f3916e.I = z5;
    }

    public void setMaskColor(int i7) {
        t tVar = this.f3916e;
        tVar.f10381d.setColor(i7);
        if (tVar.isLaidOut()) {
            tVar.invalidate();
        }
    }

    public void setMaskVisible(boolean z5) {
        t tVar = this.f3916e;
        tVar.H = z5;
        if (tVar.isLaidOut()) {
            tVar.invalidate();
        }
    }

    public void setPreviewSize(q qVar) {
        this.N = qVar;
        requestLayout();
    }

    public void setSizeListener(j jVar) {
        this.O = jVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new i((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new i(layoutParams);
    }
}
