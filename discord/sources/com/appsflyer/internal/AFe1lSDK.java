package com.appsflyer.internal;

import android.net.TrafficStats;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFe1lSDK<Result> implements Comparable<AFe1lSDK<?>>, Callable<AFe1uSDK> {
    private static final AtomicInteger component4 = new AtomicInteger();
    public AFe1uSDK AFAdRevenueData;
    private final int areAllFieldsValid;
    private final String component1;
    private long component2;
    private Throwable component3;

    @NonNull
    public final AFe1mSDK getCurrencyIso4217Code;

    @NonNull
    public final Set<AFe1mSDK> getMediationNetwork;
    public volatile int getMonetizationNetwork;

    @NonNull
    public final Set<AFe1mSDK> getRevenue;
    private boolean toString;

    public AFe1lSDK(@NonNull AFe1mSDK aFe1mSDK, @NonNull AFe1mSDK[] aFe1mSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.getMediationNetwork = hashSet;
        this.getRevenue = new HashSet();
        int iIncrementAndGet = component4.incrementAndGet();
        this.areAllFieldsValid = iIncrementAndGet;
        this.toString = false;
        this.getMonetizationNetwork = 0;
        this.getCurrencyIso4217Code = aFe1mSDK;
        Collections.addAll(hashSet, aFe1mSDKArr);
        if (str != null) {
            this.component1 = str;
        } else {
            this.component1 = String.valueOf(iIncrementAndGet);
        }
    }

    public abstract boolean AFAdRevenueData();

    public final Throwable component1() {
        return this.component3;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: component3, reason: merged with bridge method [inline-methods] */
    public final AFe1uSDK call() {
        TrafficStats.setThreadStatsTag(82339054);
        this.AFAdRevenueData = null;
        this.component3 = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.getMonetizationNetwork++;
        try {
            AFe1uSDK mediationNetwork = getMediationNetwork();
            this.AFAdRevenueData = mediationNetwork;
            this.component2 = System.currentTimeMillis() - jCurrentTimeMillis;
            getRevenue();
            return mediationNetwork;
        } catch (Throwable th2) {
            try {
                this.component3 = th2;
                this.AFAdRevenueData = AFe1uSDK.FAILURE;
                getMediationNetwork(th2);
                throw th2;
            } catch (Throwable th3) {
                this.component2 = System.currentTimeMillis() - jCurrentTimeMillis;
                getRevenue();
                throw th3;
            }
        }
    }

    public final boolean component4() {
        return this.toString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1lSDK aFe1lSDK = (AFe1lSDK) obj;
        if (this.getCurrencyIso4217Code != aFe1lSDK.getCurrencyIso4217Code) {
            return false;
        }
        return this.component1.equals(aFe1lSDK.component1);
    }

    public abstract long getCurrencyIso4217Code();

    @NonNull
    public abstract AFe1uSDK getMediationNetwork();

    public void getMediationNetwork(Throwable th2) {
    }

    public void getMonetizationNetwork() {
        this.toString = true;
    }

    public void getRevenue() {
    }

    public final int hashCode() {
        return this.component1.hashCode() + (this.getCurrencyIso4217Code.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.getCurrencyIso4217Code);
        sb2.append("-");
        sb2.append(this.component1);
        String string = sb2.toString();
        if (String.valueOf(this.areAllFieldsValid).equals(this.component1)) {
            return string;
        }
        StringBuilder sbO = kk.b.o(string, "-");
        sbO.append(this.areAllFieldsValid);
        return sbO.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1lSDK<?> aFe1lSDK) {
        int i7 = this.getCurrencyIso4217Code.unregisterClient - aFe1lSDK.getCurrencyIso4217Code.unregisterClient;
        if (i7 != 0) {
            return i7;
        }
        if (this.component1.equals(aFe1lSDK.component1)) {
            return 0;
        }
        return this.areAllFieldsValid - aFe1lSDK.areAllFieldsValid;
    }
}
