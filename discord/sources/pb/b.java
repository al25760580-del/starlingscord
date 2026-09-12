package pb;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 pb.b[], still in use, count: 1, list:
  (r0v1 pb.b[]) from 0x0047: INVOKE (r0v1 pb.b[]) STATIC call: com.facebook.imagepipeline.nativecode.b.l(java.lang.Enum[]):yn.a A[MD:(java.lang.Enum[]):yn.a (m)] (LINE:72)
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
public final class b {
    LOCKED_PORTRAIT(1),
    LOCKED_LANDSCAPE(6),
    LOCKED_LANDSCAPE_LEFT(0),
    LOCKED_LANDSCAPE_RIGHT(8),
    UNLOCKED(4),
    UNSPECIFIED(-1);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17858d;

    static {
        com.facebook.imagepipeline.nativecode.b.l(bVarArr);
    }

    public b(int i7) {
        super(str, i);
        this.f17858d = i7;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) E.clone();
    }
}
