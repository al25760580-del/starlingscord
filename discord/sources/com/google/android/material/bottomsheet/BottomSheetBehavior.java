package com.google.android.material.bottomsheet;

import a5.i0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.u0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.l0;
import androidx.customview.widget.ViewDragHelper;
import bh.p;
import com.discord.R;
import com.discord.chat.presentation.list.a;
import com.facebook.react.views.image.ReactImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import kh.i;
import kh.m;
import lh.d;
import rg.c;
import v0.b;

/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends b {
    public final d A;
    public final ValueAnimator B;
    public int C;
    public int D;
    public int E;
    public float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final boolean L;
    public boolean M;
    public int N;
    public ViewDragHelper O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public final ArrayList Y;
    public VelocityTracker Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6271a;
    public int a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6272b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f6273b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f6274c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f6275c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6276d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public HashMap f6277d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6278e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final SparseIntArray f6279e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6280f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final lh.b f6281f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f6284i;
    public final ColorStateList j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6286m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6287n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f6288o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f6289p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f6290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f6291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f6292s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f6293t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f6294u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6295v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f6297x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m f6298y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6299z;

    public BottomSheetBehavior() {
        this.f6271a = 0;
        this.f6272b = true;
        this.k = -1;
        this.f6285l = -1;
        this.A = new d(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f6273b0 = -1;
        this.f6279e0 = new SparseIntArray();
        this.f6281f0 = new lh.b(this, 1);
    }

    public static View x(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View viewX = x(viewGroup.getChildAt(i7));
            if (viewX != null) {
                return viewX;
            }
        }
        return null;
    }

    public static int y(int i7, int i10, int i11, int i12) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i10, i12);
        if (i11 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i11), 1073741824);
        }
        if (size != 0) {
            i11 = Math.min(size, i11);
        }
        return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    public final int A(int i7) {
        if (i7 == 3) {
            return z();
        }
        if (i7 == 4) {
            return this.G;
        }
        if (i7 == 5) {
            return this.V;
        }
        if (i7 == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(kk.b.h(i7, "Invalid state to get top offset: "));
    }

    public final boolean B() {
        WeakReference weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void C(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.C = i7;
        L(this.N, true);
    }

    public final void D(boolean z5) {
        if (this.f6272b == z5) {
            return;
        }
        this.f6272b = z5;
        if (this.W != null) {
            t();
        }
        H((this.f6272b && this.N == 6) ? 3 : this.N);
        L(this.N, true);
        K();
    }

    public final void E(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.F = f2;
        if (this.W != null) {
            this.E = (int) ((1.0f - f2) * this.V);
        }
    }

    public final void F(int i7) {
        if (i7 == -1) {
            if (this.f6280f) {
                return;
            } else {
                this.f6280f = true;
            }
        } else {
            if (!this.f6280f && this.f6278e == i7) {
                return;
            }
            this.f6280f = false;
            this.f6278e = Math.max(0, i7);
        }
        N();
    }

    public final void G(int i7) {
        if (i7 == 1 || i7 == 2) {
            throw new IllegalArgumentException(a.k(new StringBuilder("STATE_"), i7 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.I && i7 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i7);
            return;
        }
        int i10 = (i7 == 6 && this.f6272b && A(i7) <= this.D) ? 3 : i7;
        WeakReference weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            H(i7);
            return;
        }
        View view = (View) this.W.get();
        u0 u0Var = new u0(this, view, i10);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(u0Var);
        } else {
            u0Var.run();
        }
    }

    public final void H(int i7) {
        View view;
        if (this.N == i7) {
            return;
        }
        this.N = i7;
        if (i7 != 4 && i7 != 3 && i7 != 6) {
            boolean z5 = this.I;
        }
        WeakReference weakReference = this.W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i10 = 0;
        if (i7 == 3) {
            M(true);
        } else if (i7 == 6 || i7 == 5 || i7 == 4) {
            M(false);
        }
        L(i7, true);
        while (true) {
            ArrayList arrayList = this.Y;
            if (i10 >= arrayList.size()) {
                K();
                return;
            } else {
                ((rg.b) arrayList.get(i10)).b(i7, view);
                i10++;
            }
        }
    }

    public final boolean I(View view, float f2) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f2 * this.S) + ((float) view.getTop())) - ((float) this.G)) / ((float) v()) > 0.5f;
    }

    public final void J(View view, int i7, boolean z5) {
        int iA = A(i7);
        ViewDragHelper viewDragHelper = this.O;
        if (viewDragHelper == null || (!z5 ? viewDragHelper.s(view, view.getLeft(), iA) : viewDragHelper.q(view.getLeft(), iA))) {
            H(i7);
            return;
        }
        H(2);
        L(i7, true);
        this.A.g(i7);
    }

    public final void K() {
        View view;
        int iA;
        WeakReference weakReference = this.W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        androidx.core.view.u0.m(524288, view);
        androidx.core.view.u0.j(0, view);
        androidx.core.view.u0.m(262144, view);
        androidx.core.view.u0.j(0, view);
        androidx.core.view.u0.m(1048576, view);
        androidx.core.view.u0.j(0, view);
        SparseIntArray sparseIntArray = this.f6279e0;
        int i7 = sparseIntArray.get(0, -1);
        if (i7 != -1) {
            androidx.core.view.u0.m(i7, view);
            androidx.core.view.u0.j(0, view);
            sparseIntArray.delete(0);
        }
        if (!this.f6272b && this.N != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            rg.a aVar = new rg.a(this, 6);
            ArrayList arrayListH = androidx.core.view.u0.h(view);
            int i10 = 0;
            while (true) {
                if (i10 >= arrayListH.size()) {
                    int i11 = 0;
                    int i12 = -1;
                    while (true) {
                        int[] iArr = androidx.core.view.u0.f1732d;
                        if (i11 >= 32 || i12 != -1) {
                            break;
                        }
                        int i13 = iArr[i11];
                        boolean z5 = true;
                        for (int i14 = 0; i14 < arrayListH.size(); i14++) {
                            z5 &= ((androidx.core.view.accessibility.a) arrayListH.get(i14)).a() != i13;
                        }
                        if (z5) {
                            i12 = i13;
                        }
                        i11++;
                    }
                    iA = i12;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((androidx.core.view.accessibility.a) arrayListH.get(i10)).f1627a).getLabel())) {
                    iA = ((androidx.core.view.accessibility.a) arrayListH.get(i10)).a();
                    break;
                }
                i10++;
            }
            if (iA != -1) {
                androidx.core.view.accessibility.a aVar2 = new androidx.core.view.accessibility.a(null, iA, string, aVar, null);
                androidx.core.view.b bVarE = androidx.core.view.u0.e(view);
                if (bVarE == null) {
                    bVarE = new androidx.core.view.b();
                }
                androidx.core.view.u0.p(view, bVarE);
                androidx.core.view.u0.m(aVar2.a(), view);
                androidx.core.view.u0.h(view).add(aVar2);
                androidx.core.view.u0.j(0, view);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I && this.N != 5) {
            androidx.core.view.u0.n(view, androidx.core.view.accessibility.a.f1622m, null, new rg.a(this, 5));
        }
        int i15 = this.N;
        if (i15 == 3) {
            androidx.core.view.u0.n(view, androidx.core.view.accessibility.a.f1621l, null, new rg.a(this, this.f6272b ? 4 : 6));
            return;
        }
        if (i15 == 4) {
            androidx.core.view.u0.n(view, androidx.core.view.accessibility.a.k, null, new rg.a(this, this.f6272b ? 3 : 6));
        } else {
            if (i15 != 6) {
                return;
            }
            androidx.core.view.u0.n(view, androidx.core.view.accessibility.a.f1621l, null, new rg.a(this, 4));
            androidx.core.view.u0.n(view, androidx.core.view.accessibility.a.k, null, new rg.a(this, 3));
        }
    }

    public final void L(int i7, boolean z5) {
        i iVar;
        if (i7 == 2) {
            return;
        }
        boolean z6 = this.N == 3 && (this.f6297x || B());
        if (this.f6299z == z6 || (iVar = this.f6284i) == null) {
            return;
        }
        this.f6299z = z6;
        ValueAnimator valueAnimator = this.B;
        if (!z5 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            iVar.r(this.f6299z ? u() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(iVar.f14483e.j, z6 ? u() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void M(boolean z5) {
        WeakReference weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z5) {
                if (this.f6277d0 != null) {
                    return;
                } else {
                    this.f6277d0 = new HashMap(childCount);
                }
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if (childAt != this.W.get() && z5) {
                    this.f6277d0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z5) {
                return;
            }
            this.f6277d0 = null;
        }
    }

    public final void N() {
        View view;
        if (this.W != null) {
            t();
            if (this.N != 4 || (view = (View) this.W.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // v0.b
    public final void c(v0.d dVar) {
        this.W = null;
        this.O = null;
    }

    @Override // v0.b
    public final void f() {
        this.W = null;
        this.O = null;
    }

    @Override // v0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i7;
        ViewDragHelper viewDragHelper;
        if (!view.isShown() || !this.K) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.a0 = -1;
            this.f6273b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x5 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            this.f6273b0 = y5;
            if (this.N != 2) {
                WeakReference weakReference = this.X;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.i(view2, x5, y5)) {
                    this.a0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f6275c0 = true;
                }
            }
            this.P = this.a0 == -1 && !coordinatorLayout.i(view, x5, this.f6273b0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f6275c0 = false;
            this.a0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (this.P || (viewDragHelper = this.O) == null || !viewDragHelper.r(motionEvent)) {
            WeakReference weakReference2 = this.X;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.i(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i7 = this.f6273b0) == -1 || Math.abs(i7 - motionEvent.getY()) <= this.O.f1793b) {
                return false;
            }
        }
        return true;
    }

    @Override // v0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i7) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i10 = 0;
        if (this.W == null) {
            this.f6282g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z5 = (Build.VERSION.SDK_INT < 29 || this.f6287n || this.f6280f) ? false : true;
            if (this.f6288o || this.f6289p || this.f6290q || this.f6292s || this.f6293t || this.f6294u || z5) {
                p.d(view, new i0(this, z5, 11));
            }
            androidx.core.view.u0.r(view, new rg.d(view));
            this.W = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            io.sentry.config.a.S(context, R.attr.motionDurationMedium2, ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS);
            io.sentry.config.a.S(context, R.attr.motionDurationShort3, 150);
            io.sentry.config.a.S(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            i iVar = this.f6284i;
            if (iVar != null) {
                view.setBackground(iVar);
                float elevation = this.H;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                iVar.p(elevation);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    l0.i(view, colorStateList);
                }
            }
            K();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.f6281f0);
        }
        int top = view.getTop();
        coordinatorLayout.k(i7, view);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int iMin = this.V;
        int i11 = iMin - height;
        int i12 = this.f6296w;
        if (i11 < i12) {
            if (this.f6291r) {
                int i13 = this.f6285l;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.T = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f6285l;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.T = iMin2;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        t();
        int i15 = this.N;
        if (i15 == 3) {
            int iZ = z();
            WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
            view.offsetTopAndBottom(iZ);
        } else if (i15 == 6) {
            int i16 = this.E;
            WeakHashMap weakHashMap2 = androidx.core.view.u0.f1729a;
            view.offsetTopAndBottom(i16);
        } else if (this.I && i15 == 5) {
            int i17 = this.V;
            WeakHashMap weakHashMap3 = androidx.core.view.u0.f1729a;
            view.offsetTopAndBottom(i17);
        } else if (i15 == 4) {
            int i18 = this.G;
            WeakHashMap weakHashMap4 = androidx.core.view.u0.f1729a;
            view.offsetTopAndBottom(i18);
        } else if (i15 == 1 || i15 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap5 = androidx.core.view.u0.f1729a;
            view.offsetTopAndBottom(top2);
        }
        L(this.N, false);
        this.X = new WeakReference(x(view));
        while (true) {
            ArrayList arrayList = this.Y;
            if (i10 >= arrayList.size()) {
                return true;
            }
            ((rg.b) arrayList.get(i10)).getClass();
            i10++;
        }
    }

    @Override // v0.b
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i7, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(y(i7, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, this.k, marginLayoutParams.width), y(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f6285l, marginLayoutParams.height));
        return true;
    }

    @Override // v0.b
    public final boolean j(View view) {
        WeakReference weakReference = this.X;
        return (weakReference == null || view != weakReference.get() || this.N == 3 || this.M) ? false : true;
    }

    @Override // v0.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i10, int[] iArr, int i11) {
        if (i11 == 1) {
            return;
        }
        WeakReference weakReference = this.X;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i12 = top - i10;
        boolean z5 = this.L;
        if (i10 > 0) {
            if (!this.R && !z5 && view2 == view3 && view2.canScrollVertically(1)) {
                this.M = true;
                return;
            }
            if (i12 < z()) {
                int iZ = top - z();
                iArr[1] = iZ;
                WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
                view.offsetTopAndBottom(-iZ);
                H(3);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i10;
                WeakHashMap weakHashMap2 = androidx.core.view.u0.f1729a;
                view.offsetTopAndBottom(-i10);
                H(1);
            }
        } else if (i10 < 0) {
            boolean zCanScrollVertically = view2.canScrollVertically(-1);
            if (!this.R && !z5 && view2 == view3 && zCanScrollVertically) {
                this.M = true;
                return;
            }
            if (!zCanScrollVertically) {
                int i13 = this.G;
                if (i12 > i13 && !this.I) {
                    int i14 = top - i13;
                    iArr[1] = i14;
                    WeakHashMap weakHashMap3 = androidx.core.view.u0.f1729a;
                    view.offsetTopAndBottom(-i14);
                    H(4);
                } else {
                    if (!this.K) {
                        return;
                    }
                    iArr[1] = i10;
                    WeakHashMap weakHashMap4 = androidx.core.view.u0.f1729a;
                    view.offsetTopAndBottom(-i10);
                    H(1);
                }
            }
        }
        w(view.getTop());
        this.Q = i10;
        this.R = true;
        this.M = false;
    }

    @Override // v0.b
    public final void n(View view, Parcelable parcelable) {
        c cVar = (c) parcelable;
        int i7 = this.f6271a;
        if (i7 != 0) {
            if (i7 == -1 || (i7 & 1) == 1) {
                this.f6278e = cVar.f19419v;
            }
            if (i7 == -1 || (i7 & 2) == 2) {
                this.f6272b = cVar.f19420w;
            }
            if (i7 == -1 || (i7 & 4) == 4) {
                this.I = cVar.f19421x;
            }
            if (i7 == -1 || (i7 & 8) == 8) {
                this.J = cVar.f19422y;
            }
        }
        int i10 = cVar.f19418i;
        if (i10 == 1 || i10 == 2) {
            this.N = 4;
        } else {
            this.N = i10;
        }
    }

    @Override // v0.b
    public final Parcelable o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new c(this);
    }

    @Override // v0.b
    public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i10) {
        this.Q = 0;
        this.R = false;
        return (i7 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // v0.b
    public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i7) {
        int top;
        int top2;
        int i10;
        float yVelocity;
        int i11 = 3;
        if (view.getTop() == z()) {
            H(3);
            return;
        }
        WeakReference weakReference = this.X;
        if (weakReference != null && view2 == weakReference.get() && this.R) {
            if (this.Q > 0) {
                if (!this.f6272b && view.getTop() > this.E) {
                    i11 = 6;
                }
            } else if (this.I) {
                VelocityTracker velocityTracker = this.Z;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f6274c);
                    yVelocity = this.Z.getYVelocity(this.a0);
                }
                if (I(view, yVelocity)) {
                    i11 = 5;
                } else if (this.Q == 0) {
                    top2 = view.getTop();
                    if (this.f6272b) {
                        i10 = this.E;
                        if (top2 < i10) {
                            if (top2 >= Math.abs(top2 - this.G)) {
                            }
                        } else if (Math.abs(top2 - i10) < Math.abs(top2 - this.G)) {
                            i11 = 4;
                        }
                        i11 = 6;
                    } else if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                        i11 = 4;
                    }
                } else {
                    if (!this.f6272b) {
                        top = view.getTop();
                        if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                            i11 = 6;
                        }
                    }
                    i11 = 4;
                }
            } else if (this.Q == 0) {
                top2 = view.getTop();
                if (this.f6272b) {
                    i10 = this.E;
                    if (top2 < i10) {
                        if (top2 >= Math.abs(top2 - this.G)) {
                        }
                    } else if (Math.abs(top2 - i10) < Math.abs(top2 - this.G)) {
                        i11 = 4;
                    }
                    i11 = 6;
                } else if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                    i11 = 4;
                }
            } else {
                if (!this.f6272b) {
                    top = view.getTop();
                    if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                        i11 = 6;
                    }
                }
                i11 = 4;
            }
            J(view, i11, false);
            this.R = false;
        }
    }

    @Override // v0.b
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i7 = this.N;
        if (i7 == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.O;
        if (viewDragHelper != null && (this.K || i7 == 1)) {
            viewDragHelper.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.a0 = -1;
            this.f6273b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (this.O != null && ((this.K || this.N == 1) && actionMasked == 2 && !this.P)) {
            float fAbs = Math.abs(this.f6273b0 - motionEvent.getY());
            ViewDragHelper viewDragHelper2 = this.O;
            if (fAbs > viewDragHelper2.f1793b) {
                viewDragHelper2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.P;
    }

    public final void s(rg.b bVar) {
        ArrayList arrayList = this.Y;
        if (arrayList.contains(bVar)) {
            return;
        }
        arrayList.add(bVar);
    }

    public final void t() {
        int iV = v();
        if (this.f6272b) {
            this.G = Math.max(this.V - iV, this.D);
        } else {
            this.G = this.V - iV;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    public final float u() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f2;
        float f7 = 0.0f;
        if (this.f6284i != null && (weakReference = this.W) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.W.get();
            if (B() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float fK = this.f6284i.k();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fK <= 0.0f) {
                        f2 = 0.0f;
                    } else {
                        f2 = radius / fK;
                    }
                } else {
                    f2 = 0.0f;
                }
                i iVar = this.f6284i;
                float[] fArr = iVar.Z;
                float fA = fArr != null ? fArr[0] : iVar.f14483e.f14463a.f14505f.a(iVar.h());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA > 0.0f) {
                        f7 = radius2 / fA;
                    }
                }
                return Math.max(f2, f7);
            }
        }
        return 0.0f;
    }

    public final int v() {
        int i7;
        if (this.f6280f) {
            return Math.min(Math.max(this.f6282g, this.V - ((this.U * 9) / 16)), this.T) + this.f6295v;
        }
        return (this.f6287n || this.f6288o || (i7 = this.f6286m) <= 0) ? this.f6278e + this.f6295v : Math.max(this.f6278e, i7 + this.f6283h);
    }

    public final void w(int i7) {
        float f2;
        float fZ;
        View view = (View) this.W.get();
        if (view != null) {
            ArrayList arrayList = this.Y;
            if (arrayList.isEmpty()) {
                return;
            }
            int i10 = this.G;
            if (i7 > i10 || i10 == z()) {
                int i11 = this.G;
                f2 = i11 - i7;
                fZ = this.V - i11;
            } else {
                int i12 = this.G;
                f2 = i12 - i7;
                fZ = i12 - z();
            }
            float f7 = f2 / fZ;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((rg.b) arrayList.get(i13)).a(view, f7);
            }
        }
    }

    public final int z() {
        if (this.f6272b) {
            return this.D;
        }
        return Math.max(this.C, this.f6291r ? 0 : this.f6296w);
    }

    public BottomSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        int i7;
        this.f6271a = 0;
        this.f6272b = true;
        this.k = -1;
        this.f6285l = -1;
        this.A = new d(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f6273b0 = -1;
        this.f6279e0 = new SparseIntArray();
        this.f6281f0 = new lh.b(this, 1);
        this.f6283h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kg.a.f14435f);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.j = com.facebook.imagepipeline.nativecode.c.t(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.f6298y = m.c(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        m mVar = this.f6298y;
        if (mVar != null) {
            i iVar = new i(mVar);
            this.f6284i = iVar;
            iVar.m(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.f6284i.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f6284i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(u(), 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new bh.m(2, this));
        this.H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f6285l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue != null && (i7 = typedValuePeekValue.data) == -1) {
            F(i7);
        } else {
            F(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        if (this.I != z5) {
            this.I = z5;
            if (!z5 && this.N == 5) {
                G(4);
            }
            K();
        }
        this.f6287n = typedArrayObtainStyledAttributes.getBoolean(14, false);
        D(typedArrayObtainStyledAttributes.getBoolean(7, true));
        this.J = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.L = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f6271a = typedArrayObtainStyledAttributes.getInt(11, 0);
        E(typedArrayObtainStyledAttributes.getFloat(8, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            C(typedValuePeekValue2.data);
        } else {
            C(typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0));
        }
        this.f6276d = typedArrayObtainStyledAttributes.getInt(12, 500);
        this.f6288o = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.f6289p = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.f6290q = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.f6291r = typedArrayObtainStyledAttributes.getBoolean(21, true);
        this.f6292s = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.f6293t = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.f6294u = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.f6297x = typedArrayObtainStyledAttributes.getBoolean(24, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f6274c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // v0.b
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i7, int i10, int i11, int[] iArr) {
    }
}
