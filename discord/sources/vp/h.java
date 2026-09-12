package vp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f21886c = new h(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f21887a = new y(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21888b;

    public h() {
    }

    public static int c(i0 i0Var, Object obj) {
        switch (i0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return v1.i(((Long) obj).longValue());
            case 3:
                return v1.i(((Long) obj).longValue());
            case 4:
                return v1.e(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return v1.h(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported.", e10);
                }
            case 9:
                return ((a) obj).c();
            case 10:
                return v1.g((a) obj);
            case 11:
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    return dVar.size() + v1.h(dVar.size());
                }
                byte[] bArr = (byte[]) obj;
                return v1.h(bArr.length) + bArr.length;
            case 12:
                return v1.h(((Integer) obj).intValue());
            case 13:
                return obj instanceof o ? v1.e(((o) obj).a()) : v1.e(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return v1.h((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return v1.i((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(l lVar, Object obj) {
        i0 i0Var = lVar.f21908e;
        int i7 = lVar.f21907d;
        if (!lVar.f21909i) {
            int iJ = v1.j(i7);
            if (i0Var == i0.f21892w) {
                iJ *= 2;
            }
            return c(i0Var, obj) + iJ;
        }
        int iC = 0;
        for (Object obj2 : (List) obj) {
            int iJ2 = v1.j(i7);
            if (i0Var == i0.f21892w) {
                iJ2 *= 2;
            }
            iC += c(i0Var, obj2) + iJ2;
        }
        return iC;
    }

    public static boolean e(Map.Entry entry) {
        l lVar = (l) entry.getKey();
        if (lVar.f21908e.f21895d != j0.G) {
            return true;
        }
        if (!lVar.f21909i) {
            Object value = entry.getValue();
            if (value instanceof a) {
                return ((a) value).b();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((a) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    public static Object h(e eVar, i0 i0Var) {
        switch (i0Var.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(eVar.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(eVar.i()));
            case 2:
                return Long.valueOf(eVar.l());
            case 3:
                return Long.valueOf(eVar.l());
            case 4:
                return Integer.valueOf(eVar.k());
            case 5:
                return Long.valueOf(eVar.j());
            case 6:
                return Integer.valueOf(eVar.i());
            case 7:
                return Boolean.valueOf(eVar.l() != 0);
            case 8:
                int iK = eVar.k();
                int i7 = eVar.f21874b;
                int i10 = eVar.f21876d;
                if (iK > i7 - i10 || iK <= 0) {
                    return iK == 0 ? "" : new String(eVar.h(iK), "UTF-8");
                }
                String str = new String(eVar.f21873a, i10, iK, "UTF-8");
                eVar.f21876d += iK;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return eVar.e();
            case 12:
                return Integer.valueOf(eVar.k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(eVar.i());
            case 15:
                return Long.valueOf(eVar.j());
            case 16:
                int iK2 = eVar.k();
                return Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case 17:
                long jL = eVar.l();
                return Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    public static void j(i0 i0Var, Object obj) {
        obj.getClass();
        boolean z5 = true;
        boolean z6 = false;
        switch (i0Var.f21895d) {
            case f21899e:
                z6 = obj instanceof Integer;
                break;
            case f21900i:
                z6 = obj instanceof Long;
                break;
            case f21901v:
                z6 = obj instanceof Float;
                break;
            case f21902w:
                z6 = obj instanceof Double;
                break;
            case f21903x:
                z6 = obj instanceof Boolean;
                break;
            case f21904y:
                z6 = obj instanceof String;
                break;
            case E:
                if (!(obj instanceof d) && !(obj instanceof byte[])) {
                    z5 = false;
                }
                z6 = z5;
                break;
            case F:
                if (!(obj instanceof Integer) && !(obj instanceof o)) {
                    z5 = false;
                }
                z6 = z5;
                break;
            case G:
                z6 = obj instanceof a;
                break;
        }
        if (!z6) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void k(v1 v1Var, i0 i0Var, Object obj) {
        switch (i0Var.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                v1Var.getClass();
                v1Var.z(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                v1Var.getClass();
                v1Var.y(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                v1Var.B(((Long) obj).longValue());
                break;
            case 3:
                v1Var.B(((Long) obj).longValue());
                break;
            case 4:
                v1Var.s(((Integer) obj).intValue());
                break;
            case 5:
                v1Var.z(((Long) obj).longValue());
                break;
            case 6:
                v1Var.y(((Integer) obj).intValue());
                break;
            case 7:
                v1Var.v(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                v1Var.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                v1Var.A(bytes.length);
                v1Var.x(bytes);
                break;
            case 9:
                v1Var.getClass();
                ((a) obj).f(v1Var);
                break;
            case 10:
                v1Var.u((a) obj);
                break;
            case 11:
                if (!(obj instanceof d)) {
                    byte[] bArr = (byte[]) obj;
                    v1Var.getClass();
                    v1Var.A(bArr.length);
                    v1Var.x(bArr);
                } else {
                    d dVar = (d) obj;
                    v1Var.getClass();
                    v1Var.A(dVar.size());
                    v1Var.w(dVar);
                }
                break;
            case 12:
                v1Var.A(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof o)) {
                    v1Var.s(((Integer) obj).intValue());
                } else {
                    v1Var.s(((o) obj).a());
                }
                break;
            case 14:
                v1Var.y(((Integer) obj).intValue());
                break;
            case 15:
                v1Var.z(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                v1Var.A((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                v1Var.B((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(l lVar, Object obj) {
        List arrayList;
        if (!lVar.f21909i) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(lVar.f21908e, obj);
        y yVar = this.f21887a;
        Object obj2 = yVar.get(lVar);
        if (obj2 == null) {
            arrayList = new ArrayList();
            yVar.put(lVar, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h clone() {
        y yVar;
        h hVar = new h();
        int i7 = 0;
        while (true) {
            yVar = this.f21887a;
            if (i7 >= yVar.f21932e.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) yVar.f21932e.get(i7);
            hVar.i((l) entry.getKey(), entry.getValue());
            i7++;
        }
        for (Map.Entry entry2 : yVar.c()) {
            hVar.i((l) entry2.getKey(), entry2.getValue());
        }
        return hVar;
    }

    public final void f() {
        if (this.f21888b) {
            return;
        }
        y yVar = this.f21887a;
        if (!yVar.f21934v) {
            for (int i7 = 0; i7 < yVar.f21932e.size(); i7++) {
                Map.Entry entry = (Map.Entry) yVar.f21932e.get(i7);
                if (((l) entry.getKey()).f21909i) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : yVar.c()) {
                if (((l) entry2.getKey()).f21909i) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!yVar.f21934v) {
            yVar.f21933i = yVar.f21933i.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(yVar.f21933i);
            yVar.f21934v = true;
        }
        this.f21888b = true;
    }

    public final void g(Map.Entry entry) {
        l lVar = (l) entry.getKey();
        Object value = entry.getValue();
        boolean z5 = lVar.f21909i;
        y yVar = this.f21887a;
        if (z5) {
            Object arrayList = yVar.get(lVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            yVar.put(lVar, arrayList);
            return;
        }
        if (lVar.f21908e.f21895d != j0.G) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            yVar.put(lVar, value);
            return;
        }
        Object obj2 = yVar.get(lVar);
        if (obj2 != null) {
            yVar.put(lVar, ((a) obj2).e().e((n) ((a) value)).c());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        yVar.put(lVar, value);
    }

    public final void i(l lVar, Object obj) {
        boolean z5 = lVar.f21909i;
        i0 i0Var = lVar.f21908e;
        if (!z5) {
            j(i0Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(i0Var, it.next());
            }
            obj = arrayList;
        }
        this.f21887a.put(lVar, obj);
    }

    public h(int i7) {
        f();
    }
}
