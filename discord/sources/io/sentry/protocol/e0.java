package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f12935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ConcurrentHashMap f12936e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f12935d, ((e0) obj).f12935d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12935d);
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f12935d != null) {
            y2Var.v("active_profiles").r(iLogger, this.f12935d);
        }
        ConcurrentHashMap concurrentHashMap = this.f12936e;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.f12936e, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}
