package uo;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final up.e f21243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final up.e f21244b;

    static {
        up.e eVarE = up.e.e("getFirst");
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        f21243a = eVarE;
        up.e eVarE2 = up.e.e("getLast");
        Intrinsics.checkNotNullExpressionValue(eVarE2, "identifier(...)");
        f21244b = eVarE2;
    }
}
