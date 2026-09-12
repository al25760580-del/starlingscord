package com.facebook.soloader;

import a5.l0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5390d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5391e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5392i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f5393v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f5394w;

    public /* synthetic */ f0(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z5, BroadcastReceiver.PendingResult pendingResult) {
        this.f5392i = intent;
        this.f5393v = context;
        this.f5391e = z5;
        this.f5394w = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executorUnconfigurableExecutorService;
        int iA;
        switch (this.f5390d) {
            case 0:
                q qVar = (q) this.f5393v;
                boolean z5 = this.f5391e;
                File file = ((i0) this.f5394w).f5386a;
                r.h("fb-UnpackingSoSource", "starting syncer worker");
                try {
                    if (z5) {
                        try {
                            c0.c(file);
                        } finally {
                            r.h("fb-UnpackingSoSource", "releasing dso store lock for " + file + " (from syncer thread)");
                            qVar.close();
                        }
                    }
                    i0.i((File) this.f5392i, (byte) 1, z5);
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            default:
                Intent intent = (Intent) this.f5392i;
                Context context = (Context) this.f5393v;
                boolean z6 = this.f5391e;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f5394w;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 == null) {
                        int iIntValue = 500;
                        if (intent.getExtras() != null) {
                            we.a aVar = new we.a(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f6527b;
                                    executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a5.u("pscm-ack-executor", 1));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f6527b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            executorUnconfigurableExecutorService.execute(new a5.t(context, aVar, countDownLatch, 14));
                            try {
                                iIntValue = ((Integer) l0.h(new com.google.firebase.messaging.h(context).b(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e11) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e11);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e12) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e12.toString()));
                            }
                        }
                        iA = iIntValue;
                        break;
                    } else {
                        iA = FirebaseInstanceIdReceiver.a(intent2);
                    }
                    if (z6 && pendingResult != null) {
                        pendingResult.setResultCode(iA);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th3;
                }
        }
    }

    public f0(i0 i0Var, boolean z5, File file, q qVar) {
        this.f5394w = i0Var;
        this.f5391e = z5;
        this.f5392i = file;
        this.f5393v = qVar;
    }
}
