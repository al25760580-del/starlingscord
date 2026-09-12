package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13003e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f13004i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ConcurrentHashMap f13005v;

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f13002d != null) {
            y2Var.v("formatted").f(this.f13002d);
        }
        if (this.f13003e != null) {
            y2Var.v("message").f(this.f13003e);
        }
        List list = this.f13004i;
        if (list != null && !list.isEmpty()) {
            y2Var.v("params").r(iLogger, this.f13004i);
        }
        ConcurrentHashMap concurrentHashMap = this.f13005v;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.f13005v, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}
