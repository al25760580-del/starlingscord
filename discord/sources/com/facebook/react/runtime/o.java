package com.facebook.react.runtime;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.util.Log;
import com.facebook.cache.common.CacheKey;
import com.google.firebase.messaging.b0;
import io.sentry.android.core.ScreenshotEventProcessor;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.n0;
import io.sentry.android.core.p0;
import io.sentry.c1;
import io.sentry.d5;
import io.sentry.f4;
import io.sentry.h6;
import io.sentry.p4;
import io.sentry.z4;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5320e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5321i;

    public /* synthetic */ o(int i7, Object obj, Object obj2) {
        this.f5319d = i7;
        this.f5320e = obj;
        this.f5321i = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        ServiceInfo serviceInfo;
        String str;
        int i7;
        ComponentName componentNameStartService;
        String str2 = null;
        switch (this.f5319d) {
            case 0:
                return ReactHostImpl.reload$lambda$8((ReactHostImpl) this.f5320e, (String) this.f5321i);
            case 1:
                Context context = (Context) this.f5320e;
                Intent intent = (Intent) this.f5321i;
                com.google.firebase.messaging.r rVarF = com.google.firebase.messaging.r.f();
                rVarF.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) rVarF.f6613v).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (rVarF) {
                    try {
                        String str3 = (String) rVarF.f6610d;
                        if (str3 != null) {
                            str2 = str3;
                        } else {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str.startsWith(".")) {
                                    rVarF.f6610d = context.getPackageName() + serviceInfo.name;
                                } else {
                                    rVarF.f6610d = serviceInfo.name;
                                }
                                str2 = (String) rVarF.f6610d;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if (rVarF.l(context)) {
                        componentNameStartService = b0.b(context, intent2);
                    } else {
                        componentNameStartService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i7 = 404;
                    } else {
                        i7 = -1;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
                    i7 = 402;
                } catch (SecurityException e11) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
                    i7 = 401;
                }
                return Integer.valueOf(i7);
            case 2:
                ga.b this$0 = (ga.b) this.f5320e;
                CacheKey key = (CacheKey) this.f5321i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(key, "$key");
                try {
                    this$0.f9530g.r(key);
                    ((j8.g) this$0.f9524a).i(key);
                    return null;
                } catch (Throwable th3) {
                    Intrinsics.checkNotNullParameter(th3, "th");
                    throw th3;
                }
            case 3:
                c1 c1Var = (c1) this.f5320e;
                h6 h6Var = (h6) this.f5321i;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, p4.f12886d));
                    try {
                        c1Var.b(h6Var, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th4) {
                        try {
                            bufferedWriter.close();
                            break;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    try {
                        byteArrayOutputStream.close();
                        break;
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            case 4:
                c1 c1Var2 = (c1) this.f5320e;
                z4 z4Var = (z4) this.f5321i;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, p4.f12886d));
                    try {
                        c1Var2.b(z4Var, bufferedWriter2);
                        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                        bufferedWriter2.close();
                        byteArrayOutputStream2.close();
                        return byteArray2;
                    } catch (Throwable th8) {
                        try {
                            bufferedWriter2.close();
                            break;
                        } catch (Throwable th9) {
                            th8.addSuppressed(th9);
                        }
                        throw th8;
                    }
                } catch (Throwable th10) {
                    try {
                        byteArrayOutputStream2.close();
                        break;
                    } catch (Throwable th11) {
                        th10.addSuppressed(th11);
                    }
                    throw th10;
                }
            case 5:
                c1 c1Var3 = (c1) this.f5320e;
                f4 f4Var = (f4) this.f5321i;
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream3, p4.f12886d));
                    try {
                        c1Var3.b(f4Var, bufferedWriter3);
                        byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                        bufferedWriter3.close();
                        byteArrayOutputStream3.close();
                        return byteArray3;
                    } catch (Throwable th12) {
                        try {
                            bufferedWriter3.close();
                            break;
                        } catch (Throwable th13) {
                            th12.addSuppressed(th13);
                        }
                        throw th12;
                    }
                } catch (Throwable th14) {
                    try {
                        byteArrayOutputStream3.close();
                        break;
                    } catch (Throwable th15) {
                        th14.addSuppressed(th15);
                    }
                    throw th14;
                }
            case 6:
                c1 c1Var4 = (c1) this.f5320e;
                io.sentry.clientreport.b bVar = (io.sentry.clientreport.b) this.f5321i;
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter4 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream4, p4.f12886d));
                    try {
                        c1Var4.b(bVar, bufferedWriter4);
                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                        bufferedWriter4.close();
                        byteArrayOutputStream4.close();
                        return byteArray4;
                    } catch (Throwable th16) {
                        try {
                            bufferedWriter4.close();
                            break;
                        } catch (Throwable th17) {
                            th16.addSuppressed(th17);
                        }
                        throw th16;
                    }
                } catch (Throwable th18) {
                    try {
                        byteArrayOutputStream4.close();
                        break;
                    } catch (Throwable th19) {
                        th18.addSuppressed(th19);
                    }
                    throw th18;
                }
            case 7:
                c1 c1Var5 = (c1) this.f5320e;
                d5 d5Var = (d5) this.f5321i;
                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter5 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream5, p4.f12886d));
                    try {
                        c1Var5.b(d5Var, bufferedWriter5);
                        byte[] byteArray5 = byteArrayOutputStream5.toByteArray();
                        bufferedWriter5.close();
                        byteArrayOutputStream5.close();
                        return byteArray5;
                    } catch (Throwable th20) {
                        try {
                            bufferedWriter5.close();
                            break;
                        } catch (Throwable th21) {
                            th20.addSuppressed(th21);
                        }
                        throw th20;
                    }
                } catch (Throwable th22) {
                    try {
                        byteArrayOutputStream5.close();
                        break;
                    } catch (Throwable th23) {
                        th22.addSuppressed(th23);
                    }
                    throw th22;
                }
            case 8:
                return p0.c(((n0) this.f5320e).f12351d, (SentryAndroidOptions) this.f5321i);
            case 9:
                return hf.a.c((Bitmap) this.f5321i, ((ScreenshotEventProcessor) this.f5320e).f12106d.getLogger());
            case 10:
                l4.h hVar = (l4.h) this.f5320e;
                String str4 = (String) this.f5321i;
                if (!hVar.G) {
                    return l4.m.b(hVar.getContext(), str4, null);
                }
                Context context2 = hVar.getContext();
                HashMap map = l4.m.f14888a;
                return l4.m.b(context2, str4, "asset_" + str4);
            case 11:
                return l4.m.c((InputStream) this.f5320e, (String) this.f5321i);
            default:
                return l4.m.f(null, (ZipInputStream) this.f5320e, (String) this.f5321i);
        }
    }
}
