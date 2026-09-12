package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements y1 {
    public Long E;
    public ConcurrentHashMap F;
    public String G;
    public String H;
    public ConcurrentHashMap I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13014e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f13015i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f13016v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f13017w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ConcurrentHashMap f13018x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ConcurrentHashMap f13019y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return com.facebook.imagepipeline.nativecode.c.r(this.f13013d, pVar.f13013d) && com.facebook.imagepipeline.nativecode.c.r(this.f13014e, pVar.f13014e) && com.facebook.imagepipeline.nativecode.c.r(this.f13015i, pVar.f13015i) && com.facebook.imagepipeline.nativecode.c.r(this.f13017w, pVar.f13017w) && com.facebook.imagepipeline.nativecode.c.r(this.f13018x, pVar.f13018x) && com.facebook.imagepipeline.nativecode.c.r(this.f13019y, pVar.f13019y) && com.facebook.imagepipeline.nativecode.c.r(this.E, pVar.E) && com.facebook.imagepipeline.nativecode.c.r(this.G, pVar.G) && com.facebook.imagepipeline.nativecode.c.r(this.H, pVar.H);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13013d, this.f13014e, this.f13015i, this.f13017w, this.f13018x, this.f13019y, this.E, this.G, this.H});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f13013d != null) {
            y2Var.v("url").f(this.f13013d);
        }
        if (this.f13014e != null) {
            y2Var.v("method").f(this.f13014e);
        }
        if (this.f13015i != null) {
            y2Var.v("query_string").f(this.f13015i);
        }
        if (this.f13016v != null) {
            y2Var.v("data").r(iLogger, this.f13016v);
        }
        if (this.f13017w != null) {
            y2Var.v("cookies").f(this.f13017w);
        }
        if (this.f13018x != null) {
            y2Var.v("headers").r(iLogger, this.f13018x);
        }
        if (this.f13019y != null) {
            y2Var.v("env").r(iLogger, this.f13019y);
        }
        if (this.F != null) {
            y2Var.v("other").r(iLogger, this.F);
        }
        if (this.G != null) {
            y2Var.v("fragment").r(iLogger, this.G);
        }
        if (this.E != null) {
            y2Var.v("body_size").r(iLogger, this.E);
        }
        if (this.H != null) {
            y2Var.v("api_target").r(iLogger, this.H);
        }
        ConcurrentHashMap concurrentHashMap = this.I;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.I, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}
