package io.sentry.protocol;

import com.facebook.react.devsupport.StackTraceHelper;
import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13007e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f13008i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f13009v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f13010w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f13011x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ConcurrentHashMap f13012y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (com.facebook.imagepipeline.nativecode.c.r(this.f13006d, oVar.f13006d) && com.facebook.imagepipeline.nativecode.c.r(this.f13007e, oVar.f13007e) && com.facebook.imagepipeline.nativecode.c.r(this.f13008i, oVar.f13008i) && com.facebook.imagepipeline.nativecode.c.r(this.f13009v, oVar.f13009v) && com.facebook.imagepipeline.nativecode.c.r(this.f13010w, oVar.f13010w) && com.facebook.imagepipeline.nativecode.c.r(this.f13011x, oVar.f13011x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13006d, this.f13007e, this.f13008i, this.f13009v, this.f13010w, this.f13011x});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f13006d != null) {
            y2Var.v(StackTraceHelper.NAME_KEY).f(this.f13006d);
        }
        if (this.f13007e != null) {
            y2Var.v("version").f(this.f13007e);
        }
        if (this.f13008i != null) {
            y2Var.v("raw_description").f(this.f13008i);
        }
        if (this.f13009v != null) {
            y2Var.v("build").f(this.f13009v);
        }
        if (this.f13010w != null) {
            y2Var.v("kernel_version").f(this.f13010w);
        }
        if (this.f13011x != null) {
            y2Var.v("rooted").t(this.f13011x);
        }
        ConcurrentHashMap concurrentHashMap = this.f13012y;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.f13012y, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}
