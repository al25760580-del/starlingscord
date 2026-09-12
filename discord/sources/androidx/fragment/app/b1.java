package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f2101a;

    public b1(FragmentManager fragmentManager) {
        this.f2101a = fragmentManager;
    }

    @Override // androidx.fragment.app.z0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean zV;
        FragmentManager fragmentManager = this.f2101a;
        ArrayList<y0> arrayList5 = fragmentManager.f2052n;
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + fragmentManager.f2041a);
        }
        if (fragmentManager.f2044d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zV = false;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        } else {
            a aVar = (a) kk.b.e(1, fragmentManager.f2044d);
            fragmentManager.f2048h = aVar;
            Iterator it = aVar.f2065a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((l1) it.next()).f2185b;
                if (fragment != null) {
                    fragment.mTransitioning = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zV = fragmentManager.V(arrayList3, arrayList4, null, -1, 0);
        }
        if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
            ((Boolean) arrayList4.get(arrayList3.size() - 1)).getClass();
            LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(FragmentManager.H((a) it2.next()));
            }
            for (y0 y0Var : arrayList5) {
                for (Fragment fragment2 : linkedHashSet) {
                    y0Var.getClass();
                }
            }
        }
        return zV;
    }
}
