package io.sentry.clientreport;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12571e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f12572i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public HashMap f12573v;

    public e(Long l6, String str, String str2) {
        this.f12570d = str;
        this.f12571e = str2;
        this.f12572i = l6;
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("reason").f(this.f12570d);
        y2Var.v("category").f(this.f12571e);
        y2Var.v("quantity").o(this.f12572i);
        HashMap map = this.f12573v;
        if (map != null) {
            for (String str : map.keySet()) {
                y2Var.v(str).r(iLogger, this.f12573v.get(str));
            }
        }
        y2Var.l();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.f12570d + "', category='" + this.f12571e + "', quantity=" + this.f12572i + '}';
    }
}
