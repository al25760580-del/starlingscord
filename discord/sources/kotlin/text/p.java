package kotlin.text;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 kotlin.text.p[], still in use, count: 1, list:
  (r0v1 kotlin.text.p[]) from 0x0064: INVOKE (r0v1 kotlin.text.p[]) STATIC call: com.facebook.imagepipeline.nativecode.b.l(java.lang.Enum[]):yn.a A[MD:(java.lang.Enum[]):yn.a (m)] (LINE:101)
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
public final class p {
    IGNORE_CASE(2, 0, 2, null),
    MULTILINE(8, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    LITERAL(16, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    UNIX_LINES(1, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS(4, 0, 2, null),
    DOT_MATCHES_ALL(32, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    CANON_EQ(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 0, 2, null);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14743d;

    static {
        com.facebook.imagepipeline.nativecode.b.l(pVarArr);
    }

    public p(int i7, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        super(str, i);
        this.f14743d = i7;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f14742w.clone();
    }
}
