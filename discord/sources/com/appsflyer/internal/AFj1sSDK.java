package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1sSDK extends AFj1qSDK {
    private final AFc1bSDK getMediationNetwork;
    final ProviderInfo getRevenue;

    public AFj1sSDK(ProviderInfo providerInfo, Runnable runnable, AFc1bSDK aFc1bSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getMediationNetwork = aFc1bSDK;
        this.getRevenue = providerInfo;
    }

    public static ContentProviderClient B_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e10, false, true, false);
            return null;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th2, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getCurrencyIso4217Code(final Context context) {
        this.getMediationNetwork.getMediationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK.5
            @Override // java.lang.Runnable
            public final void run() {
                Cursor cursorQuery;
                AFj1sSDK aFj1sSDK = AFj1sSDK.this;
                aFj1sSDK.component1 = System.currentTimeMillis();
                aFj1sSDK.areAllFieldsValid = AFj1qSDK.AFa1vSDK.STARTED;
                aFj1sSDK.addObserver(new AFj1qSDK.AnonymousClass1());
                StringBuilder sb2 = new StringBuilder("content://");
                sb2.append(AFj1sSDK.this.getRevenue.authority);
                sb2.append("/transaction_id");
                Uri uri = Uri.parse(sb2.toString());
                ContentProviderClient contentProviderClientB_ = AFj1sSDK.B_(context, uri);
                try {
                    if (contentProviderClientB_ != null) {
                        StringBuilder sb3 = new StringBuilder("app_id=");
                        sb3.append(context.getPackageName());
                        cursorQuery = contentProviderClientB_.query(uri, null, sb3.toString(), null, null);
                    } else {
                        cursorQuery = null;
                    }
                } catch (RemoteException e10) {
                    AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to query unstable content providerClient", e10, false, true, false);
                    cursorQuery = null;
                } catch (DeadObjectException e11) {
                    AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e11, false, true, false);
                    cursorQuery = null;
                } catch (Throwable th2) {
                    AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Error to get data from providerClient ", th2, false, true, false);
                    cursorQuery = null;
                } finally {
                    contentProviderClientB_.close();
                }
                if (cursorQuery != null) {
                    int columnIndex = cursorQuery.getColumnIndex("transaction_id");
                    if (columnIndex == -1) {
                        AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "Wrong column name");
                        AFj1sSDK.this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                    } else {
                        AFj1sSDK.this.AFAdRevenueData.put("response", "OK");
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(columnIndex);
                            cursorQuery.close();
                            if (string != null && !string.isEmpty()) {
                                AFj1sSDK.this.AFAdRevenueData.put("referrer", string);
                            }
                        }
                    }
                    cursorQuery.close();
                } else {
                    AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                    AFj1sSDK.this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
                }
                AFj1sSDK aFj1sSDK2 = AFj1sSDK.this;
                aFj1sSDK2.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1iSDK.getCurrencyIso4217Code(context, ((PackageItemInfo) aFj1sSDK2.getRevenue).packageName)));
                AFj1sSDK aFj1sSDK3 = AFj1sSDK.this;
                aFj1sSDK3.AFAdRevenueData.put("api_ver_name", AFj1iSDK.getRevenue(context, ((PackageItemInfo) aFj1sSDK3.getRevenue).packageName));
                AFj1sSDK.this.getMonetizationNetwork();
            }
        });
    }
}
