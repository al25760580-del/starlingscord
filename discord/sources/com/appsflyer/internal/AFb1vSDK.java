package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFb1vSDK<T> {
    private final String[] AFAdRevenueData;
    public final Context getCurrencyIso4217Code;
    public final Executor getMediationNetwork;
    public final FutureTask<T> getMonetizationNetwork = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFb1vSDK.1
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFb1vSDK.this.getMediationNetwork()) {
                return (T) AFb1vSDK.this.getCurrencyIso4217Code();
            }
            return null;
        }
    });
    public final String getRevenue;

    public AFb1vSDK(Context context, Executor executor, String str, String... strArr) {
        this.getCurrencyIso4217Code = context;
        this.getRevenue = str;
        this.AFAdRevenueData = strArr;
        this.getMediationNetwork = executor;
    }

    public abstract T getCurrencyIso4217Code();

    public final boolean getMediationNetwork() {
        try {
            ProviderInfo providerInfoResolveContentProvider = this.getCurrencyIso4217Code.getPackageManager().resolveContentProvider(this.getRevenue, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            return providerInfoResolveContentProvider != null && Arrays.asList(this.AFAdRevenueData).contains(AFj1iSDK.N_(this.getCurrencyIso4217Code.getPackageManager(), ((PackageItemInfo) providerInfoResolveContentProvider).packageName));
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10, false, true);
            return false;
        }
    }

    public T getRevenue() {
        try {
            return this.getMonetizationNetwork.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (TimeoutException e12) {
            AFLogger.afErrorLog(e12.getMessage(), e12, false, false);
            return null;
        }
    }
}
