package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFe1eSDK<Result> extends AFe1lSDK<AFe1xSDK<Result>> {
    private AFc1uSDK areAllFieldsValid;
    protected final AFd1lSDK component1;
    public final AFf1cSDK component2;
    public AFe1xSDK<Result> component3;
    protected final AFd1mSDK component4;
    private String hashCode;

    private AFe1eSDK(@NonNull AFe1mSDK aFe1mSDK, @NonNull AFe1mSDK[] aFe1mSDKArr, @NonNull AFd1lSDK aFd1lSDK, @NonNull AFf1cSDK aFf1cSDK, @NonNull AFd1mSDK aFd1mSDK, @NonNull AFc1uSDK aFc1uSDK, String str) {
        super(aFe1mSDK, aFe1mSDKArr, str);
        this.component1 = aFd1lSDK;
        this.component2 = aFf1cSDK;
        this.component4 = aFd1mSDK;
        this.areAllFieldsValid = aFc1uSDK;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public boolean AFAdRevenueData() {
        if (component1() instanceof AFe1iSDK) {
            return false;
        }
        if (this.AFAdRevenueData == AFe1uSDK.TIMEOUT) {
            return true;
        }
        Throwable thComponent1 = component1();
        return (thComponent1 instanceof IOException) && !(thComponent1 instanceof ParsingException);
    }

    public boolean a_() {
        return true;
    }

    public abstract AppsFlyerRequestListener areAllFieldsValid();

    public abstract boolean copydefault();

    @Override // com.appsflyer.internal.AFe1lSDK
    public long getCurrencyIso4217Code() {
        return LogThrottleSingleton.RATE_LIMIT_ONE_MINUTE;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    @NonNull
    public AFe1uSDK getMediationNetwork() throws ParsingException {
        if (a_() && this.component2.getMonetizationNetwork()) {
            AppsFlyerRequestListener appsFlyerRequestListenerAreAllFieldsValid = areAllFieldsValid();
            if (appsFlyerRequestListenerAreAllFieldsValid != null) {
                appsFlyerRequestListenerAreAllFieldsValid.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFe1iSDK();
        }
        String mediationNetwork = this.component2.getMediationNetwork();
        if (mediationNetwork == null || mediationNetwork.trim().isEmpty()) {
            AppsFlyerRequestListener appsFlyerRequestListenerAreAllFieldsValid2 = areAllFieldsValid();
            if (appsFlyerRequestListenerAreAllFieldsValid2 != null) {
                appsFlyerRequestListenerAreAllFieldsValid2.onError(41, "No dev key");
            }
            throw new AFe1pSDK();
        }
        AFd1jSDK<Result> revenue = getRevenue(mediationNetwork);
        if (revenue == null) {
            AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, "Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"), false, false);
            return AFe1uSDK.FAILURE;
        }
        if (copydefault()) {
            getMonetizationNetwork(revenue.getRevenue);
        }
        AFe1xSDK<Result> aFe1xSDKAFAdRevenueData = revenue.AFAdRevenueData();
        this.component3 = aFe1xSDKAFAdRevenueData;
        this.component4.getMonetizationNetwork(revenue.getRevenue.getRevenue, aFe1xSDKAFAdRevenueData.getStatusCode(), aFe1xSDKAFAdRevenueData.getBody().toString());
        AppsFlyerRequestListener appsFlyerRequestListenerAreAllFieldsValid3 = areAllFieldsValid();
        if (appsFlyerRequestListenerAreAllFieldsValid3 != null) {
            if (aFe1xSDKAFAdRevenueData.isSuccessful()) {
                appsFlyerRequestListenerAreAllFieldsValid3.onSuccess();
            } else {
                StringBuilder sb2 = new StringBuilder("Status code failure ");
                sb2.append(aFe1xSDKAFAdRevenueData.getStatusCode());
                appsFlyerRequestListenerAreAllFieldsValid3.onError(50, sb2.toString());
            }
        }
        return aFe1xSDKAFAdRevenueData.isSuccessful() ? AFe1uSDK.SUCCESS : AFe1uSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final void getMonetizationNetwork() {
        String mediationNetwork;
        super.getMonetizationNetwork();
        if (!copydefault() || (mediationNetwork = this.component2.getMediationNetwork()) == null || mediationNetwork.trim().isEmpty()) {
            return;
        }
        AFd1jSDK<Result> revenue = getRevenue(mediationNetwork);
        if (revenue != null) {
            getMonetizationNetwork(revenue.getRevenue);
        } else {
            AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, "Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"), false, false);
        }
    }

    public abstract AFd1jSDK<Result> getRevenue(@NonNull String str);

    @Override // com.appsflyer.internal.AFe1lSDK
    public void getRevenue() {
        String str;
        if (this.AFAdRevenueData == AFe1uSDK.SUCCESS) {
            String str2 = this.hashCode;
            if (str2 != null) {
                this.areAllFieldsValid.getCurrencyIso4217Code(str2);
                return;
            }
            return;
        }
        if (AFAdRevenueData() || (str = this.hashCode) == null) {
            return;
        }
        this.areAllFieldsValid.getCurrencyIso4217Code(str);
    }

    public AFe1eSDK(@NonNull AFe1mSDK aFe1mSDK, @NonNull AFe1mSDK[] aFe1mSDKArr, @NonNull AFc1bSDK aFc1bSDK, String str) {
        this(aFe1mSDK, aFe1mSDKArr, aFc1bSDK.getRevenue(), aFc1bSDK.AFKeystoreWrapper(), aFc1bSDK.equals(), aFc1bSDK.AFInAppEventType(), str);
    }

    private void getMonetizationNetwork(AFd1dSDK aFd1dSDK) {
        String str = this.hashCode;
        this.hashCode = this.areAllFieldsValid.getMonetizationNetwork(new AFc1tSDK(aFd1dSDK.getRevenue, aFd1dSDK.getMediationNetwork(), "6.17.3", this.getCurrencyIso4217Code));
        if (str != null) {
            this.areAllFieldsValid.getCurrencyIso4217Code(str);
        }
    }

    public AFe1eSDK(@NonNull AFe1mSDK aFe1mSDK, @NonNull AFe1mSDK[] aFe1mSDKArr, @NonNull AFc1bSDK aFc1bSDK, String str, String str2) {
        this(aFe1mSDK, aFe1mSDKArr, aFc1bSDK.getRevenue(), aFc1bSDK.AFKeystoreWrapper(), aFc1bSDK.equals(), aFc1bSDK.AFInAppEventType(), str);
        this.hashCode = str2;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final void getMediationNetwork(Throwable th2) {
        Throwable th3;
        boolean z5 = !(th2 instanceof HttpException);
        if (th2 instanceof AFe1iSDK) {
            th3 = th2;
            AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", th3, true, false);
        } else {
            th3 = th2;
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
            aFLogger.e(aFg1cSDK, "Error while sending request to server: ".concat(String.valueOf(th3)), th3, false, false, z5);
            aFLogger.w(aFg1cSDK, "Error while sending request to server: ".concat(String.valueOf(th3)));
        }
        AppsFlyerRequestListener appsFlyerRequestListenerAreAllFieldsValid = areAllFieldsValid();
        if (appsFlyerRequestListenerAreAllFieldsValid != null) {
            String message = th3.getMessage();
            if (message == null) {
                message = "";
            }
            appsFlyerRequestListenerAreAllFieldsValid.onError(40, message);
        }
    }
}
