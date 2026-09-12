package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.i6;
import io.sentry.j4;
import io.sentry.j6;
import io.sentry.l6;
import io.sentry.m6;
import io.sentry.y1;
import io.sentry.y2;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements y1 {
    public final m6 E;
    public final String F;
    public final Map G;
    public Map H;
    public final Map I;
    public ConcurrentHashMap J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f13064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f13065e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v f13066i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l6 f13067v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l6 f13068w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f13069x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f13070y;

    public y(Double d6, Double d7, v vVar, l6 l6Var, l6 l6Var2, String str, String str2, m6 m6Var, String str3, Map map, Map map2, Map map3) {
        this.f13064d = d6;
        this.f13065e = d7;
        this.f13066i = vVar;
        this.f13067v = l6Var;
        this.f13068w = l6Var2;
        this.f13069x = str;
        this.f13070y = str2;
        this.E = m6Var;
        this.F = str3;
        this.G = map;
        this.I = map2;
        this.H = map3;
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2 y2VarV = y2Var.v("start_timestamp");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.f13064d.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        y2VarV.r(iLogger, bigDecimalValueOf.setScale(6, roundingMode));
        Double d6 = this.f13065e;
        if (d6 != null) {
            y2Var.v("timestamp").r(iLogger, BigDecimal.valueOf(d6.doubleValue()).setScale(6, roundingMode));
        }
        y2Var.v("trace_id").r(iLogger, this.f13066i);
        y2Var.v("span_id").r(iLogger, this.f13067v);
        l6 l6Var = this.f13068w;
        if (l6Var != null) {
            y2Var.v("parent_span_id").r(iLogger, l6Var);
        }
        y2Var.v("op").f(this.f13069x);
        String str = this.f13070y;
        if (str != null) {
            y2Var.v("description").f(str);
        }
        m6 m6Var = this.E;
        if (m6Var != null) {
            y2Var.v("status").r(iLogger, m6Var);
        }
        String str2 = this.F;
        if (str2 != null) {
            y2Var.v("origin").r(iLogger, str2);
        }
        Map map = this.G;
        if (!map.isEmpty()) {
            y2Var.v("tags").r(iLogger, map);
        }
        if (this.H != null) {
            y2Var.v("data").r(iLogger, this.H);
        }
        Map map2 = this.I;
        if (!map2.isEmpty()) {
            y2Var.v("measurements").r(iLogger, map2);
        }
        ConcurrentHashMap concurrentHashMap = this.J;
        if (concurrentHashMap != null) {
            for (String str3 : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.J, str3, y2Var, str3, iLogger);
            }
        }
        y2Var.l();
    }

    public y(i6 i6Var) {
        ConcurrentHashMap concurrentHashMap = i6Var.j;
        j6 j6Var = i6Var.f12746c;
        this.f13070y = j6Var.f12787x;
        this.f13069x = j6Var.f12786w;
        this.f13067v = j6Var.f12783e;
        this.f13068w = j6Var.f12784i;
        this.f13066i = j6Var.f12782d;
        this.E = j6Var.f12788y;
        this.F = j6Var.F;
        ConcurrentHashMap concurrentHashMapF = xr.m.F(j6Var.E);
        this.G = concurrentHashMapF == null ? new ConcurrentHashMap() : concurrentHashMapF;
        ConcurrentHashMap concurrentHashMapF2 = xr.m.F(i6Var.k);
        this.I = concurrentHashMapF2 == null ? new ConcurrentHashMap() : concurrentHashMapF2;
        j4 j4Var = i6Var.f12745b;
        this.f13065e = j4Var == null ? null : Double.valueOf(i6Var.f12744a.c(j4Var) / 1.0E9d);
        this.f13064d = Double.valueOf(i6Var.f12744a.d() / 1.0E9d);
        this.H = concurrentHashMap;
        j6Var.K.h();
    }
}
