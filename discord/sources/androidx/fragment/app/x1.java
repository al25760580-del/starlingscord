package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z1 f2272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y1 f2273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f2274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2280i;
    public final ArrayList j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j1 f2281l;

    public x1(z1 finalState, y1 lifecycleImpact, j1 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        Fragment fragment = fragmentStateManager.f2168c;
        Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f2272a = finalState;
        this.f2273b = lifecycleImpact;
        this.f2274c = fragment;
        this.f2275d = new ArrayList();
        this.f2280i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.f2281l = fragmentStateManager;
    }

    public final void a(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f2279h = false;
        if (this.f2276e) {
            return;
        }
        this.f2276e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (w1 w1Var : CollectionsKt.i0(this.k)) {
            w1Var.getClass();
            Intrinsics.checkNotNullParameter(container, "container");
            if (!w1Var.f2267b) {
                w1Var.b(container);
            }
            w1Var.f2267b = true;
        }
    }

    public final void b() {
        this.f2279h = false;
        if (!this.f2277f) {
            if (FragmentManager.M(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2277f = true;
            Iterator it = this.f2275d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f2274c.mTransitioning = false;
        this.f2281l.k();
    }

    public final void c(w1 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        ArrayList arrayList = this.j;
        if (arrayList.remove(effect) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(z1 finalState, y1 lifecycleImpact) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        int iOrdinal = lifecycleImpact.ordinal();
        Fragment fragment = this.f2274c;
        z1 z1Var = z1.f2289d;
        if (iOrdinal == 0) {
            if (this.f2272a != z1Var) {
                if (FragmentManager.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f2272a + " -> " + finalState + '.');
                }
                this.f2272a = finalState;
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (this.f2272a == z1Var) {
                if (FragmentManager.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f2273b + " to ADDING.");
                }
                this.f2272a = z1.f2290e;
                this.f2273b = y1.f2284e;
                this.f2280i = true;
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f2272a + " -> REMOVED. mLifecycleImpact  = " + this.f2273b + " to REMOVING.");
        }
        this.f2272a = z1Var;
        this.f2273b = y1.f2285i;
        this.f2280i = true;
    }

    public final String toString() {
        StringBuilder sbN = com.discord.chat.presentation.list.a.n("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbN.append(this.f2272a);
        sbN.append(" lifecycleImpact = ");
        sbN.append(this.f2273b);
        sbN.append(" fragment = ");
        sbN.append(this.f2274c);
        sbN.append('}');
        return sbN.toString();
    }
}
