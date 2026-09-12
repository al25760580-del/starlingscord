package com.facebook.imagepipeline.cache;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class MemoryCacheParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4805f;

    public MemoryCacheParams(int i7, int i10, int i11, long j, int i12) {
        this.f4800a = i7;
        this.f4801b = i10;
        this.f4802c = i11;
        this.f4803d = Integer.MAX_VALUE;
        this.f4804e = i12;
        this.f4805f = j;
    }

    public /* synthetic */ MemoryCacheParams(int i7, int i10, int i11, int i12) {
        this(i7, i10, i11, TimeUnit.MINUTES.toMillis(5L), i12);
    }
}
