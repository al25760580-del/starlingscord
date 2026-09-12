package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFd1dSDK {

    @NonNull
    final Map<String, String> AFAdRevenueData;
    private final boolean areAllFieldsValid;
    private boolean component1;
    private final boolean component2;
    public int component3;
    private final byte[] component4;
    public boolean getCurrencyIso4217Code;
    public boolean getMediationNetwork;

    @NonNull
    final String getMonetizationNetwork;

    @NonNull
    public final String getRevenue;

    public AFd1dSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z5) {
        this(str, bArr, str2, map, z5, (byte) 0);
    }

    public final boolean AFAdRevenueData() {
        return this.component2;
    }

    public final boolean component2() {
        return this.getCurrencyIso4217Code;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getMediationNetwork;
    }

    public final byte[] getMediationNetwork() {
        return this.component4;
    }

    public final boolean getMonetizationNetwork() {
        return this.component1;
    }

    public final boolean getRevenue() {
        return this.areAllFieldsValid;
    }

    private AFd1dSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z5, byte b10) {
        this.component1 = true;
        this.getMediationNetwork = false;
        this.getCurrencyIso4217Code = true;
        this.component3 = -1;
        this.getRevenue = str;
        this.component4 = bArr;
        this.getMonetizationNetwork = str2;
        this.AFAdRevenueData = map;
        this.areAllFieldsValid = z5;
        this.component2 = true;
    }

    public AFd1dSDK(@NonNull String str, @NonNull String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
