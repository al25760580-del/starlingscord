package com.google.android.exoplayer2;

import a5.i0;
import android.media.AudioTrack;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.video.VideoSize;
import ei.r0;
import fe.j;
import gc.f0;
import gc.j1;
import gc.m;
import gc.o;
import hc.u;
import he.g;
import he.s;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import je.a0;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class SimpleExoPlayer extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f5587c;

    public SimpleExoPlayer(m mVar) {
        i0 i0Var = new i0(0);
        this.f5587c = i0Var;
        try {
            this.f5586b = new c(mVar, this);
            i0Var.p();
        } catch (Throwable th2) {
            this.f5587c.p();
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final b A() {
        c0();
        c cVar = this.f5586b;
        cVar.x0();
        return cVar.f5650g0.f9719f;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int C() {
        c0();
        return this.f5586b.C();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int D() {
        c0();
        return this.f5586b.D();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void F(int i7) {
        c0();
        this.f5586b.F(i7);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void G(SurfaceView surfaceView) {
        c0();
        this.f5586b.G(surfaceView);
    }

    @Override // com.google.android.exoplayer2.Player
    public final int H() {
        c0();
        return this.f5586b.H();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int I() {
        c0();
        c cVar = this.f5586b;
        cVar.x0();
        return cVar.D;
    }

    @Override // com.google.android.exoplayer2.Player
    public final Timeline J() {
        c0();
        return this.f5586b.J();
    }

    @Override // com.google.android.exoplayer2.Player
    public final Looper K() {
        c0();
        return this.f5586b.f5660r;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean L() {
        c0();
        c cVar = this.f5586b;
        cVar.x0();
        return cVar.E;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long M() {
        c0();
        return this.f5586b.M();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void P(TextureView textureView) {
        c0();
        this.f5586b.P(textureView);
    }

    @Override // com.google.android.exoplayer2.Player
    public final MediaMetadata R() {
        c0();
        c cVar = this.f5586b;
        cVar.x0();
        return cVar.M;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long S() {
        c0();
        return this.f5586b.S();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long T() {
        c0();
        c cVar = this.f5586b;
        cVar.x0();
        return cVar.f5662t;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void a() {
        c0();
        this.f5586b.a();
    }

    @Override // com.google.android.exoplayer2.a
    public final void a0(int i7, long j, int i10, boolean z5) {
        c0();
        this.f5586b.a0(i7, j, i10, z5);
    }

    @Override // com.google.android.exoplayer2.Player
    public final PlaybackParameters b() {
        c0();
        return this.f5586b.b();
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean c() {
        c0();
        return this.f5586b.c();
    }

    public final void c0() {
        this.f5587c.j();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long d() {
        c0();
        return this.f5586b.d();
    }

    public final void d0() {
        String str;
        boolean z5;
        AudioTrack audioTrack;
        c0();
        c cVar = this.f5586b;
        cVar.getClass();
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(cVar)));
        sb2.append(" [ExoPlayerLib/2.19.1] [");
        sb2.append(e0.f13792e);
        sb2.append("] [");
        HashSet hashSet = f0.f9628a;
        synchronized (f0.class) {
            str = f0.f9629b;
        }
        sb2.append(str);
        sb2.append("]");
        je.b.y("ExoPlayerImpl", sb2.toString());
        cVar.x0();
        int i7 = e0.f13788a;
        if (i7 < 21 && (audioTrack = cVar.O) != null) {
            audioTrack.release();
            cVar.O = null;
        }
        cVar.f5667y.d();
        cVar.A.getClass();
        cVar.B.getClass();
        gc.d dVar = cVar.f5668z;
        dVar.f9588c = null;
        dVar.a();
        gc.e0 e0Var = cVar.k;
        synchronized (e0Var) {
            if (e0Var.V || !e0Var.G.getThread().isAlive()) {
                z5 = true;
            } else {
                e0Var.E.d(7);
                e0Var.f0(new o(6, e0Var), e0Var.R);
                z5 = e0Var.V;
            }
        }
        if (!z5) {
            cVar.f5654l.e(10, new gb.a(4));
        }
        cVar.f5654l.d();
        cVar.f5652i.f13757a.removeCallbacksAndMessages(null);
        g gVar = cVar.f5661s;
        hc.a aVar = cVar.f5659q;
        CopyOnWriteArrayList<he.e> copyOnWriteArrayList = (CopyOnWriteArrayList) ((s) gVar).f10688b.f21117d;
        for (he.e eVar : copyOnWriteArrayList) {
            if (eVar.f10600b == aVar) {
                eVar.f10601c = true;
                copyOnWriteArrayList.remove(eVar);
            }
        }
        j1 j1Var = cVar.f5650g0;
        if (j1Var.f9726o) {
            cVar.f5650g0 = j1Var.a();
        }
        j1 j1VarG = cVar.f5650g0.g(1);
        cVar.f5650g0 = j1VarG;
        j1 j1VarB = j1VarG.b(j1VarG.f9715b);
        cVar.f5650g0 = j1VarB;
        j1VarB.f9727p = j1VarB.f9729r;
        cVar.f5650g0.f9728q = 0L;
        u uVar = (u) cVar.f5659q;
        a0 a0Var = uVar.E;
        je.b.l(a0Var);
        a0Var.c(new com.google.firebase.messaging.s(15, uVar));
        DefaultTrackSelector defaultTrackSelector = (DefaultTrackSelector) cVar.f5651h;
        synchronized (defaultTrackSelector.f5728d) {
            if (i7 >= 32) {
                try {
                    j jVar = defaultTrackSelector.f5733i;
                    if (jVar != null) {
                        jVar.e();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        defaultTrackSelector.f9114a = null;
        defaultTrackSelector.f9115b = null;
        cVar.n0();
        Surface surface = cVar.Q;
        if (surface != null) {
            surface.release();
            cVar.Q = null;
        }
        cVar.f5640b0 = CueGroup.f5725e;
    }

    public final void e0(PlaybackParameters playbackParameters) {
        c0();
        c cVar = this.f5586b;
        cVar.x0();
        if (cVar.f5650g0.f9725n.equals(playbackParameters)) {
            return;
        }
        j1 j1VarF = cVar.f5650g0.f(playbackParameters);
        cVar.F++;
        cVar.k.E.a(4, playbackParameters).b();
        cVar.v0(j1VarF, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.Player
    public final Player.Commands f() {
        c0();
        c cVar = this.f5586b;
        cVar.x0();
        return cVar.L;
    }

    public final void f0(float f2) {
        c0();
        c cVar = this.f5586b;
        cVar.x0();
        final float fH = e0.h(f2, 0.0f, 1.0f);
        if (cVar.Z == fH) {
            return;
        }
        cVar.Z = fH;
        cVar.o0(1, 2, Float.valueOf(cVar.f5668z.f9590e * fH));
        cVar.f5654l.e(22, new je.j() { // from class: gc.q
            @Override // je.j
            public final void invoke(Object obj) {
                ((com.google.android.exoplayer2.e) obj).onVolumeChanged(fH);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean g() {
        c0();
        return this.f5586b.g();
    }

    public final void g0() {
        c0();
        c cVar = this.f5586b;
        cVar.x0();
        cVar.f5668z.c(1, cVar.g());
        cVar.s0(null);
        r0 r0Var = r0.f8352w;
        long j = cVar.f5650g0.f9729r;
        cVar.f5640b0 = new CueGroup(r0Var);
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getDuration() {
        c0();
        return this.f5586b.getDuration();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void h(boolean z5) {
        c0();
        this.f5586b.h(z5);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void i() {
        c0();
        this.f5586b.x0();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int j() {
        c0();
        return this.f5586b.j();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void k(TextureView textureView) {
        c0();
        this.f5586b.k(textureView);
    }

    @Override // com.google.android.exoplayer2.Player
    public final VideoSize l() {
        c0();
        c cVar = this.f5586b;
        cVar.x0();
        return cVar.f5646e0;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void m(e eVar) {
        c0();
        this.f5586b.m(eVar);
    }

    @Override // com.google.android.exoplayer2.Player
    public final int o() {
        c0();
        return this.f5586b.o();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void p(SurfaceView surfaceView) {
        c0();
        this.f5586b.p(surfaceView);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void r(boolean z5) {
        c0();
        this.f5586b.r(z5);
    }

    @Override // com.google.android.exoplayer2.Player
    public final long s() {
        c0();
        c cVar = this.f5586b;
        cVar.x0();
        return cVar.f5663u;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long t() {
        c0();
        return this.f5586b.t();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void u(e eVar) {
        c0();
        this.f5586b.u(eVar);
    }

    @Override // com.google.android.exoplayer2.Player
    public final long v() {
        c0();
        return this.f5586b.v();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int w() {
        c0();
        return this.f5586b.w();
    }

    @Override // com.google.android.exoplayer2.Player
    public final Tracks x() {
        c0();
        return this.f5586b.x();
    }

    @Override // com.google.android.exoplayer2.Player
    public final CueGroup z() {
        c0();
        c cVar = this.f5586b;
        cVar.x0();
        return cVar.f5640b0;
    }
}
