package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends b implements y1 {
    public ConcurrentHashMap E;
    public HashMap F;
    public ConcurrentHashMap G;
    public ConcurrentHashMap H;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f13132i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f13133v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f13134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public double f13135x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public double f13136y;

    public l() {
        super(c.Custom);
        this.f13132i = "performanceSpan";
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("type").r(iLogger, this.f13110d);
        y2Var.v("timestamp").c(this.f13111e);
        y2Var.v("data");
        y2Var.q();
        y2Var.v("tag").f(this.f13132i);
        y2Var.v("payload");
        y2Var.q();
        if (this.f13133v != null) {
            y2Var.v("op").f(this.f13133v);
        }
        if (this.f13134w != null) {
            y2Var.v("description").f(this.f13134w);
        }
        y2Var.v("startTimestamp").r(iLogger, BigDecimal.valueOf(this.f13135x));
        y2Var.v("endTimestamp").r(iLogger, BigDecimal.valueOf(this.f13136y));
        if (this.E != null) {
            y2Var.v("data").r(iLogger, this.E);
        }
        ConcurrentHashMap concurrentHashMap = this.G;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.G, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
        ConcurrentHashMap concurrentHashMap2 = this.H;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                com.discord.chat.presentation.list.a.s(this.H, str2, y2Var, str2, iLogger);
            }
        }
        y2Var.l();
        HashMap map = this.F;
        if (map != null) {
            for (String str3 : map.keySet()) {
                Object obj = this.F.get(str3);
                y2Var.v(str3);
                y2Var.r(iLogger, obj);
            }
        }
        y2Var.l();
    }
}
