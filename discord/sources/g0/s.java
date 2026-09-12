package g0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f9450a = new r();

    public static void a(t tVar, int i7, int i10) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        long jE = gn.h.e(i7, i10);
        long j = tVar.f9455w;
        int i11 = m0.d.f15346b;
        tVar.p(gn.h.e(((int) (jE >> 32)) + ((int) (j >> 32)), ((int) (jE & 4294967295L)) + ((int) (j & 4294967295L))));
    }
}
