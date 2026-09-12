package wo;

import kotlin.Pair;
import kotlin.collections.n0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import so.o;
import zp.x;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final up.e f22374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final up.e f22375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final up.e f22376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final up.e f22377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final up.e f22378e;

    static {
        up.e eVarE = up.e.e("message");
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        f22374a = eVarE;
        up.e eVarE2 = up.e.e("replaceWith");
        Intrinsics.checkNotNullExpressionValue(eVarE2, "identifier(...)");
        f22375b = eVarE2;
        up.e eVarE3 = up.e.e("level");
        Intrinsics.checkNotNullExpressionValue(eVarE3, "identifier(...)");
        f22376c = eVarE3;
        up.e eVarE4 = up.e.e("expression");
        Intrinsics.checkNotNullExpressionValue(eVarE4, "identifier(...)");
        f22377d = eVarE4;
        up.e eVarE5 = up.e.e("imports");
        Intrinsics.checkNotNullExpressionValue(eVarE5, "identifier(...)");
        f22378e = eVarE5;
    }

    public static final j a(so.i iVar, String message, String replaceWith, String level) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(replaceWith, "replaceWith");
        Intrinsics.checkNotNullParameter(level, "level");
        j value = new j(iVar, o.f20381o, w0.g(new Pair(f22377d, new x(replaceWith)), new Pair(f22378e, new zp.b(n0.f14659d, new so.g(iVar, 1)))));
        up.c cVar = o.f20379m;
        Pair pair = new Pair(f22374a, new x(message));
        Intrinsics.checkNotNullParameter(value, "value");
        Pair pair2 = new Pair(f22375b, new zp.a((Object) value));
        up.c topLevelFqName = o.f20380n;
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        up.b bVar = new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f());
        up.e eVarE = up.e.e(level);
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        return new j(iVar, cVar, w0.g(pair, pair2, new Pair(f22376c, new zp.i(bVar, eVarE))));
    }
}
