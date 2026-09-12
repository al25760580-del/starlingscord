package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Hint {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f12011h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12012a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f12013b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.sentry.util.a f12014c = new io.sentry.util.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f12015d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f12016e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f12017f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l3 f12018g = null;

    static {
        HashMap map = new HashMap();
        f12011h = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put("long", Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    public final void a() {
        r rVarA = this.f12014c.a();
        try {
            Iterator it = this.f12012a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() == null || !((String) entry.getKey()).startsWith("sentry:")) {
                    it.remove();
                }
            }
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final Object b(String str) {
        r rVarA = this.f12014c.a();
        try {
            Object obj = this.f12012a.get(str);
            rVarA.close();
            return obj;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final Object c(Class cls, String str) {
        r rVarA = this.f12014c.a();
        try {
            Object obj = this.f12012a.get(str);
            if (cls.isInstance(obj)) {
                rVarA.close();
                return obj;
            }
            Class cls2 = (Class) f12011h.get(cls.getCanonicalName());
            if (obj == null || !cls.isPrimitive() || cls2 == null || !cls2.isInstance(obj)) {
                rVarA.close();
                return null;
            }
            rVarA.close();
            return obj;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void d(Object obj, String str) {
        r rVarA = this.f12014c.a();
        try {
            this.f12012a.put(str, obj);
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
