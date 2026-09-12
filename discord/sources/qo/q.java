package qo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18963e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18964f;

    public /* synthetic */ q(Method method, boolean z5, int i7) {
        this(method, (i7 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z5, method.getGenericParameterTypes());
    }

    @Override // qo.g
    public Object call(Object[] args) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(args, "args");
        d(args);
        ((Field) this.f18970a).set(this.f18972c != null ? kotlin.collections.y.s(args) : null, kotlin.collections.y.B(args));
        return Unit.f14616a;
    }

    @Override // qo.w
    public void d(Object[] args) {
        switch (this.f18963e) {
            case 0:
                Intrinsics.checkNotNullParameter(args, "args");
                zs.a.l(this, args);
                if (this.f18964f && kotlin.collections.y.B(args) == null) {
                    throw new IllegalArgumentException("null is not allowed as a value for this property.");
                }
                return;
            default:
                super.d(args);
                return;
        }
    }

    public Object f(Object obj, Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.f18964f ? Unit.f14616a : ((Method) this.f18970a).invoke(obj, Arrays.copyOf(args, args.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(Method method, boolean z5, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        Intrinsics.checkNotNullExpressionValue(genericReturnType, "getGenericReturnType(...)");
        super(method, genericReturnType, z5 ? method.getDeclaringClass() : null, typeArr);
        this.f18964f = Intrinsics.areEqual(genericReturnType, Void.TYPE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(Field field, boolean z5, boolean z6) {
        Class TYPE = Void.TYPE;
        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
        super(field, TYPE, z6 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()});
        this.f18964f = z5;
    }
}
