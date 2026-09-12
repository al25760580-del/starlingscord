package io.sentry.protocol;

import com.discord.notifications.renderer.NotificationRenderer;
import com.facebook.react.devsupport.StackTraceHelper;
import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements y1 {
    public ConcurrentHashMap E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12957e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f12958i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f12959v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f12960w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j f12961x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ConcurrentHashMap f12962y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0.class == obj.getClass()) {
            h0 h0Var = (h0) obj;
            if (com.facebook.imagepipeline.nativecode.c.r(this.f12956d, h0Var.f12956d) && com.facebook.imagepipeline.nativecode.c.r(this.f12957e, h0Var.f12957e) && com.facebook.imagepipeline.nativecode.c.r(this.f12958i, h0Var.f12958i) && com.facebook.imagepipeline.nativecode.c.r(this.f12959v, h0Var.f12959v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12956d, this.f12957e, this.f12958i, this.f12959v});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f12956d != null) {
            y2Var.v("email").f(this.f12956d);
        }
        if (this.f12957e != null) {
            y2Var.v(StackTraceHelper.ID_KEY).f(this.f12957e);
        }
        if (this.f12958i != null) {
            y2Var.v(NotificationRenderer.USERNAME).f(this.f12958i);
        }
        if (this.f12959v != null) {
            y2Var.v("ip_address").f(this.f12959v);
        }
        if (this.f12960w != null) {
            y2Var.v(StackTraceHelper.NAME_KEY).f(this.f12960w);
        }
        if (this.f12961x != null) {
            y2Var.v("geo");
            this.f12961x.serialize(y2Var, iLogger);
        }
        if (this.f12962y != null) {
            y2Var.v("data").r(iLogger, this.f12962y);
        }
        ConcurrentHashMap concurrentHashMap = this.E;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.E, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}
