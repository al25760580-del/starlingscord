package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends y1 implements n.i, n.x {
    public n.j M;
    public Context N;
    public int O;
    public boolean P;
    public n Q;
    public a5.i0 R;
    public n.h S;
    public boolean T;
    public int U;
    public final int V;
    public final int W;
    public q a0;

    public ActionMenuView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.V = (int) (56.0f * f2);
        this.W = (int) (f2 * 4.0f);
        this.N = context;
        this.O = 0;
    }

    public static p j() {
        p pVar = new p(-2, -2);
        pVar.f1061a = false;
        ((LinearLayout.LayoutParams) pVar).gravity = 16;
        return pVar;
    }

    public static p k(ViewGroup.LayoutParams layoutParams) {
        p pVar;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof p) {
            p pVar2 = (p) layoutParams;
            pVar = new p(pVar2);
            pVar.f1061a = pVar2.f1061a;
        } else {
            pVar = new p(layoutParams);
        }
        if (((LinearLayout.LayoutParams) pVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) pVar).gravity = 16;
        }
        return pVar;
    }

    @Override // n.x
    public final void b(n.j jVar) {
        this.M = jVar;
    }

    @Override // n.i
    public final boolean c(n.l lVar) {
        return this.M.q(lVar, null, 0);
    }

    @Override // androidx.appcompat.widget.y1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.y1
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ x1 generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.y1
    /* JADX INFO: renamed from: g */
    public final x1 generateLayoutParams(AttributeSet attributeSet) {
        return new p(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.y1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.y1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.M == null) {
            Context context = getContext();
            n.j jVar = new n.j(context);
            this.M = jVar;
            jVar.f16146e = new fj.c(3, this);
            n nVar = new n(context);
            this.Q = nVar;
            nVar.J = true;
            nVar.K = true;
            n.u kVar = this.R;
            if (kVar == null) {
                kVar = new ga.k();
            }
            nVar.f1040w = kVar;
            this.M.b(nVar, this.N);
            n nVar2 = this.Q;
            nVar2.E = this;
            this.M = nVar2.f1038i;
        }
        return this.M;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        n nVar = this.Q;
        l lVar = nVar.G;
        if (lVar != null) {
            return lVar.getDrawable();
        }
        if (nVar.I) {
            return nVar.H;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.O;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.y1
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ x1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i7) {
        boolean zB = false;
        if (i7 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i7 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof o)) {
            zB = ((o) childAt).b();
        }
        return (i7 <= 0 || !(childAt2 instanceof o)) ? zB : ((o) childAt2).c() | zB;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        n nVar = this.Q;
        if (nVar != null) {
            nVar.a(false);
            if (this.Q.m()) {
                this.Q.l();
                this.Q.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n nVar = this.Q;
        if (nVar != null) {
            nVar.l();
            h hVar = nVar.R;
            if (hVar == null || !hVar.b()) {
                return;
            }
            hVar.f16210i.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.y1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        int width;
        int paddingLeft;
        if (!this.T) {
            super.onLayout(z5, i7, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i13 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i14 = i11 - i7;
        int paddingRight = (i14 - getPaddingRight()) - getPaddingLeft();
        boolean z6 = f4.f976a;
        boolean z7 = getLayoutDirection() == 1;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                p pVar = (p) childAt.getLayoutParams();
                if (pVar.f1061a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i17)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z7) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) pVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) pVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i18 = i13 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i18, width, measuredHeight + i18);
                    paddingRight -= measuredWidth;
                    i15 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) pVar).leftMargin) + ((LinearLayout.LayoutParams) pVar).rightMargin;
                    l(i17);
                    i16++;
                }
            }
        }
        if (childCount == 1 && i15 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i19 = (i14 / 2) - (measuredWidth2 / 2);
            int i20 = i13 - (measuredHeight2 / 2);
            childAt2.layout(i19, i20, measuredWidth2 + i19, measuredHeight2 + i20);
            return;
        }
        int i21 = i16 - (i15 ^ 1);
        int iMax = Math.max(0, i21 > 0 ? paddingRight / i21 : 0);
        if (z7) {
            int width2 = getWidth() - getPaddingRight();
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt3 = getChildAt(i22);
                p pVar2 = (p) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !pVar2.f1061a) {
                    int i23 = width2 - ((LinearLayout.LayoutParams) pVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i24 = i13 - (measuredHeight3 / 2);
                    childAt3.layout(i23 - measuredWidth3, i24, i23, measuredHeight3 + i24);
                    width2 = i23 - ((measuredWidth3 + ((LinearLayout.LayoutParams) pVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt4 = getChildAt(i25);
            p pVar3 = (p) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !pVar3.f1061a) {
                int i26 = paddingLeft2 + ((LinearLayout.LayoutParams) pVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i27 = i13 - (measuredHeight4 / 2);
                childAt4.layout(i26, i27, i26 + measuredWidth4, measuredHeight4 + i27);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) pVar3).rightMargin + iMax + i26;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.y1, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        ?? r11;
        int i13;
        int i14;
        n.j jVar;
        boolean z5 = this.T;
        boolean z6 = View.MeasureSpec.getMode(i7) == 1073741824;
        this.T = z6;
        if (z5 != z6) {
            this.U = 0;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.T && (jVar = this.M) != null && size != this.U) {
            this.U = size;
            jVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.T || childCount <= 0) {
            for (int i15 = 0; i15 < childCount; i15++) {
                p pVar = (p) getChildAt(i15).getLayoutParams();
                ((LinearLayout.LayoutParams) pVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) pVar).leftMargin = 0;
            }
            super.onMeasure(i7, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
        int i16 = size2 - paddingRight;
        int i17 = this.V;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i20 = (i19 / i18) + i17;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i21 = 0;
        int iMax2 = 0;
        int i22 = 0;
        boolean z7 = false;
        int i23 = 0;
        long j = 0;
        while (true) {
            i11 = this.W;
            if (i22 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i22);
            int i24 = size3;
            int i25 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i13 = i20;
            } else {
                boolean z10 = childAt instanceof ActionMenuItemView;
                i21++;
                if (z10) {
                    childAt.setPadding(i11, 0, i11, 0);
                }
                p pVar2 = (p) childAt.getLayoutParams();
                pVar2.f1066f = false;
                pVar2.f1063c = 0;
                pVar2.f1062b = 0;
                pVar2.f1064d = false;
                ((LinearLayout.LayoutParams) pVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) pVar2).rightMargin = 0;
                pVar2.f1065e = z10 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i26 = pVar2.f1061a ? 1 : i18;
                p pVar3 = (p) childAt.getLayoutParams();
                int i27 = i18;
                i13 = i20;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i25, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z10 ? (ActionMenuItemView) childAt : null;
                boolean z11 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z12 = z11;
                if (i26 <= 0 || (z11 && i26 < 2)) {
                    i14 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i26, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i14 = measuredWidth / i13;
                    if (measuredWidth % i13 != 0) {
                        i14++;
                    }
                    if (z12 && i14 < 2) {
                        i14 = 2;
                    }
                }
                pVar3.f1064d = !pVar3.f1061a && z12;
                pVar3.f1062b = i14;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i13, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i14);
                if (pVar2.f1064d) {
                    i23++;
                }
                if (pVar2.f1061a) {
                    z7 = true;
                }
                i18 = i27 - i14;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i14 == 1) {
                    j |= (long) (1 << i22);
                }
            }
            i22++;
            size3 = i24;
            paddingBottom = i25;
            i20 = i13;
        }
        int i28 = size3;
        int i29 = i18;
        int i30 = i20;
        boolean z13 = z7 && i21 == 2;
        int i31 = i29;
        boolean z14 = false;
        while (true) {
            if (i23 <= 0 || i31 <= 0) {
                i12 = iMax;
                break;
            }
            int i32 = Integer.MAX_VALUE;
            long j5 = 0;
            int i33 = 0;
            int i34 = 0;
            while (i34 < childCount2) {
                int i35 = iMax;
                p pVar4 = (p) getChildAt(i34).getLayoutParams();
                boolean z15 = z13;
                if (pVar4.f1064d) {
                    int i36 = pVar4.f1062b;
                    if (i36 < i32) {
                        j5 = 1 << i34;
                        i32 = i36;
                        i33 = 1;
                    } else if (i36 == i32) {
                        j5 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                z13 = z15;
                iMax = i35;
            }
            i12 = iMax;
            boolean z16 = z13;
            j |= j5;
            if (i33 > i31) {
                break;
            }
            int i37 = i32 + 1;
            int i38 = 0;
            while (i38 < childCount2) {
                View childAt2 = getChildAt(i38);
                p pVar5 = (p) childAt2.getLayoutParams();
                boolean z17 = z7;
                long j7 = 1 << i38;
                if ((j5 & j7) != 0) {
                    if (z16 && pVar5.f1065e) {
                        r11 = 1;
                        r11 = 1;
                        if (i31 == 1) {
                            childAt2.setPadding(i11 + i30, 0, i11, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    pVar5.f1062b += r11;
                    pVar5.f1066f = r11;
                    i31--;
                } else if (pVar5.f1062b == i37) {
                    j |= j7;
                }
                i38++;
                z7 = z17;
            }
            z13 = z16;
            iMax = i12;
            z14 = true;
        }
        boolean z18 = !z7 && i21 == 1;
        if (i31 > 0 && j != 0 && (i31 < i21 - 1 || z18 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z18) {
                if ((j & 1) != 0 && !((p) getChildAt(0).getLayoutParams()).f1065e) {
                    fBitCount -= 0.5f;
                }
                int i39 = childCount2 - 1;
                if ((j & ((long) (1 << i39))) != 0 && !((p) getChildAt(i39).getLayoutParams()).f1065e) {
                    fBitCount -= 0.5f;
                }
            }
            int i40 = fBitCount > 0.0f ? (int) ((i31 * i30) / fBitCount) : 0;
            boolean z19 = z14;
            for (int i41 = 0; i41 < childCount2; i41++) {
                if ((j & ((long) (1 << i41))) != 0) {
                    View childAt3 = getChildAt(i41);
                    p pVar6 = (p) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        pVar6.f1063c = i40;
                        pVar6.f1066f = true;
                        if (i41 == 0 && !pVar6.f1065e) {
                            ((LinearLayout.LayoutParams) pVar6).leftMargin = (-i40) / 2;
                        }
                        z19 = true;
                    } else if (pVar6.f1061a) {
                        pVar6.f1063c = i40;
                        pVar6.f1066f = true;
                        ((LinearLayout.LayoutParams) pVar6).rightMargin = (-i40) / 2;
                        z19 = true;
                    } else {
                        if (i41 != 0) {
                            ((LinearLayout.LayoutParams) pVar6).leftMargin = i40 / 2;
                        }
                        if (i41 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) pVar6).rightMargin = i40 / 2;
                        }
                    }
                }
            }
            z14 = z19;
        }
        if (z14) {
            for (int i42 = 0; i42 < childCount2; i42++) {
                View childAt4 = getChildAt(i42);
                p pVar7 = (p) childAt4.getLayoutParams();
                if (pVar7.f1066f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((pVar7.f1062b * i30) + pVar7.f1063c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i16, mode != 1073741824 ? i12 : i28);
    }

    public void setExpandedActionViewsExclusive(boolean z5) {
        this.Q.O = z5;
    }

    public void setOnMenuItemClickListener(q qVar) {
        this.a0 = qVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        n nVar = this.Q;
        l lVar = nVar.G;
        if (lVar != null) {
            lVar.setImageDrawable(drawable);
        } else {
            nVar.I = true;
            nVar.H = drawable;
        }
    }

    public void setOverflowReserved(boolean z5) {
        this.P = z5;
    }

    public void setPopupTheme(int i7) {
        if (this.O != i7) {
            this.O = i7;
            if (i7 == 0) {
                this.N = getContext();
            } else {
                this.N = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setPresenter(n nVar) {
        this.Q = nVar;
        nVar.E = this;
        this.M = nVar.f1038i;
    }

    @Override // androidx.appcompat.widget.y1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new p(getContext(), attributeSet);
    }
}
