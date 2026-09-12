package androidx.datastore.preferences.protobuf;

import android.view.View;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f1863e;

    public g(View view) {
        this.f1859a = 2;
        this.f1863e = view;
    }

    public int A() throws v {
        Y(0);
        return ((f) this.f1863e).l();
    }

    public void B(List list) throws hj.v, w {
        int iZ;
        int iV;
        switch (this.f1859a) {
            case 0:
                f fVar = (f) this.f1863e;
                int i7 = this.f1860b & 7;
                if (i7 == 0) {
                    do {
                        list.add(Integer.valueOf(fVar.l()));
                        if (fVar.c()) {
                            return;
                        } else {
                            iZ = fVar.z();
                        }
                    } while (iZ == this.f1860b);
                    this.f1862d = iZ;
                    return;
                }
                if (i7 != 2) {
                    throw w.b();
                }
                int iB = fVar.b() + fVar.A();
                do {
                    list.add(Integer.valueOf(fVar.l()));
                } while (fVar.b() < iB);
                W(iB);
                return;
            default:
                hj.j jVar = (hj.j) this.f1863e;
                int i10 = this.f1860b & 7;
                if (i10 == 0) {
                    do {
                        list.add(Integer.valueOf(jVar.m()));
                        if (jVar.c()) {
                            return;
                        } else {
                            iV = jVar.v();
                        }
                    } while (iV == this.f1860b);
                    this.f1862d = iV;
                    return;
                }
                if (i10 != 2) {
                    throw hj.v.b();
                }
                int iB2 = jVar.b() + jVar.w();
                do {
                    list.add(Integer.valueOf(jVar.m()));
                } while (jVar.b() < iB2);
                V(iB2);
                return;
        }
    }

    public long C() throws v {
        Y(0);
        return ((f) this.f1863e).m();
    }

    public void D(List list) throws hj.v, w {
        int iZ;
        int iV;
        switch (this.f1859a) {
            case 0:
                f fVar = (f) this.f1863e;
                int i7 = this.f1860b & 7;
                if (i7 == 0) {
                    do {
                        list.add(Long.valueOf(fVar.m()));
                        if (fVar.c()) {
                            return;
                        } else {
                            iZ = fVar.z();
                        }
                    } while (iZ == this.f1860b);
                    this.f1862d = iZ;
                    return;
                }
                if (i7 != 2) {
                    throw w.b();
                }
                int iB = fVar.b() + fVar.A();
                do {
                    list.add(Long.valueOf(fVar.m()));
                } while (fVar.b() < iB);
                W(iB);
                return;
            default:
                hj.j jVar = (hj.j) this.f1863e;
                int i10 = this.f1860b & 7;
                if (i10 == 0) {
                    do {
                        list.add(Long.valueOf(jVar.n()));
                        if (jVar.c()) {
                            return;
                        } else {
                            iV = jVar.v();
                        }
                    } while (iV == this.f1860b);
                    this.f1862d = iV;
                    return;
                }
                if (i10 != 2) {
                    throw hj.v.b();
                }
                int iB2 = jVar.b() + jVar.w();
                do {
                    list.add(Long.valueOf(jVar.n()));
                } while (jVar.b() < iB2);
                V(iB2);
                return;
        }
    }

    public Object E(v0 v0Var, k kVar) throws w {
        f fVar = (f) this.f1863e;
        int iA = fVar.A();
        if (fVar.f1847a >= 100) {
            throw new w("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iE = fVar.e(iA);
        Object objC = v0Var.c();
        fVar.f1847a++;
        v0Var.i(objC, this, kVar);
        v0Var.a(objC);
        fVar.a(0);
        fVar.f1847a--;
        fVar.d(iE);
        return objC;
    }

    public Object F(v0 v0Var, k kVar) throws v {
        Y(2);
        return E(v0Var, kVar);
    }

    public int G() throws v {
        Y(5);
        return ((f) this.f1863e).v();
    }

    public void H(List list) throws hj.v, w {
        int iZ;
        int iV;
        switch (this.f1859a) {
            case 0:
                f fVar = (f) this.f1863e;
                int i7 = this.f1860b & 7;
                if (i7 == 2) {
                    int iA = fVar.A();
                    if ((iA & 3) != 0) {
                        throw w.e();
                    }
                    int iB = fVar.b() + iA;
                    do {
                        list.add(Integer.valueOf(fVar.v()));
                    } while (fVar.b() < iB);
                    return;
                }
                if (i7 != 5) {
                    throw w.b();
                }
                do {
                    list.add(Integer.valueOf(fVar.v()));
                    if (fVar.c()) {
                        return;
                    } else {
                        iZ = fVar.z();
                    }
                } while (iZ == this.f1860b);
                this.f1862d = iZ;
                return;
            default:
                hj.j jVar = (hj.j) this.f1863e;
                int i10 = this.f1860b & 7;
                if (i10 == 2) {
                    int iW = jVar.w();
                    if ((iW & 3) != 0) {
                        throw new hj.v("Failed to parse the message.");
                    }
                    int iB2 = jVar.b() + iW;
                    do {
                        list.add(Integer.valueOf(jVar.p()));
                    } while (jVar.b() < iB2);
                    return;
                }
                if (i10 != 5) {
                    throw hj.v.b();
                }
                do {
                    list.add(Integer.valueOf(jVar.p()));
                    if (jVar.c()) {
                        return;
                    } else {
                        iV = jVar.v();
                    }
                } while (iV == this.f1860b);
                this.f1862d = iV;
                return;
        }
    }

    public long I() throws v {
        Y(1);
        return ((f) this.f1863e).w();
    }

    public void J(List list) throws hj.v, w {
        int iZ;
        int iV;
        switch (this.f1859a) {
            case 0:
                f fVar = (f) this.f1863e;
                int i7 = this.f1860b & 7;
                if (i7 == 1) {
                    do {
                        list.add(Long.valueOf(fVar.w()));
                        if (fVar.c()) {
                            return;
                        } else {
                            iZ = fVar.z();
                        }
                    } while (iZ == this.f1860b);
                    this.f1862d = iZ;
                    return;
                }
                if (i7 != 2) {
                    throw w.b();
                }
                int iA = fVar.A();
                if ((iA & 7) != 0) {
                    throw w.e();
                }
                int iB = fVar.b() + iA;
                do {
                    list.add(Long.valueOf(fVar.w()));
                } while (fVar.b() < iB);
                return;
            default:
                hj.j jVar = (hj.j) this.f1863e;
                int i10 = this.f1860b & 7;
                if (i10 == 1) {
                    do {
                        list.add(Long.valueOf(jVar.q()));
                        if (jVar.c()) {
                            return;
                        } else {
                            iV = jVar.v();
                        }
                    } while (iV == this.f1860b);
                    this.f1862d = iV;
                    return;
                }
                if (i10 != 2) {
                    throw hj.v.b();
                }
                int iW = jVar.w();
                if ((iW & 7) != 0) {
                    throw new hj.v("Failed to parse the message.");
                }
                int iB2 = jVar.b() + iW;
                do {
                    list.add(Long.valueOf(jVar.q()));
                } while (jVar.b() < iB2);
                return;
        }
    }

    public int K() throws v {
        Y(0);
        return ((f) this.f1863e).x();
    }

    public void L(List list) throws hj.v, w {
        int iZ;
        int iV;
        switch (this.f1859a) {
            case 0:
                f fVar = (f) this.f1863e;
                int i7 = this.f1860b & 7;
                if (i7 == 0) {
                    do {
                        list.add(Integer.valueOf(fVar.x()));
                        if (fVar.c()) {
                            return;
                        } else {
                            iZ = fVar.z();
                        }
                    } while (iZ == this.f1860b);
                    this.f1862d = iZ;
                    return;
                }
                if (i7 != 2) {
                    throw w.b();
                }
                int iB = fVar.b() + fVar.A();
                do {
                    list.add(Integer.valueOf(fVar.x()));
                } while (fVar.b() < iB);
                W(iB);
                return;
            default:
                hj.j jVar = (hj.j) this.f1863e;
                int i10 = this.f1860b & 7;
                if (i10 == 0) {
                    do {
                        list.add(Integer.valueOf(jVar.r()));
                        if (jVar.c()) {
                            return;
                        } else {
                            iV = jVar.v();
                        }
                    } while (iV == this.f1860b);
                    this.f1862d = iV;
                    return;
                }
                if (i10 != 2) {
                    throw hj.v.b();
                }
                int iB2 = jVar.b() + jVar.w();
                do {
                    list.add(Integer.valueOf(jVar.r()));
                } while (jVar.b() < iB2);
                V(iB2);
                return;
        }
    }

    public long M() throws v {
        Y(0);
        return ((f) this.f1863e).y();
    }

    public void N(List list) throws hj.v, w {
        int iZ;
        int iV;
        switch (this.f1859a) {
            case 0:
                f fVar = (f) this.f1863e;
                int i7 = this.f1860b & 7;
                if (i7 == 0) {
                    do {
                        list.add(Long.valueOf(fVar.y()));
                        if (fVar.c()) {
                            return;
                        } else {
                            iZ = fVar.z();
                        }
                    } while (iZ == this.f1860b);
                    this.f1862d = iZ;
                    return;
                }
                if (i7 != 2) {
                    throw w.b();
                }
                int iB = fVar.b() + fVar.A();
                do {
                    list.add(Long.valueOf(fVar.y()));
                } while (fVar.b() < iB);
                W(iB);
                return;
            default:
                hj.j jVar = (hj.j) this.f1863e;
                int i10 = this.f1860b & 7;
                if (i10 == 0) {
                    do {
                        list.add(Long.valueOf(jVar.s()));
                        if (jVar.c()) {
                            return;
                        } else {
                            iV = jVar.v();
                        }
                    } while (iV == this.f1860b);
                    this.f1862d = iV;
                    return;
                }
                if (i10 != 2) {
                    throw hj.v.b();
                }
                int iB2 = jVar.b() + jVar.w();
                do {
                    list.add(Long.valueOf(jVar.s()));
                } while (jVar.b() < iB2);
                V(iB2);
                return;
        }
    }

    public String O() throws v {
        Y(2);
        f fVar = (f) this.f1863e;
        byte[] bArr = fVar.f1850d;
        int iS = fVar.s();
        if (iS > 0) {
            int i7 = fVar.f1851e;
            int i10 = fVar.f1853g;
            if (iS <= i7 - i10) {
                String str = new String(bArr, i10, iS, u.f1936a);
                fVar.f1853g += iS;
                return str;
            }
        }
        if (iS == 0) {
            return "";
        }
        if (iS > fVar.f1851e) {
            return new String(fVar.n(iS), u.f1936a);
        }
        fVar.D(iS);
        String str2 = new String(bArr, fVar.f1853g, iS, u.f1936a);
        fVar.f1853g += iS;
        return str2;
    }

    public void P(List list, boolean z5) throws hj.u, v {
        int iZ;
        int iZ2;
        String strT;
        int iV;
        int iV2;
        switch (this.f1859a) {
            case 0:
                f fVar = (f) this.f1863e;
                if ((this.f1860b & 7) != 2) {
                    throw w.b();
                }
                if (!(list instanceof z) || z5) {
                    do {
                        list.add(z5 ? Q() : O());
                        if (fVar.c()) {
                            return;
                        } else {
                            iZ = fVar.z();
                        }
                    } while (iZ == this.f1860b);
                    this.f1862d = iZ;
                    return;
                }
                z zVar = (z) list;
                do {
                    zVar.u(i());
                    if (fVar.c()) {
                        return;
                    } else {
                        iZ2 = fVar.z();
                    }
                } while (iZ2 == this.f1860b);
                this.f1862d = iZ2;
                return;
            default:
                hj.j jVar = (hj.j) this.f1863e;
                if ((this.f1860b & 7) != 2) {
                    throw hj.v.b();
                }
                if ((list instanceof hj.x) && !z5) {
                    hj.x xVar = (hj.x) list;
                    do {
                        xVar.B(j());
                        if (jVar.c()) {
                            return;
                        } else {
                            iV2 = jVar.v();
                        }
                    } while (iV2 == this.f1860b);
                    this.f1862d = iV2;
                    return;
                }
                do {
                    if (z5) {
                        X(2);
                        strT = jVar.u();
                    } else {
                        X(2);
                        strT = jVar.t();
                    }
                    list.add(strT);
                    if (jVar.c()) {
                        return;
                    } else {
                        iV = jVar.v();
                    }
                } while (iV == this.f1860b);
                this.f1862d = iV;
                return;
        }
    }

    public String Q() throws v {
        Y(2);
        f fVar = (f) this.f1863e;
        byte[] bArrN = fVar.f1850d;
        int iS = fVar.s();
        int i7 = fVar.f1853g;
        int i10 = fVar.f1851e;
        if (iS <= i10 - i7 && iS > 0) {
            fVar.f1853g = i7 + iS;
        } else {
            if (iS == 0) {
                return "";
            }
            i7 = 0;
            if (iS <= i10) {
                fVar.D(iS);
                fVar.f1853g = iS;
            } else {
                bArrN = fVar.n(iS);
            }
        }
        return q1.f1929a.e(bArrN, i7, iS);
    }

    public int R() throws v {
        Y(0);
        return ((f) this.f1863e).A();
    }

    public void S(List list) throws hj.v, w {
        int iZ;
        int iV;
        switch (this.f1859a) {
            case 0:
                f fVar = (f) this.f1863e;
                int i7 = this.f1860b & 7;
                if (i7 == 0) {
                    do {
                        list.add(Integer.valueOf(fVar.A()));
                        if (fVar.c()) {
                            return;
                        } else {
                            iZ = fVar.z();
                        }
                    } while (iZ == this.f1860b);
                    this.f1862d = iZ;
                    return;
                }
                if (i7 != 2) {
                    throw w.b();
                }
                int iB = fVar.b() + fVar.A();
                do {
                    list.add(Integer.valueOf(fVar.A()));
                } while (fVar.b() < iB);
                W(iB);
                return;
            default:
                hj.j jVar = (hj.j) this.f1863e;
                int i10 = this.f1860b & 7;
                if (i10 == 0) {
                    do {
                        list.add(Integer.valueOf(jVar.w()));
                        if (jVar.c()) {
                            return;
                        } else {
                            iV = jVar.v();
                        }
                    } while (iV == this.f1860b);
                    this.f1862d = iV;
                    return;
                }
                if (i10 != 2) {
                    throw hj.v.b();
                }
                int iB2 = jVar.b() + jVar.w();
                do {
                    list.add(Integer.valueOf(jVar.w()));
                } while (jVar.b() < iB2);
                V(iB2);
                return;
        }
    }

    public long T() throws v {
        Y(0);
        return ((f) this.f1863e).B();
    }

    public void U(List list) throws hj.v, w {
        int iZ;
        int iV;
        switch (this.f1859a) {
            case 0:
                f fVar = (f) this.f1863e;
                int i7 = this.f1860b & 7;
                if (i7 == 0) {
                    do {
                        list.add(Long.valueOf(fVar.B()));
                        if (fVar.c()) {
                            return;
                        } else {
                            iZ = fVar.z();
                        }
                    } while (iZ == this.f1860b);
                    this.f1862d = iZ;
                    return;
                }
                if (i7 != 2) {
                    throw w.b();
                }
                int iB = fVar.b() + fVar.A();
                do {
                    list.add(Long.valueOf(fVar.B()));
                } while (fVar.b() < iB);
                W(iB);
                return;
            default:
                hj.j jVar = (hj.j) this.f1863e;
                int i10 = this.f1860b & 7;
                if (i10 == 0) {
                    do {
                        list.add(Long.valueOf(jVar.x()));
                        if (jVar.c()) {
                            return;
                        } else {
                            iV = jVar.v();
                        }
                    } while (iV == this.f1860b);
                    this.f1862d = iV;
                    return;
                }
                if (i10 != 2) {
                    throw hj.v.b();
                }
                int iB2 = jVar.b() + jVar.w();
                do {
                    list.add(Long.valueOf(jVar.x()));
                } while (jVar.b() < iB2);
                V(iB2);
                return;
        }
    }

    public void V(int i7) throws hj.v {
        if (((hj.j) this.f1863e).b() != i7) {
            throw hj.v.e();
        }
    }

    public void W(int i7) throws w {
        if (((f) this.f1863e).b() != i7) {
            throw w.f();
        }
    }

    public void X(int i7) throws hj.u {
        if ((this.f1860b & 7) != i7) {
            throw hj.v.b();
        }
    }

    public void Y(int i7) throws v {
        if ((this.f1860b & 7) != i7) {
            throw w.b();
        }
    }

    public boolean Z() {
        int i7;
        int i10;
        switch (this.f1859a) {
            case 0:
                f fVar = (f) this.f1863e;
                if (fVar.c() || (i7 = this.f1860b) == this.f1861c) {
                    return false;
                }
                return fVar.E(i7);
            default:
                hj.j jVar = (hj.j) this.f1863e;
                if (jVar.c() || (i10 = this.f1860b) == this.f1861c) {
                    return false;
                }
                return jVar.y(i10);
        }
    }

    public void a() {
        View view = (View) this.f1863e;
        int top = this.f1862d - (view.getTop() - this.f1860b);
        WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f1861c));
    }

    public int b() {
        switch (this.f1859a) {
            case 0:
                int i7 = this.f1862d;
                if (i7 != 0) {
                    this.f1860b = i7;
                    this.f1862d = 0;
                } else {
                    this.f1860b = ((f) this.f1863e).z();
                }
                int i10 = this.f1860b;
                if (i10 == 0 || i10 == this.f1861c) {
                    return Integer.MAX_VALUE;
                }
                return i10 >>> 3;
            default:
                int i11 = this.f1862d;
                if (i11 != 0) {
                    this.f1860b = i11;
                    this.f1862d = 0;
                } else {
                    this.f1860b = ((hj.j) this.f1863e).v();
                }
                int i12 = this.f1860b;
                if (i12 == 0 || i12 == this.f1861c) {
                    return Integer.MAX_VALUE;
                }
                return i12 >>> 3;
        }
    }

    public int c() {
        return this.f1860b;
    }

    public void d(hj.b bVar, hj.q0 q0Var, hj.l lVar) throws hj.u {
        X(3);
        e(bVar, q0Var, lVar);
    }

    public void e(Object obj, hj.q0 q0Var, hj.l lVar) {
        int i7 = this.f1861c;
        this.f1861c = ((this.f1860b >>> 3) << 3) | 4;
        try {
            q0Var.g(obj, this, lVar);
            if (this.f1860b != this.f1861c) {
                throw new hj.v("Failed to parse the message.");
            }
            this.f1861c = i7;
        } catch (Throwable th2) {
            this.f1861c = i7;
            throw th2;
        }
    }

    public void f(Object obj, hj.q0 q0Var, hj.l lVar) throws hj.v {
        hj.j jVar = (hj.j) this.f1863e;
        int iW = jVar.w();
        if (jVar.f10849a >= 100) {
            throw new hj.v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iE = jVar.e(iW);
        jVar.f10849a++;
        q0Var.g(obj, this, lVar);
        jVar.a(0);
        jVar.f10849a--;
        jVar.d(iE);
    }

    public boolean g() throws v {
        Y(0);
        return ((f) this.f1863e).f();
    }

    public void h(List list) throws hj.v, w {
        int iZ;
        int iV;
        switch (this.f1859a) {
            case 0:
                f fVar = (f) this.f1863e;
                int i7 = this.f1860b & 7;
                if (i7 == 0) {
                    do {
                        list.add(Boolean.valueOf(fVar.f()));
                        if (fVar.c()) {
                            return;
                        } else {
                            iZ = fVar.z();
                        }
                    } while (iZ == this.f1860b);
                    this.f1862d = iZ;
                    return;
                }
                if (i7 != 2) {
                    throw w.b();
                }
                int iB = fVar.b() + fVar.A();
                do {
                    list.add(Boolean.valueOf(fVar.f()));
                } while (fVar.b() < iB);
                W(iB);
                return;
            default:
                hj.j jVar = (hj.j) this.f1863e;
                int i10 = this.f1860b & 7;
                if (i10 == 0) {
                    do {
                        list.add(Boolean.valueOf(jVar.f()));
                        if (jVar.c()) {
                            return;
                        } else {
                            iV = jVar.v();
                        }
                    } while (iV == this.f1860b);
                    this.f1862d = iV;
                    return;
                }
                if (i10 != 2) {
                    throw hj.v.b();
                }
                int iB2 = jVar.b() + jVar.w();
                do {
                    list.add(Boolean.valueOf(jVar.f()));
                } while (jVar.b() < iB2);
                V(iB2);
                return;
        }
    }

    public e i() throws v {
        Y(2);
        f fVar = (f) this.f1863e;
        byte[] bArr = fVar.f1850d;
        int iS = fVar.s();
        int i7 = fVar.f1851e;
        int i10 = fVar.f1853g;
        if (iS <= i7 - i10 && iS > 0) {
            e eVarA = e.a(bArr, i10, iS);
            fVar.f1853g += iS;
            return eVarA;
        }
        if (iS == 0) {
            return e.f1835i;
        }
        byte[] bArrO = fVar.o(iS);
        if (bArrO != null) {
            return e.a(bArrO, 0, bArrO.length);
        }
        int i11 = fVar.f1853g;
        int i12 = fVar.f1851e;
        int length = i12 - i11;
        fVar.f1855i += i12;
        fVar.f1853g = 0;
        fVar.f1851e = 0;
        ArrayList<byte[]> arrayListP = fVar.p(iS - length);
        byte[] bArr2 = new byte[iS];
        System.arraycopy(bArr, i11, bArr2, 0, length);
        for (byte[] bArr3 : arrayListP) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        e eVar = e.f1835i;
        return new e(bArr2);
    }

    public hj.g j() throws hj.u {
        X(2);
        return ((hj.j) this.f1863e).g();
    }

    public void k(List list) throws hj.u, v {
        int iZ;
        int iV;
        switch (this.f1859a) {
            case 0:
                f fVar = (f) this.f1863e;
                if ((this.f1860b & 7) != 2) {
                    throw w.b();
                }
                do {
                    list.add(i());
                    if (fVar.c()) {
                        return;
                    } else {
                        iZ = fVar.z();
                    }
                } while (iZ == this.f1860b);
                this.f1862d = iZ;
                return;
            default:
                hj.j jVar = (hj.j) this.f1863e;
                if ((this.f1860b & 7) != 2) {
                    throw hj.v.b();
                }
                do {
                    list.add(j());
                    if (jVar.c()) {
                        return;
                    } else {
                        iV = jVar.v();
                    }
                } while (iV == this.f1860b);
                this.f1862d = iV;
                return;
        }
    }

    public double l() throws v {
        Y(1);
        return ((f) this.f1863e).g();
    }

    public void m(List list) throws hj.v, w {
        int iZ;
        int iV;
        switch (this.f1859a) {
            case 0:
                f fVar = (f) this.f1863e;
                int i7 = this.f1860b & 7;
                if (i7 == 1) {
                    do {
                        list.add(Double.valueOf(fVar.g()));
                        if (fVar.c()) {
                            return;
                        } else {
                            iZ = fVar.z();
                        }
                    } while (iZ == this.f1860b);
                    this.f1862d = iZ;
                    return;
                }
                if (i7 != 2) {
                    throw w.b();
                }
                int iA = fVar.A();
                if ((iA & 7) != 0) {
                    throw w.e();
                }
                int iB = fVar.b() + iA;
                do {
                    list.add(Double.valueOf(fVar.g()));
                } while (fVar.b() < iB);
                return;
            default:
                hj.j jVar = (hj.j) this.f1863e;
                int i10 = this.f1860b & 7;
                if (i10 == 1) {
                    do {
                        list.add(Double.valueOf(jVar.h()));
                        if (jVar.c()) {
                            return;
                        } else {
                            iV = jVar.v();
                        }
                    } while (iV == this.f1860b);
                    this.f1862d = iV;
                    return;
                }
                if (i10 != 2) {
                    throw hj.v.b();
                }
                int iW = jVar.w();
                if ((iW & 7) != 0) {
                    throw new hj.v("Failed to parse the message.");
                }
                int iB2 = jVar.b() + iW;
                do {
                    list.add(Double.valueOf(jVar.h()));
                } while (jVar.b() < iB2);
                return;
        }
    }

    public int n() throws v {
        Y(0);
        return ((f) this.f1863e).h();
    }

    public void o(List list) throws hj.v, w {
        int iZ;
        int iV;
        switch (this.f1859a) {
            case 0:
                f fVar = (f) this.f1863e;
                int i7 = this.f1860b & 7;
                if (i7 == 0) {
                    do {
                        list.add(Integer.valueOf(fVar.h()));
                        if (fVar.c()) {
                            return;
                        } else {
                            iZ = fVar.z();
                        }
                    } while (iZ == this.f1860b);
                    this.f1862d = iZ;
                    return;
                }
                if (i7 != 2) {
                    throw w.b();
                }
                int iB = fVar.b() + fVar.A();
                do {
                    list.add(Integer.valueOf(fVar.h()));
                } while (fVar.b() < iB);
                W(iB);
                return;
            default:
                hj.j jVar = (hj.j) this.f1863e;
                int i10 = this.f1860b & 7;
                if (i10 == 0) {
                    do {
                        list.add(Integer.valueOf(jVar.i()));
                        if (jVar.c()) {
                            return;
                        } else {
                            iV = jVar.v();
                        }
                    } while (iV == this.f1860b);
                    this.f1862d = iV;
                    return;
                }
                if (i10 != 2) {
                    throw hj.v.b();
                }
                int iB2 = jVar.b() + jVar.w();
                do {
                    list.add(Integer.valueOf(jVar.i()));
                } while (jVar.b() < iB2);
                V(iB2);
                return;
        }
    }

    public Object p(hj.j1 j1Var, Class cls, hj.l lVar) throws hj.v {
        hj.j jVar = (hj.j) this.f1863e;
        switch (j1Var.ordinal()) {
            case 0:
                X(1);
                return Double.valueOf(jVar.h());
            case 1:
                X(5);
                return Float.valueOf(jVar.l());
            case 2:
                X(0);
                return Long.valueOf(jVar.n());
            case 3:
                X(0);
                return Long.valueOf(jVar.x());
            case 4:
                X(0);
                return Integer.valueOf(jVar.m());
            case 5:
                X(1);
                return Long.valueOf(jVar.k());
            case 6:
                X(5);
                return Integer.valueOf(jVar.j());
            case 7:
                X(0);
                return Boolean.valueOf(jVar.f());
            case 8:
                X(2);
                return jVar.u();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                X(2);
                hj.q0 q0VarA = hj.n0.f10886c.a(cls);
                hj.r rVarC = q0VarA.c();
                f(rVarC, q0VarA, lVar);
                q0VarA.a(rVarC);
                return rVarC;
            case 11:
                return j();
            case 12:
                X(0);
                return Integer.valueOf(jVar.w());
            case 13:
                X(0);
                return Integer.valueOf(jVar.i());
            case 14:
                X(5);
                return Integer.valueOf(jVar.p());
            case 15:
                X(1);
                return Long.valueOf(jVar.q());
            case 16:
                X(0);
                return Integer.valueOf(jVar.r());
            case 17:
                X(0);
                return Long.valueOf(jVar.s());
        }
    }

    public Object q(v1 v1Var, Class cls, k kVar) throws v {
        switch (v1Var.ordinal()) {
            case 0:
                return Double.valueOf(l());
            case 1:
                return Float.valueOf(v());
            case 2:
                return Long.valueOf(C());
            case 3:
                return Long.valueOf(T());
            case 4:
                return Integer.valueOf(A());
            case 5:
                return Long.valueOf(t());
            case 6:
                return Integer.valueOf(r());
            case 7:
                return Boolean.valueOf(g());
            case 8:
                return Q();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                Y(2);
                return E(s0.f1930c.a(cls), kVar);
            case 11:
                return i();
            case 12:
                return Integer.valueOf(R());
            case 13:
                return Integer.valueOf(n());
            case 14:
                return Integer.valueOf(G());
            case 15:
                return Long.valueOf(I());
            case 16:
                return Integer.valueOf(K());
            case 17:
                return Long.valueOf(M());
        }
    }

    public int r() throws v {
        Y(5);
        return ((f) this.f1863e).i();
    }

    public void s(List list) throws hj.v, w {
        int iZ;
        int iV;
        switch (this.f1859a) {
            case 0:
                f fVar = (f) this.f1863e;
                int i7 = this.f1860b & 7;
                if (i7 == 2) {
                    int iA = fVar.A();
                    if ((iA & 3) != 0) {
                        throw w.e();
                    }
                    int iB = fVar.b() + iA;
                    do {
                        list.add(Integer.valueOf(fVar.i()));
                    } while (fVar.b() < iB);
                    return;
                }
                if (i7 != 5) {
                    throw w.b();
                }
                do {
                    list.add(Integer.valueOf(fVar.i()));
                    if (fVar.c()) {
                        return;
                    } else {
                        iZ = fVar.z();
                    }
                } while (iZ == this.f1860b);
                this.f1862d = iZ;
                return;
            default:
                hj.j jVar = (hj.j) this.f1863e;
                int i10 = this.f1860b & 7;
                if (i10 == 2) {
                    int iW = jVar.w();
                    if ((iW & 3) != 0) {
                        throw new hj.v("Failed to parse the message.");
                    }
                    int iB2 = jVar.b() + iW;
                    do {
                        list.add(Integer.valueOf(jVar.j()));
                    } while (jVar.b() < iB2);
                    return;
                }
                if (i10 != 5) {
                    throw hj.v.b();
                }
                do {
                    list.add(Integer.valueOf(jVar.j()));
                    if (jVar.c()) {
                        return;
                    } else {
                        iV = jVar.v();
                    }
                } while (iV == this.f1860b);
                this.f1862d = iV;
                return;
        }
    }

    public long t() throws v {
        Y(1);
        return ((f) this.f1863e).j();
    }

    public void u(List list) throws hj.v, w {
        int iZ;
        int iV;
        switch (this.f1859a) {
            case 0:
                f fVar = (f) this.f1863e;
                int i7 = this.f1860b & 7;
                if (i7 == 1) {
                    do {
                        list.add(Long.valueOf(fVar.j()));
                        if (fVar.c()) {
                            return;
                        } else {
                            iZ = fVar.z();
                        }
                    } while (iZ == this.f1860b);
                    this.f1862d = iZ;
                    return;
                }
                if (i7 != 2) {
                    throw w.b();
                }
                int iA = fVar.A();
                if ((iA & 7) != 0) {
                    throw w.e();
                }
                int iB = fVar.b() + iA;
                do {
                    list.add(Long.valueOf(fVar.j()));
                } while (fVar.b() < iB);
                return;
            default:
                hj.j jVar = (hj.j) this.f1863e;
                int i10 = this.f1860b & 7;
                if (i10 == 1) {
                    do {
                        list.add(Long.valueOf(jVar.k()));
                        if (jVar.c()) {
                            return;
                        } else {
                            iV = jVar.v();
                        }
                    } while (iV == this.f1860b);
                    this.f1862d = iV;
                    return;
                }
                if (i10 != 2) {
                    throw hj.v.b();
                }
                int iW = jVar.w();
                if ((iW & 7) != 0) {
                    throw new hj.v("Failed to parse the message.");
                }
                int iB2 = jVar.b() + iW;
                do {
                    list.add(Long.valueOf(jVar.k()));
                } while (jVar.b() < iB2);
                return;
        }
    }

    public float v() throws v {
        Y(5);
        return ((f) this.f1863e).k();
    }

    public void w(List list) throws hj.v, w {
        int iZ;
        int iV;
        switch (this.f1859a) {
            case 0:
                f fVar = (f) this.f1863e;
                int i7 = this.f1860b & 7;
                if (i7 == 2) {
                    int iA = fVar.A();
                    if ((iA & 3) != 0) {
                        throw w.e();
                    }
                    int iB = fVar.b() + iA;
                    do {
                        list.add(Float.valueOf(fVar.k()));
                    } while (fVar.b() < iB);
                    return;
                }
                if (i7 != 5) {
                    throw w.b();
                }
                do {
                    list.add(Float.valueOf(fVar.k()));
                    if (fVar.c()) {
                        return;
                    } else {
                        iZ = fVar.z();
                    }
                } while (iZ == this.f1860b);
                this.f1862d = iZ;
                return;
            default:
                hj.j jVar = (hj.j) this.f1863e;
                int i10 = this.f1860b & 7;
                if (i10 == 2) {
                    int iW = jVar.w();
                    if ((iW & 3) != 0) {
                        throw new hj.v("Failed to parse the message.");
                    }
                    int iB2 = jVar.b() + iW;
                    do {
                        list.add(Float.valueOf(jVar.l()));
                    } while (jVar.b() < iB2);
                    return;
                }
                if (i10 != 5) {
                    throw hj.v.b();
                }
                do {
                    list.add(Float.valueOf(jVar.l()));
                    if (jVar.c()) {
                        return;
                    } else {
                        iV = jVar.v();
                    }
                } while (iV == this.f1860b);
                this.f1862d = iV;
                return;
        }
    }

    public Object x(v0 v0Var, k kVar) {
        int i7 = this.f1861c;
        this.f1861c = ((this.f1860b >>> 3) << 3) | 4;
        try {
            Object objC = v0Var.c();
            v0Var.i(objC, this, kVar);
            v0Var.a(objC);
            if (this.f1860b != this.f1861c) {
                throw w.e();
            }
            this.f1861c = i7;
            return objC;
        } catch (Throwable th2) {
            this.f1861c = i7;
            throw th2;
        }
    }

    public Object y(v0 v0Var, k kVar) throws v {
        Y(3);
        return x(v0Var, kVar);
    }

    public void z(List list, v0 v0Var, k kVar) throws v {
        int iZ;
        f fVar = (f) this.f1863e;
        int i7 = this.f1860b;
        if ((i7 & 7) != 3) {
            throw w.b();
        }
        do {
            list.add(x(v0Var, kVar));
            if (fVar.c() || this.f1862d != 0) {
                return;
            } else {
                iZ = fVar.z();
            }
        } while (iZ == i7);
        this.f1862d = iZ;
    }

    public g(hj.j jVar) {
        this.f1859a = 1;
        this.f1862d = 0;
        Charset charset = hj.t.f10906a;
        this.f1863e = jVar;
        jVar.f10850b = this;
    }

    public g(f fVar) {
        this.f1859a = 0;
        this.f1862d = 0;
        Charset charset = u.f1936a;
        this.f1863e = fVar;
        fVar.f1848b = this;
    }
}
