package io.sentry.protocol;

import com.facebook.react.devsupport.StackTraceHelper;
import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements y1 {
    public Boolean E;
    public a0 F;
    public Map G;
    public ConcurrentHashMap H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f12925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f12926e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f12927i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f12928v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f12929w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f12930x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f12931y;

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f12925d != null) {
            y2Var.v(StackTraceHelper.ID_KEY).o(this.f12925d);
        }
        if (this.f12926e != null) {
            y2Var.v("priority").o(this.f12926e);
        }
        if (this.f12927i != null) {
            y2Var.v(StackTraceHelper.NAME_KEY).f(this.f12927i);
        }
        if (this.f12928v != null) {
            y2Var.v("state").f(this.f12928v);
        }
        if (this.f12929w != null) {
            y2Var.v("crashed").t(this.f12929w);
        }
        if (this.f12930x != null) {
            y2Var.v("current").t(this.f12930x);
        }
        if (this.f12931y != null) {
            y2Var.v("daemon").t(this.f12931y);
        }
        if (this.E != null) {
            y2Var.v("main").t(this.E);
        }
        if (this.F != null) {
            y2Var.v("stacktrace").r(iLogger, this.F);
        }
        if (this.G != null) {
            y2Var.v("held_locks").r(iLogger, this.G);
        }
        ConcurrentHashMap concurrentHashMap = this.H;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.H, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}
