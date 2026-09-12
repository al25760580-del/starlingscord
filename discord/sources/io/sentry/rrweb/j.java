package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends b implements y1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f13126i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13127v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13128w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public HashMap f13129x;

    public j() {
        super(c.Meta);
        this.f13126i = "";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f13127v == jVar.f13127v && this.f13128w == jVar.f13128w && com.facebook.imagepipeline.nativecode.c.r(this.f13126i, jVar.f13126i);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f13126i, Integer.valueOf(this.f13127v), Integer.valueOf(this.f13128w)});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("type").r(iLogger, this.f13110d);
        y2Var.v("timestamp").c(this.f13111e);
        y2Var.v("data");
        y2Var.q();
        y2Var.v("href").f(this.f13126i);
        y2Var.v("height").c(this.f13127v);
        y2Var.v("width").c(this.f13128w);
        HashMap map = this.f13129x;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f13129x.get(str);
                y2Var.v(str);
                y2Var.r(iLogger, obj);
            }
        }
        y2Var.l();
        y2Var.l();
    }
}
