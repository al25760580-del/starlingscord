package wo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.w0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v28 wo.n[], still in use, count: 1, list:
  (r0v28 wo.n[]) from 0x0234: INVOKE (r0v29 yn.a) = (r0v28 wo.n[]) STATIC call: com.facebook.imagepipeline.nativecode.b.l(java.lang.Enum[]):yn.a A[MD:(java.lang.Enum[]):yn.a (m)] (LINE:565)
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
public final class n {
    CLASS(true),
    ANNOTATION_CLASS(true),
    TYPE_PARAMETER(false),
    PROPERTY(true),
    FIELD(true),
    LOCAL_VARIABLE(true),
    VALUE_PARAMETER(true),
    CONSTRUCTOR(true),
    FUNCTION(true),
    PROPERTY_GETTER(true),
    PROPERTY_SETTER(true),
    TYPE(false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPRESSION(false),
    FILE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TYPEALIAS(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    CLASS_ONLY(false),
    OBJECT(false),
    STANDALONE_OBJECT(false),
    COMPANION_OBJECT(false),
    INTERFACE(false),
    ENUM_CLASS(false),
    ENUM_ENTRY(false),
    LOCAL_CLASS(false),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    BACKING_FIELD(true),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZER(false),
    /* JADX INFO: Fake field, exist only in values array */
    DESTRUCTURING_DECLARATION(false),
    /* JADX INFO: Fake field, exist only in values array */
    LAMBDA_EXPRESSION(false),
    /* JADX INFO: Fake field, exist only in values array */
    ANONYMOUS_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT_LITERAL(false);

    public static final List E;
    public static final List F;
    public static final List G;
    public static final List H;
    public static final List I;
    public static final List J;
    public static final List K;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f22396e;
    public static final /* synthetic */ yn.a h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f22400i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final List f22401v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final List f22402w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final List f22403x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final List f22404y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22405d;

    static {
        yn.a aVarL = com.facebook.imagepipeline.nativecode.b.l(nVarArr);
        h0 = aVarL;
        f22396e = new HashMap();
        kotlin.collections.e eVar = new kotlin.collections.e(aVarL);
        while (eVar.hasNext()) {
            n nVar = (n) eVar.next();
            f22396e.put(nVar.name(), nVar);
        }
        yn.a aVar = h0;
        ArrayList arrayList = new ArrayList();
        aVar.getClass();
        kotlin.collections.e eVar2 = new kotlin.collections.e(aVar);
        while (eVar2.hasNext()) {
            Object next = eVar2.next();
            if (((n) next).f22405d) {
                arrayList.add(next);
            }
        }
        CollectionsKt.l0(arrayList);
        CollectionsKt.l0(h0);
        n nVar2 = ANNOTATION_CLASS;
        n nVar3 = CLASS;
        f22400i = d0.g(nVar2, nVar3);
        f22401v = d0.g(LOCAL_CLASS, nVar3);
        f22402w = d0.g(CLASS_ONLY, nVar3);
        n nVar4 = COMPANION_OBJECT;
        n nVar5 = OBJECT;
        f22403x = d0.g(nVar4, nVar5, nVar3);
        f22404y = d0.g(STANDALONE_OBJECT, nVar5, nVar3);
        E = d0.g(INTERFACE, nVar3);
        F = d0.g(ENUM_CLASS, nVar3);
        n nVar6 = ENUM_ENTRY;
        n nVar7 = PROPERTY;
        n nVar8 = FIELD;
        G = d0.g(nVar6, nVar7, nVar8);
        n nVar9 = PROPERTY_SETTER;
        H = c0.c(nVar9);
        n nVar10 = PROPERTY_GETTER;
        I = c0.c(nVar10);
        J = c0.c(FUNCTION);
        n nVar11 = FILE;
        K = c0.c(nVar11);
        d dVar = d.CONSTRUCTOR_PARAMETER;
        n nVar12 = VALUE_PARAMETER;
        w0.g(new Pair(dVar, nVar12), new Pair(d.FIELD, nVar8), new Pair(d.PROPERTY, nVar7), new Pair(d.FILE, nVar11), new Pair(d.PROPERTY_GETTER, nVar10), new Pair(d.PROPERTY_SETTER, nVar9), new Pair(d.RECEIVER, nVar12), new Pair(d.SETTER_PARAMETER, nVar12), new Pair(d.PROPERTY_DELEGATE_FIELD, nVar8));
    }

    public n(boolean z5) {
        super(str, i);
        this.f22405d = z5;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f22399g0.clone();
    }
}
