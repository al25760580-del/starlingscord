package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements y1 {
    public AbstractMap E;
    public List F;
    public String G;
    public Boolean H;
    public Boolean I;
    public List J;
    public ConcurrentHashMap K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Date f12908e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f12909i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f12910v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f12911w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f12912x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f12913y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return com.facebook.imagepipeline.nativecode.c.r(this.f12907d, aVar.f12907d) && com.facebook.imagepipeline.nativecode.c.r(this.f12908e, aVar.f12908e) && com.facebook.imagepipeline.nativecode.c.r(this.f12909i, aVar.f12909i) && com.facebook.imagepipeline.nativecode.c.r(this.f12910v, aVar.f12910v) && com.facebook.imagepipeline.nativecode.c.r(this.f12911w, aVar.f12911w) && com.facebook.imagepipeline.nativecode.c.r(this.f12912x, aVar.f12912x) && com.facebook.imagepipeline.nativecode.c.r(this.f12913y, aVar.f12913y) && com.facebook.imagepipeline.nativecode.c.r(this.E, aVar.E) && com.facebook.imagepipeline.nativecode.c.r(this.H, aVar.H) && com.facebook.imagepipeline.nativecode.c.r(this.F, aVar.F) && com.facebook.imagepipeline.nativecode.c.r(this.G, aVar.G) && com.facebook.imagepipeline.nativecode.c.r(this.I, aVar.I) && com.facebook.imagepipeline.nativecode.c.r(this.J, aVar.J);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12907d, this.f12908e, this.f12909i, this.f12910v, this.f12911w, this.f12912x, this.f12913y, this.E, this.H, this.F, this.G, this.I, this.J});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f12907d != null) {
            y2Var.v("app_identifier").f(this.f12907d);
        }
        if (this.f12908e != null) {
            y2Var.v("app_start_time").r(iLogger, this.f12908e);
        }
        if (this.f12909i != null) {
            y2Var.v("device_app_hash").f(this.f12909i);
        }
        if (this.f12910v != null) {
            y2Var.v("build_type").f(this.f12910v);
        }
        if (this.f12911w != null) {
            y2Var.v("app_name").f(this.f12911w);
        }
        if (this.f12912x != null) {
            y2Var.v("app_version").f(this.f12912x);
        }
        if (this.f12913y != null) {
            y2Var.v("app_build").f(this.f12913y);
        }
        AbstractMap abstractMap = this.E;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            y2Var.v("permissions").r(iLogger, this.E);
        }
        if (this.H != null) {
            y2Var.v("in_foreground").t(this.H);
        }
        if (this.F != null) {
            y2Var.v("view_names").r(iLogger, this.F);
        }
        if (this.G != null) {
            y2Var.v("start_type").f(this.G);
        }
        if (this.I != null) {
            y2Var.v("is_split_apks").t(this.I);
        }
        List list = this.J;
        if (list != null && !list.isEmpty()) {
            y2Var.v("split_names").r(iLogger, this.J);
        }
        ConcurrentHashMap concurrentHashMap = this.K;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                y2Var.v(str).r(iLogger, this.K.get(str));
            }
        }
        y2Var.l();
    }
}
