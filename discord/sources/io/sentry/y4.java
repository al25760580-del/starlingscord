package io.sentry;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class y4 implements y1 {
    public HashMap E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.sentry.protocol.v f13287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l6 f13288e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Double f13289i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f13290v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a5 f13291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f13292x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Map f13293y;

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("timestamp").r(iLogger, io.sentry.config.a.o(this.f13289i));
        y2Var.v("trace_id").r(iLogger, this.f13287d);
        if (this.f13288e != null) {
            y2Var.v("span_id").r(iLogger, this.f13288e);
        }
        y2Var.v("body").f(this.f13290v);
        y2Var.v("level").r(iLogger, this.f13291w);
        if (this.f13292x != null) {
            y2Var.v("severity_number").r(iLogger, this.f13292x);
        }
        if (this.f13293y != null) {
            y2Var.v("attributes").r(iLogger, this.f13293y);
        }
        HashMap map = this.E;
        if (map != null) {
            for (String str : map.keySet()) {
                y2Var.v(str).r(iLogger, this.E.get(str));
            }
        }
        y2Var.l();
    }
}
