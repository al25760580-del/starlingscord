package a5;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.discord.billing.BillingManager;
import com.discord.jank_stats.JankRecordStore;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.g1;
import com.google.android.gms.internal.play_billing.h1;
import com.google.android.gms.internal.play_billing.s3;
import com.google.android.gms.internal.play_billing.s4;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.t4;
import com.google.android.gms.internal.play_billing.u0;
import com.google.android.gms.internal.play_billing.u3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.z1;
import com.google.android.gms.internal.play_billing.z3;
import io.sentry.w5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class b extends BillingClient {
    public com.google.android.gms.internal.play_billing.u A;
    public ExecutorService B;
    public final Long C;
    public final z1 D;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f151d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile o0 f153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4.r f155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile com.google.android.gms.internal.play_billing.d f156i;
    public volatile w j;
    public boolean k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f159n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f160o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f161p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f162q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f163r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f164s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f165t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f166u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f167v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f168w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f169x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f170y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final i8.b f171z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f148a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f149b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f152e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f157l = 0;

    public b(i8.b bVar, Context context, com.discord.billing.b bVar2, a aVar) {
        int i7 = com.google.android.gms.internal.play_billing.u.f6139i;
        this.A = com.google.android.gms.internal.play_billing.c0.G;
        long jNextLong = new Random().nextLong();
        this.C = Long.valueOf(jNextLong);
        this.D = com.google.android.gms.internal.play_billing.k.f6028a;
        this.f150c = z4.a.f23597a;
        String strP = p();
        this.f151d = strP;
        this.f154g = context.getApplicationContext();
        c4 c4VarB = d4.B();
        c4VarB.k();
        if (strP != null) {
            c4VarB.c();
            d4.A((d4) c4VarB.f5994e, strP);
        }
        c4VarB.j(this.f154g.getPackageName());
        c4VarB.c();
        d4.F((d4) c4VarB.f5994e, jNextLong);
        c4VarB.c();
        d4.y((d4) c4VarB.f5994e);
        c4VarB.e(Build.VERSION.SDK_INT);
        c4VarB.h();
        s(c4VarB, context);
        try {
            c4VarB.f(this.f154g.getPackageManager().getPackageInfo(this.f154g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Error getting app version code.", th2);
        }
        this.f155h = new e4.r(this.f154g, (d4) c4VarB.a());
        if (bVar2 == null) {
            com.google.android.gms.internal.play_billing.r.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f153f = new o0(this.f154g, bVar2, this.f155h);
        this.f171z = bVar;
        this.f154g.getPackageName();
    }

    public static Future j(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new hi.o(2, futureSubmit, runnable), (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public static String p() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void q(b bVar, int i7) {
        bVar.f157l = i7;
        bVar.f170y = i7 >= 28;
        bVar.f169x = i7 >= 26;
        bVar.f168w = i7 >= 24;
        bVar.f167v = i7 >= 21;
        bVar.f166u = i7 >= 20;
        bVar.f165t = i7 >= 19;
        bVar.f164s = i7 >= 18;
        bVar.f163r = i7 >= 17;
        bVar.f162q = i7 >= 16;
        bVar.f161p = i7 >= 15;
        bVar.f160o = i7 >= 14;
        bVar.f159n = i7 >= 9;
        bVar.f158m = i7 >= 6;
    }

    public static void r(b bVar, int i7) {
        if (i7 != 0) {
            bVar.E(0);
            return;
        }
        synchronized (bVar.f148a) {
            try {
                if (bVar.f149b == 3) {
                    return;
                }
                bVar.E(2);
                o0 o0Var = bVar.f153f != null ? bVar.f153f : null;
                if (o0Var != null) {
                    boolean z5 = bVar.f167v;
                    n0 n0Var = o0Var.f240d;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    o0Var.f242f = z5;
                    n0 n0Var2 = o0Var.f241e;
                    Context context = o0Var.f237a;
                    n0Var2.a(context, intentFilter2);
                    if (o0Var.f242f) {
                        n0Var.b(context, intentFilter);
                    } else {
                        n0Var.a(context, intentFilter);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void s(c4 c4Var, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i7 = (int) (memoryInfo.totalMem / w5.MAX_EVENT_SIZE_BYTES);
                c4Var.c();
                d4.x((d4) c4Var.f5994e, i7);
                String str = Build.BRAND;
                c4Var.c();
                d4.t((d4) c4Var.f5994e);
                String str2 = Build.MODEL;
                c4Var.c();
                d4.w((d4) c4Var.f5994e);
                String str3 = Build.MANUFACTURER;
                c4Var.c();
                d4.v((d4) c4Var.f5994e);
                String str4 = Build.FINGERPRINT;
                c4Var.c();
                d4.u((d4) c4Var.f5994e);
            }
        } catch (RuntimeException e10) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Runtime error while populating device info.", e10);
        }
    }

    public final void A(BillingManager.C01061.C00181.C00191 c00191, BillingResult billingResult, int i7, Exception exc) {
        com.google.android.gms.internal.play_billing.r.i("BillingClient", "getBillingConfig got an exception.", exc);
        w(i7, 13, billingResult, f0.a(exc));
        c00191.onBillingConfigResponse(billingResult, null);
    }

    public final void B(t3 t3Var) {
        try {
            this.f155h.R(t3Var, this.f157l);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(v3 v3Var) {
        try {
            e4.r rVar = this.f155h;
            int i7 = this.f157l;
            rVar.getClass();
            try {
                c4 c4Var = (c4) ((d4) rVar.f8034e).l();
                c4Var.c();
                d4.E((d4) c4Var.f5994e, i7);
                d4 d4Var = (d4) c4Var.a();
                rVar.f8034e = d4Var;
                try {
                    rVar.b0(v3Var, d4Var);
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to log.", th2);
                }
            } catch (Throwable th3) {
                com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to log.", th3);
            }
        } catch (Throwable th4) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Unable to log.", th4);
        }
    }

    public final void D(int i7, BillingResult billingResult) {
        try {
            int i10 = f0.f183a;
            s3 s3Var = (s3) f0.b(i7, 6, billingResult, null, z3.BROADCAST_ACTION_UNSPECIFIED).l();
            s4 s4VarR = t4.r();
            s4VarR.e(false);
            s4VarR.f();
            s3Var.f(s4VarR);
            B((t3) s3Var.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void E(int i7) {
        String str;
        String str2;
        synchronized (this.f148a) {
            try {
                if (this.f149b == 3) {
                    return;
                }
                int i10 = this.f149b;
                if (i10 == 0) {
                    str = "DISCONNECTED";
                } else if (i10 != 1) {
                    str = i10 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str = "CONNECTING";
                }
                if (i7 == 0) {
                    str2 = "DISCONNECTED";
                } else if (i7 != 1) {
                    str2 = i7 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str2 = "CONNECTING";
                }
                com.google.android.gms.internal.play_billing.r.g("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.f149b = i7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void F(c cVar) {
        int i7;
        BillingResult billingResultM;
        synchronized (this.f148a) {
            try {
                if (I()) {
                    billingResultM = m();
                } else if (this.f149b == 1) {
                    com.google.android.gms.internal.play_billing.r.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    billingResultM = h0.f192c;
                    D(37, billingResultM);
                } else if (this.f149b == 3) {
                    com.google.android.gms.internal.play_billing.r.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    billingResultM = h0.f197h;
                    D(38, billingResultM);
                } else {
                    E(1);
                    G();
                    com.google.android.gms.internal.play_billing.r.g("BillingClient", "Starting in-app billing setup.");
                    this.j = new w(this, cVar);
                    w wVar = this.j;
                    synchronized (wVar.f272v.f148a) {
                        com.google.android.gms.internal.play_billing.m mVar = wVar.f270e;
                        mVar.f6051c = 0L;
                        mVar.f6050b = false;
                        mVar.a();
                    }
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> listQueryIntentServices = this.f154g.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        i7 = 41;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        i7 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                com.google.android.gms.internal.play_billing.r.h("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f150c);
                                synchronized (this.f148a) {
                                    try {
                                        if (this.f149b == 2) {
                                            billingResultM = m();
                                        } else if (this.f149b != 1) {
                                            com.google.android.gms.internal.play_billing.r.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            billingResultM = h0.f197h;
                                            D(105, billingResultM);
                                        } else {
                                            w wVar2 = this.j;
                                            if (this.f154g.bindService(intent2, wVar2, 1)) {
                                                com.google.android.gms.internal.play_billing.r.g("BillingClient", "Service was bonded successfully.");
                                                billingResultM = null;
                                            } else {
                                                com.google.android.gms.internal.play_billing.r.h("BillingClient", "Connection to Billing service is blocked.");
                                                i7 = 39;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        } else {
                            com.google.android.gms.internal.play_billing.r.h("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    E(0);
                    com.google.android.gms.internal.play_billing.r.g("BillingClient", "Billing service unavailable on device.");
                    billingResultM = h0.f190a;
                    D(i7, billingResultM);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (billingResultM != null) {
            cVar.onBillingSetupFinished(billingResultM);
        }
    }

    public final void G() {
        synchronized (this.f148a) {
            if (this.j != null) {
                try {
                    this.f154g.unbindService(this.j);
                    this.f156i = null;
                    this.j = null;
                } catch (Throwable th2) {
                    try {
                        com.google.android.gms.internal.play_billing.r.i("BillingClient", "There was an exception while unbinding service!", th2);
                        this.f156i = null;
                        this.j = null;
                    } catch (Throwable th3) {
                        this.f156i = null;
                        this.j = null;
                        throw th3;
                    }
                }
            }
        }
    }

    public final boolean H(long j) {
        z1 z1Var = this.D;
        if (z1Var == null) {
            throw new NullPointerException("ticker");
        }
        long jD = z1Var.d();
        int i7 = com.facebook.imagepipeline.nativecode.b.f4925d;
        long jConvert = j;
        for (int i10 = 1; i10 <= i7; i10++) {
            try {
                if (Math.max(0L, jConvert) <= 0) {
                    com.google.android.gms.internal.play_billing.r.h("BillingClient", "No time remaining for reconnection attempt.");
                    return I();
                }
                com.google.android.gms.internal.play_billing.r.g("BillingClient", "Already connected or not opted into auto reconnection.");
                BillingResult billingResult = h0.f196g;
                TimeUnit.MILLISECONDS.getClass();
                int i11 = billingResult.f3788a;
                if (i11 == 0) {
                    com.google.android.gms.internal.play_billing.r.g("BillingClient", "Reconnection succeeded with result: " + i11);
                    return I();
                }
                com.google.android.gms.internal.play_billing.r.h("BillingClient", "Reconnection failed with result: " + i11);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long jD2 = (z1Var.d() - jD) + 0;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                jConvert = j - timeUnit.convert(jD2, timeUnit2);
                long jPow = ((long) Math.pow(2.0d, i10 - 1)) * 1000;
                if (jConvert < jPow) {
                    com.google.android.gms.internal.play_billing.r.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return I();
                }
                if (i10 < i7 && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        jConvert = j - timeUnit.convert((z1Var.d() - jD) + 0, timeUnit2);
                    } catch (InterruptedException e10) {
                        Thread.currentThread().interrupt();
                        com.google.android.gms.internal.play_billing.r.i("BillingClient", "Error sleeping during reconnection attempt: ", e10);
                    }
                }
            } catch (Exception e11) {
                if (e11 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                com.google.android.gms.internal.play_billing.r.i("BillingClient", "Error during reconnection attempt: ", e11);
            }
        }
        com.google.android.gms.internal.play_billing.r.h("BillingClient", "Max retries reached.");
        return I();
    }

    public final boolean I() {
        boolean z5;
        synchronized (this.f148a) {
            try {
                z5 = false;
                if (this.f149b == 2 && this.f156i != null && this.j != null) {
                    z5 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z5;
    }

    public final void J(BillingResult billingResult) {
        if (Thread.interrupted()) {
            return;
        }
        this.f152e.post(new hi.o(1, this, billingResult));
    }

    @Override // com.android.billingclient.api.BillingClient
    public void a(h hVar, com.discord.billing.a aVar) {
        if (j(new r(this, aVar, hVar, 1), JankRecordStore.FLUSH_INTERVAL_MS, new t(this, aVar, hVar, 0), k(), i()) == null) {
            BillingResult billingResultN = n();
            u(25, 4, billingResultN);
            aVar.a(billingResultN, hVar.f189b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {, blocks: (B:20:0x0049, B:22:0x004d), top: B:43:0x0049, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.android.billingclient.api.BillingClient
    public void b() {
        ExecutorService executorService;
        try {
            int i7 = f0.f183a;
            C(f0.c(12, z3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Unable to log.", th2);
        }
        synchronized (this.f148a) {
            try {
                if (this.f153f != null) {
                    o0 o0Var = this.f153f;
                    n0 n0Var = o0Var.f240d;
                    Context context = o0Var.f237a;
                    n0Var.c(context);
                    o0Var.f241e.c(context);
                    try {
                        com.google.android.gms.internal.play_billing.r.g("BillingClient", "Unbinding from service.");
                        G();
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.r.i("BillingClient", "There was an exception while unbinding from the service while ending connection!", th3);
                    }
                    try {
                        synchronized (this) {
                            executorService = this.B;
                            if (executorService != null) {
                                executorService.shutdownNow();
                                this.B = null;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            com.google.android.gms.internal.play_billing.r.i("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th4);
                        } catch (Throwable th5) {
                            E(3);
                            throw th5;
                        }
                    }
                    E(3);
                } else {
                    com.google.android.gms.internal.play_billing.r.g("BillingClient", "Unbinding from service.");
                    G();
                    synchronized (this) {
                        executorService = this.B;
                        if (executorService != null) {
                            executorService.shutdownNow();
                            this.B = null;
                        }
                        E(3);
                    }
                }
            } catch (Throwable th6) {
                com.google.android.gms.internal.play_billing.r.i("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th6);
            }
            throw th;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void c(BillingManager.C01061.C00181.C00191 c00191) {
        if (j(new s(this, c00191), JankRecordStore.FLUSH_INTERVAL_MS, new u0(2, this, c00191), k(), i()) == null) {
            BillingResult billingResultN = n();
            u(25, 13, billingResultN);
            c00191.onBillingConfigResponse(billingResultN, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean d() {
        return I();
    }

    /* JADX WARN: Code duplicated, block: B:138:0x030f A[EDGE_INSN: B:138:0x030f->B:104:0x0251 BREAK  A[LOOP:6: B:98:0x021b->B:117:0x029b]] */
    /* JADX WARN: Code duplicated, block: B:57:0x010f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0, types: [a5.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r5v10, types: [long] */
    /* JADX WARN: Type inference failed for: r5v9, types: [long] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    @Override // com.android.billingclient.api.BillingClient
    public BillingResult e(Activity activity, final BillingFlowParams billingFlowParams) {
        String str;
        String str2;
        BillingResult billingResultA;
        i iVar;
        BillingResult billingResultA2;
        long j;
        long j5;
        boolean z5;
        String string;
        Future futureJ;
        String str3;
        ?? r6;
        ?? r5;
        ?? r7;
        ?? r10;
        int iA;
        int i7;
        String str4;
        String str5;
        ArrayList arrayList;
        boolean z6;
        int i10;
        long jNextLong = new Random().nextLong();
        if (this.f153f == null || this.f153f.f238b == null) {
            BillingResult billingResult = h0.f204q;
            v(12, billingResult, jNextLong);
            return billingResult;
        }
        try {
            com.google.android.gms.internal.play_billing.r.g("BillingClient", "Already connected or not opted into auto reconnection.");
            BillingResult billingResult2 = h0.f196g;
            TimeUnit.MILLISECONDS.getClass();
            int i11 = billingResult2.f3788a;
            if (i11 == 0) {
                com.google.android.gms.internal.play_billing.r.g("BillingClient", "Reconnection succeeded with result: " + i11);
            } else {
                com.google.android.gms.internal.play_billing.r.h("BillingClient", "Reconnection failed with result: " + i11);
            }
        } catch (Exception e10) {
            if (e10 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Error during reconnection attempt: ", e10);
        }
        if (!I()) {
            BillingResult billingResult3 = h0.f197h;
            v(2, billingResult3, jNextLong);
            J(billingResult3);
            return billingResult3;
        }
        synchronized (this.f148a) {
            try {
                if (this.j != null) {
                    this.j.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(billingFlowParams.f3787e);
        com.google.android.gms.internal.play_billing.s sVar = billingFlowParams.f3786d;
        Iterator it = arrayList2.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            throw new ClassCastException();
        }
        com.google.android.gms.internal.play_billing.p pVar = (com.google.android.gms.internal.play_billing.p) sVar.iterator();
        e eVar = (e) (pVar.hasNext() ? pVar.next() : null);
        ProductDetails productDetails = eVar.f178a;
        String str6 = productDetails.f3793c;
        String str7 = productDetails.f3794d;
        if (str7.equals("subs") && !this.k) {
            com.google.android.gms.internal.play_billing.r.h("BillingClient", "Current client doesn't support subscriptions.");
            BillingResult billingResult4 = h0.j;
            x(9, billingResult4, jNextLong, false);
            J(billingResult4);
            return billingResult4;
        }
        if (billingFlowParams.f3784b == null) {
            b0 b0Var = billingFlowParams.f3785c;
            b0Var.getClass();
            if (b0Var.f173e == 0 && !billingFlowParams.f3783a) {
                com.google.android.gms.internal.play_billing.s sVar2 = billingFlowParams.f3786d;
                if (sVar2 != null) {
                    int size = sVar2.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((e) sVar2.get(i12)).getClass();
                    }
                }
            } else if (!this.f158m) {
                com.google.android.gms.internal.play_billing.r.h("BillingClient", "Current client doesn't support extra params for buy intent.");
                BillingResult billingResult5 = h0.f194e;
                x(18, billingResult5, jNextLong, false);
                J(billingResult5);
                return billingResult5;
            }
        } else if (!this.f158m) {
            com.google.android.gms.internal.play_billing.r.h("BillingClient", "Current client doesn't support extra params for buy intent.");
            BillingResult billingResult6 = h0.f194e;
            x(18, billingResult6, jNextLong, false);
            J(billingResult6);
            return billingResult6;
        }
        if (arrayList2.size() > 1 && !this.f162q) {
            com.google.android.gms.internal.play_billing.r.h("BillingClient", "Current client doesn't support multi-item purchases.");
            BillingResult billingResult7 = h0.k;
            x(19, billingResult7, jNextLong, false);
            J(billingResult7);
            return billingResult7;
        }
        if (!sVar.isEmpty() && !this.f163r) {
            com.google.android.gms.internal.play_billing.r.h("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            BillingResult billingResult8 = h0.f201n;
            x(20, billingResult8, jNextLong, false);
            J(billingResult8);
            return billingResult8;
        }
        com.google.android.gms.internal.play_billing.p pVarListIterator = sVar.listIterator(0);
        while (pVarListIterator.hasNext()) {
            String str8 = ((e) pVarListIterator.next()).f179b;
            if (str8 != null) {
                if (str8.contains(":") && !this.f170y) {
                    com.google.android.gms.internal.play_billing.r.h("BillingClient", "Current Play Store version doesn't support gift code purchase.");
                    BillingResult billingResult9 = h0.f200m;
                    x(143, billingResult9, jNextLong, false);
                    J(billingResult9);
                    return billingResult9;
                }
            }
        }
        if (!billingFlowParams.f3786d.isEmpty()) {
            e eVar2 = (e) billingFlowParams.f3786d.get(0);
            int i13 = 1;
            str = null;
            while (true) {
                if (i13 >= billingFlowParams.f3786d.size()) {
                    str2 = str6;
                    ProductDetails productDetails2 = eVar2.f178a;
                    String strOptString = productDetails2.f3792b.optString("packageName");
                    HashMap map = new HashMap();
                    HashSet hashSet = new HashSet();
                    com.google.android.gms.internal.play_billing.s sVar3 = billingFlowParams.f3786d;
                    int size2 = sVar3.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size2) {
                            com.google.android.gms.internal.play_billing.s sVar4 = sVar3;
                            e eVar3 = (e) sVar3.get(i14);
                            eVar3.getClass();
                            int i15 = size2;
                            ProductDetails productDetails3 = eVar3.f178a;
                            int i16 = i14;
                            ArrayList arrayList3 = productDetails3.f3799i;
                            String str9 = productDetails3.f3793c;
                            if (arrayList3 != null && eVar3.f179b == null) {
                                billingResultA = h0.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str9);
                                break;
                            }
                            if (map.containsKey(str9)) {
                                billingResultA = h0.a(5, "ProductId can not be duplicated. Invalid product id: " + str9 + ".");
                                break;
                            }
                            map.put(str9, eVar3);
                            if (!productDetails2.f3794d.equals("play_pass_subs") && !productDetails3.f3794d.equals("play_pass_subs") && !strOptString.equals(productDetails3.f3792b.optString("packageName"))) {
                                billingResultA = h0.a(5, "All products must have the same package name.");
                                break;
                            }
                            i14 = i16 + 1;
                            size2 = i15;
                            sVar3 = sVar4;
                            hashSet = hashSet;
                        } else {
                            Iterator it2 = hashSet.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    ArrayList arrayList4 = productDetails2.j;
                                    String str10 = eVar2.f179b;
                                    if (str10 != null && arrayList4 != null) {
                                        Iterator it3 = arrayList4.iterator();
                                        do {
                                            if (!it3.hasNext()) {
                                                iVar = null;
                                                break;
                                            }
                                            iVar = (i) it3.next();
                                        } while (!str10.equals(iVar.f209d));
                                        if (iVar != null && iVar.f212g != null) {
                                            billingResultA = h0.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                            break;
                                        }
                                        billingResultA = h0.f196g;
                                        break;
                                    }
                                    billingResultA = h0.f196g;
                                    break;
                                }
                                String str11 = (String) it2.next();
                                if (map.containsKey(str11)) {
                                    ((e) map.get(str11)).getClass();
                                    billingResultA = h0.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str11 + ".");
                                    break;
                                }
                            }
                        }
                    }
                    billingResultA2 = billingResultA;
                    break;
                }
                e eVar4 = (e) billingFlowParams.f3786d.get(i13);
                str2 = str6;
                if (!eVar4.f178a.f3794d.equals(eVar2.f178a.f3794d) && !eVar4.f178a.f3794d.equals("play_pass_subs")) {
                    billingResultA2 = h0.a(5, "All products should have same ProductType.");
                    break;
                }
                i13++;
                str6 = str2;
            }
        } else {
            str2 = str6;
            billingResultA2 = h0.f196g;
            str = null;
        }
        if (billingResultA2 != h0.f196g) {
            x(108, billingResultA2, jNextLong, false);
            J(billingResultA2);
            return billingResultA2;
        }
        Bundle bundle = null;
        if (this.f158m) {
            boolean z7 = this.f159n;
            this.f171z.getClass();
            this.f171z.getClass();
            String str12 = this.f151d;
            long jLongValue = this.C.longValue();
            this.f154g.getPackageName();
            z5 = false;
            final Bundle bundle2 = new Bundle();
            com.google.android.gms.internal.play_billing.r.b(bundle2, str12, jLongValue);
            bundle2.putLong("billingClientTransactionId", j);
            int i17 = billingFlowParams.f3785c.f173e;
            if (i17 != 0) {
                j = r4;
                bundle2.putInt("prorationMode", i17);
            }
            j = r4;
            if (!TextUtils.isEmpty(billingFlowParams.f3784b)) {
                bundle2.putString("accountId", billingFlowParams.f3784b);
            }
            if (TextUtils.isEmpty(str)) {
                str4 = str;
            } else {
                str4 = str;
                bundle2.putString("obfuscatedProfileId", str4);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle2.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str4)));
            }
            if (!TextUtils.isEmpty((String) billingFlowParams.f3785c.f174i)) {
                bundle2.putString("oldSkuPurchaseToken", (String) billingFlowParams.f3785c.f174i);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle2.putString("oldSkuPurchaseId", null);
            }
            billingFlowParams.f3785c.getClass();
            if (!TextUtils.isEmpty(null)) {
                billingFlowParams.f3785c.getClass();
                bundle2.putString("originalExternalTransactionId", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle2.putString("paymentsPurchaseParams", null);
            }
            if (z7) {
                bundle2.putBoolean("enablePendingPurchases", true);
            }
            ArrayList arrayList5 = new ArrayList();
            com.google.android.gms.internal.play_billing.p pVarListIterator2 = billingFlowParams.f3786d.listIterator(0);
            while (pVarListIterator2.hasNext()) {
                ((e) pVarListIterator2.next()).getClass();
            }
            if (!arrayList5.isEmpty()) {
                g1 g1VarR = h1.r();
                g1VarR.c();
                h1.s((h1) g1VarR.f5994e, arrayList5);
                bundle2.putByteArray("subscriptionProductReplacementParamsList", ((h1) g1VarR.a()).b());
            }
            if (arrayList2.isEmpty()) {
                ArrayList<String> arrayList6 = new ArrayList<>(sVar.size() - 1);
                ArrayList<String> arrayList7 = new ArrayList<>(sVar.size() - 1);
                ArrayList<String> arrayList8 = new ArrayList<>();
                ArrayList<String> arrayList9 = new ArrayList<>();
                ArrayList<String> arrayList10 = new ArrayList<>();
                ArrayList<Integer> arrayList11 = new ArrayList<>();
                int i18 = 0;
                while (i18 < sVar.size()) {
                    e eVar5 = (e) sVar.get(i18);
                    ProductDetails productDetails4 = eVar5.f178a;
                    long j7 = j;
                    if (!productDetails4.f3797g.isEmpty()) {
                        arrayList8.add(productDetails4.f3797g);
                    }
                    String str13 = eVar5.f179b;
                    arrayList9.add(str13);
                    if (TextUtils.isEmpty(str13) || (arrayList = productDetails4.j) == null || arrayList.isEmpty()) {
                        str5 = productDetails4.f3798h;
                        break;
                    }
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            str5 = productDetails4.f3798h;
                            break;
                        }
                        i iVar2 = (i) it4.next();
                        Iterator it5 = it4;
                        if (!TextUtils.isEmpty(iVar2.f211f) && Objects.equals(iVar2.f209d, str13)) {
                            str5 = iVar2.f211f;
                            break;
                        }
                        it4 = it5;
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        arrayList10.add(str5);
                    }
                    if (i18 > 0) {
                        arrayList6.add(((e) sVar.get(i18)).f178a.f3793c);
                        arrayList7.add(((e) sVar.get(i18)).f178a.f3794d);
                    }
                    i18++;
                    j = j7;
                }
                j5 = j;
                bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList9);
                if (!arrayList11.isEmpty()) {
                    bundle2.putIntegerArrayList("autoPayBalanceThresholdList", arrayList11);
                }
                if (!arrayList8.isEmpty()) {
                    bundle2.putStringArrayList("skuDetailsTokens", arrayList8);
                }
                if (!arrayList10.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList10);
                }
                if (!arrayList6.isEmpty()) {
                    bundle2.putStringArrayList("additionalSkus", arrayList6);
                    bundle2.putStringArrayList("additionalSkuTypes", arrayList7);
                }
            } else {
                ArrayList<String> arrayList12 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it6 = arrayList2.iterator();
                if (it6.hasNext()) {
                    throw s0.g.a(it6);
                }
                if (!arrayList12.isEmpty()) {
                    bundle2.putStringArrayList("skuDetailsTokens", arrayList12);
                }
                if (arrayList2.size() > 1) {
                    ArrayList<String> arrayList13 = new ArrayList<>(arrayList2.size() - 1);
                    ArrayList<String> arrayList14 = new ArrayList<>(arrayList2.size() - 1);
                    if (arrayList2.size() > 1) {
                        arrayList2.get(1).getClass();
                        throw new ClassCastException();
                    }
                    bundle2.putStringArrayList("additionalSkus", arrayList13);
                    bundle2.putStringArrayList("additionalSkuTypes", arrayList14);
                }
                j5 = j;
            }
            if (bundle2.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f160o) {
                BillingResult billingResult10 = h0.f199l;
                x(21, billingResult10, j5, false);
                J(billingResult10);
                return billingResult10;
            }
            if (TextUtils.isEmpty(eVar.f178a.f3792b.optString("packageName"))) {
                z6 = false;
            } else {
                bundle2.putString("skuPackageName", eVar.f178a.f3792b.optString("packageName"));
                z6 = true;
            }
            string = null;
            if (!TextUtils.isEmpty(null)) {
                bundle2.putString("accountName", null);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                com.google.android.gms.internal.play_billing.r.h("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle2.putString("proxyPackage", stringExtra);
                try {
                    bundle2.putString("proxyPackageVersion", this.f154g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle2.putString("proxyPackageVersion", "package not found");
                }
            }
            if (this.f170y) {
                i10 = 28;
            } else if (this.f163r && !sVar.isEmpty()) {
                i10 = 17;
            } else if (this.f161p && z6) {
                i10 = 15;
            } else {
                i10 = this.f159n ? 9 : 6;
            }
            final int i19 = i10;
            final String str14 = str2;
            final String str15 = str7;
            futureJ = j(new Callable(i19, str14, str15, billingFlowParams, bundle2) { // from class: a5.q

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f249e;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ String f250i;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ String f251v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ Bundle f252w;

                {
                    this.f252w = bundle2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundleC;
                    com.google.android.gms.internal.play_billing.d dVar;
                    b bVar = this.f248d;
                    int i20 = this.f249e;
                    String str16 = this.f250i;
                    String str17 = this.f251v;
                    Bundle bundle3 = this.f252w;
                    try {
                        synchronized (bVar.f148a) {
                            dVar = bVar.f156i;
                        }
                        if (dVar == null) {
                            return com.google.android.gms.internal.play_billing.r.c(107, h0.f197h);
                        }
                        return ((com.google.android.gms.internal.play_billing.b) dVar).C(i20, bVar.f154g.getPackageName(), str16, str17, bundle3);
                    } catch (DeadObjectException e11) {
                        BillingResult billingResult11 = h0.f197h;
                        String strA = f0.a(e11);
                        bundleC = com.google.android.gms.internal.play_billing.r.c(5, billingResult11);
                        if (strA != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA);
                        }
                        return bundleC;
                    } catch (Exception e12) {
                        BillingResult billingResult12 = h0.f195f;
                        String strA2 = f0.a(e12);
                        bundleC = com.google.android.gms.internal.play_billing.r.c(5, billingResult12);
                        if (strA2 != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA2);
                        }
                        return bundleC;
                    }
                }
            }, JankRecordStore.FIRST_FLUSH_DELAY_MS, null, this.f152e, i());
            str3 = str15;
            bundle = bundle2;
        } else {
            j = r4;
            j5 = j;
            z5 = false;
            string = str;
            String str16 = str7;
            futureJ = j(new r(this, str2, str16, 0), JankRecordStore.FIRST_FLUSH_DELAY_MS, null, this.f152e, i());
            str3 = str16;
        }
        try {
            if (futureJ == null) {
                try {
                    BillingResult billingResult11 = h0.f191b;
                    x(25, billingResult11, j5, z5);
                    J(billingResult11);
                    return billingResult11;
                } catch (CancellationException e11) {
                    e = e11;
                    r7 = z5;
                    r10 = j5;
                    com.google.android.gms.internal.play_billing.r.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    BillingResult billingResult12 = h0.f198i;
                    y(4, billingResult12, f0.a(e), r10, r7);
                    J(billingResult12);
                    return billingResult12;
                } catch (TimeoutException e12) {
                    e = e12;
                    r7 = z5;
                    r10 = j5;
                    com.google.android.gms.internal.play_billing.r.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    BillingResult billingResult13 = h0.f198i;
                    y(4, billingResult13, f0.a(e), r10, r7);
                    J(billingResult13);
                    return billingResult13;
                } catch (Exception e13) {
                    e = e13;
                    r6 = z5;
                    r5 = j5;
                    com.google.android.gms.internal.play_billing.r.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    BillingResult billingResult14 = h0.f197h;
                    y(5, billingResult14, f0.a(e), r5, r6);
                    J(billingResult14);
                    return billingResult14;
                }
            }
            boolean z10 = z5;
            long j10 = j5;
            Bundle bundle3 = (Bundle) futureJ.get(JankRecordStore.FIRST_FLUSH_DELAY_MS, TimeUnit.MILLISECONDS);
            int iA2 = com.google.android.gms.internal.play_billing.r.a("BillingClient", bundle3);
            String strF = com.google.android.gms.internal.play_billing.r.f("BillingClient", bundle3);
            if (iA2 == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle3.getParcelable("BUY_INTENT"));
                intent2.putExtra("billingClientTransactionId", j10);
                intent2.putExtra("wasServiceAutoReconnected", z10);
                activity.startActivity(intent2);
                return h0.f196g;
            }
            com.google.android.gms.internal.play_billing.r.h("BillingClient", l0.U(iA2, "Unable to buy item, Error response code: "));
            BillingResult billingResultA3 = h0.a(iA2, strF);
            if (bundle3 == null) {
                i7 = 1;
                iA = 1;
            } else {
                try {
                    Object obj = bundle3.get("LOG_REASON");
                    if (obj != null) {
                        if (obj instanceof Integer) {
                            iA = com.discord.chat.presentation.list.a.a(((Integer) obj).intValue());
                            i7 = 1;
                        } else {
                            com.google.android.gms.internal.play_billing.r.h("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                        }
                    }
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.r.h("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th3.getMessage())));
                }
                i7 = 1;
                iA = 1;
            }
            if (iA == i7) {
                iA = 23;
            }
            if (bundle3 != null) {
                try {
                    string = bundle3.getString("ADDITIONAL_LOG_DETAILS");
                } catch (Throwable th4) {
                    com.google.android.gms.internal.play_billing.r.h("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th4.getMessage())));
                }
            }
            try {
                y(iA, billingResultA3, string, j10, z10);
                J(billingResultA3);
                return billingResultA3;
            } catch (CancellationException e14) {
                e = e14;
                r10 = j10;
                r7 = z10;
                com.google.android.gms.internal.play_billing.r.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                BillingResult billingResult15 = h0.f198i;
                y(4, billingResult15, f0.a(e), r10, r7);
                J(billingResult15);
                return billingResult15;
            } catch (TimeoutException e15) {
                e = e15;
                r10 = j10;
                r7 = z10;
                com.google.android.gms.internal.play_billing.r.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                BillingResult billingResult16 = h0.f198i;
                y(4, billingResult16, f0.a(e), r10, r7);
                J(billingResult16);
                return billingResult16;
            } catch (Exception e16) {
                e = e16;
                r5 = j10;
                r6 = z10;
                com.google.android.gms.internal.play_billing.r.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                BillingResult billingResult17 = h0.f197h;
                y(5, billingResult17, f0.a(e), r5, r6);
                J(billingResult17);
                return billingResult17;
            }
        } catch (CancellationException e17) {
            e = e17;
            r10 = str3;
            r7 = bundle;
        } catch (TimeoutException e18) {
            e = e18;
            r10 = str3;
            r7 = bundle;
        } catch (Exception e19) {
            e = e19;
            r5 = str3;
            r6 = bundle;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void f(QueryProductDetailsParams queryProductDetailsParams, k kVar) {
        if (j(new r(this, kVar, queryProductDetailsParams, 2), JankRecordStore.FLUSH_INTERVAL_MS, new u0(3, this, kVar), k(), i()) == null) {
            BillingResult billingResultN = n();
            u(25, 7, billingResultN);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.s.f6118e;
            com.google.android.gms.internal.play_billing.w wVar = com.google.android.gms.internal.play_billing.w.f6169w;
            kVar.a(billingResultN, new QueryProductDetailsResult(wVar, wVar));
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void g(o oVar, com.discord.billing.b bVar) {
        if (j(new r(this, bVar, oVar.f236a), JankRecordStore.FLUSH_INTERVAL_MS, new u0(1, this, bVar), k(), i()) == null) {
            BillingResult billingResultN = n();
            u(25, 9, billingResultN);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.s.f6118e;
            bVar.b(billingResultN, com.google.android.gms.internal.play_billing.w.f6169w);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void h(c cVar) {
        F(cVar);
    }

    public final synchronized ExecutorService i() {
        try {
            if (this.B == null) {
                this.B = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.r.f6105a, new u(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.B;
    }

    public final Handler k() {
        return Looper.myLooper() == null ? this.f152e : new Handler(Looper.myLooper());
    }

    public final je.u l(BillingResult billingResult, int i7, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.r.i("BillingClient", str, exc);
        w(i7, 7, billingResult, f0.a(exc));
        return new je.u(billingResult.f3788a, billingResult.f3790c, new ArrayList(), new ArrayList());
    }

    public final BillingResult m() {
        com.google.android.gms.internal.play_billing.r.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        u3 u3VarS = v3.s();
        u3VarS.c();
        v3.r((v3) u3VarS.f5994e, 6);
        s4 s4VarR = t4.r();
        s4VarR.c();
        t4.w((t4) s4VarR.f5994e);
        s4VarR.e(false);
        s4VarR.f();
        u3VarS.c();
        v3.w((v3) u3VarS.f5994e, (t4) s4VarR.a());
        C((v3) u3VarS.a());
        return h0.f196g;
    }

    public final BillingResult n() {
        int[] iArr = {0, 3};
        synchronized (this.f148a) {
            for (int i7 = 0; i7 < 2; i7++) {
                if (this.f149b == iArr[i7]) {
                    return h0.f197h;
                }
            }
            return h0.f195f;
        }
    }

    public final void o() {
        if (TextUtils.isEmpty(null)) {
            this.f154g.getPackageName();
        }
    }

    public final io.sentry.internal.debugmeta.c t(BillingResult billingResult, int i7, String str, Exception exc) {
        w(i7, 9, billingResult, f0.a(exc));
        com.google.android.gms.internal.play_billing.r.i("BillingClient", str, exc);
        return new io.sentry.internal.debugmeta.c(1, billingResult, (Object) null);
    }

    public final void u(int i7, int i10, BillingResult billingResult) {
        try {
            int i11 = f0.f183a;
            B(f0.b(i7, i10, billingResult, null, z3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void v(int i7, BillingResult billingResult, long j) {
        try {
            int i10 = f0.f183a;
            try {
                this.f155h.S(f0.b(i7, 2, billingResult, null, z3.BROADCAST_ACTION_UNSPECIFIED), this.f157l, j);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.r.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void w(int i7, int i10, BillingResult billingResult, String str) {
        try {
            int i11 = f0.f183a;
            B(f0.b(i7, i10, billingResult, str, z3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void x(int i7, BillingResult billingResult, long j, boolean z5) {
        try {
            int i10 = f0.f183a;
            try {
                this.f155h.U(f0.b(i7, 2, billingResult, null, z3.BROADCAST_ACTION_UNSPECIFIED), this.f157l, j, z5);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.r.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void y(int i7, BillingResult billingResult, String str, long j, boolean z5) {
        try {
            int i10 = f0.f183a;
            try {
                this.f155h.U(f0.b(i7, 2, billingResult, str, z3.BROADCAST_ACTION_UNSPECIFIED), this.f157l, j, z5);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.r.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void z(com.discord.billing.a aVar, String str, BillingResult billingResult, int i7, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.r.i("BillingClient", str2, exc);
        w(i7, 4, billingResult, f0.a(exc));
        aVar.a(billingResult, str);
    }

    public b(i8.b bVar, Context context, a aVar) {
        int i7 = com.google.android.gms.internal.play_billing.u.f6139i;
        this.A = com.google.android.gms.internal.play_billing.c0.G;
        long jNextLong = new Random().nextLong();
        this.C = Long.valueOf(jNextLong);
        this.D = com.google.android.gms.internal.play_billing.k.f6028a;
        this.f150c = z4.a.f23597a;
        String strP = p();
        this.f151d = strP;
        this.f154g = context.getApplicationContext();
        c4 c4VarB = d4.B();
        c4VarB.k();
        if (strP != null) {
            c4VarB.c();
            d4.A((d4) c4VarB.f5994e, strP);
        }
        c4VarB.j(this.f154g.getPackageName());
        c4VarB.c();
        d4.F((d4) c4VarB.f5994e, jNextLong);
        c4VarB.c();
        d4.y((d4) c4VarB.f5994e);
        c4VarB.e(Build.VERSION.SDK_INT);
        c4VarB.h();
        s(c4VarB, context);
        try {
            c4VarB.f(this.f154g.getPackageManager().getPackageInfo(this.f154g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Error getting app version code.", th2);
        }
        this.f155h = new e4.r(this.f154g, (d4) c4VarB.a());
        com.google.android.gms.internal.play_billing.r.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f153f = new o0(this.f154g, null, this.f155h);
        this.f171z = bVar;
        this.f154g.getPackageName();
    }
}
