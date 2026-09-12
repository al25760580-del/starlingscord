package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1xSDK {

    public interface AFa1ySDK {
        void onConfigurationChanged(boolean z5);
    }

    void getCurrencyIso4217Code();

    void getMediationNetwork(AFa1ySDK aFa1ySDK);

    void getRevenue();

    void getRevenue(@NonNull Throwable th2, @NonNull String str);
}
