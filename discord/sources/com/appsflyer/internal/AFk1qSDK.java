package com.appsflyer.internal;

import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1qSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private int areAllFieldsValid;
    private short component1;
    private int component2;
    private byte[] component3;
    private long[] component4;
    private int equals;
    private final int getCurrencyIso4217Code;
    private int getMediationNetwork;
    private long[] getMonetizationNetwork;
    private final int getRevenue;

    public AFk1qSDK(InputStream inputStream, int i7, int i10, short s2, int i11, int i12) {
        this(inputStream, i7, i10, s2, i11, i12, (byte) 0);
    }

    private int getMediationNetwork() throws IOException {
        int i7;
        if (this.component2 == Integer.MAX_VALUE) {
            this.component2 = ((FilterInputStream) this).in.read();
        }
        if (this.areAllFieldsValid == this.AFAdRevenueData) {
            byte[] bArr = this.component3;
            int i10 = this.component2;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int i12 = ((FilterInputStream) this).in.read(this.component3, i11, this.AFAdRevenueData - i11);
                if (i12 <= 0) {
                    break;
                }
                i11 += i12;
            } while (i11 < this.AFAdRevenueData);
            if (i11 < this.AFAdRevenueData) {
                throw new IllegalStateException("unexpected block size");
            }
            int i13 = this.getRevenue;
            if (i13 == this.getCurrencyIso4217Code) {
                getMonetizationNetwork();
            } else {
                if (this.getMediationNetwork <= i13) {
                    getMonetizationNetwork();
                }
                int i14 = this.getMediationNetwork;
                if (i14 < this.getCurrencyIso4217Code) {
                    this.getMediationNetwork = i14 + 1;
                } else {
                    this.getMediationNetwork = 1;
                }
            }
            int i15 = ((FilterInputStream) this).in.read();
            this.component2 = i15;
            this.areAllFieldsValid = 0;
            if (i15 < 0) {
                int i16 = this.AFAdRevenueData;
                i7 = i16 - (this.component3[i16 - 1] & 255);
            } else {
                i7 = this.AFAdRevenueData;
            }
            this.equals = i7;
        }
        return this.equals;
    }

    private void getMonetizationNetwork() {
        long[] jArr = this.getMonetizationNetwork;
        long[] jArr2 = this.component4;
        short s2 = this.component1;
        long j = jArr[s2 % 4] * 2147483085;
        long j5 = jArr2[(s2 + 2) % 4];
        int i7 = (s2 + 3) % 4;
        jArr2[i7] = ((jArr[i7] * 2147483085) + j5) / 2147483647L;
        jArr[i7] = (j + j5) % 2147483647L;
        for (int i10 = 0; i10 < this.AFAdRevenueData; i10++) {
            byte[] bArr = this.component3;
            bArr[i10] = (byte) (((long) bArr[i10]) ^ ((this.getMonetizationNetwork[this.component1] >> (i10 << 3)) & 255));
        }
        this.component1 = (short) ((this.component1 + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getMediationNetwork();
        return this.equals - this.areAllFieldsValid;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getMediationNetwork();
        int i7 = this.areAllFieldsValid;
        if (i7 >= this.equals) {
            return -1;
        }
        byte[] bArr = this.component3;
        this.areAllFieldsValid = i7 + 1;
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

    private AFk1qSDK(InputStream inputStream, int i7, int i10, short s2, int i11, int i12, byte b10) {
        super(new BufferedInputStream(inputStream, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT));
        this.getMediationNetwork = 1;
        this.component2 = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max((int) s2, 4), 8);
        this.AFAdRevenueData = iMin;
        this.component3 = new byte[iMin];
        this.getMonetizationNetwork = new long[4];
        this.component4 = new long[4];
        this.areAllFieldsValid = iMin;
        this.equals = iMin;
        this.getMonetizationNetwork = AFk1rSDK.AFAdRevenueData(i7 ^ i12, iMin ^ i12);
        this.component4 = AFk1rSDK.AFAdRevenueData(i10 ^ i12, i11 ^ i12);
        this.getRevenue = 100;
        this.getCurrencyIso4217Code = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        int i11 = i7 + i10;
        for (int i12 = i7; i12 < i11; i12++) {
            getMediationNetwork();
            int i13 = this.areAllFieldsValid;
            if (i13 >= this.equals) {
                if (i12 == i7) {
                    return -1;
                }
                return i10 - (i11 - i12);
            }
            byte[] bArr2 = this.component3;
            this.areAllFieldsValid = i13 + 1;
            bArr[i12] = bArr2[i13];
        }
        return i10;
    }
}
