package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2174a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2175b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f2176c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f1 f2177d;

    public final void a(Fragment fragment) {
        if (this.f2174a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f2174a) {
            this.f2174a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        j1 j1Var = (j1) this.f2175b.get(str);
        if (j1Var != null) {
            return j1Var.f2168c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment fragmentFindFragmentByWho;
        for (j1 j1Var : this.f2175b.values()) {
            if (j1Var != null && (fragmentFindFragmentByWho = j1Var.f2168c.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (j1 j1Var : this.f2175b.values()) {
            if (j1Var != null) {
                arrayList.add(j1Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (j1 j1Var : this.f2175b.values()) {
            if (j1Var != null) {
                arrayList.add(j1Var.f2168c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f2174a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f2174a) {
            arrayList = new ArrayList(this.f2174a);
        }
        return arrayList;
    }

    public final void g(j1 j1Var) {
        Fragment fragment = j1Var.f2168c;
        String str = fragment.mWho;
        HashMap map = this.f2175b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, j1Var);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f2177d.c(fragment);
            } else {
                this.f2177d.g(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void h(j1 j1Var) {
        Fragment fragment = j1Var.f2168c;
        if (fragment.mRetainInstance) {
            this.f2177d.g(fragment);
        }
        String str = fragment.mWho;
        HashMap map = this.f2175b;
        if (map.get(str) == j1Var && ((j1) map.put(fragment.mWho, null)) != null && FragmentManager.M(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public final Bundle i(String str, Bundle bundle) {
        HashMap map = this.f2176c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
