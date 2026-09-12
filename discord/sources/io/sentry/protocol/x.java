package io.sentry.protocol;

import com.facebook.react.devsupport.StackTraceHelper;
import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13061e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f13062i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ConcurrentHashMap f13063v;

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f13060d != null) {
            y2Var.v(StackTraceHelper.NAME_KEY).f(this.f13060d);
        }
        if (this.f13061e != null) {
            y2Var.v("version").f(this.f13061e);
        }
        if (this.f13062i != null) {
            y2Var.v("raw_description").f(this.f13062i);
        }
        ConcurrentHashMap concurrentHashMap = this.f13063v;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.f13063v, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}
