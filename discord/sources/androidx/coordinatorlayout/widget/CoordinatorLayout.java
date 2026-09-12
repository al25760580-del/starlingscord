package androidx.coordinatorlayout.widget;

import ag.t;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools$SynchronizedPool;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.j0;
import androidx.core.view.l0;
import androidx.core.view.r;
import androidx.core.view.s;
import androidx.core.view.u0;
import com.discord.R;
import e4.i;
import eightbitlab.com.blurview.b;
import i.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import mg.f;
import u0.a;
import v0.c;
import v0.d;
import v0.e;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements r, s {
    public static final String P;
    public static final Class[] Q;
    public static final ThreadLocal R;
    public static final t S;
    public static final Pools$SynchronizedPool T;
    public final int[] E;
    public View F;
    public View G;
    public b H;
    public boolean I;
    public WindowInsetsCompat J;
    public boolean K;
    public Drawable L;
    public ViewGroup.OnHierarchyChangeListener M;
    public m N;
    public final NestedScrollingParentHelper O;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f1454e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f1455i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f1456v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f1457w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1458x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1459y;

    static {
        Package r5 = CoordinatorLayout.class.getPackage();
        P = r5 != null ? r5.getName() : null;
        S = new t(12);
        Q = new Class[]{Context.class, AttributeSet.class};
        R = new ThreadLocal();
        T = new Pools$SynchronizedPool(12);
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f1453d = new ArrayList();
        this.f1454e = new i(16);
        this.f1455i = new ArrayList();
        this.f1456v = new int[2];
        this.f1457w = new int[2];
        this.O = new NestedScrollingParentHelper();
        int[] iArr = a.f20907a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        u0.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.E = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i7 = 0; i7 < length; i7++) {
                int[] iArr2 = this.E;
                iArr2[i7] = (int) (iArr2[i7] * f2);
            }
        }
        this.L = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        s();
        super.setOnHierarchyChangeListener(new com.reactnativecommunity.webview.b(this, 1));
        WeakHashMap weakHashMap = u0.f1729a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) T.acquire();
        return rect == null ? new Rect() : rect;
    }

    public static void f(int i7, Rect rect, Rect rect2, d dVar, int i10, int i11) {
        int iWidth;
        int iHeight;
        int i12 = dVar.f21327c;
        if (i12 == 0) {
            i12 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i7);
        int i13 = dVar.f21328d;
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        if ((i13 & 112) == 0) {
            i13 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i13, i7);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int i16 = absoluteGravity2 & 7;
        int i17 = absoluteGravity2 & 112;
        if (i16 != 1) {
            iWidth = i16 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i17 != 16) {
            iHeight = i17 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i14 == 1) {
            iWidth -= i10 / 2;
        } else if (i14 != 5) {
            iWidth -= i10;
        }
        if (i15 == 16) {
            iHeight -= i11 / 2;
        } else if (i15 != 80) {
            iHeight -= i11;
        }
        rect2.set(iWidth, iHeight, i10 + iWidth, i11 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d h(View view) {
        d dVar = (d) view.getLayoutParams();
        if (!dVar.f21326b) {
            if (view instanceof v0.a) {
                v0.b behavior = ((f) ((v0.a) view)).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                dVar.b(behavior);
                dVar.f21326b = true;
                return dVar;
            }
            c cVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                cVar = (c) superclass.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    dVar.b((v0.b) cVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            dVar.f21326b = true;
        }
        return dVar;
    }

    public static void q(int i7, View view) {
        d dVar = (d) view.getLayoutParams();
        int i10 = dVar.f21333i;
        if (i10 != i7) {
            WeakHashMap weakHashMap = u0.f1729a;
            view.offsetLeftAndRight(i7 - i10);
            dVar.f21333i = i7;
        }
    }

    public static void r(int i7, View view) {
        d dVar = (d) view.getLayoutParams();
        int i10 = dVar.j;
        if (i10 != i7) {
            WeakHashMap weakHashMap = u0.f1729a;
            view.offsetTopAndBottom(i7 - i10);
            dVar.j = i7;
        }
    }

    public final void b(d dVar, Rect rect, int i7, int i10) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i7) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i10) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin));
        rect.set(iMax, iMax2, i7 + iMax, i10 + iMax2);
    }

    public final void c(View view, Rect rect, boolean z5) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z5) {
            e(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    public final List d(View view) {
        SimpleArrayMap simpleArrayMap = (SimpleArrayMap) this.f1454e.f7981i;
        int i7 = simpleArrayMap.f1222i;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < i7; i10++) {
            ArrayList arrayList2 = (ArrayList) simpleArrayMap.i(i10);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(simpleArrayMap.f(i10));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        v0.b bVar = ((d) view.getLayoutParams()).f21325a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.L;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void e(View view, Rect rect) {
        ThreadLocal threadLocal = v0.f.f21340a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = v0.f.f21340a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        v0.f.a(this, view, matrix);
        ThreadLocal threadLocal3 = v0.f.f21341b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int g(int i7) {
        int[] iArr = this.E;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i7);
            return 0;
        }
        if (i7 >= 0 && i7 < iArr.length) {
            return iArr[i7];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i7 + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        o();
        return Collections.unmodifiableList(this.f1453d);
    }

    public final WindowInsetsCompat getLastWindowInsets() {
        return this.J;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.O;
        return nestedScrollingParentHelper.f1602b | nestedScrollingParentHelper.f1601a;
    }

    public Drawable getStatusBarBackground() {
        return this.L;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final boolean i(View view, int i7, int i10) {
        Pools$SynchronizedPool pools$SynchronizedPool = T;
        Rect rectA = a();
        e(view, rectA);
        try {
            return rectA.contains(i7, i10);
        } finally {
            rectA.setEmpty();
            pools$SynchronizedPool.release(rectA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    public final void j(int i7) {
        int i10;
        Rect rect;
        int i11;
        ArrayList arrayList;
        boolean zD;
        boolean z5;
        boolean z6;
        int width;
        int i12;
        int i13;
        int i14;
        int height;
        int i15;
        int i16;
        int i17;
        d dVar;
        int i18;
        View view;
        v0.b bVar;
        WeakHashMap weakHashMap = u0.f1729a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f1453d;
        int size = arrayList2.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        int i19 = 0;
        while (true) {
            Pools$SynchronizedPool pools$SynchronizedPool = T;
            if (i19 >= size) {
                Rect rect2 = rectA3;
                rectA.setEmpty();
                pools$SynchronizedPool.release(rectA);
                rectA2.setEmpty();
                pools$SynchronizedPool.release(rectA2);
                rect2.setEmpty();
                pools$SynchronizedPool.release(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i19);
            d dVar2 = (d) view2.getLayoutParams();
            if (i7 != 0 || view2.getVisibility() != 8) {
                int i20 = 0;
                while (i20 < i19) {
                    if (dVar2.f21334l == ((View) arrayList2.get(i20))) {
                        d dVar3 = (d) view2.getLayoutParams();
                        if (dVar3.k != null) {
                            Rect rectA4 = a();
                            Rect rectA5 = a();
                            d dVar4 = dVar2;
                            Rect rectA6 = a();
                            e(dVar3.k, rectA4);
                            c(view2, rectA5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            dVar = dVar4;
                            i18 = i20;
                            layoutDirection = layoutDirection;
                            view = view3;
                            f(layoutDirection, rectA4, rectA6, dVar3, measuredWidth, measuredHeight);
                            boolean z7 = (rectA6.left == rectA5.left && rectA6.top == rectA5.top) ? false : true;
                            b(dVar3, rectA6, measuredWidth, measuredHeight);
                            int i21 = rectA6.left - rectA5.left;
                            int i22 = rectA6.top - rectA5.top;
                            if (i21 != 0) {
                                WeakHashMap weakHashMap2 = u0.f1729a;
                                view.offsetLeftAndRight(i21);
                            }
                            if (i22 != 0) {
                                WeakHashMap weakHashMap3 = u0.f1729a;
                                view.offsetTopAndBottom(i22);
                            }
                            if (z7 && (bVar = dVar3.f21325a) != null) {
                                bVar.d(this, view, dVar3.k);
                            }
                            rectA4.setEmpty();
                            pools$SynchronizedPool.release(rectA4);
                            rectA5.setEmpty();
                            pools$SynchronizedPool.release(rectA5);
                            rectA6.setEmpty();
                            pools$SynchronizedPool.release(rectA6);
                        } else {
                            dVar = dVar2;
                            i18 = i20;
                            view = view2;
                        }
                    } else {
                        dVar = dVar2;
                        i18 = i20;
                        view = view2;
                    }
                    i20 = i18 + 1;
                    dVar2 = dVar;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i19 = i19;
                    rectA3 = rectA3;
                }
                ArrayList arrayList3 = arrayList2;
                d dVar5 = dVar2;
                int i23 = size;
                Rect rect3 = rectA3;
                i10 = i19;
                View view4 = view2;
                c(view4, rectA2, true);
                if (dVar5.f21331g != 0 && !rectA2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(dVar5.f21331g, layoutDirection);
                    int i24 = absoluteGravity & 112;
                    if (i24 == 48) {
                        rectA.top = Math.max(rectA.top, rectA2.bottom);
                    } else if (i24 == 80) {
                        rectA.bottom = Math.max(rectA.bottom, getHeight() - rectA2.top);
                    }
                    int i25 = absoluteGravity & 7;
                    if (i25 == 3) {
                        rectA.left = Math.max(rectA.left, rectA2.right);
                    } else if (i25 == 5) {
                        rectA.right = Math.max(rectA.right, getWidth() - rectA2.left);
                    }
                }
                if (dVar5.f21332h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = u0.f1729a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        d dVar6 = (d) view4.getLayoutParams();
                        v0.b bVar2 = dVar6.f21325a;
                        Rect rectA7 = a();
                        Rect rectA8 = a();
                        rectA8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (bVar2 == null || !bVar2.a(view4)) {
                            rectA7.set(rectA8);
                        } else if (!rectA8.contains(rectA7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA7.toShortString() + " | Bounds:" + rectA8.toShortString());
                        }
                        rectA8.setEmpty();
                        pools$SynchronizedPool.release(rectA8);
                        if (rectA7.isEmpty()) {
                            rectA7.setEmpty();
                            pools$SynchronizedPool.release(rectA7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(dVar6.f21332h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i16 = (rectA7.top - ((ViewGroup.MarginLayoutParams) dVar6).topMargin) - dVar6.j) >= (i17 = rectA.top)) {
                                z5 = false;
                            } else {
                                r(i17 - i16, view4);
                                z5 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectA7.bottom) - ((ViewGroup.MarginLayoutParams) dVar6).bottomMargin) + dVar6.j) < (i15 = rectA.bottom)) {
                                r(height - i15, view4);
                                z5 = true;
                            }
                            if (!z5) {
                                r(0, view4);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i13 = (rectA7.left - ((ViewGroup.MarginLayoutParams) dVar6).leftMargin) - dVar6.f21333i) >= (i14 = rectA.left)) {
                                z6 = false;
                            } else {
                                q(i14 - i13, view4);
                                z6 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectA7.right) - ((ViewGroup.MarginLayoutParams) dVar6).rightMargin) + dVar6.f21333i) < (i12 = rectA.right)) {
                                q(width - i12, view4);
                                z6 = true;
                            }
                            if (!z6) {
                                q(0, view4);
                            }
                            rectA7.setEmpty();
                            pools$SynchronizedPool.release(rectA7);
                        }
                    }
                }
                if (i7 != 2) {
                    rect = rect3;
                    rect.set(((d) view4.getLayoutParams()).f21338p);
                    if (rect.equals(rectA2)) {
                        arrayList = arrayList3;
                        i11 = i23;
                    } else {
                        ((d) view4.getLayoutParams()).f21338p.set(rectA2);
                    }
                } else {
                    rect = rect3;
                }
                int i26 = i10 + 1;
                i11 = i23;
                while (true) {
                    arrayList = arrayList3;
                    if (i26 >= i11) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i26);
                    d dVar7 = (d) view5.getLayoutParams();
                    v0.b bVar3 = dVar7.f21325a;
                    if (bVar3 != null && bVar3.b(view5, view4)) {
                        if (i7 == 0 && dVar7.f21337o) {
                            dVar7.f21337o = false;
                        } else {
                            if (i7 != 2) {
                                zD = bVar3.d(this, view5, view4);
                            } else {
                                bVar3.e(this, view4);
                                zD = true;
                            }
                            if (i7 == 1) {
                                dVar7.f21337o = zD;
                            }
                        }
                    }
                    i26++;
                    arrayList3 = arrayList;
                }
            } else {
                arrayList = arrayList2;
                i11 = size;
                rect = rectA3;
                i10 = i19;
            }
            i19 = i10 + 1;
            rectA3 = rect;
            size = i11;
            arrayList2 = arrayList;
        }
    }

    public final void k(int i7, View view) {
        int i10;
        d dVar = (d) view.getLayoutParams();
        View view2 = dVar.k;
        if (view2 == null && dVar.f21330f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        Pools$SynchronizedPool pools$SynchronizedPool = T;
        if (view2 != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            try {
                e(view2, rectA);
                d dVar2 = (d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                f(i7, rectA, rectA2, dVar2, measuredWidth, measuredHeight);
                b(dVar2, rectA2, measuredWidth, measuredHeight);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                rectA.setEmpty();
                pools$SynchronizedPool.release(rectA);
                rectA2.setEmpty();
                pools$SynchronizedPool.release(rectA2);
            }
        }
        int i11 = dVar.f21329e;
        if (i11 < 0) {
            d dVar3 = (d) view.getLayoutParams();
            Rect rectA3 = a();
            rectA3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin);
            if (this.J != null) {
                WeakHashMap weakHashMap = u0.f1729a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectA3.left = this.J.b() + rectA3.left;
                    rectA3.top = this.J.d() + rectA3.top;
                    rectA3.right -= this.J.c();
                    rectA3.bottom -= this.J.a();
                }
            }
            Rect rectA4 = a();
            int i12 = dVar3.f21327c;
            if ((i12 & 7) == 0) {
                i12 |= 8388611;
            }
            if ((i12 & 112) == 0) {
                i12 |= 48;
            }
            Gravity.apply(i12, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA3, rectA4, i7);
            view.layout(rectA4.left, rectA4.top, rectA4.right, rectA4.bottom);
            rectA3.setEmpty();
            pools$SynchronizedPool.release(rectA3);
            rectA4.setEmpty();
            pools$SynchronizedPool.release(rectA4);
            return;
        }
        d dVar4 = (d) view.getLayoutParams();
        int i13 = dVar4.f21327c;
        if (i13 == 0) {
            i13 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i7);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i7 == 1) {
            i11 = width - i11;
        }
        int iG = g(i11) - measuredWidth2;
        if (i14 == 1) {
            iG += measuredWidth2 / 2;
        } else if (i14 == 5) {
            iG += measuredWidth2;
        }
        if (i15 != 16) {
            i10 = i15 != 80 ? 0 : measuredHeight2;
        } else {
            i10 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin, Math.min(iG, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar4).topMargin, Math.min(i10, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final void l(int i7, int i10, int i11, View view) {
        measureChildWithMargins(view, i7, i10, i11, 0);
    }

    public final boolean m(v0.b bVar, View view, MotionEvent motionEvent, int i7) {
        if (i7 == 0) {
            return bVar.g(this, view, motionEvent);
        }
        if (i7 == 1) {
            return bVar.r(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    public final boolean n(MotionEvent motionEvent, int i7) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1455i;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        t tVar = S;
        if (tVar != null) {
            Collections.sort(arrayList, tVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zM = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList.get(i11);
            v0.b bVar = ((d) view.getLayoutParams()).f21325a;
            if (zM && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEventObtain == null) {
                        motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(3);
                    }
                    m(bVar, view, motionEventObtain, i7);
                }
            } else if (!zM && bVar != null && (zM = m(bVar, view, motionEvent, i7))) {
                this.F = view;
                if (actionMasked != 3 && actionMasked != 1) {
                    for (int i12 = 0; i12 < i11; i12++) {
                        View view2 = (View) arrayList.get(i12);
                        v0.b bVar2 = ((d) view2.getLayoutParams()).f21325a;
                        if (bVar2 != null) {
                            if (motionEventObtain == null) {
                                motionEventObtain = MotionEvent.obtain(motionEvent);
                                motionEventObtain.setAction(3);
                            }
                            m(bVar2, view2, motionEventObtain, i7);
                        }
                    }
                }
            }
        }
        arrayList.clear();
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        return zM;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0095
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void o() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.o():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        p();
        if (this.I) {
            if (this.H == null) {
                this.H = new b(1, this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.H);
        }
        if (this.J == null) {
            WeakHashMap weakHashMap = u0.f1729a;
            if (getFitsSystemWindows()) {
                j0.c(this);
            }
        }
        this.f1459y = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p();
        if (this.I && this.H != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.H);
        }
        View view = this.G;
        if (view != null) {
            onStopNestedScroll(view, 0);
        }
        this.f1459y = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.K || this.L == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.J;
        int iD = windowInsetsCompat != null ? windowInsetsCompat.d() : 0;
        if (iD > 0) {
            this.L.setBounds(0, 0, getWidth(), iD);
            this.L.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            p();
        }
        boolean zN = n(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zN;
        }
        this.F = null;
        p();
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        v0.b bVar;
        WeakHashMap weakHashMap = u0.f1729a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f1453d;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            if (view.getVisibility() != 8 && ((bVar = ((d) view.getLayoutParams()).f21325a) == null || !bVar.h(this, view, layoutDirection))) {
                k(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x012e  */
    /* JADX WARN: Code duplicated, block: B:73:0x015f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0169  */
    /* JADX WARN: Code duplicated, block: B:79:0x0188  */
    /* JADX WARN: Code duplicated, block: B:80:0x018b  */
    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z5;
        int i11;
        int i12;
        int i13;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        v0.b bVar;
        int i14;
        int i15;
        boolean z6;
        int i16;
        int i17;
        ArrayList arrayList;
        int i18;
        View view;
        int i19;
        boolean zI;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.o();
        int childCount = coordinatorLayout.getChildCount();
        int i20 = 0;
        loop0: while (true) {
            if (i20 >= childCount) {
                z5 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i20);
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) coordinatorLayout.f1454e.f7981i;
            int i21 = simpleArrayMap.f1222i;
            for (int i22 = 0; i22 < i21; i22++) {
                ArrayList arrayList2 = (ArrayList) simpleArrayMap.i(i22);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z5 = true;
                    break loop0;
                }
            }
            i20++;
        }
        if (z5 != coordinatorLayout.I) {
            if (z5) {
                if (coordinatorLayout.f1459y) {
                    if (coordinatorLayout.H == null) {
                        coordinatorLayout.H = new b(1, coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.H);
                }
                coordinatorLayout.I = true;
            } else {
                if (coordinatorLayout.f1459y && coordinatorLayout.H != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.H);
                }
                coordinatorLayout.I = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = u0.f1729a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z7 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int i23 = paddingLeft + paddingRight;
        int i24 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z10 = coordinatorLayout.J != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f1453d;
        int size3 = arrayList3.size();
        int i25 = 0;
        int iCombineMeasuredStates = 0;
        while (i25 < size3) {
            View view2 = (View) arrayList3.get(i25);
            int i26 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i12 = size3;
                i19 = i25;
                i14 = paddingLeft;
                suggestedMinimumWidth = i26;
                z6 = false;
                i16 = paddingRight;
            } else {
                d dVar = (d) view2.getLayoutParams();
                int i27 = dVar.f21329e;
                if (i27 < 0 || mode == 0) {
                    i11 = suggestedMinimumHeight;
                } else {
                    int iG = coordinatorLayout.g(i27);
                    int i28 = dVar.f21327c;
                    if (i28 == 0) {
                        i28 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i28, layoutDirection) & 7;
                    i11 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z7) && !(absoluteGravity == 5 && z7)) {
                        if ((absoluteGravity == 5 && !z7) || (absoluteGravity == 3 && z7)) {
                            iMax = Math.max(0, iG - paddingLeft);
                        }
                        if (z10 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i7;
                            iMakeMeasureSpec2 = i10;
                        } else {
                            int iC = coordinatorLayout.J.c() + coordinatorLayout.J.b();
                            int iA = coordinatorLayout.J.a() + coordinatorLayout.J.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        bVar = dVar.f21325a;
                        if (bVar != null) {
                            z6 = false;
                            i14 = paddingLeft;
                            i15 = i26;
                            i16 = paddingRight;
                            i17 = i11;
                            arrayList = arrayList3;
                            int i29 = iMakeMeasureSpec;
                            i19 = i25;
                            int i30 = iMakeMeasureSpec2;
                            zI = bVar.i(this, view2, i29, i13, i30);
                            view = view2;
                            iMakeMeasureSpec = i29;
                            i18 = i30;
                            if (zI) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i15, view.getMeasuredWidth() + i23 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                            int iMax3 = Math.max(i17, view.getMeasuredHeight() + i24 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            i14 = paddingLeft;
                            i15 = i26;
                            z6 = false;
                            i16 = paddingRight;
                            i17 = i11;
                            arrayList = arrayList3;
                            i18 = iMakeMeasureSpec2;
                            view = view2;
                            i19 = i25;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i13, i18, 0);
                        int iMax4 = Math.max(i15, view.getMeasuredWidth() + i23 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                        int iMax5 = Math.max(i17, view.getMeasuredHeight() + i24 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iG);
                    }
                    int i31 = size3;
                    i13 = iMax;
                    i12 = i31;
                    if (z10) {
                        iMakeMeasureSpec = i7;
                        iMakeMeasureSpec2 = i10;
                    } else {
                        iMakeMeasureSpec = i7;
                        iMakeMeasureSpec2 = i10;
                    }
                    bVar = dVar.f21325a;
                    if (bVar != null) {
                        z6 = false;
                        i14 = paddingLeft;
                        i15 = i26;
                        i16 = paddingRight;
                        i17 = i11;
                        arrayList = arrayList3;
                        int i210 = iMakeMeasureSpec;
                        i19 = i25;
                        int i32 = iMakeMeasureSpec2;
                        zI = bVar.i(this, view2, i210, i13, i32);
                        view = view2;
                        iMakeMeasureSpec = i210;
                        i18 = i32;
                        if (zI) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i15, view.getMeasuredWidth() + i23 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                        int iMax7 = Math.max(i17, view.getMeasuredHeight() + i24 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        i14 = paddingLeft;
                        i15 = i26;
                        z6 = false;
                        i16 = paddingRight;
                        i17 = i11;
                        arrayList = arrayList3;
                        i18 = iMakeMeasureSpec2;
                        view = view2;
                        i19 = i25;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i13, i18, 0);
                    int iMax8 = Math.max(i15, view.getMeasuredWidth() + i23 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                    int iMax9 = Math.max(i17, view.getMeasuredHeight() + i24 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i12 = size3;
                i13 = 0;
                if (z10) {
                    iMakeMeasureSpec = i7;
                    iMakeMeasureSpec2 = i10;
                } else {
                    iMakeMeasureSpec = i7;
                    iMakeMeasureSpec2 = i10;
                }
                bVar = dVar.f21325a;
                if (bVar != null) {
                    z6 = false;
                    i14 = paddingLeft;
                    i15 = i26;
                    i16 = paddingRight;
                    i17 = i11;
                    arrayList = arrayList3;
                    int i211 = iMakeMeasureSpec;
                    i19 = i25;
                    int i33 = iMakeMeasureSpec2;
                    zI = bVar.i(this, view2, i211, i13, i33);
                    view = view2;
                    iMakeMeasureSpec = i211;
                    i18 = i33;
                    if (zI) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i15, view.getMeasuredWidth() + i23 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                    int iMax11 = Math.max(i17, view.getMeasuredHeight() + i24 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    i14 = paddingLeft;
                    i15 = i26;
                    z6 = false;
                    i16 = paddingRight;
                    i17 = i11;
                    arrayList = arrayList3;
                    i18 = iMakeMeasureSpec2;
                    view = view2;
                    i19 = i25;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i13, i18, 0);
                int iMax12 = Math.max(i15, view.getMeasuredWidth() + i23 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                int iMax13 = Math.max(i17, view.getMeasuredHeight() + i24 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i25 = i19 + 1;
            paddingLeft = i14;
            paddingRight = i16;
            size3 = i12;
            arrayList3 = arrayList;
        }
        int i34 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i7, (-16777216) & i34), View.resolveSizeAndState(suggestedMinimumHeight, i10, i34 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f7, boolean z5) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    v0.b bVar = dVar.f21325a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f7) {
        v0.b bVar;
        int childCount = getChildCount();
        boolean zJ = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0) && (bVar = dVar.f21325a) != null) {
                    zJ |= bVar.j(view);
                }
            }
        }
        return zJ;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        onNestedPreScroll(view, i7, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        onNestedScroll(view, i7, i10, i11, i12, 0);
    }

    @Override // androidx.core.view.r
    public final void onNestedScrollAccepted(View view, View view2, int i7, int i10) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.O;
        if (i10 == 1) {
            nestedScrollingParentHelper.f1602b = i7;
        } else {
            nestedScrollingParentHelper.f1601a = i7;
        }
        this.G = view2;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ((d) getChildAt(i11).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.f7578d);
        SparseArray sparseArray = eVar.f21339i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id2 = childAt.getId();
            v0.b bVar = h(childAt).f21325a;
            if (id2 != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                bVar.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableO;
        e eVar = new e(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id2 = childAt.getId();
            v0.b bVar = ((d) childAt.getLayoutParams()).f21325a;
            if (id2 != -1 && bVar != null && (parcelableO = bVar.o(childAt)) != null) {
                sparseArray.append(id2, parcelableO);
            }
        }
        eVar.f21339i = sparseArray;
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        return onStartNestedScroll(view, view2, i7, 0);
    }

    @Override // androidx.core.view.r
    public final void onStopNestedScroll(View view, int i7) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.O;
        if (i7 == 1) {
            nestedScrollingParentHelper.f1602b = 0;
        } else {
            nestedScrollingParentHelper.f1601a = 0;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            d dVar = (d) childAt.getLayoutParams();
            if (dVar.a(i7)) {
                v0.b bVar = dVar.f21325a;
                if (bVar != null) {
                    bVar.q(this, childAt, view, i7);
                }
                if (i7 == 0) {
                    dVar.f21335m = false;
                } else if (i7 == 1) {
                    dVar.f21336n = false;
                }
                dVar.f21337o = false;
            }
        }
        this.G = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zN;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.F;
        boolean z5 = false;
        if (view != null) {
            v0.b bVar = ((d) view.getLayoutParams()).f21325a;
            zN = bVar != null ? bVar.r(this, this.F, motionEvent) : false;
        } else {
            zN = n(motionEvent, 1);
            if (actionMasked != 0 && zN) {
                z5 = true;
            }
        }
        if (this.F == null || actionMasked == 3) {
            zN |= super.onTouchEvent(motionEvent);
        } else if (z5) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            super.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zN;
        }
        this.F = null;
        p();
        return zN;
    }

    public final void p() {
        View view = this.F;
        if (view != null) {
            v0.b bVar = ((d) view.getLayoutParams()).f21325a;
            if (bVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                bVar.r(this, this.F, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.F = null;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ((d) getChildAt(i7).getLayoutParams()).getClass();
        }
        this.f1458x = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        v0.b bVar = ((d) view.getLayoutParams()).f21325a;
        if (bVar == null || !bVar.m(this, view, rect, z5)) {
            return super.requestChildRectangleOnScreen(view, rect, z5);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        super.requestDisallowInterceptTouchEvent(z5);
        if (!z5 || this.f1458x) {
            return;
        }
        if (this.F == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                v0.b bVar = ((d) childAt.getLayoutParams()).f21325a;
                if (bVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    bVar.g(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        p();
        this.f1458x = true;
    }

    public final void s() {
        WeakHashMap weakHashMap = u0.f1729a;
        if (!getFitsSystemWindows()) {
            l0.m(this, null);
            return;
        }
        if (this.N == null) {
            this.N = new m(3, this);
        }
        l0.m(this, this.N);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z5) {
        super.setFitsSystemWindows(z5);
        s();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.M = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.L;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.L = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.L.setState(getDrawableState());
                }
                Drawable drawable3 = this.L;
                WeakHashMap weakHashMap = u0.f1729a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.L.setVisible(getVisibility() == 0, false);
                this.L.setCallback(this);
            }
            WeakHashMap weakHashMap2 = u0.f1729a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i7) {
        setStatusBarBackground(new ColorDrawable(i7));
    }

    public void setStatusBarBackgroundResource(int i7) {
        setStatusBarBackground(i7 != 0 ? getContext().getDrawable(i7) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z5 = i7 == 0;
        Drawable drawable = this.L;
        if (drawable == null || drawable.isVisible() == z5) {
            return;
        }
        this.L.setVisible(z5, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.L;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            return new d((d) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    @Override // androidx.core.view.r
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr, int i11) {
        v0.b bVar;
        int childCount = getChildCount();
        boolean z5 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i11) && (bVar = dVar.f21325a) != null) {
                    int[] iArr2 = this.f1456v;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.k(this, childAt, view, i7, i10, iArr2, i11);
                    iMax = i7 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i10 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z5 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z5) {
            j(1);
        }
    }

    @Override // androidx.core.view.r
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i7, i10, i11, i12, 0, this.f1457w);
    }

    @Override // androidx.core.view.r
    public final boolean onStartNestedScroll(View view, View view2, int i7, int i10) {
        View view3;
        int i11;
        int i12;
        int childCount = getChildCount();
        int i13 = 0;
        boolean z5 = false;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                view3 = view;
                i11 = i7;
                i12 = i10;
            } else {
                d dVar = (d) childAt.getLayoutParams();
                v0.b bVar = dVar.f21325a;
                if (bVar != null) {
                    view3 = view;
                    i11 = i7;
                    i12 = i10;
                    boolean zP = bVar.p(this, childAt, view3, i11, i12);
                    z5 |= zP;
                    if (i12 == 0) {
                        dVar.f21335m = zP;
                    } else if (i12 == 1) {
                        dVar.f21336n = zP;
                    }
                } else {
                    view3 = view;
                    i11 = i7;
                    i12 = i10;
                    if (i12 == 0) {
                        dVar.f21335m = false;
                    } else if (i12 == 1) {
                        dVar.f21336n = false;
                    }
                }
            }
            i13++;
            view = view3;
            i7 = i11;
            i10 = i12;
        }
        return z5;
    }

    @Override // androidx.core.view.s
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        v0.b bVar;
        int childCount = getChildCount();
        int iMin = 0;
        int iMin2 = 0;
        boolean z5 = false;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i13) && (bVar = dVar.f21325a) != null) {
                    int[] iArr2 = this.f1456v;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.l(this, childAt, i10, i11, i12, iArr2);
                    if (i11 > 0) {
                        iMin = Math.max(iMin, iArr2[0]);
                    } else {
                        iMin = Math.min(iMin, iArr2[0]);
                    }
                    if (i12 > 0) {
                        iMin2 = Math.max(iMin2, iArr2[1]);
                    } else {
                        iMin2 = Math.min(iMin2, iArr2[1]);
                    }
                    z5 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMin;
        iArr[1] = iArr[1] + iMin2;
        if (z5) {
            j(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        onNestedScrollAccepted(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }
}
