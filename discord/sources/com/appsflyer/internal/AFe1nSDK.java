package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1nSDK {
    final ExecutorService getCurrencyIso4217Code;
    public Executor AFAdRevenueData = Executors.newSingleThreadExecutor();
    final Timer getMediationNetwork = new Timer(true);
    public final List<AFe1sSDK> getMonetizationNetwork = new CopyOnWriteArrayList();
    final Set<AFe1mSDK> getRevenue = new CopyOnWriteArraySet();
    final Set<AFe1mSDK> areAllFieldsValid = Collections.newSetFromMap(new ConcurrentHashMap());
    final NavigableSet<AFe1lSDK<?>> component2 = new ConcurrentSkipListSet();
    final NavigableSet<AFe1lSDK<?>> component4 = new ConcurrentSkipListSet();
    final List<AFe1lSDK<?>> component1 = new ArrayList();
    final Set<AFe1lSDK<?>> component3 = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1nSDK$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        private /* synthetic */ AFe1lSDK getRevenue;

        public AnonymousClass3(AFe1lSDK aFe1lSDK) {
            this.getRevenue = aFe1lSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zAdd;
            synchronized (AFe1nSDK.this.component2) {
                try {
                    if (AFe1nSDK.this.component3.contains(this.getRevenue)) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                        StringBuilder sb2 = new StringBuilder("tried to add already running task: ");
                        sb2.append(this.getRevenue);
                        aFLogger.d(aFg1cSDK, sb2.toString());
                        return;
                    }
                    if (!AFe1nSDK.this.component2.contains(this.getRevenue) && !AFe1nSDK.this.component4.contains(this.getRevenue)) {
                        AFe1nSDK aFe1nSDK = AFe1nSDK.this;
                        AFe1lSDK aFe1lSDK = this.getRevenue;
                        for (AFe1mSDK aFe1mSDK : aFe1lSDK.getRevenue) {
                            if (aFe1nSDK.areAllFieldsValid.contains(aFe1mSDK)) {
                                aFe1lSDK.getMediationNetwork.add(aFe1mSDK);
                            }
                        }
                        if (AFe1nSDK.this.getCurrencyIso4217Code(this.getRevenue)) {
                            zAdd = AFe1nSDK.this.component2.add(this.getRevenue);
                        } else {
                            zAdd = AFe1nSDK.this.component4.add(this.getRevenue);
                            if (zAdd) {
                                AFLogger aFLogger2 = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK2 = AFg1cSDK.QUEUE;
                                StringBuilder sb3 = new StringBuilder("new task was blocked: ");
                                sb3.append(this.getRevenue);
                                aFLogger2.d(aFg1cSDK2, sb3.toString());
                                this.getRevenue.getMonetizationNetwork();
                            }
                        }
                        if (zAdd) {
                            AFe1nSDK aFe1nSDK2 = AFe1nSDK.this;
                            aFe1nSDK2.component2.addAll(aFe1nSDK2.component1);
                            AFe1nSDK.this.component1.clear();
                        } else {
                            AFLogger aFLogger3 = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK3 = AFg1cSDK.QUEUE;
                            StringBuilder sb4 = new StringBuilder("task not added, it's already in the queue: ");
                            sb4.append(this.getRevenue);
                            aFLogger3.d(aFg1cSDK3, sb4.toString());
                        }
                        if (!zAdd) {
                            AFLogger aFLogger4 = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK4 = AFg1cSDK.QUEUE;
                            StringBuilder sb5 = new StringBuilder("QUEUE: tried to add already pending task: ");
                            sb5.append(this.getRevenue);
                            aFLogger4.w(aFg1cSDK4, sb5.toString());
                            return;
                        }
                        AFe1nSDK.this.areAllFieldsValid.add(this.getRevenue.getCurrencyIso4217Code);
                        AFLogger aFLogger5 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK5 = AFg1cSDK.QUEUE;
                        StringBuilder sb6 = new StringBuilder("new task added: ");
                        sb6.append(this.getRevenue);
                        aFLogger5.d(aFg1cSDK5, sb6.toString());
                        for (AFe1sSDK aFe1sSDK : AFe1nSDK.this.getMonetizationNetwork) {
                        }
                        AFe1nSDK aFe1nSDK3 = AFe1nSDK.this;
                        aFe1nSDK3.getCurrencyIso4217Code.submit(aFe1nSDK3.new AnonymousClass4());
                        AFe1nSDK aFe1nSDK4 = AFe1nSDK.this;
                        synchronized (aFe1nSDK4.component2) {
                            try {
                                for (int size = (aFe1nSDK4.component2.size() + aFe1nSDK4.component4.size()) - 40; size > 0; size--) {
                                    boolean zIsEmpty = aFe1nSDK4.component4.isEmpty();
                                    boolean zIsEmpty2 = aFe1nSDK4.component2.isEmpty();
                                    if (zIsEmpty2 || zIsEmpty) {
                                        if (!zIsEmpty2) {
                                            aFe1nSDK4.getMediationNetwork(aFe1nSDK4.component2);
                                        } else if (!zIsEmpty) {
                                            aFe1nSDK4.getMediationNetwork(aFe1nSDK4.component4);
                                        }
                                    } else if (aFe1nSDK4.component2.first().compareTo(aFe1nSDK4.component4.first()) > 0) {
                                        aFe1nSDK4.getMediationNetwork(aFe1nSDK4.component2);
                                    } else {
                                        aFe1nSDK4.getMediationNetwork(aFe1nSDK4.component4);
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return;
                    }
                    AFLogger aFLogger6 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK6 = AFg1cSDK.QUEUE;
                    StringBuilder sb7 = new StringBuilder("tried to add already scheduled task: ");
                    sb7.append(this.getRevenue);
                    aFLogger6.d(aFg1cSDK6, sb7.toString());
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1nSDK$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFe1nSDK.this.component2) {
                try {
                    final AFe1lSDK<?> aFe1lSDKPollFirst = AFe1nSDK.this.component2.pollFirst();
                    if (aFe1lSDKPollFirst == null) {
                        return;
                    }
                    AFe1nSDK.this.component3.add(aFe1lSDKPollFirst);
                    long currencyIso4217Code = aFe1lSDKPollFirst.getCurrencyIso4217Code();
                    AFe1oSDK aFe1oSDK = new AFe1oSDK(Thread.currentThread());
                    if (currencyIso4217Code > 0) {
                        AFe1nSDK.this.getMediationNetwork.schedule(aFe1oSDK, currencyIso4217Code);
                    }
                    final AFe1nSDK aFe1nSDK = AFe1nSDK.this;
                    aFe1nSDK.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1nSDK.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            for (AFe1sSDK aFe1sSDK : AFe1nSDK.this.getMonetizationNetwork) {
                            }
                        }
                    });
                    if (!AFe1nSDK.this.component2.isEmpty()) {
                        AFe1nSDK aFe1nSDK2 = AFe1nSDK.this;
                        aFe1nSDK2.getCurrencyIso4217Code.submit(aFe1nSDK2.new AnonymousClass4());
                    }
                    try {
                        AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, "starting task execution: ".concat(String.valueOf(aFe1lSDKPollFirst)));
                        final AFe1uSDK aFe1uSDKCall = aFe1lSDKPollFirst.call();
                        aFe1oSDK.cancel();
                        final AFe1nSDK aFe1nSDK3 = AFe1nSDK.this;
                        aFe1nSDK3.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1nSDK.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                                StringBuilder sb2 = new StringBuilder("execution finished for ");
                                sb2.append(aFe1lSDKPollFirst);
                                sb2.append(", result: ");
                                sb2.append(aFe1uSDKCall);
                                aFLogger.d(aFg1cSDK, sb2.toString());
                                AFe1nSDK.this.component3.remove(aFe1lSDKPollFirst);
                                Iterator<AFe1sSDK> it = AFe1nSDK.this.getMonetizationNetwork.iterator();
                                while (it.hasNext()) {
                                    it.next().getMonetizationNetwork(aFe1lSDKPollFirst, aFe1uSDKCall);
                                }
                                if (aFe1uSDKCall == AFe1uSDK.SUCCESS) {
                                    AFe1nSDK.this.getRevenue.add(aFe1lSDKPollFirst.getCurrencyIso4217Code);
                                    AFe1nSDK.this.getMonetizationNetwork();
                                    return;
                                }
                                if (!aFe1lSDKPollFirst.AFAdRevenueData()) {
                                    AFe1nSDK.this.getRevenue.add(aFe1lSDKPollFirst.getCurrencyIso4217Code);
                                    AFe1nSDK.this.getMonetizationNetwork();
                                } else if (AFe1nSDK.getRevenue(aFe1lSDKPollFirst)) {
                                    synchronized (AFe1nSDK.this.component2) {
                                        try {
                                            AFe1nSDK.this.component1.add(aFe1lSDKPollFirst);
                                            for (AFe1sSDK aFe1sSDK : AFe1nSDK.this.getMonetizationNetwork) {
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            }
                        });
                    } catch (InterruptedIOException | InterruptedException unused) {
                        AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(aFe1lSDKPollFirst)));
                        final AFe1uSDK aFe1uSDK = AFe1uSDK.TIMEOUT;
                        aFe1lSDKPollFirst.AFAdRevenueData = aFe1uSDK;
                        final AFe1nSDK aFe1nSDK4 = AFe1nSDK.this;
                        aFe1nSDK4.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1nSDK.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                                StringBuilder sb2 = new StringBuilder("execution finished for ");
                                sb2.append(aFe1lSDKPollFirst);
                                sb2.append(", result: ");
                                sb2.append(aFe1uSDK);
                                aFLogger.d(aFg1cSDK, sb2.toString());
                                AFe1nSDK.this.component3.remove(aFe1lSDKPollFirst);
                                Iterator<AFe1sSDK> it = AFe1nSDK.this.getMonetizationNetwork.iterator();
                                while (it.hasNext()) {
                                    it.next().getMonetizationNetwork(aFe1lSDKPollFirst, aFe1uSDK);
                                }
                                if (aFe1uSDK == AFe1uSDK.SUCCESS) {
                                    AFe1nSDK.this.getRevenue.add(aFe1lSDKPollFirst.getCurrencyIso4217Code);
                                    AFe1nSDK.this.getMonetizationNetwork();
                                    return;
                                }
                                if (!aFe1lSDKPollFirst.AFAdRevenueData()) {
                                    AFe1nSDK.this.getRevenue.add(aFe1lSDKPollFirst.getCurrencyIso4217Code);
                                    AFe1nSDK.this.getMonetizationNetwork();
                                } else if (AFe1nSDK.getRevenue(aFe1lSDKPollFirst)) {
                                    synchronized (AFe1nSDK.this.component2) {
                                        try {
                                            AFe1nSDK.this.component1.add(aFe1lSDKPollFirst);
                                            for (AFe1sSDK aFe1sSDK : AFe1nSDK.this.getMonetizationNetwork) {
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            }
                        });
                    } catch (Throwable unused2) {
                        aFe1oSDK.cancel();
                        final AFe1nSDK aFe1nSDK5 = AFe1nSDK.this;
                        final AFe1uSDK aFe1uSDK2 = AFe1uSDK.FAILURE;
                        aFe1nSDK5.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1nSDK.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                                StringBuilder sb2 = new StringBuilder("execution finished for ");
                                sb2.append(aFe1lSDKPollFirst);
                                sb2.append(", result: ");
                                sb2.append(aFe1uSDK2);
                                aFLogger.d(aFg1cSDK, sb2.toString());
                                AFe1nSDK.this.component3.remove(aFe1lSDKPollFirst);
                                Iterator<AFe1sSDK> it = AFe1nSDK.this.getMonetizationNetwork.iterator();
                                while (it.hasNext()) {
                                    it.next().getMonetizationNetwork(aFe1lSDKPollFirst, aFe1uSDK2);
                                }
                                if (aFe1uSDK2 == AFe1uSDK.SUCCESS) {
                                    AFe1nSDK.this.getRevenue.add(aFe1lSDKPollFirst.getCurrencyIso4217Code);
                                    AFe1nSDK.this.getMonetizationNetwork();
                                    return;
                                }
                                if (!aFe1lSDKPollFirst.AFAdRevenueData()) {
                                    AFe1nSDK.this.getRevenue.add(aFe1lSDKPollFirst.getCurrencyIso4217Code);
                                    AFe1nSDK.this.getMonetizationNetwork();
                                } else if (AFe1nSDK.getRevenue(aFe1lSDKPollFirst)) {
                                    synchronized (AFe1nSDK.this.component2) {
                                        try {
                                            AFe1nSDK.this.component1.add(aFe1lSDKPollFirst);
                                            for (AFe1sSDK aFe1sSDK : AFe1nSDK.this.getMonetizationNetwork) {
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public AFe1nSDK(ExecutorService executorService) {
        this.getCurrencyIso4217Code = executorService;
    }

    public static boolean getRevenue(AFe1lSDK<?> aFe1lSDK) {
        return ((aFe1lSDK instanceof AFf1tSDK) && aFe1lSDK.getCurrencyIso4217Code == AFe1mSDK.ARS_VALIDATE) ? false : true;
    }

    public final boolean getCurrencyIso4217Code(AFe1lSDK<?> aFe1lSDK) {
        return this.getRevenue.containsAll(aFe1lSDK.getMediationNetwork);
    }

    public final void getMediationNetwork(NavigableSet<AFe1lSDK<?>> navigableSet) {
        AFe1lSDK<?> aFe1lSDKPollFirst = navigableSet.pollFirst();
        this.getRevenue.add(aFe1lSDKPollFirst.getCurrencyIso4217Code);
        Iterator<AFe1sSDK> it = this.getMonetizationNetwork.iterator();
        while (it.hasNext()) {
            it.next().getMediationNetwork(aFe1lSDKPollFirst);
        }
    }

    public final void getMonetizationNetwork() {
        synchronized (this.component2) {
            try {
                Iterator<AFe1lSDK<?>> it = this.component4.iterator();
                boolean z5 = false;
                while (it.hasNext()) {
                    AFe1lSDK<?> next = it.next();
                    if (getCurrencyIso4217Code(next)) {
                        it.remove();
                        this.component2.add(next);
                        z5 = true;
                    }
                }
                if (z5) {
                    this.getCurrencyIso4217Code.submit(new AnonymousClass4());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
