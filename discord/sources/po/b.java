package po;

import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f18059e = new b(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f18060i = new b(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f18061v = new b(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f18062w = new b(3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f18063x = new b(4);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f18064y = new b(5);
    public static final b E = new b(6);
    public static final b F = new b(7);
    public static final b G = new b(8);
    public static final b H = new b(9);
    public static final b I = new b(10);
    public static final b J = new b(11);

    public /* synthetic */ b(int i7) {
        this.f18065d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18065d) {
            case 0:
                Class it = (Class) obj;
                io.sentry.internal.debugmeta.c cVar = c.f18073a;
                Intrinsics.checkNotNullParameter(it, "it");
                return new b0(it);
            case 1:
                Class it2 = (Class) obj;
                io.sentry.internal.debugmeta.c cVar2 = c.f18073a;
                Intrinsics.checkNotNullParameter(it2, "it");
                return new u0(it2);
            case 2:
                Class it3 = (Class) obj;
                io.sentry.internal.debugmeta.c cVar3 = c.f18073a;
                Intrinsics.checkNotNullParameter(it3, "it");
                b0 b0VarA = c.a(it3);
                kotlin.collections.n0 n0Var = kotlin.collections.n0.f14659d;
                return xr.m.l(b0VarA, n0Var, false, n0Var);
            case 3:
                Class it4 = (Class) obj;
                io.sentry.internal.debugmeta.c cVar4 = c.f18073a;
                Intrinsics.checkNotNullParameter(it4, "it");
                b0 b0VarA2 = c.a(it4);
                kotlin.collections.n0 n0Var2 = kotlin.collections.n0.f14659d;
                return xr.m.l(b0VarA2, n0Var2, true, n0Var2);
            case 4:
                io.sentry.internal.debugmeta.c cVar5 = c.f18073a;
                Intrinsics.checkNotNullParameter((Class) obj, "it");
                return new ConcurrentHashMap();
            case 5:
                Class<?> returnType = ((Method) obj).getReturnType();
                Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                return bp.c.b(returnType);
            case 6:
                Class cls = (Class) obj;
                Intrinsics.checkNotNull(cls);
                return bp.c.b(cls);
            case 7:
                vo.l0 descriptor = (vo.l0) obj;
                Regex regex = g0.f18090d;
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                return wp.f.f22424c.v(descriptor) + " | " + y1.b(descriptor).e();
            case 8:
                vo.u descriptor2 = (vo.u) obj;
                Regex regex2 = g0.f18090d;
                Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
                return wp.f.f22424c.v(descriptor2) + " | " + y1.c(descriptor2).d();
            case 9:
                wp.h hVar = x1.f18192a;
                lq.z type = ((yo.q0) obj).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return x1.d(type);
            case 10:
                wp.h hVar2 = x1.f18192a;
                lq.z type2 = ((yo.q0) obj).getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                return x1.d(type2);
            default:
                Class cls2 = (Class) obj;
                Intrinsics.checkNotNull(cls2);
                return bp.c.b(cls2);
        }
    }
}
