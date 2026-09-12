package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f12954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ConcurrentHashMap f12955e;

    public h(List list) {
        this.f12954d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return com.facebook.imagepipeline.nativecode.c.r(this.f12954d, ((h) obj).f12954d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12954d});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("values").r(iLogger, this.f12954d);
        ConcurrentHashMap concurrentHashMap = this.f12955e;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                y2Var.v(str).r(iLogger, this.f12955e.get(str));
            }
        }
        y2Var.l();
    }
}
