package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements y1 {
    public Double E;
    public String F;
    public Double G;
    public List H;
    public HashMap I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12978e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f12979i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f12980v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Double f12981w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Double f12982x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Double f12983y;

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f12977d != null) {
            y2Var.v("rendering_system").f(this.f12977d);
        }
        if (this.f12978e != null) {
            y2Var.v("type").f(this.f12978e);
        }
        if (this.f12979i != null) {
            y2Var.v("identifier").f(this.f12979i);
        }
        if (this.f12980v != null) {
            y2Var.v("tag").f(this.f12980v);
        }
        if (this.f12981w != null) {
            y2Var.v("width").o(this.f12981w);
        }
        if (this.f12982x != null) {
            y2Var.v("height").o(this.f12982x);
        }
        if (this.f12983y != null) {
            y2Var.v("x").o(this.f12983y);
        }
        if (this.E != null) {
            y2Var.v("y").o(this.E);
        }
        if (this.F != null) {
            y2Var.v("visibility").f(this.F);
        }
        if (this.G != null) {
            y2Var.v("alpha").o(this.G);
        }
        List list = this.H;
        if (list != null && !list.isEmpty()) {
            y2Var.v("children").r(iLogger, this.H);
        }
        HashMap map = this.I;
        if (map != null) {
            for (String str : map.keySet()) {
                y2Var.v(str).r(iLogger, this.I.get(str));
            }
        }
        y2Var.l();
    }
}
