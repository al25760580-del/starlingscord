package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.savedstate.SavedStateRegistry;
import com.discord.R;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {
    public final t0 A;
    public final k8.a B;
    public f.f C;
    public f.f D;
    public f.f E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public f1 O;
    public final t P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2042b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f2045e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OnBackPressedDispatcher f2047g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f2052n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k0 f2053o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f2054p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p0 f2055q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p0 f2056r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p0 f2057s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p0 f2058t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final s0 f2059u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2060v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public FragmentHostCallback f2061w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FragmentContainer f2062x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Fragment f2063y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Fragment f2064z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2041a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f2043c = new k1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f2044d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0 f2046f = new n0(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f2048h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2049i = false;
    public final r0 j = new r0(this);
    public final AtomicInteger k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f2050l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f2051m = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.p0] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.p0] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.p0] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.p0] */
    public FragmentManager() {
        Collections.synchronizedMap(new HashMap());
        this.f2052n = new ArrayList();
        this.f2053o = new k0(this);
        this.f2054p = new CopyOnWriteArrayList();
        final int i7 = 0;
        this.f2055q = new Consumer(this) { // from class: androidx.fragment.app.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f2229b;

            {
                this.f2229b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f2229b;
                        if (fragmentManager.O()) {
                            fragmentManager.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f2229b;
                        if (fragmentManager2.O() && num.intValue() == 80) {
                            fragmentManager2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        x0.j jVar = (x0.j) obj;
                        FragmentManager fragmentManager3 = this.f2229b;
                        if (fragmentManager3.O()) {
                            fragmentManager3.n(jVar.f22538a, false);
                        }
                        break;
                    default:
                        x0.e1 e1Var = (x0.e1) obj;
                        FragmentManager fragmentManager4 = this.f2229b;
                        if (fragmentManager4.O()) {
                            fragmentManager4.s(e1Var.f22527a, false);
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f2056r = new Consumer(this) { // from class: androidx.fragment.app.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f2229b;

            {
                this.f2229b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f2229b;
                        if (fragmentManager.O()) {
                            fragmentManager.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f2229b;
                        if (fragmentManager2.O() && num.intValue() == 80) {
                            fragmentManager2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        x0.j jVar = (x0.j) obj;
                        FragmentManager fragmentManager3 = this.f2229b;
                        if (fragmentManager3.O()) {
                            fragmentManager3.n(jVar.f22538a, false);
                        }
                        break;
                    default:
                        x0.e1 e1Var = (x0.e1) obj;
                        FragmentManager fragmentManager4 = this.f2229b;
                        if (fragmentManager4.O()) {
                            fragmentManager4.s(e1Var.f22527a, false);
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f2057s = new Consumer(this) { // from class: androidx.fragment.app.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f2229b;

            {
                this.f2229b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f2229b;
                        if (fragmentManager.O()) {
                            fragmentManager.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f2229b;
                        if (fragmentManager2.O() && num.intValue() == 80) {
                            fragmentManager2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        x0.j jVar = (x0.j) obj;
                        FragmentManager fragmentManager3 = this.f2229b;
                        if (fragmentManager3.O()) {
                            fragmentManager3.n(jVar.f22538a, false);
                        }
                        break;
                    default:
                        x0.e1 e1Var = (x0.e1) obj;
                        FragmentManager fragmentManager4 = this.f2229b;
                        if (fragmentManager4.O()) {
                            fragmentManager4.s(e1Var.f22527a, false);
                        }
                        break;
                }
            }
        };
        final int i12 = 3;
        this.f2058t = new Consumer(this) { // from class: androidx.fragment.app.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f2229b;

            {
                this.f2229b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f2229b;
                        if (fragmentManager.O()) {
                            fragmentManager.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f2229b;
                        if (fragmentManager2.O() && num.intValue() == 80) {
                            fragmentManager2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        x0.j jVar = (x0.j) obj;
                        FragmentManager fragmentManager3 = this.f2229b;
                        if (fragmentManager3.O()) {
                            fragmentManager3.n(jVar.f22538a, false);
                        }
                        break;
                    default:
                        x0.e1 e1Var = (x0.e1) obj;
                        FragmentManager fragmentManager4 = this.f2229b;
                        if (fragmentManager4.O()) {
                            fragmentManager4.s(e1Var.f22527a, false);
                        }
                        break;
                }
            }
        };
        this.f2059u = new s0(this);
        this.f2060v = -1;
        this.A = new t0(this);
        this.B = new k8.a();
        this.F = new ArrayDeque();
        this.P = new t(2, this);
    }

    public static Fragment C(ViewGroup viewGroup) {
        Fragment fragmentF = F(viewGroup);
        if (fragmentF != null) {
            return fragmentF;
        }
        throw new IllegalStateException("View " + viewGroup + " does not have a Fragment set");
    }

    public static Fragment F(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            Fragment fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                return fragment;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static HashSet H(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < aVar.f2065a.size(); i7++) {
            Fragment fragment = ((l1) aVar.f2065a.get(i7)).f2185b;
            if (fragment != null && aVar.f2071g) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public static boolean M(int i7) {
        return Log.isLoggable("FragmentManager", i7);
    }

    public static boolean N(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        boolean zN = false;
        for (Fragment fragment2 : fragment.mChildFragmentManager.f2043c.e()) {
            if (fragment2 != null) {
                zN = N(fragment2);
            }
            if (zN) {
                return true;
            }
        }
        return false;
    }

    public static boolean P(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.f2064z) && P(fragmentManager.f2063y);
    }

    public static void g0(Fragment fragment) {
        if (M(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final void A(a aVar, boolean z5) {
        if (z5 && (this.f2061w == null || this.J)) {
            return;
        }
        y(z5);
        a aVar2 = this.f2048h;
        if (aVar2 != null) {
            aVar2.f2086s = false;
            aVar2.k();
            if (M(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f2048h + " as part of execSingleAction for action " + aVar);
            }
            this.f2048h.l(false, false);
            this.f2048h.a(this.L, this.M);
            Iterator it = this.f2048h.f2065a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((l1) it.next()).f2185b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f2048h = null;
        }
        aVar.a(this.L, this.M);
        this.f2042b = true;
        try {
            Y(this.L, this.M);
            d();
            i0();
            boolean z6 = this.K;
            k1 k1Var = this.f2043c;
            if (z6) {
                this.K = false;
                for (j1 j1Var : k1Var.d()) {
                    Fragment fragment2 = j1Var.f2168c;
                    if (fragment2.mDeferStart) {
                        if (this.f2042b) {
                            this.K = true;
                        } else {
                            fragment2.mDeferStart = false;
                            j1Var.k();
                        }
                    }
                }
            }
            k1Var.f2175b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th2) {
            d();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x021e A[PHI: r15
      0x021e: PHI (r15v14 int) = (r15v13 int), (r15v16 int) binds: [B:103:0x020b, B:107:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x016e  */
    public final void B(ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        boolean z5;
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        int i15 = i7;
        boolean z7 = ((a) arrayList.get(i15)).f2078p;
        ArrayList arrayList3 = this.N;
        if (arrayList3 == null) {
            this.N = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.N;
        k1 k1Var = this.f2043c;
        arrayList4.addAll(k1Var.f());
        Fragment fragment = this.f2064z;
        int i16 = i15;
        boolean z10 = false;
        while (true) {
            int i17 = 1;
            if (i16 >= i10) {
                boolean z11 = z7;
                boolean z12 = z10;
                this.N.clear();
                if (!z11 && this.f2060v >= 1) {
                    for (int i18 = i15; i18 < i10; i18++) {
                        Iterator it = ((a) arrayList.get(i18)).f2065a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = ((l1) it.next()).f2185b;
                            if (fragment2 != null && fragment2.mFragmentManager != null) {
                                k1Var.g(g(fragment2));
                            }
                        }
                    }
                }
                int i19 = i15;
                while (i19 < i10) {
                    a aVar = (a) arrayList.get(i19);
                    if (((Boolean) arrayList2.get(i19)).booleanValue()) {
                        aVar.j(-1);
                        FragmentManager fragmentManager = aVar.f2085r;
                        ArrayList arrayList5 = aVar.f2065a;
                        boolean z13 = true;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            l1 l1Var = (l1) arrayList5.get(size);
                            Fragment fragment3 = l1Var.f2185b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = false;
                                fragment3.setPopDirection(z13);
                                int i20 = aVar.f2070f;
                                int i21 = 8194;
                                int i22 = 4097;
                                if (i20 != 4097) {
                                    if (i20 != 8194) {
                                        i21 = 4100;
                                        if (i20 != 8197) {
                                            i22 = 4099;
                                            if (i20 != 4099) {
                                                i21 = i20 != 4100 ? 0 : 8197;
                                            } else {
                                                i21 = i22;
                                            }
                                        }
                                    } else {
                                        i21 = i22;
                                    }
                                }
                                fragment3.setNextTransition(i21);
                                fragment3.setSharedElementNames(aVar.f2077o, aVar.f2076n);
                            }
                            switch (l1Var.f2184a) {
                                case 1:
                                    fragment3.setAnimations(l1Var.f2187d, l1Var.f2188e, l1Var.f2189f, l1Var.f2190g);
                                    z13 = true;
                                    fragmentManager.c0(fragment3, true);
                                    fragmentManager.X(fragment3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + l1Var.f2184a);
                                case 3:
                                    fragment3.setAnimations(l1Var.f2187d, l1Var.f2188e, l1Var.f2189f, l1Var.f2190g);
                                    fragmentManager.a(fragment3);
                                    z13 = true;
                                    break;
                                case 4:
                                    fragment3.setAnimations(l1Var.f2187d, l1Var.f2188e, l1Var.f2189f, l1Var.f2190g);
                                    fragmentManager.getClass();
                                    g0(fragment3);
                                    z13 = true;
                                    break;
                                case 5:
                                    fragment3.setAnimations(l1Var.f2187d, l1Var.f2188e, l1Var.f2189f, l1Var.f2190g);
                                    fragmentManager.c0(fragment3, true);
                                    fragmentManager.L(fragment3);
                                    z13 = true;
                                    break;
                                case 6:
                                    fragment3.setAnimations(l1Var.f2187d, l1Var.f2188e, l1Var.f2189f, l1Var.f2190g);
                                    fragmentManager.c(fragment3);
                                    z13 = true;
                                    break;
                                case 7:
                                    fragment3.setAnimations(l1Var.f2187d, l1Var.f2188e, l1Var.f2189f, l1Var.f2190g);
                                    fragmentManager.c0(fragment3, true);
                                    fragmentManager.h(fragment3);
                                    z13 = true;
                                    break;
                                case 8:
                                    fragmentManager.e0(null);
                                    z13 = true;
                                    break;
                                case 9:
                                    fragmentManager.e0(fragment3);
                                    z13 = true;
                                    break;
                                case 10:
                                    l1Var.f2192i = fragment3.mMaxState;
                                    fragmentManager.d0(fragment3, l1Var.f2191h);
                                    z13 = true;
                                    break;
                            }
                        }
                    } else {
                        aVar.j(1);
                        FragmentManager fragmentManager2 = aVar.f2085r;
                        ArrayList arrayList6 = aVar.f2065a;
                        int size2 = arrayList6.size();
                        int i23 = 0;
                        while (i23 < size2) {
                            l1 l1Var2 = (l1) arrayList6.get(i23);
                            Fragment fragment4 = l1Var2.f2185b;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = false;
                                fragment4.setPopDirection(false);
                                fragment4.setNextTransition(aVar.f2070f);
                                fragment4.setSharedElementNames(aVar.f2076n, aVar.f2077o);
                            }
                            switch (l1Var2.f2184a) {
                                case 1:
                                    i19 = i19;
                                    fragment4.setAnimations(l1Var2.f2187d, l1Var2.f2188e, l1Var2.f2189f, l1Var2.f2190g);
                                    fragmentManager2.c0(fragment4, false);
                                    fragmentManager2.a(fragment4);
                                    i23++;
                                    i19 = i19;
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + l1Var2.f2184a);
                                case 3:
                                    fragment4.setAnimations(l1Var2.f2187d, l1Var2.f2188e, l1Var2.f2189f, l1Var2.f2190g);
                                    fragmentManager2.X(fragment4);
                                    i23++;
                                    i19 = i19;
                                    break;
                                case 4:
                                    fragment4.setAnimations(l1Var2.f2187d, l1Var2.f2188e, l1Var2.f2189f, l1Var2.f2190g);
                                    fragmentManager2.L(fragment4);
                                    i23++;
                                    i19 = i19;
                                    break;
                                case 5:
                                    fragment4.setAnimations(l1Var2.f2187d, l1Var2.f2188e, l1Var2.f2189f, l1Var2.f2190g);
                                    fragmentManager2.c0(fragment4, false);
                                    g0(fragment4);
                                    i23++;
                                    i19 = i19;
                                    break;
                                case 6:
                                    fragment4.setAnimations(l1Var2.f2187d, l1Var2.f2188e, l1Var2.f2189f, l1Var2.f2190g);
                                    fragmentManager2.h(fragment4);
                                    i23++;
                                    i19 = i19;
                                    break;
                                case 7:
                                    fragment4.setAnimations(l1Var2.f2187d, l1Var2.f2188e, l1Var2.f2189f, l1Var2.f2190g);
                                    fragmentManager2.c0(fragment4, false);
                                    fragmentManager2.c(fragment4);
                                    i23++;
                                    i19 = i19;
                                    break;
                                case 8:
                                    fragmentManager2.e0(fragment4);
                                    i23++;
                                    i19 = i19;
                                    break;
                                case 9:
                                    fragmentManager2.e0(null);
                                    i23++;
                                    i19 = i19;
                                    break;
                                case 10:
                                    l1Var2.f2191h = fragment4.mMaxState;
                                    fragmentManager2.d0(fragment4, l1Var2.f2192i);
                                    i23++;
                                    i19 = i19;
                                    break;
                            }
                        }
                    }
                    i19++;
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i10 - 1)).booleanValue();
                ArrayList<y0> arrayList7 = this.f2052n;
                if (z12 && !arrayList7.isEmpty()) {
                    LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(H((a) it2.next()));
                    }
                    if (this.f2048h == null) {
                        for (y0 y0Var : arrayList7) {
                            for (Fragment fragment5 : linkedHashSet) {
                                y0Var.getClass();
                            }
                        }
                        for (y0 y0Var2 : arrayList7) {
                            Iterator it3 = linkedHashSet.iterator();
                            while (it3.hasNext()) {
                                ((sm.g) y0Var2).t((Fragment) it3.next());
                            }
                        }
                    }
                }
                for (int i24 = i15; i24 < i10; i24++) {
                    a aVar2 = (a) arrayList.get(i24);
                    if (zBooleanValue) {
                        for (int size3 = aVar2.f2065a.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment6 = ((l1) aVar2.f2065a.get(size3)).f2185b;
                            if (fragment6 != null) {
                                g(fragment6).k();
                            }
                        }
                    } else {
                        Iterator it4 = aVar2.f2065a.iterator();
                        while (it4.hasNext()) {
                            Fragment fragment7 = ((l1) it4.next()).f2185b;
                            if (fragment7 != null) {
                                g(fragment7).k();
                            }
                        }
                    }
                }
                R(this.f2060v, true);
                for (b2 b2Var : f(arrayList, i15, i10)) {
                    b2Var.f2106e = zBooleanValue;
                    b2Var.l();
                    b2Var.f();
                }
                while (i15 < i10) {
                    a aVar3 = (a) arrayList.get(i15);
                    if (((Boolean) arrayList2.get(i15)).booleanValue() && aVar3.f2087t >= 0) {
                        aVar3.f2087t = -1;
                    }
                    if (aVar3.f2079q != null) {
                        for (int i25 = 0; i25 < aVar3.f2079q.size(); i25++) {
                            ((Runnable) aVar3.f2079q.get(i25)).run();
                        }
                        aVar3.f2079q = null;
                    }
                    i15++;
                }
                if (z12) {
                    for (int i26 = 0; i26 < arrayList7.size(); i26++) {
                        ((y0) arrayList7.get(i26)).getClass();
                    }
                    return;
                }
                return;
            }
            a aVar4 = (a) arrayList.get(i16);
            if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                z5 = z7;
                i11 = i16;
                z6 = z10;
                int i27 = 1;
                ArrayList arrayList8 = this.N;
                ArrayList arrayList9 = aVar4.f2065a;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    l1 l1Var3 = (l1) arrayList9.get(size4);
                    int i28 = l1Var3.f2184a;
                    if (i28 != i27) {
                        if (i28 != 3) {
                            switch (i28) {
                                case 6:
                                    arrayList8.add(l1Var3.f2185b);
                                    break;
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = l1Var3.f2185b;
                                    break;
                                case 10:
                                    l1Var3.f2192i = l1Var3.f2191h;
                                    break;
                            }
                        } else {
                            arrayList8.add(l1Var3.f2185b);
                        }
                        size4--;
                        i27 = 1;
                    }
                    arrayList8.remove(l1Var3.f2185b);
                    size4--;
                    i27 = 1;
                }
            } else {
                ArrayList arrayList10 = this.N;
                ArrayList arrayList11 = aVar4.f2065a;
                int i29 = 0;
                while (i29 < arrayList11.size()) {
                    l1 l1Var4 = (l1) arrayList11.get(i29);
                    boolean z14 = z7;
                    int i30 = l1Var4.f2184a;
                    if (i30 != i17) {
                        i12 = i16;
                        if (i30 != 2) {
                            if (i30 == 3 || i30 == 6) {
                                arrayList10.remove(l1Var4.f2185b);
                                Fragment fragment8 = l1Var4.f2185b;
                                if (fragment8 == fragment) {
                                    arrayList11.add(i29, new l1(fragment8, 9));
                                    i29++;
                                    fragment = null;
                                }
                                i13 = 1;
                            } else if (i30 == 7) {
                                i13 = 1;
                            } else if (i30 == 8) {
                                arrayList11.add(i29, new l1(9, fragment, 0));
                                l1Var4.f2186c = true;
                                i29++;
                                fragment = l1Var4.f2185b;
                            }
                            i13 = 1;
                        } else {
                            Fragment fragment9 = l1Var4.f2185b;
                            int i31 = fragment9.mContainerId;
                            int size5 = arrayList10.size() - 1;
                            boolean z15 = false;
                            while (size5 >= 0) {
                                int i32 = size5;
                                Fragment fragment10 = (Fragment) arrayList10.get(size5);
                                boolean z16 = z10;
                                if (fragment10.mContainerId != i31) {
                                    i31 = i31;
                                } else if (fragment10 == fragment9) {
                                    i31 = i31;
                                    z15 = true;
                                } else {
                                    if (fragment10 == fragment) {
                                        i14 = 0;
                                        arrayList11.add(i29, new l1(9, fragment10, 0));
                                        i29++;
                                        fragment = null;
                                    } else {
                                        i14 = 0;
                                    }
                                    l1 l1Var5 = new l1(3, fragment10, i14);
                                    l1Var5.f2187d = l1Var4.f2187d;
                                    l1Var5.f2189f = l1Var4.f2189f;
                                    l1Var5.f2188e = l1Var4.f2188e;
                                    l1Var5.f2190g = l1Var4.f2190g;
                                    arrayList11.add(i29, l1Var5);
                                    arrayList10.remove(fragment10);
                                    i29++;
                                    fragment = fragment;
                                }
                                size5 = i32 - 1;
                                i31 = i31;
                                z10 = z16;
                            }
                            z10 = z10;
                            i13 = 1;
                            if (z15) {
                                arrayList11.remove(i29);
                                i29--;
                            } else {
                                l1Var4.f2184a = 1;
                                l1Var4.f2186c = true;
                                arrayList10.add(fragment9);
                            }
                        }
                        i29 += i13;
                        i17 = i13;
                        z7 = z14;
                        i16 = i12;
                        z10 = z10;
                    } else {
                        i12 = i16;
                        i13 = i17;
                    }
                    z10 = z10;
                    arrayList10.add(l1Var4.f2185b);
                    i29 += i13;
                    i17 = i13;
                    z7 = z14;
                    i16 = i12;
                    z10 = z10;
                }
                z5 = z7;
                i11 = i16;
                z6 = z10;
            }
            z10 = z6 || aVar4.f2071g;
            i16 = i11 + 1;
            z7 = z5;
        }
    }

    public final Fragment D(int i7) {
        k1 k1Var = this.f2043c;
        ArrayList arrayList = k1Var.f2174a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i7) {
                return fragment;
            }
        }
        for (j1 j1Var : k1Var.f2175b.values()) {
            if (j1Var != null) {
                Fragment fragment2 = j1Var.f2168c;
                if (fragment2.mFragmentId == i7) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment E(String str) {
        k1 k1Var = this.f2043c;
        ArrayList arrayList = k1Var.f2174a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && str.equals(fragment.mTag)) {
                return fragment;
            }
        }
        for (j1 j1Var : k1Var.f2175b.values()) {
            if (j1Var != null) {
                Fragment fragment2 = j1Var.f2168c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final void G() {
        for (b2 b2Var : e()) {
            if (b2Var.f2107f) {
                if (M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                b2Var.f2107f = false;
                b2Var.f();
            }
        }
    }

    public final ViewGroup I(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.f2062x.c()) {
            return null;
        }
        View viewB = this.f2062x.b(fragment.mContainerId);
        if (viewB instanceof ViewGroup) {
            return (ViewGroup) viewB;
        }
        return null;
    }

    public final t0 J() {
        Fragment fragment = this.f2063y;
        return fragment != null ? fragment.mFragmentManager.J() : this.A;
    }

    public final k8.a K() {
        Fragment fragment = this.f2063y;
        return fragment != null ? fragment.mFragmentManager.K() : this.B;
    }

    public final void L(Fragment fragment) {
        if (M(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        f0(fragment);
    }

    public final boolean O() {
        Fragment fragment = this.f2063y;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f2063y.getParentFragmentManager().O();
    }

    public final boolean Q() {
        return this.H || this.I;
    }

    public final void R(int i7, boolean z5) {
        FragmentHostCallback fragmentHostCallback;
        if (this.f2061w == null && i7 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z5 || i7 != this.f2060v) {
            this.f2060v = i7;
            k1 k1Var = this.f2043c;
            HashMap map = k1Var.f2175b;
            Iterator it = k1Var.f2174a.iterator();
            while (it.hasNext()) {
                j1 j1Var = (j1) map.get(((Fragment) it.next()).mWho);
                if (j1Var != null) {
                    j1Var.k();
                }
            }
            for (j1 j1Var2 : map.values()) {
                if (j1Var2 != null) {
                    j1Var2.k();
                    Fragment fragment = j1Var2.f2168c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !k1Var.f2176c.containsKey(fragment.mWho)) {
                            k1Var.i(fragment.mWho, j1Var2.n());
                        }
                        k1Var.h(j1Var2);
                    }
                }
            }
            for (j1 j1Var3 : k1Var.d()) {
                Fragment fragment2 = j1Var3.f2168c;
                if (fragment2.mDeferStart) {
                    if (this.f2042b) {
                        this.K = true;
                    } else {
                        fragment2.mDeferStart = false;
                        j1Var3.k();
                    }
                }
            }
            if (this.G && (fragmentHostCallback = this.f2061w) != null && this.f2060v == 7) {
                fragmentHostCallback.h();
                this.G = false;
            }
        }
    }

    public final void S() {
        if (this.f2061w == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.f2140g = false;
        for (Fragment fragment : this.f2043c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean T() {
        return U(-1, 0);
    }

    public final boolean U(int i7, int i10) {
        z(false);
        y(true);
        Fragment fragment = this.f2064z;
        if (fragment != null && i7 < 0 && fragment.getChildFragmentManager().T()) {
            return true;
        }
        boolean zV = V(this.L, this.M, null, i7, i10);
        if (zV) {
            this.f2042b = true;
            try {
                Y(this.L, this.M);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        i0();
        boolean z5 = this.K;
        k1 k1Var = this.f2043c;
        if (z5) {
            this.K = false;
            for (j1 j1Var : k1Var.d()) {
                Fragment fragment2 = j1Var.f2168c;
                if (fragment2.mDeferStart) {
                    if (this.f2042b) {
                        this.K = true;
                    } else {
                        fragment2.mDeferStart = false;
                        j1Var.k();
                    }
                }
            }
        }
        k1Var.f2175b.values().removeAll(Collections.singleton(null));
        return zV;
    }

    public final boolean V(ArrayList arrayList, ArrayList arrayList2, String str, int i7, int i10) {
        boolean z5 = (i10 & 1) != 0;
        int size = -1;
        if (!this.f2044d.isEmpty()) {
            if (str != null || i7 >= 0) {
                int size2 = this.f2044d.size() - 1;
                while (size2 >= 0) {
                    a aVar = (a) this.f2044d.get(size2);
                    if ((str != null && str.equals(aVar.f2073i)) || (i7 >= 0 && i7 == aVar.f2087t)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z5) {
                    size = size2;
                    while (size > 0) {
                        a aVar2 = (a) this.f2044d.get(size - 1);
                        if ((str == null || !str.equals(aVar2.f2073i)) && (i7 < 0 || i7 != aVar2.f2087t)) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f2044d.size() - 1) {
                    size = size2 + 1;
                }
            } else {
                size = z5 ? 0 : this.f2044d.size() - 1;
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f2044d.size() - 1; size3 >= size; size3--) {
            arrayList.add((a) this.f2044d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void W(w0 cb2) {
        k0 k0Var = this.f2053o;
        k0Var.getClass();
        Intrinsics.checkNotNullParameter(cb2, "cb");
        ((CopyOnWriteArrayList) k0Var.f2173b).add(new o0(cb2));
    }

    public final void X(Fragment fragment) {
        if (M(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        k1 k1Var = this.f2043c;
        synchronized (k1Var.f2174a) {
            k1Var.f2174a.remove(fragment);
        }
        fragment.mAdded = false;
        if (N(fragment)) {
            this.G = true;
        }
        fragment.mRemoving = true;
        f0(fragment);
    }

    public final void Y(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i7 < size) {
            if (!((a) arrayList.get(i7)).f2078p) {
                if (i10 != i7) {
                    B(arrayList, arrayList2, i10, i7);
                }
                i10 = i7 + 1;
                if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                    while (i10 < size && ((Boolean) arrayList2.get(i10)).booleanValue() && !((a) arrayList.get(i10)).f2078p) {
                        i10++;
                    }
                }
                B(arrayList, arrayList2, i7, i10);
                i7 = i10 - 1;
            }
            i7++;
        }
        if (i10 != size) {
            B(arrayList, arrayList2, i10, size);
        }
    }

    public final void Z(Bundle bundle) {
        k0 k0Var;
        int i7;
        boolean z5;
        int i10;
        j1 j1Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f2061w.f2038e.getClassLoader());
                this.f2051m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f2061w.f2038e.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        k1 k1Var = this.f2043c;
        HashMap map2 = k1Var.f2176c;
        HashMap map3 = k1Var.f2175b;
        map2.clear();
        map2.putAll(map);
        d1 d1Var = (d1) bundle.getParcelable("state");
        if (d1Var == null) {
            return;
        }
        map3.clear();
        Iterator it = d1Var.f2116d.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            k0Var = this.f2053o;
            i7 = 2;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = k1Var.i((String) it.next(), null);
            if (bundleI != null) {
                Fragment fragment = (Fragment) this.O.f2135b.get(((h1) bundleI.getParcelable("state")).f2154e);
                if (fragment != null) {
                    if (M(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    j1Var = new j1(k0Var, k1Var, fragment, bundleI);
                } else {
                    j1Var = new j1(this.f2053o, this.f2043c, this.f2061w.f2038e.getClassLoader(), J(), bundleI);
                }
                Fragment fragment2 = j1Var.f2168c;
                fragment2.mSavedFragmentState = bundleI;
                fragment2.mFragmentManager = this;
                if (M(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                j1Var.l(this.f2061w.f2038e.getClassLoader());
                k1Var.g(j1Var);
                j1Var.f2170e = this.f2060v;
            }
        }
        f1 f1Var = this.O;
        f1Var.getClass();
        Iterator it2 = new ArrayList(f1Var.f2135b.values()).iterator();
        while (true) {
            z5 = true;
            if (!it2.hasNext()) {
                break;
            }
            Fragment fragment3 = (Fragment) it2.next();
            if (map3.get(fragment3.mWho) == null) {
                if (M(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + d1Var.f2116d);
                }
                this.O.g(fragment3);
                fragment3.mFragmentManager = this;
                j1 j1Var2 = new j1(k0Var, k1Var, fragment3);
                j1Var2.f2170e = 1;
                j1Var2.k();
                fragment3.mRemoving = true;
                j1Var2.k();
            }
        }
        ArrayList<String> arrayList = d1Var.f2117e;
        k1Var.f2174a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment fragmentB = k1Var.b(str3);
                if (fragmentB == null) {
                    throw new IllegalStateException(s0.g.e("No instantiated fragment for (", str3, ")"));
                }
                if (M(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + fragmentB);
                }
                k1Var.a(fragmentB);
            }
        }
        if (d1Var.f2118i != null) {
            this.f2044d = new ArrayList(d1Var.f2118i.length);
            int i11 = 0;
            while (true) {
                b[] bVarArr = d1Var.f2118i;
                if (i11 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i11];
                ArrayList arrayList2 = bVar.f2094e;
                a aVar = new a(this);
                int[] iArr = bVar.f2093d;
                int i12 = 0;
                int i13 = 0;
                while (i12 < iArr.length) {
                    l1 l1Var = new l1();
                    int i14 = i12 + 1;
                    int i15 = i7;
                    l1Var.f2184a = iArr[i12];
                    if (M(i15)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i13 + " base fragment #" + iArr[i14]);
                    }
                    l1Var.f2191h = Lifecycle.State.values()[bVar.f2095i[i13]];
                    l1Var.f2192i = Lifecycle.State.values()[bVar.f2096v[i13]];
                    int i16 = i12 + 2;
                    l1Var.f2186c = iArr[i14] != 0 ? z5 : false;
                    int i17 = iArr[i16];
                    l1Var.f2187d = i17;
                    int i18 = iArr[i12 + 3];
                    l1Var.f2188e = i18;
                    int i19 = i12 + 5;
                    int i20 = iArr[i12 + 4];
                    l1Var.f2189f = i20;
                    i12 += 6;
                    int[] iArr2 = iArr;
                    int i21 = iArr2[i19];
                    l1Var.f2190g = i21;
                    aVar.f2066b = i17;
                    aVar.f2067c = i18;
                    aVar.f2068d = i20;
                    aVar.f2069e = i21;
                    aVar.b(l1Var);
                    i13++;
                    i7 = i15;
                    iArr = iArr2;
                    z5 = true;
                }
                int i22 = i7;
                aVar.f2070f = bVar.f2097w;
                aVar.f2073i = bVar.f2098x;
                aVar.f2071g = true;
                aVar.j = bVar.E;
                aVar.k = bVar.F;
                aVar.f2074l = bVar.G;
                aVar.f2075m = bVar.H;
                aVar.f2076n = bVar.I;
                aVar.f2077o = bVar.J;
                aVar.f2078p = bVar.K;
                aVar.f2087t = bVar.f2099y;
                for (int i23 = 0; i23 < arrayList2.size(); i23++) {
                    String str4 = (String) arrayList2.get(i23);
                    if (str4 != null) {
                        ((l1) aVar.f2065a.get(i23)).f2185b = k1Var.b(str4);
                    }
                }
                aVar.j(1);
                if (M(i22)) {
                    StringBuilder sbS = a3.e.s(i11, "restoreAllState: back stack #", " (index ");
                    sbS.append(aVar.f2087t);
                    sbS.append("): ");
                    sbS.append(aVar);
                    Log.v("FragmentManager", sbS.toString());
                    PrintWriter printWriter = new PrintWriter(new u1());
                    aVar.n("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2044d.add(aVar);
                i11++;
                i7 = i22;
                z5 = true;
            }
            i10 = 0;
        } else {
            i10 = 0;
            this.f2044d = new ArrayList();
        }
        this.k.set(d1Var.f2119v);
        String str5 = d1Var.f2120w;
        if (str5 != null) {
            Fragment fragmentB2 = k1Var.b(str5);
            this.f2064z = fragmentB2;
            r(fragmentB2);
        }
        ArrayList arrayList3 = d1Var.f2121x;
        if (arrayList3 != null) {
            for (int i24 = i10; i24 < arrayList3.size(); i24++) {
                this.f2050l.put((String) arrayList3.get(i24), (c) d1Var.f2122y.get(i24));
            }
        }
        this.F = new ArrayDeque(d1Var.E);
    }

    public final j1 a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            p2.d.d(fragment, str);
        }
        if (M(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        j1 j1VarG = g(fragment);
        fragment.mFragmentManager = this;
        k1 k1Var = this.f2043c;
        k1Var.g(j1VarG);
        if (!fragment.mDetached) {
            k1Var.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (N(fragment)) {
                this.G = true;
            }
        }
        return j1VarG;
    }

    public final Bundle a0() {
        ArrayList arrayList;
        b[] bVarArr;
        Bundle bundle = new Bundle();
        G();
        w();
        z(true);
        this.H = true;
        this.O.f2140g = true;
        k1 k1Var = this.f2043c;
        k1Var.getClass();
        HashMap map = k1Var.f2175b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (j1 j1Var : map.values()) {
            if (j1Var != null) {
                Fragment fragment = j1Var.f2168c;
                k1Var.i(fragment.mWho, j1Var.n());
                arrayList2.add(fragment.mWho);
                if (M(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = this.f2043c.f2176c;
        if (!map2.isEmpty()) {
            k1 k1Var2 = this.f2043c;
            synchronized (k1Var2.f2174a) {
                try {
                    if (k1Var2.f2174a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(k1Var2.f2174a.size());
                        for (Fragment fragment2 : k1Var2.f2174a) {
                            arrayList.add(fragment2.mWho);
                            if (M(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int size = this.f2044d.size();
            if (size > 0) {
                bVarArr = new b[size];
                for (int i7 = 0; i7 < size; i7++) {
                    bVarArr[i7] = new b((a) this.f2044d.get(i7));
                    if (M(2)) {
                        StringBuilder sbS = a3.e.s(i7, "saveAllState: adding back stack #", ": ");
                        sbS.append(this.f2044d.get(i7));
                        Log.v("FragmentManager", sbS.toString());
                    }
                }
            } else {
                bVarArr = null;
            }
            d1 d1Var = new d1();
            d1Var.f2120w = null;
            ArrayList arrayList3 = new ArrayList();
            d1Var.f2121x = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            d1Var.f2122y = arrayList4;
            d1Var.f2116d = arrayList2;
            d1Var.f2117e = arrayList;
            d1Var.f2118i = bVarArr;
            d1Var.f2119v = this.k.get();
            Fragment fragment3 = this.f2064z;
            if (fragment3 != null) {
                d1Var.f2120w = fragment3.mWho;
            }
            arrayList3.addAll(this.f2050l.keySet());
            arrayList4.addAll(this.f2050l.values());
            d1Var.E = new ArrayList(this.F);
            bundle.putParcelable("state", d1Var);
            for (String str : this.f2051m.keySet()) {
                bundle.putBundle(a3.e.l("result_", str), (Bundle) this.f2051m.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(a3.e.l("fragment_", str2), (Bundle) map2.get(str2));
            }
        } else if (M(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(FragmentHostCallback fragmentHostCallback, FragmentContainer fragmentContainer, Fragment fragment) {
        LifecycleOwner lifecycleOwner;
        if (this.f2061w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2061w = fragmentHostCallback;
        this.f2062x = fragmentContainer;
        this.f2063y = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2054p;
        if (fragment != null) {
            copyOnWriteArrayList.add(new u0(fragment));
        } else if (fragmentHostCallback instanceof g1) {
            copyOnWriteArrayList.add((g1) fragmentHostCallback);
        }
        if (this.f2063y != null) {
            i0();
        }
        if (fragmentHostCallback instanceof e.t) {
            e.t tVar = (e.t) fragmentHostCallback;
            OnBackPressedDispatcher onBackPressedDispatcher = tVar.getOnBackPressedDispatcher();
            this.f2047g = onBackPressedDispatcher;
            if (fragment != null) {
                lifecycleOwner = tVar;
                lifecycleOwner = fragment;
            }
            lifecycleOwner = tVar;
            onBackPressedDispatcher.a(lifecycleOwner, this.j);
        }
        if (fragment != null) {
            f1 f1Var = fragment.mFragmentManager.O;
            HashMap map = f1Var.f2136c;
            f1 f1Var2 = (f1) map.get(fragment.mWho);
            if (f1Var2 == null) {
                f1Var2 = new f1(f1Var.f2138e);
                map.put(fragment.mWho, f1Var2);
            }
            this.O = f1Var2;
        } else if (fragmentHostCallback instanceof androidx.lifecycle.c1) {
            ViewModelStore store = ((androidx.lifecycle.c1) fragmentHostCallback).getViewModelStore();
            Intrinsics.checkNotNullParameter(store, "store");
            e1 factory = f1.f2134h;
            Intrinsics.checkNotNullParameter(factory, "factory");
            t2.a defaultCreationExtras = t2.a.f20587b;
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
            com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(store, factory, defaultCreationExtras);
            Intrinsics.checkNotNullParameter(f1.class, "modelClass");
            Intrinsics.checkNotNullParameter(f1.class, "<this>");
            KClass modelClass = Reflection.getOrCreateKotlinClass(f1.class);
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            String qualifiedName = modelClass != null ? modelClass.getQualifiedName() : null;
            if (qualifiedName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.O = (f1) rVar.g("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), modelClass);
        } else {
            this.O = new f1(false);
        }
        this.O.f2140g = Q();
        this.f2043c.f2177d = this.O;
        Object obj = this.f2061w;
        if ((obj instanceof d3.e) && fragment == null) {
            SavedStateRegistry savedStateRegistry = ((d3.e) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new g0(1, this));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                Z(bundleA);
            }
        }
        Object obj2 = this.f2061w;
        if (obj2 instanceof f.g) {
            ActivityResultRegistry activityResultRegistry = ((f.g) obj2).getActivityResultRegistry();
            String strL = a3.e.l("FragmentManager:", fragment != null ? com.discord.chat.presentation.list.a.k(new StringBuilder(), fragment.mWho, ":") : "");
            this.C = activityResultRegistry.c(kk.b.j(strL, "StartActivityForResult"), new v0(3), new q0(this, 1));
            this.D = activityResultRegistry.c(kk.b.j(strL, "StartIntentSenderForResult"), new v0(0), new q0(this, 2));
            this.E = activityResultRegistry.c(kk.b.j(strL, "RequestPermissions"), new v0(2), new q0(this, 0));
        }
        Object obj3 = this.f2061w;
        if (obj3 instanceof y0.f) {
            ((y0.f) obj3).addOnConfigurationChangedListener(this.f2055q);
        }
        Object obj4 = this.f2061w;
        if (obj4 instanceof y0.g) {
            ((y0.g) obj4).addOnTrimMemoryListener(this.f2056r);
        }
        Object obj5 = this.f2061w;
        if (obj5 instanceof x0.c1) {
            ((x0.c1) obj5).addOnMultiWindowModeChangedListener(this.f2057s);
        }
        Object obj6 = this.f2061w;
        if (obj6 instanceof x0.d1) {
            ((x0.d1) obj6).addOnPictureInPictureModeChangedListener(this.f2058t);
        }
        Object obj7 = this.f2061w;
        if ((obj7 instanceof androidx.core.view.k) && fragment == null) {
            ((androidx.core.view.k) obj7).addMenuProvider(this.f2059u);
        }
    }

    public final void b0() {
        synchronized (this.f2041a) {
            try {
                if (this.f2041a.size() == 1) {
                    this.f2061w.f2039i.removeCallbacks(this.P);
                    this.f2061w.f2039i.post(this.P);
                    i0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(Fragment fragment) {
        if (M(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f2043c.a(fragment);
            if (M(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (N(fragment)) {
                this.G = true;
            }
        }
    }

    public final void c0(Fragment fragment, boolean z5) {
        ViewGroup viewGroupI = I(fragment);
        if (viewGroupI == null || !(viewGroupI instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupI).setDrawDisappearingViewsLast(!z5);
    }

    public final void d() {
        this.f2042b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(this.f2043c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final HashSet e() {
        Object sVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.f2043c.d().iterator();
        while (it.hasNext()) {
            ViewGroup container = ((j1) it.next()).f2168c.mContainer;
            if (container != null) {
                k8.a factory = K();
                Intrinsics.checkNotNullParameter(container, "container");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object tag = container.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof b2) {
                    sVar = (b2) tag;
                } else {
                    factory.getClass();
                    Intrinsics.checkNotNullParameter(container, "container");
                    sVar = new s(container);
                    Intrinsics.checkNotNullExpressionValue(sVar, "factory.createController(container)");
                    container.setTag(R.id.special_effects_controller_view_tag, sVar);
                }
                hashSet.add(sVar);
            }
        }
        return hashSet;
    }

    public final void e0(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f2043c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.f2064z;
        this.f2064z = fragment;
        r(fragment2);
        r(this.f2064z);
    }

    public final HashSet f(ArrayList arrayList, int i7, int i10) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i7 < i10) {
            Iterator it = ((a) arrayList.get(i7)).f2065a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((l1) it.next()).f2185b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(b2.j(viewGroup, this));
                }
            }
            i7++;
        }
        return hashSet;
    }

    public final void f0(Fragment fragment) {
        ViewGroup viewGroupI = I(fragment);
        if (viewGroupI != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupI.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupI.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupI.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final j1 g(Fragment fragment) {
        String str = fragment.mWho;
        k1 k1Var = this.f2043c;
        j1 j1Var = (j1) k1Var.f2175b.get(str);
        if (j1Var != null) {
            return j1Var;
        }
        j1 j1Var2 = new j1(this.f2053o, k1Var, fragment);
        j1Var2.l(this.f2061w.f2038e.getClassLoader());
        j1Var2.f2170e = this.f2060v;
        return j1Var2;
    }

    public final void h(Fragment fragment) {
        if (M(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (M(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            k1 k1Var = this.f2043c;
            synchronized (k1Var.f2174a) {
                k1Var.f2174a.remove(fragment);
            }
            fragment.mAdded = false;
            if (N(fragment)) {
                this.G = true;
            }
            f0(fragment);
        }
    }

    public final void h0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new u1());
        FragmentHostCallback fragmentHostCallback = this.f2061w;
        if (fragmentHostCallback != null) {
            try {
                fragmentHostCallback.d(printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw illegalStateException;
            }
        }
        try {
            v("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw illegalStateException;
        }
    }

    public final void i(boolean z5, Configuration configuration) {
        if (z5 && (this.f2061w instanceof y0.f)) {
            h0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f2043c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z5) {
                    fragment.mChildFragmentManager.i(true, configuration);
                }
            }
        }
    }

    public final void i0() {
        synchronized (this.f2041a) {
            try {
                if (!this.f2041a.isEmpty()) {
                    this.j.setEnabled(true);
                    if (M(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z5 = this.f2044d.size() + (this.f2048h != null ? 1 : 0) > 0 && P(this.f2063y);
                if (M(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z5);
                }
                this.j.setEnabled(z5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean j(MenuItem menuItem) {
        if (this.f2060v < 1) {
            return false;
        }
        for (Fragment fragment : this.f2043c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.f2060v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z5 = false;
        for (Fragment fragment : this.f2043c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z5 = true;
            }
        }
        if (this.f2045e != null) {
            for (int i7 = 0; i7 < this.f2045e.size(); i7++) {
                Fragment fragment2 = (Fragment) this.f2045e.get(i7);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f2045e = arrayList;
        return z5;
    }

    public final void l() {
        boolean zIsChangingConfigurations = true;
        this.J = true;
        z(true);
        w();
        FragmentHostCallback fragmentHostCallback = this.f2061w;
        boolean z5 = fragmentHostCallback instanceof androidx.lifecycle.c1;
        k1 k1Var = this.f2043c;
        if (z5) {
            zIsChangingConfigurations = k1Var.f2177d.f2139f;
        } else {
            FragmentActivity fragmentActivity = fragmentHostCallback.f2038e;
            if (fragmentActivity != null) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.f2050l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((c) it.next()).f2108d.iterator();
                while (it2.hasNext()) {
                    k1Var.f2177d.e((String) it2.next(), false);
                }
            }
        }
        u(-1);
        Object obj = this.f2061w;
        if (obj instanceof y0.g) {
            ((y0.g) obj).removeOnTrimMemoryListener(this.f2056r);
        }
        Object obj2 = this.f2061w;
        if (obj2 instanceof y0.f) {
            ((y0.f) obj2).removeOnConfigurationChangedListener(this.f2055q);
        }
        Object obj3 = this.f2061w;
        if (obj3 instanceof x0.c1) {
            ((x0.c1) obj3).removeOnMultiWindowModeChangedListener(this.f2057s);
        }
        Object obj4 = this.f2061w;
        if (obj4 instanceof x0.d1) {
            ((x0.d1) obj4).removeOnPictureInPictureModeChangedListener(this.f2058t);
        }
        Object obj5 = this.f2061w;
        if ((obj5 instanceof androidx.core.view.k) && this.f2063y == null) {
            ((androidx.core.view.k) obj5).removeMenuProvider(this.f2059u);
        }
        this.f2061w = null;
        this.f2062x = null;
        this.f2063y = null;
        if (this.f2047g != null) {
            this.j.remove();
            this.f2047g = null;
        }
        f.f fVar = this.C;
        if (fVar != null) {
            fVar.b();
            this.D.b();
            this.E.b();
        }
    }

    public final void m(boolean z5) {
        if (z5 && (this.f2061w instanceof y0.g)) {
            h0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f2043c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z5) {
                    fragment.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void n(boolean z5, boolean z6) {
        if (z6 && (this.f2061w instanceof x0.c1)) {
            h0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f2043c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z5);
                if (z6) {
                    fragment.mChildFragmentManager.n(z5, true);
                }
            }
        }
    }

    public final void o() {
        for (Fragment fragment : this.f2043c.e()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.f2060v < 1) {
            return false;
        }
        for (Fragment fragment : this.f2043c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void q(Menu menu) {
        if (this.f2060v < 1) {
            return;
        }
        for (Fragment fragment : this.f2043c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void r(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f2043c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void s(boolean z5, boolean z6) {
        if (z6 && (this.f2061w instanceof x0.d1)) {
            h0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f2043c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z5);
                if (z6) {
                    fragment.mChildFragmentManager.s(z5, true);
                }
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z5 = false;
        if (this.f2060v < 1) {
            return false;
        }
        for (Fragment fragment : this.f2043c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z5 = true;
            }
        }
        return z5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f2063y;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f2063y)));
            sb2.append("}");
        } else {
            FragmentHostCallback fragmentHostCallback = this.f2061w;
            if (fragmentHostCallback != null) {
                sb2.append(fragmentHostCallback.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f2061w)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i7) {
        try {
            this.f2042b = true;
            for (j1 j1Var : this.f2043c.f2175b.values()) {
                if (j1Var != null) {
                    j1Var.f2170e = i7;
                }
            }
            R(i7, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((b2) it.next()).i();
            }
            this.f2042b = false;
            z(true);
        } catch (Throwable th2) {
            this.f2042b = false;
            throw th2;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strJ = kk.b.j(str, "    ");
        k1 k1Var = this.f2043c;
        ArrayList arrayList = k1Var.f2174a;
        String strJ2 = kk.b.j(str, "    ");
        HashMap map = k1Var.f2175b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (j1 j1Var : map.values()) {
                printWriter.print(str);
                if (j1Var != null) {
                    Fragment fragment = j1Var.f2168c;
                    printWriter.println(fragment);
                    fragment.dump(strJ2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i7 = 0; i7 < size2; i7++) {
                Fragment fragment2 = (Fragment) arrayList.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.f2045e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment3 = (Fragment) this.f2045e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.f2044d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size3; i11++) {
                a aVar = (a) this.f2044d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.n(strJ, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.f2041a) {
            try {
                int size4 = this.f2041a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size4; i12++) {
                        Object obj = (z0) this.f2041a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2061w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2062x);
        if (this.f2063y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2063y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2060v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((b2) it.next()).i();
        }
    }

    public final void x(z0 z0Var, boolean z5) {
        if (!z5) {
            if (this.f2061w == null) {
                if (!this.J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (Q()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f2041a) {
            try {
                if (this.f2061w == null) {
                    if (!z5) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f2041a.add(z0Var);
                    b0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void y(boolean z5) {
        if (this.f2042b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2061w == null) {
            if (!this.J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f2061w.f2039i.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z5 && Q()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }

    public final boolean z(boolean z5) {
        boolean zA;
        a aVar;
        y(z5);
        if (!this.f2049i && (aVar = this.f2048h) != null) {
            aVar.f2086s = false;
            aVar.k();
            if (M(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f2048h + " as part of execPendingActions for actions " + this.f2041a);
            }
            this.f2048h.l(false, false);
            this.f2041a.add(0, this.f2048h);
            Iterator it = this.f2048h.f2065a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((l1) it.next()).f2185b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f2048h = null;
        }
        boolean z6 = false;
        while (true) {
            ArrayList arrayList = this.L;
            ArrayList arrayList2 = this.M;
            synchronized (this.f2041a) {
                if (this.f2041a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f2041a.size();
                        zA = false;
                        for (int i7 = 0; i7 < size; i7++) {
                            zA |= ((z0) this.f2041a.get(i7)).a(arrayList, arrayList2);
                        }
                        this.f2041a.clear();
                        this.f2061w.f2039i.removeCallbacks(this.P);
                    } catch (Throwable th2) {
                        this.f2041a.clear();
                        this.f2061w.f2039i.removeCallbacks(this.P);
                        throw th2;
                    }
                }
            }
            if (!zA) {
                break;
            }
            this.f2042b = true;
            try {
                Y(this.L, this.M);
                d();
                z6 = true;
            } catch (Throwable th3) {
                d();
                throw th3;
            }
        }
        i0();
        if (this.K) {
            this.K = false;
            for (j1 j1Var : this.f2043c.d()) {
                Fragment fragment2 = j1Var.f2168c;
                if (fragment2.mDeferStart) {
                    if (this.f2042b) {
                        this.K = true;
                    } else {
                        fragment2.mDeferStart = false;
                        j1Var.k();
                    }
                }
            }
        }
        this.f2043c.f2175b.values().removeAll(Collections.singleton(null));
        return z6;
    }
}
