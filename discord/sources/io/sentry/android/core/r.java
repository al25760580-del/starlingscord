package io.sentry.android.core;

import android.os.SystemClock;
import com.google.android.exoplayer2.PlaybackParameters;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements je.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12392e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f12393i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f12394v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f12395w;

    public r(je.y yVar) {
        this.f12394v = yVar;
        this.f12395w = PlaybackParameters.f5573v;
    }

    @Override // je.n
    public long a() {
        long j = this.f12392e;
        if (!this.f12391d) {
            return j;
        }
        ((je.y) this.f12394v).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f12393i;
        PlaybackParameters playbackParameters = (PlaybackParameters) this.f12395w;
        return (playbackParameters.f5574d == 1.0f ? je.e0.I(jElapsedRealtime) : jElapsedRealtime * ((long) playbackParameters.f5576i)) + j;
    }

    @Override // je.n
    public PlaybackParameters b() {
        return (PlaybackParameters) this.f12395w;
    }

    public void c(long j) {
        this.f12392e = j;
        if (this.f12391d) {
            ((je.y) this.f12394v).getClass();
            this.f12393i = SystemClock.elapsedRealtime();
        }
    }

    @Override // je.n
    public void d(PlaybackParameters playbackParameters) {
        if (this.f12391d) {
            c(a());
        }
        this.f12395w = playbackParameters;
    }

    public void e() {
        if (this.f12391d) {
            return;
        }
        ((je.y) this.f12394v).getClass();
        this.f12393i = SystemClock.elapsedRealtime();
        this.f12391d = true;
    }

    public r(long j, long j5, boolean z5, File file, HashMap map) {
        this.f12392e = j;
        this.f12394v = file;
        this.f12393i = j5;
        this.f12395w = map;
        this.f12391d = z5;
    }
}
