package io.sentry;

import com.discord.js_watchdog.SharedPreferencesKey;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class l4 implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.sentry.protocol.v f12796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.sentry.protocol.t f12797e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o6 f12798i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Date f12799v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public HashMap f12800w;

    public l4(io.sentry.protocol.v vVar, io.sentry.protocol.t tVar, o6 o6Var) {
        this.f12796d = vVar;
        this.f12797e = tVar;
        this.f12798i = o6Var;
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        io.sentry.protocol.v vVar = this.f12796d;
        if (vVar != null) {
            y2Var.v("event_id").r(iLogger, vVar);
        }
        io.sentry.protocol.t tVar = this.f12797e;
        if (tVar != null) {
            y2Var.v("sdk").r(iLogger, tVar);
        }
        o6 o6Var = this.f12798i;
        if (o6Var != null) {
            y2Var.v(SharedPreferencesKey.TRACE).r(iLogger, o6Var);
        }
        if (this.f12799v != null) {
            y2Var.v("sent_at").r(iLogger, io.sentry.config.a.G(this.f12799v));
        }
        HashMap map = this.f12800w;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f12800w.get(str);
                y2Var.v(str);
                y2Var.r(iLogger, obj);
            }
        }
        y2Var.l();
    }
}
