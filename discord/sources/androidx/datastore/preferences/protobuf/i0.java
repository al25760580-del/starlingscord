package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    /* JADX WARN: Code duplicated, block: B:44:0x012f  */
    /* JADX WARN: Code duplicated, block: B:49:0x013e  */
    /* JADX WARN: Code duplicated, block: B:50:0x014f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0160  */
    /* JADX WARN: Code duplicated, block: B:53:0x0168  */
    /* JADX WARN: Code duplicated, block: B:55:0x0170  */
    /* JADX WARN: Code duplicated, block: B:56:0x017c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0188  */
    /* JADX WARN: Code duplicated, block: B:59:0x018c  */
    /* JADX WARN: Code duplicated, block: B:61:0x019a  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:75:0x0204  */
    /* JADX WARN: Code duplicated, block: B:80:0x0138 A[SYNTHETIC] */
    public static int a(int i7, Object obj, Object obj2) {
        int iA;
        int size;
        int iZ;
        int i10;
        v1 v1Var;
        int iY;
        int size2;
        int iZ2;
        h0 h0Var = (h0) obj;
        g0 g0Var = (g0) obj2;
        int iC = 0;
        if (h0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : h0Var.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            g0Var.getClass();
            int iY2 = i.y(i7);
            f0 f0Var = g0Var.f1864a;
            v1 v1Var2 = f0Var.f1856a;
            int i11 = n.f1902c;
            int iA2 = 1;
            int iY3 = i.y(1);
            s1 s1Var = v1.f1943v;
            if (v1Var2 == s1Var) {
                iY3 *= 2;
            }
            switch (v1Var2.ordinal()) {
                case 0:
                    ((Double) key).getClass();
                    iA = 8;
                    i10 = iA + iY3;
                    v1Var = f0Var.f1857b;
                    iY = i.y(2);
                    if (v1Var == s1Var) {
                        iY *= 2;
                    }
                    switch (v1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iA2 = 8;
                            int i12 = iA2 + iY + i10;
                            iC = a3.e.c(i12, i12, iY2, iC);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA2 = 4;
                            int i13 = iA2 + iY + i10;
                            iC = a3.e.c(i13, i13, iY2, iC);
                            break;
                        case 2:
                            iA2 = i.A(((Long) value).longValue());
                            int i14 = iA2 + iY + i10;
                            iC = a3.e.c(i14, i14, iY2, iC);
                            break;
                        case 3:
                            iA2 = i.A(((Long) value).longValue());
                            int i15 = iA2 + iY + i10;
                            iC = a3.e.c(i15, i15, iY2, iC);
                            break;
                        case 4:
                            iA2 = i.w(((Integer) value).intValue());
                            int i16 = iA2 + iY + i10;
                            iC = a3.e.c(i16, i16, iY2, iC);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i17 = iA2 + iY + i10;
                            iC = a3.e.c(i17, i17, iY2, iC);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i18 = iA2 + iY + i10;
                            iC = a3.e.c(i18, i18, iY2, iC);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i19 = iA2 + iY + i10;
                            iC = a3.e.c(i19, i19, iY2, iC);
                            break;
                        case 8:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                            } else {
                                iA2 = i.x((String) value);
                            }
                            int i110 = iA2 + iY + i10;
                            iC = a3.e.c(i110, i110, iY2, iC);
                            break;
                        case 9:
                            iA2 = ((a) value).a();
                            int i111 = iA2 + iY + i10;
                            iC = a3.e.c(i111, i111, iY2, iC);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iZ2 = i.z(size2);
                            iA2 = iZ2 + size2;
                            int i112 = iA2 + iY + i10;
                            iC = a3.e.c(i112, i112, iY2, iC);
                            break;
                        case 11:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iZ2 = i.z(size2);
                            }
                            iA2 = iZ2 + size2;
                            int i113 = iA2 + iY + i10;
                            iC = a3.e.c(i113, i113, iY2, iC);
                            break;
                        case 12:
                            iA2 = i.z(((Integer) value).intValue());
                            int i114 = iA2 + iY + i10;
                            iC = a3.e.c(i114, i114, iY2, iC);
                            break;
                        case 13:
                            iA2 = i.w(((Integer) value).intValue());
                            int i115 = iA2 + iY + i10;
                            iC = a3.e.c(i115, i115, iY2, iC);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i116 = iA2 + iY + i10;
                            iC = a3.e.c(i116, i116, iY2, iC);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i117 = iA2 + iY + i10;
                            iC = a3.e.c(i117, i117, iY2, iC);
                            break;
                        case 16:
                            int iIntValue = ((Integer) value).intValue();
                            iA2 = i.z((iIntValue >> 31) ^ (iIntValue << 1));
                            int i118 = iA2 + iY + i10;
                            iC = a3.e.c(i118, i118, iY2, iC);
                            break;
                        case 17:
                            long jLongValue = ((Long) value).longValue();
                            iA2 = i.A((jLongValue >> 63) ^ (jLongValue << 1));
                            int i119 = iA2 + iY + i10;
                            iC = a3.e.c(i119, i119, iY2, iC);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 1:
                    ((Float) key).getClass();
                    iA = 4;
                    i10 = iA + iY3;
                    v1Var = f0Var.f1857b;
                    iY = i.y(2);
                    if (v1Var == s1Var) {
                        iY *= 2;
                    }
                    switch (v1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iA2 = 8;
                            int i1110 = iA2 + iY + i10;
                            iC = a3.e.c(i1110, i1110, iY2, iC);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA2 = 4;
                            int i1111 = iA2 + iY + i10;
                            iC = a3.e.c(i1111, i1111, iY2, iC);
                            break;
                        case 2:
                            iA2 = i.A(((Long) value).longValue());
                            int i1112 = iA2 + iY + i10;
                            iC = a3.e.c(i1112, i1112, iY2, iC);
                            break;
                        case 3:
                            iA2 = i.A(((Long) value).longValue());
                            int i1113 = iA2 + iY + i10;
                            iC = a3.e.c(i1113, i1113, iY2, iC);
                            break;
                        case 4:
                            iA2 = i.w(((Integer) value).intValue());
                            int i1114 = iA2 + iY + i10;
                            iC = a3.e.c(i1114, i1114, iY2, iC);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i1115 = iA2 + iY + i10;
                            iC = a3.e.c(i1115, i1115, iY2, iC);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i1116 = iA2 + iY + i10;
                            iC = a3.e.c(i1116, i1116, iY2, iC);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i1117 = iA2 + iY + i10;
                            iC = a3.e.c(i1117, i1117, iY2, iC);
                            break;
                        case 8:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                            } else {
                                iA2 = i.x((String) value);
                            }
                            int i1118 = iA2 + iY + i10;
                            iC = a3.e.c(i1118, i1118, iY2, iC);
                            break;
                        case 9:
                            iA2 = ((a) value).a();
                            int i1119 = iA2 + iY + i10;
                            iC = a3.e.c(i1119, i1119, iY2, iC);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iZ2 = i.z(size2);
                            iA2 = iZ2 + size2;
                            int i11110 = iA2 + iY + i10;
                            iC = a3.e.c(i11110, i11110, iY2, iC);
                            break;
                        case 11:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iZ2 = i.z(size2);
                            }
                            iA2 = iZ2 + size2;
                            int i11111 = iA2 + iY + i10;
                            iC = a3.e.c(i11111, i11111, iY2, iC);
                            break;
                        case 12:
                            iA2 = i.z(((Integer) value).intValue());
                            int i11112 = iA2 + iY + i10;
                            iC = a3.e.c(i11112, i11112, iY2, iC);
                            break;
                        case 13:
                            iA2 = i.w(((Integer) value).intValue());
                            int i11113 = iA2 + iY + i10;
                            iC = a3.e.c(i11113, i11113, iY2, iC);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i11114 = iA2 + iY + i10;
                            iC = a3.e.c(i11114, i11114, iY2, iC);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i11115 = iA2 + iY + i10;
                            iC = a3.e.c(i11115, i11115, iY2, iC);
                            break;
                        case 16:
                            int iIntValue2 = ((Integer) value).intValue();
                            iA2 = i.z((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                            int i11116 = iA2 + iY + i10;
                            iC = a3.e.c(i11116, i11116, iY2, iC);
                            break;
                        case 17:
                            long jLongValue2 = ((Long) value).longValue();
                            iA2 = i.A((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                            int i11117 = iA2 + iY + i10;
                            iC = a3.e.c(i11117, i11117, iY2, iC);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 2:
                    iA = i.A(((Long) key).longValue());
                    i10 = iA + iY3;
                    v1Var = f0Var.f1857b;
                    iY = i.y(2);
                    if (v1Var == s1Var) {
                        iY *= 2;
                    }
                    switch (v1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iA2 = 8;
                            int i11118 = iA2 + iY + i10;
                            iC = a3.e.c(i11118, i11118, iY2, iC);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA2 = 4;
                            int i11119 = iA2 + iY + i10;
                            iC = a3.e.c(i11119, i11119, iY2, iC);
                            break;
                        case 2:
                            iA2 = i.A(((Long) value).longValue());
                            int i111110 = iA2 + iY + i10;
                            iC = a3.e.c(i111110, i111110, iY2, iC);
                            break;
                        case 3:
                            iA2 = i.A(((Long) value).longValue());
                            int i111111 = iA2 + iY + i10;
                            iC = a3.e.c(i111111, i111111, iY2, iC);
                            break;
                        case 4:
                            iA2 = i.w(((Integer) value).intValue());
                            int i111112 = iA2 + iY + i10;
                            iC = a3.e.c(i111112, i111112, iY2, iC);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i111113 = iA2 + iY + i10;
                            iC = a3.e.c(i111113, i111113, iY2, iC);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i111114 = iA2 + iY + i10;
                            iC = a3.e.c(i111114, i111114, iY2, iC);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111115 = iA2 + iY + i10;
                            iC = a3.e.c(i111115, i111115, iY2, iC);
                            break;
                        case 8:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                            } else {
                                iA2 = i.x((String) value);
                            }
                            int i111116 = iA2 + iY + i10;
                            iC = a3.e.c(i111116, i111116, iY2, iC);
                            break;
                        case 9:
                            iA2 = ((a) value).a();
                            int i111117 = iA2 + iY + i10;
                            iC = a3.e.c(i111117, i111117, iY2, iC);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iZ2 = i.z(size2);
                            iA2 = iZ2 + size2;
                            int i111118 = iA2 + iY + i10;
                            iC = a3.e.c(i111118, i111118, iY2, iC);
                            break;
                        case 11:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iZ2 = i.z(size2);
                            }
                            iA2 = iZ2 + size2;
                            int i111119 = iA2 + iY + i10;
                            iC = a3.e.c(i111119, i111119, iY2, iC);
                            break;
                        case 12:
                            iA2 = i.z(((Integer) value).intValue());
                            int i1111110 = iA2 + iY + i10;
                            iC = a3.e.c(i1111110, i1111110, iY2, iC);
                            break;
                        case 13:
                            iA2 = i.w(((Integer) value).intValue());
                            int i1111111 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111, i1111111, iY2, iC);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i1111112 = iA2 + iY + i10;
                            iC = a3.e.c(i1111112, i1111112, iY2, iC);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i1111113 = iA2 + iY + i10;
                            iC = a3.e.c(i1111113, i1111113, iY2, iC);
                            break;
                        case 16:
                            int iIntValue3 = ((Integer) value).intValue();
                            iA2 = i.z((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                            int i1111114 = iA2 + iY + i10;
                            iC = a3.e.c(i1111114, i1111114, iY2, iC);
                            break;
                        case 17:
                            long jLongValue3 = ((Long) value).longValue();
                            iA2 = i.A((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                            int i1111115 = iA2 + iY + i10;
                            iC = a3.e.c(i1111115, i1111115, iY2, iC);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 3:
                    iA = i.A(((Long) key).longValue());
                    i10 = iA + iY3;
                    v1Var = f0Var.f1857b;
                    iY = i.y(2);
                    if (v1Var == s1Var) {
                        iY *= 2;
                    }
                    switch (v1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iA2 = 8;
                            int i1111116 = iA2 + iY + i10;
                            iC = a3.e.c(i1111116, i1111116, iY2, iC);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA2 = 4;
                            int i1111117 = iA2 + iY + i10;
                            iC = a3.e.c(i1111117, i1111117, iY2, iC);
                            break;
                        case 2:
                            iA2 = i.A(((Long) value).longValue());
                            int i1111118 = iA2 + iY + i10;
                            iC = a3.e.c(i1111118, i1111118, iY2, iC);
                            break;
                        case 3:
                            iA2 = i.A(((Long) value).longValue());
                            int i1111119 = iA2 + iY + i10;
                            iC = a3.e.c(i1111119, i1111119, iY2, iC);
                            break;
                        case 4:
                            iA2 = i.w(((Integer) value).intValue());
                            int i11111110 = iA2 + iY + i10;
                            iC = a3.e.c(i11111110, i11111110, iY2, iC);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i11111111 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111, i11111111, iY2, iC);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i11111112 = iA2 + iY + i10;
                            iC = a3.e.c(i11111112, i11111112, iY2, iC);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111113 = iA2 + iY + i10;
                            iC = a3.e.c(i11111113, i11111113, iY2, iC);
                            break;
                        case 8:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                            } else {
                                iA2 = i.x((String) value);
                            }
                            int i11111114 = iA2 + iY + i10;
                            iC = a3.e.c(i11111114, i11111114, iY2, iC);
                            break;
                        case 9:
                            iA2 = ((a) value).a();
                            int i11111115 = iA2 + iY + i10;
                            iC = a3.e.c(i11111115, i11111115, iY2, iC);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iZ2 = i.z(size2);
                            iA2 = iZ2 + size2;
                            int i11111116 = iA2 + iY + i10;
                            iC = a3.e.c(i11111116, i11111116, iY2, iC);
                            break;
                        case 11:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iZ2 = i.z(size2);
                            }
                            iA2 = iZ2 + size2;
                            int i11111117 = iA2 + iY + i10;
                            iC = a3.e.c(i11111117, i11111117, iY2, iC);
                            break;
                        case 12:
                            iA2 = i.z(((Integer) value).intValue());
                            int i11111118 = iA2 + iY + i10;
                            iC = a3.e.c(i11111118, i11111118, iY2, iC);
                            break;
                        case 13:
                            iA2 = i.w(((Integer) value).intValue());
                            int i11111119 = iA2 + iY + i10;
                            iC = a3.e.c(i11111119, i11111119, iY2, iC);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i111111110, i111111110, iY2, iC);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111, i111111111, iY2, iC);
                            break;
                        case 16:
                            int iIntValue4 = ((Integer) value).intValue();
                            iA2 = i.z((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                            int i111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i111111112, i111111112, iY2, iC);
                            break;
                        case 17:
                            long jLongValue4 = ((Long) value).longValue();
                            iA2 = i.A((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                            int i111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i111111113, i111111113, iY2, iC);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 4:
                    iA = i.w(((Integer) key).intValue());
                    i10 = iA + iY3;
                    v1Var = f0Var.f1857b;
                    iY = i.y(2);
                    if (v1Var == s1Var) {
                        iY *= 2;
                    }
                    switch (v1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iA2 = 8;
                            int i111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i111111114, i111111114, iY2, iC);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA2 = 4;
                            int i111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i111111115, i111111115, iY2, iC);
                            break;
                        case 2:
                            iA2 = i.A(((Long) value).longValue());
                            int i111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i111111116, i111111116, iY2, iC);
                            break;
                        case 3:
                            iA2 = i.A(((Long) value).longValue());
                            int i111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i111111117, i111111117, iY2, iC);
                            break;
                        case 4:
                            iA2 = i.w(((Integer) value).intValue());
                            int i111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i111111118, i111111118, iY2, iC);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i111111119, i111111119, iY2, iC);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i1111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111110, i1111111110, iY2, iC);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i1111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111, i1111111111, iY2, iC);
                            break;
                        case 8:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                            } else {
                                iA2 = i.x((String) value);
                            }
                            int i1111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111112, i1111111112, iY2, iC);
                            break;
                        case 9:
                            iA2 = ((a) value).a();
                            int i1111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111113, i1111111113, iY2, iC);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iZ2 = i.z(size2);
                            iA2 = iZ2 + size2;
                            int i1111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111114, i1111111114, iY2, iC);
                            break;
                        case 11:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iZ2 = i.z(size2);
                            }
                            iA2 = iZ2 + size2;
                            int i1111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111115, i1111111115, iY2, iC);
                            break;
                        case 12:
                            iA2 = i.z(((Integer) value).intValue());
                            int i1111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111116, i1111111116, iY2, iC);
                            break;
                        case 13:
                            iA2 = i.w(((Integer) value).intValue());
                            int i1111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111117, i1111111117, iY2, iC);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i1111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111118, i1111111118, iY2, iC);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i1111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111119, i1111111119, iY2, iC);
                            break;
                        case 16:
                            int iIntValue5 = ((Integer) value).intValue();
                            iA2 = i.z((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                            int i11111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111110, i11111111110, iY2, iC);
                            break;
                        case 17:
                            long jLongValue5 = ((Long) value).longValue();
                            iA2 = i.A((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                            int i11111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111, i11111111111, iY2, iC);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 5:
                    ((Long) key).getClass();
                    iA = 8;
                    i10 = iA + iY3;
                    v1Var = f0Var.f1857b;
                    iY = i.y(2);
                    if (v1Var == s1Var) {
                        iY *= 2;
                    }
                    switch (v1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iA2 = 8;
                            int i11111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111112, i11111111112, iY2, iC);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA2 = 4;
                            int i11111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111113, i11111111113, iY2, iC);
                            break;
                        case 2:
                            iA2 = i.A(((Long) value).longValue());
                            int i11111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111114, i11111111114, iY2, iC);
                            break;
                        case 3:
                            iA2 = i.A(((Long) value).longValue());
                            int i11111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111115, i11111111115, iY2, iC);
                            break;
                        case 4:
                            iA2 = i.w(((Integer) value).intValue());
                            int i11111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111116, i11111111116, iY2, iC);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i11111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111117, i11111111117, iY2, iC);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i11111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111118, i11111111118, iY2, iC);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111119, i11111111119, iY2, iC);
                            break;
                        case 8:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                            } else {
                                iA2 = i.x((String) value);
                            }
                            int i111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111110, i111111111110, iY2, iC);
                            break;
                        case 9:
                            iA2 = ((a) value).a();
                            int i111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111, i111111111111, iY2, iC);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iZ2 = i.z(size2);
                            iA2 = iZ2 + size2;
                            int i111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111112, i111111111112, iY2, iC);
                            break;
                        case 11:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iZ2 = i.z(size2);
                            }
                            iA2 = iZ2 + size2;
                            int i111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111113, i111111111113, iY2, iC);
                            break;
                        case 12:
                            iA2 = i.z(((Integer) value).intValue());
                            int i111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111114, i111111111114, iY2, iC);
                            break;
                        case 13:
                            iA2 = i.w(((Integer) value).intValue());
                            int i111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111115, i111111111115, iY2, iC);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111116, i111111111116, iY2, iC);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111117, i111111111117, iY2, iC);
                            break;
                        case 16:
                            int iIntValue6 = ((Integer) value).intValue();
                            iA2 = i.z((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                            int i111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111118, i111111111118, iY2, iC);
                            break;
                        case 17:
                            long jLongValue6 = ((Long) value).longValue();
                            iA2 = i.A((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                            int i111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111119, i111111111119, iY2, iC);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 6:
                    ((Integer) key).getClass();
                    iA = 4;
                    i10 = iA + iY3;
                    v1Var = f0Var.f1857b;
                    iY = i.y(2);
                    if (v1Var == s1Var) {
                        iY *= 2;
                    }
                    switch (v1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iA2 = 8;
                            int i1111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111110, i1111111111110, iY2, iC);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA2 = 4;
                            int i1111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111, i1111111111111, iY2, iC);
                            break;
                        case 2:
                            iA2 = i.A(((Long) value).longValue());
                            int i1111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111112, i1111111111112, iY2, iC);
                            break;
                        case 3:
                            iA2 = i.A(((Long) value).longValue());
                            int i1111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111113, i1111111111113, iY2, iC);
                            break;
                        case 4:
                            iA2 = i.w(((Integer) value).intValue());
                            int i1111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111114, i1111111111114, iY2, iC);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i1111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111115, i1111111111115, iY2, iC);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i1111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111116, i1111111111116, iY2, iC);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i1111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111117, i1111111111117, iY2, iC);
                            break;
                        case 8:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                            } else {
                                iA2 = i.x((String) value);
                            }
                            int i1111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111118, i1111111111118, iY2, iC);
                            break;
                        case 9:
                            iA2 = ((a) value).a();
                            int i1111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111119, i1111111111119, iY2, iC);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iZ2 = i.z(size2);
                            iA2 = iZ2 + size2;
                            int i11111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111110, i11111111111110, iY2, iC);
                            break;
                        case 11:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iZ2 = i.z(size2);
                            }
                            iA2 = iZ2 + size2;
                            int i11111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111, i11111111111111, iY2, iC);
                            break;
                        case 12:
                            iA2 = i.z(((Integer) value).intValue());
                            int i11111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111112, i11111111111112, iY2, iC);
                            break;
                        case 13:
                            iA2 = i.w(((Integer) value).intValue());
                            int i11111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111113, i11111111111113, iY2, iC);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i11111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111114, i11111111111114, iY2, iC);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i11111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111115, i11111111111115, iY2, iC);
                            break;
                        case 16:
                            int iIntValue7 = ((Integer) value).intValue();
                            iA2 = i.z((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                            int i11111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111116, i11111111111116, iY2, iC);
                            break;
                        case 17:
                            long jLongValue7 = ((Long) value).longValue();
                            iA2 = i.A((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                            int i11111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111117, i11111111111117, iY2, iC);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 7:
                    ((Boolean) key).getClass();
                    iA = 1;
                    i10 = iA + iY3;
                    v1Var = f0Var.f1857b;
                    iY = i.y(2);
                    if (v1Var == s1Var) {
                        iY *= 2;
                    }
                    switch (v1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iA2 = 8;
                            int i11111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111118, i11111111111118, iY2, iC);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA2 = 4;
                            int i11111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111119, i11111111111119, iY2, iC);
                            break;
                        case 2:
                            iA2 = i.A(((Long) value).longValue());
                            int i111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111110, i111111111111110, iY2, iC);
                            break;
                        case 3:
                            iA2 = i.A(((Long) value).longValue());
                            int i111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111, i111111111111111, iY2, iC);
                            break;
                        case 4:
                            iA2 = i.w(((Integer) value).intValue());
                            int i111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111112, i111111111111112, iY2, iC);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111113, i111111111111113, iY2, iC);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111114, i111111111111114, iY2, iC);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111115, i111111111111115, iY2, iC);
                            break;
                        case 8:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                            } else {
                                iA2 = i.x((String) value);
                            }
                            int i111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111116, i111111111111116, iY2, iC);
                            break;
                        case 9:
                            iA2 = ((a) value).a();
                            int i111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111117, i111111111111117, iY2, iC);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iZ2 = i.z(size2);
                            iA2 = iZ2 + size2;
                            int i111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111118, i111111111111118, iY2, iC);
                            break;
                        case 11:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iZ2 = i.z(size2);
                            }
                            iA2 = iZ2 + size2;
                            int i111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111119, i111111111111119, iY2, iC);
                            break;
                        case 12:
                            iA2 = i.z(((Integer) value).intValue());
                            int i1111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111110, i1111111111111110, iY2, iC);
                            break;
                        case 13:
                            iA2 = i.w(((Integer) value).intValue());
                            int i1111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111, i1111111111111111, iY2, iC);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i1111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111112, i1111111111111112, iY2, iC);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i1111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111113, i1111111111111113, iY2, iC);
                            break;
                        case 16:
                            int iIntValue8 = ((Integer) value).intValue();
                            iA2 = i.z((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                            int i1111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111114, i1111111111111114, iY2, iC);
                            break;
                        case 17:
                            long jLongValue8 = ((Long) value).longValue();
                            iA2 = i.A((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                            int i1111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111115, i1111111111111115, iY2, iC);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 8:
                    if (key instanceof e) {
                        size = ((e) key).size();
                        iZ = i.z(size);
                        iA = size + iZ;
                    } else {
                        iA = i.x((String) key);
                    }
                    i10 = iA + iY3;
                    v1Var = f0Var.f1857b;
                    iY = i.y(2);
                    if (v1Var == s1Var) {
                        iY *= 2;
                    }
                    switch (v1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iA2 = 8;
                            int i1111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111116, i1111111111111116, iY2, iC);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA2 = 4;
                            int i1111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111117, i1111111111111117, iY2, iC);
                            break;
                        case 2:
                            iA2 = i.A(((Long) value).longValue());
                            int i1111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111118, i1111111111111118, iY2, iC);
                            break;
                        case 3:
                            iA2 = i.A(((Long) value).longValue());
                            int i1111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111119, i1111111111111119, iY2, iC);
                            break;
                        case 4:
                            iA2 = i.w(((Integer) value).intValue());
                            int i11111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111110, i11111111111111110, iY2, iC);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i11111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111, i11111111111111111, iY2, iC);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i11111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111112, i11111111111111112, iY2, iC);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111113, i11111111111111113, iY2, iC);
                            break;
                        case 8:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                            } else {
                                iA2 = i.x((String) value);
                            }
                            int i11111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111114, i11111111111111114, iY2, iC);
                            break;
                        case 9:
                            iA2 = ((a) value).a();
                            int i11111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111115, i11111111111111115, iY2, iC);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iZ2 = i.z(size2);
                            iA2 = iZ2 + size2;
                            int i11111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111116, i11111111111111116, iY2, iC);
                            break;
                        case 11:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iZ2 = i.z(size2);
                            }
                            iA2 = iZ2 + size2;
                            int i11111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111117, i11111111111111117, iY2, iC);
                            break;
                        case 12:
                            iA2 = i.z(((Integer) value).intValue());
                            int i11111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111118, i11111111111111118, iY2, iC);
                            break;
                        case 13:
                            iA2 = i.w(((Integer) value).intValue());
                            int i11111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111119, i11111111111111119, iY2, iC);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i111111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111110, i111111111111111110, iY2, iC);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i111111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111, i111111111111111111, iY2, iC);
                            break;
                        case 16:
                            int iIntValue9 = ((Integer) value).intValue();
                            iA2 = i.z((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                            int i111111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111112, i111111111111111112, iY2, iC);
                            break;
                        case 17:
                            long jLongValue9 = ((Long) value).longValue();
                            iA2 = i.A((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                            int i111111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111113, i111111111111111113, iY2, iC);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 9:
                    iA = ((a) key).a();
                    i10 = iA + iY3;
                    v1Var = f0Var.f1857b;
                    iY = i.y(2);
                    if (v1Var == s1Var) {
                        iY *= 2;
                    }
                    switch (v1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iA2 = 8;
                            int i111111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111114, i111111111111111114, iY2, iC);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA2 = 4;
                            int i111111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111115, i111111111111111115, iY2, iC);
                            break;
                        case 2:
                            iA2 = i.A(((Long) value).longValue());
                            int i111111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111116, i111111111111111116, iY2, iC);
                            break;
                        case 3:
                            iA2 = i.A(((Long) value).longValue());
                            int i111111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111117, i111111111111111117, iY2, iC);
                            break;
                        case 4:
                            iA2 = i.w(((Integer) value).intValue());
                            int i111111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111118, i111111111111111118, iY2, iC);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i111111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111119, i111111111111111119, iY2, iC);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i1111111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111110, i1111111111111111110, iY2, iC);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i1111111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111, i1111111111111111111, iY2, iC);
                            break;
                        case 8:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                            } else {
                                iA2 = i.x((String) value);
                            }
                            int i1111111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111112, i1111111111111111112, iY2, iC);
                            break;
                        case 9:
                            iA2 = ((a) value).a();
                            int i1111111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111113, i1111111111111111113, iY2, iC);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iZ2 = i.z(size2);
                            iA2 = iZ2 + size2;
                            int i1111111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111114, i1111111111111111114, iY2, iC);
                            break;
                        case 11:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iZ2 = i.z(size2);
                            }
                            iA2 = iZ2 + size2;
                            int i1111111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111115, i1111111111111111115, iY2, iC);
                            break;
                        case 12:
                            iA2 = i.z(((Integer) value).intValue());
                            int i1111111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111116, i1111111111111111116, iY2, iC);
                            break;
                        case 13:
                            iA2 = i.w(((Integer) value).intValue());
                            int i1111111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111117, i1111111111111111117, iY2, iC);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i1111111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111118, i1111111111111111118, iY2, iC);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i1111111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111119, i1111111111111111119, iY2, iC);
                            break;
                        case 16:
                            int iIntValue10 = ((Integer) value).intValue();
                            iA2 = i.z((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                            int i11111111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111110, i11111111111111111110, iY2, iC);
                            break;
                        case 17:
                            long jLongValue10 = ((Long) value).longValue();
                            iA2 = i.A((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                            int i11111111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111, i11111111111111111111, iY2, iC);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 10:
                    size = ((a) key).a();
                    iZ = i.z(size);
                    iA = size + iZ;
                    i10 = iA + iY3;
                    v1Var = f0Var.f1857b;
                    iY = i.y(2);
                    if (v1Var == s1Var) {
                        iY *= 2;
                    }
                    switch (v1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iA2 = 8;
                            int i11111111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111112, i11111111111111111112, iY2, iC);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA2 = 4;
                            int i11111111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111113, i11111111111111111113, iY2, iC);
                            break;
                        case 2:
                            iA2 = i.A(((Long) value).longValue());
                            int i11111111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111114, i11111111111111111114, iY2, iC);
                            break;
                        case 3:
                            iA2 = i.A(((Long) value).longValue());
                            int i11111111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111115, i11111111111111111115, iY2, iC);
                            break;
                        case 4:
                            iA2 = i.w(((Integer) value).intValue());
                            int i11111111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111116, i11111111111111111116, iY2, iC);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i11111111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111117, i11111111111111111117, iY2, iC);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i11111111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111118, i11111111111111111118, iY2, iC);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111119, i11111111111111111119, iY2, iC);
                            break;
                        case 8:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                            } else {
                                iA2 = i.x((String) value);
                            }
                            int i111111111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111110, i111111111111111111110, iY2, iC);
                            break;
                        case 9:
                            iA2 = ((a) value).a();
                            int i111111111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111, i111111111111111111111, iY2, iC);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iZ2 = i.z(size2);
                            iA2 = iZ2 + size2;
                            int i111111111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111112, i111111111111111111112, iY2, iC);
                            break;
                        case 11:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iZ2 = i.z(size2);
                            }
                            iA2 = iZ2 + size2;
                            int i111111111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111113, i111111111111111111113, iY2, iC);
                            break;
                        case 12:
                            iA2 = i.z(((Integer) value).intValue());
                            int i111111111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111114, i111111111111111111114, iY2, iC);
                            break;
                        case 13:
                            iA2 = i.w(((Integer) value).intValue());
                            int i111111111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111115, i111111111111111111115, iY2, iC);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i111111111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111116, i111111111111111111116, iY2, iC);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i111111111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111117, i111111111111111111117, iY2, iC);
                            break;
                        case 16:
                            int iIntValue11 = ((Integer) value).intValue();
                            iA2 = i.z((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                            int i111111111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111118, i111111111111111111118, iY2, iC);
                            break;
                        case 17:
                            long jLongValue11 = ((Long) value).longValue();
                            iA2 = i.A((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                            int i111111111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111119, i111111111111111111119, iY2, iC);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 11:
                    if (key instanceof e) {
                        size = ((e) key).size();
                        iZ = i.z(size);
                    } else {
                        size = ((byte[]) key).length;
                        iZ = i.z(size);
                    }
                    iA = size + iZ;
                    i10 = iA + iY3;
                    v1Var = f0Var.f1857b;
                    iY = i.y(2);
                    if (v1Var == s1Var) {
                        iY *= 2;
                    }
                    switch (v1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iA2 = 8;
                            int i1111111111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111110, i1111111111111111111110, iY2, iC);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA2 = 4;
                            int i1111111111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111, i1111111111111111111111, iY2, iC);
                            break;
                        case 2:
                            iA2 = i.A(((Long) value).longValue());
                            int i1111111111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111112, i1111111111111111111112, iY2, iC);
                            break;
                        case 3:
                            iA2 = i.A(((Long) value).longValue());
                            int i1111111111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111113, i1111111111111111111113, iY2, iC);
                            break;
                        case 4:
                            iA2 = i.w(((Integer) value).intValue());
                            int i1111111111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111114, i1111111111111111111114, iY2, iC);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i1111111111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111115, i1111111111111111111115, iY2, iC);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i1111111111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111116, i1111111111111111111116, iY2, iC);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i1111111111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111117, i1111111111111111111117, iY2, iC);
                            break;
                        case 8:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                            } else {
                                iA2 = i.x((String) value);
                            }
                            int i1111111111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111118, i1111111111111111111118, iY2, iC);
                            break;
                        case 9:
                            iA2 = ((a) value).a();
                            int i1111111111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111119, i1111111111111111111119, iY2, iC);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iZ2 = i.z(size2);
                            iA2 = iZ2 + size2;
                            int i11111111111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111110, i11111111111111111111110, iY2, iC);
                            break;
                        case 11:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iZ2 = i.z(size2);
                            }
                            iA2 = iZ2 + size2;
                            int i11111111111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111, i11111111111111111111111, iY2, iC);
                            break;
                        case 12:
                            iA2 = i.z(((Integer) value).intValue());
                            int i11111111111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111112, i11111111111111111111112, iY2, iC);
                            break;
                        case 13:
                            iA2 = i.w(((Integer) value).intValue());
                            int i11111111111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111113, i11111111111111111111113, iY2, iC);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i11111111111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111114, i11111111111111111111114, iY2, iC);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i11111111111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111115, i11111111111111111111115, iY2, iC);
                            break;
                        case 16:
                            int iIntValue12 = ((Integer) value).intValue();
                            iA2 = i.z((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                            int i11111111111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111116, i11111111111111111111116, iY2, iC);
                            break;
                        case 17:
                            long jLongValue12 = ((Long) value).longValue();
                            iA2 = i.A((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                            int i11111111111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111117, i11111111111111111111117, iY2, iC);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 12:
                    iA = i.z(((Integer) key).intValue());
                    i10 = iA + iY3;
                    v1Var = f0Var.f1857b;
                    iY = i.y(2);
                    if (v1Var == s1Var) {
                        iY *= 2;
                    }
                    switch (v1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iA2 = 8;
                            int i11111111111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111118, i11111111111111111111118, iY2, iC);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA2 = 4;
                            int i11111111111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111119, i11111111111111111111119, iY2, iC);
                            break;
                        case 2:
                            iA2 = i.A(((Long) value).longValue());
                            int i111111111111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111110, i111111111111111111111110, iY2, iC);
                            break;
                        case 3:
                            iA2 = i.A(((Long) value).longValue());
                            int i111111111111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111, i111111111111111111111111, iY2, iC);
                            break;
                        case 4:
                            iA2 = i.w(((Integer) value).intValue());
                            int i111111111111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111112, i111111111111111111111112, iY2, iC);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i111111111111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111113, i111111111111111111111113, iY2, iC);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i111111111111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111114, i111111111111111111111114, iY2, iC);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111111111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111115, i111111111111111111111115, iY2, iC);
                            break;
                        case 8:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                            } else {
                                iA2 = i.x((String) value);
                            }
                            int i111111111111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111116, i111111111111111111111116, iY2, iC);
                            break;
                        case 9:
                            iA2 = ((a) value).a();
                            int i111111111111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111117, i111111111111111111111117, iY2, iC);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iZ2 = i.z(size2);
                            iA2 = iZ2 + size2;
                            int i111111111111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111118, i111111111111111111111118, iY2, iC);
                            break;
                        case 11:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iZ2 = i.z(size2);
                            }
                            iA2 = iZ2 + size2;
                            int i111111111111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111119, i111111111111111111111119, iY2, iC);
                            break;
                        case 12:
                            iA2 = i.z(((Integer) value).intValue());
                            int i1111111111111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111110, i1111111111111111111111110, iY2, iC);
                            break;
                        case 13:
                            iA2 = i.w(((Integer) value).intValue());
                            int i1111111111111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111, i1111111111111111111111111, iY2, iC);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i1111111111111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111112, i1111111111111111111111112, iY2, iC);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i1111111111111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111113, i1111111111111111111111113, iY2, iC);
                            break;
                        case 16:
                            int iIntValue13 = ((Integer) value).intValue();
                            iA2 = i.z((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                            int i1111111111111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111114, i1111111111111111111111114, iY2, iC);
                            break;
                        case 17:
                            long jLongValue13 = ((Long) value).longValue();
                            iA2 = i.A((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                            int i1111111111111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111115, i1111111111111111111111115, iY2, iC);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 13:
                    iA = i.w(((Integer) key).intValue());
                    i10 = iA + iY3;
                    v1Var = f0Var.f1857b;
                    iY = i.y(2);
                    if (v1Var == s1Var) {
                        iY *= 2;
                    }
                    switch (v1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iA2 = 8;
                            int i1111111111111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111116, i1111111111111111111111116, iY2, iC);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA2 = 4;
                            int i1111111111111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111117, i1111111111111111111111117, iY2, iC);
                            break;
                        case 2:
                            iA2 = i.A(((Long) value).longValue());
                            int i1111111111111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111118, i1111111111111111111111118, iY2, iC);
                            break;
                        case 3:
                            iA2 = i.A(((Long) value).longValue());
                            int i1111111111111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111119, i1111111111111111111111119, iY2, iC);
                            break;
                        case 4:
                            iA2 = i.w(((Integer) value).intValue());
                            int i11111111111111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111110, i11111111111111111111111110, iY2, iC);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i11111111111111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111, i11111111111111111111111111, iY2, iC);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i11111111111111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111112, i11111111111111111111111112, iY2, iC);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111113, i11111111111111111111111113, iY2, iC);
                            break;
                        case 8:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                            } else {
                                iA2 = i.x((String) value);
                            }
                            int i11111111111111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111114, i11111111111111111111111114, iY2, iC);
                            break;
                        case 9:
                            iA2 = ((a) value).a();
                            int i11111111111111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111115, i11111111111111111111111115, iY2, iC);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iZ2 = i.z(size2);
                            iA2 = iZ2 + size2;
                            int i11111111111111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111116, i11111111111111111111111116, iY2, iC);
                            break;
                        case 11:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iZ2 = i.z(size2);
                            }
                            iA2 = iZ2 + size2;
                            int i11111111111111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111117, i11111111111111111111111117, iY2, iC);
                            break;
                        case 12:
                            iA2 = i.z(((Integer) value).intValue());
                            int i11111111111111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111118, i11111111111111111111111118, iY2, iC);
                            break;
                        case 13:
                            iA2 = i.w(((Integer) value).intValue());
                            int i11111111111111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111119, i11111111111111111111111119, iY2, iC);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i111111111111111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111110, i111111111111111111111111110, iY2, iC);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i111111111111111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111, i111111111111111111111111111, iY2, iC);
                            break;
                        case 16:
                            int iIntValue14 = ((Integer) value).intValue();
                            iA2 = i.z((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                            int i111111111111111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111112, i111111111111111111111111112, iY2, iC);
                            break;
                        case 17:
                            long jLongValue14 = ((Long) value).longValue();
                            iA2 = i.A((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                            int i111111111111111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111113, i111111111111111111111111113, iY2, iC);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 14:
                    ((Integer) key).getClass();
                    iA = 4;
                    i10 = iA + iY3;
                    v1Var = f0Var.f1857b;
                    iY = i.y(2);
                    if (v1Var == s1Var) {
                        iY *= 2;
                    }
                    switch (v1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iA2 = 8;
                            int i111111111111111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111114, i111111111111111111111111114, iY2, iC);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA2 = 4;
                            int i111111111111111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111115, i111111111111111111111111115, iY2, iC);
                            break;
                        case 2:
                            iA2 = i.A(((Long) value).longValue());
                            int i111111111111111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111116, i111111111111111111111111116, iY2, iC);
                            break;
                        case 3:
                            iA2 = i.A(((Long) value).longValue());
                            int i111111111111111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111117, i111111111111111111111111117, iY2, iC);
                            break;
                        case 4:
                            iA2 = i.w(((Integer) value).intValue());
                            int i111111111111111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111118, i111111111111111111111111118, iY2, iC);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i111111111111111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111119, i111111111111111111111111119, iY2, iC);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i1111111111111111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111110, i1111111111111111111111111110, iY2, iC);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i1111111111111111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111111, i1111111111111111111111111111, iY2, iC);
                            break;
                        case 8:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                            } else {
                                iA2 = i.x((String) value);
                            }
                            int i1111111111111111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111112, i1111111111111111111111111112, iY2, iC);
                            break;
                        case 9:
                            iA2 = ((a) value).a();
                            int i1111111111111111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111113, i1111111111111111111111111113, iY2, iC);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iZ2 = i.z(size2);
                            iA2 = iZ2 + size2;
                            int i1111111111111111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111114, i1111111111111111111111111114, iY2, iC);
                            break;
                        case 11:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iZ2 = i.z(size2);
                            }
                            iA2 = iZ2 + size2;
                            int i1111111111111111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111115, i1111111111111111111111111115, iY2, iC);
                            break;
                        case 12:
                            iA2 = i.z(((Integer) value).intValue());
                            int i1111111111111111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111116, i1111111111111111111111111116, iY2, iC);
                            break;
                        case 13:
                            iA2 = i.w(((Integer) value).intValue());
                            int i1111111111111111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111117, i1111111111111111111111111117, iY2, iC);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i1111111111111111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111118, i1111111111111111111111111118, iY2, iC);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i1111111111111111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111119, i1111111111111111111111111119, iY2, iC);
                            break;
                        case 16:
                            int iIntValue15 = ((Integer) value).intValue();
                            iA2 = i.z((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                            int i11111111111111111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111110, i11111111111111111111111111110, iY2, iC);
                            break;
                        case 17:
                            long jLongValue15 = ((Long) value).longValue();
                            iA2 = i.A((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                            int i11111111111111111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111111, i11111111111111111111111111111, iY2, iC);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 15:
                    ((Long) key).getClass();
                    iA = 8;
                    i10 = iA + iY3;
                    v1Var = f0Var.f1857b;
                    iY = i.y(2);
                    if (v1Var == s1Var) {
                        iY *= 2;
                    }
                    switch (v1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iA2 = 8;
                            int i11111111111111111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111112, i11111111111111111111111111112, iY2, iC);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA2 = 4;
                            int i11111111111111111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111113, i11111111111111111111111111113, iY2, iC);
                            break;
                        case 2:
                            iA2 = i.A(((Long) value).longValue());
                            int i11111111111111111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111114, i11111111111111111111111111114, iY2, iC);
                            break;
                        case 3:
                            iA2 = i.A(((Long) value).longValue());
                            int i11111111111111111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111115, i11111111111111111111111111115, iY2, iC);
                            break;
                        case 4:
                            iA2 = i.w(((Integer) value).intValue());
                            int i11111111111111111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111116, i11111111111111111111111111116, iY2, iC);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i11111111111111111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111117, i11111111111111111111111111117, iY2, iC);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i11111111111111111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111118, i11111111111111111111111111118, iY2, iC);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111111111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111119, i11111111111111111111111111119, iY2, iC);
                            break;
                        case 8:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                            } else {
                                iA2 = i.x((String) value);
                            }
                            int i111111111111111111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111110, i111111111111111111111111111110, iY2, iC);
                            break;
                        case 9:
                            iA2 = ((a) value).a();
                            int i111111111111111111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111111, i111111111111111111111111111111, iY2, iC);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iZ2 = i.z(size2);
                            iA2 = iZ2 + size2;
                            int i111111111111111111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111112, i111111111111111111111111111112, iY2, iC);
                            break;
                        case 11:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iZ2 = i.z(size2);
                            }
                            iA2 = iZ2 + size2;
                            int i111111111111111111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111113, i111111111111111111111111111113, iY2, iC);
                            break;
                        case 12:
                            iA2 = i.z(((Integer) value).intValue());
                            int i111111111111111111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111114, i111111111111111111111111111114, iY2, iC);
                            break;
                        case 13:
                            iA2 = i.w(((Integer) value).intValue());
                            int i111111111111111111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111115, i111111111111111111111111111115, iY2, iC);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i111111111111111111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111116, i111111111111111111111111111116, iY2, iC);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i111111111111111111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111117, i111111111111111111111111111117, iY2, iC);
                            break;
                        case 16:
                            int iIntValue16 = ((Integer) value).intValue();
                            iA2 = i.z((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                            int i111111111111111111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111118, i111111111111111111111111111118, iY2, iC);
                            break;
                        case 17:
                            long jLongValue16 = ((Long) value).longValue();
                            iA2 = i.A((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                            int i111111111111111111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111119, i111111111111111111111111111119, iY2, iC);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 16:
                    int iIntValue17 = ((Integer) key).intValue();
                    iA = i.z((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                    i10 = iA + iY3;
                    v1Var = f0Var.f1857b;
                    iY = i.y(2);
                    if (v1Var == s1Var) {
                        iY *= 2;
                    }
                    switch (v1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iA2 = 8;
                            int i1111111111111111111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111111110, i1111111111111111111111111111110, iY2, iC);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA2 = 4;
                            int i1111111111111111111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111111111, i1111111111111111111111111111111, iY2, iC);
                            break;
                        case 2:
                            iA2 = i.A(((Long) value).longValue());
                            int i1111111111111111111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111111112, i1111111111111111111111111111112, iY2, iC);
                            break;
                        case 3:
                            iA2 = i.A(((Long) value).longValue());
                            int i1111111111111111111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111111113, i1111111111111111111111111111113, iY2, iC);
                            break;
                        case 4:
                            iA2 = i.w(((Integer) value).intValue());
                            int i1111111111111111111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111111114, i1111111111111111111111111111114, iY2, iC);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i1111111111111111111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111111115, i1111111111111111111111111111115, iY2, iC);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i1111111111111111111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111111116, i1111111111111111111111111111116, iY2, iC);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i1111111111111111111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111111117, i1111111111111111111111111111117, iY2, iC);
                            break;
                        case 8:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                            } else {
                                iA2 = i.x((String) value);
                            }
                            int i1111111111111111111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111111118, i1111111111111111111111111111118, iY2, iC);
                            break;
                        case 9:
                            iA2 = ((a) value).a();
                            int i1111111111111111111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111111119, i1111111111111111111111111111119, iY2, iC);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iZ2 = i.z(size2);
                            iA2 = iZ2 + size2;
                            int i11111111111111111111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111111110, i11111111111111111111111111111110, iY2, iC);
                            break;
                        case 11:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iZ2 = i.z(size2);
                            }
                            iA2 = iZ2 + size2;
                            int i11111111111111111111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111111111, i11111111111111111111111111111111, iY2, iC);
                            break;
                        case 12:
                            iA2 = i.z(((Integer) value).intValue());
                            int i11111111111111111111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111111112, i11111111111111111111111111111112, iY2, iC);
                            break;
                        case 13:
                            iA2 = i.w(((Integer) value).intValue());
                            int i11111111111111111111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111111113, i11111111111111111111111111111113, iY2, iC);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i11111111111111111111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111111114, i11111111111111111111111111111114, iY2, iC);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i11111111111111111111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111111115, i11111111111111111111111111111115, iY2, iC);
                            break;
                        case 16:
                            int iIntValue18 = ((Integer) value).intValue();
                            iA2 = i.z((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                            int i11111111111111111111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111111116, i11111111111111111111111111111116, iY2, iC);
                            break;
                        case 17:
                            long jLongValue17 = ((Long) value).longValue();
                            iA2 = i.A((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                            int i11111111111111111111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111111117, i11111111111111111111111111111117, iY2, iC);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 17:
                    long jLongValue18 = ((Long) key).longValue();
                    iA = i.A((jLongValue18 << 1) ^ (jLongValue18 >> 63));
                    i10 = iA + iY3;
                    v1Var = f0Var.f1857b;
                    iY = i.y(2);
                    if (v1Var == s1Var) {
                        iY *= 2;
                    }
                    switch (v1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iA2 = 8;
                            int i11111111111111111111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111111118, i11111111111111111111111111111118, iY2, iC);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iA2 = 4;
                            int i11111111111111111111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i11111111111111111111111111111119, i11111111111111111111111111111119, iY2, iC);
                            break;
                        case 2:
                            iA2 = i.A(((Long) value).longValue());
                            int i111111111111111111111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111111110, i111111111111111111111111111111110, iY2, iC);
                            break;
                        case 3:
                            iA2 = i.A(((Long) value).longValue());
                            int i111111111111111111111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111111111, i111111111111111111111111111111111, iY2, iC);
                            break;
                        case 4:
                            iA2 = i.w(((Integer) value).intValue());
                            int i111111111111111111111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111111112, i111111111111111111111111111111112, iY2, iC);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i111111111111111111111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111111113, i111111111111111111111111111111113, iY2, iC);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i111111111111111111111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111111114, i111111111111111111111111111111114, iY2, iC);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111111111111111111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111111115, i111111111111111111111111111111115, iY2, iC);
                            break;
                        case 8:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                            } else {
                                iA2 = i.x((String) value);
                            }
                            int i111111111111111111111111111111116 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111111116, i111111111111111111111111111111116, iY2, iC);
                            break;
                        case 9:
                            iA2 = ((a) value).a();
                            int i111111111111111111111111111111117 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111111117, i111111111111111111111111111111117, iY2, iC);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iZ2 = i.z(size2);
                            iA2 = iZ2 + size2;
                            int i111111111111111111111111111111118 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111111118, i111111111111111111111111111111118, iY2, iC);
                            break;
                        case 11:
                            if (value instanceof e) {
                                size2 = ((e) value).size();
                                iZ2 = i.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iZ2 = i.z(size2);
                            }
                            iA2 = iZ2 + size2;
                            int i111111111111111111111111111111119 = iA2 + iY + i10;
                            iC = a3.e.c(i111111111111111111111111111111119, i111111111111111111111111111111119, iY2, iC);
                            break;
                        case 12:
                            iA2 = i.z(((Integer) value).intValue());
                            int i1111111111111111111111111111111110 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111111111110, i1111111111111111111111111111111110, iY2, iC);
                            break;
                        case 13:
                            iA2 = i.w(((Integer) value).intValue());
                            int i1111111111111111111111111111111111 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111111111111, i1111111111111111111111111111111111, iY2, iC);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iA2 = 4;
                            int i1111111111111111111111111111111112 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111111111112, i1111111111111111111111111111111112, iY2, iC);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iA2 = 8;
                            int i1111111111111111111111111111111113 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111111111113, i1111111111111111111111111111111113, iY2, iC);
                            break;
                        case 16:
                            int iIntValue19 = ((Integer) value).intValue();
                            iA2 = i.z((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                            int i1111111111111111111111111111111114 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111111111114, i1111111111111111111111111111111114, iY2, iC);
                            break;
                        case 17:
                            long jLongValue19 = ((Long) value).longValue();
                            iA2 = i.A((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                            int i1111111111111111111111111111111115 = iA2 + iY + i10;
                            iC = a3.e.c(i1111111111111111111111111111111115, i1111111111111111111111111111111115, iY2, iC);
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                default:
                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
        return iC;
    }

    public static h0 b(Object obj, Object obj2) {
        h0 h0VarB = (h0) obj;
        h0 h0Var = (h0) obj2;
        if (!h0Var.isEmpty()) {
            if (!h0VarB.f1867d) {
                h0VarB = h0VarB.b();
            }
            h0VarB.a();
            if (!h0Var.isEmpty()) {
                h0VarB.putAll(h0Var);
            }
        }
        return h0VarB;
    }
}
