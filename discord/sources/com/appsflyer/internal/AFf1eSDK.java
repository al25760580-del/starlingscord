package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.lvl.AppsFlyerLVL;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1eSDK {

    public interface AFa1tSDK {
        void AFAdRevenueData(String str, Exception exc);

        void AFAdRevenueData(@NonNull String str, @NonNull String str2);
    }

    public final boolean AFAdRevenueData(long j, @NonNull Context context, @NonNull final AFa1tSDK aFa1tSDK) {
        try {
            AppsFlyerLVL.checkLicense(j, context, new AppsFlyerLVL.resultListener() { // from class: com.appsflyer.internal.AFf1eSDK.1
                public final void onLvlFailure(Exception exc) {
                    aFa1tSDK.AFAdRevenueData("onLvlFailure with exception", exc);
                }

                public final void onLvlResult(String str, String str2) {
                    if (str != null && str2 != null) {
                        aFa1tSDK.AFAdRevenueData(str, str2);
                    } else if (str2 == null) {
                        aFa1tSDK.AFAdRevenueData("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                    } else {
                        aFa1tSDK.AFAdRevenueData("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                    }
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
