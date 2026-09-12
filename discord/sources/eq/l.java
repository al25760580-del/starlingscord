package eq;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vo.l0;
import yo.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Function1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f8642e = new l(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f8643i = new l(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l f8644v = new l(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final l f8645w = new l(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8646d;

    public /* synthetic */ l(int i7) {
        this.f8646d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8646d) {
            case 0:
                up.e it = (up.e) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.TRUE;
            case 1:
                k0 selectMostSpecificInEachOverridableGroup = (k0) obj;
                Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            case 2:
                l0 selectMostSpecificInEachOverridableGroup2 = (l0) obj;
                Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup2, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup2;
            default:
                vo.b selectMostSpecificInEachOverridableGroup3 = (vo.b) obj;
                Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup3, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup3;
        }
    }
}
