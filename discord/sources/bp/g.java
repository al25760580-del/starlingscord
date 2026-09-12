package bp;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends e implements lp.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f3353b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(up.e eVar, Object[] values) {
        super(eVar);
        Intrinsics.checkNotNullParameter(values, "values");
        this.f3353b = values;
    }

    public final ArrayList a() {
        lp.a pVar;
        Object[] objArr = this.f3353b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object value : objArr) {
            Intrinsics.checkNotNull(value);
            Intrinsics.checkNotNullParameter(value, "value");
            if (c.e(value.getClass())) {
                pVar = new t(null, (Enum) value);
            } else if (value instanceof Annotation) {
                pVar = new f(null, (Annotation) value);
            } else if (value instanceof Object[]) {
                pVar = new g(null, (Object[]) value);
            } else {
                pVar = value instanceof Class ? new p(null, (Class) value) : new v(null, value);
            }
            arrayList.add(pVar);
        }
        return arrayList;
    }
}
