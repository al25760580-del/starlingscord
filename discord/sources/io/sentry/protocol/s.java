package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f13039e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f13040i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f13041v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public HashMap f13042w;

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f13038d != null) {
            y2Var.v("sdk_name").f(this.f13038d);
        }
        if (this.f13039e != null) {
            y2Var.v("version_major").o(this.f13039e);
        }
        if (this.f13040i != null) {
            y2Var.v("version_minor").o(this.f13040i);
        }
        if (this.f13041v != null) {
            y2Var.v("version_patchlevel").o(this.f13041v);
        }
        HashMap map = this.f13042w;
        if (map != null) {
            for (String str : map.keySet()) {
                y2Var.v(str).r(iLogger, this.f13042w.get(str));
            }
        }
        y2Var.l();
    }
}
