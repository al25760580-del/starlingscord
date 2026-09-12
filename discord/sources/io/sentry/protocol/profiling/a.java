package io.sentry.protocol.profiling;

import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f13020d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f13021e = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f13022i = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Map f13023v = new HashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ConcurrentHashMap f13024w;

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("samples").r(iLogger, this.f13020d);
        y2Var.v("stacks").r(iLogger, this.f13021e);
        y2Var.v("frames").r(iLogger, this.f13022i);
        y2Var.v("thread_metadata").r(iLogger, this.f13023v);
        ConcurrentHashMap concurrentHashMap = this.f13024w;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                y2Var.v(str).r(iLogger, this.f13024w.get(str));
            }
        }
        y2Var.l();
    }
}
