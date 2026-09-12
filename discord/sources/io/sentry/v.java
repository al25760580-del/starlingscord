package io.sentry;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f13239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ILogger f13240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n6 f13242d;

    public v(x0 x0Var, ILogger iLogger, long j, int i7) {
        this.f13239a = x0Var;
        this.f13240b = iLogger;
        this.f13241c = j;
        this.f13242d = new n6(new f(i7));
    }

    public abstract boolean a(String str);

    public abstract void b(File file, Hint hint);
}
