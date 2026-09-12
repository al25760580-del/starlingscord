package qo;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends w {
    /* JADX WARN: Illegal instructions before constructor call */
    public m(Field field, boolean z5) {
        Type genericType = field.getGenericType();
        Intrinsics.checkNotNullExpressionValue(genericType, "getGenericType(...)");
        super(field, genericType, z5 ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // qo.g
    public Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        d(args);
        return ((Field) this.f18970a).get(this.f18972c != null ? kotlin.collections.y.s(args) : null);
    }
}
