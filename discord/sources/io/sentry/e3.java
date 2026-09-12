package io.sentry;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class e3 implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.sentry.protocol.v f12637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ConcurrentHashMap f12638e;

    public e3(io.sentry.protocol.v vVar) {
        this.f12637d = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e3) {
            return this.f12637d.equals(((e3) obj).f12637d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12637d});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("profiler_id").r(iLogger, this.f12637d);
        ConcurrentHashMap concurrentHashMap = this.f12638e;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                y2Var.v(str).r(iLogger, this.f12638e.get(str));
            }
        }
        y2Var.l();
    }
}
