package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import com.appsflyer.internal.AFa1uSDK;

/* JADX INFO: loaded from: classes.dex */
public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        if (intent == null) {
            return;
        }
        try {
            stringExtra = intent.getStringExtra("referrer");
        } catch (Throwable th2) {
            AFLogger.afErrorLog("error in BroadcastReceiver ", th2);
            stringExtra = null;
        }
        if (stringExtra != null && AFa1uSDK.d_(context).getString("referrer", null) != null) {
            AFa1uSDK.getMonetizationNetwork().getMonetizationNetwork(context, stringExtra);
            return;
        }
        AFLogger.afInfoLog("MultipleInstallBroadcastReceiver called");
        AFa1uSDK monetizationNetwork = AFa1uSDK.getMonetizationNetwork();
        AFa1uSDK.getRevenue(new Object[]{monetizationNetwork, context, intent}, -1666869813, 1666869820, System.identityHashCode(monetizationNetwork));
        for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0)) {
            String action = intent.getAction();
            if (((PackageItemInfo) resolveInfo.activityInfo).packageName.equals(context.getPackageName()) && "com.android.vending.INSTALL_REFERRER".equals(action) && !getClass().getName().equals(((PackageItemInfo) resolveInfo.activityInfo).name)) {
                StringBuilder sb2 = new StringBuilder("trigger onReceive: class: ");
                sb2.append(((PackageItemInfo) resolveInfo.activityInfo).name);
                AFLogger.afInfoLog(sb2.toString());
                try {
                    ((BroadcastReceiver) Class.forName(((PackageItemInfo) resolveInfo.activityInfo).name).newInstance()).onReceive(context, intent);
                } catch (Throwable th3) {
                    StringBuilder sb3 = new StringBuilder("error in BroadcastReceiver ");
                    sb3.append(((PackageItemInfo) resolveInfo.activityInfo).name);
                    AFLogger.afErrorLog(sb3.toString(), th3);
                }
            }
        }
    }
}
