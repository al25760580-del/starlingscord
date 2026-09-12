package io.sentry.rrweb;

import com.facebook.react.devsupport.StackTraceHelper;
import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends e implements y1 {
    public int E;
    public int F;
    public HashMap G;
    public HashMap H;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f f13113v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13114w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f13115x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f13116y;

    public g() {
        super(d.MouseInteraction);
        this.E = 2;
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("type").r(iLogger, this.f13110d);
        y2Var.v("timestamp").c(this.f13111e);
        y2Var.v("data");
        y2Var.q();
        y2Var.v("source").r(iLogger, this.f13112i);
        y2Var.v("type").r(iLogger, this.f13113v);
        y2Var.v(StackTraceHelper.ID_KEY).c(this.f13114w);
        y2Var.v("x").d(this.f13115x);
        y2Var.v("y").d(this.f13116y);
        y2Var.v("pointerType").c(this.E);
        y2Var.v("pointerId").c(this.F);
        HashMap map = this.H;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.H.get(str);
                y2Var.v(str);
                y2Var.r(iLogger, obj);
            }
        }
        y2Var.l();
        HashMap map2 = this.G;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                Object obj2 = this.G.get(str2);
                y2Var.v(str2);
                y2Var.r(iLogger, obj2);
            }
        }
        y2Var.l();
    }
}
