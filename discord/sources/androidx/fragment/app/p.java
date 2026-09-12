package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final class p extends w1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x1 f2215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x1 f2216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t1 f2217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f2218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f2219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f2220i;
    public final s.e j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f2221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s.e f2222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s.e f2223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2224o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f1.b f2225p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f2226q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2227r;

    public p(ArrayList transitionInfos, x1 x1Var, x1 x1Var2, t1 transitionImpl, Object obj, ArrayList sharedElementFirstOutViews, ArrayList sharedElementLastInViews, s.e sharedElementNameMapping, ArrayList enteringNames, ArrayList exitingNames, s.e firstOutViews, s.e lastInViews, boolean z5) {
        Intrinsics.checkNotNullParameter(transitionInfos, "transitionInfos");
        Intrinsics.checkNotNullParameter(transitionImpl, "transitionImpl");
        Intrinsics.checkNotNullParameter(sharedElementFirstOutViews, "sharedElementFirstOutViews");
        Intrinsics.checkNotNullParameter(sharedElementLastInViews, "sharedElementLastInViews");
        Intrinsics.checkNotNullParameter(sharedElementNameMapping, "sharedElementNameMapping");
        Intrinsics.checkNotNullParameter(enteringNames, "enteringNames");
        Intrinsics.checkNotNullParameter(exitingNames, "exitingNames");
        Intrinsics.checkNotNullParameter(firstOutViews, "firstOutViews");
        Intrinsics.checkNotNullParameter(lastInViews, "lastInViews");
        this.f2214c = transitionInfos;
        this.f2215d = x1Var;
        this.f2216e = x1Var2;
        this.f2217f = transitionImpl;
        this.f2218g = obj;
        this.f2219h = sharedElementFirstOutViews;
        this.f2220i = sharedElementLastInViews;
        this.j = sharedElementNameMapping;
        this.k = enteringNames;
        this.f2221l = exitingNames;
        this.f2222m = firstOutViews;
        this.f2223n = lastInViews;
        this.f2224o = z5;
        this.f2225p = new f1.b();
    }

    public static void f(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i7 = androidx.core.view.w0.f1739a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View child = viewGroup.getChildAt(i10);
            if (child.getVisibility() == 0) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                f(child, arrayList);
            }
        }
    }

    @Override // androidx.fragment.app.w1
    public final boolean a() {
        Object obj;
        t1 t1Var = this.f2217f;
        if (!t1Var.l()) {
            return false;
        }
        ArrayList<q> arrayList = this.f2214c;
        if (!arrayList.isEmpty()) {
            for (q qVar : arrayList) {
                if (Build.VERSION.SDK_INT < 34 || (obj = qVar.f2235b) == null || !t1Var.m(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.f2218g;
        return obj2 == null || t1Var.m(obj2);
    }

    @Override // androidx.fragment.app.w1
    public final void b(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f2225p.a();
    }

    @Override // androidx.fragment.app.w1
    public final void c(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        boolean zIsLaidOut = container.isLaidOut();
        ArrayList<q> arrayList = this.f2214c;
        if (!zIsLaidOut || this.f2227r) {
            for (q qVar : arrayList) {
                x1 x1Var = qVar.f2178a;
                if (FragmentManager.M(2)) {
                    if (this.f2227r) {
                        Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + x1Var);
                    } else {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + x1Var);
                    }
                }
                qVar.f2178a.c(this);
            }
            this.f2227r = false;
            return;
        }
        Object obj = this.f2226q;
        t1 t1Var = this.f2217f;
        x1 x1Var2 = this.f2216e;
        x1 x1Var3 = this.f2215d;
        if (obj != null) {
            Intrinsics.checkNotNull(obj);
            t1Var.c(obj);
            if (FragmentManager.M(2)) {
                Log.v("FragmentManager", "Ending execution of operations from " + x1Var3 + " to " + x1Var2);
                return;
            }
            return;
        }
        Pair pairG = g(container, x1Var2, x1Var3);
        ArrayList arrayList2 = (ArrayList) pairG.f14612d;
        Object obj2 = pairG.f14613e;
        ArrayList<x1> arrayList3 = new ArrayList(kotlin.collections.e0.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((q) it.next()).f2178a);
        }
        for (x1 x1Var4 : arrayList3) {
            t1Var.u(x1Var4.f2274c, obj2, this.f2225p, new m(x1Var4, this, 1));
        }
        i(arrayList2, container, new n(this, container, obj2));
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + x1Var3 + " to " + x1Var2);
        }
    }

    @Override // androidx.fragment.app.w1
    public final void d(BackEventCompat backEvent, ViewGroup container) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Intrinsics.checkNotNullParameter(container, "container");
        Object obj = this.f2226q;
        if (obj != null) {
            this.f2217f.r(obj, backEvent.f699c);
        }
    }

    @Override // androidx.fragment.app.w1
    public final void e(ViewGroup container) {
        Object obj;
        Intrinsics.checkNotNullParameter(container, "container");
        boolean zIsLaidOut = container.isLaidOut();
        ArrayList arrayList = this.f2214c;
        if (!zIsLaidOut) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                x1 x1Var = ((q) it.next()).f2178a;
                if (FragmentManager.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + x1Var);
                }
            }
            return;
        }
        boolean zH = h();
        x1 x1Var2 = this.f2216e;
        x1 x1Var3 = this.f2215d;
        if (zH && (obj = this.f2218g) != null && !a()) {
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + x1Var3 + " and " + x1Var2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        if (a() && h()) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Pair pairG = g(container, x1Var2, x1Var3);
            ArrayList arrayList2 = (ArrayList) pairG.f14612d;
            Object obj2 = pairG.f14613e;
            ArrayList<x1> arrayList3 = new ArrayList(kotlin.collections.e0.l(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((q) it2.next()).f2178a);
            }
            for (x1 x1Var4 : arrayList3) {
                x xVar = new x(1, objectRef);
                Fragment fragment = x1Var4.f2274c;
                this.f2217f.v(obj2, this.f2225p, xVar, new m(x1Var4, this, 0));
            }
            i(arrayList2, container, new o(this, container, obj2, objectRef));
        }
    }

    public final Pair g(ViewGroup viewGroup, x1 x1Var, x1 x1Var2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        t1 t1Var;
        Object obj2;
        ArrayList arrayList3;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        ArrayList arrayList4 = this.f2214c;
        Iterator it = arrayList4.iterator();
        View view2 = null;
        boolean z5 = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f2220i;
            arrayList2 = this.f2219h;
            obj = this.f2218g;
            t1Var = this.f2217f;
            if (!zHasNext) {
                break;
            }
            if (((q) it.next()).f2237d != null && x1Var2 != null && x1Var != null && !this.j.isEmpty() && obj != null) {
                Fragment fragment = x1Var.f2274c;
                Fragment fragment2 = x1Var2.f2274c;
                boolean z6 = this.f2224o;
                s.e eVar = this.f2222m;
                m1.a(fragment, fragment2, z6, eVar);
                androidx.core.view.w.a(viewGroup, new ac.a(x1Var, x1Var2, this, 2));
                arrayList2.addAll(eVar.values());
                ArrayList arrayList5 = this.f2221l;
                if (!arrayList5.isEmpty()) {
                    Object obj3 = arrayList5.get(0);
                    Intrinsics.checkNotNullExpressionValue(obj3, "exitingNames[0]");
                    View view3 = (View) eVar.get((String) obj3);
                    t1Var.s(view3, obj);
                    view2 = view3;
                }
                s.e eVar2 = this.f2223n;
                arrayList.addAll(eVar2.values());
                ArrayList arrayList6 = this.k;
                if (!arrayList6.isEmpty()) {
                    Object obj4 = arrayList6.get(0);
                    Intrinsics.checkNotNullExpressionValue(obj4, "enteringNames[0]");
                    View view4 = (View) eVar2.get((String) obj4);
                    if (view4 != null) {
                        androidx.core.view.w.a(viewGroup, new ac.a(t1Var, view4, rect, 3));
                        z5 = true;
                    }
                }
                t1Var.w(obj, view, arrayList2);
                Object obj5 = this.f2218g;
                t1Var.q(obj5, null, null, obj5, arrayList);
            }
            arrayList4 = arrayList4;
            it = it;
        }
        ArrayList arrayList7 = arrayList4;
        ArrayList arrayList8 = arrayList;
        ArrayList arrayList9 = new ArrayList();
        Iterator it2 = arrayList7.iterator();
        Object objO = null;
        Object objO2 = null;
        while (it2.hasNext()) {
            arrayList8 = arrayList8;
            q qVar = (q) it2.next();
            it2 = it2;
            x1 x1Var3 = qVar.f2178a;
            z5 = z5;
            Object objH = t1Var.h(qVar.f2235b);
            if (objH != null) {
                ArrayList arrayList10 = arrayList2;
                ArrayList arrayList11 = new ArrayList();
                Object obj6 = obj;
                Fragment fragment3 = x1Var3.f2274c;
                Object obj7 = objO2;
                View view5 = fragment3.mView;
                Object obj8 = objO;
                Intrinsics.checkNotNullExpressionValue(view5, "operation.fragment.mView");
                f(view5, arrayList11);
                if (obj6 != null && (x1Var3 == x1Var2 || x1Var3 == x1Var)) {
                    if (x1Var3 == x1Var2) {
                        arrayList11.removeAll(CollectionsKt.l0(arrayList10));
                    } else {
                        arrayList11.removeAll(CollectionsKt.l0(arrayList8));
                    }
                }
                if (arrayList11.isEmpty()) {
                    t1Var.a(view, objH);
                    obj2 = objH;
                    arrayList3 = arrayList11;
                } else {
                    t1Var.b(objH, arrayList11);
                    t1Var.q(objH, objH, arrayList11, null, null);
                    obj2 = objH;
                    arrayList3 = arrayList11;
                    if (x1Var3.f2272a == z1.f2291i) {
                        x1Var3.f2280i = false;
                        ArrayList arrayList12 = new ArrayList(arrayList3);
                        arrayList12.remove(fragment3.mView);
                        t1Var.p(obj2, fragment3.mView, arrayList12);
                        androidx.core.view.w.a(viewGroup, new x(2, arrayList3));
                    }
                }
                if (x1Var3.f2272a == z1.f2290e) {
                    arrayList9.addAll(arrayList3);
                    if (z5) {
                        t1Var.t(obj2, rect);
                    }
                    if (FragmentManager.M(2)) {
                        Log.v("FragmentManager", "Entering Transition: " + obj2);
                        Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                        for (Object transitioningViews : arrayList3) {
                            Intrinsics.checkNotNullExpressionValue(transitioningViews, "transitioningViews");
                            Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                        }
                    }
                } else {
                    t1Var.s(view2, obj2);
                    if (FragmentManager.M(2)) {
                        Log.v("FragmentManager", "Exiting Transition: " + obj2);
                        Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                        for (Object transitioningViews2 : arrayList3) {
                            Intrinsics.checkNotNullExpressionValue(transitioningViews2, "transitioningViews");
                            Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                        }
                    }
                }
                if (qVar.f2236c) {
                    objO = t1Var.o(obj8, obj2);
                    arrayList2 = arrayList10;
                    obj = obj6;
                    objO2 = obj7;
                } else {
                    objO2 = t1Var.o(obj7, obj2);
                    objO = obj8;
                    arrayList2 = arrayList10;
                    obj = obj6;
                }
            }
        }
        Object objN = t1Var.n(objO, objO2, obj);
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "Final merged transition: " + objN + " for container " + viewGroup);
        }
        return new Pair(arrayList9, objN);
    }

    public final boolean h() {
        ArrayList arrayList = this.f2214c;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((q) it.next()).f2178a.f2274c.mTransitioning) {
                return false;
            }
        }
        return true;
    }

    public final void i(ArrayList arrayList, ViewGroup viewGroup, Function0 function0) {
        m1.c(4, arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f2220i;
        int size = arrayList3.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) arrayList3.get(i7);
            WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
            arrayList2.add(androidx.core.view.l0.f(view));
            androidx.core.view.l0.n(view, null);
        }
        boolean zM = FragmentManager.M(2);
        ArrayList arrayList4 = this.f2219h;
        if (zM) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            for (Object sharedElementFirstOutViews : arrayList4) {
                Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view2 = (View) sharedElementFirstOutViews;
                StringBuilder sb2 = new StringBuilder("View: ");
                sb2.append(view2);
                sb2.append(" Name: ");
                WeakHashMap weakHashMap2 = androidx.core.view.u0.f1729a;
                sb2.append(androidx.core.view.l0.f(view2));
                Log.v("FragmentManager", sb2.toString());
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            for (Object sharedElementLastInViews : arrayList3) {
                Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                View view3 = (View) sharedElementLastInViews;
                StringBuilder sb3 = new StringBuilder("View: ");
                sb3.append(view3);
                sb3.append(" Name: ");
                WeakHashMap weakHashMap3 = androidx.core.view.u0.f1729a;
                sb3.append(androidx.core.view.l0.f(view3));
                Log.v("FragmentManager", sb3.toString());
            }
        }
        function0.invoke();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i10 = 0; i10 < size2; i10++) {
            View view4 = (View) arrayList4.get(i10);
            WeakHashMap weakHashMap4 = androidx.core.view.u0.f1729a;
            String strF = androidx.core.view.l0.f(view4);
            arrayList5.add(strF);
            if (strF != null) {
                androidx.core.view.l0.n(view4, null);
                String str = (String) this.j.get(strF);
                for (int i11 = 0; i11 < size2; i11++) {
                    if (str.equals(arrayList2.get(i11))) {
                        androidx.core.view.l0.n((View) arrayList3.get(i11), strF);
                        break;
                    }
                }
            }
        }
        androidx.core.view.w.a(viewGroup, new s1(size2, arrayList3, arrayList2, arrayList4, arrayList5));
        m1.c(0, arrayList);
        this.f2217f.x(this.f2218g, arrayList4, arrayList3);
    }
}
