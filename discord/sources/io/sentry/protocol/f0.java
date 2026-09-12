package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ConcurrentHashMap f12950e;

    public f0(String str) {
        this.f12949d = str;
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        String str = this.f12949d;
        if (str != null) {
            y2Var.v("source").r(iLogger, str);
        }
        ConcurrentHashMap concurrentHashMap = this.f12950e;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.f12950e, str2, y2Var, str2, iLogger);
            }
        }
        y2Var.l();
    }
}
