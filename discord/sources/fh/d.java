package fh;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import com.discord.R;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends ProgressBar {
    public int E;
    public boolean F;
    public final b G;
    public final b H;
    public final c I;
    public final c J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f9170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9171e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9172i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f9173v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f9174w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a f9175x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9176y;

    public d(Context context, AttributeSet attributeSet) {
        super(oh.a.a(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, R.attr.circularProgressIndicatorStyle);
        this.f9176y = false;
        this.E = 4;
        this.G = new b(this, 0);
        this.H = new b(this, 1);
        this.I = new c(0, this);
        this.J = new c(1, this);
        Context context2 = getContext();
        k kVar = new k();
        kVar.f9218e = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        bh.p.a(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = kg.a.f14433d;
        bh.p.b(context2, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        kVar.f9214a = com.facebook.imagepipeline.nativecode.c.v(context2, typedArrayObtainStyledAttributes, 10, dimensionPixelSize);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null) {
            int i7 = typedValuePeekValue.type;
            if (i7 == 5) {
                kVar.f9215b = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), kVar.f9214a / 2);
                kVar.f9217d = false;
            } else if (i7 == 6) {
                kVar.f9216c = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                kVar.f9217d = true;
            }
        }
        kVar.f9220g = typedArrayObtainStyledAttributes.getInt(6, 0);
        kVar.f9221h = typedArrayObtainStyledAttributes.getInt(1, 0);
        kVar.f9222i = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        int iAbs = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0));
        kVar.j = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(14, iAbs));
        kVar.k = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(15, iAbs));
        kVar.f9223l = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0));
        kVar.f9224m = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        kVar.f9225n = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
        if (!typedArrayObtainStyledAttributes.hasValue(3)) {
            kVar.f9218e = new int[]{io.sentry.config.a.x(context2, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(3).type != 1) {
            kVar.f9218e = new int[]{typedArrayObtainStyledAttributes.getColor(3, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(3, -1));
            kVar.f9218e = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            kVar.f9219f = typedArrayObtainStyledAttributes.getColor(8, -1);
        } else {
            kVar.f9219f = kVar.f9218e[0];
            TypedArray typedArrayObtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f2 = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            kVar.f9219f = io.sentry.config.a.j(kVar.f9219f, (int) (f2 * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        bh.p.a(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr2 = kg.a.f14438i;
        bh.p.b(context2, attributeSet, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        kVar.f9226o = typedArrayObtainStyledAttributes3.getInt(0, 0);
        kVar.f9227p = Math.max(com.facebook.imagepipeline.nativecode.c.v(context2, typedArrayObtainStyledAttributes3, 4, dimensionPixelSize2), kVar.f9214a * 2);
        kVar.f9228q = com.facebook.imagepipeline.nativecode.c.v(context2, typedArrayObtainStyledAttributes3, 3, dimensionPixelSize3);
        kVar.f9229r = typedArrayObtainStyledAttributes3.getInt(2, 0);
        kVar.f9230s = typedArrayObtainStyledAttributes3.getBoolean(1, true);
        typedArrayObtainStyledAttributes3.recycle();
        kVar.b();
        this.f9170d = kVar;
        bh.p.a(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        bh.p.b(context2, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        typedArrayObtainStyledAttributes4.getInt(7, -1);
        this.f9174w = Math.min(typedArrayObtainStyledAttributes4.getInt(5, -1), 1000);
        typedArrayObtainStyledAttributes4.recycle();
        this.f9175x = new a();
        this.f9173v = true;
    }

    private r getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().K;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().K;
    }

    public final void a(int i7, boolean z5) {
        if (!isIndeterminate()) {
            super.setProgress(i7);
            if (getProgressDrawable() == null || z5) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f9171e = i7;
            this.f9172i = z5;
            this.f9176y = true;
            if (getIndeterminateDrawable().isVisible()) {
                a aVar = this.f9175x;
                ContentResolver contentResolver = getContext().getContentResolver();
                aVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().L.m();
                    return;
                }
            }
            this.I.a(getIndeterminateDrawable());
        }
    }

    public final boolean b() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f9170d.f9221h;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f9170d.f9218e;
    }

    public int getIndicatorTrackGapSize() {
        return this.f9170d.f9222i;
    }

    public int getShowAnimationBehavior() {
        return this.f9170d.f9220g;
    }

    public int getTrackColor() {
        return this.f9170d.f9219f;
    }

    public int getTrackCornerRadius() {
        return this.f9170d.f9215b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.f9170d.f9216c;
    }

    public int getTrackThickness() {
        return this.f9170d.f9214a;
    }

    public int getWaveAmplitude() {
        return this.f9170d.f9223l;
    }

    public int getWaveSpeed() {
        return this.f9170d.f9224m;
    }

    public int getWavelengthDeterminate() {
        return this.f9170d.j;
    }

    public int getWavelengthIndeterminate() {
        return this.f9170d.k;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().L.l(this.I);
        }
        m progressDrawable = getProgressDrawable();
        c cVar = this.J;
        if (progressDrawable != null) {
            m progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f9240y == null) {
                progressDrawable2.f9240y = new ArrayList();
            }
            if (!progressDrawable2.f9240y.contains(cVar)) {
                progressDrawable2.f9240y.add(cVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            t indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f9240y == null) {
                indeterminateDrawable.f9240y = new ArrayList();
            }
            if (!indeterminateDrawable.f9240y.contains(cVar)) {
                indeterminateDrawable.f9240y.add(cVar);
            }
        }
        if (b()) {
            if (this.f9174w > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.H);
        removeCallbacks(this.G);
        ((o) getCurrentDrawable()).d(false, false, false);
        t indeterminateDrawable = getIndeterminateDrawable();
        c cVar = this.J;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().f(cVar);
            getIndeterminateDrawable().L.p();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().f(cVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        super.onLayout(z5, i7, i10, i11, i12);
        getCurrentDrawingDelegate().a();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i7, int i10) {
        try {
            r currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(((e) currentDrawingDelegate).g() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i7) : ((e) currentDrawingDelegate).g() + getPaddingLeft() + getPaddingRight(), ((e) currentDrawingDelegate).g() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i10) : ((e) currentDrawingDelegate).g() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        boolean z5 = i7 == 0;
        if (this.f9173v) {
            ((o) getCurrentDrawable()).d(b(), false, z5);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        if (this.f9173v) {
            ((o) getCurrentDrawable()).d(b(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(@NonNull a aVar) {
        this.f9175x = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f9236i = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f9236i = aVar;
        }
    }

    public void setHideAnimationBehavior(int i7) {
        this.f9170d.f9221h = i7;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z5) {
        try {
            if (z5 == isIndeterminate()) {
                return;
            }
            o oVar = (o) getCurrentDrawable();
            if (oVar != null) {
                oVar.d(false, false, false);
            }
            super.setIndeterminate(z5);
            o oVar2 = (o) getCurrentDrawable();
            if (oVar2 != null) {
                oVar2.d(b(), false, false);
            }
            if ((oVar2 instanceof t) && b()) {
                ((t) oVar2).L.o();
            }
            this.f9176y = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f2) {
        k kVar = this.f9170d;
        if (kVar.f9225n != f2) {
            kVar.f9225n = f2;
            getIndeterminateDrawable().L.i();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof t) {
            ((o) drawable).d(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            if (this.F) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{io.sentry.config.a.x(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f9170d.f9218e = iArr;
        getIndeterminateDrawable().L.i();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i7) {
        k kVar = this.f9170d;
        if (kVar.f9222i != i7) {
            kVar.f9222i = i7;
            kVar.b();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i7) {
        if (isIndeterminate()) {
            return;
        }
        a(i7, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (!(drawable instanceof m)) {
            if (this.F) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            super.setProgressDrawable(drawable);
        } else {
            m mVar = (m) drawable;
            mVar.d(false, false, false);
            super.setProgressDrawable(mVar);
            mVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i7) {
        this.f9170d.f9220g = i7;
        invalidate();
    }

    public void setTrackColor(int i7) {
        k kVar = this.f9170d;
        if (kVar.f9219f != i7) {
            kVar.f9219f = i7;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i7) {
        k kVar = this.f9170d;
        if (kVar.f9215b != i7) {
            kVar.f9215b = Math.min(i7, kVar.f9214a / 2);
            kVar.f9217d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f2) {
        k kVar = this.f9170d;
        if (kVar.f9216c != f2) {
            kVar.f9216c = Math.min(f2, 0.5f);
            kVar.f9217d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i7) {
        k kVar = this.f9170d;
        if (kVar.f9214a != i7) {
            kVar.f9214a = i7;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i7) {
        if (i7 != 0 && i7 != 4 && i7 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.E = i7;
    }

    public void setWaveAmplitude(int i7) {
        k kVar = this.f9170d;
        if (kVar.f9223l != i7) {
            kVar.f9223l = Math.abs(i7);
            requestLayout();
        }
    }

    public void setWaveSpeed(int i7) {
        k kVar = this.f9170d;
        kVar.f9224m = i7;
        m progressDrawable = getProgressDrawable();
        boolean z5 = kVar.f9224m != 0;
        ValueAnimator valueAnimator = progressDrawable.Q;
        if (z5 && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else {
            if (z5 || !valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i7) {
        setWavelengthDeterminate(i7);
        setWavelengthIndeterminate(i7);
    }

    public void setWavelengthDeterminate(int i7) {
        k kVar = this.f9170d;
        if (kVar.j != i7) {
            kVar.j = Math.abs(i7);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i7) {
        k kVar = this.f9170d;
        if (kVar.k != i7) {
            kVar.k = Math.abs(i7);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public t getIndeterminateDrawable() {
        return (t) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public m getProgressDrawable() {
        return (m) super.getProgressDrawable();
    }
}
