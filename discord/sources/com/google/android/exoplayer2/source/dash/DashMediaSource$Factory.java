package com.google.android.exoplayer2.source.dash;

import com.discord.jank_stats.JankRecordStore;
import com.google.android.exoplayer2.upstream.DataSource;
import i8.c;
import mc.g;
import o9.d;
import pd.i;

/* JADX INFO: loaded from: classes3.dex */
public final class DashMediaSource$Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataSource.Factory f5705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f5706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f5707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f5708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5710f;

    public DashMediaSource$Factory(DataSource.Factory factory) {
        this(new i(factory), factory);
    }

    public DashMediaSource$Factory(i iVar, DataSource.Factory factory) {
        this.f5705a = factory;
        this.f5706b = new g();
        this.f5708d = new d(-1, 3);
        this.f5709e = JankRecordStore.FLUSH_INTERVAL_MS;
        this.f5710f = 5000000L;
        this.f5707c = new c(12);
    }
}
