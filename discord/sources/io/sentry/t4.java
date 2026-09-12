package io.sentry;

import j$.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public final class t4 extends j4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Instant f13156d = Instant.now();

    @Override // io.sentry.j4
    public final long d() {
        Instant instant = this.f13156d;
        return (instant.getEpochSecond() * 1000000000) + ((long) instant.getNano());
    }
}
