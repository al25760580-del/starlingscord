package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1pSDK {
    private static String getCurrencyIso4217Code = "356";
    public final AFc1eSDK AFAdRevenueData;
    private final Executor areAllFieldsValid;
    private PackageInfo component3;
    public final AFc1oSDK getMonetizationNetwork;
    public final AFc1gSDK getRevenue;
    private Bundle component2 = null;
    public String getMediationNetwork = "";

    public AFc1pSDK(AFc1gSDK aFc1gSDK, AFc1oSDK aFc1oSDK, AFc1eSDK aFc1eSDK, Executor executor) {
        this.getRevenue = aFc1gSDK;
        this.getMonetizationNetwork = aFc1oSDK;
        this.AFAdRevenueData = aFc1eSDK;
        this.areAllFieldsValid = executor;
    }

    public static String AFAdRevenueData() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static String component2() {
        StringBuilder sb2 = new StringBuilder("version: 6.17.3 (build ");
        sb2.append(getCurrencyIso4217Code);
        sb2.append(")");
        return sb2.toString();
    }

    @NonNull
    public static String getCurrencyIso4217Code() {
        return "6.17.3";
    }

    @NonNull
    public static String getMonetizationNetwork() {
        return UUID.randomUUID().toString();
    }

    public static String getRevenue() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    public final String areAllFieldsValid() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = getMonetizationNetwork("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public final boolean component1() {
        return !this.AFAdRevenueData.getRevenue();
    }

    public final String component4() {
        AFh1pSDK aFh1pSDK = this.AFAdRevenueData.component2;
        AFb1mSDK aFb1mSDK = aFh1pSDK != null ? new AFb1mSDK(aFh1pSDK.getRevenue, aFh1pSDK.component2) : null;
        if (aFb1mSDK != null) {
            return aFb1mSDK.getCurrencyIso4217Code;
        }
        return null;
    }

    @SuppressLint({"DiscouragedApi"})
    public final String getMediationNetwork(String str) {
        try {
            int identifier = this.getRevenue.getRevenue.getResources().getIdentifier(str, "string", this.getRevenue.getRevenue.getPackageName());
            if (identifier != 0) {
                return this.getRevenue.getRevenue.getString(identifier);
            }
            return null;
        } catch (Resources.NotFoundException e10) {
            StringBuilder sb2 = new StringBuilder("Could not load string resource!");
            sb2.append(e10.getMessage());
            AFLogger.afErrorLog(sb2.toString(), e10);
            return null;
        }
    }

    @NonNull
    public final PackageInfo n_() {
        if (this.component3 == null) {
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    this.component3 = this.getRevenue.getRevenue.getPackageManager().getPackageInfo(this.getRevenue.getRevenue.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                } else {
                    this.component3 = this.getRevenue.getRevenue.getPackageManager().getPackageInfo(this.getRevenue.getRevenue.getPackageName(), 0);
                }
            } catch (PackageManager.NameNotFoundException e10) {
                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while trying fo get PackageInfo", e10, false, false, true, false);
            }
        }
        return this.component3;
    }

    public final String getMonetizationNetwork(String str) {
        Object obj;
        try {
            if (this.component2 == null) {
                this.component2 = ((PackageItemInfo) this.getRevenue.getRevenue.getPackageManager().getApplicationInfo(this.getRevenue.getRevenue.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)).metaData;
            }
            Bundle bundle = this.component2;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Could not load manifest metadata!");
            sb2.append(th2.getMessage());
            AFLogger.afErrorLog(sb2.toString(), th2);
            return null;
        }
    }

    public final boolean getRevenue(String str) {
        String monetizationNetwork = getMonetizationNetwork(str);
        if (monetizationNetwork != null) {
            return Boolean.parseBoolean(monetizationNetwork);
        }
        return false;
    }

    public final String getRevenue(Context context) {
        try {
            return new AFb1iSDK(context, this.areAllFieldsValid).getMonetizationNetwork();
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PUBLIC_API, "Exception while collecting facebook's attribution ID. ", th2, true, false, false);
            return null;
        }
    }

    public final boolean getMediationNetwork(Context context) {
        try {
            return (this.getRevenue.getRevenue.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0;
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.PUBLIC_API, "Could not check if app is pre installed", e10);
        }
    }
}
