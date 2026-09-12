package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f12971e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f12972i;

    public i0(String str, List list) {
        this.f12970d = str;
        this.f12971e = list;
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        String str = this.f12970d;
        if (str != null) {
            y2Var.v("rendering_system").f(str);
        }
        List list = this.f12971e;
        if (list != null) {
            y2Var.v("windows").r(iLogger, list);
        }
        HashMap map = this.f12972i;
        if (map != null) {
            for (String str2 : map.keySet()) {
                y2Var.v(str2).r(iLogger, this.f12972i.get(str2));
            }
        }
        y2Var.l();
    }
}
