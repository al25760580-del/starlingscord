package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.WindowInsetsCompat;
import com.discord.R;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements i1, androidx.core.view.r, androidx.core.view.s {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int[] f810c0 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final WindowInsetsCompat f811d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Rect f812e0;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final Rect J;
    public final Rect K;
    public final Rect L;
    public final Rect M;
    public WindowInsetsCompat N;
    public WindowInsetsCompat O;
    public WindowInsetsCompat P;
    public WindowInsetsCompat Q;
    public e R;
    public OverScroller S;
    public ViewPropertyAnimator T;
    public final c U;
    public final d V;
    public final d W;
    public final NestedScrollingParentHelper a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final g f813b0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f815e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ContentFrameLayout f816i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ActionBarContainer f817v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j1 f818w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f819x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f820y;

    static {
        androidx.core.view.x1 t1Var;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            t1Var = new androidx.core.view.w1();
        } else if (i7 >= 31) {
            t1Var = new androidx.core.view.v1();
        } else if (i7 >= 30) {
            t1Var = new androidx.core.view.u1();
        } else {
            t1Var = i7 >= 29 ? new androidx.core.view.t1() : new androidx.core.view.r1();
        }
        t1Var.g(Insets.b(0, 1, 0, 1));
        f811d0 = t1Var.b();
        f812e0 = new Rect();
    }

    public ActionBarOverlayLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f815e = 0;
        this.J = new Rect();
        this.K = new Rect();
        this.L = new Rect();
        this.M = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.f1604b;
        this.N = windowInsetsCompat;
        this.O = windowInsetsCompat;
        this.P = windowInsetsCompat;
        this.Q = windowInsetsCompat;
        this.U = new c(0, this);
        this.V = new d(this, 0);
        this.W = new d(this, 1);
        c(context);
        this.a0 = new NestedScrollingParentHelper();
        g gVar = new g(context);
        gVar.setWillNotDraw(true);
        this.f813b0 = gVar;
        addView(gVar);
    }

    public static boolean a(View view, Rect rect, boolean z5) {
        boolean z6;
        f fVar = (f) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
        int i10 = rect.left;
        if (i7 != i10) {
            ((ViewGroup.MarginLayoutParams) fVar).leftMargin = i10;
            z6 = true;
        } else {
            z6 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) fVar).topMargin = i12;
            z6 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) fVar).rightMargin = i14;
            z6 = true;
        }
        if (z5) {
            int i15 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = i16;
                return true;
            }
        }
        return z6;
    }

    public final void b() {
        removeCallbacks(this.V);
        removeCallbacks(this.W);
        ViewPropertyAnimator viewPropertyAnimator = this.T;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f810c0);
        this.f814d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f819x = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.S = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f;
    }

    public final void d(int i7) {
        e();
        if (i7 == 2) {
            ((x3) this.f818w).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i7 == 5) {
            ((x3) this.f818w).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i7 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f819x != null) {
            if (this.f817v.getVisibility() == 0) {
                translationY = (int) (this.f817v.getTranslationY() + this.f817v.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f819x.setBounds(0, translationY, getWidth(), this.f819x.getIntrinsicHeight() + translationY);
            this.f819x.draw(canvas);
        }
    }

    public final void e() {
        j1 wrapper;
        if (this.f816i == null) {
            this.f816i = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f817v = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof j1) {
                wrapper = (j1) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f818w = wrapper;
        }
    }

    public final void f(Menu menu, n.u uVar) {
        e();
        x3 x3Var = (x3) this.f818w;
        Toolbar toolbar = x3Var.f1164a;
        if (x3Var.f1174m == null) {
            n nVar = new n(toolbar.getContext());
            x3Var.f1174m = nVar;
            nVar.F = R.id.action_menu_presenter;
        }
        n nVar2 = x3Var.f1174m;
        nVar2.f1040w = uVar;
        n.j jVar = (n.j) menu;
        if (jVar == null && toolbar.f865d == null) {
            return;
        }
        toolbar.f();
        n.j jVar2 = toolbar.f865d.M;
        if (jVar2 == jVar) {
            return;
        }
        if (jVar2 != null) {
            jVar2.r(toolbar.f875l0);
            jVar2.r(toolbar.f876m0);
        }
        if (toolbar.f876m0 == null) {
            toolbar.f876m0 = new r3(toolbar);
        }
        nVar2.O = true;
        if (jVar != null) {
            jVar.b(nVar2, toolbar.G);
            jVar.b(toolbar.f876m0, toolbar.G);
        } else {
            nVar2.c(toolbar.G, null);
            toolbar.f876m0.c(toolbar.G, null);
            nVar2.a(true);
            toolbar.f876m0.a(true);
        }
        toolbar.f865d.setPopupTheme(toolbar.H);
        toolbar.f865d.setPresenter(nVar2);
        toolbar.f875l0 = nVar2;
        toolbar.v();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f817v;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.a0;
        return nestedScrollingParentHelper.f1602b | nestedScrollingParentHelper.f1601a;
    }

    public CharSequence getTitle() {
        e();
        return ((x3) this.f818w).f1164a.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        e();
        WindowInsetsCompat windowInsetsCompatG = WindowInsetsCompat.g(this, windowInsets);
        boolean zA = a(this.f817v, new Rect(windowInsetsCompatG.b(), windowInsetsCompatG.d(), windowInsetsCompatG.c(), windowInsetsCompatG.a()), false);
        WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
        Rect rect = this.J;
        androidx.core.view.l0.b(this, windowInsetsCompatG, rect);
        int i7 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        androidx.core.view.f2 f2Var = windowInsetsCompatG.f1605a;
        WindowInsetsCompat windowInsetsCompatM = f2Var.m(i7, i10, i11, i12);
        this.N = windowInsetsCompatM;
        boolean z5 = true;
        if (!this.O.equals(windowInsetsCompatM)) {
            this.O = this.N;
            zA = true;
        }
        Rect rect2 = this.K;
        if (rect2.equals(rect)) {
            z5 = zA;
        } else {
            rect2.set(rect);
        }
        if (z5) {
            requestLayout();
        }
        return f2Var.a().f1605a.c().f1605a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
        androidx.core.view.j0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) fVar).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00df  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f3  */
    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int measuredHeight;
        WindowInsetsCompat windowInsetsCompat;
        int i11;
        androidx.core.view.x1 r1Var;
        e();
        measureChildWithMargins(this.f817v, i7, 0, i10, 0);
        f fVar = (f) this.f817v.getLayoutParams();
        int iMax = Math.max(0, this.f817v.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
        int iMax2 = Math.max(0, this.f817v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f817v.getMeasuredState());
        WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
        boolean z5 = (getWindowSystemUiVisibility() & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
        if (z5) {
            measuredHeight = this.f814d;
            if (this.E && this.f817v.getTabContainer() != null) {
                measuredHeight += this.f814d;
            }
        } else {
            measuredHeight = this.f817v.getVisibility() != 8 ? this.f817v.getMeasuredHeight() : 0;
        }
        Rect rect = this.J;
        Rect rect2 = this.L;
        rect2.set(rect);
        this.P = this.N;
        if (this.f820y || z5) {
            Insets insetsB = Insets.b(this.P.b(), this.P.d() + measuredHeight, this.P.c(), this.P.a());
            windowInsetsCompat = this.P;
            i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34) {
                r1Var = new androidx.core.view.w1(windowInsetsCompat);
            } else if (i11 >= 31) {
                r1Var = new androidx.core.view.v1(windowInsetsCompat);
            } else if (i11 >= 30) {
                r1Var = new androidx.core.view.u1(windowInsetsCompat);
            } else if (i11 >= 29) {
                r1Var = new androidx.core.view.t1(windowInsetsCompat);
            } else {
                r1Var = new androidx.core.view.r1(windowInsetsCompat);
            }
            r1Var.g(insetsB);
            this.P = r1Var.b();
        } else {
            g gVar = this.f813b0;
            WindowInsetsCompat windowInsetsCompat2 = f811d0;
            Rect rect3 = this.M;
            androidx.core.view.l0.b(gVar, windowInsetsCompat2, rect3);
            if (rect3.equals(f812e0)) {
                Insets insetsB2 = Insets.b(this.P.b(), this.P.d() + measuredHeight, this.P.c(), this.P.a());
                windowInsetsCompat = this.P;
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 34) {
                    r1Var = new androidx.core.view.w1(windowInsetsCompat);
                } else if (i11 >= 31) {
                    r1Var = new androidx.core.view.v1(windowInsetsCompat);
                } else if (i11 >= 30) {
                    r1Var = new androidx.core.view.u1(windowInsetsCompat);
                } else if (i11 >= 29) {
                    r1Var = new androidx.core.view.t1(windowInsetsCompat);
                } else {
                    r1Var = new androidx.core.view.r1(windowInsetsCompat);
                }
                r1Var.g(insetsB2);
                this.P = r1Var.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.P = this.P.f1605a.m(0, measuredHeight, 0, 0);
            }
        }
        a(this.f816i, rect2, true);
        if (!this.Q.equals(this.P)) {
            WindowInsetsCompat windowInsetsCompat3 = this.P;
            this.Q = windowInsetsCompat3;
            androidx.core.view.u0.c(this.f816i, windowInsetsCompat3);
        }
        measureChildWithMargins(this.f816i, i7, 0, i10, 0);
        f fVar2 = (f) this.f816i.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f816i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar2).leftMargin + ((ViewGroup.MarginLayoutParams) fVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f816i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar2).topMargin + ((ViewGroup.MarginLayoutParams) fVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f816i.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i7, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i10, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f7, boolean z5) {
        if (!this.F || !z5) {
            return false;
        }
        this.S.fling(0, 0, 0, (int) f7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.S.getFinalY() > this.f817v.getHeight()) {
            b();
            this.W.run();
        } else {
            b();
            this.V.run();
        }
        this.G = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f7) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
    }

    @Override // androidx.core.view.s
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        onNestedScroll(view, i7, i10, i11, i12, i13);
    }

    @Override // androidx.core.view.r
    public final void onNestedScrollAccepted(View view, View view2, int i7, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // androidx.core.view.r
    public final boolean onStartNestedScroll(View view, View view2, int i7, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i7);
    }

    @Override // androidx.core.view.r
    public final void onStopNestedScroll(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i7) {
        super.onWindowSystemUiVisibilityChanged(i7);
        e();
        int i10 = this.I ^ i7;
        this.I = i7;
        boolean z5 = (i7 & 4) == 0;
        boolean z6 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
        e eVar = this.R;
        if (eVar != null) {
            i.j0 j0Var = (i.j0) eVar;
            j0Var.f11239o = !z6;
            if (z5 || !z6) {
                if (j0Var.f11240p) {
                    j0Var.f11240p = false;
                    j0Var.w(true);
                }
            } else if (!j0Var.f11240p) {
                j0Var.f11240p = true;
                j0Var.w(true);
            }
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0 || this.R == null) {
            return;
        }
        WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
        androidx.core.view.j0.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        this.f815e = i7;
        e eVar = this.R;
        if (eVar != null) {
            ((i.j0) eVar).f11238n = i7;
        }
    }

    public void setActionBarHideOffset(int i7) {
        b();
        this.f817v.setTranslationY(-Math.max(0, Math.min(i7, this.f817v.getHeight())));
    }

    public void setActionBarVisibilityCallback(e eVar) {
        this.R = eVar;
        if (getWindowToken() != null) {
            ((i.j0) this.R).f11238n = this.f815e;
            int i7 = this.I;
            if (i7 != 0) {
                onWindowSystemUiVisibilityChanged(i7);
                WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
                androidx.core.view.j0.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z5) {
        this.E = z5;
    }

    public void setHideOnContentScrollEnabled(boolean z5) {
        if (z5 != this.F) {
            this.F = z5;
            if (z5) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i7) {
        e();
        x3 x3Var = (x3) this.f818w;
        x3Var.f1167d = i7 != 0 ? mf.f.u(x3Var.f1164a.getContext(), i7) : null;
        x3Var.c();
    }

    public void setLogo(int i7) {
        e();
        x3 x3Var = (x3) this.f818w;
        x3Var.f1168e = i7 != 0 ? mf.f.u(x3Var.f1164a.getContext(), i7) : null;
        x3Var.c();
    }

    public void setOverlayMode(boolean z5) {
        this.f820y = z5;
    }

    public void setShowingForActionMode(boolean z5) {
    }

    public void setUiOptions(int i7) {
    }

    @Override // androidx.appcompat.widget.i1
    public void setWindowCallback(Window.Callback callback) {
        e();
        ((x3) this.f818w).k = callback;
    }

    @Override // androidx.appcompat.widget.i1
    public void setWindowTitle(CharSequence charSequence) {
        e();
        x3 x3Var = (x3) this.f818w;
        if (x3Var.f1170g) {
            return;
        }
        Toolbar toolbar = x3Var.f1164a;
        x3Var.f1171h = charSequence;
        if ((x3Var.f1165b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (x3Var.f1170g) {
                androidx.core.view.u0.q(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.core.view.r
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr, int i11) {
    }

    @Override // androidx.core.view.r
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i7, i10, i11, i12);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        i.j0 j0Var;
        m.f fVar;
        this.a0.f1601a = i7;
        this.H = getActionBarHideOffset();
        b();
        e eVar = this.R;
        if (eVar == null || (fVar = (j0Var = (i.j0) eVar).f11243s) == null) {
            return;
        }
        fVar.a();
        j0Var.f11243s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        if ((i7 & 2) == 0 || this.f817v.getVisibility() != 0) {
            return false;
        }
        return this.F;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.F || this.G) {
            return;
        }
        if (this.H <= this.f817v.getHeight()) {
            b();
            postDelayed(this.V, 600L);
        } else {
            b();
            postDelayed(this.W, 600L);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new f(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        int i13 = this.H + i10;
        this.H = i13;
        setActionBarHideOffset(i13);
    }

    public void setIcon(Drawable drawable) {
        e();
        x3 x3Var = (x3) this.f818w;
        x3Var.f1167d = drawable;
        x3Var.c();
    }
}
