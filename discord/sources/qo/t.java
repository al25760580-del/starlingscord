package qo;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends q implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f18967h;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(Method method, boolean z5, Object obj) {
        Intrinsics.checkNotNullParameter(method, "method");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : kotlin.collections.w.j(genericParameterTypes, 1, genericParameterTypes.length)));
        this.f18966g = z5;
        this.f18967h = obj;
    }

    @Override // qo.q, qo.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        zs.a.l(this, args);
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(this.f18967h);
        spreadBuilder.addSpread(args);
        return f(null, spreadBuilder.toArray(new Object[spreadBuilder.size()]));
    }
}
