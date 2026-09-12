package io.sentry.clientreport;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Date f12565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f12566e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f12567i;

    public b(Date date, ArrayList arrayList) {
        this.f12565d = date;
        this.f12566e = arrayList;
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("timestamp").f(io.sentry.config.a.G(this.f12565d));
        y2Var.v("discarded_events").r(iLogger, this.f12566e);
        HashMap map = this.f12567i;
        if (map != null) {
            for (String str : map.keySet()) {
                y2Var.v(str).r(iLogger, this.f12567i.get(str));
            }
        }
        y2Var.l();
    }
}
