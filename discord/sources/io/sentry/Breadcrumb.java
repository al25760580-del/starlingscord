package io.sentry;

import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class Breadcrumb implements y1, Comparable {
    public String E;
    public SentryLevel F;
    public ConcurrentHashMap G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f12004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Date f12005e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f12006i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f12007v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f12008w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ConcurrentHashMap f12009x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f12010y;

    public Breadcrumb(Date date) {
        this.f12009x = new ConcurrentHashMap();
        this.f12006i = Long.valueOf(System.nanoTime());
        this.f12005e = date;
        this.f12004d = null;
    }

    public static boolean a(Breadcrumb breadcrumb, Breadcrumb breadcrumb2) {
        return breadcrumb.b().getTime() == breadcrumb2.b().getTime() && com.facebook.imagepipeline.nativecode.c.r(breadcrumb.f12007v, breadcrumb2.f12007v) && com.facebook.imagepipeline.nativecode.c.r(breadcrumb.f12008w, breadcrumb2.f12008w) && com.facebook.imagepipeline.nativecode.c.r(breadcrumb.f12010y, breadcrumb2.f12010y) && com.facebook.imagepipeline.nativecode.c.r(breadcrumb.E, breadcrumb2.E) && breadcrumb.F == breadcrumb2.F;
    }

    public final Date b() {
        Date date = this.f12005e;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l6 = this.f12004d;
        if (l6 == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date dateZ = io.sentry.config.a.z(l6.longValue());
        this.f12005e = dateZ;
        return dateZ;
    }

    public final void c(Object obj, String str) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.f12009x.remove(str);
        } else {
            this.f12009x.put(str, obj);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12006i.compareTo(((Breadcrumb) obj).f12006i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Breadcrumb.class != obj.getClass()) {
            return false;
        }
        Breadcrumb breadcrumb = (Breadcrumb) obj;
        if ("http".equals(this.f12008w)) {
            return a(this, breadcrumb) && com.facebook.imagepipeline.nativecode.c.r(this.f12009x.get("status_code"), breadcrumb.f12009x.get("status_code")) && com.facebook.imagepipeline.nativecode.c.r(this.f12009x.get("url"), breadcrumb.f12009x.get("url")) && com.facebook.imagepipeline.nativecode.c.r(this.f12009x.get("method"), breadcrumb.f12009x.get("method")) && com.facebook.imagepipeline.nativecode.c.r(this.f12009x.get("http.fragment"), breadcrumb.f12009x.get("http.fragment")) && com.facebook.imagepipeline.nativecode.c.r(this.f12009x.get("http.query"), breadcrumb.f12009x.get("http.query"));
        }
        return a(this, breadcrumb);
    }

    public final int hashCode() {
        return "http".equals(this.f12008w) ? Arrays.hashCode(new Object[]{Long.valueOf(b().getTime()), this.f12007v, this.f12008w, this.f12010y, this.E, this.F, this.f12009x.get("status_code"), this.f12009x.get("url"), this.f12009x.get("method"), this.f12009x.get("http.fragment"), this.f12009x.get("http.query")}) : Arrays.hashCode(new Object[]{Long.valueOf(b().getTime()), this.f12007v, this.f12008w, this.f12010y, this.E, this.F});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("timestamp").r(iLogger, b());
        if (this.f12007v != null) {
            y2Var.v("message").f(this.f12007v);
        }
        if (this.f12008w != null) {
            y2Var.v("type").f(this.f12008w);
        }
        y2Var.v("data").r(iLogger, this.f12009x);
        if (this.f12010y != null) {
            y2Var.v("category").f(this.f12010y);
        }
        if (this.E != null) {
            y2Var.v("origin").f(this.E);
        }
        if (this.F != null) {
            y2Var.v("level").r(iLogger, this.F);
        }
        ConcurrentHashMap concurrentHashMap = this.G;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.G, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }

    public Breadcrumb(long j) {
        this.f12009x = new ConcurrentHashMap();
        this.f12006i = Long.valueOf(System.nanoTime());
        this.f12004d = Long.valueOf(j);
        this.f12005e = null;
    }

    public Breadcrumb(Breadcrumb breadcrumb) {
        this.f12009x = new ConcurrentHashMap();
        this.f12006i = Long.valueOf(System.nanoTime());
        this.f12005e = breadcrumb.f12005e;
        this.f12004d = breadcrumb.f12004d;
        this.f12007v = breadcrumb.f12007v;
        this.f12008w = breadcrumb.f12008w;
        this.f12010y = breadcrumb.f12010y;
        this.E = breadcrumb.E;
        ConcurrentHashMap concurrentHashMapF = xr.m.F(breadcrumb.f12009x);
        if (concurrentHashMapF != null) {
            this.f12009x = concurrentHashMapF;
        }
        this.G = xr.m.F(breadcrumb.G);
        this.F = breadcrumb.F;
    }

    public Breadcrumb() {
        this(System.currentTimeMillis());
    }
}
