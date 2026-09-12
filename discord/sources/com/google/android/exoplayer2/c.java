package com.google.android.exoplayer2;

import a5.i0;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.datastore.preferences.protobuf.d1;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo;
import com.google.android.exoplayer2.video.VideoSize;
import cr.q;
import fe.p;
import fe.r;
import fe.u;
import gc.b0;
import gc.d0;
import gc.e0;
import gc.f0;
import gc.f1;
import gc.j;
import gc.j1;
import gc.k1;
import gc.l;
import gc.l1;
import gc.n1;
import gc.o;
import gc.o1;
import gc.p1;
import gc.q1;
import gc.t;
import gc.u0;
import gc.u1;
import gc.v;
import gc.v1;
import gc.w;
import hc.c0;
import he.g;
import he.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import je.a0;
import je.m;
import je.x;
import je.y;
import je.z;
import ke.n;
import kh.f;
import le.k;
import md.r0;
import md.y0;
import org.webrtc.MediaStreamTrack;
import ue.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {
    public final k8.a A;
    public final f B;
    public final long C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public final q1 J;
    public r0 K;
    public Player.Commands L;
    public MediaMetadata M;
    public Format N;
    public AudioTrack O;
    public Object P;
    public Surface Q;
    public SurfaceHolder R;
    public k S;
    public boolean T;
    public TextureView U;
    public int V;
    public x W;
    public final int X;
    public final AudioAttributes Y;
    public float Z;
    public boolean a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f5639b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public CueGroup f5640b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Player.Commands f5641c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final boolean f5642c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f5643d = new i0(0);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f5644d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f5645e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public VideoSize f5646e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f5647f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public MediaMetadata f5648f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gc.e[] f5649g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public j1 f5650g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f5651h;
    public int h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0 f5652i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public long f5653i0;
    public final gc.r j;
    public final e0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f5654l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f5655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u1 f5656n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f5657o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f5658p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hc.a f5659q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Looper f5660r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f5661s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f5662t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f5663u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y f5664v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w f5665w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gc.x f5666x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final gc.b f5667y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final gc.d f5668z;

    static {
        f0.a("goog.exo.exoplayer");
    }

    public c(gc.m mVar, SimpleExoPlayer simpleExoPlayer) {
        boolean zEquals;
        try {
            je.b.y("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.1] [" + je.e0.f13792e + "]");
            this.f5645e = mVar.f9756a.getApplicationContext();
            this.f5659q = new hc.u(mVar.f9757b);
            this.Y = mVar.f9764i;
            this.V = mVar.j;
            this.a0 = false;
            this.C = mVar.f9770q;
            w wVar = new w(this);
            this.f5665w = wVar;
            this.f5666x = new gc.x();
            Handler handler = new Handler(mVar.f9763h);
            gc.e[] eVarArrB = ((gc.b) mVar.f9758c.f2877e).b(handler, wVar, wVar, wVar, wVar);
            this.f5649g = eVarArrB;
            je.b.k(eVarArrB.length > 0);
            this.f5651h = (r) mVar.f9760e.get();
            mVar.f9759d.get();
            this.f5661s = (g) mVar.f9762g.get();
            this.f5658p = mVar.k;
            this.J = mVar.f9765l;
            this.f5662t = mVar.f9766m;
            this.f5663u = mVar.f9767n;
            Looper looper = mVar.f9763h;
            this.f5660r = looper;
            y yVar = mVar.f9757b;
            this.f5664v = yVar;
            this.f5647f = simpleExoPlayer;
            this.f5654l = new m(looper, yVar, new gc.r(this));
            this.f5655m = new CopyOnWriteArraySet();
            this.f5657o = new ArrayList();
            this.K = new r0();
            this.f5639b = new u(new p1[eVarArrB.length], new p[eVarArrB.length], Tracks.f5589e, null);
            this.f5656n = new u1();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32};
            for (int i7 = 0; i7 < 19; i7++) {
                int i10 = iArr[i7];
                je.b.k(!false);
                sparseBooleanArray.append(i10, true);
            }
            this.f5651h.getClass();
            je.b.k(!false);
            sparseBooleanArray.append(29, true);
            je.b.k(!false);
            je.g gVar = new je.g(sparseBooleanArray);
            this.f5641c = new Player.Commands(gVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i11 = 0; i11 < gVar.f13801a.size(); i11++) {
                int iA = gVar.a(i11);
                je.b.k(!false);
                sparseBooleanArray2.append(iA, true);
            }
            je.b.k(!false);
            sparseBooleanArray2.append(4, true);
            je.b.k(!false);
            sparseBooleanArray2.append(10, true);
            je.b.k(!false);
            this.L = new Player.Commands(new je.g(sparseBooleanArray2));
            this.f5652i = this.f5664v.a(this.f5660r, null);
            gc.r rVar = new gc.r(this);
            this.j = rVar;
            this.f5650g0 = j1.i(this.f5639b);
            ((hc.u) this.f5659q).k(this.f5647f, this.f5660r);
            int i12 = je.e0.f13788a;
            this.k = new e0(this.f5649g, this.f5651h, this.f5639b, (j) mVar.f9761f.get(), this.f5661s, this.D, this.E, this.f5659q, this.J, mVar.f9768o, mVar.f9769p, this.f5660r, this.f5664v, rVar, i12 < 31 ? new c0() : v.a(this.f5645e, this, mVar.f9771r));
            this.Z = 1.0f;
            this.D = 0;
            MediaMetadata mediaMetadata = MediaMetadata.f5540f0;
            this.M = mediaMetadata;
            this.f5648f0 = mediaMetadata;
            int iGenerateAudioSessionId = -1;
            this.h0 = -1;
            if (i12 < 21) {
                AudioTrack audioTrack = this.O;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.O.release();
                    this.O = null;
                }
                if (this.O == null) {
                    this.O = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.X = this.O.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f5645e.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                if (audioManager != null) {
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.X = iGenerateAudioSessionId;
            }
            this.f5640b0 = CueGroup.f5725e;
            this.f5642c0 = true;
            u(this.f5659q);
            g gVar2 = this.f5661s;
            Handler handler2 = new Handler(this.f5660r);
            hc.a aVar = this.f5659q;
            s sVar = (s) gVar2;
            sVar.getClass();
            aVar.getClass();
            i iVar = sVar.f10688b;
            iVar.getClass();
            CopyOnWriteArrayList<he.e> copyOnWriteArrayList = (CopyOnWriteArrayList) iVar.f21117d;
            for (he.e eVar : copyOnWriteArrayList) {
                if (eVar.f10600b == aVar) {
                    eVar.f10601c = true;
                    copyOnWriteArrayList.remove(eVar);
                }
            }
            copyOnWriteArrayList.add(new he.e(handler2, aVar));
            this.f5655m.add(this.f5665w);
            Context context = mVar.f9756a;
            w wVar2 = this.f5665w;
            gc.b bVar = new gc.b();
            bVar.f9561a = context.getApplicationContext();
            bVar.f9563c = new gc.a(bVar, handler, wVar2);
            this.f5667y = bVar;
            bVar.d();
            this.f5668z = new gc.d(mVar.f9756a, handler, this.f5665w);
            int i13 = je.e0.f13788a;
            Context context2 = mVar.f9756a;
            k8.a aVar2 = new k8.a();
            this.A = aVar2;
            Context context3 = mVar.f9756a;
            f fVar = new f(7);
            this.B = fVar;
            l lVar = new l(0);
            lVar.f9745b = 0;
            lVar.f9746c = 0;
            lVar.a();
            this.f5646e0 = VideoSize.f5848w;
            this.W = x.f13863c;
            r rVar2 = this.f5651h;
            AudioAttributes audioAttributes = this.Y;
            DefaultTrackSelector defaultTrackSelector = (DefaultTrackSelector) rVar2;
            synchronized (defaultTrackSelector.f5728d) {
                zEquals = defaultTrackSelector.j.equals(audioAttributes);
                defaultTrackSelector.j = audioAttributes;
            }
            if (!zEquals) {
                defaultTrackSelector.e();
            }
            o0(1, 10, Integer.valueOf(this.X));
            o0(2, 10, Integer.valueOf(this.X));
            o0(1, 3, this.Y);
            o0(2, 4, Integer.valueOf(this.V));
            o0(2, 5, 0);
            o0(1, 9, Boolean.valueOf(this.a0));
            o0(2, 7, this.f5666x);
            o0(6, 8, this.f5666x);
            this.f5643d.p();
        } catch (Throwable th2) {
            this.f5643d.p();
            throw th2;
        }
    }

    public static long i0(j1 j1Var) {
        v1 v1Var = new v1();
        u1 u1Var = new u1();
        j1Var.f9714a.g(j1Var.f9715b.f15689a, u1Var);
        long j = j1Var.f9716c;
        return j == -9223372036854775807L ? j1Var.f9714a.m(u1Var.f9888i, v1Var, 0L).J : u1Var.f9890w + j;
    }

    @Override // com.google.android.exoplayer2.Player
    public final b A() {
        x0();
        return this.f5650g0.f9719f;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int C() {
        x0();
        if (c()) {
            return this.f5650g0.f9715b.f15690b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int D() {
        x0();
        int iH0 = h0(this.f5650g0);
        if (iH0 == -1) {
            return 0;
        }
        return iH0;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void F(int i7) {
        x0();
        if (this.D != i7) {
            this.D = i7;
            a0 a0Var = this.k.E;
            a0Var.getClass();
            z zVarB = a0.b();
            zVarB.f13867a = a0Var.f13757a.obtainMessage(11, i7, 0);
            zVarB.b();
            bd.b bVar = new bd.b(i7, 2);
            m mVar = this.f5654l;
            mVar.c(8, bVar);
            t0();
            mVar.b();
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final void G(SurfaceView surfaceView) {
        x0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        x0();
        if (holder == null || holder != this.R) {
            return;
        }
        d0();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int H() {
        x0();
        return this.f5650g0.f9724m;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int I() {
        x0();
        return this.D;
    }

    @Override // com.google.android.exoplayer2.Player
    public final Timeline J() {
        x0();
        return this.f5650g0.f9714a;
    }

    @Override // com.google.android.exoplayer2.Player
    public final Looper K() {
        return this.f5660r;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean L() {
        x0();
        return this.E;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long M() {
        x0();
        if (this.f5650g0.f9714a.p()) {
            return this.f5653i0;
        }
        j1 j1Var = this.f5650g0;
        if (j1Var.k.f15692d != j1Var.f9715b.f15692d) {
            return je.e0.U(j1Var.f9714a.m(D(), this.f5591a, 0L).K);
        }
        long j = j1Var.f9727p;
        if (this.f5650g0.k.a()) {
            j1 j1Var2 = this.f5650g0;
            u1 u1VarG = j1Var2.f9714a.g(j1Var2.k.f15689a, this.f5656n);
            long jD = u1VarG.d(this.f5650g0.k.f15690b);
            j = jD == Long.MIN_VALUE ? u1VarG.f9889v : jD;
        }
        j1 j1Var3 = this.f5650g0;
        Timeline timeline = j1Var3.f9714a;
        Object obj = j1Var3.k.f15689a;
        u1 u1Var = this.f5656n;
        timeline.g(obj, u1Var);
        return je.e0.U(j + u1Var.f9890w);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void P(TextureView textureView) {
        x0();
        if (textureView == null) {
            d0();
            return;
        }
        n0();
        this.U = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            je.b.N("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f5665w);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            r0(null);
            l0(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            r0(surface);
            this.Q = surface;
            l0(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final MediaMetadata R() {
        x0();
        return this.M;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long S() {
        x0();
        return je.e0.U(g0(this.f5650g0));
    }

    @Override // com.google.android.exoplayer2.Player
    public final long T() {
        x0();
        return this.f5662t;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void a() {
        x0();
        boolean zG = g();
        int iC = this.f5668z.c(2, zG);
        u0(iC, (!zG || iC == 1) ? 1 : 2, zG);
        j1 j1Var = this.f5650g0;
        if (j1Var.f9718e != 1) {
            return;
        }
        j1 j1VarE = j1Var.e(null);
        j1 j1VarG = j1VarE.g(j1VarE.f9714a.p() ? 4 : 2);
        this.F++;
        a0 a0Var = this.k.E;
        a0Var.getClass();
        z zVarB = a0.b();
        zVarB.f13867a = a0Var.f13757a.obtainMessage(0);
        zVarB.b();
        v0(j1VarG, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.a
    public final void a0(int i7, long j, int i10, boolean z5) {
        x0();
        je.b.g(i7 >= 0);
        hc.u uVar = (hc.u) this.f5659q;
        if (!uVar.F) {
            AnalyticsListener$EventTime analyticsListener$EventTimeC = uVar.c();
            uVar.F = true;
            uVar.i(analyticsListener$EventTimeC, -1, new hc.i(analyticsListener$EventTimeC, 0));
        }
        Timeline timeline = this.f5650g0.f9714a;
        if (timeline.p() || i7 < timeline.o()) {
            this.F++;
            if (c()) {
                je.b.N("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                b0 b0Var = new b0(this.f5650g0);
                b0Var.a(1);
                c cVar = this.j.f9831d;
                cVar.f5652i.c(new com.mkuczera.haptic.a(6, cVar, b0Var));
                return;
            }
            j1 j1VarG = this.f5650g0;
            int i11 = j1VarG.f9718e;
            if (i11 == 3 || (i11 == 4 && !timeline.p())) {
                j1VarG = this.f5650g0.g(2);
            }
            int iD = D();
            j1 j1VarJ0 = j0(j1VarG, timeline, k0(timeline, i7, j));
            this.k.E.a(3, new d0(timeline, i7, je.e0.I(j))).b();
            v0(j1VarJ0, 0, 1, true, 1, g0(j1VarJ0), iD, z5);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final PlaybackParameters b() {
        x0();
        return this.f5650g0.f9725n;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean c() {
        x0();
        return this.f5650g0.f9715b.a();
    }

    public final MediaMetadata c0() {
        Timeline timelineJ = J();
        if (timelineJ.p()) {
            return this.f5648f0;
        }
        MediaItem mediaItem = timelineJ.m(D(), this.f5591a, 0L).f9911i;
        u0 u0VarA = this.f5648f0.a();
        MediaMetadata mediaMetadata = mediaItem.f5537w;
        if (mediaMetadata != null) {
            CharSequence charSequence = mediaMetadata.f5562d;
            if (charSequence != null) {
                u0VarA.f9862a = charSequence;
            }
            CharSequence charSequence2 = mediaMetadata.f5564e;
            if (charSequence2 != null) {
                u0VarA.f9863b = charSequence2;
            }
            CharSequence charSequence3 = mediaMetadata.f5566i;
            if (charSequence3 != null) {
                u0VarA.f9864c = charSequence3;
            }
            CharSequence charSequence4 = mediaMetadata.f5567v;
            if (charSequence4 != null) {
                u0VarA.f9865d = charSequence4;
            }
            CharSequence charSequence5 = mediaMetadata.f5568w;
            if (charSequence5 != null) {
                u0VarA.f9866e = charSequence5;
            }
            CharSequence charSequence6 = mediaMetadata.f5569x;
            if (charSequence6 != null) {
                u0VarA.f9867f = charSequence6;
            }
            CharSequence charSequence7 = mediaMetadata.f5570y;
            if (charSequence7 != null) {
                u0VarA.f9868g = charSequence7;
            }
            o1 o1Var = mediaMetadata.E;
            if (o1Var != null) {
                u0VarA.f9869h = o1Var;
            }
            o1 o1Var2 = mediaMetadata.F;
            if (o1Var2 != null) {
                u0VarA.f9870i = o1Var2;
            }
            byte[] bArr = mediaMetadata.G;
            if (bArr != null) {
                Integer num = mediaMetadata.H;
                u0VarA.j = (byte[]) bArr.clone();
                u0VarA.k = num;
            }
            Uri uri = mediaMetadata.I;
            if (uri != null) {
                u0VarA.f9871l = uri;
            }
            Integer num2 = mediaMetadata.J;
            if (num2 != null) {
                u0VarA.f9872m = num2;
            }
            Integer num3 = mediaMetadata.K;
            if (num3 != null) {
                u0VarA.f9873n = num3;
            }
            Integer num4 = mediaMetadata.L;
            if (num4 != null) {
                u0VarA.f9874o = num4;
            }
            Boolean bool = mediaMetadata.M;
            if (bool != null) {
                u0VarA.f9875p = bool;
            }
            Boolean bool2 = mediaMetadata.N;
            if (bool2 != null) {
                u0VarA.f9876q = bool2;
            }
            Integer num5 = mediaMetadata.O;
            if (num5 != null) {
                u0VarA.f9877r = num5;
            }
            Integer num6 = mediaMetadata.P;
            if (num6 != null) {
                u0VarA.f9877r = num6;
            }
            Integer num7 = mediaMetadata.Q;
            if (num7 != null) {
                u0VarA.f9878s = num7;
            }
            Integer num8 = mediaMetadata.R;
            if (num8 != null) {
                u0VarA.f9879t = num8;
            }
            Integer num9 = mediaMetadata.S;
            if (num9 != null) {
                u0VarA.f9880u = num9;
            }
            Integer num10 = mediaMetadata.T;
            if (num10 != null) {
                u0VarA.f9881v = num10;
            }
            Integer num11 = mediaMetadata.U;
            if (num11 != null) {
                u0VarA.f9882w = num11;
            }
            CharSequence charSequence8 = mediaMetadata.V;
            if (charSequence8 != null) {
                u0VarA.f9883x = charSequence8;
            }
            CharSequence charSequence9 = mediaMetadata.W;
            if (charSequence9 != null) {
                u0VarA.f9884y = charSequence9;
            }
            CharSequence charSequence10 = mediaMetadata.X;
            if (charSequence10 != null) {
                u0VarA.f9885z = charSequence10;
            }
            Integer num12 = mediaMetadata.Y;
            if (num12 != null) {
                u0VarA.A = num12;
            }
            Integer num13 = mediaMetadata.Z;
            if (num13 != null) {
                u0VarA.B = num13;
            }
            CharSequence charSequence11 = mediaMetadata.a0;
            if (charSequence11 != null) {
                u0VarA.C = charSequence11;
            }
            CharSequence charSequence12 = mediaMetadata.f5560b0;
            if (charSequence12 != null) {
                u0VarA.D = charSequence12;
            }
            CharSequence charSequence13 = mediaMetadata.f5561c0;
            if (charSequence13 != null) {
                u0VarA.E = charSequence13;
            }
            Integer num14 = mediaMetadata.f5563d0;
            if (num14 != null) {
                u0VarA.F = num14;
            }
            Bundle bundle = mediaMetadata.f5565e0;
            if (bundle != null) {
                u0VarA.G = bundle;
            }
        }
        return new MediaMetadata(u0VarA);
    }

    @Override // com.google.android.exoplayer2.Player
    public final long d() {
        x0();
        return je.e0.U(this.f5650g0.f9728q);
    }

    public final void d0() {
        x0();
        n0();
        r0(null);
        l0(0, 0);
    }

    public final l1 e0(k1 k1Var) {
        int iH0 = h0(this.f5650g0);
        Timeline timeline = this.f5650g0.f9714a;
        if (iH0 == -1) {
            iH0 = 0;
        }
        y yVar = this.f5664v;
        e0 e0Var = this.k;
        return new l1(e0Var, k1Var, timeline, iH0, yVar, e0Var.G);
    }

    @Override // com.google.android.exoplayer2.Player
    public final Player.Commands f() {
        x0();
        return this.L;
    }

    public final long f0(j1 j1Var) {
        md.s sVar = j1Var.f9715b;
        long j = j1Var.f9716c;
        Timeline timeline = j1Var.f9714a;
        if (!sVar.a()) {
            return je.e0.U(g0(j1Var));
        }
        Object obj = j1Var.f9715b.f15689a;
        u1 u1Var = this.f5656n;
        timeline.g(obj, u1Var);
        if (j == -9223372036854775807L) {
            return je.e0.U(timeline.m(h0(j1Var), this.f5591a, 0L).J);
        }
        return je.e0.U(j) + je.e0.U(u1Var.f9890w);
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean g() {
        x0();
        return this.f5650g0.f9723l;
    }

    public final long g0(j1 j1Var) {
        if (j1Var.f9714a.p()) {
            return je.e0.I(this.f5653i0);
        }
        long j = j1Var.f9726o ? j1Var.j() : j1Var.f9729r;
        if (j1Var.f9715b.a()) {
            return j;
        }
        Timeline timeline = j1Var.f9714a;
        Object obj = j1Var.f9715b.f15689a;
        u1 u1Var = this.f5656n;
        timeline.g(obj, u1Var);
        return j + u1Var.f9890w;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getDuration() {
        x0();
        if (!c()) {
            Timeline timelineJ = J();
            if (timelineJ.p()) {
                return -9223372036854775807L;
            }
            return je.e0.U(timelineJ.m(D(), this.f5591a, 0L).K);
        }
        j1 j1Var = this.f5650g0;
        md.s sVar = j1Var.f9715b;
        Timeline timeline = j1Var.f9714a;
        Object obj = sVar.f15689a;
        u1 u1Var = this.f5656n;
        timeline.g(obj, u1Var);
        return je.e0.U(u1Var.a(sVar.f15690b, sVar.f15691c));
    }

    @Override // com.google.android.exoplayer2.Player
    public final void h(boolean z5) {
        x0();
        if (this.E != z5) {
            this.E = z5;
            a0 a0Var = this.k.E;
            a0Var.getClass();
            z zVarB = a0.b();
            zVarB.f13867a = a0Var.f13757a.obtainMessage(12, z5 ? 1 : 0, 0);
            zVarB.b();
            t tVar = new t(z5, 0);
            m mVar = this.f5654l;
            mVar.c(9, tVar);
            t0();
            mVar.b();
        }
    }

    public final int h0(j1 j1Var) {
        return j1Var.f9714a.p() ? this.h0 : j1Var.f9714a.g(j1Var.f9715b.f15689a, this.f5656n).f9888i;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void i() {
        x0();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int j() {
        x0();
        if (this.f5650g0.f9714a.p()) {
            return 0;
        }
        j1 j1Var = this.f5650g0;
        return j1Var.f9714a.b(j1Var.f9715b.f15689a);
    }

    public final j1 j0(j1 j1Var, Timeline timeline, Pair pair) {
        List list;
        je.b.g(timeline.p() || pair != null);
        Timeline timeline2 = j1Var.f9714a;
        long jF0 = f0(j1Var);
        j1 j1VarH = j1Var.h(timeline);
        if (timeline.p()) {
            md.s sVar = j1.f9713t;
            long jI = je.e0.I(this.f5653i0);
            j1 j1VarB = j1VarH.c(sVar, jI, jI, jI, 0L, y0.f15735v, this.f5639b, ei.r0.f8352w).b(sVar);
            j1VarB.f9727p = j1VarB.f9729r;
            return j1VarB;
        }
        Object obj = j1VarH.f9715b.f15689a;
        int i7 = je.e0.f13788a;
        boolean zEquals = obj.equals(pair.first);
        md.s sVar2 = !zEquals ? new md.s(pair.first) : j1VarH.f9715b;
        long jLongValue = ((Long) pair.second).longValue();
        long jI2 = je.e0.I(jF0);
        if (!timeline2.p()) {
            jI2 -= timeline2.g(obj, this.f5656n).f9890w;
        }
        if (!zEquals || jLongValue < jI2) {
            md.s sVar3 = sVar2;
            je.b.k(!sVar3.a());
            y0 y0Var = !zEquals ? y0.f15735v : j1VarH.f9721h;
            u uVar = !zEquals ? this.f5639b : j1VarH.f9722i;
            if (zEquals) {
                list = j1VarH.j;
            } else {
                ei.c0 c0Var = ei.e0.f8303e;
                list = ei.r0.f8352w;
            }
            j1 j1VarB2 = j1VarH.c(sVar3, jLongValue, jLongValue, jLongValue, 0L, y0Var, uVar, list).b(sVar3);
            j1VarB2.f9727p = jLongValue;
            return j1VarB2;
        }
        if (jLongValue != jI2) {
            md.s sVar4 = sVar2;
            je.b.k(!sVar4.a());
            long jMax = Math.max(0L, j1VarH.f9728q - (jLongValue - jI2));
            long j = j1VarH.f9727p;
            if (j1VarH.k.equals(j1VarH.f9715b)) {
                j = jLongValue + jMax;
            }
            j1 j1VarC = j1VarH.c(sVar4, jLongValue, jLongValue, jLongValue, jMax, j1VarH.f9721h, j1VarH.f9722i, j1VarH.j);
            j1VarC.f9727p = j;
            return j1VarC;
        }
        int iB = timeline.b(j1VarH.k.f15689a);
        if (iB != -1 && timeline.f(iB, this.f5656n, false).f9888i == timeline.g(sVar2.f15689a, this.f5656n).f9888i) {
            return j1VarH;
        }
        timeline.g(sVar2.f15689a, this.f5656n);
        long jA = sVar2.a() ? this.f5656n.a(sVar2.f15690b, sVar2.f15691c) : this.f5656n.f9889v;
        md.s sVar5 = sVar2;
        j1 j1VarB3 = j1VarH.c(sVar5, j1VarH.f9729r, j1VarH.f9729r, j1VarH.f9717d, jA - j1VarH.f9729r, j1VarH.f9721h, j1VarH.f9722i, j1VarH.j).b(sVar5);
        j1VarB3.f9727p = jA;
        return j1VarB3;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void k(TextureView textureView) {
        x0();
        if (textureView == null || textureView != this.U) {
            return;
        }
        d0();
    }

    public final Pair k0(Timeline timeline, int i7, long j) {
        if (timeline.p()) {
            this.h0 = i7;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f5653i0 = j;
            return null;
        }
        if (i7 == -1 || i7 >= timeline.o()) {
            i7 = timeline.a(this.E);
            j = je.e0.U(timeline.m(i7, this.f5591a, 0L).J);
        }
        return timeline.i(this.f5591a, this.f5656n, i7, je.e0.I(j));
    }

    @Override // com.google.android.exoplayer2.Player
    public final VideoSize l() {
        x0();
        return this.f5646e0;
    }

    public final void l0(final int i7, final int i10) {
        x xVar = this.W;
        if (i7 == xVar.f13864a && i10 == xVar.f13865b) {
            return;
        }
        this.W = new x(i7, i10);
        this.f5654l.e(24, new je.j() { // from class: gc.s
            @Override // je.j
            public final void invoke(Object obj) {
                ((com.google.android.exoplayer2.e) obj).onSurfaceSizeChanged(i7, i10);
            }
        });
        o0(2, 14, new x(i7, i10));
    }

    @Override // com.google.android.exoplayer2.Player
    public final void m(e eVar) {
        x0();
        eVar.getClass();
        m mVar = this.f5654l;
        mVar.f();
        CopyOnWriteArraySet<je.l> copyOnWriteArraySet = mVar.f13810d;
        for (je.l lVar : copyOnWriteArraySet) {
            if (lVar.f13803a.equals(eVar)) {
                je.k kVar = mVar.f13809c;
                lVar.f13806d = true;
                if (lVar.f13805c) {
                    lVar.f13805c = false;
                    kVar.h(lVar.f13803a, lVar.f13804b.k());
                }
                copyOnWriteArraySet.remove(lVar);
            }
        }
    }

    public final void m0(int i7) {
        for (int i10 = i7 - 1; i10 >= 0; i10--) {
            this.f5657o.remove(i10);
        }
        r0 r0Var = this.K;
        int[] iArr = r0Var.f15695b;
        int[] iArr2 = new int[iArr.length - i7];
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            if (i13 < 0 || i13 >= i7) {
                int i14 = i12 - i11;
                if (i13 >= 0) {
                    i13 -= i7;
                }
                iArr2[i14] = i13;
            } else {
                i11++;
            }
        }
        this.K = new r0(iArr2, new Random(r0Var.f15694a.nextLong()));
    }

    public final void n0() {
        k kVar = this.S;
        w wVar = this.f5665w;
        if (kVar != null) {
            l1 l1VarE0 = e0(this.f5666x);
            je.b.k(!l1VarE0.f9753g);
            l1VarE0.f9750d = 10000;
            je.b.k(!l1VarE0.f9753g);
            l1VarE0.f9751e = null;
            l1VarE0.c();
            this.S.f15057d.remove(wVar);
            this.S = null;
        }
        TextureView textureView = this.U;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != wVar) {
                je.b.N("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.U.setSurfaceTextureListener(null);
            }
            this.U = null;
        }
        SurfaceHolder surfaceHolder = this.R;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(wVar);
            this.R = null;
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final int o() {
        x0();
        if (c()) {
            return this.f5650g0.f9715b.f15691c;
        }
        return -1;
    }

    public final void o0(int i7, int i10, Object obj) {
        for (gc.e eVar : this.f5649g) {
            if (eVar.f9602e == i7) {
                l1 l1VarE0 = e0(eVar);
                je.b.k(!l1VarE0.f9753g);
                l1VarE0.f9750d = i10;
                je.b.k(!l1VarE0.f9753g);
                l1VarE0.f9751e = obj;
                l1VarE0.c();
            }
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final void p(SurfaceView surfaceView) {
        x0();
        if (surfaceView instanceof n) {
            n0();
            r0(surfaceView);
            q0(surfaceView.getHolder());
            return;
        }
        boolean z5 = surfaceView instanceof k;
        w wVar = this.f5665w;
        if (z5) {
            n0();
            this.S = (k) surfaceView;
            l1 l1VarE0 = e0(this.f5666x);
            je.b.k(!l1VarE0.f9753g);
            l1VarE0.f9750d = 10000;
            k kVar = this.S;
            je.b.k(true ^ l1VarE0.f9753g);
            l1VarE0.f9751e = kVar;
            l1VarE0.c();
            this.S.f15057d.add(wVar);
            r0(this.S.getVideoSurface());
            q0(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        x0();
        if (holder == null) {
            d0();
            return;
        }
        n0();
        this.T = true;
        this.R = holder;
        holder.addCallback(wVar);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            r0(null);
            l0(0, 0);
        } else {
            r0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            l0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void p0(List list, boolean z5) {
        x0();
        int iH0 = h0(this.f5650g0);
        long jS = S();
        this.F++;
        ArrayList arrayList = this.f5657o;
        if (!arrayList.isEmpty()) {
            m0(arrayList.size());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            f1 f1Var = new f1((md.a) list.get(i7), this.f5658p);
            arrayList2.add(f1Var);
            arrayList.add(i7, new gc.y(f1Var.f9631b, f1Var.f9630a.L));
        }
        this.K = this.K.a(arrayList2.size());
        n1 n1Var = new n1(arrayList, this.K);
        boolean zP = n1Var.p();
        int i10 = n1Var.f9794v;
        if (!zP && -1 >= i10) {
            throw new q();
        }
        if (z5) {
            iH0 = n1Var.a(this.E);
            jS = -9223372036854775807L;
        }
        j1 j1VarJ0 = j0(this.f5650g0, n1Var, k0(n1Var, iH0, jS));
        int i11 = j1VarJ0.f9718e;
        if (iH0 != -1 && i11 != 1) {
            i11 = (n1Var.p() || iH0 >= i10) ? 4 : 2;
        }
        j1 j1VarG = j1VarJ0.g(i11);
        this.k.E.a(17, new gc.a0(arrayList2, this.K, iH0, je.e0.I(jS))).b();
        v0(j1VarG, 0, 1, (this.f5650g0.f9715b.f15689a.equals(j1VarG.f9715b.f15689a) || this.f5650g0.f9714a.p()) ? false : true, 4, g0(j1VarG), -1, false);
    }

    public final void q0(SurfaceHolder surfaceHolder) {
        this.T = false;
        this.R = surfaceHolder;
        surfaceHolder.addCallback(this.f5665w);
        Surface surface = this.R.getSurface();
        if (surface == null || !surface.isValid()) {
            l0(0, 0);
        } else {
            Rect surfaceFrame = this.R.getSurfaceFrame();
            l0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final void r(boolean z5) {
        x0();
        int iC = this.f5668z.c(w(), z5);
        int i7 = 1;
        if (z5 && iC != 1) {
            i7 = 2;
        }
        u0(iC, i7, z5);
    }

    public final void r0(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z5 = false;
        for (gc.e eVar : this.f5649g) {
            if (eVar.f9602e == 2) {
                l1 l1VarE0 = e0(eVar);
                je.b.k(!l1VarE0.f9753g);
                l1VarE0.f9750d = 1;
                je.b.k(true ^ l1VarE0.f9753g);
                l1VarE0.f9751e = obj;
                l1VarE0.c();
                arrayList.add(l1VarE0);
            }
        }
        Object obj2 = this.P;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((l1) it.next()).a(this.C);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z5 = true;
            }
            Object obj3 = this.P;
            Surface surface = this.Q;
            if (obj3 == surface) {
                surface.release();
                this.Q = null;
            }
        }
        this.P = obj;
        if (z5) {
            s0(new b(2, new d1("Detaching surface timed out."), 1003));
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final long s() {
        x0();
        return this.f5663u;
    }

    public final void s0(b bVar) {
        j1 j1Var = this.f5650g0;
        j1 j1VarB = j1Var.b(j1Var.f9715b);
        j1VarB.f9727p = j1VarB.f9729r;
        j1VarB.f9728q = 0L;
        j1 j1VarG = j1VarB.g(1);
        if (bVar != null) {
            j1VarG = j1VarG.e(bVar);
        }
        j1 j1Var2 = j1VarG;
        this.F++;
        a0 a0Var = this.k.E;
        a0Var.getClass();
        z zVarB = a0.b();
        zVarB.f13867a = a0Var.f13757a.obtainMessage(6);
        zVarB.b();
        v0(j1Var2, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.Player
    public final long t() {
        x0();
        return f0(this.f5650g0);
    }

    public final void t0() {
        Player.Commands commands = this.L;
        int i7 = je.e0.f13788a;
        a aVar = this.f5647f;
        boolean zC = aVar.c();
        boolean Z = aVar.Z();
        boolean zW = aVar.W();
        boolean zV = aVar.V();
        boolean zY = aVar.Y();
        boolean zX = aVar.X();
        boolean zP = aVar.J().p();
        d dVar = new d();
        je.g gVar = this.f5641c.f5577d;
        i0 i0Var = dVar.f5669a;
        i0Var.getClass();
        boolean z5 = false;
        for (int i10 = 0; i10 < gVar.f13801a.size(); i10++) {
            i0Var.g(gVar.a(i10));
        }
        boolean z6 = !zC;
        dVar.a(4, z6);
        dVar.a(5, Z && !zC);
        dVar.a(6, zW && !zC);
        dVar.a(7, !zP && (zW || !zY || Z) && !zC);
        dVar.a(8, zV && !zC);
        dVar.a(9, !zP && (zV || (zY && zX)) && !zC);
        dVar.a(10, z6);
        dVar.a(11, Z && !zC);
        if (Z && !zC) {
            z5 = true;
        }
        dVar.a(12, z5);
        Player.Commands commands2 = new Player.Commands(i0Var.k());
        this.L = commands2;
        if (commands2.equals(commands)) {
            return;
        }
        this.f5654l.c(13, new gc.r(this));
    }

    @Override // com.google.android.exoplayer2.Player
    public final void u(e eVar) {
        eVar.getClass();
        this.f5654l.a(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final void u0(int i7, int i10, boolean z5) {
        int i11 = 0;
        ?? r15 = (!z5 || i7 == -1) ? 0 : 1;
        if (r15 != 0 && i7 != 1) {
            i11 = 1;
        }
        j1 j1Var = this.f5650g0;
        if (j1Var.f9723l == r15 && j1Var.f9724m == i11) {
            return;
        }
        this.F++;
        boolean z6 = j1Var.f9726o;
        j1 j1VarA = j1Var;
        if (z6) {
            j1VarA = j1Var.a();
        }
        j1 j1VarD = j1VarA.d(i11, r15);
        a0 a0Var = this.k.E;
        a0Var.getClass();
        z zVarB = a0.b();
        zVarB.f13867a = a0Var.f13757a.obtainMessage(1, r15, i11);
        zVarB.b();
        v0(j1VarD, 0, i10, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.Player
    public final long v() {
        x0();
        if (!c()) {
            return M();
        }
        j1 j1Var = this.f5650g0;
        return j1Var.k.equals(j1Var.f9715b) ? je.e0.U(this.f5650g0.f9727p) : getDuration();
    }

    public final void v0(final j1 j1Var, final int i7, final int i10, boolean z5, int i11, long j, int i12, boolean z6) {
        Pair pair;
        int i13;
        MediaItem mediaItem;
        int i14;
        Object obj;
        MediaItem mediaItem2;
        Object obj2;
        int i15;
        long j5;
        long j7;
        long jI0;
        long jI1;
        Object obj3;
        MediaItem mediaItem3;
        Object obj4;
        int i16;
        j1 j1Var2 = this.f5650g0;
        this.f5650g0 = j1Var;
        boolean zEquals = j1Var2.f9714a.equals(j1Var.f9714a);
        v1 v1Var = this.f5591a;
        u1 u1Var = this.f5656n;
        Timeline timeline = j1Var2.f9714a;
        md.s sVar = j1Var2.f9715b;
        Timeline timeline2 = j1Var.f9714a;
        md.s sVar2 = j1Var.f9715b;
        if (timeline2.p() && timeline.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (timeline2.p() != timeline.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!timeline.m(timeline.g(sVar.f15689a, u1Var).f9888i, v1Var, 0L).f9909d.equals(timeline2.m(timeline2.g(sVar2.f15689a, u1Var).f9888i, v1Var, 0L).f9909d)) {
            if (z5 && i11 == 0) {
                i13 = 1;
            } else if (z5 && i11 == 1) {
                i13 = 2;
            } else {
                if (zEquals) {
                    throw new IllegalStateException();
                }
                i13 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
        } else if (z5 && i11 == 0 && sVar.f15692d < sVar2.f15692d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = (z5 && i11 == 1 && z6) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        MediaMetadata mediaMetadataC0 = this.M;
        if (zBooleanValue) {
            mediaItem = j1Var.f9714a.p() ? null : j1Var.f9714a.m(j1Var.f9714a.g(j1Var.f9715b.f15689a, this.f5656n).f9888i, this.f5591a, 0L).f9911i;
            this.f5648f0 = MediaMetadata.f5540f0;
        } else {
            mediaItem = null;
        }
        if (zBooleanValue || !j1Var2.j.equals(j1Var.j)) {
            u0 u0VarA = this.f5648f0.a();
            List list = j1Var.j;
            for (int i17 = 0; i17 < list.size(); i17++) {
                Metadata metadata = (Metadata) list.get(i17);
                int i18 = 0;
                while (true) {
                    cd.b[] bVarArr = metadata.f5693d;
                    if (i18 < bVarArr.length) {
                        bVarArr[i18].b(u0VarA);
                        i18++;
                    }
                }
            }
            this.f5648f0 = new MediaMetadata(u0VarA);
            mediaMetadataC0 = c0();
        }
        boolean zEquals2 = mediaMetadataC0.equals(this.M);
        this.M = mediaMetadataC0;
        boolean z7 = j1Var2.f9723l != j1Var.f9723l;
        boolean z10 = j1Var2.f9718e != j1Var.f9718e;
        if (z10 || z7) {
            w0();
        }
        boolean z11 = j1Var2.f9720g != j1Var.f9720g;
        if (!zEquals) {
            final int i19 = 0;
            this.f5654l.c(0, new je.j() { // from class: gc.n
                @Override // je.j
                public final void invoke(Object obj5) {
                    com.google.android.exoplayer2.e eVar = (com.google.android.exoplayer2.e) obj5;
                    switch (i19) {
                        case 0:
                            eVar.onTimelineChanged(j1Var.f9714a, i7);
                            break;
                        default:
                            eVar.onPlayWhenReadyChanged(j1Var.f9723l, i7);
                            break;
                    }
                }
            });
        }
        if (z5) {
            u1 u1Var2 = new u1();
            if (j1Var2.f9714a.p()) {
                i14 = i12;
                obj = null;
                mediaItem2 = null;
                obj2 = null;
                i15 = -1;
            } else {
                Object obj5 = j1Var2.f9715b.f15689a;
                j1Var2.f9714a.g(obj5, u1Var2);
                int i20 = u1Var2.f9888i;
                int iB = j1Var2.f9714a.b(obj5);
                obj = j1Var2.f9714a.m(i20, this.f5591a, 0L).f9909d;
                mediaItem2 = this.f5591a.f9911i;
                obj2 = obj5;
                i14 = i20;
                i15 = iB;
            }
            if (i11 == 0) {
                if (j1Var2.f9715b.a()) {
                    md.s sVar3 = j1Var2.f9715b;
                    jI0 = u1Var2.a(sVar3.f15690b, sVar3.f15691c);
                    jI1 = i0(j1Var2);
                } else {
                    if (j1Var2.f9715b.f15693e != -1) {
                        jI0 = i0(this.f5650g0);
                    } else {
                        j5 = u1Var2.f9890w;
                        j7 = u1Var2.f9889v;
                        jI0 = j5 + j7;
                    }
                    jI1 = jI0;
                }
            } else if (j1Var2.f9715b.a()) {
                jI0 = j1Var2.f9729r;
                jI1 = i0(j1Var2);
            } else {
                j5 = u1Var2.f9890w;
                j7 = j1Var2.f9729r;
                jI0 = j5 + j7;
                jI1 = jI0;
            }
            long jU = je.e0.U(jI0);
            long jU2 = je.e0.U(jI1);
            md.s sVar4 = j1Var2.f9715b;
            Player.PositionInfo positionInfo = new Player.PositionInfo(obj, i14, mediaItem2, obj2, i15, jU, jU2, sVar4.f15690b, sVar4.f15691c);
            v1 v1Var2 = this.f5591a;
            int iD = D();
            if (this.f5650g0.f9714a.p()) {
                obj3 = null;
                mediaItem3 = null;
                obj4 = null;
                i16 = -1;
            } else {
                j1 j1Var3 = this.f5650g0;
                Object obj6 = j1Var3.f9715b.f15689a;
                j1Var3.f9714a.g(obj6, this.f5656n);
                int iB2 = this.f5650g0.f9714a.b(obj6);
                Object obj7 = this.f5650g0.f9714a.m(iD, v1Var2, 0L).f9909d;
                mediaItem3 = v1Var2.f9911i;
                i16 = iB2;
                obj4 = obj6;
                obj3 = obj7;
            }
            long jU3 = je.e0.U(j);
            long jU4 = this.f5650g0.f9715b.a() ? je.e0.U(i0(this.f5650g0)) : jU3;
            md.s sVar5 = this.f5650g0.f9715b;
            this.f5654l.c(11, new bc.f(positionInfo, new Player.PositionInfo(obj3, iD, mediaItem3, obj4, i16, jU3, jU4, sVar5.f15690b, sVar5.f15691c), i11));
        } else {
            zBooleanValue = zBooleanValue;
            z7 = z7;
            zEquals2 = zEquals2;
        }
        if (zBooleanValue) {
            this.f5654l.c(1, new gc.u(iIntValue, mediaItem));
        }
        if (j1Var2.f9719f != j1Var.f9719f) {
            final int i21 = 6;
            this.f5654l.c(10, new je.j() { // from class: gc.p
                @Override // je.j
                public final void invoke(Object obj8) {
                    com.google.android.exoplayer2.e eVar = (com.google.android.exoplayer2.e) obj8;
                    switch (i21) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            eVar.onLoadingChanged(j1Var4.f9720g);
                            eVar.onIsLoadingChanged(j1Var4.f9720g);
                            break;
                        case 1:
                            j1 j1Var5 = j1Var;
                            eVar.onPlayerStateChanged(j1Var5.f9723l, j1Var5.f9718e);
                            break;
                        case 2:
                            eVar.onPlaybackStateChanged(j1Var.f9718e);
                            break;
                        case 3:
                            eVar.onPlaybackSuppressionReasonChanged(j1Var.f9724m);
                            break;
                        case 4:
                            eVar.onIsPlayingChanged(j1Var.k());
                            break;
                        case 5:
                            eVar.onPlaybackParametersChanged(j1Var.f9725n);
                            break;
                        case 6:
                            eVar.onPlayerErrorChanged(j1Var.f9719f);
                            break;
                        case 7:
                            eVar.onPlayerError(j1Var.f9719f);
                            break;
                        default:
                            eVar.onTracksChanged(j1Var.f9722i.f9148d);
                            break;
                    }
                }
            });
            if (j1Var.f9719f != null) {
                final int i22 = 7;
                this.f5654l.c(10, new je.j() { // from class: gc.p
                    @Override // je.j
                    public final void invoke(Object obj8) {
                        com.google.android.exoplayer2.e eVar = (com.google.android.exoplayer2.e) obj8;
                        switch (i22) {
                            case 0:
                                j1 j1Var4 = j1Var;
                                eVar.onLoadingChanged(j1Var4.f9720g);
                                eVar.onIsLoadingChanged(j1Var4.f9720g);
                                break;
                            case 1:
                                j1 j1Var5 = j1Var;
                                eVar.onPlayerStateChanged(j1Var5.f9723l, j1Var5.f9718e);
                                break;
                            case 2:
                                eVar.onPlaybackStateChanged(j1Var.f9718e);
                                break;
                            case 3:
                                eVar.onPlaybackSuppressionReasonChanged(j1Var.f9724m);
                                break;
                            case 4:
                                eVar.onIsPlayingChanged(j1Var.k());
                                break;
                            case 5:
                                eVar.onPlaybackParametersChanged(j1Var.f9725n);
                                break;
                            case 6:
                                eVar.onPlayerErrorChanged(j1Var.f9719f);
                                break;
                            case 7:
                                eVar.onPlayerError(j1Var.f9719f);
                                break;
                            default:
                                eVar.onTracksChanged(j1Var.f9722i.f9148d);
                                break;
                        }
                    }
                });
            }
        }
        u uVar = j1Var2.f9722i;
        u uVar2 = j1Var.f9722i;
        if (uVar != uVar2) {
            r rVar = this.f5651h;
            Object obj8 = uVar2.f9149e;
            rVar.getClass();
            rVar.f9116c = (MappingTrackSelector$MappedTrackInfo) obj8;
            final int i23 = 8;
            this.f5654l.c(2, new je.j() { // from class: gc.p
                @Override // je.j
                public final void invoke(Object obj9) {
                    com.google.android.exoplayer2.e eVar = (com.google.android.exoplayer2.e) obj9;
                    switch (i23) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            eVar.onLoadingChanged(j1Var4.f9720g);
                            eVar.onIsLoadingChanged(j1Var4.f9720g);
                            break;
                        case 1:
                            j1 j1Var5 = j1Var;
                            eVar.onPlayerStateChanged(j1Var5.f9723l, j1Var5.f9718e);
                            break;
                        case 2:
                            eVar.onPlaybackStateChanged(j1Var.f9718e);
                            break;
                        case 3:
                            eVar.onPlaybackSuppressionReasonChanged(j1Var.f9724m);
                            break;
                        case 4:
                            eVar.onIsPlayingChanged(j1Var.k());
                            break;
                        case 5:
                            eVar.onPlaybackParametersChanged(j1Var.f9725n);
                            break;
                        case 6:
                            eVar.onPlayerErrorChanged(j1Var.f9719f);
                            break;
                        case 7:
                            eVar.onPlayerError(j1Var.f9719f);
                            break;
                        default:
                            eVar.onTracksChanged(j1Var.f9722i.f9148d);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.f5654l.c(14, new o(0, this.M));
        }
        if (z11) {
            final int i24 = 0;
            this.f5654l.c(3, new je.j() { // from class: gc.p
                @Override // je.j
                public final void invoke(Object obj9) {
                    com.google.android.exoplayer2.e eVar = (com.google.android.exoplayer2.e) obj9;
                    switch (i24) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            eVar.onLoadingChanged(j1Var4.f9720g);
                            eVar.onIsLoadingChanged(j1Var4.f9720g);
                            break;
                        case 1:
                            j1 j1Var5 = j1Var;
                            eVar.onPlayerStateChanged(j1Var5.f9723l, j1Var5.f9718e);
                            break;
                        case 2:
                            eVar.onPlaybackStateChanged(j1Var.f9718e);
                            break;
                        case 3:
                            eVar.onPlaybackSuppressionReasonChanged(j1Var.f9724m);
                            break;
                        case 4:
                            eVar.onIsPlayingChanged(j1Var.k());
                            break;
                        case 5:
                            eVar.onPlaybackParametersChanged(j1Var.f9725n);
                            break;
                        case 6:
                            eVar.onPlayerErrorChanged(j1Var.f9719f);
                            break;
                        case 7:
                            eVar.onPlayerError(j1Var.f9719f);
                            break;
                        default:
                            eVar.onTracksChanged(j1Var.f9722i.f9148d);
                            break;
                    }
                }
            });
        }
        if (z10 || z7) {
            final int i25 = 1;
            this.f5654l.c(-1, new je.j() { // from class: gc.p
                @Override // je.j
                public final void invoke(Object obj9) {
                    com.google.android.exoplayer2.e eVar = (com.google.android.exoplayer2.e) obj9;
                    switch (i25) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            eVar.onLoadingChanged(j1Var4.f9720g);
                            eVar.onIsLoadingChanged(j1Var4.f9720g);
                            break;
                        case 1:
                            j1 j1Var5 = j1Var;
                            eVar.onPlayerStateChanged(j1Var5.f9723l, j1Var5.f9718e);
                            break;
                        case 2:
                            eVar.onPlaybackStateChanged(j1Var.f9718e);
                            break;
                        case 3:
                            eVar.onPlaybackSuppressionReasonChanged(j1Var.f9724m);
                            break;
                        case 4:
                            eVar.onIsPlayingChanged(j1Var.k());
                            break;
                        case 5:
                            eVar.onPlaybackParametersChanged(j1Var.f9725n);
                            break;
                        case 6:
                            eVar.onPlayerErrorChanged(j1Var.f9719f);
                            break;
                        case 7:
                            eVar.onPlayerError(j1Var.f9719f);
                            break;
                        default:
                            eVar.onTracksChanged(j1Var.f9722i.f9148d);
                            break;
                    }
                }
            });
        }
        if (z10) {
            final int i26 = 2;
            this.f5654l.c(4, new je.j() { // from class: gc.p
                @Override // je.j
                public final void invoke(Object obj9) {
                    com.google.android.exoplayer2.e eVar = (com.google.android.exoplayer2.e) obj9;
                    switch (i26) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            eVar.onLoadingChanged(j1Var4.f9720g);
                            eVar.onIsLoadingChanged(j1Var4.f9720g);
                            break;
                        case 1:
                            j1 j1Var5 = j1Var;
                            eVar.onPlayerStateChanged(j1Var5.f9723l, j1Var5.f9718e);
                            break;
                        case 2:
                            eVar.onPlaybackStateChanged(j1Var.f9718e);
                            break;
                        case 3:
                            eVar.onPlaybackSuppressionReasonChanged(j1Var.f9724m);
                            break;
                        case 4:
                            eVar.onIsPlayingChanged(j1Var.k());
                            break;
                        case 5:
                            eVar.onPlaybackParametersChanged(j1Var.f9725n);
                            break;
                        case 6:
                            eVar.onPlayerErrorChanged(j1Var.f9719f);
                            break;
                        case 7:
                            eVar.onPlayerError(j1Var.f9719f);
                            break;
                        default:
                            eVar.onTracksChanged(j1Var.f9722i.f9148d);
                            break;
                    }
                }
            });
        }
        if (z7) {
            final int i27 = 1;
            this.f5654l.c(5, new je.j() { // from class: gc.n
                @Override // je.j
                public final void invoke(Object obj9) {
                    com.google.android.exoplayer2.e eVar = (com.google.android.exoplayer2.e) obj9;
                    switch (i27) {
                        case 0:
                            eVar.onTimelineChanged(j1Var.f9714a, i10);
                            break;
                        default:
                            eVar.onPlayWhenReadyChanged(j1Var.f9723l, i10);
                            break;
                    }
                }
            });
        }
        if (j1Var2.f9724m != j1Var.f9724m) {
            final int i28 = 3;
            this.f5654l.c(6, new je.j() { // from class: gc.p
                @Override // je.j
                public final void invoke(Object obj9) {
                    com.google.android.exoplayer2.e eVar = (com.google.android.exoplayer2.e) obj9;
                    switch (i28) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            eVar.onLoadingChanged(j1Var4.f9720g);
                            eVar.onIsLoadingChanged(j1Var4.f9720g);
                            break;
                        case 1:
                            j1 j1Var5 = j1Var;
                            eVar.onPlayerStateChanged(j1Var5.f9723l, j1Var5.f9718e);
                            break;
                        case 2:
                            eVar.onPlaybackStateChanged(j1Var.f9718e);
                            break;
                        case 3:
                            eVar.onPlaybackSuppressionReasonChanged(j1Var.f9724m);
                            break;
                        case 4:
                            eVar.onIsPlayingChanged(j1Var.k());
                            break;
                        case 5:
                            eVar.onPlaybackParametersChanged(j1Var.f9725n);
                            break;
                        case 6:
                            eVar.onPlayerErrorChanged(j1Var.f9719f);
                            break;
                        case 7:
                            eVar.onPlayerError(j1Var.f9719f);
                            break;
                        default:
                            eVar.onTracksChanged(j1Var.f9722i.f9148d);
                            break;
                    }
                }
            });
        }
        if (j1Var2.k() != j1Var.k()) {
            final int i29 = 4;
            this.f5654l.c(7, new je.j() { // from class: gc.p
                @Override // je.j
                public final void invoke(Object obj9) {
                    com.google.android.exoplayer2.e eVar = (com.google.android.exoplayer2.e) obj9;
                    switch (i29) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            eVar.onLoadingChanged(j1Var4.f9720g);
                            eVar.onIsLoadingChanged(j1Var4.f9720g);
                            break;
                        case 1:
                            j1 j1Var5 = j1Var;
                            eVar.onPlayerStateChanged(j1Var5.f9723l, j1Var5.f9718e);
                            break;
                        case 2:
                            eVar.onPlaybackStateChanged(j1Var.f9718e);
                            break;
                        case 3:
                            eVar.onPlaybackSuppressionReasonChanged(j1Var.f9724m);
                            break;
                        case 4:
                            eVar.onIsPlayingChanged(j1Var.k());
                            break;
                        case 5:
                            eVar.onPlaybackParametersChanged(j1Var.f9725n);
                            break;
                        case 6:
                            eVar.onPlayerErrorChanged(j1Var.f9719f);
                            break;
                        case 7:
                            eVar.onPlayerError(j1Var.f9719f);
                            break;
                        default:
                            eVar.onTracksChanged(j1Var.f9722i.f9148d);
                            break;
                    }
                }
            });
        }
        if (!j1Var2.f9725n.equals(j1Var.f9725n)) {
            final int i30 = 5;
            this.f5654l.c(12, new je.j() { // from class: gc.p
                @Override // je.j
                public final void invoke(Object obj9) {
                    com.google.android.exoplayer2.e eVar = (com.google.android.exoplayer2.e) obj9;
                    switch (i30) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            eVar.onLoadingChanged(j1Var4.f9720g);
                            eVar.onIsLoadingChanged(j1Var4.f9720g);
                            break;
                        case 1:
                            j1 j1Var5 = j1Var;
                            eVar.onPlayerStateChanged(j1Var5.f9723l, j1Var5.f9718e);
                            break;
                        case 2:
                            eVar.onPlaybackStateChanged(j1Var.f9718e);
                            break;
                        case 3:
                            eVar.onPlaybackSuppressionReasonChanged(j1Var.f9724m);
                            break;
                        case 4:
                            eVar.onIsPlayingChanged(j1Var.k());
                            break;
                        case 5:
                            eVar.onPlaybackParametersChanged(j1Var.f9725n);
                            break;
                        case 6:
                            eVar.onPlayerErrorChanged(j1Var.f9719f);
                            break;
                        case 7:
                            eVar.onPlayerError(j1Var.f9719f);
                            break;
                        default:
                            eVar.onTracksChanged(j1Var.f9722i.f9148d);
                            break;
                    }
                }
            });
        }
        t0();
        this.f5654l.b();
        if (j1Var2.f9726o != j1Var.f9726o) {
            Iterator it = this.f5655m.iterator();
            while (it.hasNext()) {
                ((w) it.next()).f9916d.w0();
            }
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final int w() {
        x0();
        return this.f5650g0.f9718e;
    }

    public final void w0() {
        int iW = w();
        f fVar = this.B;
        k8.a aVar = this.A;
        if (iW != 1) {
            if (iW == 2 || iW == 3) {
                x0();
                boolean z5 = this.f5650g0.f9726o;
                g();
                aVar.getClass();
                g();
                fVar.getClass();
                return;
            }
            if (iW != 4) {
                throw new IllegalStateException();
            }
        }
        aVar.getClass();
        fVar.getClass();
    }

    @Override // com.google.android.exoplayer2.Player
    public final Tracks x() {
        x0();
        return this.f5650g0.f9722i.f9148d;
    }

    public final void x0() {
        this.f5643d.j();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f5660r;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i7 = je.e0.f13788a;
            Locale locale = Locale.US;
            String strF = s0.g.f("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f5642c0) {
                throw new IllegalStateException(strF);
            }
            je.b.O("ExoPlayerImpl", strF, this.f5644d0 ? null : new IllegalStateException());
            this.f5644d0 = true;
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final CueGroup z() {
        x0();
        return this.f5640b0;
    }
}
