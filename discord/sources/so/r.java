package so;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 so.r[], still in use, count: 1, list:
  (r0v1 so.r[]) from 0x0046: INVOKE (r0v1 so.r[]) STATIC call: com.facebook.imagepipeline.nativecode.b.l(java.lang.Enum[]):yn.a A[MD:(java.lang.Enum[]):yn.a (m)] (LINE:71)
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
public final class r {
    UBYTEARRAY(yk.a.n("kotlin/UByteArray", false)),
    USHORTARRAY(yk.a.n("kotlin/UShortArray", false)),
    UINTARRAY(yk.a.n("kotlin/UIntArray", false)),
    ULONGARRAY(yk.a.n("kotlin/ULongArray", false));


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final up.e f20415d;

    static {
        com.facebook.imagepipeline.nativecode.b.l(rVarArr);
    }

    public r(up.b bVar) {
        super(str, i);
        this.f20415d = bVar.f();
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f20414x.clone();
    }
}
