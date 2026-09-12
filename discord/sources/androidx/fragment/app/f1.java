package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.ViewModelStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends androidx.lifecycle.y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e1 f2134h = new e1(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2138e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2135b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f2136c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f2137d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2139f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2140g = false;

    public f1(boolean z5) {
        this.f2138e = z5;
    }

    @Override // androidx.lifecycle.y0
    public final void b() {
        if (FragmentManager.M(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2139f = true;
    }

    public final void c(Fragment fragment) {
        if (this.f2140g) {
            if (FragmentManager.M(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = fragment.mWho;
        HashMap map = this.f2135b;
        if (map.containsKey(str)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final void d(Fragment fragment, boolean z5) {
        if (FragmentManager.M(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        f(fragment.mWho, z5);
    }

    public final void e(String str, boolean z5) {
        if (FragmentManager.M(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        f(str, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f1.class == obj.getClass()) {
            f1 f1Var = (f1) obj;
            if (this.f2135b.equals(f1Var.f2135b) && this.f2136c.equals(f1Var.f2136c) && this.f2137d.equals(f1Var.f2137d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(String str, boolean z5) {
        HashMap map = this.f2136c;
        f1 f1Var = (f1) map.get(str);
        if (f1Var != null) {
            if (z5) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(f1Var.f2136c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f1Var.e((String) it.next(), true);
                }
            }
            f1Var.b();
            map.remove(str);
        }
        HashMap map2 = this.f2137d;
        ViewModelStore viewModelStore = (ViewModelStore) map2.get(str);
        if (viewModelStore != null) {
            viewModelStore.a();
            map2.remove(str);
        }
    }

    public final void g(Fragment fragment) {
        if (this.f2140g) {
            if (FragmentManager.M(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f2135b.remove(fragment.mWho) == null || !FragmentManager.M(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final int hashCode() {
        return this.f2137d.hashCode() + ((this.f2136c.hashCode() + (this.f2135b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f2135b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f2136c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f2137d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
