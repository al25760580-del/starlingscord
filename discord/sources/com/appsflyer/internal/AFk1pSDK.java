package com.appsflyer.internal;

import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1pSDK extends FilterInputStream {
    private int AFInAppEventType;
    private int AFLogger;
    private final int areAllFieldsValid;
    private final int[] component1;
    private final byte[] component2;
    private final int[] component3;
    private final byte[][] component4;
    private final int copy;
    private final int copydefault;
    private int equals;
    private final byte[] hashCode;
    private int toString;
    private static final byte[] getCurrencyIso4217Code = AFk1nSDK.getMonetizationNetwork;
    private static final int[] getMonetizationNetwork = AFk1nSDK.AFAdRevenueData;
    private static final int[] getMediationNetwork = AFk1nSDK.getRevenue;
    private static final int[] AFAdRevenueData = AFk1nSDK.getCurrencyIso4217Code;
    private static final int[] getRevenue = AFk1nSDK.getMediationNetwork;

    public AFk1pSDK(InputStream inputStream, int i7, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i7, bArr, bArr2, (byte) 0);
    }

    private int AFAdRevenueData() throws IOException {
        if (this.toString == Integer.MAX_VALUE) {
            this.toString = ((FilterInputStream) this).in.read();
        }
        if (this.AFInAppEventType == 16) {
            byte[] bArr = this.component2;
            int i7 = this.toString;
            bArr[0] = (byte) i7;
            if (i7 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i10 = 1;
            do {
                int i11 = ((FilterInputStream) this).in.read(this.component2, i10, 16 - i10);
                if (i11 <= 0) {
                    break;
                }
                i10 += i11;
            } while (i10 < 16);
            if (i10 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = this.copydefault;
            if (i12 == this.copy) {
                AFAdRevenueData(this.component2, this.hashCode);
            } else {
                if (this.equals <= i12) {
                    AFAdRevenueData(this.component2, this.hashCode);
                } else {
                    byte[] bArr2 = this.component2;
                    System.arraycopy(bArr2, 0, this.hashCode, 0, bArr2.length);
                }
                int i13 = this.equals;
                if (i13 < this.copy) {
                    this.equals = i13 + 1;
                } else {
                    this.equals = 1;
                }
            }
            int i14 = ((FilterInputStream) this).in.read();
            this.toString = i14;
            this.AFInAppEventType = 0;
            this.AFLogger = i14 < 0 ? 16 - (this.hashCode[15] & 255) : 16;
        }
        return this.AFLogger;
    }

    private static byte[][] getMonetizationNetwork(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i7 = 0; i7 < bArr.length; i7++) {
            bArr2[i7] = new byte[bArr[i7].length];
            int i10 = 0;
            while (true) {
                byte[] bArr3 = bArr[i7];
                if (i10 < bArr3.length) {
                    bArr2[i7][bArr3[i10]] = (byte) i10;
                    i10++;
                }
            }
        }
        return bArr2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFAdRevenueData();
        return this.AFLogger - this.AFInAppEventType;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i7) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFAdRevenueData();
        int i7 = this.AFInAppEventType;
        if (i7 >= this.AFLogger) {
            return -1;
        }
        byte[] bArr = this.hashCode;
        this.AFInAppEventType = i7 + 1;
        return bArr[i7] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j5 = 0;
        while (j5 < j && read() != -1) {
            j5++;
        }
        return j5;
    }

    private AFk1pSDK(InputStream inputStream, int i7, byte[] bArr, byte[][] bArr2, byte b10) {
        super(new BufferedInputStream(inputStream, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT));
        this.component3 = new int[4];
        this.component2 = new byte[16];
        this.hashCode = new byte[16];
        this.equals = 1;
        this.toString = Integer.MAX_VALUE;
        this.AFInAppEventType = 16;
        this.AFLogger = 16;
        this.areAllFieldsValid = i7;
        this.component1 = AFk1nSDK.getMonetizationNetwork(bArr, i7);
        this.component4 = getMonetizationNetwork(bArr2);
        this.copydefault = 100;
        this.copy = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        int i11 = i7 + i10;
        for (int i12 = i7; i12 < i11; i12++) {
            AFAdRevenueData();
            int i13 = this.AFInAppEventType;
            if (i13 >= this.AFLogger) {
                if (i12 == i7) {
                    return -1;
                }
                return i10 - (i11 - i12);
            }
            byte[] bArr2 = this.hashCode;
            this.AFInAppEventType = i13 + 1;
            bArr[i12] = bArr2[i13];
        }
        return i10;
    }

    private void AFAdRevenueData(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.component3;
        char c8 = 1;
        char c10 = 2;
        char c11 = '\b';
        char c12 = 3;
        int i7 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.component1;
        iArr[0] = i7 ^ iArr2[0];
        char c13 = 5;
        char c14 = 6;
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & 255) | (((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8))) ^ iArr2[2];
        char c15 = 14;
        iArr[3] = (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255)) ^ iArr2[3];
        int i10 = 1;
        int i11 = 4;
        while (i10 < this.areAllFieldsValid) {
            int[] iArr3 = getMonetizationNetwork;
            int[] iArr4 = this.component3;
            char c16 = c8;
            byte[][] bArr3 = this.component4;
            byte[] bArr4 = bArr3[0];
            int i12 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = getMediationNetwork;
            byte[] bArr5 = bArr3[c16];
            char c17 = c10;
            int i13 = i12 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = AFAdRevenueData;
            byte[] bArr6 = bArr3[c17];
            char c18 = c12;
            int i14 = i13 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = getRevenue;
            byte[] bArr7 = bArr3[c18];
            char c19 = c11;
            int i15 = i14 ^ iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.component1;
            int i16 = i15 ^ iArr8[i11];
            char c20 = c15;
            char c21 = c13;
            int i17 = (((iArr3[iArr4[bArr4[c16]] >>> 24] ^ iArr5[(iArr4[bArr5[c16]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c16]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c16]] & 255]) ^ iArr8[i11 + 1];
            int i18 = (((iArr3[iArr4[bArr4[c17]] >>> 24] ^ iArr5[(iArr4[bArr5[c17]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c17]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c17]] & 255]) ^ iArr8[i11 + 2];
            int i19 = (((iArr3[iArr4[bArr4[c18]] >>> 24] ^ iArr5[(iArr4[bArr5[c18]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c18]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c18]] & 255]) ^ iArr8[i11 + 3];
            iArr4[0] = i16;
            iArr4[c16] = i17;
            iArr4[c17] = i18;
            iArr4[c18] = i19;
            i10++;
            i11 += 4;
            c8 = c16;
            c10 = c17;
            c12 = c18;
            c11 = c19;
            c13 = c21;
            c15 = c20;
            c14 = c14;
        }
        char c22 = c8;
        char c23 = c10;
        char c24 = c12;
        char c25 = c11;
        char c26 = c15;
        int[] iArr9 = this.component1;
        int i20 = iArr9[i11];
        byte[] bArr8 = getCurrencyIso4217Code;
        int[] iArr10 = this.component3;
        byte[][] bArr9 = this.component4;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i20 >>> 24));
        byte[] bArr11 = bArr9[c22];
        bArr2[c22] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i20 >>> 16));
        byte[] bArr12 = bArr9[c23];
        bArr2[c23] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i20 >>> 8));
        byte[] bArr13 = bArr9[c24];
        bArr2[c24] = (byte) (i20 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i21 = iArr9[i11 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[c22]] >>> 24] ^ (i21 >>> 24));
        bArr2[c13] = (byte) (bArr8[(iArr10[bArr11[c22]] >>> 16) & 255] ^ (i21 >>> 16));
        bArr2[c14] = (byte) (bArr8[(iArr10[bArr12[c22]] >>> 8) & 255] ^ (i21 >>> 8));
        bArr2[7] = (byte) (i21 ^ bArr8[iArr10[bArr13[c22]] & 255]);
        int i22 = iArr9[i11 + 2];
        bArr2[c25] = (byte) (bArr8[iArr10[bArr10[c23]] >>> 24] ^ (i22 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[c23]] >>> 16) & 255] ^ (i22 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[c23]] >>> 8) & 255] ^ (i22 >>> 8));
        bArr2[11] = (byte) (i22 ^ bArr8[iArr10[bArr13[c23]] & 255]);
        int i23 = iArr9[i11 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[c24]] >>> 24] ^ (i23 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[c24]] >>> 16) & 255] ^ (i23 >>> 16));
        bArr2[c26] = (byte) (bArr8[(iArr10[bArr12[c24]] >>> 8) & 255] ^ (i23 >>> 8));
        bArr2[15] = (byte) (i23 ^ bArr8[iArr10[bArr13[c24]] & 255]);
    }
}
