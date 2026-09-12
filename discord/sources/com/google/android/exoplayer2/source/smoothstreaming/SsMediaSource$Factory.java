package com.google.android.exoplayer2.source.smoothstreaming;

import com.discord.jank_stats.JankRecordStore;
import com.google.android.exoplayer2.upstream.DataSource;
import i8.c;
import mc.g;
import o9.d;
import td.a;

/* JADX INFO: loaded from: classes3.dex */
public final class SsMediaSource$Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataSource.Factory f5720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f5722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f5723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5724e;

    public SsMediaSource$Factory(DataSource.Factory factory) {
        this(new a(factory), factory);
    }

    public SsMediaSource$Factory(a aVar, DataSource.Factory factory) {
        this.f5720a = factory;
        this.f5722c = new g();
        this.f5723d = new d(-1, 3);
        this.f5724e = JankRecordStore.FLUSH_INTERVAL_MS;
        this.f5721b = new c(12);
    }
}
