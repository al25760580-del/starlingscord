package g2;

import androidx.datastore.preferences.protobuf.q;
import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.r;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends s {
    private static final e DEFAULT_INSTANCE;
    private static volatile q0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private t strings_ = t0.f1933v;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        s.h(e.class, eVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void i(e eVar, Iterable iterable) {
        t tVar = eVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) tVar).f1821d) {
            int size = tVar.size();
            eVar.strings_ = tVar.g(size == 0 ? 10 : size * 2);
        }
        List list = eVar.strings_;
        Charset charset = u.f1936a;
        if (iterable instanceof z) {
            List listC = ((z) iterable).c();
            z zVar = (z) list;
            int size2 = list.size();
            for (Object obj : listC) {
                if (obj == null) {
                    String str = "Element at index " + (zVar.size() - size2) + " is null.";
                    for (int size3 = zVar.size() - 1; size3 >= size2; size3--) {
                        zVar.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof androidx.datastore.preferences.protobuf.e) {
                    zVar.u((androidx.datastore.preferences.protobuf.e) obj);
                } else {
                    zVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof r0) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size4) + " is null.";
                for (int size5 = list.size() - 1; size5 >= size4; size5--) {
                    list.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    public static e j() {
        return DEFAULT_INSTANCE;
    }

    public static d l() {
        return (d) ((q) DEFAULT_INSTANCE.d(5));
    }

    @Override // androidx.datastore.preferences.protobuf.s
    public final Object d(int i7) {
        q0 rVar;
        switch (f0.e.b(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new u0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new e();
            case 4:
                return new d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q0 q0Var = PARSER;
                if (q0Var != null) {
                    return q0Var;
                }
                synchronized (e.class) {
                    try {
                        rVar = PARSER;
                        if (rVar == null) {
                            rVar = new r();
                            PARSER = rVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return rVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final t k() {
        return this.strings_;
    }
}
