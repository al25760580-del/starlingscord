package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13049e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f13050i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Long f13051v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a0 f13052w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m f13053x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public HashMap f13054y;

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f13048d != null) {
            y2Var.v("type").f(this.f13048d);
        }
        if (this.f13049e != null) {
            y2Var.v("value").f(this.f13049e);
        }
        if (this.f13050i != null) {
            y2Var.v("module").f(this.f13050i);
        }
        if (this.f13051v != null) {
            y2Var.v("thread_id").o(this.f13051v);
        }
        if (this.f13052w != null) {
            y2Var.v("stacktrace").r(iLogger, this.f13052w);
        }
        if (this.f13053x != null) {
            y2Var.v("mechanism").r(iLogger, this.f13053x);
        }
        HashMap map = this.f13054y;
        if (map != null) {
            for (String str : map.keySet()) {
                y2Var.v(str).r(iLogger, this.f13054y.get(str));
            }
        }
        y2Var.l();
    }
}
