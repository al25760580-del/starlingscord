package io.sentry;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d3 implements y1 {
    public String E;
    public String F;
    public double G;
    public final File H;
    public io.sentry.protocol.profiling.a J;
    public ConcurrentHashMap K;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public io.sentry.protocol.v f12613e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public io.sentry.protocol.v f12614i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public io.sentry.protocol.t f12615v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Map f12616w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f12617x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f12618y;
    public String I = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.sentry.protocol.d f12612d = null;

    public d3(io.sentry.protocol.v vVar, io.sentry.protocol.v vVar2, File file, Map map, Double d6, String str, w5 w5Var) {
        this.f12613e = vVar;
        this.f12614i = vVar2;
        this.H = file;
        this.f12616w = map;
        this.f12615v = w5Var.getSdkVersion();
        this.f12618y = w5Var.getRelease() != null ? w5Var.getRelease() : "";
        this.E = w5Var.getEnvironment();
        this.f12617x = str;
        this.F = "2";
        this.G = d6.doubleValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return Objects.equals(this.f12612d, d3Var.f12612d) && Objects.equals(this.f12613e, d3Var.f12613e) && Objects.equals(this.f12614i, d3Var.f12614i) && Objects.equals(this.f12615v, d3Var.f12615v) && Objects.equals(this.f12616w, d3Var.f12616w) && Objects.equals(this.f12617x, d3Var.f12617x) && Objects.equals(this.f12618y, d3Var.f12618y) && Objects.equals(this.E, d3Var.E) && Objects.equals(this.F, d3Var.F) && Objects.equals(this.I, d3Var.I) && Objects.equals(this.K, d3Var.K) && Objects.equals(this.J, d3Var.J);
    }

    public final int hashCode() {
        return Objects.hash(this.f12612d, this.f12613e, this.f12614i, this.f12615v, this.f12616w, this.f12617x, this.f12618y, this.E, this.F, this.I, this.J, this.K);
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f12612d != null) {
            y2Var.v("debug_meta").r(iLogger, this.f12612d);
        }
        y2Var.v("profiler_id").r(iLogger, this.f12613e);
        y2Var.v("chunk_id").r(iLogger, this.f12614i);
        if (this.f12615v != null) {
            y2Var.v("client_sdk").r(iLogger, this.f12615v);
        }
        Map map = this.f12616w;
        if (!map.isEmpty()) {
            String strI = y2Var.i();
            y2Var.m("");
            y2Var.v("measurements").r(iLogger, map);
            y2Var.m(strI);
        }
        y2Var.v("platform").r(iLogger, this.f12617x);
        y2Var.v("release").r(iLogger, this.f12618y);
        if (this.E != null) {
            y2Var.v("environment").r(iLogger, this.E);
        }
        y2Var.v("version").r(iLogger, this.F);
        if (this.I != null) {
            y2Var.v("sampled_profile").r(iLogger, this.I);
        }
        y2Var.v("timestamp").r(iLogger, BigDecimal.valueOf(this.G).setScale(6, RoundingMode.DOWN));
        if (this.J != null) {
            y2Var.v("profile").r(iLogger, this.J);
        }
        ConcurrentHashMap concurrentHashMap = this.K;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                y2Var.v(str).r(iLogger, this.K.get(str));
            }
        }
        y2Var.l();
    }
}
