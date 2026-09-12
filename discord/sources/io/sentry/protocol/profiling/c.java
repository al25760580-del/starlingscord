package io.sentry.protocol.profiling;

import com.facebook.react.devsupport.StackTraceHelper;
import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13030e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f13031i;

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f13029d != null) {
            y2Var.v(StackTraceHelper.NAME_KEY).r(iLogger, this.f13029d);
        }
        y2Var.v("priority").r(iLogger, Integer.valueOf(this.f13030e));
        HashMap map = this.f13031i;
        if (map != null) {
            for (String str : map.keySet()) {
                y2Var.v(str).r(iLogger, this.f13031i.get(str));
            }
        }
        y2Var.l();
    }
}
