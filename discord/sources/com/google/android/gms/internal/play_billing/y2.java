package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6191a;

    static {
        int i7 = q1.f6096a;
        f6191a = new a();
    }

    public static void a(int i7, List list, w1 w1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1 v1Var = w1Var.f6175a;
        int i10 = 0;
        if (!(list instanceof e2)) {
            if (!z5) {
                while (i10 < list.size()) {
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    v1Var.O(i7, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            v1Var.N(i7, 2);
            int iS = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue2 = ((Integer) list.get(i11)).intValue();
                iS += v1.S((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            v1Var.P(iS);
            while (i10 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i10)).intValue();
                v1Var.P((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        e2 e2Var = (e2) list;
        if (!z5) {
            while (i10 < e2Var.f6001i) {
                int iB = e2Var.b(i10);
                v1Var.O(i7, (iB >> 31) ^ (iB + iB));
                i10++;
            }
            return;
        }
        v1Var.N(i7, 2);
        int iS2 = 0;
        for (int i12 = 0; i12 < e2Var.f6001i; i12++) {
            int iB2 = e2Var.b(i12);
            iS2 += v1.S((iB2 >> 31) ^ (iB2 + iB2));
        }
        v1Var.P(iS2);
        while (i10 < e2Var.f6001i) {
            int iB3 = e2Var.b(i10);
            v1Var.P((iB3 >> 31) ^ (iB3 + iB3));
            i10++;
        }
    }

    public static void b(int i7, List list, w1 w1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1 v1Var = w1Var.f6175a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                v1Var.Q(i7, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return;
        }
        v1Var.N(i7, 2);
        int iT = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jLongValue2 = ((Long) list.get(i11)).longValue();
            iT += v1.T((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        v1Var.P(iT);
        while (i10 < list.size()) {
            long jLongValue3 = ((Long) list.get(i10)).longValue();
            v1Var.R((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i10++;
        }
    }

    public static void c(int i7, List list, w1 w1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1 v1Var = w1Var.f6175a;
        int i10 = 0;
        if (!(list instanceof e2)) {
            if (!z5) {
                while (i10 < list.size()) {
                    v1Var.O(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            v1Var.N(i7, 2);
            int iS = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iS += v1.S(((Integer) list.get(i11)).intValue());
            }
            v1Var.P(iS);
            while (i10 < list.size()) {
                v1Var.P(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        e2 e2Var = (e2) list;
        if (!z5) {
            while (i10 < e2Var.f6001i) {
                v1Var.O(i7, e2Var.b(i10));
                i10++;
            }
            return;
        }
        v1Var.N(i7, 2);
        int iS2 = 0;
        for (int i12 = 0; i12 < e2Var.f6001i; i12++) {
            iS2 += v1.S(e2Var.b(i12));
        }
        v1Var.P(iS2);
        while (i10 < e2Var.f6001i) {
            v1Var.P(e2Var.b(i10));
            i10++;
        }
    }

    public static void d(int i7, List list, w1 w1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1 v1Var = w1Var.f6175a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                v1Var.Q(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        v1Var.N(i7, 2);
        int iT = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iT += v1.T(((Long) list.get(i11)).longValue());
        }
        v1Var.P(iT);
        while (i10 < list.size()) {
            v1Var.R(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e2)) {
            int iT = 0;
            while (i7 < size) {
                iT += v1.T(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iT;
        }
        e2 e2Var = (e2) list;
        int iT2 = 0;
        while (i7 < size) {
            iT2 += v1.T(e2Var.b(i7));
            i7++;
        }
        return iT2;
    }

    public static int g(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v1.S(i7 << 3) + 4) * size;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v1.S(i7 << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e2)) {
            int iT = 0;
            while (i7 < size) {
                iT += v1.T(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iT;
        }
        e2 e2Var = (e2) list;
        int iT2 = 0;
        while (i7 < size) {
            iT2 += v1.T(e2Var.b(i7));
            i7++;
        }
        return iT2;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iT += v1.T(((Long) list.get(i7)).longValue());
        }
        return iT;
    }

    public static int k(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e2)) {
            int iS = 0;
            while (i7 < size) {
                int iIntValue = ((Integer) list.get(i7)).intValue();
                iS += v1.S((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i7++;
            }
            return iS;
        }
        e2 e2Var = (e2) list;
        int iS2 = 0;
        while (i7 < size) {
            int iB = e2Var.b(i7);
            iS2 += v1.S((iB >> 31) ^ (iB + iB));
            i7++;
        }
        return iS2;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = 0;
        for (int i7 = 0; i7 < size; i7++) {
            long jLongValue = ((Long) list.get(i7)).longValue();
            iT += v1.T((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iT;
    }

    public static int m(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e2)) {
            int iS = 0;
            while (i7 < size) {
                iS += v1.S(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iS;
        }
        e2 e2Var = (e2) list;
        int iS2 = 0;
        while (i7 < size) {
            iS2 += v1.S(e2Var.b(i7));
            i7++;
        }
        return iS2;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iT += v1.T(((Long) list.get(i7)).longValue());
        }
        return iT;
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
    public static void o(Object obj, Object obj2) {
        d2 d2Var = (d2) obj;
        f3 f3Var = d2Var.zzc;
        f3 f3Var2 = ((d2) obj2).zzc;
        f3 f3Var3 = f3.f6006f;
        if (!f3Var3.equals(f3Var2)) {
            if (f3Var3.equals(f3Var)) {
                int i7 = f3Var.f6007a + f3Var2.f6007a;
                int[] iArrCopyOf = Arrays.copyOf(f3Var.f6008b, i7);
                System.arraycopy(f3Var2.f6008b, 0, iArrCopyOf, f3Var.f6007a, f3Var2.f6007a);
                Object[] objArrCopyOf = Arrays.copyOf(f3Var.f6009c, i7);
                System.arraycopy(f3Var2.f6009c, 0, objArrCopyOf, f3Var.f6007a, f3Var2.f6007a);
                f3Var = new f3(i7, iArrCopyOf, objArrCopyOf, true);
            } else {
                f3Var.getClass();
                if (!f3Var2.equals(f3Var3)) {
                    if (!f3Var.f6011e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = f3Var.f6007a + f3Var2.f6007a;
                    f3Var.e(i10);
                    System.arraycopy(f3Var2.f6008b, 0, f3Var.f6008b, f3Var.f6007a, f3Var2.f6007a);
                    System.arraycopy(f3Var2.f6009c, 0, f3Var.f6009c, f3Var.f6007a, f3Var2.f6007a);
                    f3Var.f6007a = i10;
                }
            }
        }
        d2Var.zzc = f3Var;
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
    public static void p(int i7, List list, w1 w1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1 v1Var = w1Var.f6175a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i10)).booleanValue();
                v1Var.P(i7 << 3);
                v1Var.E(zBooleanValue ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        v1Var.N(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            i11++;
        }
        v1Var.P(i11);
        while (i10 < list.size()) {
            v1Var.E(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static void q(int i7, List list, w1 w1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1 v1Var = w1Var.f6175a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                v1Var.I(i7, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        v1Var.N(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        v1Var.P(i11);
        while (i10 < list.size()) {
            v1Var.J(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void r(int i7, List list, w1 w1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1 v1Var = w1Var.f6175a;
        int i10 = 0;
        if (!(list instanceof e2)) {
            if (!z5) {
                while (i10 < list.size()) {
                    v1Var.K(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            v1Var.N(i7, 2);
            int iT = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iT += v1.T(((Integer) list.get(i11)).intValue());
            }
            v1Var.P(iT);
            while (i10 < list.size()) {
                v1Var.L(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        e2 e2Var = (e2) list;
        if (!z5) {
            while (i10 < e2Var.f6001i) {
                v1Var.K(i7, e2Var.b(i10));
                i10++;
            }
            return;
        }
        v1Var.N(i7, 2);
        int iT2 = 0;
        for (int i12 = 0; i12 < e2Var.f6001i; i12++) {
            iT2 += v1.T(e2Var.b(i12));
        }
        v1Var.P(iT2);
        while (i10 < e2Var.f6001i) {
            v1Var.L(e2Var.b(i10));
            i10++;
        }
    }

    public static void s(int i7, List list, w1 w1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1 v1Var = w1Var.f6175a;
        int i10 = 0;
        if (!(list instanceof e2)) {
            if (!z5) {
                while (i10 < list.size()) {
                    v1Var.G(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            v1Var.N(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            v1Var.P(i11);
            while (i10 < list.size()) {
                v1Var.H(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        e2 e2Var = (e2) list;
        if (!z5) {
            while (i10 < e2Var.f6001i) {
                v1Var.G(i7, e2Var.b(i10));
                i10++;
            }
            return;
        }
        v1Var.N(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < e2Var.f6001i; i14++) {
            e2Var.b(i14);
            i13 += 4;
        }
        v1Var.P(i13);
        while (i10 < e2Var.f6001i) {
            v1Var.H(e2Var.b(i10));
            i10++;
        }
    }

    public static void t(int i7, List list, w1 w1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1 v1Var = w1Var.f6175a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                v1Var.I(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        v1Var.N(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        v1Var.P(i11);
        while (i10 < list.size()) {
            v1Var.J(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void u(int i7, List list, w1 w1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1 v1Var = w1Var.f6175a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                v1Var.G(i7, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        v1Var.N(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        v1Var.P(i11);
        while (i10 < list.size()) {
            v1Var.H(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void v(int i7, List list, w1 w1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1 v1Var = w1Var.f6175a;
        int i10 = 0;
        if (!(list instanceof e2)) {
            if (!z5) {
                while (i10 < list.size()) {
                    v1Var.K(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            v1Var.N(i7, 2);
            int iT = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iT += v1.T(((Integer) list.get(i11)).intValue());
            }
            v1Var.P(iT);
            while (i10 < list.size()) {
                v1Var.L(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        e2 e2Var = (e2) list;
        if (!z5) {
            while (i10 < e2Var.f6001i) {
                v1Var.K(i7, e2Var.b(i10));
                i10++;
            }
            return;
        }
        v1Var.N(i7, 2);
        int iT2 = 0;
        for (int i12 = 0; i12 < e2Var.f6001i; i12++) {
            iT2 += v1.T(e2Var.b(i12));
        }
        v1Var.P(iT2);
        while (i10 < e2Var.f6001i) {
            v1Var.L(e2Var.b(i10));
            i10++;
        }
    }

    public static void w(int i7, List list, w1 w1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1 v1Var = w1Var.f6175a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                v1Var.Q(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        v1Var.N(i7, 2);
        int iT = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iT += v1.T(((Long) list.get(i11)).longValue());
        }
        v1Var.P(iT);
        while (i10 < list.size()) {
            v1Var.R(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void x(int i7, List list, w1 w1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1 v1Var = w1Var.f6175a;
        int i10 = 0;
        if (!(list instanceof e2)) {
            if (!z5) {
                while (i10 < list.size()) {
                    v1Var.G(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            v1Var.N(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            v1Var.P(i11);
            while (i10 < list.size()) {
                v1Var.H(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        e2 e2Var = (e2) list;
        if (!z5) {
            while (i10 < e2Var.f6001i) {
                v1Var.G(i7, e2Var.b(i10));
                i10++;
            }
            return;
        }
        v1Var.N(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < e2Var.f6001i; i14++) {
            e2Var.b(i14);
            i13 += 4;
        }
        v1Var.P(i13);
        while (i10 < e2Var.f6001i) {
            v1Var.H(e2Var.b(i10));
            i10++;
        }
    }

    public static void y(int i7, List list, w1 w1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1 v1Var = w1Var.f6175a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                v1Var.I(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        v1Var.N(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        v1Var.P(i11);
        while (i10 < list.size()) {
            v1Var.J(((Long) list.get(i10)).longValue());
            i10++;
        }
    }
}
