package bp;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f3334e = new b(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f3335i = new b(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f3336v = new b(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f3337w = new b(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3338d;

    public /* synthetic */ b(int i7) {
        this.f3338d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3338d) {
            case 0:
                ParameterizedType it = (ParameterizedType) obj;
                List list = c.f3339a;
                Intrinsics.checkNotNullParameter(it, "it");
                Type ownerType = it.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 1:
                ParameterizedType it2 = (ParameterizedType) obj;
                List list2 = c.f3339a;
                Intrinsics.checkNotNullParameter(it2, "it");
                Type[] actualTypeArguments = it2.getActualTypeArguments();
                Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
                return kotlin.collections.y.o(actualTypeArguments);
            case 2:
                String simpleName = ((Class) obj).getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                return Boolean.valueOf(simpleName.length() == 0);
            default:
                String simpleName2 = ((Class) obj).getSimpleName();
                if (!up.e.f(simpleName2)) {
                    simpleName2 = null;
                }
                if (simpleName2 != null) {
                    return up.e.e(simpleName2);
                }
                return null;
        }
    }
}
