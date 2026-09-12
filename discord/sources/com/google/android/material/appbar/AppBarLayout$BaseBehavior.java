package com.google.android.material.appbar;

import a5.t;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.collection.SimpleArrayMap;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.q;
import androidx.core.view.u0;
import e4.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mg.c;
import mg.d;
import mg.e;
import mg.f;
import mg.g;
import v0.b;
import yk.a;

/* JADX INFO: loaded from: classes3.dex */
public class AppBarLayout$BaseBehavior<T extends f> extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f6226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OverScroller f6227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public VelocityTracker f6232i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ValueAnimator f6233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f6234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WeakReference f6235n;

    public AppBarLayout$BaseBehavior() {
        this.f6229f = -1;
        this.f6231h = -1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    public static void D(CoordinatorLayout coordinatorLayout, f fVar, int i7, int i10, boolean z5) {
        View childAt;
        boolean zF;
        int iAbs = Math.abs(i7);
        int childCount = fVar.getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                childAt = null;
                break;
            }
            childAt = fVar.getChildAt(i11);
            if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                break;
            } else {
                i11++;
            }
        }
        if (childAt != null) {
            int i12 = ((e) childAt.getLayoutParams()).f15774a;
            if ((i12 & 1) != 0) {
                int minimumHeight = childAt.getMinimumHeight();
                zF = true;
                if (i10 <= 0 || (i12 & 12) == 0 ? (i12 & 2) == 0 || (-i7) < (childAt.getBottom() - minimumHeight) - fVar.getTopInset() : (-i7) < (childAt.getBottom() - minimumHeight) - fVar.getTopInset()) {
                    zF = false;
                }
            } else {
                zF = false;
            }
        } else {
            zF = false;
        }
        if (fVar.H) {
            zF = fVar.f(w(coordinatorLayout));
        }
        boolean zE = fVar.e(zF);
        if (!z5) {
            if (zE) {
                ArrayList arrayList = (ArrayList) ((SimpleArrayMap) coordinatorLayout.f1454e.f7981i).get(fVar);
                List arrayList2 = arrayList != null ? new ArrayList(arrayList) : null;
                if (arrayList2 == null) {
                    arrayList2 = Collections.EMPTY_LIST;
                }
                int size = arrayList2.size();
                for (int i13 = 0; i13 < size; i13++) {
                    b bVar = ((v0.d) ((View) arrayList2.get(i13)).getLayoutParams()).f21325a;
                    if (bVar instanceof AppBarLayout$ScrollingViewBehavior) {
                        if (((AppBarLayout$ScrollingViewBehavior) bVar).f6239f == 0) {
                            return;
                        }
                    }
                }
                return;
            }
            return;
        }
        if (fVar.getBackground() != null) {
            fVar.getBackground().jumpToCurrentState();
        }
        if (fVar.getForeground() != null) {
            fVar.getForeground().jumpToCurrentState();
        }
        if (fVar.getStateListAnimator() != null) {
            fVar.getStateListAnimator().jumpToCurrentState();
        }
    }

    public static View u(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, CoordinatorLayout coordinatorLayout) {
        int childCount = coordinatorLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = coordinatorLayout.getChildAt(i7);
            if (((v0.d) childAt.getLayoutParams()).f21325a instanceof AppBarLayout$ScrollingViewBehavior) {
                return childAt;
            }
        }
        return null;
    }

    public static View w(CoordinatorLayout coordinatorLayout) {
        int childCount = coordinatorLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = coordinatorLayout.getChildAt(i7);
            if ((childAt instanceof q) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /* JADX WARN: Code duplicated, block: B:68:0x0173  */
    /* JADX WARN: Code duplicated, block: B:72:0x0185  */
    /* JADX WARN: Code duplicated, block: B:74:0x018a  */
    /* JADX WARN: Code duplicated, block: B:75:0x018c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0176 A[SYNTHETIC] */
    public final int A(CoordinatorLayout coordinatorLayout, View view, int i7, int i10, int i11) {
        int top;
        boolean z5;
        int i12;
        ArrayList arrayList;
        int i13;
        View view2;
        b bVar;
        int i14;
        l lVar;
        int topInset;
        f fVar = (f) view;
        int iX = x();
        int i15 = 0;
        if (i10 == 0 || iX < i10 || iX > i11) {
            this.j = 0;
        } else {
            int iF = a.f(i7, i10, i11);
            if (iX != iF) {
                if (!fVar.f15781w) {
                    top = iF;
                    break;
                }
                int iAbs = Math.abs(iF);
                int childCount = fVar.getChildCount();
                int i16 = 0;
                while (true) {
                    if (i16 < childCount) {
                        View childAt = fVar.getChildAt(i16);
                        e eVar = (e) childAt.getLayoutParams();
                        Interpolator interpolator = eVar.f15776c;
                        if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                            i16++;
                        } else if (interpolator != null) {
                            int i17 = eVar.f15774a;
                            if ((i17 & 1) != 0) {
                                topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                                if ((i17 & 2) != 0) {
                                    topInset -= childAt.getMinimumHeight();
                                }
                            } else {
                                topInset = 0;
                            }
                            if (childAt.getFitsSystemWindows()) {
                                topInset -= fVar.getTopInset();
                            }
                            if (topInset > 0) {
                                float f2 = topInset;
                                top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f2) * f2)) * Integer.signum(iF);
                                break;
                            }
                        }
                    }
                    top = iF;
                    break;
                }
                androidx.datastore.preferences.protobuf.g gVar = this.f15784a;
                int i18 = 1;
                if (gVar != null) {
                    if (gVar.f1862d != top) {
                        gVar.f1862d = top;
                        gVar.a();
                        z5 = true;
                    }
                    int i19 = iX - iF;
                    this.j = iF - top;
                    if (z5) {
                        i14 = 0;
                        while (i14 < fVar.getChildCount()) {
                            e eVar2 = (e) fVar.getChildAt(i14).getLayoutParams();
                            lVar = eVar2.f15775b;
                            if (lVar == null && (eVar2.f15774a & i18) != 0) {
                                View childAt2 = fVar.getChildAt(i14);
                                float fS = s();
                                Rect rect = (Rect) lVar.f7990i;
                                Rect rect2 = (Rect) lVar.f7989e;
                                childAt2.getDrawingRect(rect2);
                                fVar.offsetDescendantRectToMyCoords(childAt2, rect2);
                                rect2.offset(0, -fVar.getTopInset());
                                float fAbs = rect2.top - Math.abs(fS);
                                if (fAbs <= 0.0f) {
                                    float fE = 1.0f - a.e(Math.abs(fAbs / rect2.height()), 0.0f, 1.0f);
                                    float fHeight = (-fAbs) - ((rect2.height() * 0.3f) * (1.0f - (fE * fE)));
                                    childAt2.setTranslationY(fHeight);
                                    childAt2.getDrawingRect(rect);
                                    rect.offset(0, (int) (-fHeight));
                                    if (fHeight >= rect.height()) {
                                        childAt2.setAlpha(0.0f);
                                    } else {
                                        childAt2.setAlpha(1.0f);
                                    }
                                    childAt2.setClipBounds(rect);
                                } else {
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(0.0f);
                                    childAt2.setAlpha(1.0f);
                                }
                            }
                            i14++;
                            i18 = 1;
                        }
                    }
                    if (!z5 && fVar.f15781w && (arrayList = (ArrayList) ((SimpleArrayMap) coordinatorLayout.f1454e.f7981i).get(fVar)) != null && !arrayList.isEmpty()) {
                        for (i13 = 0; i13 < arrayList.size(); i13++) {
                            view2 = (View) arrayList.get(i13);
                            bVar = ((v0.d) view2.getLayoutParams()).f21325a;
                            if (bVar != null) {
                                bVar.d(coordinatorLayout, view2, fVar);
                            }
                        }
                    }
                    fVar.f15777d = s();
                    if (!fVar.willNotDraw()) {
                        fVar.postInvalidateOnAnimation();
                    }
                    if (iF < iX) {
                        i12 = -1;
                    } else {
                        i12 = 1;
                    }
                    D(coordinatorLayout, fVar, iF, i12, false);
                    i15 = i19;
                } else {
                    this.f15785b = top;
                }
                z5 = false;
                int i110 = iX - iF;
                this.j = iF - top;
                if (z5) {
                    i14 = 0;
                    while (i14 < fVar.getChildCount()) {
                        e eVar3 = (e) fVar.getChildAt(i14).getLayoutParams();
                        lVar = eVar3.f15775b;
                        if (lVar == null) {
                        }
                        i14++;
                        i18 = 1;
                    }
                }
                if (!z5) {
                    while (i13 < arrayList.size()) {
                        view2 = (View) arrayList.get(i13);
                        bVar = ((v0.d) view2.getLayoutParams()).f21325a;
                        if (bVar != null) {
                            bVar.d(coordinatorLayout, view2, fVar);
                        }
                    }
                }
                fVar.f15777d = s();
                if (!fVar.willNotDraw()) {
                    fVar.postInvalidateOnAnimation();
                }
                if (iF < iX) {
                    i12 = -1;
                } else {
                    i12 = 1;
                }
                D(coordinatorLayout, fVar, iF, i12, false);
                i15 = i110;
            }
        }
        if (u0.f(coordinatorLayout) != null) {
            return i15;
        }
        u0.p(coordinatorLayout, new c(coordinatorLayout, this, fVar));
        return i15;
    }

    public final void B(CoordinatorLayout coordinatorLayout, View view, int i7) {
        A(coordinatorLayout, view, i7, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public final void C(CoordinatorLayout coordinatorLayout, f fVar) {
        int paddingTop = fVar.getPaddingTop() + fVar.getTopInset();
        int iX = x() - paddingTop;
        int childCount = fVar.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                i7 = -1;
                break;
            }
            View childAt = fVar.getChildAt(i7);
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            e eVar = (e) childAt.getLayoutParams();
            if ((eVar.f15774a & 32) == 32) {
                top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
            }
            int i10 = -iX;
            if (top <= i10 && bottom >= i10) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            View childAt2 = fVar.getChildAt(i7);
            e eVar2 = (e) childAt2.getLayoutParams();
            int i11 = eVar2.f15774a;
            if ((i11 & 17) == 17) {
                int topInset = -childAt2.getTop();
                int minimumHeight = -childAt2.getBottom();
                if (i7 == 0 && fVar.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                    topInset -= fVar.getTopInset();
                }
                if ((i11 & 2) == 2) {
                    minimumHeight += childAt2.getMinimumHeight();
                } else if ((i11 & 5) == 5) {
                    int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                    if (iX < minimumHeight2) {
                        topInset = minimumHeight2;
                    } else {
                        minimumHeight = minimumHeight2;
                    }
                }
                if ((i11 & 32) == 32) {
                    topInset += ((LinearLayout.LayoutParams) eVar2).topMargin;
                    minimumHeight -= ((LinearLayout.LayoutParams) eVar2).bottomMargin;
                }
                if (iX < (minimumHeight + topInset) / 2) {
                    topInset = minimumHeight;
                }
                v(coordinatorLayout, fVar, a.f(topInset + paddingTop, -fVar.getTotalScrollRange(), 0));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    @Override // v0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int y5;
        boolean z5;
        OverScroller overScroller;
        View view2;
        int iFindPointerIndex;
        if (this.f6231h < 0) {
            this.f6231h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f6228e) {
            int i7 = this.f6229f;
            if (i7 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i7)) != -1) {
                int y8 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y8 - this.f6230g) > this.f6231h) {
                    this.f6230g = y8;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.f6229f = -1;
                    int x5 = (int) motionEvent.getX();
                    y5 = (int) motionEvent.getY();
                    WeakReference weakReference = this.f6235n;
                    if (weakReference == null) {
                    }
                    this.f6228e = z5;
                    if (z5) {
                        this.f6230g = y5;
                        this.f6229f = motionEvent.getPointerId(0);
                        if (this.f6232i == null) {
                            this.f6232i = VelocityTracker.obtain();
                        }
                        overScroller = this.f6227d;
                        if (overScroller != null) {
                            this.f6227d.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.f6232i;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.f6229f = -1;
                int x6 = (int) motionEvent.getX();
                y5 = (int) motionEvent.getY();
                WeakReference weakReference2 = this.f6235n;
                z5 = !(weakReference2 == null && ((view2 = (View) weakReference2.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) && coordinatorLayout.i(view, x6, y5);
                this.f6228e = z5;
                if (z5) {
                    this.f6230g = y5;
                    this.f6229f = motionEvent.getPointerId(0);
                    if (this.f6232i == null) {
                        this.f6232i = VelocityTracker.obtain();
                    }
                    overScroller = this.f6227d;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.f6227d.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.f6232i;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    @Override // mg.g, v0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i7) {
        int iRound;
        f fVar = (f) view;
        super.h(coordinatorLayout, fVar, i7);
        int pendingAction = fVar.getPendingAction();
        d dVar = this.f6234m;
        if (dVar == null || (pendingAction & 8) != 0) {
            if (pendingAction != 0) {
                boolean z5 = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i10 = -fVar.getUpNestedPreScrollRange();
                    if (z5) {
                        v(coordinatorLayout, fVar, i10);
                    } else {
                        B(coordinatorLayout, fVar, i10);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z5) {
                        v(coordinatorLayout, fVar, 0);
                    } else {
                        B(coordinatorLayout, fVar, 0);
                    }
                }
            }
        } else if (dVar.f15769i) {
            B(coordinatorLayout, fVar, -fVar.getTotalScrollRange());
        } else if (dVar.f15770v) {
            B(coordinatorLayout, fVar, 0);
        } else {
            View childAt = fVar.getChildAt(dVar.f15771w);
            int i11 = -childAt.getBottom();
            if (this.f6234m.f15773y) {
                iRound = fVar.getTopInset() + childAt.getMinimumHeight() + i11;
            } else {
                iRound = Math.round(childAt.getHeight() * this.f6234m.f15772x) + i11;
            }
            B(coordinatorLayout, fVar, iRound);
        }
        fVar.f15782x = 0;
        this.f6234m = null;
        int iF = a.f(s(), -fVar.getTotalScrollRange(), 0);
        androidx.datastore.preferences.protobuf.g gVar = this.f15784a;
        if (gVar == null) {
            this.f15785b = iF;
        } else if (gVar.f1862d != iF) {
            gVar.f1862d = iF;
            gVar.a();
        }
        D(coordinatorLayout, fVar, s(), 0, true);
        fVar.f15777d = s();
        if (!fVar.willNotDraw()) {
            fVar.postInvalidateOnAnimation();
        }
        if (u0.f(coordinatorLayout) != null) {
            return true;
        }
        u0.p(coordinatorLayout, new c(coordinatorLayout, this, fVar));
        return true;
    }

    @Override // v0.b
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i7, int i10, int i11) {
        f fVar = (f) view;
        if (((ViewGroup.MarginLayoutParams) ((v0.d) fVar.getLayoutParams())).height != -2) {
            return false;
        }
        coordinatorLayout.l(i7, i10, View.MeasureSpec.makeMeasureSpec(0, 0), fVar);
        return true;
    }

    @Override // v0.b
    public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i10, int[] iArr, int i11) {
        y(coordinatorLayout, (f) view, view2, i10, iArr);
    }

    @Override // v0.b
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i7, int i10, int i11, int[] iArr) {
        CoordinatorLayout coordinatorLayout2;
        f fVar = (f) view;
        if (i11 < 0) {
            coordinatorLayout2 = coordinatorLayout;
            iArr[1] = A(coordinatorLayout2, fVar, x() - i11, -fVar.getDownNestedScrollRange(), 0);
        } else {
            coordinatorLayout2 = coordinatorLayout;
        }
        if (i11 == 0 && u0.f(coordinatorLayout2) == null) {
            u0.p(coordinatorLayout2, new c(coordinatorLayout2, this, fVar));
        }
    }

    @Override // v0.b
    public final void n(View view, Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.f6234m = (d) parcelable;
        } else {
            this.f6234m = null;
        }
    }

    @Override // v0.b
    public final Parcelable o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        d dVarZ = z(absSavedState, (f) view);
        return dVarZ == null ? absSavedState : dVarZ;
    }

    @Override // v0.b
    public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i10) {
        ValueAnimator valueAnimator;
        f fVar = (f) view;
        boolean z5 = (i7 & 2) != 0 && (fVar.H || fVar.G || (fVar.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= fVar.getHeight()));
        if (z5 && (valueAnimator = this.f6233l) != null) {
            valueAnimator.cancel();
        }
        this.f6235n = null;
        this.k = i10;
        return z5;
    }

    @Override // v0.b
    public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i7) {
        f fVar = (f) view;
        if (this.k == 0 || i7 == 1) {
            C(coordinatorLayout, fVar);
            if (fVar.H) {
                fVar.e(fVar.f(view2));
            }
        }
        this.f6235n = new WeakReference(view2);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103 A[ADDED_TO_REGION] */
    @Override // v0.b
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z5;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        AppBarLayout$BaseBehavior<T> appBarLayout$BaseBehavior = this;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(appBarLayout$BaseBehavior.f6229f);
                if (iFindPointerIndex != -1) {
                    int y5 = (int) motionEvent.getY(iFindPointerIndex);
                    int i7 = appBarLayout$BaseBehavior.f6230g - y5;
                    appBarLayout$BaseBehavior.f6230g = y5;
                    f fVar = (f) view;
                    appBarLayout$BaseBehavior.A(coordinatorLayout, view, appBarLayout$BaseBehavior.x() - i7, fVar.getTopInset() + (-fVar.getDownNestedScrollRange()), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i10 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    appBarLayout$BaseBehavior.f6229f = motionEvent.getPointerId(i10);
                    appBarLayout$BaseBehavior.f6230g = (int) (motionEvent.getY(i10) + 0.5f);
                }
            }
            z5 = false;
            velocityTracker2 = appBarLayout$BaseBehavior.f6232i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !appBarLayout$BaseBehavior.f6228e || z5;
        }
        VelocityTracker velocityTracker3 = appBarLayout$BaseBehavior.f6232i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            appBarLayout$BaseBehavior.f6232i.computeCurrentVelocity(1000);
            float yVelocity = appBarLayout$BaseBehavior.f6232i.getYVelocity(appBarLayout$BaseBehavior.f6229f);
            f fVar2 = (f) view;
            int i11 = -fVar2.getTotalScrollRange();
            Runnable runnable = appBarLayout$BaseBehavior.f6226c;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                appBarLayout$BaseBehavior.f6226c = null;
            }
            if (appBarLayout$BaseBehavior.f6227d == null) {
                appBarLayout$BaseBehavior.f6227d = new OverScroller(view.getContext());
            }
            appBarLayout$BaseBehavior.f6227d.fling(0, appBarLayout$BaseBehavior.s(), 0, Math.round(yVelocity), 0, 0, i11, 0);
            if (appBarLayout$BaseBehavior.f6227d.computeScrollOffset()) {
                t tVar = new t(this, coordinatorLayout, view, 10, false);
                appBarLayout$BaseBehavior = this;
                appBarLayout$BaseBehavior.f6226c = tVar;
                view.postOnAnimation(tVar);
            } else {
                appBarLayout$BaseBehavior.C(coordinatorLayout, fVar2);
                if (fVar2.H) {
                    fVar2.e(fVar2.f(w(coordinatorLayout)));
                }
            }
            z5 = true;
        }
        appBarLayout$BaseBehavior.f6228e = false;
        appBarLayout$BaseBehavior.f6229f = -1;
        velocityTracker = appBarLayout$BaseBehavior.f6232i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            appBarLayout$BaseBehavior.f6232i = null;
        }
        velocityTracker2 = appBarLayout$BaseBehavior.f6232i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (appBarLayout$BaseBehavior.f6228e) {
        }
        z5 = false;
        appBarLayout$BaseBehavior.f6228e = false;
        appBarLayout$BaseBehavior.f6229f = -1;
        velocityTracker = appBarLayout$BaseBehavior.f6232i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            appBarLayout$BaseBehavior.f6232i = null;
        }
        velocityTracker2 = appBarLayout$BaseBehavior.f6232i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (appBarLayout$BaseBehavior.f6228e) {
        }
    }

    public final void v(CoordinatorLayout coordinatorLayout, f fVar, int i7) {
        int iAbs = Math.abs(x() - i7);
        float fAbs = Math.abs(0.0f);
        int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / fVar.getHeight()) + 1.0f) * 150.0f);
        int iX = x();
        if (iX == i7) {
            ValueAnimator valueAnimator = this.f6233l;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.f6233l.cancel();
            return;
        }
        ValueAnimator valueAnimator2 = this.f6233l;
        if (valueAnimator2 == null) {
            ValueAnimator valueAnimator3 = new ValueAnimator();
            this.f6233l = valueAnimator3;
            valueAnimator3.setInterpolator(lg.a.f15075e);
            this.f6233l.addUpdateListener(new mg.b(coordinatorLayout, this, fVar));
        } else {
            valueAnimator2.cancel();
        }
        this.f6233l.setDuration(Math.min(iRound, 600));
        this.f6233l.setIntValues(iX, i7);
        this.f6233l.start();
    }

    public final int x() {
        return s() + this.j;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final void y(CoordinatorLayout coordinatorLayout, f fVar, View view, int i7, int[] iArr) {
        f fVar2;
        int i10;
        int downNestedPreScrollRange;
        if (i7 == 0) {
            fVar2 = fVar;
        } else {
            if (i7 < 0) {
                i10 = -fVar.getTotalScrollRange();
                downNestedPreScrollRange = fVar.getDownNestedPreScrollRange() + i10;
            } else {
                i10 = -fVar.getUpNestedPreScrollRange();
                downNestedPreScrollRange = 0;
            }
            int i11 = i10;
            int i12 = downNestedPreScrollRange;
            if (i11 != i12) {
                fVar2 = fVar;
                iArr[1] = A(coordinatorLayout, fVar2, x() - i7, i11, i12);
            } else {
                fVar2 = fVar;
            }
        }
        if (fVar2.H) {
            fVar2.e(fVar2.f(view));
        }
    }

    public final d z(Parcelable parcelable, f fVar) {
        int iS = s();
        int childCount = fVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = fVar.getChildAt(i7);
            int bottom = childAt.getBottom() + iS;
            if (childAt.getTop() + iS <= 0 && bottom >= 0) {
                if (parcelable == null) {
                    parcelable = d2.b.f7577e;
                }
                d dVar = new d(parcelable);
                boolean z5 = iS == 0;
                dVar.f15770v = z5;
                dVar.f15769i = !z5 && (-iS) >= fVar.getTotalScrollRange();
                dVar.f15771w = i7;
                dVar.f15773y = bottom == fVar.getTopInset() + childAt.getMinimumHeight();
                dVar.f15772x = bottom / childAt.getHeight();
                return dVar;
            }
        }
        return null;
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f6229f = -1;
        this.f6231h = -1;
    }
}
