package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.u0;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import java.util.List;
import java.util.WeakHashMap;
import mg.f;
import mg.g;
import v0.b;
import v0.d;
import yk.a;

/* JADX INFO: loaded from: classes3.dex */
public class AppBarLayout$ScrollingViewBehavior extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f6236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f6237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6239f;

    public AppBarLayout$ScrollingViewBehavior() {
        this.f6236c = new Rect();
        this.f6237d = new Rect();
        this.f6238e = 0;
    }

    public static f u(List list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) list.get(i7);
            if (view instanceof f) {
                return (f) view;
            }
        }
        return null;
    }

    @Override // v0.b
    public final boolean b(View view, View view2) {
        return view2 instanceof f;
    }

    @Override // v0.b
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b bVar = ((d) view2.getLayoutParams()).f21325a;
        if (bVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = (((view2.getBottom() - view.getTop()) + ((AppBarLayout$BaseBehavior) bVar).j) + this.f6238e) - v(view2);
            WeakHashMap weakHashMap = u0.f1729a;
            view.offsetTopAndBottom(bottom);
        }
        if (!(view2 instanceof f)) {
            return false;
        }
        f fVar = (f) view2;
        if (!fVar.H) {
            return false;
        }
        fVar.e(fVar.f(view));
        return false;
    }

    @Override // v0.b
    public final void e(CoordinatorLayout coordinatorLayout, View view) {
        if (view instanceof f) {
            u0.p(coordinatorLayout, null);
        }
    }

    @Override // v0.b
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i7, int i10, int i11) {
        f fVarU;
        WindowInsetsCompat lastWindowInsets;
        int i12 = view.getLayoutParams().height;
        if ((i12 != -1 && i12 != -2) || (fVarU = u(coordinatorLayout.d(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i11);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (fVarU.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.a() + lastWindowInsets.d();
        }
        int totalScrollRange = fVarU.getTotalScrollRange() + size;
        int measuredHeight = fVarU.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.l(i7, i10, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i12 == -1 ? 1073741824 : Integer.MIN_VALUE), view);
        return true;
    }

    @Override // v0.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z5) {
        f fVarU = u(coordinatorLayout.d(view));
        if (fVarU != null) {
            Rect rect2 = new Rect(rect);
            rect2.offset(view.getLeft(), view.getTop());
            int width = coordinatorLayout.getWidth();
            int height = coordinatorLayout.getHeight();
            Rect rect3 = this.f6236c;
            rect3.set(0, 0, width, height);
            if (!rect3.contains(rect2)) {
                fVarU.d(false, !z5, true);
                return true;
            }
        }
        return false;
    }

    @Override // mg.g
    public final void t(CoordinatorLayout coordinatorLayout, View view, int i7) {
        f fVarU = u(coordinatorLayout.d(view));
        if (fVarU == null) {
            coordinatorLayout.k(i7, view);
            this.f6238e = 0;
            return;
        }
        d dVar = (d) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
        int bottom = fVarU.getBottom() + ((ViewGroup.MarginLayoutParams) dVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
        int bottom2 = ((fVarU.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
        Rect rect = this.f6236c;
        rect.set(paddingLeft, bottom, width, bottom2);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left = lastWindowInsets.b() + rect.left;
            rect.right -= lastWindowInsets.c();
        }
        int i10 = dVar.f21327c;
        if (i10 == 0) {
            i10 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f6237d;
        Gravity.apply(i10, measuredWidth, measuredHeight, rect, rect2, i7);
        int iV = v(fVarU);
        view.layout(rect2.left, rect2.top - iV, rect2.right, rect2.bottom - iV);
        this.f6238e = rect2.top - fVarU.getBottom();
    }

    public final int v(View view) {
        int i7;
        if (this.f6239f == 0) {
            return 0;
        }
        float f2 = 0.0f;
        if (view instanceof f) {
            f fVar = (f) view;
            int totalScrollRange = fVar.getTotalScrollRange();
            int downNestedPreScrollRange = fVar.getDownNestedPreScrollRange();
            b bVar = ((d) fVar.getLayoutParams()).f21325a;
            int iX = bVar instanceof AppBarLayout$BaseBehavior ? ((AppBarLayout$BaseBehavior) bVar).x() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iX > downNestedPreScrollRange) && (i7 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f2 = (iX / i7) + 1.0f;
            }
        }
        int i10 = this.f6239f;
        return a.f((int) (f2 * i10), 0, i10);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f6236c = new Rect();
        this.f6237d = new Rect();
        this.f6238e = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kg.a.G);
        this.f6239f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
