package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1jSDK<ResponseBody> {
    private final AFe1vSDK<ResponseBody> AFAdRevenueData;
    private final ExecutorService getCurrencyIso4217Code;
    private final AFd1fSDK getMediationNetwork;
    private final AtomicBoolean getMonetizationNetwork = new AtomicBoolean(false);
    public final AFd1dSDK getRevenue;

    public AFd1jSDK(AFd1dSDK aFd1dSDK, ExecutorService executorService, AFd1fSDK aFd1fSDK, AFe1vSDK<ResponseBody> aFe1vSDK) {
        this.getRevenue = aFd1dSDK;
        this.getCurrencyIso4217Code = executorService;
        this.getMediationNetwork = aFd1fSDK;
        this.AFAdRevenueData = aFe1vSDK;
    }

    public final AFe1xSDK<ResponseBody> AFAdRevenueData() throws ParsingException {
        if (this.getMonetizationNetwork.getAndSet(true)) {
            throw new IllegalStateException("Http call is already executed");
        }
        AFe1xSDK<String> aFe1xSDKAFAdRevenueData = this.getMediationNetwork.AFAdRevenueData(this.getRevenue);
        try {
            return new AFe1xSDK<>(this.AFAdRevenueData.getMonetizationNetwork(aFe1xSDKAFAdRevenueData.getBody()), aFe1xSDKAFAdRevenueData.getMediationNetwork, aFe1xSDKAFAdRevenueData.getMonetizationNetwork, aFe1xSDKAFAdRevenueData.getCurrencyIso4217Code, aFe1xSDKAFAdRevenueData.AFAdRevenueData);
        } catch (JSONException e10) {
            AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e10);
            throw new ParsingException(e10.getMessage(), e10, aFe1xSDKAFAdRevenueData);
        }
    }
}
