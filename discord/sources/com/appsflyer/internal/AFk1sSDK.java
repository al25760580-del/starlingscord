package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1sSDK {
    public final WeakReference<Context> AFAdRevenueData;
    public String getMonetizationNetwork;

    public AFk1sSDK(@NonNull Context context) {
        this.AFAdRevenueData = new WeakReference<>(context);
    }
}
