package com.facebook.common.time;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import n8.c;
import u8.a;

/* JADX INFO: loaded from: classes3.dex */
@c
public class RealtimeSinceBootClock implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RealtimeSinceBootClock f4628a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @c
    public static RealtimeSinceBootClock get() {
        return f4628a;
    }

    @Override // u8.a
    public final long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // u8.a
    public final long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
    }
}
