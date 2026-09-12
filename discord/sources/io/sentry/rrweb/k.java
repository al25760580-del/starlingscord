package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends b implements y1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f13130i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public HashMap f13131v;

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("type").r(iLogger, this.f13110d);
        y2Var.v("timestamp").c(this.f13111e);
        y2Var.v("data");
        y2Var.q();
        y2Var.v("tag").f(this.f13130i);
        y2Var.v("payload");
        y2Var.q();
        HashMap map = this.f13131v;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                y2Var.v(str);
                y2Var.r(iLogger, obj);
            }
        }
        y2Var.l();
        y2Var.l();
        y2Var.l();
    }
}
