package qo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends w implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f18957f;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Constructor constructor, Object obj, int i7) {
        this.f18956e = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(constructor, "constructor");
                Class declaringClass = constructor.getDeclaringClass();
                Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f18957f = obj;
                break;
            default:
                Intrinsics.checkNotNullParameter(constructor, "constructor");
                Class declaringClass2 = constructor.getDeclaringClass();
                Intrinsics.checkNotNullExpressionValue(declaringClass2, "getDeclaringClass(...)");
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes2, "getGenericParameterTypes(...)");
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : kotlin.collections.w.j(genericParameterTypes2, 1, genericParameterTypes2.length - 1)));
                this.f18957f = obj;
                break;
        }
    }

    @Override // qo.g
    public final Object call(Object[] args) {
        switch (this.f18956e) {
            case 0:
                Intrinsics.checkNotNullParameter(args, "args");
                zs.a.l(this, args);
                Constructor constructor = (Constructor) this.f18970a;
                SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                spreadBuilder.add(this.f18957f);
                spreadBuilder.addSpread(args);
                spreadBuilder.add(null);
                return constructor.newInstance(spreadBuilder.toArray(new Object[spreadBuilder.size()]));
            default:
                Intrinsics.checkNotNullParameter(args, "args");
                zs.a.l(this, args);
                Constructor constructor2 = (Constructor) this.f18970a;
                SpreadBuilder spreadBuilder2 = new SpreadBuilder(2);
                spreadBuilder2.add(this.f18957f);
                spreadBuilder2.addSpread(args);
                return constructor2.newInstance(spreadBuilder2.toArray(new Object[spreadBuilder2.size()]));
        }
    }
}
