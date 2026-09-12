package androidx.fragment.app;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentTransaction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f2065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f2073i;
    public int j;
    public CharSequence k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f2075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f2076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f2077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f2079q;

    public final void b(l1 l1Var) {
        this.f2065a.add(l1Var);
        l1Var.f2187d = this.f2066b;
        l1Var.f2188e = this.f2067c;
        l1Var.f2189f = this.f2068d;
        l1Var.f2190g = this.f2069e;
    }

    public abstract int c();

    public abstract void d();

    public void e(int i7, Fragment fragment, String str, int i10) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            p2.d.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                throw new IllegalStateException(a3.e.o(sb2, fragment.mTag, " now ", str));
            }
            fragment.mTag = str;
        }
        if (i7 != 0) {
            if (i7 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i11 = fragment.mFragmentId;
            if (i11 != 0 && i11 != i7) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i7);
            }
            fragment.mFragmentId = i7;
            fragment.mContainerId = i7;
        }
        b(new l1(fragment, i10));
    }

    public void f(Fragment fragment) {
        b(new l1(fragment, 3));
    }

    public final void g(boolean z5, Runnable runnable) {
        if (!z5) {
            if (this.f2071g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            this.f2072h = false;
        }
        if (this.f2079q == null) {
            this.f2079q = new ArrayList();
        }
        this.f2079q.add(runnable);
    }

    public final void h(int i7, int i10) {
        this.f2066b = i7;
        this.f2067c = i10;
        this.f2068d = 0;
        this.f2069e = 0;
    }

    public void i(Fragment fragment) {
        b(new l1(fragment, 8));
    }
}
