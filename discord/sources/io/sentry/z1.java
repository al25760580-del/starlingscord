package io.sentry;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.SentryStackFrame;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class z1 implements c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f13296c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f13297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f13298b;

    public z1(w5 w5Var) {
        this.f13297a = w5Var;
        HashMap map = new HashMap();
        this.f13298b = map;
        map.put(io.sentry.protocol.a.class, new io.sentry.clientreport.a(4));
        map.put(Breadcrumb.class, new d(0));
        map.put(io.sentry.protocol.b.class, new io.sentry.clientreport.a(5));
        map.put(io.sentry.protocol.c.class, new io.sentry.clientreport.a(6));
        map.put(DebugImage.class, new io.sentry.clientreport.a(7));
        map.put(io.sentry.protocol.d.class, new io.sentry.clientreport.a(8));
        map.put(io.sentry.protocol.f.class, new io.sentry.clientreport.a(9));
        map.put(io.sentry.protocol.e.class, new io.sentry.clientreport.a(10));
        map.put(io.sentry.protocol.i.class, new io.sentry.clientreport.a(12));
        map.put(io.sentry.protocol.k.class, new io.sentry.clientreport.a(14));
        map.put(io.sentry.protocol.z.class, new io.sentry.clientreport.a(29));
        map.put(io.sentry.protocol.l.class, new io.sentry.clientreport.a(15));
        map.put(io.sentry.protocol.m.class, new io.sentry.clientreport.a(16));
        map.put(io.sentry.protocol.n.class, new io.sentry.clientreport.a(17));
        map.put(io.sentry.protocol.o.class, new io.sentry.clientreport.a(18));
        map.put(d3.class, new d(1));
        map.put(e3.class, new d(2));
        map.put(g3.class, new d(3));
        map.put(h3.class, new d(4));
        map.put(io.sentry.profilemeasurements.a.class, new io.sentry.clientreport.a(2));
        map.put(io.sentry.profilemeasurements.b.class, new io.sentry.clientreport.a(3));
        map.put(io.sentry.protocol.p.class, new io.sentry.clientreport.a(19));
        map.put(l3.class, new d(5));
        map.put(io.sentry.rrweb.a.class, new io.sentry.protocol.b0(9));
        map.put(io.sentry.rrweb.c.class, new io.sentry.protocol.b0(10));
        map.put(io.sentry.rrweb.g.class, new io.sentry.protocol.b0(12));
        map.put(io.sentry.rrweb.i.class, new io.sentry.protocol.b0(14));
        map.put(io.sentry.rrweb.j.class, new io.sentry.protocol.b0(16));
        map.put(io.sentry.rrweb.l.class, new io.sentry.protocol.b0(17));
        map.put(io.sentry.rrweb.m.class, new io.sentry.protocol.b0(18));
        map.put(io.sentry.protocol.s.class, new io.sentry.clientreport.a(20));
        map.put(io.sentry.protocol.t.class, new io.sentry.clientreport.a(21));
        map.put(l4.class, new d(7));
        map.put(q4.class, new d(8));
        map.put(SentryEvent.class, new d(9));
        map.put(io.sentry.protocol.u.class, new io.sentry.clientreport.a(22));
        map.put(w4.class, new d(10));
        map.put(SentryLevel.class, new d(11));
        map.put(x4.class, new d(12));
        map.put(z4.class, new d(15));
        map.put(d5.class, new d(18));
        map.put(io.sentry.protocol.w.class, new io.sentry.clientreport.a(24));
        map.put(io.sentry.protocol.x.class, new io.sentry.clientreport.a(25));
        map.put(y5.class, new d(19));
        map.put(io.sentry.protocol.y.class, new io.sentry.clientreport.a(26));
        map.put(SentryStackFrame.class, new io.sentry.clientreport.a(27));
        map.put(io.sentry.protocol.a0.class, new io.sentry.clientreport.a(28));
        map.put(d4.class, new d(6));
        map.put(io.sentry.protocol.c0.class, new io.sentry.protocol.b0(0));
        map.put(io.sentry.protocol.d0.class, new io.sentry.protocol.b0(1));
        map.put(h6.class, new d(21));
        map.put(j6.class, new d(22));
        map.put(l6.class, new d(23));
        map.put(m6.class, new d(24));
        map.put(io.sentry.protocol.h0.class, new io.sentry.protocol.b0(2));
        map.put(io.sentry.protocol.j.class, new io.sentry.clientreport.a(13));
        map.put(t6.class, new d(26));
        map.put(io.sentry.clientreport.b.class, new io.sentry.clientreport.a(0));
        map.put(io.sentry.protocol.j0.class, new io.sentry.protocol.b0(4));
        map.put(io.sentry.protocol.i0.class, new io.sentry.protocol.b0(3));
    }

    @Override // io.sentry.c1
    public final void a(e4.c cVar, OutputStream outputStream) throws IOException {
        w5 w5Var = this.f13297a;
        com.facebook.imagepipeline.nativecode.c.H(cVar, "The SentryEnvelope object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f13296c));
        try {
            ((l4) cVar.f7966e).serialize(new e4.e(bufferedWriter, w5Var.getMaxDepth()), w5Var.getLogger());
            bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            for (p4 p4Var : (Iterable) cVar.f7967i) {
                try {
                    byte[] bArrF = p4Var.f();
                    p4Var.f12887a.serialize(new e4.e(bufferedWriter, w5Var.getMaxDepth()), w5Var.getLogger());
                    bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    bufferedWriter.flush();
                    outputStream.write(bArrF);
                    bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                } catch (Exception e10) {
                    w5Var.getLogger().g(SentryLevel.ERROR, "Failed to create envelope item. Dropping it.", e10);
                }
            }
            bufferedWriter.flush();
        } catch (Throwable th2) {
            bufferedWriter.flush();
            throw th2;
        }
    }

    @Override // io.sentry.c1
    public final void b(Object obj, Writer writer) throws IOException {
        com.facebook.imagepipeline.nativecode.c.H(obj, "The entity is required.");
        w5 w5Var = this.f13297a;
        ILogger logger = w5Var.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        if (logger.s(sentryLevel)) {
            w5Var.getLogger().q(sentryLevel, "Serializing object: %s", f(obj, w5Var.isEnablePrettySerializationOutput()));
        }
        e4.e eVar = new e4.e(writer, w5Var.getMaxDepth());
        ((ue.i) eVar.f7972i).p(eVar, w5Var.getLogger(), obj);
        writer.flush();
    }

    @Override // io.sentry.c1
    public final String c(ConcurrentHashMap concurrentHashMap) {
        return f(concurrentHashMap, false);
    }

    @Override // io.sentry.c1
    public final Object d(Reader reader, Class cls) {
        Object objC0;
        w5 w5Var = this.f13297a;
        try {
            x1 x1Var = new x1(reader);
            try {
                n1 n1Var = (n1) this.f13298b.get(cls);
                if (n1Var != null) {
                    objC0 = cls.cast(n1Var.a(x1Var, w5Var.getLogger()));
                } else {
                    if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                        x1Var.close();
                        return null;
                    }
                    objC0 = x1Var.c0();
                }
                x1Var.close();
                return objC0;
            } catch (Throwable th2) {
                try {
                    x1Var.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e10) {
            w5Var.getLogger().g(SentryLevel.ERROR, "Error when deserializing", e10);
            return null;
        }
    }

    @Override // io.sentry.c1
    public final e4.c e(BufferedInputStream bufferedInputStream) {
        w5 w5Var = this.f13297a;
        try {
            return w5Var.getEnvelopeReader().a(bufferedInputStream);
        } catch (IOException e10) {
            w5Var.getLogger().g(SentryLevel.ERROR, "Error deserializing envelope.", e10);
            return null;
        }
    }

    public final String f(Object obj, boolean z5) throws IOException {
        StringWriter stringWriter = new StringWriter();
        w5 w5Var = this.f13297a;
        e4.e eVar = new e4.e(stringWriter, w5Var.getMaxDepth());
        if (z5) {
            eVar.m("\t");
        }
        ((ue.i) eVar.f7972i).p(eVar, w5Var.getLogger(), obj);
        return stringWriter.toString();
    }
}
