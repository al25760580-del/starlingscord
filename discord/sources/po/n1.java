package po;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n1 extends s implements KProperty {
    public static final Object J = new Object();
    public final String E;
    public final String F;
    public final Object G;
    public final Object H;
    public final u1 I;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g0 f18115y;

    public n1(g0 g0Var, String str, String str2, vo.l0 l0Var, Object obj) {
        this.f18115y = g0Var;
        this.E = str;
        this.F = str2;
        this.G = obj;
        this.H = rn.l.a(rn.m.f19486e, new h1(this, 0));
        u1 u1VarF0 = e4.f.f0(l0Var, new h1(this, 1));
        Intrinsics.checkNotNullExpressionValue(u1VarF0, "lazySoft(...)");
        this.I = u1VarF0;
    }

    @Override // po.s
    public final qo.g b() {
        return l().b();
    }

    @Override // po.s
    public final g0 c() {
        return this.f18115y;
    }

    @Override // po.s
    public final qo.g d() {
        l().getClass();
        return null;
    }

    public final boolean equals(Object obj) {
        n1 n1VarC = a2.c(obj);
        return n1VarC != null && Intrinsics.areEqual(this.f18115y, n1VarC.f18115y) && Intrinsics.areEqual(this.E, n1VarC.E) && Intrinsics.areEqual(this.F, n1VarC.F) && Intrinsics.areEqual(this.G, n1VarC.G);
    }

    @Override // kotlin.reflect.KCallable
    public final String getName() {
        return this.E;
    }

    @Override // po.s
    public final boolean h() {
        return this.G != CallableReference.NO_RECEIVER;
    }

    public final int hashCode() {
        return this.F.hashCode() + a3.e.d(this.f18115y.hashCode() * 31, 31, this.E);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public final Member i() {
        if (!e().A()) {
            return null;
        }
        up.b bVar = y1.f18196a;
        com.facebook.imagepipeline.nativecode.b bVarB = y1.b(e());
        if (bVarB instanceof n) {
            n nVar = (n) bVarB;
            rp.f fVar = nVar.f18114i;
            sp.e eVar = nVar.f18113h;
            if ((eVar.f20449e & 16) == 16) {
                sp.c cVar = eVar.f20454y;
                int i7 = cVar.f20437e;
                if ((i7 & 1) != 1 || (i7 & 2) != 2) {
                    return null;
                }
                return this.f18115y.c(fVar.getString(cVar.f20438i), fVar.getString(cVar.f20439v));
            }
        }
        return (Field) this.H.getValue();
    }

    @Override // kotlin.reflect.KProperty
    public final boolean isConst() {
        return e().isConst();
    }

    @Override // kotlin.reflect.KProperty
    public final boolean isLateinit() {
        return e().a0();
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isSuspend() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object j(Member member, Object obj, Object obj2) throws ag.b {
        try {
            Object obj3 = J;
            if ((obj == obj3 || obj2 == obj3) && e().V() == null) {
                throw new RuntimeException("'" + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objM = h() ? a5.l0.m(this.G, e()) : obj;
            if (objM == obj3) {
                objM = null;
            }
            if (!h()) {
                obj = obj2;
            }
            if (obj == obj3) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(ls.l.s(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objM);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objM == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    Intrinsics.checkNotNullExpressionValue(cls, "get(...)");
                    objM = a2.e(cls);
                }
                return method.invoke(null, objM);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                Intrinsics.checkNotNullExpressionValue(cls2, "get(...)");
                obj = a2.e(cls2);
            }
            return method2.invoke(null, objM, obj);
        } catch (IllegalAccessException cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            throw new ag.b(6, "Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", cause);
        }
    }

    @Override // po.s
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final vo.l0 e() {
        Object objInvoke = this.I.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
        return (vo.l0) objInvoke;
    }

    public abstract k1 l();

    public final String toString() {
        wp.h hVar = x1.f18192a;
        return x1.c(e());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n1(g0 container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n1(g0 container, vo.l0 descriptor) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String strB = descriptor.getName().b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        this(container, strB, y1.b(descriptor).e(), descriptor, CallableReference.NO_RECEIVER);
    }
}
