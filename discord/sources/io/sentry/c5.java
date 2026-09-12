package io.sentry;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c5 implements y1 {
    public Map E;
    public HashMap F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.sentry.protocol.v f12520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l6 f12521e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Double f12522i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f12523v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f12524w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f12525x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Double f12526y;

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("timestamp").r(iLogger, io.sentry.config.a.o(this.f12522i));
        y2Var.v("type").f(this.f12525x);
        y2Var.v(StackTraceHelper.NAME_KEY).f(this.f12523v);
        y2Var.v("value").o(this.f12526y);
        y2Var.v("trace_id").r(iLogger, this.f12520d);
        if (this.f12521e != null) {
            y2Var.v("span_id").r(iLogger, this.f12521e);
        }
        if (this.f12524w != null) {
            y2Var.v("unit").r(iLogger, this.f12524w);
        }
        if (this.E != null) {
            y2Var.v("attributes").r(iLogger, this.E);
        }
        HashMap map = this.F;
        if (map != null) {
            for (String str : map.keySet()) {
                y2Var.v(str).r(iLogger, this.F.get(str));
            }
        }
        y2Var.l();
    }
}
