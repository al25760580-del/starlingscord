package io.sentry.android.core;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.appcompat.widget.b4;
import io.sentry.SentryLevel;
import io.sentry.c3;
import io.sentry.d3;
import io.sentry.w5;
import io.sentry.x3;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12161e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f12162i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f12163v;

    public /* synthetic */ c1(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.x0 x0Var, SentryAndroidOptions sentryAndroidOptions) {
        this.f12160d = 4;
        this.f12161e = systemEventsBreadcrumbsIntegration;
        this.f12163v = x0Var;
        this.f12162i = sentryAndroidOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12160d) {
            case 0:
                SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration = (SendCachedEnvelopeIntegration) this.f12161e;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f12162i;
                io.sentry.x0 x0Var = (io.sentry.x0) this.f12163v;
                try {
                    if (sendCachedEnvelopeIntegration.F.get()) {
                        sentryAndroidOptions.getLogger().q(SentryLevel.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                        return;
                    }
                    if (!sendCachedEnvelopeIntegration.E.getAndSet(true)) {
                        io.sentry.m0 connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                        sendCachedEnvelopeIntegration.f12112v = connectionStatusProvider;
                        connectionStatusProvider.M(sendCachedEnvelopeIntegration);
                        sendCachedEnvelopeIntegration.f12115y = sendCachedEnvelopeIntegration.f12109d.u(x0Var, sentryAndroidOptions);
                    }
                    io.sentry.m0 m0Var = sendCachedEnvelopeIntegration.f12112v;
                    if (m0Var != null && m0Var.I() == io.sentry.k0.DISCONNECTED) {
                        sentryAndroidOptions.getLogger().q(SentryLevel.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                        return;
                    }
                    io.sentry.transport.p pVarD = x0Var.d();
                    if (pVarD != null && pVarD.f(io.sentry.l.All)) {
                        sentryAndroidOptions.getLogger().q(SentryLevel.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                        return;
                    }
                    x3 x3Var = sendCachedEnvelopeIntegration.f12115y;
                    if (x3Var == null) {
                        sentryAndroidOptions.getLogger().q(SentryLevel.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
                        return;
                    } else {
                        x3Var.a();
                        return;
                    }
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Failed trying to send cached events.", th2);
                    return;
                }
            case 1:
                b4 b4Var = (b4) this.f12161e;
                Runnable runnable = (Runnable) this.f12162i;
                String str = (String) this.f12163v;
                b4Var.getClass();
                try {
                    runnable.run();
                    return;
                } catch (Throwable unused) {
                    if (str != null) {
                        ((SentryAndroidOptions) b4Var.f910e).getLogger().q(SentryLevel.WARNING, "Failed to execute ".concat(str), new Object[0]);
                        return;
                    }
                    return;
                }
            case 2:
                g gVar = (g) this.f12161e;
                w5 w5Var = (w5) this.f12162i;
                io.sentry.x0 x0Var2 = (io.sentry.x0) this.f12163v;
                ArrayList<c3> arrayList = gVar.J;
                if (gVar.M.get()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                io.sentry.r rVarA = gVar.T.a();
                try {
                    for (c3 c3Var : arrayList) {
                        arrayList2.add(new d3(c3Var.f12507a, c3Var.f12508b, c3Var.f12510d, c3Var.f12509c, Double.valueOf(c3Var.f12511e), c3Var.f12512f, w5Var));
                    }
                    arrayList.clear();
                    rVarA.close();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        x0Var2.h((d3) it.next());
                    }
                    return;
                } catch (Throwable th3) {
                    try {
                        rVarA.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            case 3:
                EnvelopeFileObserverIntegration envelopeFileObserverIntegration = (EnvelopeFileObserverIntegration) this.f12161e;
                w5 w5Var2 = (w5) this.f12162i;
                String str2 = (String) this.f12163v;
                io.sentry.r rVarA2 = envelopeFileObserverIntegration.f12099v.a();
                try {
                    if (!envelopeFileObserverIntegration.f12098i) {
                        envelopeFileObserverIntegration.c(w5Var2, str2);
                        break;
                    }
                    rVarA2.close();
                    return;
                } catch (Throwable th5) {
                    try {
                        rVarA2.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            default:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.f12161e;
                io.sentry.x0 x0Var3 = (io.sentry.x0) this.f12163v;
                SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) this.f12162i;
                io.sentry.r rVarA3 = systemEventsBreadcrumbsIntegration.H.a();
                try {
                    if (!systemEventsBreadcrumbsIntegration.f12125x && !systemEventsBreadcrumbsIntegration.f12126y && systemEventsBreadcrumbsIntegration.f12121e == null) {
                        systemEventsBreadcrumbsIntegration.f12121e = new j1(systemEventsBreadcrumbsIntegration, x0Var3, sentryAndroidOptions2);
                        if (systemEventsBreadcrumbsIntegration.E == null) {
                            systemEventsBreadcrumbsIntegration.E = new IntentFilter();
                            for (String str3 : systemEventsBreadcrumbsIntegration.f12124w) {
                                systemEventsBreadcrumbsIntegration.E.addAction(str3);
                            }
                        }
                        if (systemEventsBreadcrumbsIntegration.F == null) {
                            systemEventsBreadcrumbsIntegration.F = new HandlerThread("SystemEventsReceiver", 10);
                            systemEventsBreadcrumbsIntegration.F.start();
                        }
                        try {
                            l0.j(systemEventsBreadcrumbsIntegration.f12120d, new k0(sentryAndroidOptions2.getLogger()), systemEventsBreadcrumbsIntegration.f12121e, systemEventsBreadcrumbsIntegration.E, new Handler(systemEventsBreadcrumbsIntegration.F.getLooper()));
                            if (!systemEventsBreadcrumbsIntegration.G.getAndSet(true)) {
                                sentryAndroidOptions2.getLogger().q(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                                c9.a.c("SystemEventsBreadcrumbs");
                            }
                        } catch (Throwable th7) {
                            sentryAndroidOptions2.setEnableSystemEventBreadcrumbs(false);
                            sentryAndroidOptions2.getLogger().g(SentryLevel.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th7);
                        }
                        break;
                    }
                    rVarA3.close();
                    return;
                } catch (Throwable th8) {
                    try {
                        rVarA3.close();
                        throw th8;
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                        throw th8;
                    }
                }
        }
    }

    public /* synthetic */ c1(Object obj, Object obj2, Object obj3, int i7) {
        this.f12160d = i7;
        this.f12161e = obj;
        this.f12162i = obj2;
        this.f12163v = obj3;
    }
}
