package ag;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.y1;
import io.sentry.y2;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 implements y2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f545d;

    public m1() {
        this.f545d = new ArrayDeque(16);
    }

    public void a(Object obj) {
        ArrayDeque arrayDeque = this.f545d;
        Object objPeekLast = arrayDeque.peekLast();
        if (objPeekLast instanceof List) {
            ((List) objPeekLast).add(obj);
            return;
        }
        if (!(objPeekLast instanceof String)) {
            throw new IllegalStateException("Invalid stack state, expected array or string on top");
        }
        String str = (String) arrayDeque.removeLast();
        Object objPeekLast2 = arrayDeque.peekLast();
        if (objPeekLast2 == null) {
            throw new IllegalStateException("Stack is empty.");
        }
        if (!(objPeekLast2 instanceof Map)) {
            throw new IllegalStateException("Stack element is not a Map.");
        }
        ((Map) objPeekLast2).put(str, obj);
    }

    public void b(ILogger iLogger, Collection collection) {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = this.f545d;
        arrayDeque.add(arrayList);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            h(iLogger, it.next());
        }
        a(arrayDeque.removeLast());
    }

    @Override // io.sentry.y2
    public y2 c(long j) {
        a(Long.valueOf(j));
        return this;
    }

    @Override // io.sentry.y2
    public y2 d(double d6) {
        a(Double.valueOf(d6));
        return this;
    }

    public void e(ILogger iLogger, Map map) {
        HashMap map2 = new HashMap();
        ArrayDeque arrayDeque = this.f545d;
        arrayDeque.addLast(map2);
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                arrayDeque.add((String) obj);
                h(iLogger, map.get(obj));
            }
        }
        a(arrayDeque.removeLast());
    }

    @Override // io.sentry.y2
    public y2 f(String str) {
        a(str);
        return this;
    }

    public void h(ILogger iLogger, Object obj) {
        if (obj == null) {
            a(null);
            return;
        }
        if (obj instanceof Character) {
            a(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            a((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            a((Boolean) obj);
            return;
        }
        if (obj instanceof Number) {
            a((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                a(io.sentry.config.a.G((Date) obj));
                return;
            } catch (Exception e10) {
                iLogger.g(SentryLevel.ERROR, "Error when serializing Date", e10);
                a(null);
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                a(((TimeZone) obj).getID());
                return;
            } catch (Exception e11) {
                iLogger.g(SentryLevel.ERROR, "Error when serializing TimeZone", e11);
                a(null);
                return;
            }
        }
        if (obj instanceof y1) {
            ((y1) obj).serialize(this, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            b(iLogger, (Collection) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            b(iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            e(iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            a(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            b(iLogger, io.sentry.util.c.a((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            a(Boolean.valueOf(((AtomicBoolean) obj).get()));
            return;
        }
        if (obj instanceof URI) {
            a(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            a(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            a(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            a(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            e(iLogger, io.sentry.util.c.d((Calendar) obj));
        } else if (obj.getClass().isEnum()) {
            a(obj.toString());
        } else {
            iLogger.q(SentryLevel.WARNING, "Failed serializing unknown object.", obj);
        }
    }

    @Override // io.sentry.y2
    public String i() {
        return null;
    }

    @Override // io.sentry.y2
    public y2 j(boolean z5) {
        a(Boolean.valueOf(z5));
        return this;
    }

    public void k() {
        ArrayDeque arrayDeque = this.f545d;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + s());
    }

    @Override // io.sentry.y2
    public y2 l() {
        a(this.f545d.removeLast());
        return this;
    }

    public void n(long j) throws IOException {
        long jS = s();
        if (jS != j) {
            if (jS != -1) {
                if (jS != -2) {
                    return;
                } else {
                    jS = -2;
                }
            }
            StringBuilder sbM = kk.b.m(j, "expected non-string scope or scope ", " but found ");
            sbM.append(jS);
            throw new IOException(sbM.toString());
        }
    }

    @Override // io.sentry.y2
    public y2 o(Number number) {
        a(number);
        return this;
    }

    @Override // io.sentry.y2
    public y2 q() {
        this.f545d.addLast(new HashMap());
        return this;
    }

    @Override // io.sentry.y2
    public /* bridge */ /* synthetic */ y2 r(ILogger iLogger, Object obj) {
        h(iLogger, obj);
        return this;
    }

    public long s() {
        ArrayDeque arrayDeque = this.f545d;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // io.sentry.y2
    public y2 t(Boolean bool) {
        a(bool);
        return this;
    }

    @Override // io.sentry.y2
    public y2 v(String str) {
        this.f545d.add(str);
        return this;
    }

    public m1(HashMap map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f545d = arrayDeque;
        arrayDeque.addLast(map);
    }

    @Override // io.sentry.y2
    public y2 p() {
        return this;
    }

    @Override // io.sentry.y2
    public void g(boolean z5) {
    }

    @Override // io.sentry.y2
    public void m(String str) {
    }
}
