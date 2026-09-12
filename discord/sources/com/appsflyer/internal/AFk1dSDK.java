package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1dSDK {
    public int AFAdRevenueData;
    public int getCurrencyIso4217Code;
    public int getMonetizationNetwork;

    public static void AFAdRevenueData(int[] iArr) {
        for (int i7 = 0; i7 < iArr.length / 2; i7++) {
            int i10 = iArr[i7];
            iArr[i7] = iArr[(iArr.length - i7) - 1];
            iArr[(iArr.length - i7) - 1] = i10;
        }
    }

    public static int getCurrencyIso4217Code(int i7) {
        int[][] iArr = AFk1tSDK.getMediationNetwork.getMonetizationNetwork;
        return ((iArr[0][(i7 >>> 24) & 255] + iArr[1][(i7 >>> 16) & 255]) ^ iArr[2][(i7 >>> 8) & 255]) + iArr[3][i7 & 255];
    }
}
