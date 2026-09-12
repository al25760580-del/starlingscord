package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1lSDK extends AFi1cSDK {
    private final AFc1bSDK getMediationNetwork;

    public AFj1lSDK(Runnable runnable, AFc1bSDK aFc1bSDK) {
        super("store", "samsung", runnable);
        this.getMediationNetwork = aFc1bSDK;
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getCurrencyIso4217Code(Context context) {
        AFb1vSDK<Map<String, Object>> aFb1vSDK = new AFb1vSDK<Map<String, Object>>(context, this.getMediationNetwork.getMediationNetwork(), "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFj1lSDK.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.appsflyer.internal.AFb1vSDK
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> getCurrencyIso4217Code() {
                String string;
                Cursor cursorQuery = null;
                try {
                    try {
                        ContentResolver contentResolver = this.getCurrencyIso4217Code.getContentResolver();
                        StringBuilder sb2 = new StringBuilder("content://");
                        sb2.append(this.getRevenue);
                        cursorQuery = contentResolver.query(Uri.parse(sb2.toString()), null, null, null, null);
                        if (cursorQuery == null) {
                            AFj1lSDK.this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
                        } else if (cursorQuery.moveToFirst()) {
                            AFj1lSDK.this.AFAdRevenueData.put("response", "OK");
                            E_("referrer", AFj1lSDK.this.AFAdRevenueData, cursorQuery);
                            D_("click_ts", AFj1lSDK.this.AFAdRevenueData, cursorQuery);
                            D_("install_begin_ts", AFj1lSDK.this.AFAdRevenueData, cursorQuery);
                            D_("install_end_ts", AFj1lSDK.this.AFAdRevenueData, cursorQuery);
                            E_("organic_keywords", AFj1lSDK.this.AFAdRevenueData, cursorQuery);
                            E_("attr_type", AFj1lSDK.this.AFAdRevenueData, cursorQuery);
                            HashMap map = new HashMap();
                            int columnIndex = cursorQuery.getColumnIndex("instant");
                            if (columnIndex != -1 && (string = cursorQuery.getString(columnIndex)) != null) {
                                map.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                            }
                            D_("click_server_ts", map, cursorQuery);
                            D_("install_begin_server_ts", map, cursorQuery);
                            E_("install_version", map, cursorQuery);
                            if (!map.isEmpty()) {
                                AFj1lSDK.this.AFAdRevenueData.put("custom", map);
                            }
                        } else {
                            AFj1lSDK.this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e10) {
                        AFj1lSDK.this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e10.getMessage(), e10, false, true);
                        if (0 != 0) {
                        }
                    }
                    String str = ((PackageItemInfo) this.getCurrencyIso4217Code.getPackageManager().resolveContentProvider(this.getRevenue, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)).packageName;
                    AFj1lSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1iSDK.getCurrencyIso4217Code(this.getCurrencyIso4217Code, str)));
                    AFj1lSDK.this.AFAdRevenueData.put("api_ver_name", AFj1iSDK.getRevenue(this.getCurrencyIso4217Code, str));
                    AFj1lSDK.this.getMonetizationNetwork();
                    return AFj1lSDK.this.AFAdRevenueData;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            }

            private static void D_(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j = cursor.getLong(columnIndex);
                if (j == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j));
            }

            private static void E_(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        };
        AFc1oSDK aFc1oSDKComponent2 = this.getMediationNetwork.component2();
        AFa1uSDK.getMonetizationNetwork();
        if (AFa1uSDK.getMonetizationNetwork(aFc1oSDKComponent2, false) > 0 || !aFb1vSDK.getMediationNetwork()) {
            return;
        }
        aFb1vSDK.getMediationNetwork.execute(aFb1vSDK.getMonetizationNetwork);
        this.component1 = System.currentTimeMillis();
        this.areAllFieldsValid = AFj1qSDK.AFa1vSDK.STARTED;
        addObserver(new AFj1qSDK.AnonymousClass1());
    }
}
