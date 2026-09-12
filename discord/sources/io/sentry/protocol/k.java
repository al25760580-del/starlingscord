package io.sentry.protocol;

import com.facebook.react.devsupport.StackTraceHelper;
import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements y1 {
    public String E;
    public String F;
    public ConcurrentHashMap G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f12985e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f12986i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f12987v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f12988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f12989x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f12990y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (com.facebook.imagepipeline.nativecode.c.r(this.f12984d, kVar.f12984d) && com.facebook.imagepipeline.nativecode.c.r(this.f12985e, kVar.f12985e) && com.facebook.imagepipeline.nativecode.c.r(this.f12986i, kVar.f12986i) && com.facebook.imagepipeline.nativecode.c.r(this.f12987v, kVar.f12987v) && com.facebook.imagepipeline.nativecode.c.r(this.f12988w, kVar.f12988w) && com.facebook.imagepipeline.nativecode.c.r(this.f12989x, kVar.f12989x) && com.facebook.imagepipeline.nativecode.c.r(this.f12990y, kVar.f12990y) && com.facebook.imagepipeline.nativecode.c.r(this.E, kVar.E) && com.facebook.imagepipeline.nativecode.c.r(this.F, kVar.F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12984d, this.f12985e, this.f12986i, this.f12987v, this.f12988w, this.f12989x, this.f12990y, this.E, this.F});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f12984d != null) {
            y2Var.v(StackTraceHelper.NAME_KEY).f(this.f12984d);
        }
        if (this.f12985e != null) {
            y2Var.v(StackTraceHelper.ID_KEY).o(this.f12985e);
        }
        if (this.f12986i != null) {
            y2Var.v("vendor_id").f(this.f12986i);
        }
        if (this.f12987v != null) {
            y2Var.v("vendor_name").f(this.f12987v);
        }
        if (this.f12988w != null) {
            y2Var.v("memory_size").o(this.f12988w);
        }
        if (this.f12989x != null) {
            y2Var.v("api_type").f(this.f12989x);
        }
        if (this.f12990y != null) {
            y2Var.v("multi_threaded_rendering").t(this.f12990y);
        }
        if (this.E != null) {
            y2Var.v("version").f(this.E);
        }
        if (this.F != null) {
            y2Var.v("npot_support").f(this.F);
        }
        ConcurrentHashMap concurrentHashMap = this.G;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.G, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}
