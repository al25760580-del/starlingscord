package io.sentry;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class t6 implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.sentry.protocol.v f13161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13162e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f13163i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f13164v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public HashMap f13165w;

    public t6(io.sentry.protocol.v vVar, String str, String str2, String str3) {
        this.f13161d = vVar;
        this.f13162e = str;
        this.f13163i = str2;
        this.f13164v = str3;
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("event_id");
        this.f13161d.serialize(y2Var, iLogger);
        String str = this.f13162e;
        if (str != null) {
            y2Var.v(StackTraceHelper.NAME_KEY).f(str);
        }
        String str2 = this.f13163i;
        if (str2 != null) {
            y2Var.v("email").f(str2);
        }
        String str3 = this.f13164v;
        if (str3 != null) {
            y2Var.v("comments").f(str3);
        }
        HashMap map = this.f13165w;
        if (map != null) {
            for (String str4 : map.keySet()) {
                y2Var.v(str4).r(iLogger, this.f13165w.get(str4));
            }
        }
        y2Var.l();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserFeedback{eventId=");
        sb2.append(this.f13161d);
        sb2.append(", name='");
        sb2.append(this.f13162e);
        sb2.append("', email='");
        sb2.append(this.f13163i);
        sb2.append("', comments='");
        return com.discord.chat.presentation.list.a.k(sb2, this.f13164v, "'}");
    }
}
