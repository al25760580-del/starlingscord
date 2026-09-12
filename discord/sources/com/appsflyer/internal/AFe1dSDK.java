package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1nSDK.AnonymousClass3;
import com.discord.jank_stats.JankRecordStore;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1dSDK extends AFe1lSDK<Boolean> {
    private static volatile boolean areAllFieldsValid = false;
    private final AFc1uSDK component1;
    private Boolean component2;
    private final AFe1nSDK component3;
    private final AFc1bSDK component4;

    public AFe1dSDK(@NonNull AFc1bSDK aFc1bSDK) {
        super(AFe1mSDK.LOAD_CACHE, new AFe1mSDK[0], "LoadCachedRequests");
        this.component1 = aFc1bSDK.AFInAppEventType();
        this.component3 = aFc1bSDK.copydefault();
        this.component4 = aFc1bSDK;
    }

    public static boolean component2() {
        return areAllFieldsValid;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final long getCurrencyIso4217Code() {
        return JankRecordStore.FLUSH_INTERVAL_MS;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    @NonNull
    public final AFe1uSDK getMediationNetwork() {
        for (AFc1tSDK aFc1tSDK : this.component1.getMediationNetwork()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
            StringBuilder sb2 = new StringBuilder("resending request: ");
            sb2.append(aFc1tSDK.getCurrencyIso4217Code);
            aFLogger.i(aFg1cSDK, sb2.toString());
            try {
                AFh1gSDK aFh1gSDK = new AFh1gSDK(AFAdRevenueData(aFc1tSDK), aFc1tSDK.getMonetizationNetwork(), aFc1tSDK.getMediationNetwork, aFc1tSDK.AFAdRevenueData);
                AFe1nSDK aFe1nSDK = this.component3;
                aFe1nSDK.AFAdRevenueData.execute(aFe1nSDK.new AnonymousClass3(new AFf1tSDK(aFh1gSDK, this.component4)));
            } catch (Exception e10) {
                AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Failed to resend cached request", e10);
            }
        }
        this.component2 = Boolean.TRUE;
        areAllFieldsValid = true;
        return AFe1uSDK.SUCCESS;
    }

    private static String AFAdRevenueData(AFc1tSDK aFc1tSDK) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = Long.parseLong(aFc1tSDK.getMediationNetwork, 10);
        String str = aFc1tSDK.getCurrencyIso4217Code;
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((jCurrentTimeMillis - j) / 1000)).toString();
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e10);
            return str;
        }
    }
}
