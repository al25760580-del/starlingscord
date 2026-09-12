package androidx.fragment.app;

import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a extends FragmentTransaction implements z0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FragmentManager f2085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2086s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2087t;

    public a(FragmentManager fragmentManager) {
        fragmentManager.J();
        FragmentHostCallback fragmentHostCallback = fragmentManager.f2061w;
        if (fragmentHostCallback != null) {
            fragmentHostCallback.f2038e.getClassLoader();
        }
        this.f2065a = new ArrayList();
        this.f2072h = true;
        this.f2078p = false;
        this.f2087t = -1;
        this.f2085r = fragmentManager;
    }

    @Override // androidx.fragment.app.z0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2071g) {
            return true;
        }
        this.f2085r.f2044d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final int c() {
        return l(false, true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void d() {
        if (this.f2071g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f2072h = false;
        this.f2085r.A(this, true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void e(int i7, Fragment fragment, String str, int i10) {
        super.e(i7, fragment, str, i10);
        fragment.mFragmentManager = this.f2085r;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void f(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f2085r) {
            super.f(fragment);
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void i(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f2085r) {
            super.i(fragment);
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final void j(int i7) {
        ArrayList arrayList = this.f2065a;
        if (this.f2071g) {
            if (FragmentManager.M(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i7);
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                l1 l1Var = (l1) arrayList.get(i10);
                Fragment fragment = l1Var.f2185b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i7;
                    if (FragmentManager.M(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + l1Var.f2185b + " to " + l1Var.f2185b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final void k() {
        ArrayList arrayList = this.f2065a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            l1 l1Var = (l1) arrayList.get(size);
            if (l1Var.f2186c) {
                if (l1Var.f2184a == 8) {
                    l1Var.f2186c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i7 = l1Var.f2185b.mContainerId;
                    l1Var.f2184a = 2;
                    l1Var.f2186c = false;
                    for (int i10 = size - 1; i10 >= 0; i10--) {
                        l1 l1Var2 = (l1) arrayList.get(i10);
                        if (l1Var2.f2186c && l1Var2.f2185b.mContainerId == i7) {
                            arrayList.remove(i10);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int l(boolean z5, boolean z6) {
        if (this.f2086s) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new u1());
            n("  ", printWriter, true);
            printWriter.close();
        }
        this.f2086s = true;
        boolean z7 = this.f2071g;
        FragmentManager fragmentManager = this.f2085r;
        if (z7) {
            this.f2087t = fragmentManager.k.getAndIncrement();
        } else {
            this.f2087t = -1;
        }
        if (z6) {
            fragmentManager.x(this, z5);
        }
        return this.f2087t;
    }

    public final void m() {
        if (this.f2071g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f2072h = false;
        this.f2085r.A(this, false);
    }

    public final void n(String str, PrintWriter printWriter, boolean z5) {
        String str2;
        ArrayList arrayList = this.f2065a;
        if (z5) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2073i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2087t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2086s);
            if (this.f2070f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2070f));
            }
            if (this.f2066b != 0 || this.f2067c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2066b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2067c));
            }
            if (this.f2068d != 0 || this.f2069e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2068d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2069e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.f2074l != 0 || this.f2075m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2074l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2075m);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            l1 l1Var = (l1) arrayList.get(i7);
            switch (l1Var.f2184a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + l1Var.f2184a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i7);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(l1Var.f2185b);
            if (z5) {
                if (l1Var.f2187d != 0 || l1Var.f2188e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(l1Var.f2187d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(l1Var.f2188e));
                }
                if (l1Var.f2189f != 0 || l1Var.f2190g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(l1Var.f2189f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(l1Var.f2190g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2087t >= 0) {
            sb2.append(" #");
            sb2.append(this.f2087t);
        }
        if (this.f2073i != null) {
            sb2.append(" ");
            sb2.append(this.f2073i);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
