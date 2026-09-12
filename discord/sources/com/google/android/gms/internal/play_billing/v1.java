package com.google.android.gms.internal.play_billing;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 implements pa.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6155e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f6156i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f6157v;

    public v1(byte[] bArr, int i7) {
        int length = bArr.length;
        if (((length - i7) | i7) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(a3.e.g(length, i7, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f6157v = bArr;
        this.f6155e = 0;
        this.f6154d = i7;
    }

    public static int S(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int T(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int c(int i7, int i10) {
        return e(i10) + j(i7);
    }

    public static int d(int i7, int i10) {
        return e(i10) + j(i7);
    }

    public static int e(int i7) {
        if (i7 >= 0) {
            return h(i7);
        }
        return 10;
    }

    public static int f(int i7, vp.a aVar) {
        return g(aVar) + j(i7);
    }

    public static int g(vp.a aVar) {
        int iC = aVar.c();
        return h(iC) + iC;
    }

    public static int h(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int i(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int j(int i7) {
        return h(i7 << 3);
    }

    public static v1 m(OutputStream outputStream, int i7) {
        byte[] bArr = new byte[i7];
        v1 v1Var = new v1();
        v1Var.f6156i = outputStream;
        v1Var.f6157v = bArr;
        v1Var.f6155e = 0;
        v1Var.f6154d = bArr.length;
        return v1Var;
    }

    public void A(int i7) throws IOException {
        while ((i7 & (-128)) != 0) {
            v((i7 & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            i7 >>>= 7;
        }
        v(i7);
    }

    public void B(long j) throws IOException {
        while (((-128) & j) != 0) {
            v((((int) j) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            j >>>= 7;
        }
        v((int) j);
    }

    public void C(int i7, int i10) throws IOException {
        A((i7 << 3) | i10);
    }

    public void D() {
        int i7 = this.f6154d;
        int i10 = this.f6155e;
        if (i7 - i10 > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (i7 - i10 < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public void E(byte b10) throws ag.a1 {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i7 = this.f6155e;
        try {
            int i10 = i7 + 1;
            try {
                ((byte[]) this.f6157v)[i7] = b10;
                this.f6155e = i10;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                i7 = i10;
                throw new ag.a1(i7, this.f6154d, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e11) {
            indexOutOfBoundsException = e11;
        }
    }

    public void F(byte[] bArr, int i7, int i10) throws ag.a1 {
        try {
            System.arraycopy(bArr, i7, (byte[]) this.f6157v, this.f6155e, i10);
            this.f6155e += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new ag.a1(this.f6155e, this.f6154d, i10, e10);
        }
    }

    public void G(int i7, int i10) throws ag.a1 {
        P((i7 << 3) | 5);
        H(i10);
    }

    public void H(int i7) throws ag.a1 {
        int i10 = this.f6155e;
        try {
            byte[] bArr = (byte[]) this.f6157v;
            bArr[i10] = (byte) i7;
            bArr[i10 + 1] = (byte) (i7 >> 8);
            bArr[i10 + 2] = (byte) (i7 >> 16);
            bArr[i10 + 3] = (byte) (i7 >> 24);
            this.f6155e = i10 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new ag.a1(i10, this.f6154d, 4, e10);
        }
    }

    public void I(int i7, long j) throws ag.a1 {
        P((i7 << 3) | 1);
        J(j);
    }

    public void J(long j) throws ag.a1 {
        int i7 = this.f6155e;
        try {
            byte[] bArr = (byte[]) this.f6157v;
            bArr[i7] = (byte) j;
            bArr[i7 + 1] = (byte) (j >> 8);
            bArr[i7 + 2] = (byte) (j >> 16);
            bArr[i7 + 3] = (byte) (j >> 24);
            bArr[i7 + 4] = (byte) (j >> 32);
            bArr[i7 + 5] = (byte) (j >> 40);
            bArr[i7 + 6] = (byte) (j >> 48);
            bArr[i7 + 7] = (byte) (j >> 56);
            this.f6155e = i7 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new ag.a1(i7, this.f6154d, 8, e10);
        }
    }

    public void K(int i7, int i10) throws ag.a1 {
        P(i7 << 3);
        L(i10);
    }

    public void L(int i7) throws ag.a1 {
        IndexOutOfBoundsException indexOutOfBoundsException;
        if (i7 >= 0) {
            P(i7);
            return;
        }
        int i10 = this.f6155e;
        try {
            byte[] bArr = (byte[]) this.f6157v;
            long j = i7;
            int i11 = i10 + 1;
            try {
                bArr[i10] = (byte) (((int) j) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                int i12 = i10 + 2;
                try {
                    bArr[i11] = (byte) (((int) (j >>> 7)) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    int i13 = i10 + 3;
                    bArr[i12] = (byte) (((int) (j >>> 14)) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    i12 = i10 + 4;
                    bArr[i13] = (byte) (((int) (j >>> 21)) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    int i14 = i10 + 5;
                    bArr[i12] = (byte) (((int) (j >>> 28)) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    int i15 = i10 + 6;
                    try {
                        bArr[i14] = -1;
                        int i16 = i10 + 7;
                        bArr[i15] = -1;
                        i15 = i10 + 8;
                        bArr[i16] = -1;
                        i11 = i10 + 9;
                        bArr[i15] = -1;
                        i10 += 10;
                        bArr[i11] = 1;
                        this.f6155e = i10;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i10 = i15;
                        throw new ag.a1(i10, this.f6154d, 10, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                    i10 = i12;
                }
            } catch (IndexOutOfBoundsException e12) {
                i10 = i11;
                indexOutOfBoundsException = e12;
            }
        } catch (IndexOutOfBoundsException e13) {
            indexOutOfBoundsException = e13;
        }
    }

    public void M(String str) throws ag.a1 {
        byte[] bArr = (byte[]) this.f6157v;
        int i7 = this.f6155e;
        try {
            int iS = S(str.length() * 3);
            int iS2 = S(str.length());
            if (iS2 != iS) {
                int i10 = n3.f6076a;
                P(z1.m(str));
                int i11 = this.f6155e;
                this.f6155e = n3.a(str, bArr, i11, bArr.length - i11);
                return;
            }
            int i12 = i7 + iS2;
            this.f6155e = i12;
            int iA = n3.a(str, bArr, i12, bArr.length - i12);
            this.f6155e = i7;
            P((iA - i7) - iS2);
            this.f6155e = iA;
        } catch (IndexOutOfBoundsException e10) {
            throw new ag.a1("CodedOutputStream was writing to a flat byte array and ran out of space.", e10);
        }
    }

    public void N(int i7, int i10) throws ag.a1 {
        P((i7 << 3) | i10);
    }

    public void O(int i7, int i10) throws ag.a1 {
        P(i7 << 3);
        P(i10);
    }

    public void P(int i7) throws ag.a1 {
        IndexOutOfBoundsException indexOutOfBoundsException;
        byte[] bArr = (byte[]) this.f6157v;
        int i10 = this.f6155e;
        int i11 = i7 & (-128);
        try {
            if (i11 == 0) {
                int i12 = i10 + 1;
                bArr[i10] = (byte) i7;
                this.f6155e = i12;
                return;
            }
            int i13 = i10 + 1;
            bArr[i10] = (byte) (i7 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            int i14 = i7 >>> 7;
            try {
                if ((i14 & (-128)) == 0) {
                    int i15 = i10 + 2;
                    bArr[i13] = (byte) i14;
                    this.f6155e = i15;
                    return;
                }
                int i16 = i10 + 2;
                try {
                    bArr[i13] = (byte) (i14 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    int i17 = i7 >>> 14;
                    if ((i17 & (-128)) == 0) {
                        int i18 = i10 + 3;
                        bArr[i16] = (byte) i17;
                        this.f6155e = i18;
                        return;
                    }
                    int i19 = i10 + 3;
                    try {
                        bArr[i16] = (byte) (i17 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        int i20 = i7 >>> 21;
                        if ((i20 & (-128)) == 0) {
                            int i21 = i10 + 4;
                            bArr[i19] = (byte) i20;
                            this.f6155e = i21;
                            return;
                        } else {
                            i16 = i10 + 4;
                            bArr[i19] = (byte) (i20 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                            int i22 = i10 + 5;
                            bArr[i16] = (byte) (i7 >>> 28);
                            this.f6155e = i22;
                            return;
                        }
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i11 = i19;
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                    i11 = i16;
                }
                throw new ag.a1(i11, this.f6154d, 1, indexOutOfBoundsException);
            } catch (IndexOutOfBoundsException e12) {
                i11 = i7;
                indexOutOfBoundsException = e12;
            }
        } catch (IndexOutOfBoundsException e13) {
            indexOutOfBoundsException = e13;
        }
    }

    public void Q(int i7, long j) throws ag.a1 {
        P(i7 << 3);
        R(j);
    }

    public void R(long j) throws ag.a1 {
        byte[] bArr = (byte[]) this.f6157v;
        long j5 = j & (-128);
        int i7 = this.f6155e;
        try {
            if (j5 == 0) {
                bArr[i7] = (byte) j;
                this.f6155e = i7 + 1;
                return;
            }
            bArr[i7] = (byte) (((int) j) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            int i10 = i7 + 1;
            long j7 = j >>> 7;
            long j10 = j7 & (-128);
            int i11 = (int) j7;
            if (j10 == 0) {
                bArr[i10] = (byte) i11;
                this.f6155e = i7 + 2;
                return;
            }
            bArr[i10] = (byte) (i11 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            int i12 = i7 + 2;
            long j11 = j >>> 14;
            long j12 = j11 & (-128);
            int i13 = (int) j11;
            if (j12 == 0) {
                bArr[i12] = (byte) i13;
                this.f6155e = i7 + 3;
                return;
            }
            bArr[i12] = (byte) (i13 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            int i14 = i7 + 3;
            long j13 = j >>> 21;
            long j14 = j13 & (-128);
            int i15 = (int) j13;
            if (j14 == 0) {
                bArr[i14] = (byte) i15;
                this.f6155e = i7 + 4;
                return;
            }
            bArr[i14] = (byte) (i15 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            int i16 = i7 + 4;
            long j15 = j >>> 28;
            long j16 = j15 & (-128);
            int i17 = (int) j15;
            if (j16 == 0) {
                bArr[i16] = (byte) i17;
                this.f6155e = i7 + 5;
                return;
            }
            bArr[i16] = (byte) (i17 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            int i18 = i7 + 5;
            long j17 = j >>> 35;
            long j18 = j17 & (-128);
            int i19 = (int) j17;
            if (j18 == 0) {
                bArr[i18] = (byte) i19;
                this.f6155e = i7 + 6;
                return;
            }
            bArr[i18] = (byte) (i19 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            int i20 = i7 + 6;
            long j19 = j >>> 42;
            long j20 = j19 & (-128);
            int i21 = (int) j19;
            if (j20 == 0) {
                bArr[i20] = (byte) i21;
                this.f6155e = i7 + 7;
                return;
            }
            bArr[i20] = (byte) (i21 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            int i22 = i7 + 7;
            long j21 = j >>> 49;
            long j22 = j21 & (-128);
            int i23 = (int) j21;
            if (j22 == 0) {
                bArr[i22] = (byte) i23;
                this.f6155e = i7 + 8;
                return;
            }
            bArr[i22] = (byte) (i23 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            int i24 = i7 + 8;
            long j23 = j >>> 56;
            int i25 = (int) j23;
            if (((-128) & j23) == 0) {
                bArr[i24] = (byte) i25;
                this.f6155e = i7 + 9;
            } else {
                bArr[i24] = (byte) (i25 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                bArr[i7 + 9] = (byte) (j >>> 63);
                this.f6155e = i7 + 10;
            }
        } catch (IndexOutOfBoundsException e10) {
            throw new ag.a1(i7, this.f6154d, 1, e10);
        }
    }

    public synchronized void a(long j, Object obj) {
        int i7 = this.f6155e;
        if (i7 > 0) {
            if (j <= ((long[]) this.f6156i)[((this.f6154d + i7) - 1) % ((Object[]) this.f6157v).length]) {
                b();
            }
        }
        k();
        int i10 = this.f6154d;
        int i11 = this.f6155e;
        Object[] objArr = (Object[]) this.f6157v;
        int length = (i10 + i11) % objArr.length;
        ((long[]) this.f6156i)[length] = j;
        objArr[length] = obj;
        this.f6155e = i11 + 1;
    }

    public synchronized void b() {
        this.f6154d = 0;
        this.f6155e = 0;
        Arrays.fill((Object[]) this.f6157v, (Object) null);
    }

    @Override // q8.d
    public Object get(int i7) {
        Bitmap bitmap;
        synchronized (this) {
            if (this.f6155e > 0) {
                synchronized (this) {
                    while (this.f6155e > 0 && (bitmap = (Bitmap) ((e4.c) this.f6156i).Q()) != null) {
                        ((e4.c) this.f6156i).getClass();
                        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                        this.f6155e -= BitmapUtil.getSizeInBytes(bitmap);
                        ((pa.w) this.f6157v).getClass();
                    }
                }
            }
            Bitmap bitmap2 = ((e4.c) this.f6156i).D(i7);
            if (bitmap2 == null) {
                ((pa.w) this.f6157v).getClass();
                return Bitmap.createBitmap(1, i7, Bitmap.Config.ALPHA_8);
            }
            ((e4.c) this.f6156i).getClass();
            Intrinsics.checkNotNullParameter(bitmap2, "bitmap");
            this.f6155e -= BitmapUtil.getSizeInBytes(bitmap2);
            ((pa.w) this.f6157v).getClass();
            return bitmap2;
        }
    }

    public void k() {
        int length = ((Object[]) this.f6157v).length;
        if (this.f6155e < length) {
            return;
        }
        int i7 = length * 2;
        long[] jArr = new long[i7];
        Object[] objArr = new Object[i7];
        int i10 = this.f6154d;
        int i11 = length - i10;
        System.arraycopy((long[]) this.f6156i, i10, jArr, 0, i11);
        System.arraycopy((Object[]) this.f6157v, this.f6154d, objArr, 0, i11);
        int i12 = this.f6154d;
        if (i12 > 0) {
            System.arraycopy((long[]) this.f6156i, 0, jArr, i11, i12);
            System.arraycopy((Object[]) this.f6157v, 0, objArr, i11, this.f6154d);
        }
        this.f6156i = jArr;
        this.f6157v = objArr;
        this.f6154d = 0;
    }

    public void l() throws IOException {
        if (((OutputStream) this.f6156i) != null) {
            p();
        }
    }

    public Object n(long j, boolean z5) {
        Object objO = null;
        long j5 = LongCompanionObject.MAX_VALUE;
        while (this.f6155e > 0) {
            long j7 = j - ((long[]) this.f6156i)[this.f6154d];
            if (j7 < 0 && (z5 || (-j7) >= j5)) {
                break;
            }
            objO = o();
            j5 = j7;
        }
        return objO;
    }

    public Object o() {
        je.b.k(this.f6155e > 0);
        Object[] objArr = (Object[]) this.f6157v;
        int i7 = this.f6154d;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f6154d = (i7 + 1) % objArr.length;
        this.f6155e--;
        return obj;
    }

    public void p() throws IOException {
        OutputStream outputStream = (OutputStream) this.f6156i;
        if (outputStream == null) {
            throw new ag.a1("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write((byte[]) this.f6157v, 0, this.f6155e);
        this.f6155e = 0;
    }

    public void q(int i7, int i10) throws IOException {
        C(i7, 0);
        s(i10);
    }

    public void r(int i7, int i10) throws IOException {
        C(i7, 0);
        s(i10);
    }

    @Override // r8.c
    public void release(Object obj) {
        boolean zAdd;
        Bitmap bitmap = (Bitmap) obj;
        ((e4.c) this.f6156i).getClass();
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
        if (sizeInBytes <= this.f6154d) {
            ((pa.w) this.f6157v).getClass();
            e4.c cVar = (e4.c) this.f6156i;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            if (e4.c.L(bitmap)) {
                synchronized (cVar) {
                    zAdd = ((HashSet) cVar.f7966e).add(bitmap);
                }
                if (zAdd) {
                    n8.f fVar = (n8.f) cVar.f7967i;
                    Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                    int sizeInBytes2 = BitmapUtil.getSizeInBytes(bitmap);
                    synchronized (fVar) {
                        try {
                            pa.g gVar = (pa.g) ((SparseArray) fVar.f16510e).get(sizeInBytes2);
                            if (gVar == null) {
                                LinkedList linkedList = new LinkedList();
                                gVar = new pa.g();
                                gVar.f17815a = null;
                                gVar.f17816b = sizeInBytes2;
                                gVar.f17817c = linkedList;
                                gVar.f17818d = null;
                                ((SparseArray) fVar.f16510e).put(sizeInBytes2, gVar);
                            }
                            gVar.f17817c.addLast(bitmap);
                            if (((pa.g) fVar.f16512v) != gVar) {
                                fVar.d0(gVar);
                                pa.g gVar2 = (pa.g) fVar.f16512v;
                                if (gVar2 == null) {
                                    fVar.f16512v = gVar;
                                    fVar.f16511i = gVar;
                                } else {
                                    gVar.f17818d = gVar2;
                                    gVar2.f17815a = gVar;
                                    fVar.f16512v = gVar;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            synchronized (this) {
                this.f6155e += sizeInBytes;
            }
        }
    }

    public void s(int i7) throws IOException {
        if (i7 >= 0) {
            A(i7);
        } else {
            B(i7);
        }
    }

    public void t(int i7, vp.a aVar) throws IOException {
        C(i7, 2);
        u(aVar);
    }

    public void u(vp.a aVar) throws IOException {
        A(aVar.c());
        aVar.f(this);
    }

    public void v(int i7) throws IOException {
        byte b10 = (byte) i7;
        if (this.f6155e == this.f6154d) {
            p();
        }
        byte[] bArr = (byte[]) this.f6157v;
        int i10 = this.f6155e;
        this.f6155e = i10 + 1;
        bArr[i10] = b10;
    }

    public void w(vp.d dVar) throws IOException {
        int size = dVar.size();
        byte[] bArr = (byte[]) this.f6157v;
        int i7 = this.f6154d;
        int i10 = this.f6155e;
        int i11 = i7 - i10;
        if (i11 >= size) {
            dVar.d(0, i10, size, bArr);
            this.f6155e += size;
            return;
        }
        dVar.d(0, i10, i11, bArr);
        int i12 = size - i11;
        this.f6155e = i7;
        p();
        if (i12 <= i7) {
            dVar.d(i11, 0, i12, bArr);
            this.f6155e = i12;
            return;
        }
        OutputStream outputStream = (OutputStream) this.f6156i;
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i12 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i13 = i11 + i12;
        if (i13 <= dVar.size()) {
            if (i12 > 0) {
                dVar.t(outputStream, i11, i12);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(39);
            sb4.append("Source end offset exceeded: ");
            sb4.append(i13);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    public void x(byte[] bArr) throws IOException {
        int length = bArr.length;
        byte[] bArr2 = (byte[]) this.f6157v;
        int i7 = this.f6154d;
        int i10 = this.f6155e;
        int i11 = i7 - i10;
        if (i11 >= length) {
            System.arraycopy(bArr, 0, bArr2, i10, length);
            this.f6155e += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i10, i11);
        int i12 = length - i11;
        this.f6155e = i7;
        p();
        if (i12 > i7) {
            ((OutputStream) this.f6156i).write(bArr, i11, i12);
        } else {
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            this.f6155e = i12;
        }
    }

    public void y(int i7) throws IOException {
        v(i7 & 255);
        v((i7 >> 8) & 255);
        v((i7 >> 16) & 255);
        v((i7 >> 24) & 255);
    }

    public void z(long j) throws IOException {
        v(((int) j) & 255);
        v(((int) (j >> 8)) & 255);
        v(((int) (j >> 16)) & 255);
        v(((int) (j >> 24)) & 255);
        v(((int) (j >> 32)) & 255);
        v(((int) (j >> 40)) & 255);
        v(((int) (j >> 48)) & 255);
        v(((int) (j >> 56)) & 255);
    }

    public v1() {
        this.f6156i = new long[10];
        this.f6157v = new Object[10];
    }

    public v1(float[] fArr, float[] fArr2, int i7, int i10) {
        this.f6154d = i7;
        je.b.g(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f6156i = fArr;
        this.f6157v = fArr2;
        this.f6155e = i10;
    }
}
