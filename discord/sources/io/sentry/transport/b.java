package io.sentry.transport;

import io.sentry.Hint;
import io.sentry.SentryLevel;
import io.sentry.l4;
import io.sentry.w5;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e4.c f13168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Hint f13169e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final io.sentry.cache.d f13170i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final r f13171v = new r(-1);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f13172w;

    public b(c cVar, e4.c cVar2, Hint hint, io.sentry.cache.d dVar) {
        this.f13172w = cVar;
        com.facebook.imagepipeline.nativecode.c.H(cVar2, "Envelope is required.");
        this.f13168d = cVar2;
        this.f13169e = hint;
        com.facebook.imagepipeline.nativecode.c.H(dVar, "EnvelopeCache is required.");
        this.f13170i = dVar;
    }

    public static /* synthetic */ void a(b bVar, sa.a aVar, io.sentry.hints.k kVar) {
        bVar.f13172w.f13175i.getLogger().q(SentryLevel.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(aVar.v()));
        kVar.b(aVar.v());
    }

    public final sa.a b() {
        e4.c cVar = this.f13168d;
        ((l4) cVar.f7966e).f12799v = null;
        io.sentry.cache.d dVar = this.f13170i;
        Hint hint = this.f13169e;
        boolean zN = dVar.n(cVar, hint);
        Object objB = hint.b("sentry:typeCheckHint");
        boolean zIsInstance = io.sentry.hints.c.class.isInstance(hint.b("sentry:typeCheckHint"));
        c cVar2 = this.f13172w;
        if (zIsInstance && objB != null) {
            io.sentry.hints.c cVar3 = (io.sentry.hints.c) objB;
            w5 w5Var = cVar2.f13175i;
            if (cVar3.e(((l4) cVar.f7966e).f12796d)) {
                cVar3.f12723d.countDown();
                w5Var.getLogger().q(SentryLevel.DEBUG, "Disk flush envelope fired", new Object[0]);
            } else {
                w5Var.getLogger().q(SentryLevel.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            }
        }
        w5 w5Var2 = cVar2.f13175i;
        if (!cVar2.f13177w.isConnected()) {
            Object objB2 = hint.b("sentry:typeCheckHint");
            boolean zIsInstance2 = io.sentry.hints.h.class.isInstance(hint.b("sentry:typeCheckHint"));
            r rVar = this.f13171v;
            if (zIsInstance2 && objB2 != null) {
                ((io.sentry.hints.h) objB2).c(true);
                return rVar;
            }
            if (!zN) {
                com.facebook.imagepipeline.nativecode.b.r(io.sentry.hints.h.class, objB2, w5Var2.getLogger());
                w5Var2.getClientReportRecorder().k(io.sentry.clientreport.d.NETWORK_ERROR, cVar);
            }
            return rVar;
        }
        e4.c cVarU = w5Var2.getClientReportRecorder().u(cVar);
        try {
            try {
                ((l4) cVarU.f7966e).f12799v = io.sentry.config.a.z(Double.valueOf(w5Var2.getDateProvider().now().d() / 1000000.0d).longValue());
                sa.a aVarD = cVar2.f13178x.d(cVarU);
                if (aVarD.v()) {
                    dVar.Q(cVar);
                    return aVarD;
                }
                String str = "The transport failed to send the envelope with response code " + aVarD.o();
                w5Var2.getLogger().q(SentryLevel.ERROR, str, new Object[0]);
                if (aVarD.o() >= 400) {
                    dVar.Q(cVar);
                    if (aVarD.o() != 429) {
                        w5Var2.getClientReportRecorder().k(io.sentry.clientreport.d.NETWORK_ERROR, cVarU);
                    }
                }
                throw new IllegalStateException(str);
            } catch (IOException e10) {
                e = e10;
                Object objB3 = hint.b("sentry:typeCheckHint");
                if (io.sentry.hints.h.class.isInstance(hint.b("sentry:typeCheckHint")) && objB3 != null) {
                    ((io.sentry.hints.h) objB3).c(true);
                } else if (!zN) {
                    com.facebook.imagepipeline.nativecode.b.r(io.sentry.hints.h.class, objB3, w5Var2.getLogger());
                    w5Var2.getClientReportRecorder().k(io.sentry.clientreport.d.NETWORK_ERROR, cVarU);
                }
                throw new IllegalStateException("Sending the event failed.", e);
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13172w.f13179y = this;
        sa.a aVarB = this.f13171v;
        try {
            aVarB = b();
            this.f13172w.f13175i.getLogger().q(SentryLevel.DEBUG, "Envelope flushed", new Object[0]);
            Hint hint = this.f13169e;
            Object objB = hint.b("sentry:typeCheckHint");
            if (io.sentry.hints.k.class.isInstance(hint.b("sentry:typeCheckHint")) && objB != null) {
                a(this, aVarB, (io.sentry.hints.k) objB);
            }
            this.f13172w.f13179y = null;
        } catch (Throwable th2) {
            try {
                this.f13172w.f13175i.getLogger().e(SentryLevel.ERROR, th2, "Envelope submission failed", new Object[0]);
                throw th2;
            } catch (Throwable th3) {
                Hint hint2 = this.f13169e;
                Object objB2 = hint2.b("sentry:typeCheckHint");
                if (io.sentry.hints.k.class.isInstance(hint2.b("sentry:typeCheckHint")) && objB2 != null) {
                    a(this, aVarB, (io.sentry.hints.k) objB2);
                }
                this.f13172w.f13179y = null;
                throw th3;
            }
        }
    }
}
