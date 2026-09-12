package vo;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements Function1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f21838e = new r(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f21839i = new r(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final r f21840v = new r(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final r f21841w = new r(3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final r f21842x = new r(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21843d;

    public /* synthetic */ r(int i7) {
        this.f21843d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21843d) {
            case 0:
                Intrinsics.checkNotNullParameter((up.b) obj, "it");
                return 0;
            case 1:
                e0 it = (e0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ((yo.b0) it).f23420x;
            case 2:
                l it2 = (l) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Boolean.valueOf(it2 instanceof b);
            case 3:
                l it3 = (l) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return Boolean.valueOf(!(it3 instanceof k));
            default:
                l it4 = (l) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                List typeParameters = ((b) it4).getTypeParameters();
                Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
                return CollectionsKt.C(typeParameters);
        }
    }
}
