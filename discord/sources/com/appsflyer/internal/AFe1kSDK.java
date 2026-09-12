package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1kSDK extends AFe1eSDK<String> {
    private final String areAllFieldsValid;
    private final Map<String, String> copy;

    @NonNull
    private final UUID copydefault;
    private final String equals;
    private final LinkGenerator.ResponseListener hashCode;

    @NonNull
    private final LinkGenerator toString;

    public AFe1kSDK(@NonNull AFc1bSDK aFc1bSDK, @NonNull UUID uuid, @NonNull String str, @NonNull Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener, @NonNull LinkGenerator linkGenerator) {
        super(AFe1mSDK.ONELINK, new AFe1mSDK[]{AFe1mSDK.RC_CDN}, aFc1bSDK, uuid.toString());
        this.copydefault = uuid;
        this.areAllFieldsValid = str;
        this.copy = new HashMap(map);
        this.hashCode = responseListener;
        this.equals = str2;
        this.toString = linkGenerator;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    public final long getCurrencyIso4217Code() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    public final void getRevenue() {
        ResponseNetwork responseNetwork;
        super.getRevenue();
        LinkGenerator.ResponseListener responseListener = this.hashCode;
        if (responseListener != null) {
            if (this.AFAdRevenueData == AFe1uSDK.SUCCESS && (responseNetwork = ((AFe1eSDK) this).component3) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable thComponent1 = component1();
            if (!(thComponent1 instanceof ParsingException)) {
                responseListener.onResponse(this.toString.generateLink());
            } else if (((ParsingException) thComponent1).getRawResponse().isSuccessful()) {
                responseListener.onResponseError("Can't parse one link data");
            } else {
                responseListener.onResponse(this.toString.generateLink());
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFd1jSDK<String> getRevenue(@NonNull String str) {
        return ((AFe1eSDK) this).component1.getMediationNetwork(this.areAllFieldsValid, this.copy, this.equals, this.copydefault, str);
    }
}
