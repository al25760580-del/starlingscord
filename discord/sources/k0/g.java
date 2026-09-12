package k0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Lambda implements Function2 {
    public static final g E;
    public static final g F;
    public static final g G;
    public static final g H;
    public static final g I;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f14214e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f14215i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g f14216v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final g f14217w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final g f14218x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final g f14219y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14220d;

    static {
        int i7 = 2;
        f14214e = new g(i7, 0);
        f14215i = new g(i7, 1);
        f14216v = new g(i7, 2);
        f14217w = new g(i7, 3);
        f14218x = new g(i7, 4);
        f14219y = new g(i7, 5);
        E = new g(i7, 6);
        F = new g(i7, 7);
        G = new g(i7, 8);
        H = new g(i7, 9);
        I = new g(i7, 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i7, int i10) {
        super(i7);
        this.f14220d = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        Function function;
        switch (this.f14220d) {
            case 0:
                List list = (List) obj;
                List childValue = (List) obj2;
                Intrinsics.checkNotNullParameter(childValue, "childValue");
                if (list == null) {
                    return childValue;
                }
                ArrayList arrayListJ0 = CollectionsKt.j0(list);
                arrayListJ0.addAll(childValue);
                return arrayListJ0;
            case 1:
                Unit unit = (Unit) obj;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<anonymous parameter 1>");
                return unit;
            case 2:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<anonymous parameter 1>");
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 3:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<anonymous parameter 1>");
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 4:
                Intrinsics.checkNotNullParameter((String) obj2, "<anonymous parameter 1>");
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 5:
                if (obj != null) {
                    throw new ClassCastException();
                }
                obj2.getClass();
                throw new ClassCastException();
            case 6:
                String str2 = (String) obj;
                Intrinsics.checkNotNullParameter((String) obj2, "<anonymous parameter 1>");
                return str2;
            case 7:
                List list2 = (List) obj;
                List childValue2 = (List) obj2;
                Intrinsics.checkNotNullParameter(childValue2, "childValue");
                if (list2 == null) {
                    return childValue2;
                }
                ArrayList arrayListJ1 = CollectionsKt.j0(list2);
                arrayListJ1.addAll(childValue2);
                return arrayListJ1;
            case 8:
                Float f2 = (Float) obj;
                ((Number) obj2).floatValue();
                return f2;
            case 9:
                a aVar = (a) obj;
                a childValue3 = (a) obj2;
                Intrinsics.checkNotNullParameter(childValue3, "childValue");
                if (aVar == null || (str = aVar.f14207a) == null) {
                    str = childValue3.f14207a;
                }
                if (aVar == null || (function = aVar.f14208b) == null) {
                    function = childValue3.f14208b;
                }
                return new a(str, function);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
