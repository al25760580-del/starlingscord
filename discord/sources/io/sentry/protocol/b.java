package io.sentry.protocol;

import com.facebook.react.devsupport.StackTraceHelper;
import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12920e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ConcurrentHashMap f12921i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (com.facebook.imagepipeline.nativecode.c.r(this.f12919d, bVar.f12919d) && com.facebook.imagepipeline.nativecode.c.r(this.f12920e, bVar.f12920e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12919d, this.f12920e});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f12919d != null) {
            y2Var.v(StackTraceHelper.NAME_KEY).f(this.f12919d);
        }
        if (this.f12920e != null) {
            y2Var.v("version").f(this.f12920e);
        }
        ConcurrentHashMap concurrentHashMap = this.f12921i;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.f12921i, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}
