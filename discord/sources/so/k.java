package so;

import java.util.Set;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 so.k[], still in use, count: 1, list:
  (r0v1 so.k[]) from 0x0066: INVOKE (r0v1 so.k[]) STATIC call: com.facebook.imagepipeline.nativecode.b.l(java.lang.Enum[]):yn.a A[MD:(java.lang.Enum[]):yn.a (m)] (LINE:103)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class k {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Set f20349w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final up.e f20352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final up.e f20353e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f20354i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f20355v;

    static {
        k kVar = CHAR;
        k kVar2 = BYTE;
        k kVar3 = SHORT;
        k kVar4 = INT;
        k kVar5 = FLOAT;
        k kVar6 = LONG;
        k kVar7 = DOUBLE;
        com.facebook.imagepipeline.nativecode.b.l(kVarArr);
        k[] elements = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f20349w = y.J(elements);
    }

    public k(String str) {
        super(str, i);
        up.e eVarE = up.e.e(str);
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        this.f20352d = eVarE;
        up.e eVarE2 = up.e.e(str.concat("Array"));
        Intrinsics.checkNotNullExpressionValue(eVarE2, "identifier(...)");
        this.f20353e = eVarE2;
        rn.m mVar = rn.m.f19486e;
        this.f20354i = rn.l.a(mVar, new j(this, 0));
        this.f20355v = rn.l.a(mVar, new j(this, 1));
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) K.clone();
    }
}
