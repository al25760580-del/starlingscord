package ip;

import java.lang.reflect.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import yo.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Function1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f13365e = new n(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f13366i = new n(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final n f13367v = new n(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final n f13368w = new n(3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final n f13369x = new n(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13370d;

    public /* synthetic */ n(int i7) {
        this.f13370d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f13370d) {
            case 0:
                bp.w it = (bp.w) obj;
                int i7 = p.f13373v;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!Modifier.isStatic(it.b().getModifiers()));
            case 1:
                k0 selectMostSpecificInEachOverridableGroup = (k0) obj;
                KProperty[] kPropertyArr = b0.f13319m;
                Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            case 2:
                bp.w it2 = (bp.w) obj;
                int i10 = e0.f13340p;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Boolean.valueOf(Modifier.isStatic(it2.b().getModifiers()));
            case 3:
                eq.o it3 = (eq.o) obj;
                int i11 = e0.f13340p;
                Intrinsics.checkNotNullParameter(it3, "it");
                return it3.f();
            default:
                int i12 = e0.f13340p;
                vo.i iVarG = ((lq.z) obj).r0().g();
                if (iVarG instanceof vo.f) {
                    return (vo.f) iVarG;
                }
                return null;
        }
    }
}
