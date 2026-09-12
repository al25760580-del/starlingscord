package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFe1xSDK<Body> implements ResponseNetwork<Body> {

    @NonNull
    public final AFd1aSDK AFAdRevenueData;

    @NonNull
    final Map<String, List<String>> getCurrencyIso4217Code;
    final int getMediationNetwork;
    final boolean getMonetizationNetwork;

    @NonNull
    private final Body getRevenue;

    public AFe1xSDK(@NonNull Body body, int i7, boolean z5, Map<String, List<String>> map, @NonNull AFd1aSDK aFd1aSDK) {
        this.getRevenue = body;
        this.getMediationNetwork = i7;
        this.getMonetizationNetwork = z5;
        this.getCurrencyIso4217Code = new HashMap(map);
        this.AFAdRevenueData = aFd1aSDK;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1xSDK aFe1xSDK = (AFe1xSDK) obj;
        if (this.getMediationNetwork == aFe1xSDK.getMediationNetwork && this.getMonetizationNetwork == aFe1xSDK.getMonetizationNetwork && this.getRevenue.equals(aFe1xSDK.getRevenue) && this.getCurrencyIso4217Code.equals(aFe1xSDK.getCurrencyIso4217Code)) {
            return this.AFAdRevenueData.equals(aFe1xSDK.AFAdRevenueData);
        }
        return false;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.getCurrencyIso4217Code.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.getCurrencyIso4217Code.get(str2);
            }
        }
        return null;
    }

    public final String getMediationNetwork(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb2 = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        return sb2.toString();
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.getMediationNetwork;
    }

    public int hashCode() {
        return this.AFAdRevenueData.hashCode() + ((this.getCurrencyIso4217Code.hashCode() + (((((this.getRevenue.hashCode() * 31) + this.getMediationNetwork) * 31) + (this.getMonetizationNetwork ? 1 : 0)) * 31)) * 31);
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.getMonetizationNetwork;
    }
}
