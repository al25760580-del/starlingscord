package com.appsflyer.internal;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFi1kSDK {
    @NotNull
    String getCurrencyIso4217Code(Activity activity);

    String getMediationNetwork(Activity activity);

    void getMonetizationNetwork(@NotNull Activity activity);
}
