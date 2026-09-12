package mg;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a1;
import androidx.core.view.e1;
import androidx.core.view.l0;
import androidx.core.view.u0;
import bh.p;
import com.discord.R;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import e4.l;
import i.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kh.i;

/* JADX INFO: loaded from: classes3.dex */
public class f extends LinearLayout implements v0.a {
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ColorStateList I;
    public int J;
    public WeakReference K;
    public ValueAnimator L;
    public ValueAnimator.AnimatorUpdateListener M;
    public final ArrayList N;
    public final LinkedHashSet O;
    public final long P;
    public final TimeInterpolator Q;
    public int[] R;
    public int S;
    public Drawable T;
    public Integer U;
    public final float V;
    public AppBarLayout$Behavior W;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15778e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15779i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15780v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15781w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15782x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public WindowInsetsCompat f15783y;

    public f(Context context) {
        super(oh.a.b(context, null, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]), null, R.attr.appBarLayoutStyle);
        this.f15778e = -1;
        this.f15779i = -1;
        this.f15780v = -1;
        this.f15782x = 0;
        this.N = new ArrayList();
        this.O = new LinkedHashSet();
        Context context2 = getContext();
        int i7 = 1;
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayF = p.f(context3, null, h.f15786a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayF.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayF.getResourceId(0, 0)));
            }
            typedArrayF.recycle();
            TypedArray typedArrayF2 = p.f(context2, null, kg.a.f14430a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            this.I = com.facebook.imagepipeline.nativecode.c.t(context2, typedArrayF2, 6);
            this.P = io.sentry.config.a.S(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.Q = io.sentry.config.a.T(context2, R.attr.motionEasingStandardInterpolator, lg.a.f15071a);
            if (typedArrayF2.hasValue(4)) {
                d(typedArrayF2.getBoolean(4, false), false, false);
            }
            if (typedArrayF2.hasValue(3)) {
                h.a(this, typedArrayF2.getDimensionPixelSize(3, 0));
            }
            setBackground(typedArrayF2.getDrawable(0));
            if (Build.VERSION.SDK_INT >= 26) {
                if (typedArrayF2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayF2.getBoolean(2, false));
                }
                if (typedArrayF2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayF2.getBoolean(1, false));
                }
            }
            this.V = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.H = typedArrayF2.getBoolean(5, false);
            this.J = typedArrayF2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayF2.getDrawable(8));
            typedArrayF2.recycle();
            m mVar = new m(i7, this);
            WeakHashMap weakHashMap = u0.f1729a;
            l0.m(this, mVar);
        } catch (Throwable th2) {
            typedArrayF.recycle();
            throw th2;
        }
    }

    public static e b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            e eVar = new e((LinearLayout.LayoutParams) layoutParams);
            eVar.f15774a = 1;
            return eVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            e eVar2 = new e((ViewGroup.MarginLayoutParams) layoutParams);
            eVar2.f15774a = 1;
            return eVar2;
        }
        e eVar3 = new e(layoutParams);
        eVar3.f15774a = 1;
        return eVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final e generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e eVar = new e(context, attributeSet);
        eVar.f15774a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kg.a.f14431b);
        eVar.f15774a = typedArrayObtainStyledAttributes.getInt(1, 0);
        eVar.f15775b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new l(13);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            eVar.f15776c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return eVar;
    }

    public final void c() {
        AppBarLayout$Behavior appBarLayout$Behavior = this.W;
        d dVarZ = (appBarLayout$Behavior == null || this.f15778e == -1 || this.f15782x != 0) ? null : appBarLayout$Behavior.z(d2.b.f7577e, this);
        this.f15778e = -1;
        this.f15779i = -1;
        this.f15780v = -1;
        if (dVarZ != null) {
            AppBarLayout$Behavior appBarLayout$Behavior2 = this.W;
            if (appBarLayout$Behavior2.f6234m != null) {
                return;
            }
            appBarLayout$Behavior2.f6234m = dVarZ;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public final void d(boolean z5, boolean z6, boolean z7) {
        this.f15782x = (z5 ? 1 : 2) | (z6 ? 4 : 0) | (z7 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.T == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f15777d);
        this.T.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.T;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(boolean z5) {
        if (this.E || this.G == z5) {
            return false;
        }
        this.G = z5;
        refreshDrawableState();
        if (!(getBackground() instanceof i)) {
            return true;
        }
        if (this.I != null) {
            g(z5 ? 0.0f : 1.0f, z5 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.H) {
            return true;
        }
        float f2 = this.V;
        g(z5 ? 0.0f : f2, z5 ? f2 : 0.0f);
        return true;
    }

    public final boolean f(View view) {
        int i7;
        if (this.K == null && (i7 = this.J) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i7) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.J);
            }
            if (viewFindViewById != null) {
                this.K = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.K;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final void g(float f2, float f7) {
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f7);
        this.L = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.P);
        this.L.setInterpolator(this.Q);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.M;
        if (animatorUpdateListener != null) {
            this.L.addUpdateListener(animatorUpdateListener);
        }
        this.L.start();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @NonNull
    public v0.b getBehavior() {
        AppBarLayout$Behavior appBarLayout$Behavior = new AppBarLayout$Behavior();
        this.W = appBarLayout$Behavior;
        return appBarLayout$Behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i7 = this.f15779i;
        if (i7 != -1) {
            return i7;
        }
        int i10 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = eVar.f15774a;
                if ((i11 & 5) != 5) {
                    if (i10 > 0) {
                        break;
                    }
                } else {
                    int i12 = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    if ((i11 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i11 & 2) != 0) {
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i12 + measuredHeight;
                        }
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i10 += iMin;
                    }
                    iMin = minimumHeight + i12;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i10 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i10);
        this.f15779i = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i7 = this.f15780v;
        if (i7 != -1) {
            return i7;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin + childAt.getMeasuredHeight();
                int i11 = eVar.f15774a;
                if ((i11 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i11 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f15780v = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.J;
    }

    public i getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof i) {
            return (i) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i7 = (minimumHeight * 2) + topInset;
            return i7 < getHeight() ? i7 : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i10 = (minimumHeight2 * 2) + topInset;
        return i10 < getHeight() ? i10 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.f15782x;
    }

    public Drawable getStatusBarForeground() {
        return this.T;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f15783y;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i7 = this.f15778e;
        if (i7 != -1) {
            return i7;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = eVar.f15774a;
                if ((i11 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin + minimumHeight;
                if (i10 == 0 && childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
                minimumHeight = topInset;
                if ((i11 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f15778e = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof i) {
            com.facebook.imagepipeline.nativecode.c.J(this, (i) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        if (this.R == null) {
            this.R = new int[4];
        }
        int[] iArr = this.R;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + iArr.length);
        boolean z5 = this.F;
        iArr[0] = z5 ? R.attr.state_liftable : -2130969908;
        iArr[1] = (z5 && this.G) ? R.attr.state_lifted : -2130969909;
        iArr[2] = z5 ? R.attr.state_collapsible : -2130969904;
        iArr[3] = (z5 && this.G) ? R.attr.state_collapsed : -2130969903;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.K;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.K = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        super.onLayout(z5, i7, i10, i11, i12);
        boolean z6 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    WeakHashMap weakHashMap = u0.f1729a;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.f15781w = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            if (((e) getChildAt(i13).getLayoutParams()).f15776c != null) {
                this.f15781w = true;
                break;
            }
        }
        Drawable drawable = this.T;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.E) {
            return;
        }
        if (!this.H) {
            int childCount3 = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount3) {
                    z6 = false;
                    break;
                }
                int i15 = ((e) getChildAt(i14).getLayoutParams()).f15774a;
                if ((i15 & 1) == 1 && (i15 & 10) != 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        if (this.F != z6) {
            this.F = z6;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = yk.a.f(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i10));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        c();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final i iVar;
        ColorStateList colorStateList;
        Context context = getContext();
        final Integer numValueOf = null;
        if (drawable instanceof i) {
            iVar = (i) drawable;
        } else {
            ColorStateList colorStateListB = e1.b(drawable);
            if (colorStateListB == null) {
                iVar = null;
            } else {
                i iVar2 = new i();
                iVar2.q(colorStateListB);
                iVar = iVar2;
            }
        }
        if (iVar != null && (colorStateList = iVar.f14483e.f14466d) != null) {
            this.S = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.I;
            if (colorStateList2 != null) {
                Context context2 = getContext();
                TypedValue typedValueT = com.facebook.imagepipeline.nativecode.b.t(context2, R.attr.colorSurface);
                if (typedValueT != null) {
                    int i7 = typedValueT.resourceId;
                    numValueOf = Integer.valueOf(i7 != 0 ? context2.getColor(i7) : typedValueT.data);
                }
                this.M = new ValueAnimator.AnimatorUpdateListener() { // from class: mg.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        f fVar = this.f15759a;
                        LinkedHashSet linkedHashSet = fVar.O;
                        ArrayList arrayList = fVar.N;
                        int iN = io.sentry.config.a.N(fVar.S, colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
                        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iN);
                        i iVar3 = iVar;
                        iVar3.q(colorStateListValueOf);
                        if (fVar.T != null && (num = fVar.U) != null && num.equals(numValueOf)) {
                            fVar.T.setTint(iN);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (it.next() != null) {
                                    throw new ClassCastException();
                                }
                                if (iVar3.f14483e.f14466d != null) {
                                    throw null;
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw s0.g.a(it2);
                        }
                    }
                };
            } else {
                iVar.m(context);
                this.M = new a1(4, this, iVar);
            }
            drawable = iVar;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof i) {
            ((i) background).p(f2);
        }
    }

    public void setExpanded(boolean z5) {
        d(z5, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z5) {
        this.H = z5;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.J = -1;
        if (view != null) {
            this.K = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.K;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.K = null;
    }

    public void setLiftOnScrollTargetViewId(int i7) {
        this.J = i7;
        WeakReference weakReference = this.K;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.K = null;
    }

    public void setLiftableOverrideEnabled(boolean z5) {
        this.E = z5;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i7) {
        if (i7 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i7);
    }

    public void setPendingAction(int i7) {
        this.f15782x = i7;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.T;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.T = drawableMutate;
            if (drawableMutate instanceof i) {
                numValueOf = Integer.valueOf(((i) drawableMutate).S);
            } else {
                ColorStateList colorStateListB = e1.b(drawableMutate);
                if (colorStateListB != null) {
                    numValueOf = Integer.valueOf(colorStateListB.getDefaultColor());
                }
            }
            this.U = numValueOf;
            Drawable drawable3 = this.T;
            boolean z5 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.T.setState(getDrawableState());
                }
                this.T.setLayoutDirection(getLayoutDirection());
                this.T.setVisible(getVisibility() == 0, false);
                this.T.setCallback(this);
            }
            if (this.T != null && getTopInset() > 0) {
                z5 = true;
            }
            setWillNotDraw(!z5);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i7) {
        setStatusBarForeground(new ColorDrawable(i7));
    }

    public void setStatusBarForegroundResource(int i7) {
        setStatusBarForeground(mf.f.u(getContext(), i7));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        h.a(this, f2);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z5 = i7 == 0;
        Drawable drawable = this.T;
        if (drawable != null) {
            drawable.setVisible(z5, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.T;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
