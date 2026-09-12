package io.sentry.protocol.profiling;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f13025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13026e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f13027i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public HashMap f13028v;

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("timestamp").r(iLogger, BigDecimal.valueOf(this.f13025d).setScale(6, RoundingMode.DOWN));
        y2Var.v("stack_id").r(iLogger, Integer.valueOf(this.f13026e));
        if (this.f13027i != null) {
            y2Var.v("thread_id").r(iLogger, this.f13027i);
        }
        HashMap map = this.f13028v;
        if (map != null) {
            for (String str : map.keySet()) {
                y2Var.v(str).r(iLogger, this.f13028v.get(str));
            }
        }
        y2Var.l();
    }
}
