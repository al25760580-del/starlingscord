package io.sentry.rrweb;

import com.facebook.react.devsupport.StackTraceHelper;
import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13118e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f13119i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f13120v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public HashMap f13121w;

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v(StackTraceHelper.ID_KEY).c(this.f13117d);
        y2Var.v("x").d(this.f13118e);
        y2Var.v("y").d(this.f13119i);
        y2Var.v("timeOffset").c(this.f13120v);
        HashMap map = this.f13121w;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f13121w.get(str);
                y2Var.v(str);
                y2Var.r(iLogger, obj);
            }
        }
        y2Var.l();
    }
}
