package lq;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 lq.e1[], still in use, count: 1, list:
  (r0v1 lq.e1[]) from 0x002a: INVOKE (r0v1 lq.e1[]) STATIC call: com.facebook.imagepipeline.nativecode.b.l(java.lang.Enum[]):yn.a A[MD:(java.lang.Enum[]):yn.a (m)] (LINE:43)
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
public final class e1 {
    INVARIANT("", true),
    IN_VARIANCE("in", false),
    OUT_VARIANCE("out", true);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15201e;

    static {
        com.facebook.imagepipeline.nativecode.b.l(e1VarArr);
    }

    public e1(String str, boolean z5) {
        super(str, i);
        this.f15200d = str;
        this.f15201e = z5;
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) f15199x.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f15200d;
    }
}
