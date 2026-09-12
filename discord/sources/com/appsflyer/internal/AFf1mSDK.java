package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.discord.js_watchdog.JSWatchdogManagerKt;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1mSDK extends AFe1lSDK<AFf1oSDK> {
    private final AFc1pSDK areAllFieldsValid;
    public final AFf1nSDK component1;
    public AFf1oSDK component2;
    public AFi1vSDK component3;
    private final AFf1qSDK component4;
    private final String copy;
    private final AFf1iSDK copydefault;
    private final AFf1hSDK equals;
    private final AFf1cSDK hashCode;
    private final AFd1lSDK toString;

    public AFf1mSDK(@NonNull AFf1qSDK aFf1qSDK, @NonNull AFc1pSDK aFc1pSDK, @NonNull AFf1cSDK aFf1cSDK, @NonNull AFf1iSDK aFf1iSDK, @NonNull AFd1lSDK aFd1lSDK, @NonNull AFf1hSDK aFf1hSDK, @NonNull String str, AFf1nSDK aFf1nSDK) {
        super(AFe1mSDK.RC_CDN, new AFe1mSDK[0], "UpdateRemoteConfiguration");
        this.component2 = null;
        this.component4 = aFf1qSDK;
        this.areAllFieldsValid = aFc1pSDK;
        this.hashCode = aFf1cSDK;
        this.copydefault = aFf1iSDK;
        this.toString = aFd1lSDK;
        this.equals = aFf1hSDK;
        this.copy = str;
        this.component1 = aFf1nSDK;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0066 A[Catch: all -> 0x0138, IOException -> 0x013b, TryCatch #5 {IOException -> 0x013b, all -> 0x0138, blocks: (B:15:0x005e, B:17:0x0066, B:19:0x008d, B:21:0x00a8, B:24:0x00b5, B:26:0x00c1, B:32:0x0132, B:46:0x0153, B:48:0x0165, B:50:0x016b, B:52:0x018b), top: B:72:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x008d A[Catch: all -> 0x0138, IOException -> 0x013b, TryCatch #5 {IOException -> 0x013b, all -> 0x0138, blocks: (B:15:0x005e, B:17:0x0066, B:19:0x008d, B:21:0x00a8, B:24:0x00b5, B:26:0x00c1, B:32:0x0132, B:46:0x0153, B:48:0x0165, B:50:0x016b, B:52:0x018b), top: B:72:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:50:0x016b A[Catch: all -> 0x0138, IOException -> 0x013b, TryCatch #5 {IOException -> 0x013b, all -> 0x0138, blocks: (B:15:0x005e, B:17:0x0066, B:19:0x008d, B:21:0x00a8, B:24:0x00b5, B:26:0x00c1, B:32:0x0132, B:46:0x0153, B:48:0x0165, B:50:0x016b, B:52:0x018b), top: B:72:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:52:0x018b A[Catch: all -> 0x0138, IOException -> 0x013b, TRY_LEAVE, TryCatch #5 {IOException -> 0x013b, all -> 0x0138, blocks: (B:15:0x005e, B:17:0x0066, B:19:0x008d, B:21:0x00a8, B:24:0x00b5, B:26:0x00c1, B:32:0x0132, B:46:0x0153, B:48:0x0165, B:50:0x016b, B:52:0x018b), top: B:72:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:72:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private AFf1oSDK component2() throws InterruptedException, InterruptedIOException {
        String revenue;
        AFLogger aFLogger;
        AFg1cSDK aFg1cSDK;
        AFe1xSDK<AFi1wSDK> aFe1xSDKAFAdRevenueData;
        String mediationNetwork;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.copy;
        String mediationNetwork2 = this.hashCode.getMediationNetwork();
        if (mediationNetwork2 == null || mediationNetwork2.trim().length() == 0) {
            AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else {
            if (str == null) {
                AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
            } else {
                revenue = AFj1bSDK.getRevenue(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str, this.areAllFieldsValid.getRevenue.getRevenue.getPackageName()}), mediationNetwork2);
            }
            if (revenue == null) {
                AFLogger.INSTANCE.v(AFg1cSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1oSDK.FAILURE;
            }
            try {
                if (this.equals.getRevenue()) {
                    AFLogger.INSTANCE.d(AFg1cSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                    return AFf1oSDK.USE_CACHED;
                }
                aFLogger = AFLogger.INSTANCE;
                aFg1cSDK = AFg1cSDK.REMOTE_CONTROL;
                aFLogger.i(aFg1cSDK, "Cached config is expired, updating...");
                aFe1xSDKAFAdRevenueData = this.toString.getMonetizationNetwork(this.equals.getCurrencyIso4217Code(), this.equals.AFAdRevenueData(), revenue, JSWatchdogManagerKt.FREEZE_CHECK_DELAY_MS).AFAdRevenueData();
                if (aFe1xSDKAFAdRevenueData.isSuccessful()) {
                    getRevenue(revenue, jCurrentTimeMillis, null, null, aFe1xSDKAFAdRevenueData);
                    StringBuilder sb2 = new StringBuilder("failed to fetch remote config from CDN with status code: ");
                    sb2.append(aFe1xSDKAFAdRevenueData.getStatusCode());
                    aFLogger.w(aFg1cSDK, sb2.toString());
                    return AFf1oSDK.FAILURE;
                }
                AFi1wSDK body = aFe1xSDKAFAdRevenueData.getBody();
                String mediationNetwork3 = aFe1xSDKAFAdRevenueData.getMediationNetwork("x-amz-meta-af-auth-v1");
                String mediationNetwork4 = aFe1xSDKAFAdRevenueData.getMediationNetwork("CF-Cache-Status");
                mediationNetwork = this.hashCode.getMediationNetwork();
                if (mediationNetwork != null || mediationNetwork.trim().length() == 0) {
                    aFLogger.w(aFg1cSDK, "Dev key is not set, SDK is not started.");
                    return AFf1oSDK.FAILURE;
                }
                AFi1rSDK revenue2 = this.component4.getRevenue(body, mediationNetwork3, revenue, mediationNetwork);
                if (!revenue2.getRevenue()) {
                    getRevenue(revenue, jCurrentTimeMillis, revenue2.getMediationNetwork, mediationNetwork4, aFe1xSDKAFAdRevenueData);
                    aFLogger.w(aFg1cSDK, "fetched config is not valid (MITM?) refuse to use it.");
                    return AFf1oSDK.FAILURE;
                }
                long monetizationNetwork = this.equals.getMonetizationNetwork();
                StringBuilder sb3 = new StringBuilder("using max-age fallback: ");
                sb3.append(monetizationNetwork);
                sb3.append(" seconds");
                aFLogger.v(aFg1cSDK, sb3.toString());
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                AFf1iSDK aFf1iSDK = this.copydefault;
                String str2 = revenue;
                try {
                    try {
                        aFf1iSDK.getMonetizationNetwork.AFAdRevenueData("af_remote_config", Base64.encodeToString(body.getRevenue.getBytes(Charset.defaultCharset()), 2));
                        aFf1iSDK.getMediationNetwork = aFf1iSDK.AFAdRevenueData;
                        aFf1iSDK.getMonetizationNetwork.getRevenue("af_rc_timestamp", jCurrentTimeMillis2);
                        aFf1iSDK.getMonetizationNetwork.getRevenue("af_rc_max_age", monetizationNetwork);
                        aFf1iSDK.AFAdRevenueData = body;
                        aFf1iSDK.getCurrencyIso4217Code = jCurrentTimeMillis2;
                        aFf1iSDK.getRevenue = monetizationNetwork;
                        StringBuilder sb4 = new StringBuilder("Config successfully updated, timeToLive: ");
                        sb4.append(monetizationNetwork);
                        sb4.append(" seconds");
                        aFLogger.d(aFg1cSDK, sb4.toString());
                        getRevenue(str2, jCurrentTimeMillis, revenue2.getMediationNetwork, mediationNetwork4, aFe1xSDKAFAdRevenueData);
                        return AFf1oSDK.SUCCESS;
                    } catch (IOException e10) {
                        e = e10;
                        revenue = str2;
                        jCurrentTimeMillis = jCurrentTimeMillis;
                        IOException iOException = e;
                        AFLogger aFLogger2 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK2 = AFg1cSDK.REMOTE_CONTROL;
                        StringBuilder sb5 = new StringBuilder("failed to fetch remote config: ");
                        sb5.append(iOException.getMessage());
                        aFLogger2.e(aFg1cSDK2, sb5.toString(), iOException, true, false, false);
                        getMediationNetwork(revenue, jCurrentTimeMillis, iOException instanceof ParsingException ? ((ParsingException) iOException).getRawResponse() : null, null, null, null, iOException);
                        if (iOException.getCause() instanceof InterruptedIOException) {
                            throw ((InterruptedIOException) iOException.getCause());
                        }
                        return AFf1oSDK.FAILURE;
                    } catch (Throwable th2) {
                        th = th2;
                        revenue = str2;
                        jCurrentTimeMillis = jCurrentTimeMillis;
                        Throwable th3 = th;
                        AFLogger aFLogger3 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK3 = AFg1cSDK.REMOTE_CONTROL;
                        StringBuilder sb6 = new StringBuilder("failed to update remote config: ");
                        sb6.append(th3.getMessage());
                        aFLogger3.e(aFg1cSDK3, sb6.toString(), th3, true, false, false);
                        getMediationNetwork(revenue, jCurrentTimeMillis, null, null, null, null, th3);
                        if (th3.getCause() instanceof InterruptedException) {
                            throw ((InterruptedException) th3.getCause());
                        }
                        return AFf1oSDK.FAILURE;
                    }
                } catch (IOException e11) {
                    e = e11;
                    revenue = str2;
                } catch (Throwable th4) {
                    th = th4;
                    revenue = str2;
                }
            } catch (IOException e12) {
                e = e12;
            } catch (Throwable th5) {
                th = th5;
            }
        }
        revenue = null;
        if (revenue == null) {
            AFLogger.INSTANCE.v(AFg1cSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
            return AFf1oSDK.FAILURE;
        }
        if (this.equals.getRevenue()) {
            AFLogger.INSTANCE.d(AFg1cSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
            return AFf1oSDK.USE_CACHED;
        }
        aFLogger = AFLogger.INSTANCE;
        aFg1cSDK = AFg1cSDK.REMOTE_CONTROL;
        aFLogger.i(aFg1cSDK, "Cached config is expired, updating...");
        aFe1xSDKAFAdRevenueData = this.toString.getMonetizationNetwork(this.equals.getCurrencyIso4217Code(), this.equals.AFAdRevenueData(), revenue, JSWatchdogManagerKt.FREEZE_CHECK_DELAY_MS).AFAdRevenueData();
        if (aFe1xSDKAFAdRevenueData.isSuccessful()) {
            getRevenue(revenue, jCurrentTimeMillis, null, null, aFe1xSDKAFAdRevenueData);
            StringBuilder sb7 = new StringBuilder("failed to fetch remote config from CDN with status code: ");
            sb7.append(aFe1xSDKAFAdRevenueData.getStatusCode());
            aFLogger.w(aFg1cSDK, sb7.toString());
            return AFf1oSDK.FAILURE;
        }
        AFi1wSDK body2 = aFe1xSDKAFAdRevenueData.getBody();
        String mediationNetwork5 = aFe1xSDKAFAdRevenueData.getMediationNetwork("x-amz-meta-af-auth-v1");
        String mediationNetwork6 = aFe1xSDKAFAdRevenueData.getMediationNetwork("CF-Cache-Status");
        mediationNetwork = this.hashCode.getMediationNetwork();
        if (mediationNetwork != null) {
        }
        aFLogger.w(aFg1cSDK, "Dev key is not set, SDK is not started.");
        return AFf1oSDK.FAILURE;
    }

    private void getRevenue(String str, long j, AFi1uSDK aFi1uSDK, String str2, AFe1xSDK<AFi1wSDK> aFe1xSDK) {
        getMediationNetwork(str, j, aFe1xSDK, aFe1xSDK != null ? aFe1xSDK.getBody() : null, aFi1uSDK, str2 != null ? str2 : null, null);
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final long getCurrencyIso4217Code() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    @NonNull
    public final AFe1uSDK getMediationNetwork() {
        try {
            AFf1oSDK aFf1oSDKComponent2 = component2();
            this.component2 = aFf1oSDKComponent2;
            return aFf1oSDKComponent2 == AFf1oSDK.FAILURE ? AFe1uSDK.FAILURE : AFe1uSDK.SUCCESS;
        } catch (InterruptedIOException e10) {
            e = e10;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component2 = AFf1oSDK.FAILURE;
            return AFe1uSDK.TIMEOUT;
        } catch (InterruptedException e11) {
            e = e11;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component2 = AFf1oSDK.FAILURE;
            return AFe1uSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.component2 = AFf1oSDK.FAILURE;
            return AFe1uSDK.TIMEOUT;
        }
    }

    private void getMediationNetwork(String str, long j, AFe1xSDK<?> aFe1xSDK, AFi1wSDK aFi1wSDK, AFi1uSDK aFi1uSDK, String str2, Throwable th2) {
        long j5;
        int statusCode;
        Throwable th3;
        if (aFe1xSDK != null) {
            j5 = aFe1xSDK.AFAdRevenueData.getRevenue;
            statusCode = aFe1xSDK.getStatusCode();
        } else {
            j5 = 0;
            statusCode = 0;
        }
        int i7 = statusCode;
        if (th2 instanceof HttpException) {
            Throwable cause = th2.getCause();
            j5 = ((HttpException) th2).getMetrics().getRevenue;
            th3 = cause;
        } else {
            th3 = th2;
        }
        this.component3 = new AFi1vSDK(aFi1wSDK != null ? aFi1wSDK.getCurrencyIso4217Code : null, str, j5, System.currentTimeMillis() - j, i7, aFi1uSDK, str2, th3);
    }
}
