package com.appsflyer.share;

import a3.e;
import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFa1uSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFe1nSDK;
import com.appsflyer.internal.AFe1nSDK.AnonymousClass3;
import com.appsflyer.internal.AFj1dSDK;
import com.appsflyer.internal.AFk1uSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kk.b;

/* JADX INFO: loaded from: classes.dex */
public class LinkGenerator {
    String AFAdRevenueData;
    private String areAllFieldsValid;
    private String component1;
    private String component2;
    private String component3;
    private String component4;
    private String equals;
    private String getCurrencyIso4217Code;
    private String getMediationNetwork;
    String getMonetizationNetwork;
    private final String getRevenue;
    private final Map<String, String> hashCode = new HashMap();
    private String toString;

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.getRevenue = str;
    }

    private Map<String, String> AFAdRevenueData() {
        HashMap map = new HashMap();
        map.put("pid", this.getRevenue);
        String str = this.component3;
        if (str != null) {
            map.put("af_referrer_uid", str);
        }
        String str2 = this.getMediationNetwork;
        if (str2 != null) {
            map.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.component1;
        if (str3 != null) {
            map.put("af_referrer_customer_id", str3);
        }
        String str4 = this.getCurrencyIso4217Code;
        if (str4 != null) {
            map.put("c", str4);
        }
        String str5 = this.component4;
        if (str5 != null) {
            map.put("af_referrer_name", str5);
        }
        String str6 = this.areAllFieldsValid;
        if (str6 != null) {
            map.put("af_referrer_image_url", str6);
        }
        if (this.equals != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.equals);
            String str7 = this.component2;
            if (str7 != null) {
                this.component2 = str7.replaceFirst("^[/]", "");
                sb2.append(this.equals.endsWith("/") ? "" : "/");
                sb2.append(this.component2);
            }
            map.put("af_dp", sb2.toString());
        }
        for (Map.Entry<String, String> entry : this.hashCode.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return AFj1dSDK.getMediationNetwork(map);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.hashCode.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.hashCode.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.getMonetizationNetwork;
        if (str == null || !str.startsWith("http")) {
            sb2.append(String.format(AFk1uSDK.getMediationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), AFa1uSDK.getMonetizationNetwork().getHostName()));
        } else {
            sb2.append(this.getMonetizationNetwork);
        }
        if (this.AFAdRevenueData != null) {
            sb2.append('/');
            sb2.append(this.AFAdRevenueData);
        }
        Map<String, String> mapAFAdRevenueData = AFAdRevenueData();
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry<String, String> entry : mapAFAdRevenueData.entrySet()) {
            if (sb3.length() == 0) {
                sb3.append('?');
            } else {
                sb3.append('&');
            }
            sb3.append(entry.getKey());
            sb3.append('=');
            sb3.append(entry.getValue());
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public String getBrandDomain() {
        return this.toString;
    }

    public String getCampaign() {
        return this.getCurrencyIso4217Code;
    }

    public String getChannel() {
        return this.getMediationNetwork;
    }

    public String getMediaSource() {
        return this.getRevenue;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.hashCode);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.equals = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.getMonetizationNetwork = e.m("https://", b.k(AppsFlyerLib.getInstance().getHostPrefix(), "app.", AFa1uSDK.getMonetizationNetwork().getHostName()), "/", str3);
            return this;
        }
        if (str2 == null || str2.length() < 5) {
            str2 = "go.onelink.me";
        }
        this.getMonetizationNetwork = e.m("https://", str2, "/", str);
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.toString = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.getCurrencyIso4217Code = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.getMediationNetwork = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.component2 = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.component1 = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.areAllFieldsValid = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.component4 = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.component3 = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.toString;
        Map<String, String> mapAFAdRevenueData = AFAdRevenueData();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFa1uSDK.getMonetizationNetwork().getMediationNetwork(context);
        AFa1uSDK monetizationNetwork = AFa1uSDK.getMonetizationNetwork();
        AFc1bSDK aFc1bSDK = (AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{monetizationNetwork}, 389316487, -389316474, System.identityHashCode(monetizationNetwork));
        AFe1kSDK aFe1kSDK = new AFe1kSDK(aFc1bSDK, UUID.randomUUID(), string, mapAFAdRevenueData, str, responseListener, this);
        AFe1nSDK aFe1nSDKCopydefault = aFc1bSDK.copydefault();
        aFe1nSDKCopydefault.AFAdRevenueData.execute(aFe1nSDKCopydefault.new AnonymousClass3(aFe1kSDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.1
            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponse(String str) {
                responseListener.onResponse(str);
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponseError(String str) {
                responseListener.onResponseError(str);
            }
        });
    }
}
