package wp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 wp.a[], still in use, count: 1, list:
  (r0v1 wp.a[]) from 0x0021: INVOKE (r0v1 wp.a[]) STATIC call: com.facebook.imagepipeline.nativecode.b.l(java.lang.Enum[]):yn.a A[MD:(java.lang.Enum[]):yn.a (m)] (LINE:34)
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
public final class a {
    NO_ARGUMENTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(2),
    /* JADX INFO: Fake field, exist only in values array */
    EF24("ALWAYS_PARENTHESIZED", 2);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f22409e;

    static {
        com.facebook.imagepipeline.nativecode.b.l(aVarArr);
    }

    public /* synthetic */ a(int i7) {
        this(str, i);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f22407v.clone();
    }

    public a(String str, int i7) {
        super(str, i7);
        this.f22408d = z;
        this.f22409e = z;
    }
}
