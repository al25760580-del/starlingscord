package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12952e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ConcurrentHashMap f12953i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (com.facebook.imagepipeline.nativecode.c.r(this.f12951d, gVar.f12951d) && com.facebook.imagepipeline.nativecode.c.r(Boolean.valueOf(this.f12952e), Boolean.valueOf(gVar.f12952e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12951d, Boolean.valueOf(this.f12952e)});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("flag").f(this.f12951d);
        y2Var.v("result").j(this.f12952e);
        ConcurrentHashMap concurrentHashMap = this.f12953i;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                y2Var.v(str).r(iLogger, this.f12953i.get(str));
            }
        }
        y2Var.l();
    }
}
