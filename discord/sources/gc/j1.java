package gc;

import android.os.SystemClock;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Timeline;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final md.s f9713t = new md.s(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Timeline f9714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final md.s f9715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.exoplayer2.b f9719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final md.y0 f9721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fe.u f9722i;
    public final List j;
    public final md.s k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f9723l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9724m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PlaybackParameters f9725n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f9726o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile long f9727p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f9728q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f9729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f9730s;

    public j1(Timeline timeline, md.s sVar, long j, long j5, int i7, com.google.android.exoplayer2.b bVar, boolean z5, md.y0 y0Var, fe.u uVar, List list, md.s sVar2, boolean z6, int i10, PlaybackParameters playbackParameters, long j7, long j10, long j11, long j12, boolean z7) {
        this.f9714a = timeline;
        this.f9715b = sVar;
        this.f9716c = j;
        this.f9717d = j5;
        this.f9718e = i7;
        this.f9719f = bVar;
        this.f9720g = z5;
        this.f9721h = y0Var;
        this.f9722i = uVar;
        this.j = list;
        this.k = sVar2;
        this.f9723l = z6;
        this.f9724m = i10;
        this.f9725n = playbackParameters;
        this.f9727p = j7;
        this.f9728q = j10;
        this.f9729r = j11;
        this.f9730s = j12;
        this.f9726o = z7;
    }

    public static j1 i(fe.u uVar) {
        t1 t1Var = Timeline.f5588d;
        md.y0 y0Var = md.y0.f15735v;
        ei.r0 r0Var = ei.r0.f8352w;
        PlaybackParameters playbackParameters = PlaybackParameters.f5573v;
        md.s sVar = f9713t;
        return new j1(t1Var, sVar, -9223372036854775807L, 0L, 1, null, false, y0Var, uVar, r0Var, sVar, false, 0, playbackParameters, 0L, 0L, 0L, 0L, false);
    }

    public final j1 a() {
        return new j1(this.f9714a, this.f9715b, this.f9716c, this.f9717d, this.f9718e, this.f9719f, this.f9720g, this.f9721h, this.f9722i, this.j, this.k, this.f9723l, this.f9724m, this.f9725n, this.f9727p, this.f9728q, j(), SystemClock.elapsedRealtime(), this.f9726o);
    }

    public final j1 b(md.s sVar) {
        return new j1(this.f9714a, this.f9715b, this.f9716c, this.f9717d, this.f9718e, this.f9719f, this.f9720g, this.f9721h, this.f9722i, this.j, sVar, this.f9723l, this.f9724m, this.f9725n, this.f9727p, this.f9728q, this.f9729r, this.f9730s, this.f9726o);
    }

    public final j1 c(md.s sVar, long j, long j5, long j7, long j10, md.y0 y0Var, fe.u uVar, List list) {
        return new j1(this.f9714a, sVar, j5, j7, this.f9718e, this.f9719f, this.f9720g, y0Var, uVar, list, this.k, this.f9723l, this.f9724m, this.f9725n, this.f9727p, j10, j, SystemClock.elapsedRealtime(), this.f9726o);
    }

    public final j1 d(int i7, boolean z5) {
        return new j1(this.f9714a, this.f9715b, this.f9716c, this.f9717d, this.f9718e, this.f9719f, this.f9720g, this.f9721h, this.f9722i, this.j, this.k, z5, i7, this.f9725n, this.f9727p, this.f9728q, this.f9729r, this.f9730s, this.f9726o);
    }

    public final j1 e(com.google.android.exoplayer2.b bVar) {
        return new j1(this.f9714a, this.f9715b, this.f9716c, this.f9717d, this.f9718e, bVar, this.f9720g, this.f9721h, this.f9722i, this.j, this.k, this.f9723l, this.f9724m, this.f9725n, this.f9727p, this.f9728q, this.f9729r, this.f9730s, this.f9726o);
    }

    public final j1 f(PlaybackParameters playbackParameters) {
        return new j1(this.f9714a, this.f9715b, this.f9716c, this.f9717d, this.f9718e, this.f9719f, this.f9720g, this.f9721h, this.f9722i, this.j, this.k, this.f9723l, this.f9724m, playbackParameters, this.f9727p, this.f9728q, this.f9729r, this.f9730s, this.f9726o);
    }

    public final j1 g(int i7) {
        return new j1(this.f9714a, this.f9715b, this.f9716c, this.f9717d, i7, this.f9719f, this.f9720g, this.f9721h, this.f9722i, this.j, this.k, this.f9723l, this.f9724m, this.f9725n, this.f9727p, this.f9728q, this.f9729r, this.f9730s, this.f9726o);
    }

    public final j1 h(Timeline timeline) {
        return new j1(timeline, this.f9715b, this.f9716c, this.f9717d, this.f9718e, this.f9719f, this.f9720g, this.f9721h, this.f9722i, this.j, this.k, this.f9723l, this.f9724m, this.f9725n, this.f9727p, this.f9728q, this.f9729r, this.f9730s, this.f9726o);
    }

    public final long j() {
        long j;
        long j5;
        if (!k()) {
            return this.f9729r;
        }
        do {
            j = this.f9730s;
            j5 = this.f9729r;
        } while (j != this.f9730s);
        return je.e0.I(je.e0.U(j5) + ((long) ((SystemClock.elapsedRealtime() - j) * this.f9725n.f5574d)));
    }

    public final boolean k() {
        return this.f9718e == 3 && this.f9723l && this.f9724m == 0;
    }
}
