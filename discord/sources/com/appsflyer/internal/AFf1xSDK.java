package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1xSDK extends AFe1lSDK<Map<String, Object>> {
    private static final int component4 = (int) TimeUnit.SECONDS.toMillis(2);
    private final AFa1rSDK areAllFieldsValid;
    private final AFa1gSDK component1;
    private Map<String, Object> component2;
    private final Uri component3;
    private final List<String> equals;

    public AFf1xSDK(AFa1rSDK aFa1rSDK, @NonNull AFa1gSDK aFa1gSDK, @NonNull Uri uri, @NonNull List<String> list) {
        super(AFe1mSDK.RESOLVE_ESP, new AFe1mSDK[]{AFe1mSDK.RC_CDN}, "ResolveEsp");
        this.areAllFieldsValid = aFa1rSDK;
        this.component1 = aFa1gSDK;
        this.component3 = uri;
        this.equals = list;
    }

    private boolean getMonetizationNetwork(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sbN = com.discord.chat.presentation.list.a.n("Validate if link ", str, " belongs to ESP domains: ");
        sbN.append(this.equals);
        AFLogger.afRDLog(sbN.toString());
        try {
            return this.equals.contains(new URL(str).getHost());
        } catch (MalformedURLException e10) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e10);
            return false;
        }
    }

    private static Map<String, Object> r_(Uri uri) {
        HashMap map = new HashMap();
        try {
            StringBuilder sb2 = new StringBuilder("ESP deeplink resolving is started: ");
            sb2.append(uri.toString());
            AFLogger.afDebugLog(sb2.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i7 = component4;
            httpURLConnection.setReadTimeout(i7);
            httpURLConnection.setConnectTimeout(i7);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.17.3");
            int responseCode = httpURLConnection.getResponseCode();
            map.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                map.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
            return map;
        } catch (Throwable th2) {
            map.put("error", th2.getLocalizedMessage());
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return map;
        }
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final long getCurrencyIso4217Code() {
        return LogThrottleSingleton.RATE_LIMIT_ONE_MINUTE;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    @NonNull
    public final AFe1uSDK getMediationNetwork() {
        Integer num = null;
        if (!getMonetizationNetwork(this.component3.toString())) {
            this.areAllFieldsValid.j_(this.component1, this.component3, null);
            return AFe1uSDK.SUCCESS;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = this.component3.toString();
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        String str = null;
        while (i7 < 5) {
            Map<String, Object> mapR_ = r_(Uri.parse(string));
            String str2 = (String) mapR_.get("res");
            Integer num2 = (Integer) mapR_.get("status");
            String str3 = (String) mapR_.get("error");
            if (str2 == null || !getMonetizationNetwork(str2)) {
                str = str3;
                string = str2;
                num = num2;
                break;
            }
            if (i7 < 4) {
                arrayList.add(str2);
            }
            i7++;
            str = str3;
            string = str2;
            num = num2;
        }
        HashMap map = new HashMap();
        map.put("res", string != null ? string : "");
        map.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            map.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            map.put("redirects", arrayList);
        }
        map.put("latency", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        synchronized (this.component1) {
            this.component1.getCurrencyIso4217Code("af_deeplink_r", map);
            this.component1.getCurrencyIso4217Code("af_deeplink", this.component3.toString());
        }
        this.areAllFieldsValid.j_(this.component1, string != null ? Uri.parse(string) : this.component3, this.component3);
        this.component2 = map;
        return AFe1uSDK.SUCCESS;
    }
}
