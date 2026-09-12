package com.google.firebase.concurrent;

import a5.l0;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.j;
import gc.s0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import li.c;
import li.d;
import mi.b;
import mi.m;
import mi.q;
import ni.a;
import ni.e;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f6522a = new m(new j(3));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f6523b = new m(new j(4));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f6524c = new m(new j(5));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f6525d = new m(new j(6));

    public static e a() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i7 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i7 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new e(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) f6525d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        q qVar = new q(li.a.class, ScheduledExecutorService.class);
        q[] qVarArr = {new q(li.a.class, ExecutorService.class), new q(li.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            l0.l(qVar2, "Null interface");
        }
        Collections.addAll(hashSet, qVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new mc.q(14), hashSet3);
        q qVar3 = new q(li.b.class, ScheduledExecutorService.class);
        q[] qVarArr2 = {new q(li.b.class, ExecutorService.class), new q(li.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qVar3);
        for (q qVar4 : qVarArr2) {
            l0.l(qVar4, "Null interface");
        }
        Collections.addAll(hashSet4, qVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new mc.q(15), hashSet6);
        q qVar5 = new q(c.class, ScheduledExecutorService.class);
        q[] qVarArr3 = {new q(c.class, ExecutorService.class), new q(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qVar5);
        for (q qVar6 : qVarArr3) {
            l0.l(qVar6, "Null interface");
        }
        Collections.addAll(hashSet7, qVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new mc.q(16), hashSet9);
        s0 s0VarA = b.a(new q(d.class, Executor.class));
        s0VarA.f9844f = new mc.q(17);
        return Arrays.asList(bVar, bVar2, bVar3, s0VarA.b());
    }
}
