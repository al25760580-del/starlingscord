package com.appsflyer.internal;

import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1mSDK extends FilterInputStream {
    private static final short AFAdRevenueData = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    private int AFInAppEventParameterName;
    private int areAllFieldsValid;
    private int component1;
    private int component2;
    private int component3;
    private int component4;
    private final int copy;
    private final int copydefault;
    private int equals;
    private byte[] getCurrencyIso4217Code;
    private byte[] getMediationNetwork;
    private byte[] getMonetizationNetwork;
    private int getRevenue;
    private int hashCode;
    private int toString;

    public AFk1mSDK(InputStream inputStream, int[] iArr, int i7, byte[] bArr, int i10, int i11) {
        this(inputStream, iArr, i7, bArr, i10, i11, (byte) 0);
    }

    private int getCurrencyIso4217Code() throws IOException {
        if (this.component4 == Integer.MAX_VALUE) {
            this.component4 = ((FilterInputStream) this).in.read();
        }
        if (this.getRevenue == 8) {
            byte[] bArr = this.getMediationNetwork;
            int i7 = this.component4;
            bArr[0] = (byte) i7;
            if (i7 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i10 = 1;
            do {
                int i11 = ((FilterInputStream) this).in.read(this.getMediationNetwork, i10, 8 - i10);
                if (i11 <= 0) {
                    break;
                }
                i10 += i11;
            } while (i10 < 8);
            if (i10 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = this.copy;
            if (i12 == this.copydefault) {
                getMonetizationNetwork();
            } else {
                if (this.AFInAppEventParameterName <= i12) {
                    getMonetizationNetwork();
                }
                int i13 = this.AFInAppEventParameterName;
                if (i13 < this.copydefault) {
                    this.AFInAppEventParameterName = i13 + 1;
                } else {
                    this.AFInAppEventParameterName = 1;
                }
            }
            int i14 = ((FilterInputStream) this).in.read();
            this.component4 = i14;
            this.getRevenue = 0;
            this.areAllFieldsValid = i14 < 0 ? 8 - (this.getMediationNetwork[7] & 255) : 8;
        }
        return this.areAllFieldsValid;
    }

    private void getMonetizationNetwork() {
        if (this.component1 == 3) {
            byte[] bArr = this.getMediationNetwork;
            System.arraycopy(bArr, 0, this.getCurrencyIso4217Code, 0, bArr.length);
        }
        byte[] bArr2 = this.getMediationNetwork;
        boolean z5 = true;
        char c8 = 2;
        int i7 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i10 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i11 = 0;
        while (true) {
            int i12 = this.component2;
            if (i11 >= i12) {
                break;
            }
            short s2 = AFAdRevenueData;
            i10 -= ((((i12 - i11) * s2) + i7) ^ ((i7 << 4) + this.toString)) ^ ((i7 >>> 5) + this.hashCode);
            i7 -= (((i10 << 4) + this.component3) ^ (((i12 - i11) * s2) + i10)) ^ ((i10 >>> 5) + this.equals);
            i11++;
            c8 = c8;
            z5 = z5;
        }
        byte[] bArr3 = this.getMediationNetwork;
        bArr3[0] = (byte) (i7 >> 24);
        bArr3[z5 ? 1 : 0] = (byte) (i7 >> 16);
        bArr3[c8] = (byte) (i7 >> 8);
        bArr3[3] = (byte) i7;
        bArr3[4] = (byte) (i10 >> 24);
        bArr3[5] = (byte) (i10 >> 16);
        bArr3[6] = (byte) (i10 >> 8);
        bArr3[7] = (byte) i10;
        if (this.component1 == 3) {
            for (int i13 = 0; i13 < 8; i13++) {
                byte[] bArr4 = this.getMediationNetwork;
                bArr4[i13] = (byte) (bArr4[i13] ^ this.getMonetizationNetwork[i13]);
            }
            byte[] bArr5 = this.getCurrencyIso4217Code;
            System.arraycopy(bArr5, 0, this.getMonetizationNetwork, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getCurrencyIso4217Code();
        return this.areAllFieldsValid - this.getRevenue;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getCurrencyIso4217Code();
        int i7 = this.getRevenue;
        if (i7 >= this.areAllFieldsValid) {
            return -1;
        }
        byte[] bArr = this.getMediationNetwork;
        this.getRevenue = i7 + 1;
        return bArr[i7] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j5 = 0;
        while (j5 < j && read() != -1) {
            j5++;
        }
        return j5;
    }

    private AFk1mSDK(InputStream inputStream, int[] iArr, int i7, byte[] bArr, int i10, int i11, byte b10) {
        super(new BufferedInputStream(inputStream, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT));
        this.component4 = Integer.MAX_VALUE;
        this.AFInAppEventParameterName = 1;
        this.getMediationNetwork = new byte[8];
        this.getMonetizationNetwork = new byte[8];
        this.getCurrencyIso4217Code = new byte[8];
        this.getRevenue = 8;
        this.areAllFieldsValid = 8;
        this.component2 = Math.min(Math.max(i10, 5), 16);
        this.component1 = i11;
        if (i11 == 3) {
            System.arraycopy(bArr, 0, this.getMonetizationNetwork, 0, 8);
        }
        long j = (((long) iArr[1]) & 4294967295L) | ((((long) iArr[0]) & 4294967295L) << 32);
        if (i7 == 0) {
            this.component3 = (int) j;
            long j5 = j >> 3;
            short s2 = AFAdRevenueData;
            this.equals = (int) ((((long) s2) * j5) >> 32);
            this.toString = (int) (j >> 32);
            this.hashCode = (int) (j5 + ((long) s2));
        } else {
            int i12 = (int) j;
            this.component3 = i12;
            this.equals = i12 * i7;
            this.toString = i7 ^ i12;
            this.hashCode = (int) (j >> 32);
        }
        this.copy = 100;
        this.copydefault = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        int i11 = i7 + i10;
        for (int i12 = i7; i12 < i11; i12++) {
            getCurrencyIso4217Code();
            int i13 = this.getRevenue;
            if (i13 >= this.areAllFieldsValid) {
                if (i12 == i7) {
                    return -1;
                }
                return i10 - (i11 - i12);
            }
            byte[] bArr2 = this.getMediationNetwork;
            this.getRevenue = i13 + 1;
            bArr[i12] = bArr2[i13];
        }
        return i10;
    }
}
