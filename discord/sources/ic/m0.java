package ic;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import gc.p1;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends bd.s implements je.n {

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final Context f11566c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final e4.l f11567d1;
    public final j0 e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f11568f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f11569g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public Format f11570h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public Format f11571i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public long f11572j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f11573k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f11574l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f11575m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public gc.z f11576n1;

    public m0(Context context, bd.k kVar, boolean z5, Handler handler, gc.w wVar, j0 j0Var) {
        super(1, kVar, z5, 44100.0f);
        this.f11566c1 = context.getApplicationContext();
        this.e1 = j0Var;
        this.f11567d1 = new e4.l(8, handler, wVar);
        j0Var.f11547r = new ga.l(14, this);
    }

    public static ei.r0 s0(bd.t tVar, Format format, boolean z5, j0 j0Var) {
        Iterable iterableE;
        if (format.I == null) {
            ei.c0 c0Var = ei.e0.f8303e;
            return ei.r0.f8352w;
        }
        if (j0Var.g(format) != 0) {
            List listE = bd.z.e("audio/raw", false, false);
            bd.o oVar = listE.isEmpty() ? null : (bd.o) listE.get(0);
            if (oVar != null) {
                return ei.e0.r(oVar);
            }
        }
        Pattern pattern = bd.z.f3221a;
        String str = format.I;
        tVar.getClass();
        List listE2 = bd.z.e(str, z5, false);
        String strB = bd.z.b(format);
        if (strB == null) {
            ei.c0 c0Var2 = ei.e0.f8303e;
            iterableE = ei.r0.f8352w;
        } else {
            iterableE = bd.z.e(strB, z5, false);
        }
        ei.c0 c0Var3 = ei.e0.f8303e;
        ei.b0 b0Var = new ei.b0();
        b0Var.c(listE2);
        b0Var.c(iterableE);
        return b0Var.f();
    }

    @Override // bd.s
    public final DecoderReuseEvaluation B(bd.o oVar, Format format, Format format2) {
        DecoderReuseEvaluation decoderReuseEvaluationB = oVar.b(format, format2);
        int i7 = decoderReuseEvaluationB.f5684e;
        if (this.a0 == null && m0(format2)) {
            i7 |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
        }
        if (r0(oVar, format2) > this.f11568f1) {
            i7 |= 64;
        }
        int i10 = i7;
        return new DecoderReuseEvaluation(oVar.f3172a, format, format2, i10 != 0 ? 0 : decoderReuseEvaluationB.f5683d, i10);
    }

    @Override // bd.s
    public final float L(float f2, Format[] formatArr) {
        int iMax = -1;
        for (Format format : formatArr) {
            int i7 = format.W;
            if (i7 != -1) {
                iMax = Math.max(iMax, i7);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f2;
    }

    @Override // bd.s
    public final ArrayList M(bd.t tVar, Format format, boolean z5) {
        ei.r0 r0VarS0 = s0(tVar, format, z5, this.e1);
        Pattern pattern = bd.z.f3221a;
        ArrayList arrayList = new ArrayList(r0VarS0);
        Collections.sort(arrayList, new bd.u(0, new app.rive.runtime.kotlin.core.a(5, format)));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    @Override // bd.s
    public final bd.j N(bd.o oVar, Format format, MediaCrypto mediaCrypto, float f2) {
        boolean z5;
        Format[] formatArr = this.F;
        formatArr.getClass();
        int iR0 = r0(oVar, format);
        if (formatArr.length != 1) {
            for (Format format2 : formatArr) {
                if (oVar.b(format, format2).f5683d != 0) {
                    iR0 = Math.max(iR0, r0(oVar, format2));
                }
            }
        }
        this.f11568f1 = iR0;
        String str = oVar.f3172a;
        int i7 = je.e0.f13788a;
        if (i7 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(je.e0.f13790c)) {
            String str2 = je.e0.f13789b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        this.f11569g1 = z5;
        String str3 = oVar.f3174c;
        int i10 = this.f11568f1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        int i11 = format.V;
        String str4 = format.I;
        mediaFormat.setInteger("channel-count", i11);
        int i12 = format.W;
        mediaFormat.setInteger("sample-rate", i12);
        je.b.L(mediaFormat, format.K);
        je.b.D(mediaFormat, "max-input-size", i10);
        if (i7 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f) {
                if (i7 == 23) {
                    String str5 = je.e0.f13791d;
                    if (!"ZTE B2017G".equals(str5) && !"AXON 7 mini".equals(str5)) {
                        mediaFormat.setFloat("operating-rate", f2);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f2);
                }
            }
        }
        if (i7 <= 28 && "audio/ac4".equals(str4)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i7 >= 24) {
            int i13 = format.V;
            gc.g0 g0Var = new gc.g0();
            g0Var.k = "audio/raw";
            g0Var.f9656x = i13;
            g0Var.f9657y = i12;
            g0Var.f9658z = 4;
            if (this.e1.g(new Format(g0Var)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i7 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.f11571i1 = (!"audio/raw".equals(oVar.f3173b) || "audio/raw".equals(str4)) ? null : format;
        return new bd.j(oVar, mediaFormat, format, null, mediaCrypto);
    }

    @Override // bd.s
    public final void S(Exception exc) {
        je.b.s("MediaCodecAudioRenderer", "Audio codec error", exc);
        e4.l lVar = this.f11567d1;
        Handler handler = (Handler) lVar.f7989e;
        if (handler != null) {
            handler.post(new p(lVar, exc, 0));
        }
    }

    @Override // bd.s
    public final void T(long j, long j5, String str) {
        e4.l lVar = this.f11567d1;
        Handler handler = (Handler) lVar.f7989e;
        if (handler != null) {
            handler.post(new o(lVar, str, j, j5, 0));
        }
    }

    @Override // bd.s
    public final void U(String str) {
        e4.l lVar = this.f11567d1;
        Handler handler = (Handler) lVar.f7989e;
        if (handler != null) {
            handler.post(new com.mkuczera.haptic.a(10, lVar, str));
        }
    }

    @Override // bd.s
    public final DecoderReuseEvaluation V(e4.r rVar) throws com.google.android.exoplayer2.b {
        Format format = (Format) rVar.f8035i;
        format.getClass();
        this.f11570h1 = format;
        DecoderReuseEvaluation decoderReuseEvaluationV = super.V(rVar);
        Format format2 = this.f11570h1;
        e4.l lVar = this.f11567d1;
        Handler handler = (Handler) lVar.f7989e;
        if (handler != null) {
            handler.post(new ac.a(lVar, format2, decoderReuseEvaluationV, 18));
        }
        return decoderReuseEvaluationV;
    }

    @Override // bd.s
    public final void W(Format format, MediaFormat mediaFormat) throws com.google.android.exoplayer2.b {
        int iW;
        Format format2 = this.f11571i1;
        int[] iArr = null;
        if (format2 != null) {
            format = format2;
        } else if (this.f3195g0 != null) {
            String str = format.I;
            int i7 = format.V;
            if ("audio/raw".equals(str)) {
                iW = format.X;
            } else if (je.e0.f13788a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iW = mediaFormat.containsKey("v-bits-per-sample") ? je.e0.w(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iW = mediaFormat.getInteger("pcm-encoding");
            }
            gc.g0 g0Var = new gc.g0();
            g0Var.k = "audio/raw";
            g0Var.f9658z = iW;
            g0Var.A = format.Y;
            g0Var.B = format.Z;
            g0Var.f9656x = mediaFormat.getInteger("channel-count");
            g0Var.f9657y = mediaFormat.getInteger("sample-rate");
            format = new Format(g0Var);
            if (this.f11569g1 && format.V == 6 && i7 < 6) {
                iArr = new int[i7];
                for (int i10 = 0; i10 < i7; i10++) {
                    iArr[i10] = i10;
                }
            }
        }
        try {
            this.e1.b(format, iArr);
        } catch (r e10) {
            throw f(e10, e10.f11631d, false, 5001);
        }
    }

    @Override // bd.s
    public final void X() {
        this.e1.getClass();
    }

    @Override // bd.s
    public final void Z() {
        this.e1.K = true;
    }

    @Override // je.n
    public final long a() {
        if (this.f9607y == 2) {
            t0();
        }
        return this.f11572j1;
    }

    @Override // bd.s
    public final void a0(lc.f fVar) {
        if (!this.f11573k1 || fVar.c(Integer.MIN_VALUE)) {
            return;
        }
        if (Math.abs(fVar.f15012x - this.f11572j1) > 500000) {
            this.f11572j1 = fVar.f15012x;
        }
        this.f11573k1 = false;
    }

    @Override // je.n
    public final PlaybackParameters b() {
        return this.e1.B;
    }

    @Override // gc.e, gc.k1
    public final void c(int i7, Object obj) {
        j0 j0Var = this.e1;
        if (i7 == 2) {
            float fFloatValue = ((Float) obj).floatValue();
            if (j0Var.N != fFloatValue) {
                j0Var.N = fFloatValue;
                if (j0Var.m()) {
                    if (je.e0.f13788a >= 21) {
                        j0Var.f11551v.setVolume(j0Var.N);
                        return;
                    }
                    AudioTrack audioTrack = j0Var.f11551v;
                    float f2 = j0Var.N;
                    audioTrack.setStereoVolume(f2, f2);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 3) {
            AudioAttributes audioAttributes = (AudioAttributes) obj;
            if (j0Var.f11554y.equals(audioAttributes)) {
                return;
            }
            j0Var.f11554y = audioAttributes;
            if (j0Var.a0) {
                return;
            }
            j0Var.d();
            return;
        }
        if (i7 == 6) {
            y yVar = (y) obj;
            if (j0Var.Y.equals(yVar)) {
                return;
            }
            yVar.getClass();
            if (j0Var.f11551v != null) {
                j0Var.Y.getClass();
            }
            j0Var.Y = yVar;
            return;
        }
        switch (i7) {
            case 9:
                j0Var.C = ((Boolean) obj).booleanValue();
                f0 f0Var = new f0(j0Var.s() ? PlaybackParameters.f5573v : j0Var.B, -9223372036854775807L, -9223372036854775807L);
                if (!j0Var.m()) {
                    j0Var.A = f0Var;
                } else {
                    j0Var.f11555z = f0Var;
                }
                break;
            case 10:
                int iIntValue = ((Integer) obj).intValue();
                if (j0Var.X != iIntValue) {
                    j0Var.X = iIntValue;
                    j0Var.W = iIntValue != 0;
                    j0Var.d();
                }
                break;
            case 11:
                this.f11576n1 = (gc.z) obj;
                break;
            case 12:
                if (je.e0.f13788a >= 23) {
                    l0.a(j0Var, obj);
                }
                break;
        }
    }

    @Override // je.n
    public final void d(PlaybackParameters playbackParameters) {
        j0 j0Var = this.e1;
        j0Var.getClass();
        j0Var.B = new PlaybackParameters(je.e0.h(playbackParameters.f5574d, 0.1f, 8.0f), je.e0.h(playbackParameters.f5575e, 0.1f, 8.0f));
        if (j0Var.s()) {
            j0Var.r();
            return;
        }
        f0 f0Var = new f0(playbackParameters, -9223372036854775807L, -9223372036854775807L);
        if (j0Var.m()) {
            j0Var.f11555z = f0Var;
        } else {
            j0Var.A = f0Var;
        }
    }

    @Override // bd.s
    public final boolean d0(long j, long j5, bd.l lVar, ByteBuffer byteBuffer, int i7, int i10, int i11, long j7, boolean z5, boolean z6, Format format) throws com.google.android.exoplayer2.b {
        byteBuffer.getClass();
        if (this.f11571i1 != null && (i10 & 2) != 0) {
            lVar.getClass();
            lVar.releaseOutputBuffer(i7, false);
            return true;
        }
        j0 j0Var = this.e1;
        if (z5) {
            if (lVar != null) {
                lVar.releaseOutputBuffer(i7, false);
            }
            this.X0.f5675f += i11;
            j0Var.K = true;
            return true;
        }
        try {
            if (!j0Var.j(byteBuffer, j7, i11)) {
                return false;
            }
            if (lVar != null) {
                lVar.releaseOutputBuffer(i7, false);
            }
            this.X0.f5674e += i11;
            return true;
        } catch (s e10) {
            throw f(e10, this.f11570h1, e10.f11646e, 5001);
        } catch (t e11) {
            throw f(e11, format, e11.f11649e, 5002);
        }
    }

    @Override // bd.s
    public final void g0() throws com.google.android.exoplayer2.b {
        try {
            j0 j0Var = this.e1;
            if (!j0Var.T && j0Var.m() && j0Var.c()) {
                j0Var.o();
                j0Var.T = true;
            }
        } catch (t e10) {
            throw f(e10, e10.f11650i, e10.f11649e, 5002);
        }
    }

    @Override // gc.e
    public final String h() {
        return "MediaCodecAudioRenderer";
    }

    @Override // gc.e
    public final boolean j() {
        if (!this.T0) {
            return false;
        }
        j0 j0Var = this.e1;
        if (j0Var.m()) {
            return j0Var.T && !j0Var.k();
        }
        return true;
    }

    @Override // bd.s, gc.e
    public final boolean k() {
        return this.e1.k() || super.k();
    }

    @Override // bd.s, gc.e
    public final void l() {
        e4.l lVar = this.f11567d1;
        this.f11575m1 = true;
        this.f11570h1 = null;
        try {
            this.e1.d();
            try {
                super.l();
            } finally {
                lVar.k(this.X0);
            }
        } catch (Throwable th2) {
            try {
                super.l();
                throw th2;
            } finally {
                lVar.k(this.X0);
            }
        }
    }

    @Override // gc.e
    public final void m(boolean z5, boolean z6) {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.X0 = decoderCounters;
        e4.l lVar = this.f11567d1;
        Handler handler = (Handler) lVar.f7989e;
        if (handler != null) {
            handler.post(new q(lVar, decoderCounters, 0));
        }
        p1 p1Var = this.f9604v;
        p1Var.getClass();
        boolean z7 = p1Var.f9819a;
        j0 j0Var = this.e1;
        if (z7) {
            j0Var.getClass();
            je.b.k(je.e0.f13788a >= 21);
            je.b.k(j0Var.W);
            if (!j0Var.a0) {
                j0Var.a0 = true;
                j0Var.d();
            }
        } else if (j0Var.a0) {
            j0Var.a0 = false;
            j0Var.d();
        }
        hc.c0 c0Var = this.f9606x;
        c0Var.getClass();
        j0Var.f11546q = c0Var;
    }

    @Override // bd.s
    public final boolean m0(Format format) {
        return this.e1.g(format) != 0;
    }

    @Override // bd.s, gc.e
    public final void n(long j, boolean z5) throws com.google.android.exoplayer2.b {
        super.n(j, z5);
        this.e1.d();
        this.f11572j1 = j;
        this.f11573k1 = true;
        this.f11574l1 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if ((r5.isEmpty() ? null : (bd.o) r5.get(0)) != null) goto L30;
     */
    @Override // bd.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int n0(bd.t r14, com.google.android.exoplayer2.Format r15) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.m0.n0(bd.t, com.google.android.exoplayer2.Format):int");
    }

    @Override // gc.e
    public final void o() {
        h hVar;
        j jVar = this.e1.f11553x;
        if (jVar != null) {
            Context context = (Context) jVar.f11518b;
            if (jVar.f11517a) {
                jVar.f11524h = null;
                if (je.e0.f13788a >= 23 && (hVar = (h) jVar.f11521e) != null) {
                    g.b(context, hVar);
                }
                c4.d dVar = (c4.d) jVar.f11522f;
                if (dVar != null) {
                    context.unregisterReceiver(dVar);
                }
                i iVar = (i) jVar.f11523g;
                if (iVar != null) {
                    iVar.f11511a.unregisterContentObserver(iVar);
                }
                jVar.f11517a = false;
            }
        }
    }

    @Override // gc.e
    public final void p() {
        j0 j0Var = this.e1;
        try {
            try {
                D();
                f0();
                mc.k kVar = this.a0;
                if (kVar != null) {
                    kVar.d(null);
                }
                this.a0 = null;
                if (this.f11575m1) {
                    this.f11575m1 = false;
                    j0Var.q();
                }
            } catch (Throwable th2) {
                mc.k kVar2 = this.a0;
                if (kVar2 != null) {
                    kVar2.d(null);
                }
                this.a0 = null;
                throw th2;
            }
        } catch (Throwable th3) {
            if (this.f11575m1) {
                this.f11575m1 = false;
                j0Var.q();
            }
            throw th3;
        }
    }

    @Override // gc.e
    public final void q() {
        j0 j0Var = this.e1;
        j0Var.V = true;
        if (j0Var.m()) {
            w wVar = j0Var.f11540i.f11672f;
            wVar.getClass();
            wVar.a();
            j0Var.f11551v.play();
        }
    }

    @Override // gc.e
    public final void r() {
        t0();
        j0 j0Var = this.e1;
        j0Var.V = false;
        if (j0Var.m()) {
            x xVar = j0Var.f11540i;
            xVar.d();
            if (xVar.f11689y == -9223372036854775807L) {
                w wVar = xVar.f11672f;
                wVar.getClass();
                wVar.a();
                j0Var.f11551v.pause();
            }
        }
    }

    public final int r0(bd.o oVar, Format format) {
        int i7;
        if (!"OMX.google.raw.decoder".equals(oVar.f3172a) || (i7 = je.e0.f13788a) >= 24 || (i7 == 23 && je.e0.H(this.f11566c1))) {
            return format.J;
        }
        return -1;
    }

    public final void t0() {
        long j;
        long jMax;
        long jU;
        long jP;
        boolean zJ = j();
        j0 j0Var = this.e1;
        e4.m mVar = j0Var.f11528b;
        if (!j0Var.m() || j0Var.L) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(j0Var.f11540i.a(zJ), je.e0.O(j0Var.f11549t.f11495e, j0Var.i()));
            ArrayDeque arrayDeque = j0Var.j;
            while (!arrayDeque.isEmpty() && jMin >= ((f0) arrayDeque.getFirst()).f11507c) {
                j0Var.A = (f0) arrayDeque.remove();
            }
            f0 f0Var = j0Var.A;
            long j5 = jMin - f0Var.f11507c;
            if (f0Var.f11505a.equals(PlaybackParameters.f5573v)) {
                jU = j0Var.A.f11506b + j5;
                j = Long.MIN_VALUE;
            } else if (arrayDeque.isEmpty()) {
                r0 r0Var = (r0) mVar.f7995v;
                if (r0Var.f11643o >= 1024) {
                    long j7 = r0Var.f11642n;
                    q0 q0Var = r0Var.j;
                    q0Var.getClass();
                    long j10 = j7 - ((long) ((q0Var.k * q0Var.f11612b) * 2));
                    int i7 = r0Var.f11638h.f11562a;
                    int i10 = r0Var.f11637g.f11562a;
                    if (i7 == i10) {
                        jP = je.e0.P(j5, j10, r0Var.f11643o);
                        j = Long.MIN_VALUE;
                    } else {
                        j = Long.MIN_VALUE;
                        jP = je.e0.P(j5, j10 * ((long) i7), r0Var.f11643o * ((long) i10));
                    }
                } else {
                    j = Long.MIN_VALUE;
                    jP = (long) (((double) r0Var.f11633c) * j5);
                }
                jU = jP + j0Var.A.f11506b;
            } else {
                j = Long.MIN_VALUE;
                f0 f0Var2 = (f0) arrayDeque.getFirst();
                jU = f0Var2.f11506b - je.e0.u(f0Var2.f11507c - jMin, j0Var.A.f11505a.f5574d);
            }
            jMax = je.e0.O(j0Var.f11549t.f11495e, ((p0) mVar.f7994i).f11607t) + jU;
        }
        if (jMax != j) {
            if (!this.f11574l1) {
                jMax = Math.max(this.f11572j1, jMax);
            }
            this.f11572j1 = jMax;
            this.f11574l1 = false;
        }
    }

    @Override // gc.e
    public final je.n g() {
        return this;
    }
}
