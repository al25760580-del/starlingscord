package sq;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.d1;
import kotlin.collections.f1;
import kotlin.collections.w0;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final up.e f20528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final up.e f20529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final up.e f20530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final up.e f20531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final up.e f20532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final up.e f20533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final up.e f20534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final up.e f20535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final up.e f20536i;
    public static final up.e j;
    public static final up.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final up.e f20537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Regex f20538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final up.e f20539n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final up.e f20540o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final up.e f20541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final up.e f20542q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Set f20543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Set f20544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Set f20545t;

    static {
        up.e eVarE = up.e.e("getValue");
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        f20528a = eVarE;
        up.e eVarE2 = up.e.e("setValue");
        Intrinsics.checkNotNullExpressionValue(eVarE2, "identifier(...)");
        f20529b = eVarE2;
        up.e eVarE3 = up.e.e("provideDelegate");
        Intrinsics.checkNotNullExpressionValue(eVarE3, "identifier(...)");
        f20530c = eVarE3;
        up.e eVarE4 = up.e.e("equals");
        Intrinsics.checkNotNullExpressionValue(eVarE4, "identifier(...)");
        f20531d = eVarE4;
        Intrinsics.checkNotNullExpressionValue(up.e.e("hashCode"), "identifier(...)");
        up.e eVarE5 = up.e.e("compareTo");
        Intrinsics.checkNotNullExpressionValue(eVarE5, "identifier(...)");
        f20532e = eVarE5;
        up.e eVarE6 = up.e.e("contains");
        Intrinsics.checkNotNullExpressionValue(eVarE6, "identifier(...)");
        f20533f = eVarE6;
        up.e eVarE7 = up.e.e("invoke");
        Intrinsics.checkNotNullExpressionValue(eVarE7, "identifier(...)");
        f20534g = eVarE7;
        up.e eVarE8 = up.e.e("iterator");
        Intrinsics.checkNotNullExpressionValue(eVarE8, "identifier(...)");
        f20535h = eVarE8;
        up.e eVarE9 = up.e.e("get");
        Intrinsics.checkNotNullExpressionValue(eVarE9, "identifier(...)");
        f20536i = eVarE9;
        up.e eVarE10 = up.e.e("set");
        Intrinsics.checkNotNullExpressionValue(eVarE10, "identifier(...)");
        j = eVarE10;
        up.e eVarE11 = up.e.e("next");
        Intrinsics.checkNotNullExpressionValue(eVarE11, "identifier(...)");
        k = eVarE11;
        up.e eVarE12 = up.e.e("hasNext");
        Intrinsics.checkNotNullExpressionValue(eVarE12, "identifier(...)");
        f20537l = eVarE12;
        Intrinsics.checkNotNullExpressionValue(up.e.e("toString"), "identifier(...)");
        f20538m = new Regex("component\\d+");
        up.e eVarE13 = up.e.e("and");
        Intrinsics.checkNotNullExpressionValue(eVarE13, "identifier(...)");
        up.e eVarE14 = up.e.e("or");
        Intrinsics.checkNotNullExpressionValue(eVarE14, "identifier(...)");
        up.e eVarE15 = up.e.e("xor");
        Intrinsics.checkNotNullExpressionValue(eVarE15, "identifier(...)");
        up.e eVarE16 = up.e.e("inv");
        Intrinsics.checkNotNullExpressionValue(eVarE16, "identifier(...)");
        up.e eVarE17 = up.e.e("shl");
        Intrinsics.checkNotNullExpressionValue(eVarE17, "identifier(...)");
        up.e eVarE18 = up.e.e("shr");
        Intrinsics.checkNotNullExpressionValue(eVarE18, "identifier(...)");
        up.e eVarE19 = up.e.e("ushr");
        Intrinsics.checkNotNullExpressionValue(eVarE19, "identifier(...)");
        up.e eVarE20 = up.e.e("inc");
        Intrinsics.checkNotNullExpressionValue(eVarE20, "identifier(...)");
        f20539n = eVarE20;
        up.e eVarE21 = up.e.e("dec");
        Intrinsics.checkNotNullExpressionValue(eVarE21, "identifier(...)");
        f20540o = eVarE21;
        up.e eVarE22 = up.e.e("plus");
        Intrinsics.checkNotNullExpressionValue(eVarE22, "identifier(...)");
        up.e eVarE23 = up.e.e("minus");
        Intrinsics.checkNotNullExpressionValue(eVarE23, "identifier(...)");
        up.e eVarE24 = up.e.e("not");
        Intrinsics.checkNotNullExpressionValue(eVarE24, "identifier(...)");
        up.e eVarE25 = up.e.e("unaryMinus");
        Intrinsics.checkNotNullExpressionValue(eVarE25, "identifier(...)");
        up.e eVarE26 = up.e.e("unaryPlus");
        Intrinsics.checkNotNullExpressionValue(eVarE26, "identifier(...)");
        up.e eVarE27 = up.e.e("times");
        Intrinsics.checkNotNullExpressionValue(eVarE27, "identifier(...)");
        up.e eVarE28 = up.e.e("div");
        Intrinsics.checkNotNullExpressionValue(eVarE28, "identifier(...)");
        up.e eVarE29 = up.e.e("rem");
        Intrinsics.checkNotNullExpressionValue(eVarE29, "identifier(...)");
        up.e eVarE30 = up.e.e("rangeTo");
        Intrinsics.checkNotNullExpressionValue(eVarE30, "identifier(...)");
        f20541p = eVarE30;
        up.e eVarE31 = up.e.e("rangeUntil");
        Intrinsics.checkNotNullExpressionValue(eVarE31, "identifier(...)");
        f20542q = eVarE31;
        up.e eVarE32 = up.e.e("timesAssign");
        Intrinsics.checkNotNullExpressionValue(eVarE32, "identifier(...)");
        up.e eVarE33 = up.e.e("divAssign");
        Intrinsics.checkNotNullExpressionValue(eVarE33, "identifier(...)");
        up.e eVarE34 = up.e.e("remAssign");
        Intrinsics.checkNotNullExpressionValue(eVarE34, "identifier(...)");
        up.e eVarE35 = up.e.e("plusAssign");
        Intrinsics.checkNotNullExpressionValue(eVarE35, "identifier(...)");
        up.e eVarE36 = up.e.e("minusAssign");
        Intrinsics.checkNotNullExpressionValue(eVarE36, "identifier(...)");
        up.e eVarE37 = up.e.e("toDouble");
        Intrinsics.checkNotNullExpressionValue(eVarE37, "identifier(...)");
        up.e eVarE38 = up.e.e("toFloat");
        Intrinsics.checkNotNullExpressionValue(eVarE38, "identifier(...)");
        up.e eVarE39 = up.e.e("toLong");
        Intrinsics.checkNotNullExpressionValue(eVarE39, "identifier(...)");
        up.e eVarE40 = up.e.e("toInt");
        Intrinsics.checkNotNullExpressionValue(eVarE40, "identifier(...)");
        up.e eVarE41 = up.e.e("toChar");
        Intrinsics.checkNotNullExpressionValue(eVarE41, "identifier(...)");
        up.e eVarE42 = up.e.e("toShort");
        Intrinsics.checkNotNullExpressionValue(eVarE42, "identifier(...)");
        up.e eVarE43 = up.e.e("toByte");
        Intrinsics.checkNotNullExpressionValue(eVarE43, "identifier(...)");
        up.e[] elements = {eVarE20, eVarE21, eVarE26, eVarE25, eVarE24, eVarE16};
        Intrinsics.checkNotNullParameter(elements, "elements");
        y.J(elements);
        up.e[] elements2 = {eVarE26, eVarE25, eVarE24, eVarE16};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f20543r = y.J(elements2);
        up.e[] elements3 = {eVarE27, eVarE22, eVarE23, eVarE28, eVarE29, eVarE30, eVarE31};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        Set setJ = y.J(elements3);
        f20544s = setJ;
        up.e[] elements4 = {eVarE27, eVarE22, eVarE23, eVarE28, eVarE29};
        Intrinsics.checkNotNullParameter(elements4, "elements");
        y.J(elements4);
        up.e[] elements5 = {eVarE13, eVarE14, eVarE15, eVarE16, eVarE17, eVarE18, eVarE19};
        Intrinsics.checkNotNullParameter(elements5, "elements");
        Set setJ2 = y.J(elements5);
        up.e[] elements6 = {eVarE13, eVarE14, eVarE15, eVarE17, eVarE18, eVarE19};
        Intrinsics.checkNotNullParameter(elements6, "elements");
        y.J(elements6);
        LinkedHashSet linkedHashSetD = f1.d(setJ, setJ2);
        up.e[] elements7 = {eVarE4, eVarE6, eVarE5};
        Intrinsics.checkNotNullParameter(elements7, "elements");
        f1.d(linkedHashSetD, y.J(elements7));
        up.e[] elements8 = {eVarE32, eVarE33, eVarE34, eVarE35, eVarE36};
        Intrinsics.checkNotNullParameter(elements8, "elements");
        Set setJ3 = y.J(elements8);
        f20545t = setJ3;
        up.e[] elements9 = {eVarE, eVarE2, eVarE3};
        Intrinsics.checkNotNullParameter(elements9, "elements");
        y.J(elements9);
        f1.d(d1.b(eVarE10), setJ3);
        up.e[] elements10 = {eVarE37, eVarE38, eVarE39, eVarE40, eVarE42, eVarE43, eVarE41};
        Intrinsics.checkNotNullParameter(elements10, "elements");
        y.J(elements10);
        w0.g(new Pair(eVarE20, "++"), new Pair(eVarE21, "--"), new Pair(eVarE26, "+"), new Pair(eVarE25, "-"), new Pair(eVarE24, "!"), new Pair(eVarE27, "*"), new Pair(eVarE22, "+"), new Pair(eVarE23, "-"), new Pair(eVarE28, "/"), new Pair(eVarE29, "%"), new Pair(eVarE30, ".."), new Pair(eVarE31, "..<"));
    }
}
