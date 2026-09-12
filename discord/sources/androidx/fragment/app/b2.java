package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.discord.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f2102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2107f;

    public b2(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f2102a = container;
        this.f2103b = new ArrayList();
        this.f2104c = new ArrayList();
    }

    public static final b2 j(ViewGroup container, FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        k8.a factory = fragmentManager.K();
        Intrinsics.checkNotNullExpressionValue(factory, "fragmentManager.specialEffectsControllerFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof b2) {
            return (b2) tag;
        }
        factory.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        s sVar = new s(container);
        Intrinsics.checkNotNullExpressionValue(sVar, "factory.createController(container)");
        container.setTag(R.id.special_effects_controller_view_tag, sVar);
        return sVar;
    }

    public static boolean k(ArrayList arrayList) {
        boolean z5;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z5 = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                x1 x1Var = (x1) it.next();
                if (!x1Var.k.isEmpty()) {
                    ArrayList arrayList2 = x1Var.k;
                    if (arrayList2 != null && arrayList2.isEmpty()) {
                        break;
                    }
                    Iterator it2 = arrayList2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            break;
                        }
                    } while (((w1) it2.next()).a());
                }
                z5 = false;
            }
        }
        if (z5) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                kotlin.collections.i0.o(arrayList3, ((x1) it3.next()).k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(x1 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (operation.f2280i) {
            z1 z1Var = operation.f2272a;
            View viewRequireView = operation.f2274c.requireView();
            Intrinsics.checkNotNullExpressionValue(viewRequireView, "operation.fragment.requireView()");
            z1Var.a(viewRequireView, this.f2102a);
            operation.f2280i = false;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z5);

    public final void c(List operations) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            kotlin.collections.i0.o(arrayList, ((x1) it.next()).k);
        }
        List listI0 = CollectionsKt.i0(CollectionsKt.l0(arrayList));
        int size = listI0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((w1) listI0.get(i7)).c(this.f2102a);
        }
        int size2 = operations.size();
        for (int i10 = 0; i10 < size2; i10++) {
            a((x1) operations.get(i10));
        }
        List listI1 = CollectionsKt.i0(operations);
        int size3 = listI1.size();
        for (int i11 = 0; i11 < size3; i11++) {
            x1 x1Var = (x1) listI1.get(i11);
            if (x1Var.k.isEmpty()) {
                x1Var.b();
            }
        }
    }

    public final void d(z1 z1Var, y1 y1Var, j1 j1Var) {
        synchronized (this.f2103b) {
            try {
                Fragment fragment = j1Var.f2168c;
                Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
                x1 x1VarG = g(fragment);
                if (x1VarG == null) {
                    Fragment fragment2 = j1Var.f2168c;
                    if (fragment2.mTransitioning || fragment2.mRemoving) {
                        Intrinsics.checkNotNullExpressionValue(fragment2, "fragmentStateManager.fragment");
                        x1VarG = h(fragment2);
                    } else {
                        x1VarG = null;
                    }
                }
                if (x1VarG != null) {
                    x1VarG.d(z1Var, y1Var);
                    return;
                }
                final x1 x1Var = new x1(z1Var, y1Var, j1Var);
                this.f2103b.add(x1Var);
                final int i7 = 0;
                Runnable listener = new Runnable(this) { // from class: androidx.fragment.app.v1

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ b2 f2262e;

                    {
                        this.f2262e = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                b2 this$0 = this.f2262e;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                x1 operation = x1Var;
                                Intrinsics.checkNotNullParameter(operation, "$operation");
                                if (this$0.f2103b.contains(operation)) {
                                    z1 z1Var2 = operation.f2272a;
                                    View view = operation.f2274c.mView;
                                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                                    z1Var2.a(view, this$0.f2102a);
                                }
                                break;
                            default:
                                b2 this$1 = this.f2262e;
                                Intrinsics.checkNotNullParameter(this$1, "this$0");
                                x1 operation2 = x1Var;
                                Intrinsics.checkNotNullParameter(operation2, "$operation");
                                this$1.f2103b.remove(operation2);
                                this$1.f2104c.remove(operation2);
                                break;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(listener, "listener");
                x1Var.f2275d.add(listener);
                final int i10 = 1;
                Runnable listener2 = new Runnable(this) { // from class: androidx.fragment.app.v1

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ b2 f2262e;

                    {
                        this.f2262e = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                b2 this$0 = this.f2262e;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                x1 operation = x1Var;
                                Intrinsics.checkNotNullParameter(operation, "$operation");
                                if (this$0.f2103b.contains(operation)) {
                                    z1 z1Var2 = operation.f2272a;
                                    View view = operation.f2274c.mView;
                                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                                    z1Var2.a(view, this$0.f2102a);
                                }
                                break;
                            default:
                                b2 this$1 = this.f2262e;
                                Intrinsics.checkNotNullParameter(this$1, "this$0");
                                x1 operation2 = x1Var;
                                Intrinsics.checkNotNullParameter(operation2, "$operation");
                                this$1.f2103b.remove(operation2);
                                this$1.f2104c.remove(operation2);
                                break;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(listener2, "listener");
                x1Var.f2275d.add(listener2);
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(z1 finalState, j1 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.f2168c);
        }
        d(finalState, y1.f2284e, fragmentStateManager);
    }

    public final void f() {
        boolean z5;
        if (this.f2107f) {
            return;
        }
        if (!this.f2102a.isAttachedToWindow()) {
            i();
            this.f2106e = false;
            return;
        }
        synchronized (this.f2103b) {
            try {
                ArrayList<x1> arrayListJ0 = CollectionsKt.j0(this.f2104c);
                this.f2104c.clear();
                Iterator it = arrayListJ0.iterator();
                while (true) {
                    z5 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    x1 x1Var = (x1) it.next();
                    if (this.f2103b.isEmpty() || !x1Var.f2274c.mTransitioning) {
                        z5 = false;
                    }
                    x1Var.f2278g = z5;
                }
                for (x1 x1Var2 : arrayListJ0) {
                    if (this.f2105d) {
                        if (FragmentManager.M(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + x1Var2);
                        }
                        x1Var2.b();
                    } else {
                        if (FragmentManager.M(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + x1Var2);
                        }
                        x1Var2.a(this.f2102a);
                    }
                    this.f2105d = false;
                    if (!x1Var2.f2277f) {
                        this.f2104c.add(x1Var2);
                    }
                }
                if (!this.f2103b.isEmpty()) {
                    n();
                    ArrayList arrayListJ1 = CollectionsKt.j0(this.f2103b);
                    if (arrayListJ1.isEmpty()) {
                        return;
                    }
                    this.f2103b.clear();
                    this.f2104c.addAll(arrayListJ1);
                    if (FragmentManager.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayListJ1, this.f2106e);
                    boolean zK = k(arrayListJ1);
                    Iterator it2 = arrayListJ1.iterator();
                    boolean z6 = true;
                    while (it2.hasNext()) {
                        if (!((x1) it2.next()).f2274c.mTransitioning) {
                            z6 = false;
                        }
                    }
                    if (!z6 || zK) {
                        z5 = false;
                    }
                    this.f2105d = z5;
                    if (FragmentManager.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zK + " \ntransition = " + z6);
                    }
                    if (!z6) {
                        m(arrayListJ1);
                        c(arrayListJ1);
                    } else if (zK) {
                        m(arrayListJ1);
                        int size = arrayListJ1.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            a((x1) arrayListJ1.get(i7));
                        }
                    }
                    this.f2106e = false;
                    if (FragmentManager.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final x1 g(Fragment fragment) {
        Object next;
        Iterator it = this.f2103b.iterator();
        while (it.hasNext()) {
            next = it.next();
            x1 x1Var = (x1) next;
            if (Intrinsics.areEqual(x1Var.f2274c, fragment) && !x1Var.f2276e) {
                return (x1) next;
            }
        }
        next = null;
        return (x1) next;
    }

    public final x1 h(Fragment fragment) {
        Object next;
        Iterator it = this.f2104c.iterator();
        while (it.hasNext()) {
            next = it.next();
            x1 x1Var = (x1) next;
            if (Intrinsics.areEqual(x1Var.f2274c, fragment) && !x1Var.f2276e) {
                return (x1) next;
            }
        }
        next = null;
        return (x1) next;
    }

    public final void i() {
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f2102a.isAttachedToWindow();
        synchronized (this.f2103b) {
            try {
                n();
                m(this.f2103b);
                ArrayList<x1> arrayListJ0 = CollectionsKt.j0(this.f2104c);
                Iterator it = arrayListJ0.iterator();
                while (it.hasNext()) {
                    ((x1) it.next()).f2278g = false;
                }
                for (x1 x1Var : arrayListJ0) {
                    if (FragmentManager.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f2102a + " is not attached to window. ") + "Cancelling running operation " + x1Var);
                    }
                    x1Var.a(this.f2102a);
                }
                ArrayList<x1> arrayListJ1 = CollectionsKt.j0(this.f2103b);
                Iterator it2 = arrayListJ1.iterator();
                while (it2.hasNext()) {
                    ((x1) it2.next()).f2278g = false;
                }
                for (x1 x1Var2 : arrayListJ1) {
                    if (FragmentManager.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f2102a + " is not attached to window. ") + "Cancelling pending operation " + x1Var2);
                    }
                    x1Var2.a(this.f2102a);
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l() {
        Object objPrevious;
        z1 z1Var;
        synchronized (this.f2103b) {
            try {
                n();
                ArrayList arrayList = this.f2103b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    x1 x1Var = (x1) objPrevious;
                    View view = x1Var.f2274c.mView;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                        z1Var = z1.f2292v;
                    } else {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            z1Var = z1.f2290e;
                        } else if (visibility == 4) {
                            z1Var = z1.f2292v;
                        } else {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            z1Var = z1.f2291i;
                        }
                    }
                    z1 z1Var2 = x1Var.f2272a;
                    z1 z1Var3 = z1.f2290e;
                    if (z1Var2 == z1Var3 && z1Var != z1Var3) {
                        break;
                    }
                }
                x1 x1Var2 = (x1) objPrevious;
                Fragment fragment = x1Var2 != null ? x1Var2.f2274c : null;
                this.f2107f = fragment != null ? fragment.isPostponed() : false;
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(List list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            x1 x1Var = (x1) list.get(i7);
            j1 j1Var = x1Var.f2281l;
            if (!x1Var.f2279h) {
                x1Var.f2279h = true;
                y1 y1Var = x1Var.f2273b;
                if (y1Var == y1.f2284e) {
                    Fragment fragment = j1Var.f2168c;
                    Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
                    View viewFindFocus = fragment.mView.findFocus();
                    if (viewFindFocus != null) {
                        fragment.setFocusedView(viewFindFocus);
                        if (FragmentManager.M(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                        }
                    }
                    View viewRequireView = x1Var.f2274c.requireView();
                    Intrinsics.checkNotNullExpressionValue(viewRequireView, "this.fragment.requireView()");
                    if (viewRequireView.getParent() == null) {
                        if (FragmentManager.M(2)) {
                            Log.v("FragmentManager", "Adding fragment " + fragment + " view " + viewRequireView + " to container in onStart");
                        }
                        j1Var.b();
                        viewRequireView.setAlpha(0.0f);
                    }
                    if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                        if (FragmentManager.M(2)) {
                            Log.v("FragmentManager", "Making view " + viewRequireView + " INVISIBLE in onStart");
                        }
                        viewRequireView.setVisibility(4);
                    }
                    viewRequireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                    if (FragmentManager.M(2)) {
                        Log.v("FragmentManager", "Setting view alpha to " + fragment.getPostOnViewCreatedAlpha() + " in onStart");
                    }
                } else if (y1Var == y1.f2285i) {
                    Fragment fragment2 = j1Var.f2168c;
                    Intrinsics.checkNotNullExpressionValue(fragment2, "fragmentStateManager.fragment");
                    View viewRequireView2 = fragment2.requireView();
                    Intrinsics.checkNotNullExpressionValue(viewRequireView2, "fragment.requireView()");
                    if (FragmentManager.M(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView2.findFocus() + " on view " + viewRequireView2 + " for Fragment " + fragment2);
                    }
                    viewRequireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.i0.o(arrayList, ((x1) it.next()).k);
        }
        List listI0 = CollectionsKt.i0(CollectionsKt.l0(arrayList));
        int size2 = listI0.size();
        for (int i10 = 0; i10 < size2; i10++) {
            w1 w1Var = (w1) listI0.get(i10);
            w1Var.getClass();
            ViewGroup container = this.f2102a;
            Intrinsics.checkNotNullParameter(container, "container");
            if (!w1Var.f2266a) {
                w1Var.e(container);
            }
            w1Var.f2266a = true;
        }
    }

    public final void n() {
        z1 z1Var;
        for (x1 x1Var : this.f2103b) {
            if (x1Var.f2273b == y1.f2284e) {
                View viewRequireView = x1Var.f2274c.requireView();
                Intrinsics.checkNotNullExpressionValue(viewRequireView, "fragment.requireView()");
                int visibility = viewRequireView.getVisibility();
                if (visibility == 0) {
                    z1Var = z1.f2290e;
                } else if (visibility == 4) {
                    z1Var = z1.f2292v;
                } else {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(kk.b.h(visibility, "Unknown visibility "));
                    }
                    z1Var = z1.f2291i;
                }
                x1Var.d(z1Var, y1.f2283d);
            }
        }
    }
}
