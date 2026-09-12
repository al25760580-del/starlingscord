package hj;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 {
    public static t0 a(Object obj) {
        r rVar = (r) obj;
        t0 t0Var = rVar.f10902c;
        if (t0Var != t0.f10908e) {
            return t0Var;
        }
        t0 t0Var2 = new t0(0, new int[8], new Object[8], true);
        rVar.f10902c = t0Var2;
        return t0Var2;
    }

    public static boolean b(int i7, androidx.datastore.preferences.protobuf.g gVar, Object obj) throws v {
        j jVar = (j) gVar.f1863e;
        int i10 = gVar.f1860b;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            gVar.X(0);
            ((t0) obj).b(i11 << 3, Long.valueOf(jVar.n()));
            return true;
        }
        if (i12 == 1) {
            gVar.X(1);
            ((t0) obj).b((i11 << 3) | 1, Long.valueOf(jVar.k()));
            return true;
        }
        if (i12 == 2) {
            ((t0) obj).b((i11 << 3) | 2, gVar.j());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw v.b();
            }
            gVar.X(5);
            ((t0) obj).b(5 | (i11 << 3), Integer.valueOf(jVar.j()));
            return true;
        }
        t0 t0Var = new t0(0, new int[8], new Object[8], true);
        int i13 = i11 << 3;
        int i14 = i13 | 4;
        int i15 = i7 + 1;
        if (i15 >= 100) {
            throw new v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (gVar.b() != Integer.MAX_VALUE && b(i15, gVar, t0Var)) {
        }
        if (i14 != gVar.f1860b) {
            throw new v("Protocol message end-group tag did not match expected tag.");
        }
        if (t0Var.f10912d) {
            t0Var.f10912d = false;
        }
        ((t0) obj).b(i13 | 3, t0Var);
        return true;
    }
}
