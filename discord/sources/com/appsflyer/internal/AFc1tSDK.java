package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.util.Arrays;
import java.util.Scanner;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1tSDK {
    public AFe1mSDK AFAdRevenueData;
    public String getCurrencyIso4217Code;
    public String getMediationNetwork;
    private byte[] getMonetizationNetwork;
    String getRevenue;

    public AFc1tSDK(String str, byte[] bArr, String str2, AFe1mSDK aFe1mSDK) {
        this.getCurrencyIso4217Code = str;
        this.getMonetizationNetwork = bArr;
        this.getRevenue = str2;
        this.AFAdRevenueData = aFe1mSDK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFc1tSDK.class == obj.getClass()) {
            AFc1tSDK aFc1tSDK = (AFc1tSDK) obj;
            String str = this.getRevenue;
            if (str == null ? aFc1tSDK.getRevenue != null : !str.equals(aFc1tSDK.getRevenue)) {
                return false;
            }
            if (!Arrays.equals(this.getMonetizationNetwork, aFc1tSDK.getMonetizationNetwork)) {
                return false;
            }
            String str2 = this.getCurrencyIso4217Code;
            if (str2 == null ? aFc1tSDK.getCurrencyIso4217Code != null : !str2.equals(aFc1tSDK.getCurrencyIso4217Code)) {
                return false;
            }
            String str3 = this.getMediationNetwork;
            if (str3 == null ? aFc1tSDK.getMediationNetwork != null : !str3.equals(aFc1tSDK.getMediationNetwork)) {
                return false;
            }
            if (this.AFAdRevenueData == aFc1tSDK.AFAdRevenueData) {
                return true;
            }
        }
        return false;
    }

    public final byte[] getMonetizationNetwork() {
        return this.getMonetizationNetwork;
    }

    public final int hashCode() {
        String str = this.getRevenue;
        int iHashCode = (Arrays.hashCode(this.getMonetizationNetwork) + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.getCurrencyIso4217Code;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getMediationNetwork;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFe1mSDK aFe1mSDK = this.AFAdRevenueData;
        return iHashCode3 + (aFe1mSDK != null ? aFe1mSDK.hashCode() : 0);
    }

    public AFc1tSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            String strNextLine = scanner.nextLine();
            if (strNextLine.startsWith("url=")) {
                this.getCurrencyIso4217Code = strNextLine.substring(4).trim();
            } else if (strNextLine.startsWith("version=")) {
                this.getRevenue = strNextLine.substring(8).trim();
            } else if (strNextLine.startsWith("data=")) {
                this.getMonetizationNetwork = Base64.decode(strNextLine.substring(5).trim(), 2);
            } else if (strNextLine.startsWith("type=")) {
                String strTrim = strNextLine.substring(5).trim();
                try {
                    this.AFAdRevenueData = AFe1mSDK.valueOf(strTrim);
                } catch (Exception e10) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(strTrim)), e10);
                }
            }
        }
        scanner.close();
    }
}
