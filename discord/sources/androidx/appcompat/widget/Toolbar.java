package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import com.discord.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements androidx.core.view.k {
    public x E;
    public View F;
    public Context G;
    public int H;
    public int I;
    public int J;
    public final int K;
    public final int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public p2 Q;
    public int R;
    public int S;
    public final int T;
    public CharSequence U;
    public CharSequence V;
    public ColorStateList W;
    public ColorStateList a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f863b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f864c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionMenuView f865d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ArrayList f866d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppCompatTextView f867e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final ArrayList f868e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int[] f869f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final MenuHostHelper f870g0;
    public ArrayList h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AppCompatTextView f871i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public t3 f872i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final ga.l f873j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public x3 f874k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public n f875l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public r3 f876m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public a5.i0 f877n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public u4.c f878o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f879p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public OnBackInvokedCallback f880q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public OnBackInvokedDispatcher f881r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f882s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final a3.h f883t0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public x f884v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y f885w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Drawable f886x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CharSequence f887y;

    public Toolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i7 = 0; i7 < menu.size(); i7++) {
            arrayList.add(menu.getItem(i7));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new m.e(getContext());
    }

    public static s3 h() {
        return new s3(-2);
    }

    public static s3 i(ViewGroup.LayoutParams layoutParams) {
        boolean z5 = layoutParams instanceof s3;
        if (z5) {
            s3 s3Var = (s3) layoutParams;
            s3 s3Var2 = new s3(s3Var);
            s3Var2.f1106b = 0;
            s3Var2.f1106b = s3Var.f1106b;
            return s3Var2;
        }
        if (z5) {
            s3 s3Var3 = new s3((s3) layoutParams);
            s3Var3.f1106b = 0;
            return s3Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            s3 s3Var4 = new s3(layoutParams);
            s3Var4.f1106b = 0;
            return s3Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        s3 s3Var5 = new s3(marginLayoutParams);
        s3Var5.f1106b = 0;
        ((ViewGroup.MarginLayoutParams) s3Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) s3Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) s3Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) s3Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return s3Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i7, ArrayList arrayList) {
        boolean z5 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, getLayoutDirection());
        arrayList.clear();
        if (!z5) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                s3 s3Var = (s3) childAt.getLayoutParams();
                if (s3Var.f1106b == 0 && t(childAt)) {
                    int i11 = s3Var.f1105a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            s3 s3Var2 = (s3) childAt2.getLayoutParams();
            if (s3Var2.f1106b == 0 && t(childAt2)) {
                int i13 = s3Var2.f1105a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i13, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // androidx.core.view.k
    public final void addMenuProvider(MenuProvider menuProvider) {
        MenuHostHelper menuHostHelper = this.f870g0;
        menuHostHelper.f1594b.add(menuProvider);
        menuHostHelper.f1593a.run();
    }

    public final void b(View view, boolean z5) {
        s3 s3VarI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            s3VarI = h();
        } else {
            s3VarI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (s3) layoutParams;
        }
        s3VarI.f1106b = 1;
        if (!z5 || this.F == null) {
            addView(view, s3VarI);
        } else {
            view.setLayoutParams(s3VarI);
            this.f868e0.add(view);
        }
    }

    public final void c() {
        if (this.E == null) {
            x xVar = new x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.E = xVar;
            xVar.setImageDrawable(this.f886x);
            this.E.setContentDescription(this.f887y);
            s3 s3VarH = h();
            s3VarH.f1105a = (this.K & 112) | 8388611;
            s3VarH.f1106b = 2;
            this.E.setLayoutParams(s3VarH);
            this.E.setOnClickListener(new b(2, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof s3);
    }

    public final void d() {
        if (this.Q == null) {
            p2 p2Var = new p2();
            p2Var.f1072a = 0;
            p2Var.f1073b = 0;
            p2Var.f1074c = Integer.MIN_VALUE;
            p2Var.f1075d = Integer.MIN_VALUE;
            p2Var.f1076e = 0;
            p2Var.f1077f = 0;
            p2Var.f1078g = false;
            p2Var.f1079h = false;
            this.Q = p2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f865d;
        if (actionMenuView.M == null) {
            n.j jVar = (n.j) actionMenuView.getMenu();
            if (this.f876m0 == null) {
                this.f876m0 = new r3(this);
            }
            this.f865d.setExpandedActionViewsExclusive(true);
            jVar.b(this.f876m0, this.G);
            v();
        }
    }

    public final void f() {
        if (this.f865d == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f865d = actionMenuView;
            actionMenuView.setPopupTheme(this.H);
            this.f865d.setOnMenuItemClickListener(this.f873j0);
            ActionMenuView actionMenuView2 = this.f865d;
            a5.i0 i0Var = this.f877n0;
            u4.b bVar = new u4.b(2, this);
            actionMenuView2.R = i0Var;
            actionMenuView2.S = bVar;
            s3 s3VarH = h();
            s3VarH.f1105a = (this.K & 112) | 8388613;
            this.f865d.setLayoutParams(s3VarH);
            b(this.f865d, false);
        }
    }

    public final void g() {
        if (this.f884v == null) {
            this.f884v = new x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            s3 s3VarH = h();
            s3VarH.f1105a = (this.K & 112) | 8388611;
            this.f884v.setLayoutParams(s3VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        x xVar = this.E;
        if (xVar != null) {
            return xVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        x xVar = this.E;
        if (xVar != null) {
            return xVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        p2 p2Var = this.Q;
        if (p2Var != null) {
            return p2Var.f1078g ? p2Var.f1072a : p2Var.f1073b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i7 = this.S;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        p2 p2Var = this.Q;
        if (p2Var != null) {
            return p2Var.f1072a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        p2 p2Var = this.Q;
        if (p2Var != null) {
            return p2Var.f1073b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        p2 p2Var = this.Q;
        if (p2Var != null) {
            return p2Var.f1078g ? p2Var.f1073b : p2Var.f1072a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i7 = this.R;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        n.j jVar;
        ActionMenuView actionMenuView = this.f865d;
        return (actionMenuView == null || (jVar = actionMenuView.M) == null || !jVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.S, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.R, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        y yVar = this.f885w;
        if (yVar != null) {
            return yVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        y yVar = this.f885w;
        if (yVar != null) {
            return yVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f865d.getMenu();
    }

    public View getNavButtonView() {
        return this.f884v;
    }

    public CharSequence getNavigationContentDescription() {
        x xVar = this.f884v;
        if (xVar != null) {
            return xVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        x xVar = this.f884v;
        if (xVar != null) {
            return xVar.getDrawable();
        }
        return null;
    }

    public n getOuterActionMenuPresenter() {
        return this.f875l0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f865d.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.G;
    }

    public int getPopupTheme() {
        return this.H;
    }

    public CharSequence getSubtitle() {
        return this.V;
    }

    public final TextView getSubtitleTextView() {
        return this.f871i;
    }

    public CharSequence getTitle() {
        return this.U;
    }

    public int getTitleMarginBottom() {
        return this.P;
    }

    public int getTitleMarginEnd() {
        return this.N;
    }

    public int getTitleMarginStart() {
        return this.M;
    }

    public int getTitleMarginTop() {
        return this.O;
    }

    public final TextView getTitleTextView() {
        return this.f867e;
    }

    public j1 getWrapper() {
        if (this.f874k0 == null) {
            this.f874k0 = new x3(this, true);
        }
        return this.f874k0;
    }

    public final int j(int i7, View view) {
        s3 s3Var = (s3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i7 > 0 ? (measuredHeight - i7) / 2 : 0;
        int i11 = s3Var.f1105a & 112;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            i11 = this.T & 112;
        }
        if (i11 == 48) {
            return getPaddingTop() - i10;
        }
        if (i11 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) s3Var).bottomMargin) - i10;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) s3Var).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) s3Var).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.h0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = this.f870g0.f1594b.iterator();
        while (it2.hasNext()) {
            ((MenuProvider) it2.next()).c(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.h0 = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.f868e0.contains(view);
    }

    public final boolean o() {
        n nVar;
        ActionMenuView actionMenuView = this.f865d;
        return (actionMenuView == null || (nVar = actionMenuView.Q) == null || !nVar.m()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f883t0);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f864c0 = false;
        }
        if (!this.f864c0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f864c0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f864c0 = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027d  */
    /* JADX WARN: Code duplicated, block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x030d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x030f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0313  */
    /* JADX WARN: Code duplicated, block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x0193  */
    /* JADX WARN: Code duplicated, block: B:73:0x019d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0210  */
    /* JADX WARN: Code duplicated, block: B:88:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x021e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:95:0x0255  */
    /* JADX WARN: Code duplicated, block: B:97:0x0258  */
    /* JADX WARN: Code duplicated, block: B:98:0x027a  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        int iP;
        int iQ;
        int iMax;
        int iMin;
        boolean zT;
        boolean zT2;
        int measuredHeight;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        s3 s3Var;
        s3 s3Var2;
        int i13;
        boolean z6;
        int i14;
        int i15;
        int paddingTop;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iMax2;
        int i22;
        int i23;
        int i24;
        int i25;
        ArrayList arrayList;
        int size;
        int iP2;
        int i26;
        int size2;
        int i27;
        int i28;
        int size3;
        int i29;
        int i30;
        int measuredWidth;
        int i31;
        int i32;
        int i33;
        int size4;
        boolean z7 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i34 = width - paddingRight;
        int[] iArr = this.f869f0;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i12 - i10) : 0;
        if (t(this.f884v)) {
            if (z7) {
                iQ = q(this.f884v, i34, iMin2, iArr);
                iP = paddingLeft;
            } else {
                iP = p(this.f884v, paddingLeft, iMin2, iArr);
            }
            if (t(this.E)) {
                if (z7) {
                    iQ = q(this.E, iQ, iMin2, iArr);
                } else {
                    iP = p(this.E, iP, iMin2, iArr);
                }
            }
            if (t(this.f865d)) {
                if (z7) {
                    iP = p(this.f865d, iP, iMin2, iArr);
                } else {
                    iQ = q(this.f865d, iQ, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iP);
            iArr[1] = Math.max(0, currentContentInsetRight - (i34 - iQ));
            iMax = Math.max(iP, currentContentInsetLeft);
            iMin = Math.min(iQ, i34 - currentContentInsetRight);
            if (t(this.F)) {
                if (z7) {
                    iMin = q(this.F, iMin, iMin2, iArr);
                } else {
                    iMax = p(this.F, iMax, iMin2, iArr);
                }
            }
            if (t(this.f885w)) {
                if (z7) {
                    iMin = q(this.f885w, iMin, iMin2, iArr);
                } else {
                    iMax = p(this.f885w, iMax, iMin2, iArr);
                }
            }
            zT = t(this.f867e);
            zT2 = t(this.f871i);
            if (zT) {
                s3 s3Var3 = (s3) this.f867e.getLayoutParams();
                measuredHeight = this.f867e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) s3Var3).topMargin + ((ViewGroup.MarginLayoutParams) s3Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zT2) {
                s3 s3Var4 = (s3) this.f871i.getLayoutParams();
                measuredHeight = this.f871i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) s3Var4).topMargin + ((ViewGroup.MarginLayoutParams) s3Var4).bottomMargin + measuredHeight;
            }
            if (zT || zT2) {
                if (zT) {
                    appCompatTextView = this.f867e;
                } else {
                    appCompatTextView = this.f871i;
                }
                if (zT2) {
                    appCompatTextView2 = this.f871i;
                } else {
                    appCompatTextView2 = this.f867e;
                }
                s3Var = (s3) appCompatTextView.getLayoutParams();
                s3Var2 = (s3) appCompatTextView2.getLayoutParams();
                i13 = measuredHeight;
                z6 = (!zT && this.f867e.getMeasuredWidth() > 0) || (zT2 && this.f871i.getMeasuredWidth() > 0);
                i14 = this.T & 112;
                i15 = iMax;
                if (i14 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) s3Var).topMargin + this.O;
                } else if (i14 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i13) / 2;
                    i22 = ((ViewGroup.MarginLayoutParams) s3Var).topMargin + this.O;
                    if (iMax2 < i22) {
                        iMax2 = i22;
                    } else {
                        i23 = (((height - paddingBottom) - i13) - iMax2) - paddingTop2;
                        i24 = ((ViewGroup.MarginLayoutParams) s3Var).bottomMargin;
                        i25 = this.P;
                        if (i23 < i24 + i25) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) s3Var2).bottomMargin + i25) - i23));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) s3Var2).bottomMargin) - this.P) - i13;
                }
                if (z7) {
                    if (z6) {
                        i19 = this.M;
                    } else {
                        i19 = 0;
                    }
                    int i35 = i19 - iArr[1];
                    iMin -= Math.max(0, i35);
                    iArr[1] = Math.max(0, -i35);
                    if (zT) {
                        s3 s3Var5 = (s3) this.f867e.getLayoutParams();
                        int measuredWidth2 = iMin - this.f867e.getMeasuredWidth();
                        int measuredHeight2 = this.f867e.getMeasuredHeight() + paddingTop;
                        this.f867e.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i20 = measuredWidth2 - this.N;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) s3Var5).bottomMargin;
                    } else {
                        i20 = iMin;
                    }
                    if (zT2) {
                        int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((s3) this.f871i.getLayoutParams())).topMargin;
                        this.f871i.layout(iMin - this.f871i.getMeasuredWidth(), i36, iMin, this.f871i.getMeasuredHeight() + i36);
                        i21 = iMin - this.N;
                    } else {
                        i21 = iMin;
                    }
                    if (z6) {
                        iMin = Math.min(i20, i21);
                    }
                    iMax = i15;
                } else {
                    if (z6) {
                        i16 = this.M;
                    } else {
                        i16 = 0;
                    }
                    int i37 = i16 - iArr[0];
                    iMax = Math.max(0, i37) + i15;
                    iArr[0] = Math.max(0, -i37);
                    if (zT) {
                        s3 s3Var6 = (s3) this.f867e.getLayoutParams();
                        int measuredWidth3 = this.f867e.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f867e.getMeasuredHeight() + paddingTop;
                        this.f867e.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i17 = measuredWidth3 + this.N;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) s3Var6).bottomMargin;
                    } else {
                        i17 = iMax;
                    }
                    if (zT2) {
                        int i38 = paddingTop + ((ViewGroup.MarginLayoutParams) ((s3) this.f871i.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f871i.getMeasuredWidth() + iMax;
                        this.f871i.layout(iMax, i38, measuredWidth4, this.f871i.getMeasuredHeight() + i38);
                        i18 = measuredWidth4 + this.N;
                    } else {
                        i18 = iMax;
                    }
                    if (z6) {
                        iMax = Math.max(i17, i18);
                    }
                }
            }
            arrayList = this.f866d0;
            a(3, arrayList);
            size = arrayList.size();
            iP2 = iMax;
            for (i26 = 0; i26 < size; i26++) {
                iP2 = p((View) arrayList.get(i26), iP2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i27 = 0; i27 < size2; i27++) {
                iMin = q((View) arrayList.get(i27), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i39 = iArr[0];
            i28 = iArr[1];
            size3 = arrayList.size();
            i29 = i39;
            i30 = 0;
            measuredWidth = 0;
            while (i30 < size3) {
                View view = (View) arrayList.get(i30);
                s3 s3Var7 = (s3) view.getLayoutParams();
                int i40 = i28;
                int i41 = ((ViewGroup.MarginLayoutParams) s3Var7).leftMargin - i29;
                int i42 = ((ViewGroup.MarginLayoutParams) s3Var7).rightMargin - i40;
                int iMax3 = Math.max(0, i41);
                int iMax4 = Math.max(0, i42);
                int iMax5 = Math.max(0, -i41);
                int iMax6 = Math.max(0, -i42);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i30++;
                i29 = iMax5;
                i28 = iMax6;
            }
            i32 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i33 = measuredWidth + i32;
            if (i32 >= iP2) {
                if (i33 > iMin) {
                    iP2 = i32 - (i33 - iMin);
                } else {
                    iP2 = i32;
                }
            }
            size4 = arrayList.size();
            for (i31 = 0; i31 < size4; i31++) {
                iP2 = p((View) arrayList.get(i31), iP2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iP = paddingLeft;
        iQ = i34;
        if (t(this.E)) {
            if (z7) {
                iQ = q(this.E, iQ, iMin2, iArr);
            } else {
                iP = p(this.E, iP, iMin2, iArr);
            }
        }
        if (t(this.f865d)) {
            if (z7) {
                iP = p(this.f865d, iP, iMin2, iArr);
            } else {
                iQ = q(this.f865d, iQ, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iP);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i34 - iQ));
        iMax = Math.max(iP, currentContentInsetLeft2);
        iMin = Math.min(iQ, i34 - currentContentInsetRight2);
        if (t(this.F)) {
            if (z7) {
                iMin = q(this.F, iMin, iMin2, iArr);
            } else {
                iMax = p(this.F, iMax, iMin2, iArr);
            }
        }
        if (t(this.f885w)) {
            if (z7) {
                iMin = q(this.f885w, iMin, iMin2, iArr);
            } else {
                iMax = p(this.f885w, iMax, iMin2, iArr);
            }
        }
        zT = t(this.f867e);
        zT2 = t(this.f871i);
        if (zT) {
            s3 s3Var8 = (s3) this.f867e.getLayoutParams();
            measuredHeight = this.f867e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) s3Var8).topMargin + ((ViewGroup.MarginLayoutParams) s3Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zT2) {
            s3 s3Var9 = (s3) this.f871i.getLayoutParams();
            measuredHeight = this.f871i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) s3Var9).topMargin + ((ViewGroup.MarginLayoutParams) s3Var9).bottomMargin + measuredHeight;
        }
        if (zT) {
            if (zT) {
                appCompatTextView = this.f867e;
            } else {
                appCompatTextView = this.f871i;
            }
            if (zT2) {
                appCompatTextView2 = this.f871i;
            } else {
                appCompatTextView2 = this.f867e;
            }
            s3Var = (s3) appCompatTextView.getLayoutParams();
            s3Var2 = (s3) appCompatTextView2.getLayoutParams();
            i13 = measuredHeight;
            if (zT) {
            }
            i14 = this.T & 112;
            i15 = iMax;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) s3Var).topMargin + this.O;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i13) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) s3Var).topMargin + this.O;
                if (iMax2 < i22) {
                    iMax2 = i22;
                } else {
                    i23 = (((height - paddingBottom) - i13) - iMax2) - paddingTop2;
                    i24 = ((ViewGroup.MarginLayoutParams) s3Var).bottomMargin;
                    i25 = this.P;
                    if (i23 < i24 + i25) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) s3Var2).bottomMargin + i25) - i23));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) s3Var2).bottomMargin) - this.P) - i13;
            }
            if (z7) {
                if (z6) {
                    i19 = this.M;
                } else {
                    i19 = 0;
                }
                int i310 = i19 - iArr[1];
                iMin -= Math.max(0, i310);
                iArr[1] = Math.max(0, -i310);
                if (zT) {
                    s3 s3Var10 = (s3) this.f867e.getLayoutParams();
                    int measuredWidth5 = iMin - this.f867e.getMeasuredWidth();
                    int measuredHeight4 = this.f867e.getMeasuredHeight() + paddingTop;
                    this.f867e.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i20 = measuredWidth5 - this.N;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) s3Var10).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zT2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((s3) this.f871i.getLayoutParams())).topMargin;
                    this.f871i.layout(iMin - this.f871i.getMeasuredWidth(), i311, iMin, this.f871i.getMeasuredHeight() + i311);
                    i21 = iMin - this.N;
                } else {
                    i21 = iMin;
                }
                if (z6) {
                    iMin = Math.min(i20, i21);
                }
                iMax = i15;
            } else {
                if (z6) {
                    i16 = this.M;
                } else {
                    i16 = 0;
                }
                int i312 = i16 - iArr[0];
                iMax = Math.max(0, i312) + i15;
                iArr[0] = Math.max(0, -i312);
                if (zT) {
                    s3 s3Var11 = (s3) this.f867e.getLayoutParams();
                    int measuredWidth6 = this.f867e.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f867e.getMeasuredHeight() + paddingTop;
                    this.f867e.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i17 = measuredWidth6 + this.N;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) s3Var11).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zT2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((s3) this.f871i.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f871i.getMeasuredWidth() + iMax;
                    this.f871i.layout(iMax, i313, measuredWidth7, this.f871i.getMeasuredHeight() + i313);
                    i18 = measuredWidth7 + this.N;
                } else {
                    i18 = iMax;
                }
                if (z6) {
                    iMax = Math.max(i17, i18);
                }
            }
        } else {
            if (zT) {
                appCompatTextView = this.f867e;
            } else {
                appCompatTextView = this.f871i;
            }
            if (zT2) {
                appCompatTextView2 = this.f871i;
            } else {
                appCompatTextView2 = this.f867e;
            }
            s3Var = (s3) appCompatTextView.getLayoutParams();
            s3Var2 = (s3) appCompatTextView2.getLayoutParams();
            i13 = measuredHeight;
            if (zT) {
            }
            i14 = this.T & 112;
            i15 = iMax;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) s3Var).topMargin + this.O;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i13) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) s3Var).topMargin + this.O;
                if (iMax2 < i22) {
                    iMax2 = i22;
                } else {
                    i23 = (((height - paddingBottom) - i13) - iMax2) - paddingTop2;
                    i24 = ((ViewGroup.MarginLayoutParams) s3Var).bottomMargin;
                    i25 = this.P;
                    if (i23 < i24 + i25) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) s3Var2).bottomMargin + i25) - i23));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) s3Var2).bottomMargin) - this.P) - i13;
            }
            if (z7) {
                if (z6) {
                    i19 = this.M;
                } else {
                    i19 = 0;
                }
                int i314 = i19 - iArr[1];
                iMin -= Math.max(0, i314);
                iArr[1] = Math.max(0, -i314);
                if (zT) {
                    s3 s3Var12 = (s3) this.f867e.getLayoutParams();
                    int measuredWidth8 = iMin - this.f867e.getMeasuredWidth();
                    int measuredHeight6 = this.f867e.getMeasuredHeight() + paddingTop;
                    this.f867e.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i20 = measuredWidth8 - this.N;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) s3Var12).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zT2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((s3) this.f871i.getLayoutParams())).topMargin;
                    this.f871i.layout(iMin - this.f871i.getMeasuredWidth(), i315, iMin, this.f871i.getMeasuredHeight() + i315);
                    i21 = iMin - this.N;
                } else {
                    i21 = iMin;
                }
                if (z6) {
                    iMin = Math.min(i20, i21);
                }
                iMax = i15;
            } else {
                if (z6) {
                    i16 = this.M;
                } else {
                    i16 = 0;
                }
                int i316 = i16 - iArr[0];
                iMax = Math.max(0, i316) + i15;
                iArr[0] = Math.max(0, -i316);
                if (zT) {
                    s3 s3Var13 = (s3) this.f867e.getLayoutParams();
                    int measuredWidth9 = this.f867e.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f867e.getMeasuredHeight() + paddingTop;
                    this.f867e.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i17 = measuredWidth9 + this.N;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) s3Var13).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zT2) {
                    int i317 = paddingTop + ((ViewGroup.MarginLayoutParams) ((s3) this.f871i.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f871i.getMeasuredWidth() + iMax;
                    this.f871i.layout(iMax, i317, measuredWidth10, this.f871i.getMeasuredHeight() + i317);
                    i18 = measuredWidth10 + this.N;
                } else {
                    i18 = iMax;
                }
                if (z6) {
                    iMax = Math.max(i17, i18);
                }
            }
        }
        arrayList = this.f866d0;
        a(3, arrayList);
        size = arrayList.size();
        iP2 = iMax;
        while (i26 < size) {
            iP2 = p((View) arrayList.get(i26), iP2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i27 < size2) {
            iMin = q((View) arrayList.get(i27), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i318 = iArr[0];
        i28 = iArr[1];
        size3 = arrayList.size();
        i29 = i318;
        i30 = 0;
        measuredWidth = 0;
        while (i30 < size3) {
            View view2 = (View) arrayList.get(i30);
            s3 s3Var14 = (s3) view2.getLayoutParams();
            int i43 = i28;
            int i44 = ((ViewGroup.MarginLayoutParams) s3Var14).leftMargin - i29;
            int i45 = ((ViewGroup.MarginLayoutParams) s3Var14).rightMargin - i43;
            int iMax7 = Math.max(0, i44);
            int iMax8 = Math.max(0, i45);
            int iMax9 = Math.max(0, -i44);
            int iMax10 = Math.max(0, -i45);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i30++;
            i29 = iMax9;
            i28 = iMax10;
        }
        i32 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i33 = measuredWidth + i32;
        if (i32 >= iP2) {
            if (i33 > iMin) {
                iP2 = i32 - (i33 - iMin);
            } else {
                iP2 = i32;
            }
        }
        size4 = arrayList.size();
        while (i31 < size4) {
            iP2 = p((View) arrayList.get(i31), iP2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        char c8;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z5 = f4.f976a;
        int i11 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c8 = 0;
        } else {
            c8 = 1;
            objArr = false;
        }
        if (t(this.f884v)) {
            s(this.f884v, i7, 0, i10, this.L);
            iK = k(this.f884v) + this.f884v.getMeasuredWidth();
            iMax = Math.max(0, l(this.f884v) + this.f884v.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f884v.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.E)) {
            s(this.E, i7, 0, i10, this.L);
            iK = k(this.E) + this.E.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.E) + this.E.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.E.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.f869f0;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (t(this.f865d)) {
            s(this.f865d, i7, iMax3, i10, this.L);
            iK2 = k(this.f865d) + this.f865d.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f865d) + this.f865d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f865d.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c8] = Math.max(0, currentContentInsetEnd - iK2);
        if (t(this.F)) {
            iMax5 += r(this.F, i7, iMax5, i10, 0, iArr);
            iMax = Math.max(iMax, l(this.F) + this.F.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.F.getMeasuredState());
        }
        if (t(this.f885w)) {
            iMax5 += r(this.f885w, i7, iMax5, i10, 0, iArr);
            iMax = Math.max(iMax, l(this.f885w) + this.f885w.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f885w.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((s3) childAt.getLayoutParams()).f1106b == 0 && t(childAt)) {
                iMax5 += r(childAt, i7, iMax5, i10, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i13 = iMax5;
        int i14 = this.O + this.P;
        int i15 = this.M + this.N;
        if (t(this.f867e)) {
            r(this.f867e, i7, i13 + i15, i10, i14, iArr);
            int iK3 = k(this.f867e) + this.f867e.getMeasuredWidth();
            iL = l(this.f867e) + this.f867e.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f867e.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (t(this.f871i)) {
            iMax2 = Math.max(iMax2, r(this.f871i, i7, i13 + i15, i10, i14 + iL, iArr));
            iL += l(this.f871i) + this.f871i.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f871i.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i13 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i7, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, iCombineMeasuredStates2 << 16);
        if (!this.f879p0) {
            i11 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = getChildAt(i16);
            if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i11 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i11);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof u3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        u3 u3Var = (u3) parcelable;
        super.onRestoreInstanceState(u3Var.f7578d);
        ActionMenuView actionMenuView = this.f865d;
        n.j jVar = actionMenuView != null ? actionMenuView.M : null;
        int i7 = u3Var.f1132i;
        if (i7 != 0 && this.f876m0 != null && jVar != null && (menuItemFindItem = jVar.findItem(i7)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (u3Var.f1133v) {
            a3.h hVar = this.f883t0;
            removeCallbacks(hVar);
            post(hVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        d();
        p2 p2Var = this.Q;
        boolean z5 = i7 == 1;
        if (z5 == p2Var.f1078g) {
            return;
        }
        p2Var.f1078g = z5;
        if (!p2Var.f1079h) {
            p2Var.f1072a = p2Var.f1076e;
            p2Var.f1073b = p2Var.f1077f;
            return;
        }
        if (z5) {
            int i10 = p2Var.f1075d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = p2Var.f1076e;
            }
            p2Var.f1072a = i10;
            int i11 = p2Var.f1074c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = p2Var.f1077f;
            }
            p2Var.f1073b = i11;
            return;
        }
        int i12 = p2Var.f1074c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = p2Var.f1076e;
        }
        p2Var.f1072a = i12;
        int i13 = p2Var.f1075d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = p2Var.f1077f;
        }
        p2Var.f1073b = i13;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        n.l lVar;
        u3 u3Var = new u3(super.onSaveInstanceState());
        r3 r3Var = this.f876m0;
        if (r3Var != null && (lVar = r3Var.f1097e) != null) {
            u3Var.f1132i = lVar.f16167a;
        }
        u3Var.f1133v = o();
        return u3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f863b0 = false;
        }
        if (!this.f863b0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f863b0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f863b0 = false;
        return true;
    }

    public final int p(View view, int i7, int i10, int[] iArr) {
        s3 s3Var = (s3) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) s3Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i11) + i7;
        iArr[0] = Math.max(0, -i11);
        int iJ = j(i10, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) s3Var).rightMargin + iMax;
    }

    public final int q(View view, int i7, int i10, int[] iArr) {
        s3 s3Var = (s3) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) s3Var).rightMargin - iArr[1];
        int iMax = i7 - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int iJ = j(i10, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) s3Var).leftMargin);
    }

    public final int r(View view, int i7, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + iMax + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    @Override // androidx.core.view.k
    public final void removeMenuProvider(MenuProvider menuProvider) {
        this.f870g0.a(menuProvider);
    }

    public final void s(View view, int i7, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z5) {
        if (this.f882s0 != z5) {
            this.f882s0 = z5;
            v();
        }
    }

    public void setCollapseContentDescription(int i7) {
        setCollapseContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setCollapseIcon(int i7) {
        setCollapseIcon(mf.f.u(getContext(), i7));
    }

    public void setCollapsible(boolean z5) {
        this.f879p0 = z5;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.S) {
            this.S = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.R) {
            this.R = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i7) {
        setLogo(mf.f.u(getContext(), i7));
    }

    public void setLogoDescription(int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    public void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationIcon(int i7) {
        setNavigationIcon(mf.f.u(getContext(), i7));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f884v.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(t3 t3Var) {
        this.f872i0 = t3Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f865d.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i7) {
        if (this.H != i7) {
            this.H = i7;
            if (i7 == 0) {
                this.G = getContext();
            } else {
                this.G = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setSubtitle(int i7) {
        setSubtitle(getContext().getText(i7));
    }

    public void setSubtitleTextColor(int i7) {
        setSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setTitle(int i7) {
        setTitle(getContext().getText(i7));
    }

    public void setTitleMarginBottom(int i7) {
        this.P = i7;
        requestLayout();
    }

    public void setTitleMarginEnd(int i7) {
        this.N = i7;
        requestLayout();
    }

    public void setTitleMarginStart(int i7) {
        this.M = i7;
        requestLayout();
    }

    public void setTitleMarginTop(int i7) {
        this.O = i7;
        requestLayout();
    }

    public void setTitleTextColor(int i7) {
        setTitleTextColor(ColorStateList.valueOf(i7));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean u() {
        n nVar;
        ActionMenuView actionMenuView = this.f865d;
        return (actionMenuView == null || (nVar = actionMenuView.Q) == null || !nVar.n()) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = q3.a(this);
            r3 r3Var = this.f876m0;
            boolean z5 = (r3Var == null || r3Var.f1097e == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.f882s0) ? false : true;
            if (z5 && this.f881r0 == null) {
                if (this.f880q0 == null) {
                    this.f880q0 = q3.b(new o3(this, 0));
                }
                q3.c(onBackInvokedDispatcherA, this.f880q0);
                this.f881r0 = onBackInvokedDispatcherA;
                return;
            }
            if (z5 || (onBackInvokedDispatcher = this.f881r0) == null) {
                return;
            }
            q3.d(onBackInvokedDispatcher, this.f880q0);
            this.f881r0 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.T = 8388627;
        this.f866d0 = new ArrayList();
        this.f868e0 = new ArrayList();
        this.f869f0 = new int[2];
        this.f870g0 = new MenuHostHelper(new o3(this, 1));
        this.h0 = new ArrayList();
        this.f873j0 = new ga.l(1, this);
        this.f883t0 = new a3.h(4, this);
        Context context2 = getContext();
        int[] iArr = h.a.f10275y;
        e4.m mVarE = e4.m.E(context2, attributeSet, iArr, R.attr.toolbarStyle);
        androidx.core.view.u0.o(this, context, iArr, attributeSet, (TypedArray) mVarE.f7994i, R.attr.toolbarStyle, 0);
        TypedArray typedArray = (TypedArray) mVarE.f7994i;
        this.I = typedArray.getResourceId(28, 0);
        this.J = typedArray.getResourceId(19, 0);
        this.T = typedArray.getInteger(0, 8388627);
        this.K = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.P = dimensionPixelOffset;
        this.O = dimensionPixelOffset;
        this.N = dimensionPixelOffset;
        this.M = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.M = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.N = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.O = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.P = dimensionPixelOffset5;
        }
        this.L = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        p2 p2Var = this.Q;
        p2Var.f1079h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            p2Var.f1076e = dimensionPixelSize;
            p2Var.f1072a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            p2Var.f1077f = dimensionPixelSize2;
            p2Var.f1073b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            p2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.R = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.S = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f886x = mVarE.x(4);
        this.f887y = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.G = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableX = mVarE.x(16);
        if (drawableX != null) {
            setNavigationIcon(drawableX);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableX2 = mVarE.x(11);
        if (drawableX2 != null) {
            setLogo(drawableX2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(mVarE.w(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(mVarE.w(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        mVarE.H();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        s3 s3Var = new s3(context, attributeSet);
        s3Var.f1105a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f10254b);
        s3Var.f1105a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        s3Var.f1106b = 0;
        return s3Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        x xVar = this.E;
        if (xVar != null) {
            xVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.E.setImageDrawable(drawable);
        } else {
            x xVar = this.E;
            if (xVar != null) {
                xVar.setImageDrawable(this.f886x);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f885w == null) {
                this.f885w = new y(getContext());
            }
            if (!n(this.f885w)) {
                b(this.f885w, true);
            }
        } else {
            y yVar = this.f885w;
            if (yVar != null && n(yVar)) {
                removeView(this.f885w);
                this.f868e0.remove(this.f885w);
            }
        }
        y yVar2 = this.f885w;
        if (yVar2 != null) {
            yVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f885w == null) {
            this.f885w = new y(getContext());
        }
        y yVar = this.f885w;
        if (yVar != null) {
            yVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        x xVar = this.f884v;
        if (xVar != null) {
            xVar.setContentDescription(charSequence);
            ib.a.I(this.f884v, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f884v)) {
                b(this.f884v, true);
            }
        } else {
            x xVar = this.f884v;
            if (xVar != null && n(xVar)) {
                removeView(this.f884v);
                this.f868e0.remove(this.f884v);
            }
        }
        x xVar2 = this.f884v;
        if (xVar2 != null) {
            xVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f871i;
            if (appCompatTextView != null && n(appCompatTextView)) {
                removeView(this.f871i);
                this.f868e0.remove(this.f871i);
            }
        } else {
            if (this.f871i == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f871i = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f871i.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.J;
                if (i7 != 0) {
                    this.f871i.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.a0;
                if (colorStateList != null) {
                    this.f871i.setTextColor(colorStateList);
                }
            }
            if (!n(this.f871i)) {
                b(this.f871i, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f871i;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.V = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.a0 = colorStateList;
        AppCompatTextView appCompatTextView = this.f871i;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f867e;
            if (appCompatTextView != null && n(appCompatTextView)) {
                removeView(this.f867e);
                this.f868e0.remove(this.f867e);
            }
        } else {
            if (this.f867e == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f867e = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f867e.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.I;
                if (i7 != 0) {
                    this.f867e.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.W;
                if (colorStateList != null) {
                    this.f867e.setTextColor(colorStateList);
                }
            }
            if (!n(this.f867e)) {
                b(this.f867e, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f867e;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.U = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.W = colorStateList;
        AppCompatTextView appCompatTextView = this.f867e;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }
}
