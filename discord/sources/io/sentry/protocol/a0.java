package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.AbstractMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f12914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractMap f12915e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f12916i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public z f12917v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ConcurrentHashMap f12918w;

    public a0(List list) {
        this.f12914d = list;
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f12914d != null) {
            y2Var.v("frames").r(iLogger, this.f12914d);
        }
        if (this.f12915e != null) {
            y2Var.v("registers").r(iLogger, this.f12915e);
        }
        if (this.f12916i != null) {
            y2Var.v("snapshot").t(this.f12916i);
        }
        if (this.f12917v != null) {
            y2Var.v("instruction_addr_adjustment").r(iLogger, this.f12917v);
        }
        ConcurrentHashMap concurrentHashMap = this.f12918w;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.f12918w, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}
