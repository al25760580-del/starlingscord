package io.sentry;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class x1 implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13271d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f13272e;

    public x1(Reader reader) {
        this.f13272e = new io.sentry.vendor.gson.stream.a(reader);
    }

    public final Float B() throws IOException {
        switch (this.f13271d) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f13272e;
                if (aVar.j0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Float.valueOf(z());
                }
                aVar.Y();
                return null;
            default:
                Object objN0 = n0();
                if (objN0 instanceof Number) {
                    return Float.valueOf(((Number) objN0).floatValue());
                }
                return null;
        }
    }

    public final int O() throws IOException {
        switch (this.f13271d) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f13272e).P();
            default:
                Object objN0 = n0();
                if (objN0 instanceof Number) {
                    return ((Number) objN0).intValue();
                }
                throw new IOException("Expected int");
        }
    }

    public final Integer P() throws IOException {
        switch (this.f13271d) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f13272e;
                if (aVar.j0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Integer.valueOf(aVar.P());
                }
                aVar.Y();
                return null;
            default:
                Object objN0 = n0();
                if (objN0 instanceof Number) {
                    return Integer.valueOf(((Number) objN0).intValue());
                }
                return null;
        }
    }

    public final ArrayList Q(ILogger iLogger, n1 n1Var) throws IOException {
        switch (this.f13271d) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f13272e;
                if (aVar.j0() == io.sentry.vendor.gson.stream.b.NULL) {
                    aVar.Y();
                    return null;
                }
                aVar.c();
                ArrayList arrayList = new ArrayList();
                if (aVar.u()) {
                    do {
                        try {
                            arrayList.add(n1Var.a(this, iLogger));
                        } catch (Exception e10) {
                            iLogger.g(SentryLevel.WARNING, "Failed to deserialize object in list.", e10);
                        }
                        break;
                    } while (aVar.j0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
                }
                aVar.l();
                return arrayList;
            default:
                if (o0() == io.sentry.vendor.gson.stream.b.NULL) {
                    if (n0() == null) {
                        return null;
                    }
                    throw new IOException("Expected null but was " + o0());
                }
                try {
                    c();
                    ArrayList arrayList2 = new ArrayList();
                    if (l()) {
                        do {
                            try {
                                arrayList2.add(n1Var.a(this, iLogger));
                            } catch (Exception e11) {
                                iLogger.g(SentryLevel.WARNING, "Failed to deserialize object in list.", e11);
                            }
                            break;
                        } while (o0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
                    }
                    g();
                    return arrayList2;
                } catch (Exception e12) {
                    throw new IOException(e12);
                }
        }
    }

    public final long T() throws IOException {
        switch (this.f13271d) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f13272e).Q();
            default:
                Object objN0 = n0();
                if (objN0 instanceof Number) {
                    return ((Number) objN0).longValue();
                }
                throw new IOException("Expected long");
        }
    }

    public final Long U() throws IOException {
        switch (this.f13271d) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f13272e;
                if (aVar.j0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Long.valueOf(aVar.Q());
                }
                aVar.Y();
                return null;
            default:
                Object objN0 = n0();
                if (objN0 instanceof Number) {
                    return Long.valueOf(((Number) objN0).longValue());
                }
                return null;
        }
    }

    public final HashMap Y(ILogger iLogger, n1 n1Var) throws IOException {
        switch (this.f13271d) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f13272e;
                if (aVar.j0() == io.sentry.vendor.gson.stream.b.NULL) {
                    aVar.Y();
                    return null;
                }
                aVar.f();
                HashMap map = new HashMap();
                if (aVar.u()) {
                    while (true) {
                        try {
                            map.put(aVar.T(), n1Var.a(this, iLogger));
                        } catch (Exception e10) {
                            iLogger.g(SentryLevel.WARNING, "Failed to deserialize object in map.", e10);
                        }
                        if (aVar.j0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT || aVar.j0() == io.sentry.vendor.gson.stream.b.NAME) {
                        }
                        break;
                    }
                }
                aVar.n();
                return map;
            default:
                if (o0() == io.sentry.vendor.gson.stream.b.NULL) {
                    if (n0() == null) {
                        return null;
                    }
                    throw new IOException("Expected null but was " + o0());
                }
                try {
                    f();
                    HashMap map2 = new HashMap();
                    if (l()) {
                        while (true) {
                            try {
                                map2.put(a0(), n1Var.a(this, iLogger));
                            } catch (Exception e11) {
                                iLogger.g(SentryLevel.WARNING, "Failed to deserialize object in map.", e11);
                            }
                            if (o0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT || o0() == io.sentry.vendor.gson.stream.b.NAME) {
                            }
                            break;
                        }
                    }
                    i();
                    return map2;
                } catch (Exception e12) {
                    throw new IOException(e12);
                }
        }
    }

    public final String a0() throws IOException {
        switch (this.f13271d) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f13272e).T();
            default:
                Map.Entry entry = (Map.Entry) ((ArrayDeque) this.f13272e).peekLast();
                if (entry != null && entry.getKey() != null) {
                    return (String) entry.getKey();
                }
                throw new IOException("Expected a name but was " + o0());
        }
    }

    public final void c() throws IOException {
        switch (this.f13271d) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.f13272e).c();
                return;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f13272e;
                Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
                if (entry == null) {
                    throw new IOException("No more entries");
                }
                Object value = entry.getValue();
                if (!(value instanceof List)) {
                    throw new IOException("Current token is not an object");
                }
                arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_ARRAY));
                List list = (List) value;
                for (int size = list.size() - 1; size >= 0; size--) {
                    arrayDeque.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
                }
                return;
        }
    }

    public final Object c0() {
        switch (this.f13271d) {
            case 0:
                w1 w1Var = new w1();
                w1Var.d(this);
                r1 r1VarA = w1Var.a();
                if (r1VarA != null) {
                    return r1VarA.getValue();
                }
                return null;
            default:
                return n0();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f13271d) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.f13272e).close();
                break;
            default:
                ((ArrayDeque) this.f13272e).clear();
                break;
        }
    }

    public final Object e0(ILogger iLogger, n1 n1Var) {
        switch (this.f13271d) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f13272e;
                if (aVar.j0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return n1Var.a(this, iLogger);
                }
                aVar.Y();
                return null;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f13272e;
                Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
                if (entry == null) {
                    return null;
                }
                Object value = entry.getValue();
                if (iLogger != null) {
                    return n1Var.a(this, iLogger);
                }
                arrayDeque.removeLast();
                return value;
        }
    }

    public final void f() throws IOException {
        switch (this.f13271d) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.f13272e).f();
                return;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f13272e;
                Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
                if (entry == null) {
                    throw new IOException("No more entries");
                }
                Object value = entry.getValue();
                if (!(value instanceof Map)) {
                    throw new IOException("Current token is not an object");
                }
                arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_OBJECT));
                Iterator it = ((Map) value).entrySet().iterator();
                while (it.hasNext()) {
                    arrayDeque.addLast((Map.Entry) it.next());
                }
                return;
        }
    }

    public final void g() {
        switch (this.f13271d) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.f13272e).l();
                break;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f13272e;
                if (arrayDeque.size() > 1) {
                    arrayDeque.removeLast();
                }
                break;
        }
    }

    public final void i() {
        switch (this.f13271d) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.f13272e).n();
                break;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f13272e;
                if (arrayDeque.size() > 1) {
                    arrayDeque.removeLast();
                }
                break;
        }
    }

    public final String j0() throws IOException {
        switch (this.f13271d) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f13272e).c0();
            default:
                String str = (String) n0();
                if (str != null) {
                    return str;
                }
                throw new IOException("Expected string");
        }
    }

    public final boolean l() {
        switch (this.f13271d) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f13272e).u();
            default:
                return !((ArrayDeque) this.f13272e).isEmpty();
        }
    }

    public final String l0() {
        switch (this.f13271d) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f13272e;
                if (aVar.j0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return aVar.c0();
                }
                aVar.Y();
                return null;
            default:
                return (String) n0();
        }
    }

    public final void m0(ILogger iLogger, AbstractMap abstractMap, String str) {
        switch (this.f13271d) {
            case 0:
                try {
                    abstractMap.put(str, c0());
                } catch (Exception e10) {
                    iLogger.e(SentryLevel.ERROR, e10, "Error deserializing unknown key: %s", str);
                    return;
                }
                break;
            default:
                try {
                    abstractMap.put(str, n0());
                } catch (Exception e11) {
                    iLogger.e(SentryLevel.ERROR, e11, "Error deserializing unknown key: %s", str);
                }
                break;
        }
    }

    public final Boolean n() {
        switch (this.f13271d) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f13272e;
                if (aVar.j0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Boolean.valueOf(aVar.B());
                }
                aVar.Y();
                return null;
            default:
                return (Boolean) n0();
        }
    }

    public Object n0() throws IOException {
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.f13272e;
            Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
            if (entry == null) {
                return null;
            }
            Object value = entry.getValue();
            arrayDeque.removeLast();
            return value;
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    public final io.sentry.vendor.gson.stream.b o0() {
        switch (this.f13271d) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f13272e).j0();
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f13272e;
                if (arrayDeque.isEmpty()) {
                    return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
                }
                Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
                if (entry == null) {
                    return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
                }
                if (entry.getKey() != null) {
                    return io.sentry.vendor.gson.stream.b.NAME;
                }
                Object value = entry.getValue();
                if (value instanceof Map) {
                    return io.sentry.vendor.gson.stream.b.BEGIN_OBJECT;
                }
                if (value instanceof List) {
                    return io.sentry.vendor.gson.stream.b.BEGIN_ARRAY;
                }
                if (value instanceof String) {
                    return io.sentry.vendor.gson.stream.b.STRING;
                }
                if (value instanceof Number) {
                    return io.sentry.vendor.gson.stream.b.NUMBER;
                }
                if (value instanceof Boolean) {
                    return io.sentry.vendor.gson.stream.b.BOOLEAN;
                }
                return value instanceof io.sentry.vendor.gson.stream.b ? (io.sentry.vendor.gson.stream.b) value : io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
    }

    public final void p0(boolean z5) {
        switch (this.f13271d) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.f13272e).f13256e = z5;
                break;
        }
    }

    public final Date q(ILogger iLogger) {
        switch (this.f13271d) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f13272e;
                if (aVar.j0() == io.sentry.vendor.gson.stream.b.NULL) {
                    aVar.Y();
                    return null;
                }
                String strC0 = aVar.c0();
                if (strC0 == null) {
                    return null;
                }
                try {
                    try {
                        return io.sentry.config.a.A(strC0);
                    } catch (Exception unused) {
                        return io.sentry.config.a.B(strC0);
                    }
                } catch (Exception e10) {
                    iLogger.g(SentryLevel.ERROR, "Error when deserializing millis timestamp format.", e10);
                    return null;
                }
            default:
                String str = (String) n0();
                if (str == null) {
                    return null;
                }
                try {
                    try {
                        return io.sentry.config.a.A(str);
                    } catch (Exception e11) {
                        iLogger.g(SentryLevel.ERROR, "Error when deserializing millis timestamp format.", e11);
                        return null;
                    }
                } catch (Exception unused2) {
                    return io.sentry.config.a.B(str);
                }
        }
    }

    public final double u() throws IOException {
        switch (this.f13271d) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f13272e).O();
            default:
                Object objN0 = n0();
                if (objN0 instanceof Number) {
                    return ((Number) objN0).doubleValue();
                }
                throw new IOException("Expected double");
        }
    }

    public final Double y() throws IOException {
        switch (this.f13271d) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f13272e;
                if (aVar.j0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Double.valueOf(aVar.O());
                }
                aVar.Y();
                return null;
            default:
                Object objN0 = n0();
                if (objN0 instanceof Number) {
                    return Double.valueOf(((Number) objN0).doubleValue());
                }
                return null;
        }
    }

    public final float z() throws IOException {
        switch (this.f13271d) {
            case 0:
                return (float) ((io.sentry.vendor.gson.stream.a) this.f13272e).O();
            default:
                Object objN0 = n0();
                if (objN0 instanceof Number) {
                    return ((Number) objN0).floatValue();
                }
                throw new IOException("Expected float");
        }
    }

    public x1(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f13272e = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    private final void r0() {
    }

    private final void q0(boolean z5) {
    }
}
