package io.sentry.protocol;

import com.facebook.react.devsupport.StackTraceHelper;
import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.AbstractMap;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12964e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f12965i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v f12966v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v f12967w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f12968x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AbstractMap f12969y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return com.facebook.imagepipeline.nativecode.c.r(this.f12963d, iVar.f12963d) && com.facebook.imagepipeline.nativecode.c.r(this.f12964e, iVar.f12964e) && com.facebook.imagepipeline.nativecode.c.r(this.f12965i, iVar.f12965i) && com.facebook.imagepipeline.nativecode.c.r(this.f12966v, iVar.f12966v) && com.facebook.imagepipeline.nativecode.c.r(this.f12967w, iVar.f12967w) && com.facebook.imagepipeline.nativecode.c.r(this.f12968x, iVar.f12968x) && com.facebook.imagepipeline.nativecode.c.r(this.f12969y, iVar.f12969y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12963d, this.f12964e, this.f12965i, this.f12966v, this.f12967w, this.f12968x, this.f12969y});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("message").f(this.f12963d);
        if (this.f12964e != null) {
            y2Var.v("contact_email").f(this.f12964e);
        }
        if (this.f12965i != null) {
            y2Var.v(StackTraceHelper.NAME_KEY).f(this.f12965i);
        }
        if (this.f12966v != null) {
            y2Var.v("associated_event_id");
            this.f12966v.serialize(y2Var, iLogger);
        }
        if (this.f12967w != null) {
            y2Var.v("replay_id");
            this.f12967w.serialize(y2Var, iLogger);
        }
        if (this.f12968x != null) {
            y2Var.v("url").f(this.f12968x);
        }
        AbstractMap abstractMap = this.f12969y;
        if (abstractMap != null) {
            for (String str : abstractMap.keySet()) {
                y2Var.v(str).r(iLogger, this.f12969y.get(str));
            }
        }
        y2Var.l();
    }

    public final String toString() {
        return "Feedback{message='" + this.f12963d + "', contactEmail='" + this.f12964e + "', name='" + this.f12965i + "', associatedEventId=" + this.f12966v + ", replayId=" + this.f12967w + ", url='" + this.f12968x + "', unknown=" + this.f12969y + '}';
    }
}
