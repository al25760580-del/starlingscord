package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c1 f5990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c1 f5991c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f5992a;

    static {
        if (v4.f6162v) {
            f5991c = null;
            f5990b = null;
        } else {
            f5991c = new c1(null);
            f5990b = new c1(null);
        }
    }

    public c1(CancellationException cancellationException) {
        this.f5992a = cancellationException;
    }
}
