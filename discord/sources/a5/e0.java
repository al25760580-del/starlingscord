package a5;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.core.util.Consumer;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.v0;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.v4;
import com.google.android.gms.internal.play_billing.w4;
import com.google.android.gms.internal.play_billing.x0;
import com.google.android.gms.internal.play_billing.x1;
import com.google.android.gms.internal.play_billing.x4;
import com.google.android.gms.internal.play_billing.y4;
import com.google.android.gms.internal.play_billing.z1;
import com.google.android.gms.internal.play_billing.z3;
import com.google.android.gms.internal.play_billing.z4;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends b {
    public final Context E;
    public volatile int F;
    public volatile com.google.android.gms.internal.play_billing.i G;
    public volatile d0 H;
    public volatile ScheduledExecutorService I;

    public e0(i8.b bVar, Context context, a aVar) {
        super(bVar, context, aVar);
        this.F = 0;
        this.E = context;
    }

    public final synchronized boolean M() {
        return (this.F != 2 || this.G == null || this.H == null) ? false : true;
    }

    public final x0 N(int i7) {
        if (!M()) {
            com.google.android.gms.internal.play_billing.r.h("BillingClientTesting", "Billing Override Service is not ready.");
            O(94, 28, h0.a(-1, "Billing Override Service connection is disconnected."));
            return new v0(0);
        }
        b0 b0Var = new b0(i7, 0, this);
        w4 w4Var = new w4();
        w4Var.f6182c = new z4();
        y4 y4Var = new y4(w4Var);
        w4Var.f6181b = y4Var;
        w4Var.f6180a = b0.class;
        try {
            b0Var.I(w4Var);
            w4Var.f6180a = "billingOverrideService.getBillingOverride";
            return y4Var;
        } catch (Exception e10) {
            x1 x1Var = new x1(e10);
            z1 z1Var = v4.f6164x;
            x4 x4Var = y4Var.f6193e;
            if (z1Var.w(x4Var, null, x1Var)) {
                v4.d(x4Var);
            }
            return y4Var;
        }
    }

    public final void O(int i7, int i10, BillingResult billingResult) {
        int i11 = f0.f183a;
        t3 t3VarB = f0.b(i7, i10, billingResult, null, z3.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(t3VarB, "ApiFailure should not be null");
        this.f155h.Q(t3VarB);
    }

    public final void P(int i7) {
        int i10 = f0.f183a;
        v3 v3VarC = f0.c(i7, z3.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(v3VarC, "ApiSuccess should not be null");
        e4.r rVar = this.f155h;
        rVar.getClass();
        try {
            rVar.b0(v3VarC, (d4) rVar.f8034e);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to log.", th2);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void Q(int r8, androidx.core.util.Consumer r9, java.lang.Runnable r10) throws java.lang.Throwable {
        /*
            r7 = this;
            com.google.android.gms.internal.play_billing.x0 r0 = r7.N(r8)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            monitor-enter(r7)
            java.util.concurrent.ScheduledExecutorService r2 = r7.I     // Catch: java.lang.Throwable -> L54
            if (r2 != 0) goto L16
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()     // Catch: java.lang.Throwable -> L12
            r7.I = r2     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r0 = move-exception
            r8 = r0
            r4 = r7
            goto L57
        L16:
            java.util.concurrent.ScheduledExecutorService r2 = r7.I     // Catch: java.lang.Throwable -> L54
            monitor-exit(r7)
            boolean r3 = r0.isDone()
            if (r3 == 0) goto L20
            goto L3c
        L20:
            com.google.android.gms.internal.play_billing.a1 r3 = new com.google.android.gms.internal.play_billing.a1
            r3.<init>()
            r3.E = r0
            com.google.android.gms.internal.play_billing.y0 r4 = new com.google.android.gms.internal.play_billing.y0
            r4.<init>()
            r4.f6189d = r3
            r5 = 28500(0x6f54, double:1.4081E-319)
            java.util.concurrent.ScheduledFuture r1 = r2.schedule(r4, r5, r1)
            r3.F = r1
            com.google.android.gms.internal.play_billing.t0 r1 = com.google.android.gms.internal.play_billing.t0.f6134d
            r0.b(r4, r1)
            r0 = r3
        L3c:
            we.k r1 = new we.k
            r3 = 1
            r4 = r7
            r2 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.ExecutorService r8 = r7.i()
            com.google.android.gms.internal.play_billing.u0 r9 = new com.google.android.gms.internal.play_billing.u0
            r10 = 0
            r9.<init>(r10, r0, r1)
            r0.b(r9, r8)
            return
        L54:
            r0 = move-exception
            r4 = r7
        L56:
            r8 = r0
        L57:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L59
            throw r8
        L59:
            r0 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.e0.Q(int, androidx.core.util.Consumer, java.lang.Runnable):void");
    }

    @Override // a5.b, com.android.billingclient.api.BillingClient
    public final void a(final h hVar, final com.discord.billing.a aVar) throws Throwable {
        Q(4, new Consumer() { // from class: a5.a0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                String str = hVar.f189b;
                aVar.a((BillingResult) obj, str);
            }
        }, new t(this, hVar, aVar));
    }

    @Override // a5.b, com.android.billingclient.api.BillingClient
    public final void b() {
        synchronized (this) {
            P(27);
            try {
                try {
                    if (this.H != null && this.G != null) {
                        com.google.android.gms.internal.play_billing.r.g("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.E.unbindService(this.H);
                        this.H = new d0(0, this);
                    }
                    this.G = null;
                    if (this.I != null) {
                        this.I.shutdownNow();
                        this.I = null;
                    }
                } catch (RuntimeException e10) {
                    com.google.android.gms.internal.play_billing.r.i("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e10);
                }
                this.F = 3;
            } catch (Throwable th2) {
                this.F = 3;
                throw th2;
            }
        }
        super.b();
    }

    @Override // a5.b, com.android.billingclient.api.BillingClient
    public final BillingResult e(Activity activity, BillingFlowParams billingFlowParams) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) N(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            O(102, 28, h0.f205r);
            com.google.android.gms.internal.play_billing.r.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            O(95, 28, h0.f205r);
            com.google.android.gms.internal.play_billing.r.i("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
        }
        if (iIntValue > 0) {
            BillingResult billingResultA = h0.a(iIntValue, "Billing override value was set by a license tester.");
            O(93, 2, billingResultA);
            J(billingResultA);
            return billingResultA;
        }
        try {
            return super.e(activity, billingFlowParams);
        } catch (Exception e12) {
            BillingResult billingResult = h0.f195f;
            O(103, 2, billingResult);
            com.google.android.gms.internal.play_billing.r.i("BillingClientTesting", "An internal error occurred.", e12);
            return billingResult;
        }
    }

    @Override // a5.b, com.android.billingclient.api.BillingClient
    public final void f(QueryProductDetailsParams queryProductDetailsParams, k kVar) throws Throwable {
        Q(7, new z(0, kVar), new t(this, queryProductDetailsParams, kVar, 1));
    }

    @Override // a5.b, com.android.billingclient.api.BillingClient
    public final void h(c cVar) {
        synchronized (this) {
            if (M()) {
                com.google.android.gms.internal.play_billing.r.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                P(26);
            } else {
                int i7 = 1;
                if (this.F == 1) {
                    com.google.android.gms.internal.play_billing.r.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.F == 3) {
                    com.google.android.gms.internal.play_billing.r.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    O(38, 26, h0.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.F = 1;
                    com.google.android.gms.internal.play_billing.r.g("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.H = new d0(0, this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    Context context = this.E;
                    List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        i7 = 41;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                com.google.android.gms.internal.play_billing.r.h("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (context.bindService(intent2, this.H, 1)) {
                                    com.google.android.gms.internal.play_billing.r.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    com.google.android.gms.internal.play_billing.r.h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i7 = 39;
                        }
                    }
                    this.F = 0;
                    com.google.android.gms.internal.play_billing.r.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                    O(i7, 26, h0.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        F(cVar);
    }

    public e0(i8.b bVar, Context context, com.discord.billing.b bVar2, a aVar) {
        super(bVar, context, bVar2, aVar);
        this.F = 0;
        this.E = context;
    }
}
