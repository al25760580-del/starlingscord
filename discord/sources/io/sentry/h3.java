package io.sentry;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class h3 implements y1 {
    public ConcurrentHashMap E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12704e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f12705i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Long f12706v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Long f12707w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Long f12708x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Long f12709y;

    public h3(f1 f1Var, Long l6, Long l7) {
        this.f12703d = f1Var.k().toString();
        this.f12704e = f1Var.o().f12782d.toString();
        this.f12705i = f1Var.getName().isEmpty() ? "unknown" : f1Var.getName();
        this.f12706v = l6;
        this.f12708x = l7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h3.class != obj.getClass()) {
            return false;
        }
        h3 h3Var = (h3) obj;
        return this.f12703d.equals(h3Var.f12703d) && this.f12704e.equals(h3Var.f12704e) && this.f12705i.equals(h3Var.f12705i) && this.f12706v.equals(h3Var.f12706v) && this.f12708x.equals(h3Var.f12708x) && com.facebook.imagepipeline.nativecode.c.r(this.f12709y, h3Var.f12709y) && com.facebook.imagepipeline.nativecode.c.r(this.f12707w, h3Var.f12707w) && com.facebook.imagepipeline.nativecode.c.r(this.E, h3Var.E);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12703d, this.f12704e, this.f12705i, this.f12706v, this.f12707w, this.f12708x, this.f12709y, this.E});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v(StackTraceHelper.ID_KEY).r(iLogger, this.f12703d);
        y2Var.v("trace_id").r(iLogger, this.f12704e);
        y2Var.v(StackTraceHelper.NAME_KEY).r(iLogger, this.f12705i);
        y2Var.v("relative_start_ns").r(iLogger, this.f12706v);
        y2Var.v("relative_end_ns").r(iLogger, this.f12707w);
        y2Var.v("relative_cpu_start_ms").r(iLogger, this.f12708x);
        y2Var.v("relative_cpu_end_ms").r(iLogger, this.f12709y);
        ConcurrentHashMap concurrentHashMap = this.E;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.E, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}
