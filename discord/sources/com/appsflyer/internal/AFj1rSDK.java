package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1rSDK {
    public final CopyOnWriteArrayList<AFj1qSDK> getCurrencyIso4217Code = new CopyOnWriteArrayList<>();
    public final AFc1bSDK getMonetizationNetwork;

    public AFj1rSDK(AFc1bSDK aFc1bSDK) {
        this.getMonetizationNetwork = aFc1bSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component4(Runnable runnable) {
        AFj1wSDK aFj1wSDK = new AFj1wSDK(this.getMonetizationNetwork.getCurrencyIso4217Code(), this.getMonetizationNetwork.getMediationNetwork(), AFj1xSDK.INSTAGRAM, runnable, new o(this, runnable, 2));
        this.getCurrencyIso4217Code.add(aFj1wSDK);
        aFj1wSDK.getCurrencyIso4217Code(this.getMonetizationNetwork.registerClient().getRevenue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(Runnable runnable) {
        this.getMonetizationNetwork.getMediationNetwork().execute(new o(this, runnable, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMonetizationNetwork() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getRevenue(Context context, Runnable runnable, AFc1bSDK aFc1bSDK) {
        List<ResolveInfo> listQueryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
        if (listQueryIntentContentProviders == null || listQueryIntentContentProviders.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
        while (it.hasNext()) {
            ProviderInfo providerInfo = it.next().providerInfo;
            if (providerInfo != null) {
                arrayList.add(new AFj1sSDK(providerInfo, runnable, aFc1bSDK));
            } else {
                AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.getCurrencyIso4217Code.addAll(arrayList);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.PREINSTALL;
        StringBuilder sb2 = new StringBuilder("Detected ");
        sb2.append(arrayList.size());
        sb2.append(" valid preinstall provider(s)");
        aFLogger.d(aFg1cSDK, sb2.toString());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AFj1qSDK) it2.next()).getCurrencyIso4217Code(aFc1bSDK.registerClient().getRevenue);
        }
    }

    public final void AFAdRevenueData(Context context, Runnable runnable, AFc1bSDK aFc1bSDK) {
        aFc1bSDK.getMediationNetwork().execute(new cb.a(1, this, context, runnable, aFc1bSDK));
    }

    public final void getMediationNetwork(Runnable runnable) {
        this.getCurrencyIso4217Code.add(new AFj1wSDK(this.getMonetizationNetwork.getCurrencyIso4217Code(), this.getMonetizationNetwork.getMediationNetwork(), AFj1xSDK.FACEBOOK, runnable, new o(this, runnable, 0)));
    }

    public final boolean AFAdRevenueData(AFh1jSDK aFh1jSDK) {
        int mediationNetwork = this.getMonetizationNetwork.getCurrencyIso4217Code().getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 0);
        return (!this.getMonetizationNetwork.component2().getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT, false) && mediationNetwork == 1) || (mediationNetwork == 1 && !(aFh1jSDK instanceof AFh1kSDK));
    }

    public final AFi1bSDK getMonetizationNetwork(Runnable runnable) {
        return new AFi1bSDK(new o(this, runnable, 3), this.getMonetizationNetwork.getMediationNetwork(), this.getMonetizationNetwork.getCurrencyIso4217Code());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(AFi1bSDK aFi1bSDK, Runnable runnable) {
        AFc1oSDK aFc1oSDKComponent2 = this.getMonetizationNetwork.component2();
        int mediationNetwork = this.getMonetizationNetwork.getCurrencyIso4217Code().getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 0);
        boolean mediationNetwork2 = aFc1oSDKComponent2.getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT, false);
        boolean z5 = aFi1bSDK.areAllFieldsValid == AFj1qSDK.AFa1vSDK.NOT_STARTED;
        if (mediationNetwork == 1) {
            if (z5 || mediationNetwork2) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(Runnable runnable) {
        AFj1wSDK aFj1wSDK = new AFj1wSDK(this.getMonetizationNetwork.getCurrencyIso4217Code(), this.getMonetizationNetwork.getMediationNetwork(), AFj1xSDK.FACEBOOK_LITE, runnable, new bc.a(1));
        this.getCurrencyIso4217Code.add(aFj1wSDK);
        aFj1wSDK.getCurrencyIso4217Code(this.getMonetizationNetwork.registerClient().getRevenue);
    }

    public final boolean getMediationNetwork() {
        return this.getMonetizationNetwork.getCurrencyIso4217Code().getRevenue("AF_PREINSTALL_DISABLED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getRevenue(Runnable runnable) {
        try {
            if (AFAdRevenueData(new AFh1kSDK())) {
                runnable.run();
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
        }
    }

    public final Runnable getRevenue(AFi1bSDK aFi1bSDK, Runnable runnable) {
        return new ac.a(this, aFi1bSDK, runnable, 6);
    }

    public final boolean getRevenue() {
        Iterator<AFj1qSDK> it = this.getCurrencyIso4217Code.iterator();
        while (it.hasNext()) {
            if (it.next().areAllFieldsValid == AFj1qSDK.AFa1vSDK.STARTED) {
                return false;
            }
        }
        return true;
    }
}
