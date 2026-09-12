package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.y1;
import io.sentry.y2;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b implements y1 {
    public SentryLevel E;
    public ConcurrentHashMap F;
    public HashMap G;
    public ConcurrentHashMap H;
    public ConcurrentHashMap I;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f13105i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public double f13106v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f13107w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f13108x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f13109y;

    public a() {
        super(c.Custom);
        this.f13105i = "breadcrumb";
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("type").r(iLogger, this.f13110d);
        y2Var.v("timestamp").c(this.f13111e);
        y2Var.v("data");
        y2Var.q();
        y2Var.v("tag").f(this.f13105i);
        y2Var.v("payload");
        y2Var.q();
        if (this.f13107w != null) {
            y2Var.v("type").f(this.f13107w);
        }
        y2Var.v("timestamp").r(iLogger, BigDecimal.valueOf(this.f13106v));
        if (this.f13108x != null) {
            y2Var.v("category").f(this.f13108x);
        }
        if (this.f13109y != null) {
            y2Var.v("message").f(this.f13109y);
        }
        if (this.E != null) {
            y2Var.v("level").r(iLogger, this.E);
        }
        if (this.F != null) {
            y2Var.v("data").r(iLogger, this.F);
        }
        ConcurrentHashMap concurrentHashMap = this.H;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.H, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
        ConcurrentHashMap concurrentHashMap2 = this.I;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                com.discord.chat.presentation.list.a.s(this.I, str2, y2Var, str2, iLogger);
            }
        }
        y2Var.l();
        HashMap map = this.G;
        if (map != null) {
            for (String str3 : map.keySet()) {
                Object obj = this.G.get(str3);
                y2Var.v(str3);
                y2Var.r(iLogger, obj);
            }
        }
        y2Var.l();
    }
}
