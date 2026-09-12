package io.sentry.rrweb;

import com.facebook.react.uimanager.ViewProps;
import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends b implements y1 {
    public String E;
    public int F;
    public int G;
    public int H;
    public String I;
    public int J;
    public int K;
    public int L;
    public HashMap M;
    public ConcurrentHashMap N;
    public ConcurrentHashMap O;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f13137i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13138v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f13139w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f13140x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f13141y;

    public m() {
        super(c.Custom);
        this.f13141y = "h264";
        this.E = "mp4";
        this.I = "constant";
        this.f13137i = MediaStreamTrack.VIDEO_TRACK_KIND;
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f13138v == mVar.f13138v && this.f13139w == mVar.f13139w && this.f13140x == mVar.f13140x && this.F == mVar.F && this.G == mVar.G && this.H == mVar.H && this.J == mVar.J && this.K == mVar.K && this.L == mVar.L && com.facebook.imagepipeline.nativecode.c.r(this.f13137i, mVar.f13137i) && com.facebook.imagepipeline.nativecode.c.r(this.f13141y, mVar.f13141y) && com.facebook.imagepipeline.nativecode.c.r(this.E, mVar.E) && com.facebook.imagepipeline.nativecode.c.r(this.I, mVar.I);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f13137i, Integer.valueOf(this.f13138v), Long.valueOf(this.f13139w), Long.valueOf(this.f13140x), this.f13141y, this.E, Integer.valueOf(this.F), Integer.valueOf(this.G), Integer.valueOf(this.H), this.I, Integer.valueOf(this.J), Integer.valueOf(this.K), Integer.valueOf(this.L)});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("type").r(iLogger, this.f13110d);
        y2Var.v("timestamp").c(this.f13111e);
        y2Var.v("data");
        y2Var.q();
        y2Var.v("tag").f(this.f13137i);
        y2Var.v("payload");
        y2Var.q();
        y2Var.v("segmentId").c(this.f13138v);
        y2Var.v("size").c(this.f13139w);
        y2Var.v("duration").c(this.f13140x);
        y2Var.v("encoding").f(this.f13141y);
        y2Var.v("container").f(this.E);
        y2Var.v("height").c(this.F);
        y2Var.v("width").c(this.G);
        y2Var.v("frameCount").c(this.H);
        y2Var.v("frameRate").c(this.J);
        y2Var.v("frameRateType").f(this.I);
        y2Var.v(ViewProps.LEFT).c(this.K);
        y2Var.v(ViewProps.TOP).c(this.L);
        ConcurrentHashMap concurrentHashMap = this.N;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.N, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
        ConcurrentHashMap concurrentHashMap2 = this.O;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                com.discord.chat.presentation.list.a.s(this.O, str2, y2Var, str2, iLogger);
            }
        }
        y2Var.l();
        HashMap map = this.M;
        if (map != null) {
            for (String str3 : map.keySet()) {
                Object obj = this.M.get(str3);
                y2Var.v(str3);
                y2Var.r(iLogger, obj);
            }
        }
        y2Var.l();
    }
}
