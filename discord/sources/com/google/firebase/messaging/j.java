package com.google.firebase.messaging;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements xi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6591a;

    public /* synthetic */ j(int i7) {
        this.f6591a = i7;
    }

    @Override // xi.a
    public final Object get() {
        switch (this.f6591a) {
            case 0:
                ue.i iVar = FirebaseMessaging.k;
                return null;
            case 1:
                return Collections.EMPTY_SET;
            case 2:
                return null;
            case 3:
                return ExecutorsRegistrar.a();
            case 4:
                mi.m mVar = ExecutorsRegistrar.f6522a;
                return new ni.e(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ni.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f6525d.get());
            case 5:
                mi.m mVar2 = ExecutorsRegistrar.f6522a;
                return new ni.e(Executors.newCachedThreadPool(new ni.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f6525d.get());
            default:
                mi.m mVar3 = ExecutorsRegistrar.f6522a;
                return Executors.newSingleThreadScheduledExecutor(new ni.a("Firebase Scheduler", 0, null));
        }
    }
}
