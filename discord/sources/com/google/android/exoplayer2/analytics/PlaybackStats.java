package com.google.android.exoplayer2.analytics;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class PlaybackStats {
    public static final PlaybackStats O = a(new PlaybackStats[0]);
    public final int A;
    public final long B;
    public final int C;
    public final long D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final int I;
    public final int J;
    public final int K;
    public final List L;
    public final List M;
    public final long[] N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f5605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f5611i;
    public final int j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f5612l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f5613m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f5614n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f5615o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f5616p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f5617q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f5618r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f5619s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f5620t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f5621u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f5622v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f5623w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f5624x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f5625y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f5626z;

    public PlaybackStats(int i7, long[] jArr, List list, List list2, long j, int i10, int i11, int i12, int i13, long j5, int i14, int i15, int i16, int i17, int i18, long j7, int i19, List list3, List list4, long j10, long j11, long j12, long j13, long j14, long j15, int i20, int i21, int i22, long j16, int i23, long j17, long j18, long j19, long j20, long j21, int i24, int i25, int i26, List list5, List list6) {
        this.f5603a = i7;
        this.N = jArr;
        this.f5604b = Collections.unmodifiableList(list);
        this.f5605c = Collections.unmodifiableList(list2);
        this.f5606d = j;
        this.f5607e = i10;
        this.f5608f = i11;
        this.f5609g = i12;
        this.f5610h = i13;
        this.f5611i = j5;
        this.j = i14;
        this.k = i15;
        this.f5612l = i16;
        this.f5613m = i17;
        this.f5614n = i18;
        this.f5615o = j7;
        this.f5616p = i19;
        this.f5617q = Collections.unmodifiableList(list3);
        this.f5618r = Collections.unmodifiableList(list4);
        this.f5619s = j10;
        this.f5620t = j11;
        this.f5621u = j12;
        this.f5622v = j13;
        this.f5623w = j14;
        this.f5624x = j15;
        this.f5625y = i20;
        this.f5626z = i21;
        this.A = i22;
        this.B = j16;
        this.C = i23;
        this.D = j17;
        this.E = j18;
        this.F = j19;
        this.G = j20;
        this.H = j21;
        this.I = i24;
        this.J = i25;
        this.K = i26;
        this.L = Collections.unmodifiableList(list5);
        this.M = Collections.unmodifiableList(list6);
    }

    public static PlaybackStats a(PlaybackStats... playbackStatsArr) {
        PlaybackStats[] playbackStatsArr2 = playbackStatsArr;
        long[] jArr = new long[16];
        int length = playbackStatsArr2.length;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        long j = 0;
        long j5 = 0;
        long j7 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = -1;
        long j18 = -1;
        long jMax = -9223372036854775807L;
        long jMin = -9223372036854775807L;
        long j19 = -9223372036854775807L;
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (i24 < length) {
            PlaybackStats playbackStats = playbackStatsArr2[i24];
            int i28 = playbackStats.f5603a;
            long j20 = playbackStats.D;
            long j21 = playbackStats.B;
            int i29 = playbackStats.A;
            int i30 = length;
            long j22 = playbackStats.f5615o;
            int i31 = i7;
            long[] jArr2 = jArr;
            long j23 = playbackStats.f5611i;
            long j24 = playbackStats.f5606d;
            int i32 = i31 + i28;
            int i33 = i24;
            int i34 = i25;
            for (int i35 = 0; i35 < 16; i35++) {
                jArr2[i35] = jArr2[i35] + playbackStats.N[i35];
            }
            if (jMin == -9223372036854775807L) {
                jMin = j24;
            } else if (j24 != -9223372036854775807L) {
                jMin = Math.min(jMin, j24);
            }
            i25 = i34 + playbackStats.f5607e;
            i26 += playbackStats.f5608f;
            i27 += playbackStats.f5609g;
            i10 += playbackStats.f5610h;
            if (j19 == -9223372036854775807L) {
                j19 = j23;
            } else if (j23 != -9223372036854775807L) {
                j19 += j23;
            }
            i11 += playbackStats.j;
            i12 += playbackStats.k;
            i13 += playbackStats.f5612l;
            i14 += playbackStats.f5613m;
            i15 += playbackStats.f5614n;
            if (jMax == -9223372036854775807L) {
                jMax = j22;
            } else if (j22 != -9223372036854775807L) {
                jMax = Math.max(jMax, j22);
            }
            i16 += playbackStats.f5616p;
            j += playbackStats.f5619s;
            j5 += playbackStats.f5620t;
            j7 += playbackStats.f5621u;
            j10 += playbackStats.f5622v;
            j11 += playbackStats.f5623w;
            j12 += playbackStats.f5624x;
            i17 += playbackStats.f5625y;
            i18 += playbackStats.f5626z;
            int i36 = i23;
            i23 = i36 == -1 ? i29 : i29 != -1 ? i36 + i29 : i36;
            if (j17 == -1) {
                j17 = j21;
            } else if (j21 != -1) {
                j17 += j21;
            }
            i19 += playbackStats.C;
            if (j18 == -1) {
                j18 = j20;
            } else if (j20 != -1) {
                j18 += j20;
            }
            j13 += playbackStats.E;
            j14 += playbackStats.F;
            j15 += playbackStats.G;
            j16 += playbackStats.H;
            i20 += playbackStats.I;
            i21 += playbackStats.J;
            i22 += playbackStats.K;
            i24 = i33 + 1;
            playbackStatsArr2 = playbackStatsArr;
            i7 = i32;
            length = i30;
            jArr = jArr2;
        }
        long j25 = jMin;
        int i37 = i10;
        long j26 = j19;
        int i38 = i11;
        int i39 = i12;
        int i40 = i13;
        int i41 = i14;
        int i42 = i15;
        long j27 = jMax;
        List list = Collections.EMPTY_LIST;
        return new PlaybackStats(i7, jArr, list, list, j25, i25, i26, i27, i37, j26, i38, i39, i40, i41, i42, j27, i16, list, list, j, j5, j7, j10, j11, j12, i17, i18, i23, j17, i19, j18, j13, j14, j15, j16, i20, i21, i22, list, list);
    }
}
