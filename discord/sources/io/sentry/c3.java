package io.sentry;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.v f12507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.protocol.v f12508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f12509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f12510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f12511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12512f = "android";

    public c3(io.sentry.protocol.v vVar, io.sentry.protocol.v vVar2, Map map, File file, j4 j4Var) {
        this.f12507a = vVar;
        this.f12508b = vVar2;
        this.f12509c = new ConcurrentHashMap(map);
        this.f12510d = file;
        this.f12511e = j4Var.d() / 1.0E9d;
    }
}
