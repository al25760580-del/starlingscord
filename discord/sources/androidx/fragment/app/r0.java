package androidx.fragment.app;

import android.util.Log;
import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends OnBackPressedCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f2243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(FragmentManager fragmentManager) {
        super(false);
        this.f2243d = fragmentManager;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackCancelled() {
        boolean zM = FragmentManager.M(3);
        FragmentManager fragmentManager = this.f2243d;
        if (zM) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
        }
        if (FragmentManager.M(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + fragmentManager.f2048h);
        }
        a aVar = fragmentManager.f2048h;
        if (aVar != null) {
            aVar.f2086s = false;
            aVar.k();
            fragmentManager.f2048h.g(true, new x(4, fragmentManager));
            fragmentManager.f2048h.c();
            fragmentManager.f2049i = true;
            fragmentManager.z(true);
            fragmentManager.G();
            fragmentManager.f2049i = false;
            fragmentManager.f2048h = null;
        }
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        boolean zM = FragmentManager.M(3);
        FragmentManager fragmentManager = this.f2243d;
        if (zM) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
        }
        r0 r0Var = fragmentManager.j;
        ArrayList<y0> arrayList = fragmentManager.f2052n;
        fragmentManager.f2049i = true;
        fragmentManager.z(true);
        fragmentManager.f2049i = false;
        if (fragmentManager.f2048h == null) {
            if (r0Var.isEnabled()) {
                if (FragmentManager.M(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                fragmentManager.T();
                return;
            } else {
                if (FragmentManager.M(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                fragmentManager.f2047g.d();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(FragmentManager.H(fragmentManager.f2048h));
            for (y0 y0Var : arrayList) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((sm.g) y0Var).t((Fragment) it.next());
                }
            }
        }
        Iterator it2 = fragmentManager.f2048h.f2065a.iterator();
        while (it2.hasNext()) {
            Fragment fragment = ((l1) it2.next()).f2185b;
            if (fragment != null) {
                fragment.mTransitioning = false;
            }
        }
        for (b2 b2Var : fragmentManager.f(new ArrayList(Collections.singletonList(fragmentManager.f2048h)), 0, 1)) {
            ArrayList arrayList2 = b2Var.f2104c;
            if (FragmentManager.M(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            b2Var.m(arrayList2);
            b2Var.c(arrayList2);
        }
        Iterator it3 = fragmentManager.f2048h.f2065a.iterator();
        while (it3.hasNext()) {
            Fragment fragment2 = ((l1) it3.next()).f2185b;
            if (fragment2 != null && fragment2.mContainer == null) {
                fragmentManager.g(fragment2).k();
            }
        }
        fragmentManager.f2048h = null;
        fragmentManager.i0();
        if (FragmentManager.M(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + r0Var.isEnabled() + " for  FragmentManager " + fragmentManager);
        }
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackProgressed(BackEventCompat backEvent) {
        boolean zM = FragmentManager.M(2);
        FragmentManager fragmentManager = this.f2243d;
        if (zM) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
        }
        if (fragmentManager.f2048h != null) {
            for (b2 b2Var : fragmentManager.f(new ArrayList(Collections.singletonList(fragmentManager.f2048h)), 0, 1)) {
                b2Var.getClass();
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                if (FragmentManager.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.f699c);
                }
                ArrayList arrayList = b2Var.f2104c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    kotlin.collections.i0.o(arrayList2, ((x1) it.next()).k);
                }
                List listI0 = CollectionsKt.i0(CollectionsKt.l0(arrayList2));
                int size = listI0.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((w1) listI0.get(i7)).d(backEvent, b2Var.f2102a);
                }
            }
            Iterator it2 = fragmentManager.f2052n.iterator();
            while (it2.hasNext()) {
                ((y0) it2.next()).getClass();
            }
        }
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackStarted(BackEventCompat backEventCompat) {
        boolean zM = FragmentManager.M(3);
        FragmentManager fragmentManager = this.f2243d;
        if (zM) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
        }
        fragmentManager.w();
        fragmentManager.x(new b1(fragmentManager), false);
    }
}
