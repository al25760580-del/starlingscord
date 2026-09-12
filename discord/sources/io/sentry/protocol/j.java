package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12974e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f12975i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ConcurrentHashMap f12976v;

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f12973d != null) {
            y2Var.v("city").f(this.f12973d);
        }
        if (this.f12974e != null) {
            y2Var.v("country_code").f(this.f12974e);
        }
        if (this.f12975i != null) {
            y2Var.v("region").f(this.f12975i);
        }
        ConcurrentHashMap concurrentHashMap = this.f12976v;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.f12976v, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}
