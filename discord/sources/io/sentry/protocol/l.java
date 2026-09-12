package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12991d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12992e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f12993i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AbstractMap f12994v;

    public /* synthetic */ l() {
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        switch (this.f12991d) {
            case 0:
                y2Var.q();
                y2Var.v("value").o((Number) this.f12993i);
                String str = this.f12992e;
                if (str != null) {
                    y2Var.v("unit").f(str);
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f12994v;
                if (concurrentHashMap != null) {
                    for (String str2 : concurrentHashMap.keySet()) {
                        com.discord.chat.presentation.list.a.s((ConcurrentHashMap) this.f12994v, str2, y2Var, str2, iLogger);
                    }
                }
                y2Var.l();
                break;
            default:
                y2Var.q();
                y2Var.v("type").r(iLogger, this.f12992e);
                y2Var.v("value").r(iLogger, this.f12993i);
                HashMap map = (HashMap) this.f12994v;
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        y2Var.v(str3).r(iLogger, ((HashMap) this.f12994v).get(str3));
                    }
                }
                y2Var.l();
                break;
        }
    }

    public l(Number number, String str) {
        this.f12993i = number;
        this.f12992e = str;
    }
}
