package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1vSDK {
    public static void getMonetizationNetwork(int i7, int i10, boolean z5, int i11, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z5) {
            getRevenue(iArr);
        }
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i7 ^ iArr[i12];
            int revenue = i10 ^ getRevenue(i13, iArr2);
            i12++;
            i10 = i13;
            i7 = revenue;
        }
        int i14 = i7 ^ iArr[iArr.length - 2];
        int i15 = i10 ^ iArr[iArr.length - 1];
        if (!z5) {
            getRevenue(iArr);
        }
        iArr3[0] = i15;
        iArr3[1] = i14;
    }

    private static void getRevenue(int[] iArr) {
        for (int i7 = 0; i7 < iArr.length / 2; i7++) {
            int i10 = iArr[i7];
            iArr[i7] = iArr[(iArr.length - i7) - 1];
            iArr[(iArr.length - i7) - 1] = i10;
        }
    }

    private static int getRevenue(int i7, int[][] iArr) {
        return ((iArr[0][i7 >>> 24] + iArr[1][(i7 >>> 16) & 255]) ^ iArr[2][(i7 >>> 8) & 255]) + iArr[3][i7 & 255];
    }
}
