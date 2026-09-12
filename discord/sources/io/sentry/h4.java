package io.sentry;

import androidx.core.graphics.Insets;
import androidx.dynamicanimation.animation.SpringAnimation;
import com.discord.crash_reporting.CrashReporting;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h4 implements z0, af.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f12714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f12715f;

    public h4() {
        this.f12714e = rn.l.b(new i6.a(9, this));
    }

    public static ArrayList r(Hint hint) {
        ArrayList arrayList = new ArrayList(hint.f12013b);
        a aVar = hint.f12015d;
        if (aVar != null) {
            arrayList.add(aVar);
        }
        a aVar2 = hint.f12016e;
        if (aVar2 != null) {
            arrayList.add(aVar2);
        }
        a aVar3 = hint.f12017f;
        if (aVar3 != null) {
            arrayList.add(aVar3);
        }
        return arrayList;
    }

    public void A(xe.b bVar) {
        ze.m mVar = (ze.m) ((ze.e) this.f12715f).G.get((ze.a) this.f12712c);
        if (mVar != null) {
            mVar.o(bVar);
        }
    }

    @Override // io.sentry.z0
    public void a(boolean z5) {
        long shutdownTimeoutMillis;
        w5 w5Var = (w5) this.f12711b;
        w5Var.getLogger().q(SentryLevel.INFO, "Closing SentryClient.", new Object[0]);
        if (z5) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = w5Var.getShutdownTimeoutMillis();
            } catch (IOException e10) {
                w5Var.getLogger().g(SentryLevel.WARNING, "Failed to close the connection to the Sentry Server.", e10);
            }
        }
        b(shutdownTimeoutMillis);
        ((io.sentry.logger.a) this.f12714e).a(z5);
        ((io.sentry.metrics.a) this.f12715f).a(z5);
        ((io.sentry.transport.g) this.f12712c).a(z5);
        for (b0 b0Var : w5Var.getEventProcessors()) {
            if (b0Var instanceof Closeable) {
                try {
                    ((Closeable) b0Var).close();
                } catch (IOException e11) {
                    w5Var.getLogger().q(SentryLevel.WARNING, "Failed to close the event processor {}.", b0Var, e11);
                }
            }
        }
        this.f12710a = false;
    }

    @Override // io.sentry.z0
    public void b(long j) {
        ((io.sentry.logger.a) this.f12714e).b(j);
        ((io.sentry.metrics.a) this.f12715f).b(j);
        ((io.sentry.transport.g) this.f12712c).b(j);
    }

    @Override // io.sentry.z0
    public void c(h6 h6Var, Hint hint) {
        w5 w5Var = (w5) this.f12711b;
        com.facebook.imagepipeline.nativecode.c.H(h6Var, "Session is required.");
        String str = h6Var.J;
        if (str == null || str.isEmpty()) {
            w5Var.getLogger().q(SentryLevel.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            c1 serializer = w5Var.getSerializer();
            io.sentry.protocol.t sdkVersion = w5Var.getSdkVersion();
            com.facebook.imagepipeline.nativecode.c.H(serializer, "Serializer is required.");
            i(new e4.c((io.sentry.protocol.v) null, sdkVersion, p4.d(serializer, h6Var)), hint);
        } catch (IOException e10) {
            w5Var.getLogger().g(SentryLevel.ERROR, "Failed to capture session.", e10);
        }
    }

    @Override // io.sentry.z0
    public io.sentry.transport.p d() {
        return ((io.sentry.transport.g) this.f12712c).d();
    }

    @Override // io.sentry.z0
    public boolean e() {
        return ((io.sentry.transport.g) this.f12712c).e();
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.v f(y5 y5Var, IScope iScope, Hint hint) {
        w5 w5Var = (w5) this.f12711b;
        com.facebook.imagepipeline.nativecode.c.H(y5Var, "SessionReplay is required.");
        if (z(y5Var, hint)) {
            io.sentry.protocol.p pVar = y5Var.f12673v;
            io.sentry.protocol.c cVar = y5Var.f12671e;
            if (pVar == null) {
                y5Var.f12673v = iScope.R();
            }
            if (y5Var.F == null) {
                y5Var.F = iScope.Q();
            }
            if (y5Var.f12674w == null) {
                y5Var.f12674w = new HashMap(new HashMap(iScope.D()));
            } else {
                for (Map.Entry entry : iScope.D().entrySet()) {
                    if (!y5Var.f12674w.containsKey(entry.getKey())) {
                        y5Var.f12674w.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            for (Map.Entry entry2 : new io.sentry.protocol.c(iScope.J()).f12923d.entrySet()) {
                if (!cVar.a(entry2.getKey())) {
                    cVar.k(entry2.getValue(), (String) entry2.getKey());
                }
            }
            ISpan iSpanT = iScope.t();
            if (cVar.i() == null) {
                if (iSpanT == null) {
                    cVar.w(q6.b(iScope.z()));
                } else {
                    cVar.w(iSpanT.o());
                }
            }
        }
        w5Var.getLogger().q(SentryLevel.DEBUG, "Capturing session replay: %s", y5Var.f12670d);
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f13055e;
        io.sentry.protocol.v vVar2 = y5Var.f12670d;
        if (vVar2 != null) {
            vVar = vVar2;
        }
        for (b0 b0Var : w5Var.getEventProcessors()) {
            try {
                y5Var = b0Var.c(y5Var, hint);
            } catch (Throwable th2) {
                w5Var.getLogger().e(SentryLevel.ERROR, th2, "An exception occurred while processing replay event by processor: %s", b0Var.getClass().getName());
            }
            if (y5Var == null) {
                w5Var.getLogger().q(SentryLevel.DEBUG, "Replay event was dropped by a processor: %s", b0Var.getClass().getName());
                w5Var.getClientReportRecorder().b(io.sentry.clientreport.d.EVENT_PROCESSOR, l.Replay);
                break;
            }
        }
        if (y5Var != null) {
            w5Var.getBeforeSendReplay();
        }
        if (y5Var == null) {
            return io.sentry.protocol.v.f13055e;
        }
        try {
            e4.c cVarQ = q(y5Var, hint.f12018g, t(iScope, hint, y5Var, null), io.sentry.hints.b.class.isInstance(hint.b("sentry:typeCheckHint")));
            hint.a();
            ((io.sentry.transport.g) this.f12712c).D(cVarQ, hint);
            return vVar;
        } catch (IOException e10) {
            w5Var.getLogger().e(SentryLevel.WARNING, e10, "Capturing event %s failed.", vVar);
            return io.sentry.protocol.v.f13055e;
        }
    }

    @Override // af.b
    public void g(xe.b bVar) {
        ((ze.e) this.f12715f).K.post(new com.google.android.gms.internal.play_billing.u0(this, bVar, 26, false));
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.v h(d3 d3Var) {
        com.facebook.imagepipeline.nativecode.c.H(d3Var, "profileChunk is required.");
        w5 w5Var = (w5) this.f12711b;
        w5Var.getLogger().q(SentryLevel.DEBUG, "Capturing profile chunk: %s", d3Var.f12614i);
        io.sentry.protocol.v vVar = d3Var.f12614i;
        io.sentry.protocol.d dVarA = io.sentry.protocol.d.a(d3Var.f12612d, w5Var);
        if (dVarA != null) {
            d3Var.f12612d = dVarA;
        }
        try {
            return y(new e4.c(new l4(vVar, w5Var.getSdkVersion(), null), Collections.singletonList(p4.c(d3Var, w5Var.getSerializer(), w5Var.getProfilerConverter()))), null);
        } catch (io.sentry.exception.b | IOException e10) {
            w5Var.getLogger().e(SentryLevel.WARNING, e10, "Capturing profile chunk %s failed.", vVar);
            return io.sentry.protocol.v.f13055e;
        }
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.v i(e4.c cVar, Hint hint) {
        try {
            hint.a();
            return y(cVar, hint);
        } catch (IOException e10) {
            ((w5) this.f12711b).getLogger().g(SentryLevel.ERROR, "Failed to capture envelope.", e10);
            return io.sentry.protocol.v.f13055e;
        }
    }

    @Override // io.sentry.z0
    public boolean isEnabled() {
        return this.f12710a;
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.v j(io.sentry.protocol.d0 d0Var, o6 o6Var, IScope iScope, Hint hint, g3 g3Var) {
        Throwable th2;
        w5 w5Var = (w5) this.f12711b;
        if (hint == null) {
            hint = new Hint();
        }
        if (z(d0Var, hint)) {
            hint.f12013b.addAll(iScope.H());
        }
        w5Var.getLogger().q(SentryLevel.DEBUG, "Capturing transaction: %s", d0Var.f12670d);
        List<e0> ignoredTransactions = w5Var.getIgnoredTransactions();
        String str = d0Var.M;
        if (str != null && ignoredTransactions != null && !ignoredTransactions.isEmpty()) {
            Iterator<e0> it = ignoredTransactions.iterator();
            while (it.hasNext()) {
                if (it.next().f12635a.equalsIgnoreCase(str)) {
                    w5Var.getLogger().q(SentryLevel.DEBUG, "Transaction was dropped as transaction name %s is ignored", d0Var.M);
                    io.sentry.clientreport.f clientReportRecorder = w5Var.getClientReportRecorder();
                    io.sentry.clientreport.d dVar = io.sentry.clientreport.d.EVENT_PROCESSOR;
                    clientReportRecorder.b(dVar, l.Transaction);
                    w5Var.getClientReportRecorder().m(dVar, l.Span, d0Var.P.size() + 1);
                    return io.sentry.protocol.v.f13055e;
                }
            }
            Iterator<e0> it2 = ignoredTransactions.iterator();
            while (it2.hasNext()) {
                Pattern pattern = it2.next().f12636b;
                if (pattern == null ? false : pattern.matcher(str).matches()) {
                    w5Var.getLogger().q(SentryLevel.DEBUG, "Transaction was dropped as transaction name %s is ignored", d0Var.M);
                    io.sentry.clientreport.f clientReportRecorder2 = w5Var.getClientReportRecorder();
                    io.sentry.clientreport.d dVar2 = io.sentry.clientreport.d.EVENT_PROCESSOR;
                    clientReportRecorder2.b(dVar2, l.Transaction);
                    w5Var.getClientReportRecorder().m(dVar2, l.Span, d0Var.P.size() + 1);
                    return io.sentry.protocol.v.f13055e;
                }
            }
        }
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f13055e;
        io.sentry.protocol.v vVar2 = d0Var.f12670d;
        if (vVar2 == null) {
            vVar2 = vVar;
        }
        if (z(d0Var, hint)) {
            m(d0Var, iScope);
            d0Var = w(d0Var, hint, iScope.S());
            if (d0Var == null) {
                w5Var.getLogger().q(SentryLevel.DEBUG, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (d0Var != null) {
            d0Var = w(d0Var, hint, w5Var.getEventProcessors());
        }
        io.sentry.protocol.d0 d0Var2 = d0Var;
        if (d0Var2 == null) {
            w5Var.getLogger().q(SentryLevel.DEBUG, "Transaction was dropped by Event processors.", new Object[0]);
            return vVar;
        }
        ArrayList arrayList = d0Var2.P;
        int size = arrayList.size();
        w5Var.getBeforeSendTransaction();
        int size2 = arrayList.size();
        if (size2 < size) {
            int i7 = size - size2;
            w5Var.getLogger().q(SentryLevel.DEBUG, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i7));
            w5Var.getClientReportRecorder().m(io.sentry.clientreport.d.BEFORE_SEND, l.Span, i7);
        }
        try {
            ArrayList arrayListR = r(hint);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayListR.iterator();
            while (it3.hasNext()) {
                try {
                    try {
                        ((a) it3.next()).getClass();
                    } catch (io.sentry.exception.b e10) {
                        e = e10;
                        th2 = e;
                        w5Var.getLogger().e(SentryLevel.WARNING, th2, "Capturing transaction %s failed.", vVar2);
                        return io.sentry.protocol.v.f13055e;
                    } catch (IOException e11) {
                        e = e11;
                        th2 = e;
                        w5Var.getLogger().e(SentryLevel.WARNING, th2, "Capturing transaction %s failed.", vVar2);
                        return io.sentry.protocol.v.f13055e;
                    }
                } catch (io.sentry.exception.b e12) {
                    e = e12;
                } catch (IOException e13) {
                    e = e13;
                }
            }
            try {
                e4.c cVarN = n(d0Var2, arrayList2, null, o6Var, g3Var);
                hint.a();
                return cVarN != null ? y(cVarN, hint) : vVar2;
            } catch (io.sentry.exception.b e14) {
                e = e14;
                th2 = e;
                w5Var.getLogger().e(SentryLevel.WARNING, th2, "Capturing transaction %s failed.", vVar2);
                return io.sentry.protocol.v.f13055e;
            } catch (IOException e15) {
                e = e15;
                th2 = e;
                w5Var.getLogger().e(SentryLevel.WARNING, th2, "Capturing transaction %s failed.", vVar2);
                return io.sentry.protocol.v.f13055e;
            }
        } catch (io.sentry.exception.b | IOException e16) {
            e = e16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x022b  */
    /* JADX WARN: Code duplicated, block: B:115:0x022c A[Catch: all -> 0x0205, TryCatch #3 {all -> 0x0205, blocks: (B:91:0x01ba, B:94:0x01c2, B:97:0x01ca, B:107:0x0208, B:109:0x020c, B:111:0x0212, B:112:0x0225, B:115:0x022c, B:117:0x0235, B:103:0x01f9, B:99:0x01e8), top: B:231:0x01ba, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0235 A[Catch: all -> 0x0205, TRY_LEAVE, TryCatch #3 {all -> 0x0205, blocks: (B:91:0x01ba, B:94:0x01c2, B:97:0x01ca, B:107:0x0208, B:109:0x020c, B:111:0x0212, B:112:0x0225, B:115:0x022c, B:117:0x0235, B:103:0x01f9, B:99:0x01e8), top: B:231:0x01ba, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0277  */
    /* JADX WARN: Code duplicated, block: B:137:0x027d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x027f  */
    /* JADX WARN: Code duplicated, block: B:139:0x028a  */
    /* JADX WARN: Code duplicated, block: B:140:0x0297  */
    /* JADX WARN: Code duplicated, block: B:155:0x02df  */
    /* JADX WARN: Code duplicated, block: B:193:0x035c  */
    /* JADX WARN: Code duplicated, block: B:196:0x0367  */
    /* JADX WARN: Code duplicated, block: B:226:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:227:0x03d6  */
    @Override // io.sentry.z0
    public io.sentry.protocol.v k(SentryEvent sentryEvent, IScope iScope, Hint hint) {
        SentryEvent sentryEventInit$lambda$3$lambda$1;
        List list;
        h6 h6VarA;
        h6 h6Var;
        SentryEvent sentryEvent2;
        boolean z5;
        String str;
        f1 f1VarN;
        Object objB;
        io.sentry.protocol.v vVar;
        io.sentry.protocol.h hVarH;
        w5 w5Var = (w5) this.f12711b;
        if (hint == null) {
            hint = new Hint();
        }
        if (z(sentryEvent, hint) && iScope != null) {
            hint.f12013b.addAll(iScope.H());
        }
        ILogger logger = w5Var.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.q(sentryLevel, "Capturing event: %s", sentryEvent.f12670d);
        Throwable thA = sentryEvent.a();
        if (thA != null && w5Var.getIgnoredExceptionsForType().contains(thA.getClass())) {
            w5Var.getLogger().q(sentryLevel, "Event was dropped as the exception %s is ignored", thA.getClass());
            w5Var.getClientReportRecorder().b(io.sentry.clientreport.d.EVENT_PROCESSOR, l.Error);
            return io.sentry.protocol.v.f13055e;
        }
        List<e0> ignoredErrors = w5Var.getIgnoredErrors();
        if (ignoredErrors != null && !ignoredErrors.isEmpty()) {
            HashSet<String> hashSet = new HashSet();
            io.sentry.protocol.n nVar = sentryEvent.N;
            if (nVar != null) {
                String str2 = nVar.f13003e;
                if (str2 != null) {
                    hashSet.add(str2);
                }
                String str3 = nVar.f13002d;
                if (str3 != null) {
                    hashSet.add(str3);
                }
            }
            Throwable thA2 = sentryEvent.a();
            if (thA2 != null) {
                hashSet.add(thA2.toString());
            }
            Iterator<e0> it = ignoredErrors.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(it.next().f12635a)) {
                    w5Var.getLogger().q(SentryLevel.DEBUG, "Event was dropped as it matched a string/pattern in ignoredErrors", sentryEvent.N);
                    w5Var.getClientReportRecorder().b(io.sentry.clientreport.d.EVENT_PROCESSOR, l.Error);
                    return io.sentry.protocol.v.f13055e;
                }
            }
            for (e0 e0Var : ignoredErrors) {
                for (String str4 : hashSet) {
                    Pattern pattern = e0Var.f12636b;
                    if (pattern == null ? false : pattern.matcher(str4).matches()) {
                        w5Var.getLogger().q(SentryLevel.DEBUG, "Event was dropped as it matched a string/pattern in ignoredErrors", sentryEvent.N);
                        w5Var.getClientReportRecorder().b(io.sentry.clientreport.d.EVENT_PROCESSOR, l.Error);
                        return io.sentry.protocol.v.f13055e;
                    }
                }
            }
        }
        if (z(sentryEvent, hint)) {
            if (iScope != null) {
                m(sentryEvent, iScope);
                String str5 = sentryEvent.S;
                io.sentry.protocol.c cVar = sentryEvent.f12671e;
                if (str5 == null) {
                    sentryEvent.S = iScope.T();
                }
                if (sentryEvent.T == null) {
                    List listP = iScope.P();
                    sentryEvent.T = listP != null ? new ArrayList(listP) : null;
                }
                if (iScope.x() != null) {
                    sentryEvent.R = iScope.x();
                }
                ISpan iSpanT = iScope.t();
                if (cVar.i() == null) {
                    if (iSpanT == null) {
                        cVar.w(q6.b(iScope.z()));
                    } else {
                        cVar.w(iSpanT.o());
                    }
                }
                if (cVar.f() == null && (hVarH = iScope.h()) != null) {
                    cVar.q(hVarH);
                }
                sentryEvent = v(sentryEvent, hint, iScope.S());
            }
            if (sentryEvent == null) {
                w5Var.getLogger().q(SentryLevel.DEBUG, "Event was dropped by applyScope", new Object[0]);
                return io.sentry.protocol.v.f13055e;
            }
        }
        SentryEvent sentryEventV = v(sentryEvent, hint, w5Var.getEventProcessors());
        if (sentryEventV != null) {
            j5 beforeSend = w5Var.getBeforeSend();
            if (beforeSend != null) {
                try {
                    sentryEventV = beforeSend.a(sentryEventV, hint);
                } catch (Throwable th2) {
                    w5Var.getLogger().g(SentryLevel.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th2);
                    sentryEventV = null;
                }
            }
            if (sentryEventV == null) {
                w5Var.getLogger().q(SentryLevel.DEBUG, "Event was dropped by beforeSend", new Object[0]);
                w5Var.getClientReportRecorder().b(io.sentry.clientreport.d.BEFORE_SEND, l.Error);
            }
        }
        if (sentryEventV != null) {
            try {
                if (w5Var.isEnableEventSizeLimiting() && !zs.a.F(sentryEventV, w5Var)) {
                    w5Var.getLogger().q(SentryLevel.INFO, "Event %s exceeds %d bytes limit. Reducing size by dropping fields.", sentryEventV.f12670d, Long.valueOf(w5.MAX_EVENT_SIZE_BYTES));
                    r5 onOversizedEvent = w5Var.getOnOversizedEvent();
                    if (onOversizedEvent != null) {
                        try {
                            sentryEventInit$lambda$3$lambda$1 = CrashReporting.init$lambda$3$lambda$1(((com.discord.crash_reporting.b) onOversizedEvent).f4336d, sentryEventV, hint);
                            if (!zs.a.F(sentryEventInit$lambda$3$lambda$1, w5Var)) {
                                list = sentryEventInit$lambda$3$lambda$1.J;
                                if (list != null && !list.isEmpty()) {
                                    sentryEventInit$lambda$3$lambda$1.J = null;
                                    w5Var.getLogger().q(SentryLevel.DEBUG, "Removed breadcrumbs to reduce size of event %s", sentryEventInit$lambda$3$lambda$1.f12670d);
                                }
                                if (zs.a.F(sentryEventInit$lambda$3$lambda$1, w5Var)) {
                                    zs.a.Z(sentryEventInit$lambda$3$lambda$1, w5Var);
                                    if (!zs.a.F(sentryEventInit$lambda$3$lambda$1, w5Var)) {
                                        w5Var.getLogger().q(SentryLevel.WARNING, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server.", sentryEventV.f12670d);
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            w5Var.getLogger().g(SentryLevel.ERROR, "The onOversizedEvent callback threw an exception. It will be ignored and automatic reduction will continue.", th3);
                            sentryEventInit$lambda$3$lambda$1 = sentryEventV;
                        }
                        sentryEventV = sentryEventInit$lambda$3$lambda$1;
                    } else {
                        sentryEventInit$lambda$3$lambda$1 = sentryEventV;
                        list = sentryEventInit$lambda$3$lambda$1.J;
                        if (list != null) {
                            sentryEventInit$lambda$3$lambda$1.J = null;
                            w5Var.getLogger().q(SentryLevel.DEBUG, "Removed breadcrumbs to reduce size of event %s", sentryEventInit$lambda$3$lambda$1.f12670d);
                        }
                        if (zs.a.F(sentryEventInit$lambda$3$lambda$1, w5Var)) {
                            zs.a.Z(sentryEventInit$lambda$3$lambda$1, w5Var);
                            if (!zs.a.F(sentryEventInit$lambda$3$lambda$1, w5Var)) {
                                w5Var.getLogger().q(SentryLevel.WARNING, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server.", sentryEventV.f12670d);
                            }
                        }
                        sentryEventV = sentryEventInit$lambda$3$lambda$1;
                    }
                }
            } catch (Throwable th4) {
                w5Var.getLogger().g(SentryLevel.ERROR, "An error occurred while limiting event size. Event will be sent as-is.", th4);
            }
        }
        if (sentryEventV == null) {
            return io.sentry.protocol.v.f13055e;
        }
        h6 h6VarA2 = iScope != null ? iScope.A(new hm.a(12)) : null;
        if (h6VarA2 == null) {
            if (!a5.l0.O(hint)) {
                h6VarA = null;
            } else if (iScope != null) {
                h6VarA = iScope.A(new ac.b(this, sentryEventV, hint, 7));
            } else {
                w5Var.getLogger().q(SentryLevel.INFO, "Scope is null on client.captureEvent", new Object[0]);
                h6VarA = null;
            }
            h6Var = h6VarA;
        } else if (h6VarA2.f12722y != g6.Ok) {
            h6Var = null;
        } else {
            if (!a5.l0.O(hint)) {
                h6VarA = null;
            } else if (iScope != null) {
                h6VarA = iScope.A(new ac.b(this, sentryEventV, hint, 7));
            } else {
                w5Var.getLogger().q(SentryLevel.INFO, "Scope is null on client.captureEvent", new Object[0]);
                h6VarA = null;
            }
            h6Var = h6VarA;
        }
        io.sentry.util.i iVarA = w5Var.getSampleRate() == null ? null : io.sentry.util.j.a();
        if (w5Var.getSampleRate() == null || iVarA == null || w5Var.getSampleRate().doubleValue() >= iVarA.c()) {
            sentryEvent2 = sentryEventV;
        } else {
            w5Var.getLogger().q(SentryLevel.DEBUG, "Event %s was dropped due to sampling decision.", sentryEventV.f12670d);
            w5Var.getClientReportRecorder().b(io.sentry.clientreport.d.SAMPLE_RATE, l.Error);
            sentryEvent2 = null;
        }
        if (h6Var != null) {
            if (h6VarA2 != null) {
                g6 g6Var = h6Var.f12722y;
                g6 g6Var2 = g6.Crashed;
                z5 = (g6Var == g6Var2 && h6VarA2.f12722y != g6Var2) || (h6Var.f12718i.get() > 0 && h6VarA2.f12718i.get() <= 0);
            }
        }
        if (sentryEvent2 == null && !z5) {
            w5Var.getLogger().q(SentryLevel.DEBUG, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return io.sentry.protocol.v.f13055e;
        }
        io.sentry.protocol.v vVarY = io.sentry.protocol.v.f13055e;
        if (sentryEvent2 != null && (vVar = sentryEvent2.f12670d) != null) {
            vVarY = vVar;
        }
        boolean zIsInstance = io.sentry.hints.b.class.isInstance(hint.b("sentry:typeCheckHint"));
        boolean z6 = io.sentry.hints.d.class.isInstance(hint.b("sentry:typeCheckHint")) && !io.sentry.android.core.r0.class.isInstance(hint.b("sentry:typeCheckHint"));
        if (sentryEvent2 != null && !zIsInstance && !z6) {
            if (sentryEvent2.f()) {
                w5Var.getReplayController().captureReplay(Boolean.valueOf(sentryEvent2.e() != null));
            } else if (sentryEvent2.e() != null) {
                w5Var.getReplayController().captureReplay(Boolean.valueOf(sentryEvent2.e() != null));
            }
        }
        if (sentryEvent2 != null) {
            try {
                str = sentryEvent2.S;
            } catch (io.sentry.exception.b | IOException e10) {
                e = e10;
                w5Var.getLogger().e(SentryLevel.WARNING, e, "Capturing event %s failed.", vVarY);
                vVarY = io.sentry.protocol.v.f13055e;
                if (iScope != null) {
                    objB = hint.b("sentry:typeCheckHint");
                    if (objB instanceof io.sentry.hints.c) {
                        ((io.sentry.hints.c) objB).f(f1VarN.k());
                        f1VarN.d(m6.ABORTED, false, hint);
                    } else {
                        f1VarN.d(m6.ABORTED, false, null);
                    }
                }
                return vVarY;
            }
        } else {
            str = null;
        }
        try {
            e4.c cVarN = n(sentryEvent2, sentryEvent2 != null ? r(hint) : null, h6Var, t(iScope, hint, sentryEvent2, str), null);
            hint.a();
            if (cVarN != null) {
                vVarY = y(cVarN, hint);
            }
        } catch (io.sentry.exception.b e11) {
            e = e11;
            w5Var.getLogger().e(SentryLevel.WARNING, e, "Capturing event %s failed.", vVarY);
            vVarY = io.sentry.protocol.v.f13055e;
        } catch (IOException e12) {
            e = e12;
            w5Var.getLogger().e(SentryLevel.WARNING, e, "Capturing event %s failed.", vVarY);
            vVarY = io.sentry.protocol.v.f13055e;
        }
        if (iScope != null && (f1VarN = iScope.n()) != null && io.sentry.hints.l.class.isInstance(hint.b("sentry:typeCheckHint"))) {
            objB = hint.b("sentry:typeCheckHint");
            if (objB instanceof io.sentry.hints.c) {
                ((io.sentry.hints.c) objB).f(f1VarN.k());
                f1VarN.d(m6.ABORTED, false, hint);
            } else {
                f1VarN.d(m6.ABORTED, false, null);
            }
        }
        return vVarY;
    }

    public void l(Float f2, boolean z5) {
        SpringAnimation springAnimation;
        fj.c cVar = (fj.c) this.f12711b;
        if (cVar == null) {
            throw new IllegalStateException("Controller should not be null");
        }
        androidx.core.view.q1 q1Var = (androidx.core.view.q1) cVar.f9267e;
        kotlin.collections.a aVar = new kotlin.collections.a(14, this);
        i6.a aVar2 = new i6.a(8, cVar);
        float f7 = z5 ? q1Var.H().f1559d : q1Var.G().f1559d;
        j2.g gVar = new j2.g(aVar2, aVar);
        if (Float.isNaN(f7)) {
            springAnimation = new SpringAnimation(gVar);
        } else {
            SpringAnimation springAnimation2 = new SpringAnimation(gVar, 0);
            springAnimation2.f2009m = null;
            springAnimation2.f2010n = Float.MAX_VALUE;
            springAnimation2.f2011o = false;
            springAnimation2.f2009m = new j2.i(f7);
            springAnimation = springAnimation2;
        }
        if (springAnimation.f2009m == null) {
            springAnimation.f2009m = new j2.i();
        }
        j2.i spring = springAnimation.f2009m;
        Intrinsics.checkExpressionValueIsNotNull(spring, "spring");
        spring.a(1.0f);
        spring.b(1500.0f);
        if (f2 != null) {
            springAnimation.f1999a = f2.floatValue();
        }
        m3.q qVar = new m3.q(1, this);
        ArrayList arrayList = springAnimation.k;
        if (!arrayList.contains(qVar)) {
            arrayList.add(qVar);
        }
        springAnimation.g();
        this.f12715f = springAnimation;
    }

    public void m(f4 f4Var, IScope iScope) {
        if (iScope != null) {
            if (f4Var.f12673v == null) {
                f4Var.f12673v = iScope.R();
            }
            if (f4Var.F == null) {
                f4Var.F = iScope.Q();
            }
            if (f4Var.f12674w == null) {
                f4Var.f12674w = new HashMap(new HashMap(iScope.D()));
            } else {
                for (Map.Entry entry : iScope.D().entrySet()) {
                    if (!f4Var.f12674w.containsKey(entry.getKey())) {
                        f4Var.f12674w.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            if (f4Var.J == null) {
                f4Var.J = new ArrayList(new ArrayList(iScope.w()));
            } else {
                Queue queueW = iScope.w();
                List list = f4Var.J;
                if (list != null && !queueW.isEmpty()) {
                    list.addAll(queueW);
                    Collections.sort(list, (g4) this.f12713d);
                }
            }
            if (f4Var.L == null) {
                f4Var.L = new HashMap(new HashMap(iScope.getExtras()));
            } else {
                for (Map.Entry entry2 : iScope.getExtras().entrySet()) {
                    if (!f4Var.L.containsKey(entry2.getKey())) {
                        f4Var.L.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            io.sentry.protocol.c cVar = f4Var.f12671e;
            for (Map.Entry entry3 : new io.sentry.protocol.c(iScope.J()).f12923d.entrySet()) {
                if (!cVar.a(entry3.getKey())) {
                    cVar.k(entry3.getValue(), (String) entry3.getKey());
                }
            }
        }
    }

    public e4.c n(f4 f4Var, ArrayList arrayList, h6 h6Var, o6 o6Var, g3 g3Var) {
        io.sentry.protocol.v vVar;
        w5 w5Var = (w5) this.f12711b;
        ArrayList arrayList2 = new ArrayList();
        int i7 = 5;
        if (f4Var != null) {
            c1 serializer = w5Var.getSerializer();
            Charset charset = p4.f12886d;
            com.facebook.imagepipeline.nativecode.c.H(serializer, "ISerializer is required.");
            e4.e eVar = new e4.e((Callable) new com.facebook.react.runtime.o(i7, serializer, f4Var));
            arrayList2.add(new p4(new q4(w4.resolve(f4Var), new m4(eVar, 9), "application/json", null, null), new m4(eVar, 10)));
            vVar = f4Var.f12670d;
        } else {
            vVar = null;
        }
        if (h6Var != null) {
            arrayList2.add(p4.d(w5Var.getSerializer(), h6Var));
        }
        if (g3Var != null) {
            long maxTraceFileSize = w5Var.getMaxTraceFileSize();
            c1 serializer2 = w5Var.getSerializer();
            Charset charset2 = p4.f12886d;
            File file = g3Var.f12687d;
            e4.e eVar2 = new e4.e((Callable) new com.discord.crash_reporting.c(file, maxTraceFileSize, g3Var, serializer2, 2));
            arrayList2.add(new p4(new q4(w4.Profile, new m4(eVar2, 6), "application-json", file.getName(), null), new m4(eVar2, 8)));
            if (vVar == null) {
                vVar = new io.sentry.protocol.v(g3Var.T);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                c1 serializer3 = w5Var.getSerializer();
                ILogger logger = w5Var.getLogger();
                long maxAttachmentSize = w5Var.getMaxAttachmentSize();
                Charset charset3 = p4.f12886d;
                e4.e eVar3 = new e4.e((Callable) new com.discord.crash_reporting.c(aVar, maxAttachmentSize, serializer3, logger, 1));
                arrayList2.add(new p4(new q4(w4.Attachment, new m4(eVar3, 4), aVar.f12033e, aVar.f12032d, aVar.f12034f), new m4(eVar3, i7)));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new e4.c(new l4(vVar, w5Var.getSdkVersion(), o6Var), arrayList2);
    }

    public e4.c o(z4 z4Var) {
        ArrayList arrayList = new ArrayList();
        w5 w5Var = (w5) this.f12711b;
        c1 serializer = w5Var.getSerializer();
        Charset charset = p4.f12886d;
        com.facebook.imagepipeline.nativecode.c.H(serializer, "ISerializer is required.");
        e4.e eVar = new e4.e((Callable) new com.facebook.react.runtime.o(4, serializer, z4Var));
        arrayList.add(new p4(new q4(w4.Log, new m4(eVar, 2), "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(z4Var.f13306d.size())), new m4(eVar, 3)));
        return new e4.c(new l4(null, w5Var.getSdkVersion(), null), arrayList);
    }

    public e4.c p(d5 d5Var) {
        ArrayList arrayList = new ArrayList();
        w5 w5Var = (w5) this.f12711b;
        c1 serializer = w5Var.getSerializer();
        Charset charset = p4.f12886d;
        com.facebook.imagepipeline.nativecode.c.H(serializer, "ISerializer is required.");
        e4.e eVar = new e4.e((Callable) new com.facebook.react.runtime.o(7, serializer, d5Var));
        arrayList.add(new p4(new q4(w4.TraceMetric, new m4(eVar, 16), "application/vnd.sentry.items.trace-metric+json", (String) null, (String) null, (String) null, Integer.valueOf(d5Var.f12626d.size())), new m4(eVar, 17)));
        return new e4.c(new l4(null, w5Var.getSdkVersion(), null), arrayList);
    }

    public e4.c q(final y5 y5Var, final l3 l3Var, o6 o6Var, final boolean z5) {
        ArrayList arrayList = new ArrayList();
        w5 w5Var = (w5) this.f12711b;
        final c1 serializer = w5Var.getSerializer();
        final ILogger logger = w5Var.getLogger();
        Charset charset = p4.f12886d;
        final File file = y5Var.M;
        e4.e eVar = new e4.e(new Callable() { // from class: io.sentry.n4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                c1 c1Var = serializer;
                y5 y5Var2 = y5Var;
                File file2 = file;
                ILogger iLogger = logger;
                boolean z6 = z5;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, p4.f12886d));
                        try {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            c1Var.b(y5Var2, bufferedWriter);
                            linkedHashMap.put(w4.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.reset();
                            l3 l3Var2 = l3Var;
                            if (l3Var2 != null) {
                                c1Var.b(l3Var2, bufferedWriter);
                                linkedHashMap.put(w4.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.reset();
                            }
                            if (file2 != null && file2.exists()) {
                                byte[] bArrW = a.a.w(10485760L, file2.getPath());
                                if (bArrW.length > 0) {
                                    linkedHashMap.put(w4.ReplayVideo.getItemType(), bArrW);
                                }
                            }
                            byte[] bArrK = p4.k(linkedHashMap);
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                            if (file2 != null) {
                                if (z6) {
                                    a.a.d(file2.getParentFile());
                                    return bArrK;
                                }
                                file2.delete();
                            }
                            return bArrK;
                        } catch (Throwable th2) {
                            try {
                                bufferedWriter.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    try {
                        iLogger.g(SentryLevel.ERROR, "Could not serialize replay recording", th6);
                        return null;
                    } finally {
                        if (file2 != null) {
                            if (z6) {
                                a.a.d(file2.getParentFile());
                            } else {
                                file2.delete();
                            }
                        }
                    }
                }
            }
        });
        arrayList.add(new p4(new q4(w4.ReplayVideo, new m4(eVar, 14), null, null, null), new m4(eVar, 15)));
        return new e4.c(new l4(y5Var.f12670d, w5Var.getSessionReplay().f12059m, o6Var), arrayList);
    }

    public int s() {
        fj.c cVar = (fj.c) this.f12711b;
        if (cVar != null) {
            return ((androidx.core.view.q1) cVar.f9267e).F().f1559d;
        }
        throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
    }

    public o6 t(IScope iScope, Hint hint, f4 f4Var, String str) {
        w5 w5Var = (w5) this.f12711b;
        if (io.sentry.hints.b.class.isInstance(hint.b("sentry:typeCheckHint"))) {
            if (f4Var != null) {
                w5Var.getLogger();
                c cVar = new c();
                io.sentry.protocol.c cVar2 = f4Var.f12671e;
                j6 j6VarI = cVar2.i();
                cVar.b("sentry-trace_id", j6VarI != null ? j6VarI.f12782d.toString() : null);
                cVar.b("sentry-public_key", w5Var.retrieveParsedDsn().f13285b);
                cVar.b("sentry-release", f4Var.f12675x);
                cVar.b("sentry-environment", f4Var.f12676y);
                cVar.b("sentry-transaction", str);
                if (cVar.f12506e) {
                    cVar.f12504c = null;
                }
                cVar.b("sentry-sampled", null);
                if (cVar.f12506e) {
                    cVar.f12505d = null;
                }
                Object objC = cVar2.c("replay_id");
                if (objC != null && !objC.toString().equals(io.sentry.protocol.v.f13055e.toString())) {
                    cVar.b("sentry-replay_id", objC.toString());
                    cVar2.m("replay_id");
                }
                cVar.f12506e = false;
                return cVar.d();
            }
        } else if (iScope != null) {
            f1 f1VarN = iScope.n();
            return f1VarN != null ? f1VarN.b() : ((c) iScope.L(new io.sentry.android.core.x(7, iScope, w5Var)).f7995v).d();
        }
        return null;
    }

    public int u(int i7) {
        fj.c cVar = (fj.c) this.f12711b;
        if (cVar == null) {
            throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
        }
        androidx.core.view.q1 q1Var = (androidx.core.view.q1) cVar.f9267e;
        int i10 = q1Var.G().f1559d;
        int i11 = q1Var.H().f1559d;
        boolean z5 = this.f12710a;
        int i12 = z5 ? i11 : i10;
        int i13 = z5 ? i10 : i11;
        int iD = lo.j.d(i7, i10, i11);
        int i14 = q1Var.F().f1559d - iD;
        q1Var.I(Insets.b(0, 0, 0, iD), (iD - i12) / (i13 - i12));
        return i14;
    }

    public SentryEvent v(SentryEvent sentryEvent, Hint hint, List list) {
        w5 w5Var = (w5) this.f12711b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            try {
                boolean z5 = b0Var instanceof io.sentry.android.core.h0;
                boolean zIsInstance = io.sentry.hints.b.class.isInstance(hint.b("sentry:typeCheckHint"));
                if (zIsInstance && z5) {
                    ((io.sentry.android.core.h0) b0Var).f(sentryEvent, hint);
                } else if (!zIsInstance && !z5) {
                    sentryEvent = b0Var.f(sentryEvent, hint);
                }
            } catch (Throwable th2) {
                w5Var.getLogger().e(SentryLevel.ERROR, th2, "An exception occurred while processing event by processor: %s", b0Var.getClass().getName());
            }
            if (sentryEvent == null) {
                w5Var.getLogger().q(SentryLevel.DEBUG, "Event was dropped by a processor: %s", b0Var.getClass().getName());
                w5Var.getClientReportRecorder().b(io.sentry.clientreport.d.EVENT_PROCESSOR, l.Error);
                break;
            }
        }
        return sentryEvent;
    }

    public io.sentry.protocol.d0 w(io.sentry.protocol.d0 d0Var, Hint hint, List list) {
        w5 w5Var = (w5) this.f12711b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            int size = d0Var.P.size();
            try {
                d0Var = b0Var.g(d0Var, hint);
            } catch (Throwable th2) {
                w5Var.getLogger().e(SentryLevel.ERROR, th2, "An exception occurred while processing transaction by processor: %s", b0Var.getClass().getName());
            }
            int size2 = d0Var == null ? 0 : d0Var.P.size();
            if (d0Var == null) {
                w5Var.getLogger().q(SentryLevel.DEBUG, "Transaction was dropped by a processor: %s", b0Var.getClass().getName());
                io.sentry.clientreport.f clientReportRecorder = w5Var.getClientReportRecorder();
                io.sentry.clientreport.d dVar = io.sentry.clientreport.d.EVENT_PROCESSOR;
                clientReportRecorder.b(dVar, l.Transaction);
                w5Var.getClientReportRecorder().m(dVar, l.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i7 = size - size2;
                w5Var.getLogger().q(SentryLevel.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i7), b0Var.getClass().getName());
                w5Var.getClientReportRecorder().m(io.sentry.clientreport.d.EVENT_PROCESSOR, l.Span, i7);
            }
        }
        return d0Var;
    }

    public void x() {
        this.f12711b = null;
        this.f12712c = null;
        this.f12710a = false;
        SpringAnimation springAnimation = (SpringAnimation) this.f12715f;
        if (springAnimation != null) {
            springAnimation.b();
        }
        this.f12715f = null;
        this.f12713d = null;
    }

    public io.sentry.protocol.v y(e4.c cVar, Hint hint) {
        io.sentry.transport.g gVar = (io.sentry.transport.g) this.f12712c;
        w5 w5Var = (w5) this.f12711b;
        i5 beforeEnvelopeCallback = w5Var.getBeforeEnvelopeCallback();
        if (beforeEnvelopeCallback != null) {
            try {
                SpotlightIntegration spotlightIntegration = (SpotlightIntegration) beforeEnvelopeCallback;
                try {
                    spotlightIntegration.f12023i.submit(new com.mkuczera.haptic.a(13, spotlightIntegration, cVar));
                } catch (RejectedExecutionException e10) {
                    spotlightIntegration.f12022e.g(SentryLevel.WARNING, "Spotlight envelope submission rejected.", e10);
                }
            } catch (Throwable th2) {
                w5Var.getLogger().g(SentryLevel.ERROR, "The BeforeEnvelope callback threw an exception.", th2);
            }
        }
        v4.d().c(w5Var.getLogger());
        if (hint == null) {
            gVar.getClass();
            gVar.D(cVar, new Hint());
        } else {
            gVar.D(cVar, hint);
        }
        io.sentry.protocol.v vVar = ((l4) cVar.f7966e).f12796d;
        return vVar != null ? vVar : io.sentry.protocol.v.f13055e;
    }

    public boolean z(f4 f4Var, Hint hint) {
        if (a5.l0.O(hint)) {
            return true;
        }
        ((w5) this.f12711b).getLogger().q(SentryLevel.DEBUG, "Event was cached so not applying scope: %s", f4Var.f12670d);
        return false;
    }

    public h4(w5 w5Var) {
        this.f12713d = new g4();
        this.f12711b = w5Var;
        this.f12710a = true;
        h1 transportFactory = w5Var.getTransportFactory();
        if (transportFactory instanceof w2) {
            transportFactory = new g2(4);
            w5Var.setTransportFactory(transportFactory);
        }
        y yVarRetrieveParsedDsn = w5Var.retrieveParsedDsn();
        String sentryClientName = w5Var.getSentryClientName();
        URI uri = yVarRetrieveParsedDsn.f13286c;
        String string = uri.resolve(uri.getPath() + "/envelope/").toString();
        String str = yVarRetrieveParsedDsn.f13285b;
        String str2 = yVarRetrieveParsedDsn.f13284a;
        StringBuilder sb2 = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb2.append(sentryClientName);
        sb2.append(",sentry_key=");
        sb2.append(str);
        sb2.append((str2 == null || str2.length() <= 0) ? "" : ",sentry_secret=".concat(str2));
        String string2 = sb2.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", sentryClientName);
        map.put("X-Sentry-Auth", string2);
        this.f12712c = transportFactory.a(w5Var, new e4.l(string, map));
        if (w5Var.getLogs().f12851a) {
            this.f12714e = w5Var.getLogs().f12852b.c(w5Var, this);
        } else {
            this.f12714e = io.sentry.logger.d.f12810d;
        }
        if (w5Var.getMetrics().f12890a) {
            this.f12715f = w5Var.getMetrics().f12891b.mo1246c(w5Var, this);
        } else {
            this.f12715f = io.sentry.metrics.c.f12824d;
        }
    }
}
