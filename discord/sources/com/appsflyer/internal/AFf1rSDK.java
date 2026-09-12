package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1rSDK extends AFf1uSDK {

    @NonNull
    private final AFf1lSDK AFInAppEventParameterName;

    @NonNull
    private final AppsFlyerProperties AFInAppEventType;
    private final AFh1qSDK AFKeystoreWrapper;

    @NonNull
    private final AFj1rSDK copydefault;

    @NonNull
    private final AFh1tSDK equals;
    public Map<String, Object> hashCode;

    @NonNull
    private final AFa1hSDK registerClient;

    @NonNull
    private final AFc1oSDK toString;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1rSDK$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFj1qSDK.AFa1vSDK.values().length];
            getMediationNetwork = iArr;
            try {
                iArr[AFj1qSDK.AFa1vSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getMediationNetwork[AFj1qSDK.AFa1vSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFf1rSDK(@NonNull AFh1jSDK aFh1jSDK, @NonNull AFc1bSDK aFc1bSDK) {
        super(aFh1jSDK, aFc1bSDK);
        this.copydefault = aFc1bSDK.AFLogger();
        this.toString = aFc1bSDK.component2();
        this.equals = aFc1bSDK.component3();
        this.AFInAppEventParameterName = aFc1bSDK.component1();
        this.AFInAppEventType = AppsFlyerProperties.getInstance();
        this.registerClient = aFc1bSDK.afErrorLogForExcManagerOnly();
        this.AFKeystoreWrapper = aFc1bSDK.afLogForce();
        this.getRevenue.add(AFe1mSDK.RESOLVE_ESP);
        this.getRevenue.add(AFe1mSDK.DLSDK);
    }

    private boolean equals() {
        ResponseNetwork responseNetwork = ((AFe1eSDK) this).component3;
        boolean z5 = this.AFAdRevenueData == AFe1uSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
        AFe1mSDK aFe1mSDK = this.getCurrencyIso4217Code;
        return z5 && (aFe1mSDK == AFe1mSDK.CONVERSION || aFe1mSDK == AFe1mSDK.ATTR);
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    public final boolean AFAdRevenueData() {
        return super.AFAdRevenueData() || equals();
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void getMediationNetwork(AFh1jSDK aFh1jSDK) {
        AFh1qSDK aFh1qSDK;
        AFh1qSDK aFh1qSDK2;
        super.getMediationNetwork(aFh1jSDK);
        int i7 = aFh1jSDK.component1;
        AFh1tSDK aFh1tSDK = this.equals;
        if (aFh1tSDK.getRevenue()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            aFh1tSDK.copydefault = jCurrentTimeMillis;
            long j = aFh1tSDK.component3;
            if (j != 0) {
                aFh1tSDK.getMonetizationNetwork.put("from_fg", Long.valueOf(jCurrentTimeMillis - j));
                aFh1tSDK.getCurrencyIso4217Code.AFAdRevenueData("first_launch", new JSONObject(aFh1tSDK.getMonetizationNetwork).toString());
            } else {
                AFLogger.afInfoLog("Metrics: fg ts is missing");
            }
        }
        Map map = (Map) aFh1jSDK.getCurrencyIso4217Code.get("meta");
        if (map == null) {
            map = new HashMap();
            aFh1jSDK.getCurrencyIso4217Code.put("meta", map);
        }
        if (!aFh1jSDK.getCurrencyIso4217Code.containsKey("af_deeplink")) {
            aFh1jSDK.getMonetizationNetwork(this.registerClient.getMonetizationNetwork());
        }
        AFi1vSDK revenue = this.AFInAppEventParameterName.getRevenue();
        if (revenue != null) {
            HashMap map2 = new HashMap();
            map2.put("cdn_token", revenue.AFAdRevenueData);
            String str = revenue.getMediationNetwork;
            if (str != null) {
                map2.put("c_ver", str);
            }
            long j5 = revenue.getMonetizationNetwork;
            if (j5 > 0) {
                map2.put("latency", Long.valueOf(j5));
            }
            long j7 = revenue.getCurrencyIso4217Code;
            if (j7 > 0) {
                map2.put("delay", Long.valueOf(j7));
            }
            int i10 = revenue.getRevenue;
            if (i10 > 0) {
                map2.put("res_code", Integer.valueOf(i10));
            }
            if (revenue.areAllFieldsValid != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(revenue.areAllFieldsValid.getClass().getSimpleName());
                sb2.append(": ");
                sb2.append(revenue.areAllFieldsValid.getMessage());
                map2.put("error", sb2.toString());
            }
            AFi1uSDK aFi1uSDK = revenue.component1;
            if (aFi1uSDK != null) {
                map2.put("sig", aFi1uSDK.toString());
            }
            String str2 = revenue.component3;
            if (str2 != null) {
                map2.put("cdn_cache_status", str2);
            }
            map.put("rc", map2);
        }
        this.copy.getMonetizationNetwork(aFh1jSDK.getCurrencyIso4217Code);
        if (i7 == 1) {
            if (this.AFInAppEventType.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFh1jSDK.getCurrencyIso4217Code.put("wait_cid", Boolean.toString(true));
            }
            AFh1tSDK aFh1tSDK2 = this.equals;
            HashMap map3 = new HashMap(aFh1tSDK2.getRevenue);
            aFh1tSDK2.getRevenue.clear();
            if (!map3.isEmpty()) {
                map.put("ddl", map3);
            }
            HashMap map4 = new HashMap(this.equals.getMonetizationNetwork);
            if (!map4.isEmpty()) {
                map.put("first_launch", map4);
            }
            AFh1qSDK aFh1qSDK3 = this.AFKeystoreWrapper;
            if (aFh1qSDK3 != null) {
                aFh1qSDK3.AFAdRevenueData(aFh1jSDK);
            }
        } else if (i7 == 2) {
            AFh1tSDK aFh1tSDK3 = this.equals;
            aFh1tSDK3.getCurrencyIso4217Code.getCurrencyIso4217Code("first_launch");
            HashMap map5 = new HashMap(aFh1tSDK3.getMonetizationNetwork);
            if (!map5.isEmpty()) {
                map.put("first_launch", map5);
            }
            if ((aFh1jSDK instanceof AFh1kSDK) && (aFh1qSDK2 = this.AFKeystoreWrapper) != null && !aFh1qSDK2.getMediationNetwork()) {
                this.AFKeystoreWrapper.getRevenue(aFh1jSDK);
            }
        }
        if (map.isEmpty()) {
            aFh1jSDK.getCurrencyIso4217Code.remove("meta");
        }
        if (i7 <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFj1qSDK aFj1qSDK : (AFj1qSDK[]) this.copydefault.getCurrencyIso4217Code.toArray(new AFj1qSDK[0])) {
                boolean z5 = aFj1qSDK instanceof AFi1bSDK;
                int i11 = AnonymousClass2.getMediationNetwork[aFj1qSDK.areAllFieldsValid.ordinal()];
                if (i11 == 1) {
                    if (z5) {
                        aFh1jSDK.getMonetizationNetwork("rfr", ((AFi1bSDK) aFj1qSDK).getMediationNetwork);
                        this.toString.getCurrencyIso4217Code(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFj1qSDK.AFAdRevenueData);
                } else if (i11 == 2 && i7 == 2 && !z5) {
                    HashMap map6 = new HashMap();
                    map6.put("source", aFj1qSDK.getCurrencyIso4217Code);
                    map6.put("response", "TIMEOUT");
                    map6.put("type", aFj1qSDK.component4);
                    arrayList.add(map6);
                }
            }
            if (!arrayList.isEmpty()) {
                aFh1jSDK.getMonetizationNetwork("referrers", arrayList);
            }
            Object obj = this.hashCode;
            if (obj != null) {
                aFh1jSDK.getMonetizationNetwork("fb_ddl", obj);
            }
        }
        if (aFh1jSDK.getCurrencyIso4217Code() == AFe1mSDK.LAUNCH && (aFh1qSDK = this.AFKeystoreWrapper) != null && aFh1qSDK.getMonetizationNetwork()) {
            this.AFKeystoreWrapper.getMediationNetwork(aFh1jSDK);
        }
        this.copy.getRevenue(aFh1jSDK);
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    public final void getRevenue() {
        super.getRevenue();
        AFh1tSDK aFh1tSDK = this.equals;
        if (aFh1tSDK.getRevenue()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = aFh1tSDK.copydefault;
            if (j == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFh1tSDK.getMonetizationNetwork.put("net", Long.valueOf(jCurrentTimeMillis - j));
            aFh1tSDK.getCurrencyIso4217Code.AFAdRevenueData("first_launch", new JSONObject(aFh1tSDK.getMonetizationNetwork).toString());
        }
    }
}
