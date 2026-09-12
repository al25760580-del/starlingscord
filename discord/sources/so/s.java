package so;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 so.s[], still in use, count: 1, list:
  (r0v1 so.s[]) from 0x003e: INVOKE (r0v1 so.s[]) STATIC call: com.facebook.imagepipeline.nativecode.b.l(java.lang.Enum[]):yn.a A[MD:(java.lang.Enum[]):yn.a (m)] (LINE:63)
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
public final class s {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(yk.a.n("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(yk.a.n("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(yk.a.n("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(yk.a.n("kotlin/ULong", false));


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final up.b f20417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final up.e f20418e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final up.b f20419i;

    static {
        com.facebook.imagepipeline.nativecode.b.l(sVarArr);
    }

    public s(up.b bVar) {
        super(str, i);
        this.f20417d = bVar;
        up.e eVarF = bVar.f();
        this.f20418e = eVarF;
        up.c cVar = bVar.f21258a;
        up.e eVarE = up.e.e(eVarF.b() + "Array");
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        this.f20419i = new up.b(cVar, eVarE);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f20416v.clone();
    }
}
