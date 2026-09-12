package io.sentry;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y5 extends f4 implements y1 {
    public File M;
    public int Q;
    public Date S;
    public HashMap W;
    public io.sentry.protocol.v P = new io.sentry.protocol.v();
    public String N = "replay_event";
    public x5 O = x5.SESSION;
    public List U = new ArrayList();
    public List V = new ArrayList();
    public List T = new ArrayList();
    public Date R = io.sentry.config.a.y();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y5.class == obj.getClass()) {
            y5 y5Var = (y5) obj;
            if (this.Q == y5Var.Q && com.facebook.imagepipeline.nativecode.c.r(this.N, y5Var.N) && this.O == y5Var.O && com.facebook.imagepipeline.nativecode.c.r(this.P, y5Var.P) && com.facebook.imagepipeline.nativecode.c.r(this.T, y5Var.T) && com.facebook.imagepipeline.nativecode.c.r(this.U, y5Var.U) && com.facebook.imagepipeline.nativecode.c.r(this.V, y5Var.V)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.N, this.O, this.P, Integer.valueOf(this.Q), this.T, this.U, this.V});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("type").f(this.N);
        y2Var.v("replay_type").r(iLogger, this.O);
        y2Var.v("segment_id").c(this.Q);
        y2Var.v("timestamp").r(iLogger, this.R);
        if (this.P != null) {
            y2Var.v("replay_id").r(iLogger, this.P);
        }
        if (this.S != null) {
            y2Var.v("replay_start_timestamp").r(iLogger, this.S);
        }
        if (this.T != null) {
            y2Var.v("urls").r(iLogger, this.T);
        }
        if (this.U != null) {
            y2Var.v("error_ids").r(iLogger, this.U);
        }
        if (this.V != null) {
            y2Var.v("trace_ids").r(iLogger, this.V);
        }
        ls.d.D(this, y2Var, iLogger);
        HashMap map = this.W;
        if (map != null) {
            for (String str : map.keySet()) {
                y2Var.v(str).r(iLogger, this.W.get(str));
            }
        }
        y2Var.l();
    }
}
