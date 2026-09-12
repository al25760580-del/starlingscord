package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j0 f6023d = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f6024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f6025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f6026c;

    public j0() {
        this.f6024a = null;
        this.f6025b = null;
    }

    public j0(Runnable runnable, Executor executor) {
        this.f6024a = runnable;
        this.f6025b = executor;
    }
}
