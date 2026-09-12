package io.sentry.protocol;

import com.facebook.react.devsupport.StackTraceHelper;
import io.sentry.ILogger;
import io.sentry.v4;
import io.sentry.y1;
import io.sentry.y2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13044e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CopyOnWriteArraySet f13045i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CopyOnWriteArraySet f13046v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public HashMap f13047w;

    public t(String str, String str2) {
        this.f13043d = str;
        this.f13044e = str2;
    }

    public final String a() {
        return this.f13043d;
    }

    public final String b() {
        return this.f13044e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f13043d.equals(tVar.f13043d) && this.f13044e.equals(tVar.f13044e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13043d, this.f13044e});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v(StackTraceHelper.NAME_KEY).f(this.f13043d);
        y2Var.v("version").f(this.f13044e);
        CopyOnWriteArraySet copyOnWriteArraySet = this.f13045i;
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = v4.d().f13251b;
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.f13046v;
        if (copyOnWriteArraySet2 == null) {
            copyOnWriteArraySet2 = v4.d().f13250a;
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            y2Var.v("packages").r(iLogger, copyOnWriteArraySet);
        }
        if (!copyOnWriteArraySet2.isEmpty()) {
            y2Var.v("integrations").r(iLogger, copyOnWriteArraySet2);
        }
        HashMap map = this.f13047w;
        if (map != null) {
            for (String str : map.keySet()) {
                y2Var.v(str).r(iLogger, this.f13047w.get(str));
            }
        }
        y2Var.l();
    }
}
