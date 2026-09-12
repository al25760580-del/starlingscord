package hj;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f10903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f10904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u0 f10905c;

    static {
        Class<?> cls;
        Class<?> cls2;
        u0 u0Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f10903a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                u0Var = (u0) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f10904b = u0Var;
        f10905c = new u0();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void a(u0 u0Var, Object obj, Object obj2) {
        u0Var.getClass();
        r rVar = (r) obj;
        t0 t0Var = rVar.f10902c;
        t0 t0Var2 = ((r) obj2).f10902c;
        t0 t0Var3 = t0.f10908e;
        if (!t0Var3.equals(t0Var2)) {
            if (t0Var3.equals(t0Var)) {
                int i7 = t0Var.f10909a + t0Var2.f10909a;
                int[] iArrCopyOf = Arrays.copyOf(t0Var.f10910b, i7);
                System.arraycopy(t0Var2.f10910b, 0, iArrCopyOf, t0Var.f10909a, t0Var2.f10909a);
                Object[] objArrCopyOf = Arrays.copyOf(t0Var.f10911c, i7);
                System.arraycopy(t0Var2.f10911c, 0, objArrCopyOf, t0Var.f10909a, t0Var2.f10909a);
                t0Var = new t0(i7, iArrCopyOf, objArrCopyOf, true);
            } else {
                t0Var.getClass();
                if (!t0Var2.equals(t0Var3)) {
                    if (!t0Var.f10912d) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = t0Var.f10909a + t0Var2.f10909a;
                    t0Var.a(i10);
                    System.arraycopy(t0Var2.f10910b, 0, t0Var.f10910b, t0Var.f10909a, t0Var2.f10909a);
                    System.arraycopy(t0Var2.f10911c, 0, t0Var.f10911c, t0Var.f10909a, t0Var2.f10909a);
                    t0Var.f10909a = i10;
                }
            }
        }
        rVar.f10902c = t0Var;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
