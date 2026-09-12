package ep;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.f1;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final up.c f8506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final up.c f8507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final up.c f8508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final up.c f8509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final up.c f8510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final up.c f8511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final up.c f8512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final up.c f8513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final up.c f8514i;
    public static final Set j;
    public static final Set k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Set f8515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Set f8516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Set f8517n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Set f8518o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final up.c f8519p;

    static {
        up.c cVar = new up.c("org.jspecify.nullness.Nullable");
        up.c cVar2 = new up.c("org.jspecify.nullness.NullMarked");
        f8506a = cVar2;
        up.c cVar3 = new up.c("org.jspecify.nullness.NullnessUnspecified");
        up.c cVar4 = new up.c("org.jspecify.annotations.NonNull");
        up.c cVar5 = new up.c("org.jspecify.annotations.Nullable");
        up.c cVar6 = new up.c("org.jspecify.annotations.NullMarked");
        f8507b = cVar6;
        up.c cVar7 = new up.c("org.jspecify.annotations.NullnessUnspecified");
        up.c cVar8 = new up.c("org.jspecify.annotations.NullUnmarked");
        f8508c = cVar8;
        f8509d = new up.c("javax.annotation.meta.TypeQualifier");
        f8510e = new up.c("javax.annotation.meta.TypeQualifierNickname");
        f8511f = new up.c("javax.annotation.meta.TypeQualifierDefault");
        up.c cVar9 = new up.c("javax.annotation.Nonnull");
        f8512g = cVar9;
        up.c cVar10 = new up.c("javax.annotation.Nullable");
        up.c cVar11 = new up.c("javax.annotation.CheckForNull");
        f8513h = new up.c("javax.annotation.ParametersAreNonnullByDefault");
        f8514i = new up.c("javax.annotation.ParametersAreNullableByDefault");
        up.c[] elements = {cVar9, cVar11};
        Intrinsics.checkNotNullParameter(elements, "elements");
        j = kotlin.collections.y.J(elements);
        up.c[] elements2 = {a0.f8495h, cVar4, new up.c("android.annotation.NonNull"), new up.c("androidx.annotation.NonNull"), new up.c("androidx.annotation.RecentlyNonNull"), new up.c("android.support.annotation.NonNull"), new up.c("com.android.annotations.NonNull"), new up.c("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new up.c("org.checkerframework.checker.nullness.qual.NonNull"), new up.c("edu.umd.cs.findbugs.annotations.NonNull"), new up.c("io.reactivex.annotations.NonNull"), new up.c("io.reactivex.rxjava3.annotations.NonNull"), new up.c("org.eclipse.jdt.annotation.NonNull"), new up.c("lombok.NonNull")};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        Set setJ = kotlin.collections.y.J(elements2);
        k = setJ;
        up.c[] elements3 = {a0.f8496i, cVar, cVar5, cVar10, cVar11, new up.c("android.annotation.Nullable"), new up.c("androidx.annotation.Nullable"), new up.c("androidx.annotation.RecentlyNullable"), new up.c("android.support.annotation.Nullable"), new up.c("com.android.annotations.Nullable"), new up.c("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new up.c("org.checkerframework.checker.nullness.qual.Nullable"), new up.c("edu.umd.cs.findbugs.annotations.Nullable"), new up.c("edu.umd.cs.findbugs.annotations.PossiblyNull"), new up.c("edu.umd.cs.findbugs.annotations.CheckForNull"), new up.c("io.reactivex.annotations.Nullable"), new up.c("io.reactivex.rxjava3.annotations.Nullable"), new up.c("org.eclipse.jdt.annotation.Nullable")};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        Set setJ2 = kotlin.collections.y.J(elements3);
        f8515l = setJ2;
        up.c[] elements4 = {cVar3, cVar7};
        Intrinsics.checkNotNullParameter(elements4, "elements");
        f8516m = kotlin.collections.y.J(elements4);
        f1.e(f1.e(f1.e(f1.e(f1.d(f1.d(new LinkedHashSet(), setJ), setJ2), cVar9), cVar2), cVar6), cVar8);
        up.c[] elements5 = {a0.k, a0.f8497l};
        Intrinsics.checkNotNullParameter(elements5, "elements");
        f8517n = kotlin.collections.y.J(elements5);
        up.c[] elements6 = {a0.j, a0.f8498m};
        Intrinsics.checkNotNullParameter(elements6, "elements");
        f8518o = kotlin.collections.y.J(elements6);
        w0.g(new Pair(a0.f8490c, so.o.f20386t), new Pair(a0.f8491d, so.o.f20389w), new Pair(a0.f8492e, so.o.f20379m), new Pair(a0.f8493f, so.o.f20390x));
        f8519p = new up.c("kotlin.annotations.jvm.UnderMigration");
    }
}
