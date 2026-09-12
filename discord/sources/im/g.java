package im;

import android.R;
import android.app.Activity;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.facebook.react.uimanager.ReactCompoundView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.x0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final PointF f11913p = new PointF();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float[] f11914q = new float[2];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Matrix f11915r = new Matrix();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float[] f11916s = new float[2];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final cl.b f11917t = new cl.b(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jm.n f11918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jm.k f11919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f11920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ga.l f11921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f11922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f11923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f11924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayDeque f11925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f11926i;
    public final SparseArray j;
    public final HashSet k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11927l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11928m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11929n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11930o;

    public g(jm.n wrapperView, jm.k handlerRegistry, i8.c viewConfigHelper, ViewGroup rootView, ga.l onJSResponderCancelListener) {
        Intrinsics.checkNotNullParameter(wrapperView, "wrapperView");
        Intrinsics.checkNotNullParameter(handlerRegistry, "handlerRegistry");
        Intrinsics.checkNotNullParameter(viewConfigHelper, "viewConfigHelper");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(onJSResponderCancelListener, "onJSResponderCancelListener");
        this.f11918a = wrapperView;
        this.f11919b = handlerRegistry;
        this.f11920c = rootView;
        this.f11921d = onJSResponderCancelListener;
        this.f11923f = new ArrayList();
        this.f11924g = new ArrayList();
        this.f11925h = new ArrayDeque();
        this.f11926i = new ArrayList();
        this.j = new SparseArray();
        this.k = new HashSet();
    }

    public static boolean i(f fVar, MotionEvent motionEvent) {
        return ((fVar instanceof h) || (fVar instanceof jm.l) || !jm.a.a(motionEvent)) ? false : true;
    }

    public final void a() {
        ArrayList arrayList = this.f11924g;
        for (f fVar : CollectionsKt.i0(arrayList)) {
            if (!fVar.M) {
                arrayList.remove(fVar);
                this.k.remove(Integer.valueOf(fVar.f11892d));
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f11923f;
        Iterator it = j0.y(arrayList).iterator();
        while (true) {
            ListIterator listIterator = ((x0) it).f14671d;
            if (!listIterator.hasPrevious()) {
                i0.s(arrayList, new f6.a(12));
                this.f11929n = false;
                return;
            }
            f fVar = (f) listIterator.previous();
            if (vi.d.e(fVar.f11896h) && !fVar.M) {
                fVar.f11894f = null;
                fVar.F = null;
                Arrays.fill(fVar.f11889a, -1);
                fVar.f11890b = 0;
                fVar.f11903q = 0;
                e[] eVarArr = fVar.f11904r;
                kotlin.collections.w.k(eVarArr, null, 0, eVarArr.length);
                fVar.f11902p = 0;
                fVar.B();
                fVar.L = false;
                fVar.M = false;
                fVar.K = Integer.MAX_VALUE;
            }
        }
    }

    public final boolean c(float[] fArr, View view, List list) {
        u uVarK;
        boolean z5;
        if (!j(view) && (uVarK = i8.c.k(view)) != u.f11966d) {
            if (!(view instanceof ViewGroup) || uVarK == u.f11968i) {
                z5 = false;
            } else {
                ViewGroup viewGroup = (ViewGroup) view;
                z5 = false;
                for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    Intrinsics.checkNotNull(childAt);
                    if (childAt.getVisibility() == 0 && childAt.getAlpha() >= this.f11922e) {
                        float f2 = fArr[0];
                        float f7 = fArr[1];
                        PointF pointF = f11913p;
                        vi.d.r(f2, f7, viewGroup, childAt, pointF);
                        if (!f(childAt) || vi.d.q(pointF.x, pointF.y, childAt)) {
                            float f10 = fArr[0];
                            float f11 = fArr[1];
                            fArr[0] = pointF.x;
                            fArr[1] = pointF.y;
                            boolean zC = c(fArr, childAt, list);
                            fArr[0] = f10;
                            fArr[1] = f11;
                            z5 = zC;
                            if (zC) {
                                break;
                            }
                        }
                    }
                }
            }
            boolean z6 = uVarK != u.f11967e && vi.d.q(fArr[0], fArr[1], view);
            if (z5 || z6) {
                if (!list.contains(view)) {
                    list.add(view);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v37, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final void d(f fVar, MotionEvent sourceEvent) {
        int i7;
        int i10;
        int i11;
        int i12;
        ?? r5;
        ?? r7;
        ViewGroup viewGroup;
        jm.f fVar2;
        View view = fVar.f11894f;
        int[] iArr = fVar.f11889a;
        View view2 = view;
        if (view == null) {
            fVar2 = fVar.f11895g;
        }
        if (view2 != null) {
            jm.n nVar = this.f11918a;
            if (view2 != nVar) {
                while (true) {
                    view2 = fVar2;
                    r5 = view2;
                    ViewParent parent = r5.getParent();
                    if (parent instanceof ViewGroup) {
                        viewGroup = (ViewGroup) parent;
                    } else {
                        r7 = 0;
                    }
                    if (r7 == 0 || r7.indexOfChild(r5) < 0) {
                        r7 = viewGroup;
                    } else if (r7 == nVar) {
                        break;
                    } else {
                        r5 = r7;
                    }
                }
            }
            view2 = fVar2;
            r5 = view2;
            Intrinsics.checkNotNullParameter(sourceEvent, "event");
            if (!fVar.f11898l || (i7 = fVar.f11896h) == 1) {
                return;
            }
            int i13 = 3;
            if (i7 == 3 || i7 == 5) {
                return;
            }
            if (sourceEvent.getActionMasked() == 2) {
                int pointerCount = sourceEvent.getPointerCount();
                for (int i14 = 0; i14 < pointerCount; i14++) {
                    if (iArr[sourceEvent.getPointerId(i14)] == -1) {
                    }
                }
                return;
            }
            if (iArr[sourceEvent.getPointerId(sourceEvent.getActionIndex())] == -1) {
                return;
            }
            int actionMasked = sourceEvent.getActionMasked();
            View viewO = fVar.o();
            MotionEvent transformedEvent = MotionEvent.obtain(sourceEvent);
            Intrinsics.checkNotNullExpressionValue(transformedEvent, "obtain(...)");
            k(viewO, transformedEvent);
            if (fVar.f11905s) {
                int[] iArr2 = fVar.f11891c;
                i10 = 0;
                e[] eVarArr = fVar.f11904r;
                Intrinsics.checkNotNullParameter(transformedEvent, "event");
                Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
                if (transformedEvent.getActionMasked() == 0 || transformedEvent.getActionMasked() == 5) {
                    fVar.f11900n = null;
                    fVar.f11902p = 1;
                    int pointerId = transformedEvent.getPointerId(transformedEvent.getActionIndex());
                    e eVar = new e(transformedEvent.getX(transformedEvent.getActionIndex()), transformedEvent.getY(transformedEvent.getActionIndex()), (sourceEvent.getX(transformedEvent.getActionIndex()) + (sourceEvent.getRawX() - sourceEvent.getX())) - iArr2[0], (sourceEvent.getY(transformedEvent.getActionIndex()) + (sourceEvent.getRawY() - sourceEvent.getY())) - iArr2[1], pointerId);
                    eVarArr[pointerId] = eVar;
                    fVar.f11903q++;
                    Intrinsics.checkNotNull(eVar);
                    fVar.c(eVar);
                    fVar.l();
                    fVar.i();
                    fVar.j(transformedEvent, sourceEvent);
                } else if (transformedEvent.getActionMasked() == 1 || transformedEvent.getActionMasked() == 6) {
                    fVar.j(transformedEvent, sourceEvent);
                    fVar.l();
                    fVar.f11900n = null;
                    fVar.f11902p = 3;
                    int pointerId2 = transformedEvent.getPointerId(transformedEvent.getActionIndex());
                    e eVar2 = new e(transformedEvent.getX(transformedEvent.getActionIndex()), transformedEvent.getY(transformedEvent.getActionIndex()), (sourceEvent.getX(transformedEvent.getActionIndex()) + (sourceEvent.getRawX() - sourceEvent.getX())) - iArr2[0], (sourceEvent.getY(transformedEvent.getActionIndex()) + (sourceEvent.getRawY() - sourceEvent.getY())) - iArr2[1], pointerId2);
                    eVarArr[pointerId2] = eVar2;
                    Intrinsics.checkNotNull(eVar2);
                    fVar.c(eVar2);
                    eVarArr[pointerId2] = null;
                    fVar.f11903q--;
                    fVar.i();
                } else if (transformedEvent.getActionMasked() == 2) {
                    fVar.j(transformedEvent, sourceEvent);
                }
            } else {
                i10 = 0;
            }
            if (!fVar.M || actionMasked != 2) {
                Intrinsics.checkNotNullParameter(transformedEvent, "transformedEvent");
                Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
                if (fVar.f11898l && (i11 = fVar.f11896h) != 3 && i11 != 1 && i11 != 5 && fVar.f11890b >= 1) {
                    try {
                        MotionEvent[] motionEventArr = {fVar.b(transformedEvent), fVar.b(sourceEvent)};
                        MotionEvent motionEvent = motionEventArr[i10];
                        MotionEvent motionEvent2 = motionEventArr[1];
                        fVar.D = motionEvent.getActionMasked() == 6 ? motionEvent.getPointerCount() - 1 : motionEvent.getPointerCount();
                        fVar.f11897i = motionEvent.getX();
                        fVar.j = motionEvent.getY();
                        boolean zU = fVar.u(fVar.f11897i, fVar.j, fVar.o());
                        fVar.k = zU;
                        if (fVar.E && !zU && ((i12 = fVar.f11896h) == 4 || i12 == 2)) {
                            fVar.m();
                        } else {
                            fVar.f11911y = e4.f.A(motionEvent, true);
                            fVar.f11912z = e4.f.B(motionEvent, true);
                            fVar.B = motionEvent.getRawX() - motionEvent.getX();
                            fVar.C = motionEvent.getRawY() - motionEvent.getY();
                            if (sourceEvent.getAction() == 0 || sourceEvent.getAction() == 9 || sourceEvent.getAction() == 7) {
                                int toolType = sourceEvent.getToolType(sourceEvent.getActionIndex());
                                if (toolType == 1) {
                                    i13 = i10;
                                } else if (toolType == 2) {
                                    i13 = 1;
                                } else if (toolType == 3) {
                                    i13 = 2;
                                }
                                fVar.I = i13;
                            }
                            if (jm.a.a(sourceEvent)) {
                                fVar.z(motionEvent, motionEvent2);
                            } else {
                                fVar.y(motionEvent, motionEvent2);
                            }
                            if (!Intrinsics.areEqual(motionEvent, transformedEvent)) {
                                motionEvent.recycle();
                            }
                            if (!Intrinsics.areEqual(motionEvent2, sourceEvent)) {
                                motionEvent2.recycle();
                            }
                        }
                    } catch (d unused) {
                        fVar.m();
                    }
                }
                if (fVar.L) {
                    if (fVar.N) {
                        fVar.N = i10;
                        fVar.E();
                    }
                    fVar.g(transformedEvent);
                }
                if (actionMasked == 1 || actionMasked == 6 || actionMasked == 10) {
                    int pointerId3 = transformedEvent.getPointerId(transformedEvent.getActionIndex());
                    if (iArr[pointerId3] != -1) {
                        iArr[pointerId3] = -1;
                        fVar.f11890b--;
                    }
                }
            }
            transformedEvent.recycle();
            return;
        }
        view2 = fVar2;
        fVar.e();
    }

    public final boolean e(ViewGroup viewGroup, float[] fArr, int i7, MotionEvent motionEvent) {
        if (!j(viewGroup)) {
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                Intrinsics.checkNotNull(childAt);
                if (childAt.getVisibility() == 0 && childAt.getAlpha() >= this.f11922e) {
                    float f2 = fArr[0];
                    float f7 = fArr[1];
                    PointF pointF = f11913p;
                    vi.d.r(f2, f7, viewGroup, childAt, pointF);
                    float f10 = fArr[0];
                    float f11 = fArr[1];
                    fArr[0] = pointF.x;
                    fArr[1] = pointF.y;
                    boolean zM = (!f(childAt) || vi.d.q(fArr[0], fArr[1], childAt)) ? m(childAt, fArr, i7, motionEvent) : false;
                    fArr[0] = f10;
                    fArr[1] = f11;
                    if (zM) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0013  */
    public final boolean f(View view) {
        boolean zAreEqual;
        if (view instanceof ViewGroup) {
            ViewGroup view2 = (ViewGroup) view;
            Intrinsics.checkNotNullParameter(view2, "view");
            if (view2.getClipChildren()) {
                zAreEqual = true;
            } else if (!(view2 instanceof ReactScrollView)) {
                if (view2 instanceof ReactHorizontalScrollView) {
                    if (!Intrinsics.areEqual(((ReactHorizontalScrollView) view2).getOverflow(), ViewProps.VISIBLE)) {
                        zAreEqual = true;
                    }
                } else if (view2 instanceof ReactViewGroup) {
                    zAreEqual = Intrinsics.areEqual(((ReactViewGroup) view2).getOverflow(), ViewProps.HIDDEN);
                }
                zAreEqual = false;
            } else if (Intrinsics.areEqual(((ReactScrollView) view2).getOverflow(), ViewProps.VISIBLE)) {
                zAreEqual = false;
            } else {
                zAreEqual = true;
            }
            if (!zAreEqual) {
                return false;
            }
        }
        return true;
    }

    public final void g(f handler, View view) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        ArrayList arrayList = this.f11923f;
        if (arrayList.contains(handler)) {
            return;
        }
        handler.L = false;
        handler.M = false;
        handler.K = Integer.MAX_VALUE;
        int[] iArr = handler.f11891c;
        if (handler.f11894f != null || handler.F != null) {
            throw new IllegalStateException("Already prepared or hasn't been reset");
        }
        Arrays.fill(handler.f11889a, -1);
        handler.f11890b = 0;
        handler.f11896h = 0;
        handler.f11894f = view;
        handler.F = this;
        Activity activityN = f.n(view != null ? view.getContext() : null);
        View viewFindViewById = activityN != null ? activityN.findViewById(R.id.content) : null;
        if (viewFindViewById != null) {
            viewFindViewById.getLocationOnScreen(iArr);
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        handler.A();
        if (!handler.H(arrayList)) {
            handler.e();
        }
        arrayList.add(handler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h(View view, float[] fArr, int i7, MotionEvent motionEvent, boolean z5) {
        float f2;
        View view2;
        boolean z6;
        ArrayList arrayList;
        float f7 = fArr[0];
        float f10 = fArr[1];
        if (z5) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.swmansion.gesturehandler.react.RNGestureHandlerDetectorView");
            View childAt = ((jm.f) view).getChildAt(0);
            PointF pointF = f11913p;
            Intrinsics.checkNotNull(childAt);
            vi.d.r(fArr[0], fArr[1], (ViewGroup) view, childAt, pointF);
            f2 = pointF.x;
            f10 = pointF.y;
            view2 = childAt;
        } else {
            f2 = f7;
            view2 = view;
        }
        ArrayList arrayListG = this.f11919b.g(view);
        if (arrayListG != null) {
            synchronized (arrayListG) {
                try {
                    Iterator it = arrayListG.iterator();
                    Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                    z6 = false;
                    while (it.hasNext()) {
                        f fVar = (f) it.next();
                        if (fVar.f11898l && fVar.u(f2, f10, view2) && !i(fVar, motionEvent)) {
                            g(fVar, view);
                            fVar.L(i7);
                            z6 = true;
                        }
                    }
                    Unit unit = Unit.f14616a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            z6 = false;
        }
        float width = view.getWidth();
        float f11 = fArr[0];
        Integer numValueOf = null;
        if (0.0f <= f11 && f11 <= width) {
            float height = view.getHeight();
            float f12 = fArr[1];
            if (0.0f <= f12 && f12 <= height) {
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    Matrix matrix = view.getMatrix();
                    float[] fArr2 = f11914q;
                    fArr2[0] = 0.0f;
                    fArr2[1] = 0.0f;
                    matrix.mapPoints(fArr2);
                    float left = fArr2[0] + view.getLeft();
                    float top = fArr2[1] + view.getTop();
                    if (left < 0.0f || left + view.getWidth() > viewGroup.getWidth() || top < 0.0f || top + view.getHeight() > viewGroup.getHeight()) {
                        boolean z7 = false;
                        for (ViewParent parent2 = view.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 instanceof ViewGroup) {
                                if ((parent2 instanceof jm.n) && ((jm.n) parent2).f13970e) {
                                    break;
                                }
                                View view3 = (ViewGroup) parent2;
                                ArrayList arrayListG2 = this.f11919b.g((View) parent2);
                                if (arrayListG2 != null) {
                                    synchronized (arrayListG2) {
                                        try {
                                            Iterator it2 = arrayListG2.iterator();
                                            Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
                                            while (it2.hasNext()) {
                                                f fVar2 = (f) it2.next();
                                                if (!i(fVar2, motionEvent) && fVar2.f11898l && fVar2.u(fArr[0], fArr[1], view)) {
                                                    g(fVar2, view3);
                                                    fVar2.L(i7);
                                                    z7 = true;
                                                }
                                            }
                                            Unit unit2 = Unit.f14616a;
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        if (z7) {
                            z6 = true;
                        }
                    }
                }
            }
        }
        if (view instanceof ReactCompoundView) {
            try {
                numValueOf = Integer.valueOf(((ReactCompoundView) view).reactTagForTouch(fArr[0], fArr[1]));
            } catch (IllegalStateException unused) {
            }
            if (numValueOf != null) {
                if (numValueOf.intValue() != view.getId()) {
                    jm.k kVar = this.f11919b;
                    int iIntValue = numValueOf.intValue();
                    synchronized (kVar) {
                        arrayList = (ArrayList) kVar.f13958c.get(iIntValue);
                    }
                    if (arrayList != null) {
                        synchronized (arrayList) {
                            try {
                                Iterator it3 = arrayList.iterator();
                                Intrinsics.checkNotNullExpressionValue(it3, "iterator(...)");
                                while (it3.hasNext()) {
                                    f fVar3 = (f) it3.next();
                                    if (!i(fVar3, motionEvent)) {
                                        g(fVar3, view);
                                        fVar3.L(i7);
                                        z6 = true;
                                    }
                                }
                                Unit unit3 = Unit.f14616a;
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                }
            }
        }
        return z6;
    }

    public final boolean j(View view) {
        return (view instanceof jm.n) && !Intrinsics.areEqual(view, this.f11918a) && ((jm.n) view).f13970e;
    }

    public final void k(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (!Intrinsics.areEqual(viewGroup, this.f11918a)) {
            k(viewGroup, event);
        }
        if (viewGroup != null) {
            event.setLocation((event.getX() + viewGroup.getScrollX()) - view.getLeft(), (event.getY() + viewGroup.getScrollY()) - view.getTop());
        }
        if (view.getMatrix().isIdentity()) {
            return;
        }
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = f11915r;
        matrix.invert(matrix2);
        event.transform(matrix2);
    }

    public final void l(View view, PointF point) {
        Intrinsics.checkNotNullParameter(point, "point");
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (!Intrinsics.areEqual(viewGroup, this.f11918a)) {
            l(viewGroup, point);
        }
        if (viewGroup != null) {
            point.x += viewGroup.getScrollX() - view.getLeft();
            point.y += viewGroup.getScrollY() - view.getTop();
        }
        if (view.getMatrix().isIdentity()) {
            return;
        }
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = f11915r;
        matrix.invert(matrix2);
        float f2 = point.x;
        float[] fArr = f11916s;
        fArr[0] = f2;
        fArr[1] = point.y;
        matrix2.mapPoints(fArr);
        point.x = fArr[0];
        point.y = fArr[1];
    }

    public final boolean m(View view, float[] fArr, int i7, MotionEvent motionEvent) {
        int iOrdinal;
        if (!j(view) && (iOrdinal = i8.c.k(view).ordinal()) != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new rn.n();
                    }
                    boolean zE = view instanceof ViewGroup ? e((ViewGroup) view, fArr, i7, motionEvent) : false;
                    if (h(view, fArr, i7, motionEvent, false) || zE || vi.d.l(fArr, view)) {
                        return true;
                    }
                } else if (h(view, fArr, i7, motionEvent, false) || vi.d.l(fArr, view)) {
                    return true;
                }
            } else {
                if (view instanceof ViewGroup) {
                    boolean zE2 = e((ViewGroup) view, fArr, i7, motionEvent);
                    if (zE2) {
                        h(view, fArr, i7, motionEvent, false);
                        return zE2;
                    }
                    if (view instanceof jm.f) {
                        h(view, fArr, i7, motionEvent, ((jm.f) view).getChildCount() == 1);
                    }
                    return zE2;
                }
                if (view instanceof EditText) {
                    return h(view, fArr, i7, motionEvent, false);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012f A[EDGE_INSN: B:101:0x012f->B:78:0x012f BREAK  A[LOOP:1: B:73:0x0115->B:103:0x0115], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x009f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0039 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:75:0x0120  */
    /* JADX WARN: Code duplicated, block: B:84:0x013b  */
    /* JADX WARN: Code duplicated, block: B:86:0x015a  */
    /* JADX WARN: Code duplicated, block: B:90:0x016c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0171  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d A[EDGE_INSN: B:96:0x010d->B:72:0x010d BREAK  A[LOOP:0: B:67:0x00f2->B:98:0x00f2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0076, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(im.f r18) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.g.n(im.f):void");
    }
}
