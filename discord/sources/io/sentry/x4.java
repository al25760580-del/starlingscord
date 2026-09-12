package io.sentry;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class x4 implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13279e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f13280i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f13281v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Long f13282w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ConcurrentHashMap f13283x;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x4.class != obj.getClass()) {
            return false;
        }
        return com.facebook.imagepipeline.nativecode.c.r(this.f13279e, ((x4) obj).f13279e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13279e});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("type").c(this.f13278d);
        if (this.f13279e != null) {
            y2Var.v("address").f(this.f13279e);
        }
        if (this.f13280i != null) {
            y2Var.v("package_name").f(this.f13280i);
        }
        if (this.f13281v != null) {
            y2Var.v("class_name").f(this.f13281v);
        }
        if (this.f13282w != null) {
            y2Var.v("thread_id").o(this.f13282w);
        }
        ConcurrentHashMap concurrentHashMap = this.f13283x;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.f13283x, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}
