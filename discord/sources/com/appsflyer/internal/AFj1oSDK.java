package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1oSDK implements AFj1pSDK {
    private static final BitSet component2;
    final Runnable AFAdRevenueData;
    private final Map<AFj1nSDK, AFj1nSDK> areAllFieldsValid;
    private final ExecutorService component1;
    private final Map<AFj1nSDK, Map<String, Object>> component3;
    private final SensorManager component4;
    private final Runnable equals;
    final Runnable getCurrencyIso4217Code;
    final Object getMediationNetwork;
    final Handler getMonetizationNetwork;
    boolean getRevenue;
    private boolean toString;

    static {
        BitSet bitSet = new BitSet(6);
        component2 = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private AFj1oSDK(@NonNull SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.getMediationNetwork = new Object();
        BitSet bitSet = component2;
        this.areAllFieldsValid = new HashMap(bitSet.size());
        this.component3 = new ConcurrentHashMap(bitSet.size());
        this.AFAdRevenueData = new Runnable() { // from class: com.appsflyer.internal.AFj1oSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1oSDK.this.getMediationNetwork) {
                    AFj1oSDK.this.getRevenue();
                    AFj1oSDK aFj1oSDK = AFj1oSDK.this;
                    aFj1oSDK.getMonetizationNetwork.postDelayed(aFj1oSDK.getCurrencyIso4217Code, 150L);
                    AFj1oSDK.this.getRevenue = true;
                }
            }
        };
        this.getCurrencyIso4217Code = new n(this, 0);
        this.equals = new Runnable() { // from class: com.appsflyer.internal.AFj1oSDK.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1oSDK.this.getMediationNetwork) {
                    try {
                        AFj1oSDK aFj1oSDK = AFj1oSDK.this;
                        if (aFj1oSDK.getRevenue) {
                            aFj1oSDK.getMonetizationNetwork.removeCallbacks(aFj1oSDK.AFAdRevenueData);
                            AFj1oSDK aFj1oSDK2 = AFj1oSDK.this;
                            aFj1oSDK2.getMonetizationNetwork.removeCallbacks(aFj1oSDK2.getCurrencyIso4217Code);
                            AFj1oSDK.this.getCurrencyIso4217Code();
                            AFj1oSDK.this.getRevenue = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
        this.component4 = sensorManager;
        this.getMonetizationNetwork = handler;
        this.component1 = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void areAllFieldsValid() {
        synchronized (this.getMediationNetwork) {
            this.getMonetizationNetwork.post(new n(this, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component1() {
        try {
            if (!this.areAllFieldsValid.isEmpty()) {
                for (AFj1nSDK aFj1nSDK : this.areAllFieldsValid.values()) {
                    this.component4.unregisterListener(aFj1nSDK);
                    aFj1nSDK.getCurrencyIso4217Code(this.component3, true);
                }
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th2);
        }
        this.toString = false;
    }

    @NonNull
    private List<Map<String, Object>> component2() {
        synchronized (this.getMediationNetwork) {
            try {
                if (!this.areAllFieldsValid.isEmpty() && this.toString) {
                    Iterator<AFj1nSDK> it = this.areAllFieldsValid.values().iterator();
                    while (it.hasNext()) {
                        it.next().getCurrencyIso4217Code(this.component3, false);
                    }
                }
                if (this.component3.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.component3.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component3() {
        try {
            for (Sensor sensor : this.component4.getSensorList(-1)) {
                if (getMonetizationNetwork(sensor.getType())) {
                    AFj1nSDK aFj1nSDK = new AFj1nSDK(sensor, this.component1);
                    if (!this.areAllFieldsValid.containsKey(aFj1nSDK)) {
                        this.areAllFieldsValid.put(aFj1nSDK, aFj1nSDK);
                    }
                    this.component4.registerListener(this.areAllFieldsValid.get(aFj1nSDK), sensor, 1, this.getMonetizationNetwork);
                }
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th2);
        }
        this.toString = true;
    }

    @NonNull
    private List<Map<String, Object>> component4() {
        synchronized (this.getMediationNetwork) {
            try {
                Iterator<AFj1nSDK> it = this.areAllFieldsValid.values().iterator();
                while (it.hasNext()) {
                    it.next().getCurrencyIso4217Code(this.component3, true);
                }
                if (this.component3.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.component3.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean getMonetizationNetwork(int i7) {
        return i7 >= 0 && component2.get(i7);
    }

    @Override // com.appsflyer.internal.AFj1pSDK
    @NonNull
    public final Map<String, Object> AFAdRevenueData() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> listComponent2 = component2();
        if (!listComponent2.isEmpty()) {
            concurrentHashMap.put("sensors", listComponent2);
            return concurrentHashMap;
        }
        List<Map<String, Object>> listComponent4 = component4();
        if (!listComponent4.isEmpty()) {
            concurrentHashMap.put("sensors", listComponent4);
        }
        return concurrentHashMap;
    }

    public final void getCurrencyIso4217Code() {
        this.getMonetizationNetwork.post(new n(this, 1));
    }

    @Override // com.appsflyer.internal.AFj1pSDK
    public final synchronized void getMediationNetwork() {
        this.getMonetizationNetwork.post(this.equals);
    }

    public final void getRevenue() {
        this.getMonetizationNetwork.post(new n(this, 2));
    }

    @Override // com.appsflyer.internal.AFj1pSDK
    public final void getMonetizationNetwork() {
        this.getMonetizationNetwork.post(this.equals);
        this.getMonetizationNetwork.post(this.AFAdRevenueData);
    }

    public AFj1oSDK(@NonNull Context context, ExecutorService executorService) {
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        this(sensorManager, new Handler(handlerThread.getLooper()), executorService);
    }
}
