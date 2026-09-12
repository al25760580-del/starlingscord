package io.sentry;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l3 implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f12793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f12794e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f12795i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l3.class == obj.getClass()) {
            l3 l3Var = (l3) obj;
            if (com.facebook.imagepipeline.nativecode.c.r(this.f12793d, l3Var.f12793d) && com.facebook.imagepipeline.nativecode.c.r(this.f12794e, l3Var.f12794e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12793d, this.f12794e});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f12793d != null) {
            y2Var.v("segment_id").o(this.f12793d);
        }
        HashMap map = this.f12795i;
        if (map != null) {
            for (String str : map.keySet()) {
                y2Var.v(str).r(iLogger, this.f12795i.get(str));
            }
        }
        y2Var.l();
        y2Var.g(true);
        if (this.f12793d != null) {
            y2Var.p();
        }
        List list = this.f12794e;
        if (list != null) {
            y2Var.r(iLogger, list);
        }
        y2Var.g(false);
    }
}
