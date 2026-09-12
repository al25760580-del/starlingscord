package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Timeline;
import java.util.Arrays;
import ls.d;
import md.s;

/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsListener$EventTime {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Timeline f5593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f5595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Timeline f5597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f5599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f5600i;
    public final long j;

    public AnalyticsListener$EventTime(long j, Timeline timeline, int i7, s sVar, long j5, Timeline timeline2, int i10, s sVar2, long j7, long j10) {
        this.f5592a = j;
        this.f5593b = timeline;
        this.f5594c = i7;
        this.f5595d = sVar;
        this.f5596e = j5;
        this.f5597f = timeline2;
        this.f5598g = i10;
        this.f5599h = sVar2;
        this.f5600i = j7;
        this.j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AnalyticsListener$EventTime.class == obj.getClass()) {
            AnalyticsListener$EventTime analyticsListener$EventTime = (AnalyticsListener$EventTime) obj;
            if (this.f5592a == analyticsListener$EventTime.f5592a && this.f5594c == analyticsListener$EventTime.f5594c && this.f5596e == analyticsListener$EventTime.f5596e && this.f5598g == analyticsListener$EventTime.f5598g && this.f5600i == analyticsListener$EventTime.f5600i && this.j == analyticsListener$EventTime.j && d.n(this.f5593b, analyticsListener$EventTime.f5593b) && d.n(this.f5595d, analyticsListener$EventTime.f5595d) && d.n(this.f5597f, analyticsListener$EventTime.f5597f) && d.n(this.f5599h, analyticsListener$EventTime.f5599h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5592a), this.f5593b, Integer.valueOf(this.f5594c), this.f5595d, Long.valueOf(this.f5596e), this.f5597f, Integer.valueOf(this.f5598g), this.f5599h, Long.valueOf(this.f5600i), Long.valueOf(this.j)});
    }
}
