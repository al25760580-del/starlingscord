package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.l0;
import androidx.core.view.u0;
import androidx.customview.widget.ViewDragHelper;
import com.discord.R;
import com.facebook.react.views.image.ReactImageView;
import gc.u;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kh.i;
import kh.l;
import kh.m;
import lh.c;
import lh.d;
import s0.g;
import v0.b;
import zs.a;

/* JADX INFO: loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f6416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f6417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f6418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f6419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f6420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f6421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewDragHelper f6424i;
    public boolean j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6428o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WeakReference f6429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WeakReference f6430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6431r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public VelocityTracker f6432s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6433t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f6434u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final lh.b f6435v;

    public SideSheetBehavior() {
        this.f6420e = new d(this);
        this.f6422g = true;
        this.f6423h = 5;
        this.k = 0.1f;
        this.f6431r = -1;
        this.f6434u = new LinkedHashSet();
        this.f6435v = new lh.b(this, 0);
    }

    @Override // v0.b
    public final void c(v0.d dVar) {
        this.f6429p = null;
        this.f6424i = null;
    }

    @Override // v0.b
    public final void f() {
        this.f6429p = null;
        this.f6424i = null;
    }

    @Override // v0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && u0.g(view) == null) || !this.f6422g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f6432s) != null) {
            velocityTracker.recycle();
            this.f6432s = null;
        }
        if (this.f6432s == null) {
            this.f6432s = VelocityTracker.obtain();
        }
        this.f6432s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f6433t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (viewDragHelper = this.f6424i) == null || !viewDragHelper.r(motionEvent)) ? false : true;
    }

    @Override // v0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i7) {
        View view2;
        View view3;
        int i10;
        View viewFindViewById;
        int i11 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f6429p;
        i iVar = this.f6417b;
        int iW = 0;
        if (weakReference == null) {
            this.f6429p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            io.sentry.config.a.S(context, R.attr.motionDurationMedium2, ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS);
            io.sentry.config.a.S(context, R.attr.motionDurationShort3, 150);
            io.sentry.config.a.S(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (iVar != null) {
                view.setBackground(iVar);
                float elevation = this.f6421f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                iVar.p(elevation);
            } else {
                ColorStateList colorStateList = this.f6418c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = u0.f1729a;
                    l0.i(view, colorStateList);
                }
            }
            int i12 = this.f6423h == 5 ? 4 : 0;
            if (view.getVisibility() != i12) {
                view.setVisibility(i12);
            }
            v();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (u0.g(view) == null) {
                u0.q(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i13 = Gravity.getAbsoluteGravity(((v0.d) view.getLayoutParams()).f21327c, i7) == 3 ? 1 : 0;
        a aVar = this.f6416a;
        if (aVar == null || aVar.B() != i13) {
            v0.d dVar = null;
            m mVar = this.f6419d;
            if (i13 == 0) {
                this.f6416a = new lh.a(this, i11);
                if (mVar != null) {
                    WeakReference weakReference2 = this.f6429p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof v0.d)) {
                        dVar = (v0.d) view3.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).rightMargin <= 0) {
                        l lVarG = mVar.g();
                        lVarG.f14495f = new kh.a(0.0f);
                        lVarG.f14496g = new kh.a(0.0f);
                        m mVarA = lVarG.a();
                        if (iVar != null) {
                            iVar.setShapeAppearanceModel(mVarA);
                        }
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalArgumentException(g.d(i13, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f6416a = new lh.a(this, iW);
                if (mVar != null) {
                    WeakReference weakReference3 = this.f6429p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof v0.d)) {
                        dVar = (v0.d) view2.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).leftMargin <= 0) {
                        l lVarG2 = mVar.g();
                        lVarG2.f14494e = new kh.a(0.0f);
                        lVarG2.f14497h = new kh.a(0.0f);
                        m mVarA2 = lVarG2.a();
                        if (iVar != null) {
                            iVar.setShapeAppearanceModel(mVarA2);
                        }
                    }
                }
            }
        }
        if (this.f6424i == null) {
            this.f6424i = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.f6435v);
        }
        int iW2 = this.f6416a.w(view);
        coordinatorLayout.k(i7, view);
        this.f6426m = coordinatorLayout.getWidth();
        this.f6427n = this.f6416a.x(coordinatorLayout);
        this.f6425l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f6428o = marginLayoutParams != null ? this.f6416a.g(marginLayoutParams) : 0;
        int i14 = this.f6423h;
        if (i14 == 1 || i14 == 2) {
            iW = iW2 - this.f6416a.w(view);
        } else if (i14 != 3) {
            if (i14 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f6423h);
            }
            iW = this.f6416a.t();
        }
        WeakHashMap weakHashMap2 = u0.f1729a;
        view.offsetLeftAndRight(iW);
        if (this.f6430q == null && (i10 = this.f6431r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i10)) != null) {
            this.f6430q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f6434u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // v0.b
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i7, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // v0.b
    public final void n(View view, Parcelable parcelable) {
        int i7 = ((c) parcelable).f15087i;
        if (i7 == 1 || i7 == 2) {
            i7 = 5;
        }
        this.f6423h = i7;
    }

    @Override // v0.b
    public final Parcelable o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new c(this);
    }

    @Override // v0.b
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f6423h == 1 && actionMasked == 0) {
            return true;
        }
        if (t()) {
            this.f6424i.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f6432s) != null) {
            velocityTracker.recycle();
            this.f6432s = null;
        }
        if (this.f6432s == null) {
            this.f6432s = VelocityTracker.obtain();
        }
        this.f6432s.addMovement(motionEvent);
        if (t() && actionMasked == 2 && !this.j && t()) {
            float fAbs = Math.abs(this.f6433t - motionEvent.getX());
            ViewDragHelper viewDragHelper = this.f6424i;
            if (fAbs > viewDragHelper.f1793b) {
                viewDragHelper.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.j;
    }

    public final void s(int i7) {
        View view;
        if (this.f6423h == i7) {
            return;
        }
        this.f6423h = i7;
        WeakReference weakReference = this.f6429p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i10 = this.f6423h == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
        Iterator it = this.f6434u.iterator();
        if (it.hasNext()) {
            throw g.a(it);
        }
        v();
    }

    public final boolean t() {
        if (this.f6424i != null) {
            return this.f6422g || this.f6423h == 1;
        }
        return false;
    }

    public final void u(View view, int i7, boolean z5) {
        int iR;
        if (i7 == 3) {
            iR = this.f6416a.r();
        } else {
            if (i7 != 5) {
                throw new IllegalArgumentException(kk.b.h(i7, "Invalid state to get outer edge offset: "));
            }
            iR = this.f6416a.t();
        }
        ViewDragHelper viewDragHelper = this.f6424i;
        if (viewDragHelper == null || (!z5 ? viewDragHelper.s(view, iR, view.getTop()) : viewDragHelper.q(iR, view.getTop()))) {
            s(i7);
        } else {
            s(2);
            this.f6420e.g(i7);
        }
    }

    public final void v() {
        View view;
        WeakReference weakReference = this.f6429p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        u0.m(262144, view);
        u0.j(0, view);
        u0.m(1048576, view);
        u0.j(0, view);
        int i7 = 5;
        if (this.f6423h != 5) {
            u0.n(view, androidx.core.view.accessibility.a.f1622m, null, new u(i7, this));
        }
        int i10 = 3;
        if (this.f6423h != 3) {
            u0.n(view, androidx.core.view.accessibility.a.k, null, new u(i10, this));
        }
    }

    public SideSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        this.f6420e = new d(this);
        this.f6422g = true;
        this.f6423h = 5;
        this.k = 0.1f;
        this.f6431r = -1;
        this.f6434u = new LinkedHashSet();
        this.f6435v = new lh.b(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kg.a.I);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f6418c = com.facebook.imagepipeline.nativecode.c.t(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f6419d = m.c(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f6431r = resourceId;
            WeakReference weakReference = this.f6430q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f6430q = null;
            WeakReference weakReference2 = this.f6429p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        m mVar = this.f6419d;
        if (mVar != null) {
            i iVar = new i(mVar);
            this.f6417b = iVar;
            iVar.m(context);
            ColorStateList colorStateList = this.f6418c;
            if (colorStateList != null) {
                this.f6417b.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f6417b.setTint(typedValue.data);
            }
        }
        this.f6421f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f6422g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
