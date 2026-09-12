package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1dSDK implements AFc1bSDK {
    private static final int getCurrencyIso4217Code = (int) TimeUnit.SECONDS.toMillis(30);
    private ScheduledExecutorService AFAdRevenueData;
    private AFc1uSDK AFInAppEventParameterName;
    private AFj1rSDK AFInAppEventType;
    private AFf1cSDK AFKeystoreWrapper;
    private AFe1ySDK AFLogger;
    private AFh1qSDK AFPurchaseDetails;
    private AFa1rSDK afDebugLog;
    private AFg1vSDK afErrorLog;
    private AFi1kSDK afInfoLog;
    private AFf1gSDK afLogForce;
    private AFi1jSDK afRDLog;
    private AFg1aSDK afVerboseLog;
    private AFe1qSDK afWarnLog;
    private PurchaseHandler areAllFieldsValid;
    private AFc1qSDK component1;
    private AFc1pSDK component2;
    private AFf1lSDK component3;
    private AFd1kSDK component4;
    private AFj1pSDK copy;
    private AFg1rSDK copydefault;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AFi1sSDK f3843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AFj1eSDK f3844e;
    private AFd1mSDK equals;
    private AFa1hSDK force;
    private AFc1eSDK getLevel;
    private ExecutorService getMediationNetwork;
    private ExecutorService getRevenue;
    private AFe1nSDK hashCode;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AFg1sSDK f3845i;
    private AFd1ySDK registerClient;
    private AFh1tSDK toString;
    private AFi1lSDK unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AFa1bSDK f3846v;
    private AFg1xSDK values;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AFb1aSDK f3847w;
    private String afErrorLogForExcManagerOnly = null;
    public final AFc1gSDK getMonetizationNetwork = new AFc1gSDK();

    public static class AFa1ySDK implements ThreadFactory {
        private static final AtomicInteger getRevenue = new AtomicInteger();
        private final AtomicInteger getMediationNetwork = new AtomicInteger();

        public AFa1ySDK() {
            getRevenue.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i7 = getRevenue.get();
            int iIncrementAndGet = this.getMediationNetwork.incrementAndGet();
            StringBuilder sb2 = new StringBuilder("queue-");
            sb2.append(i7);
            sb2.append("-");
            sb2.append(iIncrementAndGet);
            return new Thread(runnable, sb2.toString());
        }
    }

    @NonNull
    private String AFLoggerLogLevel() {
        if (this.afErrorLogForExcManagerOnly == null) {
            this.afErrorLogForExcManagerOnly = new com.appsflyer.internal.AFa1ySDK().getMediationNetwork();
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @NonNull
    private synchronized AFg1xSDK AFPurchaseDetails() {
        try {
            if (this.values == null) {
                this.values = new AFg1xSDK(registerClient(), getCurrencyIso4217Code());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.values;
    }

    @NonNull
    private synchronized AFj1eSDK AFPurchaseType() {
        try {
            if (this.f3844e == null) {
                this.f3844e = new AFj1eSDK(getCurrencyIso4217Code());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f3844e;
    }

    @NonNull
    private synchronized AFd1kSDK afVerboseLog() {
        try {
            if (this.component4 == null) {
                this.component4 = new AFd1kSDK(new AFd1fSDK(getCurrencyIso4217Code), getMediationNetwork());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.component4;
    }

    @NonNull
    private synchronized ScheduledExecutorService getLevel() {
        try {
            if (this.AFAdRevenueData == null) {
                this.AFAdRevenueData = AFc1jSDK.getMediationNetwork();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFAdRevenueData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SharedPreferences o_() {
        Context context = this.getMonetizationNetwork.getRevenue;
        if (context != null) {
            return AFa1uSDK.d_(context);
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @NonNull
    private synchronized ExecutorService valueOf() {
        try {
            if (this.getMediationNetwork == null) {
                this.getMediationNetwork = AFc1jSDK.getCurrencyIso4217Code();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getMediationNetwork;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
    public synchronized AFd1ySDK afWarnLog() {
        try {
            if (this.registerClient == null) {
                this.registerClient = new AFd1ySDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.registerClient;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFe1qSDK AFAdRevenueData() {
        if (this.afWarnLog == null) {
            this.afWarnLog = new AFe1qSDK(component2(), registerClient(), getCurrencyIso4217Code(), getMediationNetwork(), component4(), AFKeystoreWrapper(), copydefault());
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFe1ySDK AFInAppEventParameterName() {
        try {
            if (this.AFLogger == null) {
                this.AFLogger = new AFe1ySDK(getCurrencyIso4217Code(), component2());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFLogger;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFc1uSDK AFInAppEventType() {
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = new AFc1rSDK(registerClient(), component2());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFf1cSDK AFKeystoreWrapper() {
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = new AFf1cSDK(registerClient(), new AFf1eSDK());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFj1rSDK AFLogger() {
        try {
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = new AFj1rSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFb1aSDK afDebugLog() {
        if (this.f3847w == null) {
            ScheduledExecutorService level = getLevel();
            AFa1rSDK aFa1rSDKI = i();
            if (this.afInfoLog == null) {
                this.afInfoLog = new AFi1nSDK();
            }
            this.f3847w = new AFb1cSDK(level, aFa1rSDKI, this.afInfoLog);
        }
        return this.f3847w;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFg1aSDK afErrorLog() {
        if (this.afVerboseLog == null) {
            this.afVerboseLog = new AFh1vSDK(this);
        }
        return this.afVerboseLog;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFa1hSDK afErrorLogForExcManagerOnly() {
        if (this.force == null) {
            this.force = new AFa1lSDK(component2());
        }
        return this.force;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFc1eSDK afInfoLog() {
        if (this.getLevel == null) {
            this.getLevel = new AFc1eSDK();
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFh1qSDK afLogForce() {
        if (AFh1sSDK.getMonetizationNetwork() && this.AFPurchaseDetails == null) {
            this.AFPurchaseDetails = new AFh1oSDK(getCurrencyIso4217Code(), AFLogger());
        }
        return this.AFPurchaseDetails;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFb1bSDK afRDLog() {
        if (this.getLevel == null) {
            this.getLevel = new AFc1eSDK();
        }
        return new AFb1hSDK(this.getLevel, registerClient(), AFKeystoreWrapper());
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized PurchaseHandler areAllFieldsValid() {
        try {
            if (this.areAllFieldsValid == null) {
                this.areAllFieldsValid = new PurchaseHandler(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.areAllFieldsValid;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFf1lSDK component1() {
        try {
            if (this.component3 == null) {
                AFf1iSDK aFf1iSDK = new AFf1iSDK(component2());
                this.component3 = new AFf1lSDK(new AFf1qSDK(), getCurrencyIso4217Code(), AFKeystoreWrapper(), aFf1iSDK, new AFd1lSDK(afVerboseLog(), getCurrencyIso4217Code(), AppsFlyerProperties.getInstance(), AFInAppEventParameterName(), AFPurchaseType()), new AFf1hSDK(getCurrencyIso4217Code(), aFf1iSDK), copydefault());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.component3;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFc1oSDK component2() {
        if (this.component1 == null) {
            this.component1 = new AFc1qSDK(new AFc1hSDK(new e(1, this)));
        }
        return this.component1;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFh1tSDK component3() {
        try {
            if (this.toString == null) {
                this.toString = new AFh1tSDK(component2(), getCurrencyIso4217Code());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.toString;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFg1rSDK component4() {
        if (this.copydefault == null) {
            String strAFLoggerLogLevel = AFLoggerLogLevel();
            Context context = this.getMonetizationNetwork.getRevenue;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.unregisterClient == null) {
                this.unregisterClient = new AFi1gSDK();
            }
            AFi1lSDK aFi1lSDK = this.unregisterClient;
            if (this.f3845i == null) {
                this.f3845i = new AFg1wSDK();
            }
            AFg1sSDK aFg1sSDK = this.f3845i;
            if (this.copy == null) {
                Context context2 = this.getMonetizationNetwork.getRevenue;
                if (context2 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.copy = new AFj1oSDK(context2, valueOf());
            }
            AFj1pSDK aFj1pSDK = this.copy;
            if (this.afErrorLog == null) {
                this.afErrorLog = new AFg1oSDK();
            }
            AFg1vSDK aFg1vSDK = this.afErrorLog;
            AFh1tSDK aFh1tSDKComponent3 = component3();
            AFc1oSDK aFc1oSDKComponent2 = component2();
            AFc1pSDK currencyIso4217Code = getCurrencyIso4217Code();
            if (this.f3843d == null) {
                Context context3 = this.getMonetizationNetwork.getRevenue;
                if (context3 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.f3843d = new AFi1sSDK(context3);
            }
            AFi1sSDK aFi1sSDK = this.f3843d;
            AFf1cSDK aFf1cSDKAFKeystoreWrapper = AFKeystoreWrapper();
            AFc1gSDK aFc1gSDKRegisterClient = registerClient();
            AFg1xSDK aFg1xSDKAFPurchaseDetails = AFPurchaseDetails();
            if (this.getLevel == null) {
                this.getLevel = new AFc1eSDK();
            }
            this.copydefault = new AFg1qSDK(strAFLoggerLogLevel, context, aFi1lSDK, aFg1sSDK, aFj1pSDK, aFg1vSDK, aFh1tSDKComponent3, aFc1oSDKComponent2, currencyIso4217Code, aFi1sSDK, aFf1cSDKAFKeystoreWrapper, aFc1gSDKRegisterClient, aFg1xSDKAFPurchaseDetails, this.getLevel);
        }
        return this.copydefault;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFj1pSDK copy() {
        if (this.copy == null) {
            Context context = this.getMonetizationNetwork.getRevenue;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.copy = new AFj1oSDK(context, valueOf());
        }
        return this.copy;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFe1nSDK copydefault() {
        try {
            if (this.hashCode == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFc1dSDK.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1ySDK());
                threadPoolExecutor.setRejectedExecutionHandler(new i());
                this.hashCode = new AFe1nSDK(threadPoolExecutor);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.hashCode;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFi1kSDK d() {
        if (this.afInfoLog == null) {
            this.afInfoLog = new AFi1nSDK();
        }
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFi1lSDK e() {
        if (this.unregisterClient == null) {
            this.unregisterClient = new AFi1gSDK();
        }
        return this.unregisterClient;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFd1mSDK equals() {
        try {
            if (this.equals == null) {
                this.equals = new AFd1nSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.equals;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFf1gSDK force() {
        if (this.afLogForce == null) {
            Context context = this.getMonetizationNetwork.getRevenue;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            AFg1zSDK aFg1zSDK = new AFg1zSDK(context, AppsFlyerProperties.getInstance());
            if (this.getLevel == null) {
                this.getLevel = new AFc1eSDK();
            }
            this.afLogForce = new AFf1fSDK(aFg1zSDK, this.getLevel, AppsFlyerProperties.getInstance());
        }
        return this.afLogForce;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFc1pSDK getCurrencyIso4217Code() {
        try {
            if (this.component2 == null) {
                AFc1gSDK aFc1gSDKRegisterClient = registerClient();
                AFc1oSDK aFc1oSDKComponent2 = component2();
                if (this.getLevel == null) {
                    this.getLevel = new AFc1eSDK();
                }
                this.component2 = new AFc1pSDK(aFc1gSDKRegisterClient, aFc1oSDKComponent2, this.getLevel, getMediationNetwork());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.component2;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized ExecutorService getMediationNetwork() {
        try {
            if (this.getRevenue == null) {
                this.getRevenue = AFc1jSDK.AFAdRevenueData();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized ScheduledExecutorService getMonetizationNetwork() {
        try {
            if (this.AFAdRevenueData == null) {
                this.AFAdRevenueData = AFc1jSDK.getMonetizationNetwork();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFd1lSDK getRevenue() {
        return new AFd1lSDK(afVerboseLog(), getCurrencyIso4217Code(), AppsFlyerProperties.getInstance(), AFInAppEventParameterName(), AFPurchaseType());
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFa1rSDK i() {
        try {
            if (this.afDebugLog == null) {
                this.afDebugLog = new AFa1rSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFc1gSDK registerClient() {
        return this.getMonetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFa1bSDK unregisterClient() {
        try {
            if (this.f3846v == null) {
                this.f3846v = new AFa1aSDK(registerClient());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f3846v;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFi1jSDK v() {
        try {
            if (this.afRDLog == null) {
                try {
                    Object[] objArr = {getCurrencyIso4217Code(), registerClient(), AFKeystoreWrapper()};
                    Map map = AFi1hSDK.f3858d;
                    Object declaredConstructor = map.get(-737518627);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFi1hSDK.getCurrencyIso4217Code((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 36 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0))).getDeclaredConstructor(AFc1pSDK.class, AFc1gSDK.class, AFf1cSDK.class);
                        map.put(-737518627, declaredConstructor);
                    }
                    this.afRDLog = (AFi1jSDK) ((Constructor) declaredConstructor).newInstance(objArr);
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFg1cSDK.PLAY_INTEGRITY_API, th3.getMessage() != null ? th3.getMessage() : "", th3, false, false);
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFi1sSDK w() {
        if (this.f3843d == null) {
            Context context = this.getMonetizationNetwork.getRevenue;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.f3843d = new AFi1sSDK(context);
        }
        return this.f3843d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getCurrencyIso4217Code(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e10) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e10);
            Thread.currentThread().interrupt();
        }
    }
}
