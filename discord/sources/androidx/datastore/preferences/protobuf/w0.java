package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f1948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1 f1949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1 f1950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f1 f1951d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f1948a = cls;
        f1949b = v(false);
        f1950c = v(true);
        f1951d = new f1();
    }

    public static void A(int i7, List list, e0 e0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) e0Var.f1840a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                double dDoubleValue = ((Double) list.get(i10)).doubleValue();
                iVar.getClass();
                iVar.K(i7, Double.doubleToRawLongBits(dDoubleValue));
                i10++;
            }
            return;
        }
        iVar.R(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            Logger logger = i.f1869h;
            i11 += 8;
        }
        iVar.T(i11);
        while (i10 < list.size()) {
            iVar.L(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void B(int i7, List list, e0 e0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) e0Var.f1840a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                iVar.M(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        iVar.R(i7, 2);
        int iW = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iW += i.w(((Integer) list.get(i11)).intValue());
        }
        iVar.T(iW);
        while (i10 < list.size()) {
            iVar.N(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void C(int i7, List list, e0 e0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) e0Var.f1840a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                iVar.I(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        iVar.R(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = i.f1869h;
            i11 += 4;
        }
        iVar.T(i11);
        while (i10 < list.size()) {
            iVar.J(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void D(int i7, List list, e0 e0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) e0Var.f1840a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                iVar.K(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        iVar.R(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = i.f1869h;
            i11 += 8;
        }
        iVar.T(i11);
        while (i10 < list.size()) {
            iVar.L(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void E(int i7, List list, e0 e0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) e0Var.f1840a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                float fFloatValue = ((Float) list.get(i10)).floatValue();
                iVar.getClass();
                iVar.I(i7, Float.floatToRawIntBits(fFloatValue));
                i10++;
            }
            return;
        }
        iVar.R(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            Logger logger = i.f1869h;
            i11 += 4;
        }
        iVar.T(i11);
        while (i10 < list.size()) {
            iVar.J(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void F(int i7, List list, e0 e0Var, v0 v0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e0Var.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            e0Var.b(i7, list.get(i10), v0Var);
        }
    }

    public static void G(int i7, List list, e0 e0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) e0Var.f1840a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                iVar.M(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        iVar.R(i7, 2);
        int iW = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iW += i.w(((Integer) list.get(i11)).intValue());
        }
        iVar.T(iW);
        while (i10 < list.size()) {
            iVar.N(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void H(int i7, List list, e0 e0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) e0Var.f1840a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                iVar.U(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        iVar.R(i7, 2);
        int iA = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iA += i.A(((Long) list.get(i11)).longValue());
        }
        iVar.T(iA);
        while (i10 < list.size()) {
            iVar.V(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void I(int i7, List list, e0 e0Var, v0 v0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e0Var.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((i) e0Var.f1840a).O(i7, (a) list.get(i10), v0Var);
        }
    }

    public static void J(int i7, List list, e0 e0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) e0Var.f1840a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                iVar.I(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        iVar.R(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = i.f1869h;
            i11 += 4;
        }
        iVar.T(i11);
        while (i10 < list.size()) {
            iVar.J(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void K(int i7, List list, e0 e0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) e0Var.f1840a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                iVar.K(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        iVar.R(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = i.f1869h;
            i11 += 8;
        }
        iVar.T(i11);
        while (i10 < list.size()) {
            iVar.L(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void L(int i7, List list, e0 e0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) e0Var.f1840a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iVar.S(i7, (iIntValue >> 31) ^ (iIntValue << 1));
                i10++;
            }
            return;
        }
        iVar.R(i7, 2);
        int iZ = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iIntValue2 = ((Integer) list.get(i11)).intValue();
            iZ += i.z((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        iVar.T(iZ);
        while (i10 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i10)).intValue();
            iVar.T((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i10++;
        }
    }

    public static void M(int i7, List list, e0 e0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) e0Var.f1840a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iVar.U(i7, (jLongValue >> 63) ^ (jLongValue << 1));
                i10++;
            }
            return;
        }
        iVar.R(i7, 2);
        int iA = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jLongValue2 = ((Long) list.get(i11)).longValue();
            iA += i.A((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        iVar.T(iA);
        while (i10 < list.size()) {
            long jLongValue3 = ((Long) list.get(i10)).longValue();
            iVar.V((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i10++;
        }
    }

    public static void N(int i7, List list, e0 e0Var) throws h {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) e0Var.f1840a;
        int i10 = 0;
        if (!(list instanceof z)) {
            while (i10 < list.size()) {
                iVar.P(i7, (String) list.get(i10));
                i10++;
            }
            return;
        }
        z zVar = (z) list;
        while (i10 < list.size()) {
            Object objU = zVar.U(i10);
            if (objU instanceof String) {
                iVar.P(i7, (String) objU);
            } else {
                iVar.G(i7, (e) objU);
            }
            i10++;
        }
    }

    public static void O(int i7, List list, e0 e0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) e0Var.f1840a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                iVar.S(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        iVar.R(i7, 2);
        int iZ = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZ += i.z(((Integer) list.get(i11)).intValue());
        }
        iVar.T(iZ);
        while (i10 < list.size()) {
            iVar.T(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void P(int i7, List list, e0 e0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) e0Var.f1840a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                iVar.U(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        iVar.R(i7, 2);
        int iA = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iA += i.A(((Long) list.get(i11)).longValue());
        }
        iVar.T(iA);
        while (i10 < list.size()) {
            iVar.V(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static int a(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = i.y(i7) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iY += i.s((e) list.get(i10));
        }
        return iY;
    }

    public static int b(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (i.y(i7) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iW += i.w(((Integer) list.get(i7)).intValue());
        }
        return iW;
    }

    public static int d(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return i.t(i7) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return i.u(i7) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (i.y(i7) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iW += i.w(((Integer) list.get(i7)).intValue());
        }
        return iW;
    }

    public static int j(int i7, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (i.y(i7) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iA += i.A(((Long) list.get(i7)).longValue());
        }
        return iA;
    }

    public static int l(int i7, List list, v0 v0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = i.y(i7) * size;
        for (int i10 = 0; i10 < size; i10++) {
            int iB = ((a) list.get(i10)).b(v0Var);
            iY += i.z(iB) + iB;
        }
        return iY;
    }

    public static int m(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (i.y(i7) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZ = 0;
        for (int i7 = 0; i7 < size; i7++) {
            int iIntValue = ((Integer) list.get(i7)).intValue();
            iZ += i.z((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iZ;
    }

    public static int o(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (i.y(i7) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i7 = 0; i7 < size; i7++) {
            long jLongValue = ((Long) list.get(i7)).longValue();
            iA += i.A((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iA;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int iY = i.y(i7) * size;
        if (!(list instanceof z)) {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof e) {
                    int size2 = ((e) obj).size();
                    iY = i.z(size2) + size2 + iY;
                } else {
                    iY = i.x((String) obj) + iY;
                }
                i10++;
            }
            return iY;
        }
        z zVar = (z) list;
        while (i10 < size) {
            Object objU = zVar.U(i10);
            if (objU instanceof e) {
                int size3 = ((e) objU).size();
                iY = i.z(size3) + size3 + iY;
            } else {
                iY = i.x((String) objU) + iY;
            }
            i10++;
        }
        return iY;
    }

    public static int r(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (i.y(i7) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZ = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iZ += i.z(((Integer) list.get(i7)).intValue());
        }
        return iZ;
    }

    public static int t(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (i.y(i7) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iA += i.A(((Long) list.get(i7)).longValue());
        }
        return iA;
    }

    public static f1 v(boolean z5) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (f1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z5));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void w(f1 f1Var, Object obj, Object obj2) {
        f1Var.getClass();
        s sVar = (s) obj;
        e1 e1Var = sVar.unknownFields;
        e1 e1Var2 = ((s) obj2).unknownFields;
        if (!e1Var2.equals(e1.f1841f)) {
            int i7 = e1Var.f1842a + e1Var2.f1842a;
            int[] iArrCopyOf = Arrays.copyOf(e1Var.f1843b, i7);
            System.arraycopy(e1Var2.f1843b, 0, iArrCopyOf, e1Var.f1842a, e1Var2.f1842a);
            Object[] objArrCopyOf = Arrays.copyOf(e1Var.f1844c, i7);
            System.arraycopy(e1Var2.f1844c, 0, objArrCopyOf, e1Var.f1842a, e1Var2.f1842a);
            e1Var = new e1(i7, iArrCopyOf, objArrCopyOf, true);
        }
        sVar.unknownFields = e1Var;
    }

    public static boolean x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void y(int i7, List list, e0 e0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) e0Var.f1840a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                iVar.F(i7, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        iVar.R(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            Logger logger = i.f1869h;
            i11++;
        }
        iVar.T(i11);
        while (i10 < list.size()) {
            iVar.D(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static void z(int i7, List list, e0 e0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e0Var.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((i) e0Var.f1840a).G(i7, (e) list.get(i10));
        }
    }
}
