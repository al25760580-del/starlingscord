package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends d2 {
    private static final h1 zzb;
    private h2 zzd = v2.f6159w;

    static {
        h1 h1Var = new h1();
        zzb = h1Var;
        d2.f(h1.class, h1Var);
    }

    public static g1 r() {
        return (g1) zzb.k();
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
    public static void s(h1 h1Var, ArrayList arrayList) {
        h2 h2Var = h1Var.zzd;
        if (!((p1) h2Var).f6091d) {
            int size = h2Var.size();
            h1Var.zzd = h2Var.l(size + size);
        }
        List list = h1Var.zzd;
        int size2 = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof v2) {
            v2 v2Var = (v2) list;
            int i7 = v2Var.f6161i + size2;
            int length = v2Var.f6160e.length;
            if (i7 > length) {
                if (length != 0) {
                    while (length < i7) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    v2Var.f6160e = Arrays.copyOf(v2Var.f6160e, length);
                } else {
                    v2Var.f6160e = new Object[Math.max(i7, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i10 = 0; i10 < size4; i10++) {
            Object obj = arrayList.get(i10);
            if (obj == null) {
                String strD = s0.g.d(list.size() - size3, "Element at index ", " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        throw new NullPointerException(strD);
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", f1.class});
        }
        if (i10 == 3) {
            return new h1();
        }
        if (i10 == 4) {
            return new g1(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
