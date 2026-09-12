package ep;

import kotlin.Pair;
import kotlin.collections.w0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final up.c f8586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final up.c[] f8587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e4.r f8588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f8589d;

    static {
        up.c cVar = new up.c("org.jspecify.nullness");
        up.c cVar2 = new up.c("org.jspecify.annotations");
        f8586a = cVar2;
        up.c cVar3 = new up.c("io.reactivex.rxjava3.annotations");
        up.c cVar4 = new up.c("org.checkerframework.checker.nullness.compatqual");
        String str = cVar3.f21262a.f21265a;
        f8587b = new up.c[]{new up.c(kk.b.j(str, ".Nullable")), new up.c(kk.b.j(str, ".NonNull"))};
        up.c cVar5 = new up.c("org.jetbrains.annotations");
        t tVar = t.f8590d;
        Pair pair = new Pair(cVar5, tVar);
        Pair pair2 = new Pair(new up.c("androidx.annotation"), tVar);
        Pair pair3 = new Pair(new up.c("android.support.annotation"), tVar);
        Pair pair4 = new Pair(new up.c("android.annotation"), tVar);
        Pair pair5 = new Pair(new up.c("com.android.annotations"), tVar);
        Pair pair6 = new Pair(new up.c("org.eclipse.jdt.annotation"), tVar);
        Pair pair7 = new Pair(new up.c("org.checkerframework.checker.nullness.qual"), tVar);
        Pair pair8 = new Pair(cVar4, tVar);
        Pair pair9 = new Pair(new up.c("javax.annotation"), tVar);
        Pair pair10 = new Pair(new up.c("edu.umd.cs.findbugs.annotations"), tVar);
        Pair pair11 = new Pair(new up.c("io.reactivex.annotations"), tVar);
        up.c cVar6 = new up.c("androidx.annotation.RecentlyNullable");
        e0 e0Var = e0.WARN;
        Pair pair12 = new Pair(cVar6, new t(e0Var, 4));
        Pair pair13 = new Pair(new up.c("androidx.annotation.RecentlyNonNull"), new t(e0Var, 4));
        Pair pair14 = new Pair(new up.c("lombok"), tVar);
        rn.k kVar = new rn.k(2, 1, 0);
        e0 e0Var2 = e0.STRICT;
        f8588c = new e4.r(w0.g(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, new Pair(cVar, new t(e0Var, kVar, e0Var2)), new Pair(cVar2, new t(e0Var, new rn.k(2, 1, 0), e0Var2)), new Pair(cVar3, new t(e0Var, new rn.k(1, 8, 0), e0Var2))));
        f8589d = new t(e0Var, 4);
    }
}
