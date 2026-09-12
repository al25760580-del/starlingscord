package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements y1 {
    public Integer E;
    public Integer F;
    public Boolean G;
    public HashMap H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12996e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f12997i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Boolean f12998v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AbstractMap f12999w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ConcurrentHashMap f13000x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f13001y;

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f12995d != null) {
            y2Var.v("type").f(this.f12995d);
        }
        if (this.f12996e != null) {
            y2Var.v("description").f(this.f12996e);
        }
        if (this.f12997i != null) {
            y2Var.v("help_link").f(this.f12997i);
        }
        if (this.f12998v != null) {
            y2Var.v("handled").t(this.f12998v);
        }
        if (this.f12999w != null) {
            y2Var.v("meta").r(iLogger, this.f12999w);
        }
        if (this.f13000x != null) {
            y2Var.v("data").r(iLogger, this.f13000x);
        }
        if (this.f13001y != null) {
            y2Var.v("synthetic").t(this.f13001y);
        }
        if (this.E != null) {
            y2Var.v("exception_id").r(iLogger, this.E);
        }
        if (this.F != null) {
            y2Var.v("parent_id").r(iLogger, this.F);
        }
        if (this.G != null) {
            y2Var.v("is_exception_group").t(this.G);
        }
        HashMap map = this.H;
        if (map != null) {
            for (String str : map.keySet()) {
                y2Var.v(str).r(iLogger, this.H.get(str));
            }
        }
        y2Var.l();
    }
}
