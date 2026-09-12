package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends e implements y1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13122v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f13123w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public HashMap f13124x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public HashMap f13125y;

    public i() {
        super(d.TouchMove);
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("type").r(iLogger, this.f13110d);
        y2Var.v("timestamp").c(this.f13111e);
        y2Var.v("data");
        y2Var.q();
        y2Var.v("source").r(iLogger, this.f13112i);
        List list = this.f13123w;
        if (list != null && !list.isEmpty()) {
            y2Var.v("positions").r(iLogger, this.f13123w);
        }
        y2Var.v("pointerId").c(this.f13122v);
        HashMap map = this.f13125y;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f13125y.get(str);
                y2Var.v(str);
                y2Var.r(iLogger, obj);
            }
        }
        y2Var.l();
        HashMap map2 = this.f13124x;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                Object obj2 = this.f13124x.get(str2);
                y2Var.v(str2);
                y2Var.r(iLogger, obj2);
            }
        }
        y2Var.l();
    }
}
