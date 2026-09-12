package zp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import lq.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public static b a(List list, vo.z zVar, so.k kVar) {
        List listI0 = CollectionsKt.i0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listI0.iterator();
        while (it.hasNext()) {
            g gVarB = b(it.next(), null);
            if (gVarB != null) {
                arrayList.add(gVarB);
            }
        }
        if (zVar == null) {
            return new b(arrayList, new bp.i(26, kVar));
        }
        d0 d0VarR = zVar.f().r(kVar);
        Intrinsics.checkNotNullExpressionValue(d0VarR, "getPrimitiveArrayKotlinType(...)");
        return new y(arrayList, d0VarR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v23, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v29, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v34, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v39, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v46, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v51, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.util.ArrayList] */
    public static g b(Object obj, yo.z zVar) {
        ?? C;
        ?? C2;
        ?? C3;
        ?? C4;
        ?? C5;
        ?? C6;
        ?? C7;
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new w(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new k(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new u(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e((Character) obj);
        }
        if (obj instanceof Float) {
            return new c(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new c(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c((Boolean) obj);
        }
        if (obj instanceof String) {
            String value = (String) obj;
            Intrinsics.checkNotNullParameter(value, "value");
            return new x((Object) value);
        }
        int i7 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            int length = bArr.length;
            if (length == 0) {
                C7 = n0.f14659d;
            } else if (length != 1) {
                Intrinsics.checkNotNullParameter(bArr, "<this>");
                C7 = new ArrayList(bArr.length);
                int length2 = bArr.length;
                while (i7 < length2) {
                    C7.add(Byte.valueOf(bArr[i7]));
                    i7++;
                }
            } else {
                C7 = c0.c(Byte.valueOf(bArr[0]));
            }
            return a(C7, zVar, so.k.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            Intrinsics.checkNotNullParameter(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 == 0) {
                C6 = n0.f14659d;
            } else if (length3 != 1) {
                Intrinsics.checkNotNullParameter(sArr, "<this>");
                C6 = new ArrayList(sArr.length);
                int length4 = sArr.length;
                while (i7 < length4) {
                    C6.add(Short.valueOf(sArr[i7]));
                    i7++;
                }
            } else {
                C6 = c0.c(Short.valueOf(sArr[0]));
            }
            return a(C6, zVar, so.k.SHORT);
        }
        if (obj instanceof int[]) {
            return a(kotlin.collections.y.G((int[]) obj), zVar, so.k.INT);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            Intrinsics.checkNotNullParameter(jArr, "<this>");
            int length5 = jArr.length;
            if (length5 == 0) {
                C5 = n0.f14659d;
            } else if (length5 != 1) {
                Intrinsics.checkNotNullParameter(jArr, "<this>");
                C5 = new ArrayList(jArr.length);
                int length6 = jArr.length;
                while (i7 < length6) {
                    C5.add(Long.valueOf(jArr[i7]));
                    i7++;
                }
            } else {
                C5 = c0.c(Long.valueOf(jArr[0]));
            }
            return a(C5, zVar, so.k.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            Intrinsics.checkNotNullParameter(cArr, "<this>");
            int length7 = cArr.length;
            if (length7 == 0) {
                C4 = n0.f14659d;
            } else if (length7 != 1) {
                Intrinsics.checkNotNullParameter(cArr, "<this>");
                C4 = new ArrayList(cArr.length);
                int length8 = cArr.length;
                while (i7 < length8) {
                    C4.add(Character.valueOf(cArr[i7]));
                    i7++;
                }
            } else {
                C4 = c0.c(Character.valueOf(cArr[0]));
            }
            return a(C4, zVar, so.k.CHAR);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            Intrinsics.checkNotNullParameter(fArr, "<this>");
            int length9 = fArr.length;
            if (length9 == 0) {
                C3 = n0.f14659d;
            } else if (length9 != 1) {
                Intrinsics.checkNotNullParameter(fArr, "<this>");
                C3 = new ArrayList(fArr.length);
                int length10 = fArr.length;
                while (i7 < length10) {
                    C3.add(Float.valueOf(fArr[i7]));
                    i7++;
                }
            } else {
                C3 = c0.c(Float.valueOf(fArr[0]));
            }
            return a(C3, zVar, so.k.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            Intrinsics.checkNotNullParameter(dArr, "<this>");
            int length11 = dArr.length;
            if (length11 == 0) {
                C2 = n0.f14659d;
            } else if (length11 != 1) {
                Intrinsics.checkNotNullParameter(dArr, "<this>");
                C2 = new ArrayList(dArr.length);
                int length12 = dArr.length;
                while (i7 < length12) {
                    C2.add(Double.valueOf(dArr[i7]));
                    i7++;
                }
            } else {
                C2 = c0.c(Double.valueOf(dArr[0]));
            }
            return a(C2, zVar, so.k.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new v(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length13 = zArr.length;
        if (length13 == 0) {
            C = n0.f14659d;
        } else if (length13 != 1) {
            Intrinsics.checkNotNullParameter(zArr, "<this>");
            C = new ArrayList(zArr.length);
            int length14 = zArr.length;
            while (i7 < length14) {
                C.add(Boolean.valueOf(zArr[i7]));
                i7++;
            }
        } else {
            C = c0.c(Boolean.valueOf(zArr[0]));
        }
        return a(C, zVar, so.k.BOOLEAN);
    }
}
