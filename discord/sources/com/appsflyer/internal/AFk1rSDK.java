package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1rSDK {
    public static long[] AFAdRevenueData(int i7, int i10) {
        long[] jArr = new long[4];
        jArr[0] = (((long) i10) & 4294967295L) | ((((long) i7) & 4294967295L) << 32);
        for (int i11 = 1; i11 < 4; i11++) {
            long j = jArr[i11 - 1];
            jArr[i11] = ((j ^ (j >> 30)) * 1812433253) + ((long) i11);
        }
        return jArr;
    }
}
