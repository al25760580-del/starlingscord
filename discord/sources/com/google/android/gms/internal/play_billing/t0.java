package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t0 f6134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ t0[] f6135e;

    static {
        t0 t0Var = new t0("INSTANCE", 0);
        f6134d = t0Var;
        f6135e = new t0[]{t0Var};
    }

    public static t0[] values() {
        return (t0[]) f6135e.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
