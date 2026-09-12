package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {
    public static boolean a(Object obj, g gVar) throws w {
        int iC = gVar.c();
        int i7 = iC >>> 3;
        int i10 = iC & 7;
        if (i10 == 0) {
            ((e1) obj).c(i7 << 3, Long.valueOf(gVar.C()));
            return true;
        }
        if (i10 == 1) {
            ((e1) obj).c((i7 << 3) | 1, Long.valueOf(gVar.t()));
            return true;
        }
        if (i10 == 2) {
            ((e1) obj).c((i7 << 3) | 2, gVar.i());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw w.b();
            }
            ((e1) obj).c((i7 << 3) | 5, Integer.valueOf(gVar.r()));
            return true;
        }
        e1 e1VarB = e1.b();
        int i11 = i7 << 3;
        int i12 = i11 | 4;
        while (gVar.b() != Integer.MAX_VALUE && a(e1VarB, gVar)) {
        }
        if (i12 != gVar.c()) {
            throw new w("Protocol message end-group tag did not match expected tag.");
        }
        e1VarB.f1846e = false;
        ((e1) obj).c(i11 | 3, e1VarB);
        return true;
    }
}
