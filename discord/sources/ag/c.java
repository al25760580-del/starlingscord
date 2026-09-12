package ag;

import com.facebook.react.devsupport.StackTraceHelper;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile b f507e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f506d = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h1 f508i = new h1(StackTraceHelper.ID_KEY);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h1 f509v = new h1("type");

    public static int a(int i7, int i10) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i10 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i11 = i7 / i10;
        int i12 = i7 - (i10 * i11);
        if (i12 == 0) {
            return i11;
        }
        int i13 = ((i7 ^ i10) >> 31) | 1;
        switch (s0.f576a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i11;
            case 3:
                if (i13 >= 0) {
                    return i11;
                }
                break;
            case 4:
                break;
            case 5:
                if (i13 <= 0) {
                    return i11;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i12);
                int iAbs2 = iAbs - (Math.abs(i10) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i11;
                }
                if (iAbs2 <= 0) {
                    return i11;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i11 + i13;
    }

    public static int b(s sVar) {
        Iterator it = sVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static String c(y0 y0Var) {
        StringBuilder sb2 = new StringBuilder(y0Var.e());
        for (int i7 = 0; i7 < y0Var.e(); i7++) {
            byte bA = y0Var.a(i7);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                        } else {
                            sb2.append((char) bA);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static String d(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strF;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                strF = "null";
            } else {
                try {
                    strF = obj.toString();
                } catch (Exception e10) {
                    String strK = kk.b.k(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strK), (Throwable) e10);
                    strF = s0.g.f("<", strK, " threw ", e10.getClass().getName(), ">");
                }
            }
            objArr[i10] = strF;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i7 >= length2 || (iIndexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, iIndexOf);
            sb2.append(objArr[i7]);
            i7++;
            i11 = iIndexOf + 2;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i7 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i7]);
            for (int i12 = i7 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void e(int i7, int i10) {
        String strD;
        if (i7 < 0 || i7 >= i10) {
            if (i7 < 0) {
                strD = d("%s (%s) must not be negative", "index", Integer.valueOf(i7));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(kk.b.h(i10, "negative size: "));
                }
                strD = d("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strD);
        }
    }

    public static void f(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(s0.g.e("null value in entry: ", obj.toString(), "=null"));
        }
    }

    public static final void g(StringBuilder sb2, Iterator it, vi.d dVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(vi.d.s(entry.getKey()));
            sb2.append(" : ");
            sb2.append(vi.d.s(entry.getValue()));
            while (it.hasNext()) {
                sb2.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(vi.d.s(entry2.getKey()));
                sb2.append(" : ");
                sb2.append(vi.d.s(entry2.getValue()));
            }
        }
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean i(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = a0.f499e;
            }
        } else {
            if (!(collection instanceof h0)) {
                return false;
            }
            objComparator = ((x) ((h0) collection)).f594v;
        }
        return comparator.equals(objComparator);
    }

    public static byte[] j(byte[]... bArr) {
        long length = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= bArr.length) {
                break;
            }
            length += (long) bArr[i7].length;
            i7++;
        }
        int i10 = (int) length;
        if (length != i10) {
            throw new IllegalArgumentException(d("the total number of elements (%s) in the arrays must fit in an int", Long.valueOf(length)));
        }
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i11, length2);
            i11 += length2;
        }
        return bArr2;
    }

    public static final j1 k(l1 l1Var) throws e1 {
        try {
            k1 k1VarI = l1Var.i();
            if (k1VarI == null) {
                throw new e1("Parser being asked to parse an empty input stream");
            }
            try {
                try {
                    byte b10 = k1VarI.f533a;
                    byte b11 = k1VarI.f534b;
                    int i7 = 0;
                    if (b10 == -128) {
                        long jC = l1Var.c();
                        if (jC > 1000) {
                            throw new e1("Parser being asked to read a large CBOR array");
                        }
                        l(b11, jC);
                        j1[] j1VarArr = new j1[(int) jC];
                        while (i7 < jC) {
                            j1VarArr[i7] = k(l1Var);
                            i7++;
                        }
                        return new b1(q.m(j1VarArr));
                    }
                    if (b10 != -96) {
                        if (b10 == -64) {
                            throw new e1("Tags are currently unsupported");
                        }
                        if (b10 == -32) {
                            return new c1(l1Var.l());
                        }
                        if (b10 == 0 || b10 == 32) {
                            long jF = l1Var.f();
                            l(b11, jF > 0 ? jF : ~jF);
                            return new f1(jF);
                        }
                        if (b10 == 64) {
                            l1Var.u((byte) 64);
                            byte[] bArrZ = l1Var.z();
                            int length = bArrZ.length;
                            l(b11, length);
                            return new d1(y0.k(bArrZ, length));
                        }
                        if (b10 == 96) {
                            l1Var.u((byte) 96);
                            String str = new String(l1Var.z(), StandardCharsets.UTF_8);
                            l(b11, str.length());
                            return new h1(str);
                        }
                        throw new e1("Unidentifiable major type: " + ((b10 >> 5) & 7));
                    }
                    long jG = l1Var.g();
                    if (jG > 1000) {
                        throw new e1("Parser being asked to read a large CBOR map");
                    }
                    l(b11, jG);
                    int i10 = (int) jG;
                    io.sentry.internal.debugmeta.c[] cVarArr = new io.sentry.internal.debugmeta.c[i10];
                    j1 j1Var = null;
                    int i11 = 0;
                    while (i11 < jG) {
                        j1 j1VarK = k(l1Var);
                        if (j1Var != null && j1VarK.compareTo(j1Var) <= 0) {
                            throw new a1("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + j1Var.toString() + "\nCurrent key: " + j1VarK.toString());
                        }
                        cVarArr[i11] = new io.sentry.internal.debugmeta.c(j1VarK, k(l1Var), 2, false);
                        i11++;
                        j1Var = j1VarK;
                    }
                    TreeMap treeMap = new TreeMap();
                    while (i7 < i10) {
                        io.sentry.internal.debugmeta.c cVar = cVarArr[i7];
                        if (treeMap.containsKey((j1) cVar.f12759e)) {
                            throw new a1("Attempted to add duplicate key to canonical CBOR Map.");
                        }
                        treeMap.put((j1) cVar.f12759e, (j1) cVar.f12760i);
                        i7++;
                    }
                    return new g1(w.b(treeMap));
                } catch (IOException | RuntimeException e10) {
                    e = e10;
                    throw new e1(e);
                }
            } catch (RuntimeException e11) {
                e = e11;
                throw new e1(e);
            }
        } catch (IOException e12) {
            throw new e1(e12);
        }
    }

    public static final void l(byte b10, long j) throws a1 {
        switch (b10) {
            case 24:
                if (j < 24) {
                    throw new a1(a3.e.h(j, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case 25:
                if (j < 256) {
                    throw new a1(a3.e.h(j, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new a1(a3.e.h(j, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new a1(a3.e.h(j, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }

    public static void m(int i7, int i10, int i11) {
        String strN;
        if (i7 < 0 || i10 < i7 || i10 > i11) {
            if (i7 < 0 || i7 > i11) {
                strN = n(i7, i11, "start index");
            } else {
                strN = (i10 < 0 || i10 > i11) ? n(i10, i11, "end index") : d("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7));
            }
            throw new IndexOutOfBoundsException(strN);
        }
    }

    public static String n(int i7, int i10, String str) {
        if (i7 < 0) {
            return d("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return d("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(kk.b.h(i10, "negative size: "));
    }
}
