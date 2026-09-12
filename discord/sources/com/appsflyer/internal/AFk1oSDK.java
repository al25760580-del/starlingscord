package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public class AFk1oSDK {
    public static void AFAdRevenueData(byte[] bArr, byte b10, long j) {
        for (int i7 = 0; i7 < bArr.length; i7++) {
            if (((1 << i7) & j) != 0) {
                bArr[i7] = (byte) (bArr[i7] ^ b10);
            }
        }
    }
}
