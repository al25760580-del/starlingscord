package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ConcurrentHashMap f13033e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f13034i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Long f13035v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f13036w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ConcurrentHashMap f13037x;

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f13032d != null) {
            y2Var.v("cookies").f(this.f13032d);
        }
        if (this.f13033e != null) {
            y2Var.v("headers").r(iLogger, this.f13033e);
        }
        if (this.f13034i != null) {
            y2Var.v("status_code").r(iLogger, this.f13034i);
        }
        if (this.f13035v != null) {
            y2Var.v("body_size").r(iLogger, this.f13035v);
        }
        if (this.f13036w != null) {
            y2Var.v("data").r(iLogger, this.f13036w);
        }
        ConcurrentHashMap concurrentHashMap = this.f13037x;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.f13037x, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}
