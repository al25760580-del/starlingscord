package com.google.android.exoplayer2;

import gc.g;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public class PlaybackException extends Exception implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5572e;

    static {
        int i7 = e0.f13788a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public PlaybackException(String str, Throwable th2, int i7, long j) {
        super(str, th2);
        this.f5571d = i7;
        this.f5572e = j;
    }
}
