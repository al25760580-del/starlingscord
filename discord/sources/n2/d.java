package n2;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f16252d;

    public d(byte[] bArr, int i7, int i10) {
        this(-1L, bArr, i7, i10);
    }

    public static d a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new d(new byte[]{(byte) (str.charAt(0) - '0')}, 1, 1);
        }
        byte[] bytes = str.getBytes(h.f16261d0);
        return new d(bytes, 1, bytes.length);
    }

    public static d b(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(h.f16261d0);
        return new d(bytes, 2, bytes.length);
    }

    public static d c(long j, ByteOrder byteOrder) {
        return d(new long[]{j}, byteOrder);
    }

    public static d d(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[h.U[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j : jArr) {
            byteBufferWrap.putInt((int) j);
        }
        return new d(byteBufferWrap.array(), 4, jArr.length);
    }

    public static d e(f[] fVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[h.U[5] * fVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (f fVar : fVarArr) {
            byteBufferWrap.putInt((int) fVar.f16257a);
            byteBufferWrap.putInt((int) fVar.f16258b);
        }
        return new d(byteBufferWrap.array(), 5, fVarArr.length);
    }

    public static d f(int i7, ByteOrder byteOrder) {
        return g(new int[]{i7}, byteOrder);
    }

    public static d g(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[h.U[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i7 : iArr) {
            byteBufferWrap.putShort((short) i7);
        }
        return new d(byteBufferWrap.array(), 3, iArr.length);
    }

    public final double h(ByteOrder byteOrder) throws Throwable {
        Object objK = k(byteOrder);
        if (objK == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objK instanceof String) {
            return Double.parseDouble((String) objK);
        }
        if (objK instanceof long[]) {
            long[] jArr = (long[]) objK;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objK instanceof int[]) {
            int[] iArr = (int[]) objK;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objK instanceof double[]) {
            double[] dArr = (double[]) objK;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objK instanceof f[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        f[] fVarArr = (f[]) objK;
        if (fVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        f fVar = fVarArr[0];
        return fVar.f16257a / fVar.f16258b;
    }

    public final int i(ByteOrder byteOrder) throws Throwable {
        Object objK = k(byteOrder);
        if (objK == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objK instanceof String) {
            return Integer.parseInt((String) objK);
        }
        if (objK instanceof long[]) {
            long[] jArr = (long[]) objK;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objK instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objK;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String j(ByteOrder byteOrder) throws Throwable {
        Object objK = k(byteOrder);
        if (objK == null) {
            return null;
        }
        if (objK instanceof String) {
            return (String) objK;
        }
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        if (objK instanceof long[]) {
            long[] jArr = (long[]) objK;
            while (i7 < jArr.length) {
                sb2.append(jArr[i7]);
                i7++;
                if (i7 != jArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (objK instanceof int[]) {
            int[] iArr = (int[]) objK;
            while (i7 < iArr.length) {
                sb2.append(iArr[i7]);
                i7++;
                if (i7 != iArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (objK instanceof double[]) {
            double[] dArr = (double[]) objK;
            while (i7 < dArr.length) {
                sb2.append(dArr[i7]);
                i7++;
                if (i7 != dArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (!(objK instanceof f[])) {
            return null;
        }
        f[] fVarArr = (f[]) objK;
        while (i7 < fVarArr.length) {
            sb2.append(fVarArr[i7].f16257a);
            sb2.append('/');
            sb2.append(fVarArr[i7].f16258b);
            i7++;
            if (i7 != fVarArr.length) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [n2.f[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [n2.f[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    public final Serializable k(ByteOrder byteOrder) throws Throwable {
        b bVar;
        InputStream inputStream;
        ?? str;
        byte b10;
        byte[] bArr = this.f16252d;
        InputStream inputStream2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    bVar.f16244i = byteOrder;
                    int i7 = this.f16249a;
                    int length = 0;
                    int i10 = this.f16250b;
                    switch (i7) {
                        case 1:
                        case 6:
                            if (bArr.length == 1 && (b10 = bArr[0]) >= 0 && b10 <= 1) {
                                String str2 = new String(new char[]{(char) (b10 + 48)});
                                try {
                                    bVar.close();
                                    return str2;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    return str2;
                                }
                            }
                            str = new String(bArr, h.f16261d0);
                            break;
                            break;
                        case 2:
                        case 7:
                            if (i10 >= h.V.length) {
                                int i11 = 0;
                                while (true) {
                                    byte[] bArr2 = h.V;
                                    if (i11 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i11] == bArr2[i11]) {
                                        i11++;
                                    }
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            while (length < i10) {
                                byte b11 = bArr[length];
                                if (b11 == 0) {
                                    str = sb2.toString();
                                } else {
                                    if (b11 >= 32) {
                                        sb2.append((char) b11);
                                    } else {
                                        sb2.append('?');
                                    }
                                    length++;
                                }
                                break;
                            }
                            str = sb2.toString();
                            break;
                        case 3:
                            str = new int[i10];
                            while (length < i10) {
                                str[length] = bVar.readUnsignedShort();
                                length++;
                            }
                            break;
                        case 4:
                            str = new long[i10];
                            while (length < i10) {
                                str[length] = ((long) bVar.readInt()) & 4294967295L;
                                length++;
                            }
                            break;
                        case 5:
                            str = new f[i10];
                            while (length < i10) {
                                str[length] = new f(((long) bVar.readInt()) & 4294967295L, ((long) bVar.readInt()) & 4294967295L);
                                length++;
                            }
                            break;
                        case 8:
                            str = new int[i10];
                            while (length < i10) {
                                str[length] = bVar.readShort();
                                length++;
                            }
                            break;
                        case 9:
                            str = new int[i10];
                            while (length < i10) {
                                str[length] = bVar.readInt();
                                length++;
                            }
                            break;
                        case 10:
                            str = new f[i10];
                            while (length < i10) {
                                str[length] = new f(bVar.readInt(), bVar.readInt());
                                length++;
                            }
                            break;
                        case 11:
                            str = new double[i10];
                            while (length < i10) {
                                str[length] = bVar.readFloat();
                                length++;
                            }
                            break;
                        case 12:
                            str = new double[i10];
                            while (length < i10) {
                                str[length] = bVar.readDouble();
                                length++;
                            }
                            break;
                        default:
                            try {
                                bVar.close();
                                return null;
                            } catch (IOException e11) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                return null;
                            }
                    }
                    try {
                        bVar.close();
                        return str;
                    } catch (IOException e12) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                        return str;
                    }
                } catch (IOException e13) {
                    e = e13;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e14) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e15) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                    }
                }
                throw th;
            }
        } catch (IOException e16) {
            e = e16;
            bVar = null;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(h.T[this.f16249a]);
        sb2.append(", data length:");
        return kk.b.l(sb2, this.f16252d.length, ")");
    }

    public d(long j, byte[] bArr, int i7, int i10) {
        this.f16249a = i7;
        this.f16250b = i10;
        this.f16251c = j;
        this.f16252d = bArr;
    }
}
