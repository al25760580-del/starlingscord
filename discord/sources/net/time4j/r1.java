package net.time4j;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 implements xr.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s1 f16705e;

    public /* synthetic */ r1(s1 s1Var, int i7) {
        this.f16704d = i7;
        this.f16705e = s1Var;
    }

    public int a(x0 x0Var) {
        s1 s1Var = this.f16705e;
        int iX = s1Var.m() ? x0Var.x() : x0Var.f16788i;
        int iE = e(x0Var, 0);
        if (iE > iX) {
            return (((f(x0Var, -1) + iX) - e(x0Var, -1)) / 7) + 1;
        }
        int i7 = ((iX - iE) / 7) + 1;
        if (i7 >= 53 || (!s1Var.m() && i7 >= 5)) {
            if (f(x0Var, 0) + e(x0Var, 1) <= iX) {
                return 1;
            }
        }
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r4 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
    
        if (r8 <= h(r2, 1)) goto L41;
     */
    @Override // xr.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(xr.e r6, java.lang.Object r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.r1.b(xr.e, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // xr.j
    public final Object c(xr.e eVar) {
        switch (this.f16704d) {
            case 0:
                return Integer.valueOf(h((x0) eVar.d(x0.J), 0));
            default:
                return Integer.valueOf(a((x0) eVar.d(x0.J)));
        }
    }

    @Override // xr.j
    public final Object d(xr.e eVar) {
        switch (this.f16704d) {
            case 0:
                return Integer.valueOf(h((x0) eVar.d(x0.J), 1));
            default:
                return Integer.valueOf(g((x0) eVar.d(x0.J)));
        }
    }

    public int e(x0 x0Var, int i7) {
        p1 p1VarD;
        s1 s1Var = this.f16705e;
        if (s1Var.m()) {
            p1VarD = p1.d(xr.m.r(x0Var.f16786d + i7, 1, 1));
        } else {
            int i10 = x0Var.f16786d;
            int i11 = x0Var.f16787e + i7;
            if (i11 == 0) {
                i10--;
                i11 = 12;
            } else if (i11 == 13) {
                i10++;
                i11 = 1;
            } else if (i11 == 14) {
                i10++;
                i11 = 2;
            }
            p1VarD = p1.d(xr.m.r(i10, i11, 1));
        }
        v1 v1Var = s1Var.this$0;
        int iB = p1VarD.b(v1Var);
        return iB <= 8 - v1Var.f16773e ? 2 - iB : 9 - iB;
    }

    public int f(x0 x0Var, int i7) {
        if (this.f16705e.m()) {
            return xr.m.A(x0Var.f16786d + i7) ? 366 : 365;
        }
        int i10 = x0Var.f16786d;
        int i11 = x0Var.f16787e + i7;
        if (i11 == 0) {
            i10--;
            i11 = 12;
        } else if (i11 == 13) {
            i10++;
            i11 = 1;
        }
        return xr.m.t(i10, i11);
    }

    public int g(x0 x0Var) {
        int iX = this.f16705e.m() ? x0Var.x() : x0Var.f16788i;
        int iE = e(x0Var, 0);
        if (iE > iX) {
            return ((f(x0Var, -1) + iE) - e(x0Var, -1)) / 7;
        }
        int iF = f(x0Var, 0) + e(x0Var, 1);
        if (iF <= iX) {
            try {
                int iE2 = e(x0Var, 1);
                iF = e(x0Var, 2) + f(x0Var, 1);
                iE = iE2;
            } catch (RuntimeException unused) {
                iF += 7;
            }
        }
        return (iF - iE) / 7;
    }

    public int h(x0 x0Var, int i7) {
        int iT;
        s1 s1Var = this.f16705e;
        int iX = s1Var.m() ? x0Var.x() : x0Var.f16788i;
        x0Var.getClass();
        long jX = x0.V.x(x0Var);
        int i10 = x0Var.f16786d;
        v1 v1Var = v1.G;
        int iB = p1.d(yk.a.m(7, (jX - ((long) iX)) + 6) + 1).b(s1Var.this$0);
        int i11 = iB <= 8 - s1Var.this$0.f16773e ? 2 - iB : 9 - iB;
        if (i7 == -1) {
            iX = 1;
        } else if (i7 != 0) {
            if (i7 != 1) {
                throw new AssertionError(kk.b.h(i7, "Unexpected: "));
            }
            if (s1Var.m()) {
                iT = xr.m.A(i10) ? 366 : 365;
            } else {
                iT = xr.m.t(i10, x0Var.f16787e);
            }
            iX = iT;
        }
        return yk.a.j(iX - i11, 7) + 1;
    }
}
