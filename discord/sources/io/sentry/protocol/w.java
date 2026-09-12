package io.sentry.protocol;

import com.facebook.react.devsupport.StackTraceHelper;
import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13058e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f13059i;

    public w(String str, String str2) {
        com.facebook.imagepipeline.nativecode.c.H(str, "name is required.");
        this.f13057d = str;
        com.facebook.imagepipeline.nativecode.c.H(str2, "version is required.");
        this.f13058e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (Objects.equals(this.f13057d, wVar.f13057d) && Objects.equals(this.f13058e, wVar.f13058e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13057d, this.f13058e);
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v(StackTraceHelper.NAME_KEY).f(this.f13057d);
        y2Var.v("version").f(this.f13058e);
        HashMap map = this.f13059i;
        if (map != null) {
            for (String str : map.keySet()) {
                y2Var.v(str).r(iLogger, this.f13059i.get(str));
            }
        }
        y2Var.l();
    }
}
