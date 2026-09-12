package io.sentry;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final class z2 extends v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Charset f13299i = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f13300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p0 f13301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c1 f13302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ILogger f13303h;

    public z2(x0 x0Var, p0 p0Var, c1 c1Var, ILogger iLogger, long j, int i7) {
        super(x0Var, iLogger, j, i7);
        com.facebook.imagepipeline.nativecode.c.H(x0Var, "Scopes are required.");
        this.f13300e = x0Var;
        com.facebook.imagepipeline.nativecode.c.H(p0Var, "Envelope reader is required.");
        this.f13301f = p0Var;
        com.facebook.imagepipeline.nativecode.c.H(c1Var, "Serializer is required.");
        this.f13302g = c1Var;
        com.facebook.imagepipeline.nativecode.c.H(iLogger, "Logger is required.");
        this.f13303h = iLogger;
    }

    public static /* synthetic */ void c(z2 z2Var, File file, io.sentry.hints.h hVar) {
        ILogger iLogger = z2Var.f13303h;
        if (hVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            iLogger.q(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e10) {
            iLogger.e(SentryLevel.ERROR, e10, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    @Override // io.sentry.v
    public final boolean a(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.v
    public final void b(File file, Hint hint) {
        boolean zA = a(file.getName());
        ILogger iLogger = this.f13303h;
        try {
            if (!zA) {
                iLogger.q(SentryLevel.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    e4.c cVarA = this.f13301f.a(bufferedInputStream);
                    if (cVarA == null) {
                        iLogger.q(SentryLevel.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        e(cVarA, hint);
                        iLogger.q(SentryLevel.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    Object objB = hint.b("sentry:typeCheckHint");
                    if (!io.sentry.hints.h.class.isInstance(hint.b("sentry:typeCheckHint")) || objB == null) {
                        com.facebook.imagepipeline.nativecode.b.r(io.sentry.hints.h.class, objB, iLogger);
                    } else {
                        c(this, file, (io.sentry.hints.h) objB);
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                iLogger.g(SentryLevel.ERROR, "Error processing envelope.", e10);
                Object objB2 = hint.b("sentry:typeCheckHint");
                if (!io.sentry.hints.h.class.isInstance(hint.b("sentry:typeCheckHint")) || objB2 == null) {
                    com.facebook.imagepipeline.nativecode.b.r(io.sentry.hints.h.class, objB2, iLogger);
                } else {
                    c(this, file, (io.sentry.hints.h) objB2);
                }
            }
        } catch (Throwable th4) {
            Object objB3 = hint.b("sentry:typeCheckHint");
            if (!io.sentry.hints.h.class.isInstance(hint.b("sentry:typeCheckHint")) || objB3 == null) {
                com.facebook.imagepipeline.nativecode.b.r(io.sentry.hints.h.class, objB3, iLogger);
            } else {
                c(this, file, (io.sentry.hints.h) objB3);
            }
            throw th4;
        }
    }

    public final e9.b d(o6 o6Var) {
        String str;
        ILogger iLogger = this.f13303h;
        if (o6Var != null && (str = o6Var.f12859y) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(str));
                if (e4.f.e0(dValueOf, false)) {
                    String str2 = o6Var.E;
                    if (str2 != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(str2));
                        if (e4.f.e0(dValueOf2, false)) {
                            return new e9.b(Boolean.TRUE, dValueOf, dValueOf2, Boolean.FALSE, (Double) null);
                        }
                    }
                    return e4.f.o(new e9.b(Boolean.TRUE, dValueOf));
                }
                iLogger.q(SentryLevel.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
            } catch (Exception unused) {
                iLogger.q(SentryLevel.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
            }
        }
        return new e9.b(Boolean.TRUE, null);
    }

    public final void e(e4.c cVar, Hint hint) {
        int size;
        Iterator it;
        int i7;
        Object objB;
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        Iterable iterable = (Iterable) cVar.f7967i;
        l4 l4Var = (l4) cVar.f7966e;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it2 = iterable.iterator();
            int i10 = 0;
            while (it2.hasNext()) {
                it2.next();
                i10++;
            }
            size = i10;
        }
        Object[] objArr = {Integer.valueOf(size)};
        ILogger iLogger = this.f13303h;
        iLogger.q(sentryLevel, "Processing Envelope with %d item(s)", objArr);
        Iterator it3 = iterable.iterator();
        int i11 = 0;
        while (it3.hasNext()) {
            p4 p4Var = (p4) it3.next();
            int i12 = i11 + 1;
            q4 q4Var = p4Var.f12887a;
            q4 q4Var2 = p4Var.f12887a;
            if (q4Var == null) {
                iLogger.q(SentryLevel.ERROR, "Item %d has no header", Integer.valueOf(i12));
                it = it3;
                i7 = i12;
            } else {
                boolean zEquals = w4.Event.equals(q4Var.f13085w);
                c1 c1Var = this.f13302g;
                it = it3;
                Charset charset = f13299i;
                i7 = i12;
                x0 x0Var = this.f13300e;
                if (zEquals) {
                    try {
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(p4Var.f()), charset));
                            try {
                                SentryEvent sentryEvent = (SentryEvent) c1Var.d(bufferedReader, SentryEvent.class);
                                if (sentryEvent == null) {
                                    iLogger.q(SentryLevel.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i7), q4Var2.f13085w);
                                } else {
                                    io.sentry.protocol.t tVar = sentryEvent.f12672i;
                                    if (tVar != null) {
                                        String str = tVar.f13043d;
                                        if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
                                            hint.d(Boolean.TRUE, "sentry:isFromHybridSdk");
                                        }
                                    }
                                    io.sentry.protocol.v vVar = l4Var.f12796d;
                                    if (vVar == null || vVar.equals(sentryEvent.f12670d)) {
                                        x0Var.x(sentryEvent, hint);
                                        iLogger.q(SentryLevel.DEBUG, "Item %d is being captured.", Integer.valueOf(i7));
                                        if (!f(hint)) {
                                            iLogger.q(SentryLevel.WARNING, "Timed out waiting for event id submission: %s", sentryEvent.f12670d);
                                            bufferedReader.close();
                                            return;
                                        }
                                    } else {
                                        iLogger.q(SentryLevel.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i7), l4Var.f12796d, sentryEvent.f12670d);
                                        bufferedReader.close();
                                    }
                                }
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                try {
                                    bufferedReader.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            iLogger.g(SentryLevel.ERROR, "Item failed to process.", th);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    objB = hint.b("sentry:typeCheckHint");
                    if (!(objB instanceof io.sentry.hints.k) && !((io.sentry.hints.k) objB).e()) {
                        iLogger.q(SentryLevel.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i7));
                        return;
                    }
                    Object objB2 = hint.b("sentry:typeCheckHint");
                    if (!io.sentry.android.core.r0.class.isInstance(hint.b("sentry:typeCheckHint")) && objB2 != null) {
                        io.sentry.android.core.r0 r0Var = (io.sentry.android.core.r0) objB2;
                        r0Var.f12398i = new CountDownLatch(1);
                        r0Var.f12396d = false;
                        r0Var.f12397e = false;
                    }
                    it3 = it;
                    i11 = i7;
                } else {
                    w4 w4Var = w4.Transaction;
                    w4 w4Var2 = q4Var.f13085w;
                    w4 w4Var3 = q4Var.f13085w;
                    if (w4Var.equals(w4Var2)) {
                        try {
                            try {
                                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(p4Var.f()), charset));
                                try {
                                    io.sentry.protocol.d0 d0Var = (io.sentry.protocol.d0) c1Var.d(bufferedReader2, io.sentry.protocol.d0.class);
                                    if (d0Var == null) {
                                        iLogger.q(SentryLevel.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i7), q4Var2.f13085w);
                                    } else {
                                        io.sentry.protocol.v vVar2 = l4Var.f12796d;
                                        if (vVar2 == null || vVar2.equals(d0Var.f12670d)) {
                                            o6 o6Var = l4Var.f12798i;
                                            if (d0Var.f12671e.i() != null) {
                                                d0Var.f12671e.i().a(d(o6Var));
                                            }
                                            x0Var.v(d0Var, o6Var, hint, null);
                                            iLogger.q(SentryLevel.DEBUG, "Item %d is being captured.", Integer.valueOf(i7));
                                            if (!f(hint)) {
                                                iLogger.q(SentryLevel.WARNING, "Timed out waiting for event id submission: %s", d0Var.f12670d);
                                                bufferedReader2.close();
                                                return;
                                            }
                                        } else {
                                            iLogger.q(SentryLevel.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i7), l4Var.f12796d, d0Var.f12670d);
                                            bufferedReader2.close();
                                        }
                                    }
                                    bufferedReader2.close();
                                } catch (Throwable th6) {
                                    try {
                                        bufferedReader2.close();
                                        throw th6;
                                    } catch (Throwable th7) {
                                        th6.addSuppressed(th7);
                                        throw th6;
                                    }
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                iLogger.g(SentryLevel.ERROR, "Item failed to process.", th);
                            }
                        } catch (Throwable th9) {
                            th = th9;
                        }
                    } else {
                        x0Var.i(new e4.c(l4Var.f12796d, l4Var.f12797e, p4Var), hint);
                        iLogger.q(SentryLevel.DEBUG, "%s item %d is being captured.", w4Var3.getItemType(), Integer.valueOf(i7));
                        if (!f(hint)) {
                            iLogger.q(SentryLevel.WARNING, "Timed out waiting for item type submission: %s", w4Var3.getItemType());
                            return;
                        }
                    }
                    objB = hint.b("sentry:typeCheckHint");
                    if (!(objB instanceof io.sentry.hints.k)) {
                    }
                    Object objB3 = hint.b("sentry:typeCheckHint");
                    if (!io.sentry.android.core.r0.class.isInstance(hint.b("sentry:typeCheckHint"))) {
                    }
                    it3 = it;
                    i11 = i7;
                }
            }
            it3 = it;
            i11 = i7;
        }
    }

    public final boolean f(Hint hint) {
        Object objB = hint.b("sentry:typeCheckHint");
        if (objB instanceof io.sentry.hints.f) {
            return ((io.sentry.hints.f) objB).d();
        }
        com.facebook.imagepipeline.nativecode.b.r(io.sentry.hints.f.class, objB, this.f13303h);
        return true;
    }
}
