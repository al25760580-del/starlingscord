package wp;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 wp.i[], still in use, count: 1, list:
  (r0v3 wp.i[]) from 0x00a8: INVOKE (r0v3 wp.i[]) STATIC call: com.facebook.imagepipeline.nativecode.b.l(java.lang.Enum[]):yn.a A[MD:(java.lang.Enum[]):yn.a (m)] (LINE:169)
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
public final class i {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f22430e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Set f22431i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22436d;

    static {
        com.facebook.imagepipeline.nativecode.b.l(new i[]{r0, r1, r3, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13});
        i[] iVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (i iVar : iVarArrValues) {
            if (iVar.f22436d) {
                arrayList.add(iVar);
            }
        }
        f22430e = CollectionsKt.l0(arrayList);
        f22431i = y.J(values());
    }

    public i(boolean z5) {
        super(str, i);
        this.f22436d = z5;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) O.clone();
    }
}
