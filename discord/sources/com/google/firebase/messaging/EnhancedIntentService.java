package com.google.firebase.messaging;

import a5.l0;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EnhancedIntentService extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f6528d = 0;
    private Binder binder;
    final ExecutorService executor;
    private int lastStartId;
    private final Object lock;
    private int runningTasks;

    public EnhancedIntentService() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a5.u("Firebase-Messaging-Intent-Handle", 1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.lock = new Object();
        this.runningTasks = 0;
    }

    public static Task access$000(EnhancedIntentService enhancedIntentService, Intent intent) {
        if (enhancedIntentService.handleIntentOnMainThread(intent)) {
            return l0.v(null);
        }
        ig.g gVar = new ig.g();
        enhancedIntentService.executor.execute(new ac.a(enhancedIntentService, intent, gVar, 13));
        return gVar.f11763a;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            b0.a(intent);
        }
        synchronized (this.lock) {
            try {
                int i7 = this.runningTasks - 1;
                this.runningTasks = i7;
                if (i7 == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new c0(new u4.b(6, this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        ig.l lVarV;
        synchronized (this.lock) {
            this.lastStartId = i10;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            a(intent);
            return 2;
        }
        if (handleIntentOnMainThread(startCommandIntent)) {
            lVarV = l0.v(null);
        } else {
            ig.g gVar = new ig.g();
            this.executor.execute(new ac.a(this, startCommandIntent, gVar, 13));
            lVarV = gVar.f11763a;
        }
        if (lVarV.l()) {
            a(intent);
            return 2;
        }
        lVarV.b(new com.discord.misc.utilities.threading.a(1), new bc.i(9, this, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int i7) {
        return stopSelfResult(i7);
    }
}
