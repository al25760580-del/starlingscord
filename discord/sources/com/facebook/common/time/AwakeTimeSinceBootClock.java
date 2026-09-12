package com.facebook.common.time;

import n8.c;
import u8.b;

/* JADX INFO: loaded from: classes3.dex */
@c
public class AwakeTimeSinceBootClock implements b {

    @c
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @c
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // u8.b, u8.a
    @c
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // u8.b, u8.a
    @c
    public long nowNanos() {
        return System.nanoTime();
    }
}
