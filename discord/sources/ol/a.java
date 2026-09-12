package ol;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ol.a[], still in use, count: 1, list:
  (r0v1 ol.a[]) from 0x001e: INVOKE (r0v1 ol.a[]) STATIC call: com.facebook.imagepipeline.nativecode.b.l(java.lang.Enum[]):yn.a A[MD:(java.lang.Enum[]):yn.a (m), WRAPPED] (LINE:31)
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
    CACHES_DIRECTORY("cachesDirectory"),
    DOCUMENT_DIRECTORY("documentDirectory");


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q8.c f17427e = new q8.c();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ yn.a f17431x;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17432d;

    static {
        f17431x = com.facebook.imagepipeline.nativecode.b.l(new a[]{r0, r1});
    }

    public a(String str) {
        super(str, i);
        this.f17432d = str;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f17430w.clone();
    }
}
