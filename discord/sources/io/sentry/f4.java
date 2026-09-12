package io.sentry;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f4 {
    public String E;
    public io.sentry.protocol.h0 F;
    public transient Throwable G;
    public String H;
    public String I;
    public List J;
    public io.sentry.protocol.d K;
    public AbstractMap L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.sentry.protocol.v f12670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.sentry.protocol.c f12671e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public io.sentry.protocol.t f12672i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public io.sentry.protocol.p f12673v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AbstractMap f12674w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f12675x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f12676y;

    public f4(io.sentry.protocol.v vVar) {
        this.f12671e = new io.sentry.protocol.c();
        this.f12670d = vVar;
    }

    public final Throwable a() {
        Throwable th2 = this.G;
        return th2 instanceof io.sentry.exception.a ? ((io.sentry.exception.a) th2).f12659e : th2;
    }

    public final void b(Object obj, String str) {
        if (this.L == null) {
            this.L = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (obj != null) {
            this.L.put(str, obj);
            return;
        }
        AbstractMap abstractMap = this.L;
        if (abstractMap != null) {
            abstractMap.remove(str);
        }
    }

    public final void c(String str, String str2) {
        if (this.f12674w == null) {
            this.f12674w = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (str2 != null) {
            this.f12674w.put(str, str2);
            return;
        }
        AbstractMap abstractMap = this.f12674w;
        if (abstractMap != null) {
            abstractMap.remove(str);
        }
    }

    public f4() {
        this(new io.sentry.protocol.v());
    }
}
