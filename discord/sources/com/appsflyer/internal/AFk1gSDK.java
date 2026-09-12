package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1gSDK {
    public int getCurrencyIso4217Code;
    public int getMediationNetwork;

    public static char[] getCurrencyIso4217Code(long j, char[] cArr, int i7) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 4;
        while (i10 < cArr.length) {
            if ((((j >>> i10) & 1) != i7 || i11 >= 4) && i12 < length) {
                cArr2[i12] = cArr[i10];
                i12++;
            } else {
                cArr2[i11] = cArr[i10];
                i11++;
            }
            i10++;
        }
        return cArr2;
    }
}
