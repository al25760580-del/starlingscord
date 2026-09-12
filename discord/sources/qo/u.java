package qo;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends q implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object[] f18968g;

    /* JADX WARN: Illegal instructions before constructor call */
    public u(Method method, Object[] boundReceiverComponents) {
        Collection collectionC;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(boundReceiverComponents, "boundReceiverComponents");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
        int length = boundReceiverComponents.length;
        Intrinsics.checkNotNullParameter(genericParameterTypes, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException(s0.g.d(length, "Requested element count ", " is less than zero.").toString());
        }
        int length2 = genericParameterTypes.length - length;
        length2 = length2 < 0 ? 0 : length2;
        Intrinsics.checkNotNullParameter(genericParameterTypes, "<this>");
        if (length2 < 0) {
            throw new IllegalArgumentException(s0.g.d(length2, "Requested element count ", " is less than zero.").toString());
        }
        if (length2 == 0) {
            collectionC = n0.f14659d;
        } else {
            int length3 = genericParameterTypes.length;
            if (length2 >= length3) {
                collectionC = kotlin.collections.y.H(genericParameterTypes);
            } else if (length2 == 1) {
                collectionC = kotlin.collections.c0.c(genericParameterTypes[length3 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length2);
                for (int i7 = length3 - length2; i7 < length3; i7++) {
                    arrayList.add(genericParameterTypes[i7]);
                }
                collectionC = arrayList;
            }
        }
        super(method, false, (Type[]) collectionC.toArray(new Type[0]));
        this.f18968g = boundReceiverComponents;
    }

    @Override // qo.q, qo.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        zs.a.l(this, args);
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(this.f18968g);
        spreadBuilder.addSpread(args);
        return f(null, spreadBuilder.toArray(new Object[spreadBuilder.size()]));
    }
}
