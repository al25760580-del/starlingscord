package ic;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.audio.AudioAttributes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements u {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Object f11525g0 = new Object();
    public static ExecutorService h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static int f11526i0;
    public f0 A;
    public PlaybackParameters B;
    public boolean C;
    public ByteBuffer D;
    public int E;
    public long F;
    public long G;
    public long H;
    public long I;
    public int J;
    public boolean K;
    public boolean L;
    public long M;
    public float N;
    public ByteBuffer O;
    public int P;
    public ByteBuffer Q;
    public byte[] R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public y Y;
    public d0 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11527a;
    public boolean a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4.m f11528b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f11529b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11530c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public long f11531c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f11532d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f11533d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u0 f11534e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f11535e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ei.r0 f11536f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Looper f11537f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ei.r0 f11538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a5.i0 f11539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x f11540i;
    public final ArrayDeque j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11541l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i0 f11542m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.recyclerview.widget.h f11543n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.recyclerview.widget.h f11544o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k0 f11545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public hc.c0 f11546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ga.l f11547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public e0 f11548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e0 f11549t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public k f11550u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AudioTrack f11551v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f f11552w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j f11553x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AudioAttributes f11554y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public f0 f11555z;

    public j0(e4.i iVar) {
        Context context = (Context) iVar.f7980e;
        this.f11527a = context;
        this.f11552w = context != null ? f.a(context) : (f) iVar.f7981i;
        this.f11528b = (e4.m) iVar.f7982v;
        int i7 = je.e0.f13788a;
        this.f11530c = false;
        this.k = false;
        this.f11541l = 0;
        this.f11545p = (k0) iVar.f7983w;
        a5.i0 i0Var = new a5.i0(0);
        this.f11539h = i0Var;
        i0Var.p();
        this.f11540i = new x(new fj.c(17, this));
        a0 a0Var = new a0();
        this.f11532d = a0Var;
        u0 u0Var = new u0();
        u0Var.f11653m = je.e0.f13793f;
        this.f11534e = u0Var;
        t0 t0Var = new t0();
        ei.c0 c0Var = ei.e0.f8303e;
        Object[] objArr = {t0Var, a0Var, u0Var};
        ei.p.b(3, objArr);
        this.f11536f = ei.e0.j(3, objArr);
        this.f11538g = ei.e0.r(new s0());
        this.N = 1.0f;
        this.f11554y = AudioAttributes.f5627y;
        this.X = 0;
        this.Y = new y();
        PlaybackParameters playbackParameters = PlaybackParameters.f5573v;
        this.A = new f0(playbackParameters, 0L, 0L);
        this.B = playbackParameters;
        this.C = false;
        this.j = new ArrayDeque();
        this.f11543n = new androidx.recyclerview.widget.h(1);
        this.f11544o = new androidx.recyclerview.widget.h(1);
    }

    public static AudioFormat f(int i7, int i10, int i11) {
        return new AudioFormat.Builder().setSampleRate(i7).setChannelMask(i10).setEncoding(i11).build();
    }

    public static boolean n(AudioTrack audioTrack) {
        return je.e0.f13788a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    public final void a(long j) {
        PlaybackParameters playbackParameters;
        boolean z5;
        boolean zS = s();
        boolean z6 = this.f11530c;
        e4.m mVar = this.f11528b;
        if (zS) {
            playbackParameters = PlaybackParameters.f5573v;
        } else {
            if (this.a0) {
                playbackParameters = PlaybackParameters.f5573v;
            } else {
                e0 e0Var = this.f11549t;
                if (e0Var.f11493c == 0) {
                    int i7 = e0Var.f11491a.X;
                    if (z6) {
                        int i10 = je.e0.f13788a;
                        if (i7 == 536870912 || i7 == 805306368 || i7 == 4) {
                            playbackParameters = PlaybackParameters.f5573v;
                        }
                    }
                    playbackParameters = this.B;
                    r0 r0Var = (r0) mVar.f7995v;
                    float f2 = playbackParameters.f5574d;
                    if (r0Var.f11633c != f2) {
                        r0Var.f11633c = f2;
                        r0Var.f11639i = true;
                    }
                    float f7 = playbackParameters.f5575e;
                    if (r0Var.f11634d != f7) {
                        r0Var.f11634d = f7;
                        r0Var.f11639i = true;
                    }
                } else {
                    playbackParameters = PlaybackParameters.f5573v;
                }
            }
            this.B = playbackParameters;
        }
        PlaybackParameters playbackParameters2 = playbackParameters;
        if (this.a0) {
            z5 = false;
        } else {
            e0 e0Var2 = this.f11549t;
            if (e0Var2.f11493c == 0) {
                int i11 = e0Var2.f11491a.X;
                if (z6) {
                    int i12 = je.e0.f13788a;
                    if (i11 == 536870912 || i11 == 805306368 || i11 == 4) {
                        z5 = false;
                    }
                }
                z5 = this.C;
                ((p0) mVar.f7994i).f11600m = z5;
            } else {
                z5 = false;
            }
        }
        this.C = z5;
        long jMax = Math.max(0L, j);
        e0 e0Var3 = this.f11549t;
        this.j.add(new f0(playbackParameters2, jMax, je.e0.O(e0Var3.f11495e, i())));
        k kVar = this.f11549t.f11499i;
        this.f11550u = kVar;
        kVar.a();
        ga.l lVar = this.f11547r;
        if (lVar != null) {
            boolean z7 = this.C;
            e4.l lVar2 = ((m0) lVar.f9547e).f11567d1;
            Handler handler = (Handler) lVar2.f7989e;
            if (handler != null) {
                handler.post(new com.facebook.react.devsupport.e(lVar2, z7, 6));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:88:0x01c1  */
    public final void b(Format format, int[] iArr) throws r {
        int iC;
        int i7;
        int i10;
        int i11;
        boolean z5;
        int i12;
        k kVar;
        int i13;
        int i14;
        int iA;
        int[] iArr2;
        String str = format.I;
        int i15 = format.W;
        int i16 = format.V;
        int i17 = format.X;
        boolean zEquals = "audio/raw".equals(str);
        boolean z6 = this.k;
        if (zEquals) {
            je.b.g(je.e0.F(i17));
            int iX = je.e0.x(i17, i16);
            ei.b0 b0Var = new ei.b0();
            if (this.f11530c && (i17 == 536870912 || i17 == 805306368 || i17 == 4)) {
                b0Var.c(this.f11538g);
            } else {
                b0Var.c(this.f11536f);
                n[] nVarArr = (n[]) this.f11528b.f7993e;
                int length = nVarArr.length;
                ei.p.b(length, nVarArr);
                b0Var.e(b0Var.f8391b + length);
                System.arraycopy(nVarArr, 0, b0Var.f8390a, b0Var.f8391b, length);
                b0Var.f8391b += length;
            }
            k kVar2 = new k(b0Var.f());
            if (kVar2.equals(this.f11550u)) {
                kVar2 = this.f11550u;
            }
            int i18 = format.Y;
            int i19 = format.Z;
            u0 u0Var = this.f11534e;
            u0Var.f11651i = i18;
            u0Var.j = i19;
            if (je.e0.f13788a < 21 && i16 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i20 = 0; i20 < 6; i20++) {
                    iArr2[i20] = i20;
                }
            } else {
                iArr2 = iArr;
            }
            this.f11532d.f11488i = iArr2;
            l lVar = new l(i15, i16, i17);
            try {
                ei.e0 e0Var = kVar2.f11556a;
                if (lVar.equals(l.f11561e)) {
                    throw new m(lVar);
                }
                for (int i21 = 0; i21 < e0Var.size(); i21++) {
                    n nVar = (n) e0Var.get(i21);
                    l lVarB = nVar.b(lVar);
                    if (nVar.c()) {
                        je.b.k(!lVarB.equals(l.f11561e));
                        lVar = lVarB;
                    }
                }
                int i22 = lVar.f11563b;
                int i23 = lVar.f11564c;
                int i24 = lVar.f11562a;
                int iO = je.e0.o(i22);
                int iX2 = je.e0.x(i23, i22);
                i7 = iX;
                iC = i23;
                k kVar3 = kVar2;
                i13 = iX2;
                kVar = kVar3;
                i10 = iO;
                z5 = z6;
                i12 = i24;
                i11 = 0;
            } catch (m e10) {
                throw new r(e10, format);
            }
        } else {
            ei.c0 c0Var = ei.e0.f8303e;
            k kVar4 = new k(ei.r0.f8352w);
            if (t(format, this.f11554y)) {
                String str2 = format.I;
                str2.getClass();
                iC = je.o.c(str2, format.F);
                int iO2 = je.e0.o(i16);
                i12 = i15;
                kVar = kVar4;
                i7 = -1;
                i13 = -1;
                i11 = 1;
                i10 = iO2;
                z5 = true;
            } else {
                Pair pairC = e().c(format);
                if (pairC == null) {
                    throw new r("Unable to configure passthrough for: " + format, format);
                }
                int iIntValue = ((Integer) pairC.first).intValue();
                int iIntValue2 = ((Integer) pairC.second).intValue();
                iC = iIntValue;
                i7 = -1;
                i10 = iIntValue2;
                i11 = 2;
                z5 = z6;
                i12 = i15;
                kVar = kVar4;
                i13 = -1;
            }
        }
        if (iC == 0) {
            throw new r("Invalid output encoding (mode=" + i11 + ") for: " + format, format);
        }
        if (i10 == 0) {
            throw new r("Invalid output channel config (mode=" + i11 + ") for: " + format, format);
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i12, i10, iC);
        je.b.k(minBufferSize != -2);
        int i25 = i13 != -1 ? i13 : 1;
        int i26 = format.E;
        double d6 = z5 ? 8.0d : 1.0d;
        this.f11545p.getClass();
        if (i11 == 0) {
            kVar = kVar;
            long j = i12;
            long j5 = ((long) 250000) * j;
            long j7 = i25;
            i14 = je.e0.i(minBufferSize * 4, mo.c0.e((j5 * j7) / 1000000), mo.c0.e(((((long) 750000) * j) * j7) / 1000000));
        } else if (i11 == 1) {
            i14 = mo.c0.e((((long) 50000000) * ((long) k0.a(iC))) / 1000000);
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException();
            }
            int i27 = iC == 5 ? 500000 : 250000;
            if (i26 != -1) {
                RoundingMode roundingMode = RoundingMode.CEILING;
                roundingMode.getClass();
                iA = i26 / 8;
                int i28 = i26 - (8 * iA);
                if (i28 != 0) {
                    int i29 = ((i26 ^ 8) >> 31) | 1;
                    switch (fi.b.f9259a[roundingMode.ordinal()]) {
                        case 1:
                            if (i28 != 0) {
                                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            if (i29 < 0) {
                                iA += i29;
                            }
                            break;
                        case 4:
                            iA += i29;
                            break;
                        case 5:
                            if (i29 > 0) {
                                iA += i29;
                            }
                            break;
                        case 6:
                        case 7:
                        case 8:
                            int iAbs = Math.abs(i28);
                            int iAbs2 = iAbs - (Math.abs(8) - iAbs);
                            if (iAbs2 == 0) {
                                RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                            } else if (iAbs2 > 0) {
                                iA += i29;
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
            } else {
                iA = k0.a(iC);
            }
            i14 = mo.c0.e((((long) i27) * ((long) iA)) / 1000000);
        }
        int iMax = (((Math.max(minBufferSize, (int) (((double) i14) * d6)) + i25) - 1) / i25) * i25;
        this.f11533d0 = false;
        e0 e0Var2 = new e0(format, i7, i11, i13, i12, i10, iC, iMax, kVar, z5);
        if (m()) {
            this.f11548s = e0Var2;
        } else {
            this.f11549t = e0Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049 A[RETURN] */
    public final boolean c() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.f11550u.d()) {
            ByteBuffer byteBuffer2 = this.Q;
            if (byteBuffer2 != null) {
                u(Long.MIN_VALUE, byteBuffer2);
                if (this.Q != null) {
                    return false;
                }
            }
            return true;
        }
        k kVar = this.f11550u;
        if (kVar.d() && !kVar.f11559d) {
            kVar.f11559d = true;
            ((n) kVar.f11557b.get(0)).e();
        }
        p(Long.MIN_VALUE);
        if (!this.f11550u.c() || ((byteBuffer = this.Q) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    public final void d() {
        if (m()) {
            this.F = 0L;
            this.G = 0L;
            this.H = 0L;
            this.I = 0L;
            this.f11535e0 = false;
            this.J = 0;
            this.A = new f0(this.B, 0L, 0L);
            this.M = 0L;
            this.f11555z = null;
            this.j.clear();
            this.O = null;
            this.P = 0;
            this.Q = null;
            this.U = false;
            this.T = false;
            this.D = null;
            this.E = 0;
            this.f11534e.f11655o = 0L;
            k kVar = this.f11549t.f11499i;
            this.f11550u = kVar;
            kVar.a();
            AudioTrack audioTrack = this.f11540i.f11669c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f11551v.pause();
            }
            if (n(this.f11551v)) {
                i0 i0Var = this.f11542m;
                i0Var.getClass();
                i0Var.a(this.f11551v);
            }
            if (je.e0.f13788a < 21 && !this.W) {
                this.X = 0;
            }
            e0 e0Var = this.f11548s;
            if (e0Var != null) {
                this.f11549t = e0Var;
                this.f11548s = null;
            }
            x xVar = this.f11540i;
            xVar.d();
            xVar.f11669c = null;
            xVar.f11672f = null;
            AudioTrack audioTrack2 = this.f11551v;
            a5.i0 i0Var2 = this.f11539h;
            i0Var2.l();
            synchronized (f11525g0) {
                try {
                    if (h0 == null) {
                        h0 = Executors.newSingleThreadExecutor(new je.c0("ExoPlayer:AudioTrackReleaseThread", 0));
                    }
                    f11526i0++;
                    h0.execute(new com.mkuczera.haptic.a(11, audioTrack2, i0Var2));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f11551v = null;
        }
        this.f11544o.f2615i = null;
        this.f11543n.f2615i = null;
    }

    public final f e() {
        Context context;
        f fVarB;
        h hVar;
        if (this.f11553x == null && (context = this.f11527a) != null) {
            this.f11537f0 = Looper.myLooper();
            j jVar = new j(context, new gc.o(10, this));
            this.f11553x = jVar;
            c4.d dVar = (c4.d) jVar.f11522f;
            Handler handler = (Handler) jVar.f11520d;
            Context context2 = (Context) jVar.f11518b;
            if (jVar.f11517a) {
                fVarB = (f) jVar.f11524h;
                fVarB.getClass();
            } else {
                jVar.f11517a = true;
                i iVar = (i) jVar.f11523g;
                if (iVar != null) {
                    iVar.f11511a.registerContentObserver(iVar.f11512b, false, iVar);
                }
                if (je.e0.f13788a >= 23 && (hVar = (h) jVar.f11521e) != null) {
                    g.a(context2, hVar, handler);
                }
                fVarB = f.b(context2, dVar != null ? context2.registerReceiver(dVar, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler) : null);
                jVar.f11524h = fVarB;
            }
            this.f11552w = fVarB;
        }
        return this.f11552w;
    }

    public final int g(Format format) {
        String str = format.I;
        int i7 = format.X;
        if ("audio/raw".equals(str)) {
            if (!je.e0.F(i7)) {
                com.discord.chat.presentation.list.a.q(i7, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i7 != 2 && (!this.f11530c || i7 != 4)) {
                return 1;
            }
        } else if ((this.f11533d0 || !t(format, this.f11554y)) && e().c(format) == null) {
            return 0;
        }
        return 2;
    }

    public final long h() {
        e0 e0Var = this.f11549t;
        return e0Var.f11493c == 0 ? this.F / ((long) e0Var.f11492b) : this.G;
    }

    public final long i() {
        e0 e0Var = this.f11549t;
        return e0Var.f11493c == 0 ? this.H / ((long) e0Var.f11494d) : this.I;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x036c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0372  */
    /* JADX WARN: Code duplicated, block: B:185:0x037a  */
    /* JADX WARN: Code duplicated, block: B:186:0x037f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0399  */
    /* JADX WARN: Code duplicated, block: B:192:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:196:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:199:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:201:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:206:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:207:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:209:0x040c  */
    /* JADX WARN: Code duplicated, block: B:211:0x0417  */
    /* JADX WARN: Code duplicated, block: B:214:0x041e  */
    /* JADX WARN: Code duplicated, block: B:216:0x042d  */
    /* JADX WARN: Code duplicated, block: B:222:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x0150  */
    /* JADX WARN: Code duplicated, block: B:80:0x0155  */
    /* JADX WARN: Code duplicated, block: B:82:0x015d  */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0169  */
    /* JADX WARN: Code duplicated, block: B:87:0x016d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0173  */
    public final boolean j(ByteBuffer byteBuffer, long j, int i7) throws Exception {
        boolean zM;
        androidx.recyclerview.widget.h hVar;
        boolean z5;
        x xVar;
        long jI;
        int playState;
        boolean z6;
        char c8;
        boolean z7;
        e0 e0Var;
        boolean z10;
        long jO;
        ga.l lVar;
        ga.l lVar2;
        int iJ;
        int i10;
        byte b10;
        int i11;
        byte b11;
        int i12;
        int i13;
        ByteBuffer byteBuffer2 = this.O;
        boolean z11 = true;
        je.b.g(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f11548s == null) {
            zM = m();
            hVar = this.f11543n;
            if (!zM) {
                hVar.f2615i = null;
                z5 = this.L;
                xVar = this.f11540i;
                if (z5) {
                    this.M = Math.max(0L, j);
                    this.K = false;
                    this.L = false;
                    if (s()) {
                        r();
                    }
                    a(j);
                    if (this.V) {
                        this.V = true;
                        if (m()) {
                            w wVar = xVar.f11672f;
                            wVar.getClass();
                            wVar.a();
                            this.f11551v.play();
                        }
                    }
                }
                jI = i();
                AudioTrack audioTrack = xVar.f11669c;
                audioTrack.getClass();
                playState = audioTrack.getPlayState();
                if (!xVar.f11674h) {
                    z6 = xVar.f11680p;
                    boolean zC = xVar.c(jI);
                    xVar.f11680p = zC;
                    if (z6) {
                        c8 = 2;
                    } else {
                        c8 = 2;
                    }
                    if (this.O != null) {
                        p(j);
                        if (!this.O.hasRemaining()) {
                            this.O = null;
                            this.P = 0;
                            return true;
                        }
                        long jI2 = i();
                        if (xVar.f11690z != -9223372036854775807L) {
                            je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                            d();
                            return true;
                        }
                    } else {
                        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        je.b.g(z7);
                        if (!byteBuffer.hasRemaining()) {
                            return true;
                        }
                        e0Var = this.f11549t;
                        if (e0Var.f11493c == 0) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (this.f11555z == null) {
                            jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                            if (!this.K) {
                                lVar2 = this.f11547r;
                                if (lVar2 != null) {
                                    StringBuilder sbM = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                    sbM.append(j);
                                    lVar2.q(new ag.b(sbM.toString(), 4));
                                }
                                this.K = z10;
                            }
                            if (this.K) {
                                if (c()) {
                                    long j5 = j - jO;
                                    this.M += j5;
                                    this.K = false;
                                    a(j);
                                    lVar = this.f11547r;
                                    if (lVar != null) {
                                        ((m0) lVar.f9547e).f11574l1 = true;
                                    }
                                }
                            }
                            if (this.f11549t.f11493c == 0) {
                                this.F += (long) byteBuffer.remaining();
                            } else {
                                this.G = (((long) this.J) * ((long) i7)) + this.G;
                            }
                            this.O = byteBuffer;
                            this.P = i7;
                            p(j);
                            if (!this.O.hasRemaining()) {
                                this.O = null;
                                this.P = 0;
                                return true;
                            }
                            long jI3 = i();
                            if (xVar.f11690z != -9223372036854775807L) {
                                je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                d();
                                return true;
                            }
                        } else if (c()) {
                            a(j);
                            this.f11555z = null;
                            jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                            if (!this.K) {
                                lVar2 = this.f11547r;
                                if (lVar2 != null) {
                                    StringBuilder sbM2 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                    sbM2.append(j);
                                    lVar2.q(new ag.b(sbM2.toString(), 4));
                                }
                                this.K = z10;
                            }
                            if (this.K) {
                                if (c()) {
                                    long j7 = j - jO;
                                    this.M += j7;
                                    this.K = false;
                                    a(j);
                                    lVar = this.f11547r;
                                    if (lVar != null) {
                                        ((m0) lVar.f9547e).f11574l1 = true;
                                    }
                                }
                            }
                            if (this.f11549t.f11493c == 0) {
                                this.F += (long) byteBuffer.remaining();
                            } else {
                                this.G = (((long) this.J) * ((long) i7)) + this.G;
                            }
                            this.O = byteBuffer;
                            this.P = i7;
                            p(j);
                            if (!this.O.hasRemaining()) {
                                this.O = null;
                                this.P = 0;
                                return true;
                            }
                            long jI4 = i();
                            if (xVar.f11690z != -9223372036854775807L) {
                                je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                d();
                                return true;
                            }
                        }
                    }
                } else {
                    if (playState == 2) {
                        xVar.f11680p = false;
                        return false;
                    }
                    if (playState == 1) {
                        z6 = xVar.f11680p;
                        boolean zC2 = xVar.c(jI);
                        xVar.f11680p = zC2;
                        if (z6) {
                            c8 = 2;
                        } else {
                            c8 = 2;
                        }
                        if (this.O != null) {
                            p(j);
                            if (!this.O.hasRemaining()) {
                                this.O = null;
                                this.P = 0;
                                return true;
                            }
                            long jI5 = i();
                            if (xVar.f11690z != -9223372036854775807L) {
                                je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                d();
                                return true;
                            }
                        } else {
                            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            je.b.g(z7);
                            if (!byteBuffer.hasRemaining()) {
                                return true;
                            }
                            e0Var = this.f11549t;
                            if (e0Var.f11493c == 0) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            if (this.f11555z == null) {
                                jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                                if (!this.K) {
                                    lVar2 = this.f11547r;
                                    if (lVar2 != null) {
                                        StringBuilder sbM3 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                        sbM3.append(j);
                                        lVar2.q(new ag.b(sbM3.toString(), 4));
                                    }
                                    this.K = z10;
                                }
                                if (this.K) {
                                    if (c()) {
                                        long j10 = j - jO;
                                        this.M += j10;
                                        this.K = false;
                                        a(j);
                                        lVar = this.f11547r;
                                        if (lVar != null) {
                                            ((m0) lVar.f9547e).f11574l1 = true;
                                        }
                                    }
                                }
                                if (this.f11549t.f11493c == 0) {
                                    this.F += (long) byteBuffer.remaining();
                                } else {
                                    this.G = (((long) this.J) * ((long) i7)) + this.G;
                                }
                                this.O = byteBuffer;
                                this.P = i7;
                                p(j);
                                if (!this.O.hasRemaining()) {
                                    this.O = null;
                                    this.P = 0;
                                    return true;
                                }
                                long jI6 = i();
                                if (xVar.f11690z != -9223372036854775807L) {
                                    je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                    d();
                                    return true;
                                }
                            } else if (c()) {
                                a(j);
                                this.f11555z = null;
                                jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                                if (!this.K) {
                                    lVar2 = this.f11547r;
                                    if (lVar2 != null) {
                                        StringBuilder sbM4 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                        sbM4.append(j);
                                        lVar2.q(new ag.b(sbM4.toString(), 4));
                                    }
                                    this.K = z10;
                                }
                                if (this.K) {
                                    if (c()) {
                                        long j11 = j - jO;
                                        this.M += j11;
                                        this.K = false;
                                        a(j);
                                        lVar = this.f11547r;
                                        if (lVar != null) {
                                            ((m0) lVar.f9547e).f11574l1 = true;
                                        }
                                    }
                                }
                                if (this.f11549t.f11493c == 0) {
                                    this.F += (long) byteBuffer.remaining();
                                } else {
                                    this.G = (((long) this.J) * ((long) i7)) + this.G;
                                }
                                this.O = byteBuffer;
                                this.P = i7;
                                p(j);
                                if (!this.O.hasRemaining()) {
                                    this.O = null;
                                    this.P = 0;
                                    return true;
                                }
                                long jI7 = i();
                                if (xVar.f11690z != -9223372036854775807L) {
                                    je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                    d();
                                    return true;
                                }
                            }
                        }
                    } else {
                        z6 = xVar.f11680p;
                        boolean zC3 = xVar.c(jI);
                        xVar.f11680p = zC3;
                        if (z6) {
                            c8 = 2;
                        } else {
                            c8 = 2;
                        }
                        if (this.O != null) {
                            p(j);
                            if (!this.O.hasRemaining()) {
                                this.O = null;
                                this.P = 0;
                                return true;
                            }
                            long jI8 = i();
                            if (xVar.f11690z != -9223372036854775807L) {
                                je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                d();
                                return true;
                            }
                        } else {
                            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            je.b.g(z7);
                            if (!byteBuffer.hasRemaining()) {
                                return true;
                            }
                            e0Var = this.f11549t;
                            if (e0Var.f11493c == 0) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            if (this.f11555z == null) {
                                jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                                if (!this.K) {
                                    lVar2 = this.f11547r;
                                    if (lVar2 != null) {
                                        StringBuilder sbM5 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                        sbM5.append(j);
                                        lVar2.q(new ag.b(sbM5.toString(), 4));
                                    }
                                    this.K = z10;
                                }
                                if (this.K) {
                                    if (c()) {
                                        long j12 = j - jO;
                                        this.M += j12;
                                        this.K = false;
                                        a(j);
                                        lVar = this.f11547r;
                                        if (lVar != null) {
                                            ((m0) lVar.f9547e).f11574l1 = true;
                                        }
                                    }
                                }
                                if (this.f11549t.f11493c == 0) {
                                    this.F += (long) byteBuffer.remaining();
                                } else {
                                    this.G = (((long) this.J) * ((long) i7)) + this.G;
                                }
                                this.O = byteBuffer;
                                this.P = i7;
                                p(j);
                                if (!this.O.hasRemaining()) {
                                    this.O = null;
                                    this.P = 0;
                                    return true;
                                }
                                long jI9 = i();
                                if (xVar.f11690z != -9223372036854775807L) {
                                    je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                    d();
                                    return true;
                                }
                            } else if (c()) {
                                a(j);
                                this.f11555z = null;
                                jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                                if (!this.K) {
                                    lVar2 = this.f11547r;
                                    if (lVar2 != null) {
                                        StringBuilder sbM6 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                        sbM6.append(j);
                                        lVar2.q(new ag.b(sbM6.toString(), 4));
                                    }
                                    this.K = z10;
                                }
                                if (this.K) {
                                    if (c()) {
                                        long j13 = j - jO;
                                        this.M += j13;
                                        this.K = false;
                                        a(j);
                                        lVar = this.f11547r;
                                        if (lVar != null) {
                                            ((m0) lVar.f9547e).f11574l1 = true;
                                        }
                                    }
                                }
                                if (this.f11549t.f11493c == 0) {
                                    this.F += (long) byteBuffer.remaining();
                                } else {
                                    this.G = (((long) this.J) * ((long) i7)) + this.G;
                                }
                                this.O = byteBuffer;
                                this.P = i7;
                                p(j);
                                if (!this.O.hasRemaining()) {
                                    this.O = null;
                                    this.P = 0;
                                    return true;
                                }
                                long jI10 = i();
                                if (xVar.f11690z != -9223372036854775807L) {
                                    je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                    d();
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else {
                try {
                    if (l()) {
                        hVar.f2615i = null;
                        z5 = this.L;
                        xVar = this.f11540i;
                        if (z5) {
                            this.M = Math.max(0L, j);
                            this.K = false;
                            this.L = false;
                            if (s()) {
                                r();
                            }
                            a(j);
                            if (this.V) {
                                this.V = true;
                                if (m()) {
                                    w wVar2 = xVar.f11672f;
                                    wVar2.getClass();
                                    wVar2.a();
                                    this.f11551v.play();
                                }
                            }
                        }
                        jI = i();
                        AudioTrack audioTrack2 = xVar.f11669c;
                        audioTrack2.getClass();
                        playState = audioTrack2.getPlayState();
                        if (!xVar.f11674h) {
                            z6 = xVar.f11680p;
                            boolean zC4 = xVar.c(jI);
                            xVar.f11680p = zC4;
                            if (z6 || zC4 || playState == 1) {
                                c8 = 2;
                            } else {
                                fj.c cVar = xVar.f11667a;
                                int i14 = xVar.f11671e;
                                long jU = je.e0.U(xVar.f11675i);
                                j0 j0Var = (j0) cVar.f9267e;
                                if (j0Var.f11547r != null) {
                                    c8 = 2;
                                    long jElapsedRealtime = SystemClock.elapsedRealtime() - j0Var.f11531c0;
                                    e4.l lVar3 = ((m0) j0Var.f11547r.f9547e).f11567d1;
                                    Handler handler = (Handler) lVar3.f7989e;
                                    if (handler != null) {
                                        handler.post(new he.d(lVar3, i14, jU, jElapsedRealtime, 1));
                                    }
                                } else {
                                    c8 = 2;
                                }
                            }
                            if (this.O != null) {
                                p(j);
                                if (!this.O.hasRemaining()) {
                                    this.O = null;
                                    this.P = 0;
                                    return true;
                                }
                                long jI11 = i();
                                if (xVar.f11690z != -9223372036854775807L && jI11 > 0 && SystemClock.elapsedRealtime() - xVar.f11690z >= 200) {
                                    je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                    d();
                                    return true;
                                }
                            } else {
                                if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                je.b.g(z7);
                                if (!byteBuffer.hasRemaining()) {
                                    return true;
                                }
                                e0Var = this.f11549t;
                                if (e0Var.f11493c == 0 && this.J == 0) {
                                    int i15 = e0Var.f11497g;
                                    char c10 = 16;
                                    switch (i15) {
                                        case 5:
                                        case 6:
                                        case 18:
                                            z10 = true;
                                            iJ = ((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10 ? a.f11473c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 1536;
                                            this.J = iJ;
                                            if (iJ == 0) {
                                                return z10;
                                            }
                                            break;
                                        case 7:
                                        case 8:
                                            z10 = true;
                                            if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
                                                iJ = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                                            } else if (byteBuffer.getInt(0) == 622876772) {
                                                iJ = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                                            } else {
                                                int iPosition = byteBuffer.position();
                                                byte b12 = byteBuffer.get(iPosition);
                                                if (b12 != -2) {
                                                    if (b12 == -1) {
                                                        i10 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                                        b11 = byteBuffer.get(iPosition + 7);
                                                    } else if (b12 != 31) {
                                                        i10 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                                        b10 = byteBuffer.get(iPosition + 5);
                                                    } else {
                                                        i10 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                                        b11 = byteBuffer.get(iPosition + 6);
                                                    }
                                                    i11 = b11 & 60;
                                                    iJ = (((i11 >> 2) | i10) + 1) * 32;
                                                } else {
                                                    i10 = (byteBuffer.get(iPosition + 5) & 1) << 6;
                                                    b10 = byteBuffer.get(iPosition + 4);
                                                }
                                                i11 = b10 & 252;
                                                iJ = (((i11 >> 2) | i10) + 1) * 32;
                                            }
                                            this.J = iJ;
                                            if (iJ == 0) {
                                                return z10;
                                            }
                                            break;
                                        case 9:
                                            z10 = true;
                                            int iReverseBytes = byteBuffer.getInt(byteBuffer.position());
                                            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                iReverseBytes = Integer.reverseBytes(iReverseBytes);
                                            }
                                            iJ = a.j(iReverseBytes);
                                            if (iJ == -1) {
                                                throw new IllegalArgumentException();
                                            }
                                            this.J = iJ;
                                            if (iJ == 0) {
                                                return z10;
                                            }
                                            break;
                                        case 10:
                                        case 16:
                                            z10 = true;
                                            iJ = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                                            this.J = iJ;
                                            if (iJ == 0) {
                                                return z10;
                                            }
                                            break;
                                        case 11:
                                        case 12:
                                            z10 = true;
                                            iJ = RecyclerView.ItemAnimator.FLAG_MOVED;
                                            this.J = iJ;
                                            if (iJ == 0) {
                                                return z10;
                                            }
                                            break;
                                        case 13:
                                        case 19:
                                        default:
                                            throw new IllegalStateException(kk.b.h(i15, "Unexpected audio encoding: "));
                                        case 14:
                                            int iPosition2 = byteBuffer.position();
                                            int iLimit = byteBuffer.limit() - 10;
                                            int i16 = iPosition2;
                                            while (true) {
                                                if (i16 <= iLimit) {
                                                    int iReverseBytes2 = byteBuffer.getInt(i16 + 4);
                                                    char c11 = c10;
                                                    z10 = z11;
                                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                        iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                                    }
                                                    if ((iReverseBytes2 & (-2)) == -126718022) {
                                                        i12 = i16 - iPosition2;
                                                    } else {
                                                        i16++;
                                                        c10 = c11;
                                                        z11 = z10;
                                                    }
                                                } else {
                                                    z10 = z11;
                                                    i12 = -1;
                                                }
                                            }
                                            if (i12 == -1) {
                                                iJ = 0;
                                            } else {
                                                iJ = (40 << ((byteBuffer.get((byteBuffer.position() + i12) + ((byteBuffer.get((byteBuffer.position() + i12) + 7) & 255) == 187 ? z10 : false ? 9 : 8)) >> 4) & 7)) * 16;
                                            }
                                            this.J = iJ;
                                            if (iJ == 0) {
                                                return z10;
                                            }
                                            break;
                                        case 15:
                                            iJ = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                            z10 = true;
                                            this.J = iJ;
                                            if (iJ == 0) {
                                                return z10;
                                            }
                                            break;
                                        case 17:
                                            byte[] bArr = new byte[16];
                                            int iPosition3 = byteBuffer.position();
                                            byteBuffer.get(bArr);
                                            byteBuffer.position(iPosition3);
                                            iJ = a.h(new je.v(bArr, 16)).f9746c;
                                            z10 = true;
                                            this.J = iJ;
                                            if (iJ == 0) {
                                                return z10;
                                            }
                                            break;
                                        case 20:
                                            if ((byteBuffer.get(5) & 2) == 0) {
                                                i13 = 0;
                                            } else {
                                                byte b13 = byteBuffer.get(26);
                                                int i17 = 28;
                                                int i18 = 28;
                                                for (int i19 = 0; i19 < b13; i19++) {
                                                    i18 += byteBuffer.get(i19 + 27);
                                                }
                                                byte b14 = byteBuffer.get(i18 + 26);
                                                for (int i20 = 0; i20 < b14; i20++) {
                                                    i17 += byteBuffer.get(i18 + 27 + i20);
                                                }
                                                i13 = i18 + i17;
                                            }
                                            int i21 = byteBuffer.get(i13 + 26) + 27 + i13;
                                            iJ = (int) ((a.f(byteBuffer.get(i21), byteBuffer.limit() - i21 > 1 ? byteBuffer.get(i21 + 1) : (byte) 0) * 48000) / 1000000);
                                            z10 = true;
                                            this.J = iJ;
                                            if (iJ == 0) {
                                                return z10;
                                            }
                                            break;
                                    }
                                } else {
                                    z10 = true;
                                }
                                if (this.f11555z == null) {
                                    jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                                    if (!this.K && Math.abs(jO - j) > 200000) {
                                        lVar2 = this.f11547r;
                                        if (lVar2 != null) {
                                            StringBuilder sbM7 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                            sbM7.append(j);
                                            lVar2.q(new ag.b(sbM7.toString(), 4));
                                        }
                                        this.K = z10;
                                    }
                                    if (this.K) {
                                        if (c()) {
                                            long j14 = j - jO;
                                            this.M += j14;
                                            this.K = false;
                                            a(j);
                                            lVar = this.f11547r;
                                            if (lVar != null && j14 != 0) {
                                                ((m0) lVar.f9547e).f11574l1 = true;
                                            }
                                        }
                                    }
                                    if (this.f11549t.f11493c == 0) {
                                        this.F += (long) byteBuffer.remaining();
                                    } else {
                                        this.G = (((long) this.J) * ((long) i7)) + this.G;
                                    }
                                    this.O = byteBuffer;
                                    this.P = i7;
                                    p(j);
                                    if (!this.O.hasRemaining()) {
                                        this.O = null;
                                        this.P = 0;
                                        return true;
                                    }
                                    long jI12 = i();
                                    if (xVar.f11690z != -9223372036854775807L) {
                                        je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                        d();
                                        return true;
                                    }
                                } else if (c()) {
                                    a(j);
                                    this.f11555z = null;
                                    jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                                    if (!this.K) {
                                        lVar2 = this.f11547r;
                                        if (lVar2 != null) {
                                            StringBuilder sbM8 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                            sbM8.append(j);
                                            lVar2.q(new ag.b(sbM8.toString(), 4));
                                        }
                                        this.K = z10;
                                    }
                                    if (this.K) {
                                        if (c()) {
                                            long j15 = j - jO;
                                            this.M += j15;
                                            this.K = false;
                                            a(j);
                                            lVar = this.f11547r;
                                            if (lVar != null) {
                                                ((m0) lVar.f9547e).f11574l1 = true;
                                            }
                                        }
                                    }
                                    if (this.f11549t.f11493c == 0) {
                                        this.F += (long) byteBuffer.remaining();
                                    } else {
                                        this.G = (((long) this.J) * ((long) i7)) + this.G;
                                    }
                                    this.O = byteBuffer;
                                    this.P = i7;
                                    p(j);
                                    if (!this.O.hasRemaining()) {
                                        this.O = null;
                                        this.P = 0;
                                        return true;
                                    }
                                    long jI13 = i();
                                    if (xVar.f11690z != -9223372036854775807L) {
                                        je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                        d();
                                        return true;
                                    }
                                }
                            }
                        } else {
                            if (playState == 2) {
                                xVar.f11680p = false;
                                return false;
                            }
                            if (playState == 1 || xVar.b() != 0) {
                                z6 = xVar.f11680p;
                                boolean zC5 = xVar.c(jI);
                                xVar.f11680p = zC5;
                                if (z6) {
                                    c8 = 2;
                                } else {
                                    c8 = 2;
                                }
                                if (this.O != null) {
                                    p(j);
                                    if (!this.O.hasRemaining()) {
                                        this.O = null;
                                        this.P = 0;
                                        return true;
                                    }
                                    long jI14 = i();
                                    if (xVar.f11690z != -9223372036854775807L) {
                                        je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                        d();
                                        return true;
                                    }
                                } else {
                                    if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    je.b.g(z7);
                                    if (!byteBuffer.hasRemaining()) {
                                        return true;
                                    }
                                    e0Var = this.f11549t;
                                    if (e0Var.f11493c == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    if (this.f11555z == null) {
                                        jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                                        if (!this.K) {
                                            lVar2 = this.f11547r;
                                            if (lVar2 != null) {
                                                StringBuilder sbM9 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                                sbM9.append(j);
                                                lVar2.q(new ag.b(sbM9.toString(), 4));
                                            }
                                            this.K = z10;
                                        }
                                        if (this.K) {
                                            if (c()) {
                                                long j16 = j - jO;
                                                this.M += j16;
                                                this.K = false;
                                                a(j);
                                                lVar = this.f11547r;
                                                if (lVar != null) {
                                                    ((m0) lVar.f9547e).f11574l1 = true;
                                                }
                                            }
                                        }
                                        if (this.f11549t.f11493c == 0) {
                                            this.F += (long) byteBuffer.remaining();
                                        } else {
                                            this.G = (((long) this.J) * ((long) i7)) + this.G;
                                        }
                                        this.O = byteBuffer;
                                        this.P = i7;
                                        p(j);
                                        if (!this.O.hasRemaining()) {
                                            this.O = null;
                                            this.P = 0;
                                            return true;
                                        }
                                        long jI15 = i();
                                        if (xVar.f11690z != -9223372036854775807L) {
                                            je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                            d();
                                            return true;
                                        }
                                    } else if (c()) {
                                        a(j);
                                        this.f11555z = null;
                                        jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                                        if (!this.K) {
                                            lVar2 = this.f11547r;
                                            if (lVar2 != null) {
                                                StringBuilder sbM10 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                                sbM10.append(j);
                                                lVar2.q(new ag.b(sbM10.toString(), 4));
                                            }
                                            this.K = z10;
                                        }
                                        if (this.K) {
                                            if (c()) {
                                                long j17 = j - jO;
                                                this.M += j17;
                                                this.K = false;
                                                a(j);
                                                lVar = this.f11547r;
                                                if (lVar != null) {
                                                    ((m0) lVar.f9547e).f11574l1 = true;
                                                }
                                            }
                                        }
                                        if (this.f11549t.f11493c == 0) {
                                            this.F += (long) byteBuffer.remaining();
                                        } else {
                                            this.G = (((long) this.J) * ((long) i7)) + this.G;
                                        }
                                        this.O = byteBuffer;
                                        this.P = i7;
                                        p(j);
                                        if (!this.O.hasRemaining()) {
                                            this.O = null;
                                            this.P = 0;
                                            return true;
                                        }
                                        long jI16 = i();
                                        if (xVar.f11690z != -9223372036854775807L) {
                                            je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                            d();
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (s e10) {
                    if (e10.f11646e) {
                        throw e10;
                    }
                    hVar.N(e10);
                    return false;
                }
            }
        } else if (c()) {
            e0 e0Var2 = this.f11548s;
            e0 e0Var3 = this.f11549t;
            e0Var2.getClass();
            if (e0Var3.f11493c == e0Var2.f11493c && e0Var3.f11497g == e0Var2.f11497g && e0Var3.f11495e == e0Var2.f11495e && e0Var3.f11496f == e0Var2.f11496f && e0Var3.f11494d == e0Var2.f11494d && e0Var3.j == e0Var2.j) {
                this.f11549t = this.f11548s;
                this.f11548s = null;
                if (n(this.f11551v) && this.f11541l != 3) {
                    if (this.f11551v.getPlayState() == 3) {
                        this.f11551v.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack3 = this.f11551v;
                    Format format = this.f11549t.f11491a;
                    audioTrack3.setOffloadDelayPadding(format.Y, format.Z);
                    this.f11535e0 = true;
                }
            } else {
                o();
                if (!k()) {
                    d();
                }
            }
            a(j);
            zM = m();
            hVar = this.f11543n;
            if (!zM) {
                hVar.f2615i = null;
                z5 = this.L;
                xVar = this.f11540i;
                if (z5) {
                    this.M = Math.max(0L, j);
                    this.K = false;
                    this.L = false;
                    if (s()) {
                        r();
                    }
                    a(j);
                    if (this.V) {
                        this.V = true;
                        if (m()) {
                            w wVar3 = xVar.f11672f;
                            wVar3.getClass();
                            wVar3.a();
                            this.f11551v.play();
                        }
                    }
                }
                jI = i();
                AudioTrack audioTrack4 = xVar.f11669c;
                audioTrack4.getClass();
                playState = audioTrack4.getPlayState();
                if (!xVar.f11674h) {
                    z6 = xVar.f11680p;
                    boolean zC6 = xVar.c(jI);
                    xVar.f11680p = zC6;
                    if (z6) {
                        c8 = 2;
                    } else {
                        c8 = 2;
                    }
                    if (this.O != null) {
                        p(j);
                        if (!this.O.hasRemaining()) {
                            this.O = null;
                            this.P = 0;
                            return true;
                        }
                        long jI17 = i();
                        if (xVar.f11690z != -9223372036854775807L) {
                            je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                            d();
                            return true;
                        }
                    } else {
                        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        je.b.g(z7);
                        if (!byteBuffer.hasRemaining()) {
                            return true;
                        }
                        e0Var = this.f11549t;
                        if (e0Var.f11493c == 0) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (this.f11555z == null) {
                            jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                            if (!this.K) {
                                lVar2 = this.f11547r;
                                if (lVar2 != null) {
                                    StringBuilder sbM11 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                    sbM11.append(j);
                                    lVar2.q(new ag.b(sbM11.toString(), 4));
                                }
                                this.K = z10;
                            }
                            if (this.K) {
                                if (c()) {
                                    long j18 = j - jO;
                                    this.M += j18;
                                    this.K = false;
                                    a(j);
                                    lVar = this.f11547r;
                                    if (lVar != null) {
                                        ((m0) lVar.f9547e).f11574l1 = true;
                                    }
                                }
                            }
                            if (this.f11549t.f11493c == 0) {
                                this.F += (long) byteBuffer.remaining();
                            } else {
                                this.G = (((long) this.J) * ((long) i7)) + this.G;
                            }
                            this.O = byteBuffer;
                            this.P = i7;
                            p(j);
                            if (!this.O.hasRemaining()) {
                                this.O = null;
                                this.P = 0;
                                return true;
                            }
                            long jI18 = i();
                            if (xVar.f11690z != -9223372036854775807L) {
                                je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                d();
                                return true;
                            }
                        } else if (c()) {
                            a(j);
                            this.f11555z = null;
                            jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                            if (!this.K) {
                                lVar2 = this.f11547r;
                                if (lVar2 != null) {
                                    StringBuilder sbM12 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                    sbM12.append(j);
                                    lVar2.q(new ag.b(sbM12.toString(), 4));
                                }
                                this.K = z10;
                            }
                            if (this.K) {
                                if (c()) {
                                    long j19 = j - jO;
                                    this.M += j19;
                                    this.K = false;
                                    a(j);
                                    lVar = this.f11547r;
                                    if (lVar != null) {
                                        ((m0) lVar.f9547e).f11574l1 = true;
                                    }
                                }
                            }
                            if (this.f11549t.f11493c == 0) {
                                this.F += (long) byteBuffer.remaining();
                            } else {
                                this.G = (((long) this.J) * ((long) i7)) + this.G;
                            }
                            this.O = byteBuffer;
                            this.P = i7;
                            p(j);
                            if (!this.O.hasRemaining()) {
                                this.O = null;
                                this.P = 0;
                                return true;
                            }
                            long jI19 = i();
                            if (xVar.f11690z != -9223372036854775807L) {
                                je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                d();
                                return true;
                            }
                        }
                    }
                } else {
                    if (playState == 2) {
                        xVar.f11680p = false;
                        return false;
                    }
                    if (playState == 1) {
                        z6 = xVar.f11680p;
                        boolean zC7 = xVar.c(jI);
                        xVar.f11680p = zC7;
                        if (z6) {
                            c8 = 2;
                        } else {
                            c8 = 2;
                        }
                        if (this.O != null) {
                            p(j);
                            if (!this.O.hasRemaining()) {
                                this.O = null;
                                this.P = 0;
                                return true;
                            }
                            long jI110 = i();
                            if (xVar.f11690z != -9223372036854775807L) {
                                je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                d();
                                return true;
                            }
                        } else {
                            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            je.b.g(z7);
                            if (!byteBuffer.hasRemaining()) {
                                return true;
                            }
                            e0Var = this.f11549t;
                            if (e0Var.f11493c == 0) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            if (this.f11555z == null) {
                                jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                                if (!this.K) {
                                    lVar2 = this.f11547r;
                                    if (lVar2 != null) {
                                        StringBuilder sbM13 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                        sbM13.append(j);
                                        lVar2.q(new ag.b(sbM13.toString(), 4));
                                    }
                                    this.K = z10;
                                }
                                if (this.K) {
                                    if (c()) {
                                        long j110 = j - jO;
                                        this.M += j110;
                                        this.K = false;
                                        a(j);
                                        lVar = this.f11547r;
                                        if (lVar != null) {
                                            ((m0) lVar.f9547e).f11574l1 = true;
                                        }
                                    }
                                }
                                if (this.f11549t.f11493c == 0) {
                                    this.F += (long) byteBuffer.remaining();
                                } else {
                                    this.G = (((long) this.J) * ((long) i7)) + this.G;
                                }
                                this.O = byteBuffer;
                                this.P = i7;
                                p(j);
                                if (!this.O.hasRemaining()) {
                                    this.O = null;
                                    this.P = 0;
                                    return true;
                                }
                                long jI111 = i();
                                if (xVar.f11690z != -9223372036854775807L) {
                                    je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                    d();
                                    return true;
                                }
                            } else if (c()) {
                                a(j);
                                this.f11555z = null;
                                jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                                if (!this.K) {
                                    lVar2 = this.f11547r;
                                    if (lVar2 != null) {
                                        StringBuilder sbM14 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                        sbM14.append(j);
                                        lVar2.q(new ag.b(sbM14.toString(), 4));
                                    }
                                    this.K = z10;
                                }
                                if (this.K) {
                                    if (c()) {
                                        long j111 = j - jO;
                                        this.M += j111;
                                        this.K = false;
                                        a(j);
                                        lVar = this.f11547r;
                                        if (lVar != null) {
                                            ((m0) lVar.f9547e).f11574l1 = true;
                                        }
                                    }
                                }
                                if (this.f11549t.f11493c == 0) {
                                    this.F += (long) byteBuffer.remaining();
                                } else {
                                    this.G = (((long) this.J) * ((long) i7)) + this.G;
                                }
                                this.O = byteBuffer;
                                this.P = i7;
                                p(j);
                                if (!this.O.hasRemaining()) {
                                    this.O = null;
                                    this.P = 0;
                                    return true;
                                }
                                long jI112 = i();
                                if (xVar.f11690z != -9223372036854775807L) {
                                    je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                    d();
                                    return true;
                                }
                            }
                        }
                    } else {
                        z6 = xVar.f11680p;
                        boolean zC8 = xVar.c(jI);
                        xVar.f11680p = zC8;
                        if (z6) {
                            c8 = 2;
                        } else {
                            c8 = 2;
                        }
                        if (this.O != null) {
                            p(j);
                            if (!this.O.hasRemaining()) {
                                this.O = null;
                                this.P = 0;
                                return true;
                            }
                            long jI113 = i();
                            if (xVar.f11690z != -9223372036854775807L) {
                                je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                d();
                                return true;
                            }
                        } else {
                            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            je.b.g(z7);
                            if (!byteBuffer.hasRemaining()) {
                                return true;
                            }
                            e0Var = this.f11549t;
                            if (e0Var.f11493c == 0) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            if (this.f11555z == null) {
                                jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                                if (!this.K) {
                                    lVar2 = this.f11547r;
                                    if (lVar2 != null) {
                                        StringBuilder sbM15 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                        sbM15.append(j);
                                        lVar2.q(new ag.b(sbM15.toString(), 4));
                                    }
                                    this.K = z10;
                                }
                                if (this.K) {
                                    if (c()) {
                                        long j112 = j - jO;
                                        this.M += j112;
                                        this.K = false;
                                        a(j);
                                        lVar = this.f11547r;
                                        if (lVar != null) {
                                            ((m0) lVar.f9547e).f11574l1 = true;
                                        }
                                    }
                                }
                                if (this.f11549t.f11493c == 0) {
                                    this.F += (long) byteBuffer.remaining();
                                } else {
                                    this.G = (((long) this.J) * ((long) i7)) + this.G;
                                }
                                this.O = byteBuffer;
                                this.P = i7;
                                p(j);
                                if (!this.O.hasRemaining()) {
                                    this.O = null;
                                    this.P = 0;
                                    return true;
                                }
                                long jI114 = i();
                                if (xVar.f11690z != -9223372036854775807L) {
                                    je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                    d();
                                    return true;
                                }
                            } else if (c()) {
                                a(j);
                                this.f11555z = null;
                                jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                                if (!this.K) {
                                    lVar2 = this.f11547r;
                                    if (lVar2 != null) {
                                        StringBuilder sbM16 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                        sbM16.append(j);
                                        lVar2.q(new ag.b(sbM16.toString(), 4));
                                    }
                                    this.K = z10;
                                }
                                if (this.K) {
                                    if (c()) {
                                        long j113 = j - jO;
                                        this.M += j113;
                                        this.K = false;
                                        a(j);
                                        lVar = this.f11547r;
                                        if (lVar != null) {
                                            ((m0) lVar.f9547e).f11574l1 = true;
                                        }
                                    }
                                }
                                if (this.f11549t.f11493c == 0) {
                                    this.F += (long) byteBuffer.remaining();
                                } else {
                                    this.G = (((long) this.J) * ((long) i7)) + this.G;
                                }
                                this.O = byteBuffer;
                                this.P = i7;
                                p(j);
                                if (!this.O.hasRemaining()) {
                                    this.O = null;
                                    this.P = 0;
                                    return true;
                                }
                                long jI115 = i();
                                if (xVar.f11690z != -9223372036854775807L) {
                                    je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                    d();
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else if (l()) {
                hVar.f2615i = null;
                z5 = this.L;
                xVar = this.f11540i;
                if (z5) {
                    this.M = Math.max(0L, j);
                    this.K = false;
                    this.L = false;
                    if (s()) {
                        r();
                    }
                    a(j);
                    if (this.V) {
                        this.V = true;
                        if (m()) {
                            w wVar4 = xVar.f11672f;
                            wVar4.getClass();
                            wVar4.a();
                            this.f11551v.play();
                        }
                    }
                }
                jI = i();
                AudioTrack audioTrack5 = xVar.f11669c;
                audioTrack5.getClass();
                playState = audioTrack5.getPlayState();
                if (!xVar.f11674h) {
                    z6 = xVar.f11680p;
                    boolean zC9 = xVar.c(jI);
                    xVar.f11680p = zC9;
                    if (z6) {
                        c8 = 2;
                    } else {
                        c8 = 2;
                    }
                    if (this.O != null) {
                        p(j);
                        if (!this.O.hasRemaining()) {
                            this.O = null;
                            this.P = 0;
                            return true;
                        }
                        long jI116 = i();
                        if (xVar.f11690z != -9223372036854775807L) {
                            je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                            d();
                            return true;
                        }
                    } else {
                        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        je.b.g(z7);
                        if (!byteBuffer.hasRemaining()) {
                            return true;
                        }
                        e0Var = this.f11549t;
                        if (e0Var.f11493c == 0) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (this.f11555z == null) {
                            jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                            if (!this.K) {
                                lVar2 = this.f11547r;
                                if (lVar2 != null) {
                                    StringBuilder sbM17 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                    sbM17.append(j);
                                    lVar2.q(new ag.b(sbM17.toString(), 4));
                                }
                                this.K = z10;
                            }
                            if (this.K) {
                                if (c()) {
                                    long j114 = j - jO;
                                    this.M += j114;
                                    this.K = false;
                                    a(j);
                                    lVar = this.f11547r;
                                    if (lVar != null) {
                                        ((m0) lVar.f9547e).f11574l1 = true;
                                    }
                                }
                            }
                            if (this.f11549t.f11493c == 0) {
                                this.F += (long) byteBuffer.remaining();
                            } else {
                                this.G = (((long) this.J) * ((long) i7)) + this.G;
                            }
                            this.O = byteBuffer;
                            this.P = i7;
                            p(j);
                            if (!this.O.hasRemaining()) {
                                this.O = null;
                                this.P = 0;
                                return true;
                            }
                            long jI117 = i();
                            if (xVar.f11690z != -9223372036854775807L) {
                                je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                d();
                                return true;
                            }
                        } else if (c()) {
                            a(j);
                            this.f11555z = null;
                            jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                            if (!this.K) {
                                lVar2 = this.f11547r;
                                if (lVar2 != null) {
                                    StringBuilder sbM18 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                    sbM18.append(j);
                                    lVar2.q(new ag.b(sbM18.toString(), 4));
                                }
                                this.K = z10;
                            }
                            if (this.K) {
                                if (c()) {
                                    long j115 = j - jO;
                                    this.M += j115;
                                    this.K = false;
                                    a(j);
                                    lVar = this.f11547r;
                                    if (lVar != null) {
                                        ((m0) lVar.f9547e).f11574l1 = true;
                                    }
                                }
                            }
                            if (this.f11549t.f11493c == 0) {
                                this.F += (long) byteBuffer.remaining();
                            } else {
                                this.G = (((long) this.J) * ((long) i7)) + this.G;
                            }
                            this.O = byteBuffer;
                            this.P = i7;
                            p(j);
                            if (!this.O.hasRemaining()) {
                                this.O = null;
                                this.P = 0;
                                return true;
                            }
                            long jI118 = i();
                            if (xVar.f11690z != -9223372036854775807L) {
                                je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                d();
                                return true;
                            }
                        }
                    }
                } else {
                    if (playState == 2) {
                        xVar.f11680p = false;
                        return false;
                    }
                    if (playState == 1) {
                        z6 = xVar.f11680p;
                        boolean zC10 = xVar.c(jI);
                        xVar.f11680p = zC10;
                        if (z6) {
                            c8 = 2;
                        } else {
                            c8 = 2;
                        }
                        if (this.O != null) {
                            p(j);
                            if (!this.O.hasRemaining()) {
                                this.O = null;
                                this.P = 0;
                                return true;
                            }
                            long jI119 = i();
                            if (xVar.f11690z != -9223372036854775807L) {
                                je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                d();
                                return true;
                            }
                        } else {
                            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            je.b.g(z7);
                            if (!byteBuffer.hasRemaining()) {
                                return true;
                            }
                            e0Var = this.f11549t;
                            if (e0Var.f11493c == 0) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            if (this.f11555z == null) {
                                jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                                if (!this.K) {
                                    lVar2 = this.f11547r;
                                    if (lVar2 != null) {
                                        StringBuilder sbM19 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                        sbM19.append(j);
                                        lVar2.q(new ag.b(sbM19.toString(), 4));
                                    }
                                    this.K = z10;
                                }
                                if (this.K) {
                                    if (c()) {
                                        long j116 = j - jO;
                                        this.M += j116;
                                        this.K = false;
                                        a(j);
                                        lVar = this.f11547r;
                                        if (lVar != null) {
                                            ((m0) lVar.f9547e).f11574l1 = true;
                                        }
                                    }
                                }
                                if (this.f11549t.f11493c == 0) {
                                    this.F += (long) byteBuffer.remaining();
                                } else {
                                    this.G = (((long) this.J) * ((long) i7)) + this.G;
                                }
                                this.O = byteBuffer;
                                this.P = i7;
                                p(j);
                                if (!this.O.hasRemaining()) {
                                    this.O = null;
                                    this.P = 0;
                                    return true;
                                }
                                long jI1110 = i();
                                if (xVar.f11690z != -9223372036854775807L) {
                                    je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                    d();
                                    return true;
                                }
                            } else if (c()) {
                                a(j);
                                this.f11555z = null;
                                jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                                if (!this.K) {
                                    lVar2 = this.f11547r;
                                    if (lVar2 != null) {
                                        StringBuilder sbM110 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                        sbM110.append(j);
                                        lVar2.q(new ag.b(sbM110.toString(), 4));
                                    }
                                    this.K = z10;
                                }
                                if (this.K) {
                                    if (c()) {
                                        long j117 = j - jO;
                                        this.M += j117;
                                        this.K = false;
                                        a(j);
                                        lVar = this.f11547r;
                                        if (lVar != null) {
                                            ((m0) lVar.f9547e).f11574l1 = true;
                                        }
                                    }
                                }
                                if (this.f11549t.f11493c == 0) {
                                    this.F += (long) byteBuffer.remaining();
                                } else {
                                    this.G = (((long) this.J) * ((long) i7)) + this.G;
                                }
                                this.O = byteBuffer;
                                this.P = i7;
                                p(j);
                                if (!this.O.hasRemaining()) {
                                    this.O = null;
                                    this.P = 0;
                                    return true;
                                }
                                long jI1111 = i();
                                if (xVar.f11690z != -9223372036854775807L) {
                                    je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                    d();
                                    return true;
                                }
                            }
                        }
                    } else {
                        z6 = xVar.f11680p;
                        boolean zC11 = xVar.c(jI);
                        xVar.f11680p = zC11;
                        if (z6) {
                            c8 = 2;
                        } else {
                            c8 = 2;
                        }
                        if (this.O != null) {
                            p(j);
                            if (!this.O.hasRemaining()) {
                                this.O = null;
                                this.P = 0;
                                return true;
                            }
                            long jI1112 = i();
                            if (xVar.f11690z != -9223372036854775807L) {
                                je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                d();
                                return true;
                            }
                        } else {
                            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            je.b.g(z7);
                            if (!byteBuffer.hasRemaining()) {
                                return true;
                            }
                            e0Var = this.f11549t;
                            if (e0Var.f11493c == 0) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            if (this.f11555z == null) {
                                jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                                if (!this.K) {
                                    lVar2 = this.f11547r;
                                    if (lVar2 != null) {
                                        StringBuilder sbM111 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                        sbM111.append(j);
                                        lVar2.q(new ag.b(sbM111.toString(), 4));
                                    }
                                    this.K = z10;
                                }
                                if (this.K) {
                                    if (c()) {
                                        long j118 = j - jO;
                                        this.M += j118;
                                        this.K = false;
                                        a(j);
                                        lVar = this.f11547r;
                                        if (lVar != null) {
                                            ((m0) lVar.f9547e).f11574l1 = true;
                                        }
                                    }
                                }
                                if (this.f11549t.f11493c == 0) {
                                    this.F += (long) byteBuffer.remaining();
                                } else {
                                    this.G = (((long) this.J) * ((long) i7)) + this.G;
                                }
                                this.O = byteBuffer;
                                this.P = i7;
                                p(j);
                                if (!this.O.hasRemaining()) {
                                    this.O = null;
                                    this.P = 0;
                                    return true;
                                }
                                long jI1113 = i();
                                if (xVar.f11690z != -9223372036854775807L) {
                                    je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                    d();
                                    return true;
                                }
                            } else if (c()) {
                                a(j);
                                this.f11555z = null;
                                jO = je.e0.O(this.f11549t.f11491a.W, h() - this.f11534e.f11655o) + this.M;
                                if (!this.K) {
                                    lVar2 = this.f11547r;
                                    if (lVar2 != null) {
                                        StringBuilder sbM112 = kk.b.m(jO, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                        sbM112.append(j);
                                        lVar2.q(new ag.b(sbM112.toString(), 4));
                                    }
                                    this.K = z10;
                                }
                                if (this.K) {
                                    if (c()) {
                                        long j119 = j - jO;
                                        this.M += j119;
                                        this.K = false;
                                        a(j);
                                        lVar = this.f11547r;
                                        if (lVar != null) {
                                            ((m0) lVar.f9547e).f11574l1 = true;
                                        }
                                    }
                                }
                                if (this.f11549t.f11493c == 0) {
                                    this.F += (long) byteBuffer.remaining();
                                } else {
                                    this.G = (((long) this.J) * ((long) i7)) + this.G;
                                }
                                this.O = byteBuffer;
                                this.P = i7;
                                p(j);
                                if (!this.O.hasRemaining()) {
                                    this.O = null;
                                    this.P = 0;
                                    return true;
                                }
                                long jI1114 = i();
                                if (xVar.f11690z != -9223372036854775807L) {
                                    je.b.N("DefaultAudioSink", "Resetting stalled audio track");
                                    d();
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean k() {
        return m() && this.f11540i.c(i());
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0154  */
    /* JADX WARN: Code duplicated, block: B:92:? A[SYNTHETIC] */
    public final boolean l() throws s {
        boolean z5;
        AudioTrack audioTrackA;
        hc.c0 c0Var;
        a5.i0 i0Var = this.f11539h;
        synchronized (i0Var) {
            z5 = i0Var.f214e;
        }
        if (!z5) {
            return false;
        }
        try {
            e0 e0Var = this.f11549t;
            e0Var.getClass();
            try {
                audioTrackA = e0Var.a(this.a0, this.f11554y, this.X);
            } catch (s e10) {
                ga.l lVar = this.f11547r;
                if (lVar != null) {
                    lVar.q(e10);
                }
                throw e10;
            }
        } catch (s e11) {
            e0 e0Var2 = this.f11549t;
            if (e0Var2.f11498h > 1000000) {
                e0 e0Var3 = new e0(e0Var2.f11491a, e0Var2.f11492b, e0Var2.f11493c, e0Var2.f11494d, e0Var2.f11495e, e0Var2.f11496f, e0Var2.f11497g, 1000000, e0Var2.f11499i, e0Var2.j);
                try {
                    try {
                        audioTrackA = e0Var3.a(this.a0, this.f11554y, this.X);
                        this.f11549t = e0Var3;
                    } catch (s e12) {
                        ga.l lVar2 = this.f11547r;
                        if (lVar2 != null) {
                            lVar2.q(e12);
                        }
                        throw e12;
                    }
                } catch (s e13) {
                    e11.addSuppressed(e13);
                    if (this.f11549t.f11493c == 1) {
                        throw e11;
                    }
                    this.f11533d0 = true;
                    throw e11;
                }
            }
            if (this.f11549t.f11493c == 1) {
                throw e11;
            }
            this.f11533d0 = true;
            throw e11;
        }
        this.f11551v = audioTrackA;
        if (n(audioTrackA)) {
            AudioTrack audioTrack = this.f11551v;
            if (this.f11542m == null) {
                this.f11542m = new i0(this);
            }
            i0 i0Var2 = this.f11542m;
            Handler handler = i0Var2.f11514a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new g0(handler), i0Var2.f11515b);
            if (this.f11541l != 3) {
                AudioTrack audioTrack2 = this.f11551v;
                Format format = this.f11549t.f11491a;
                audioTrack2.setOffloadDelayPadding(format.Y, format.Z);
            }
        }
        int i7 = je.e0.f13788a;
        if (i7 >= 31 && (c0Var = this.f11546q) != null) {
            c0.a(this.f11551v, c0Var);
        }
        this.X = this.f11551v.getAudioSessionId();
        x xVar = this.f11540i;
        AudioTrack audioTrack3 = this.f11551v;
        e0 e0Var4 = this.f11549t;
        boolean z6 = e0Var4.f11493c == 2;
        int i10 = e0Var4.f11497g;
        int i11 = e0Var4.f11494d;
        int i12 = e0Var4.f11498h;
        xVar.f11669c = audioTrack3;
        xVar.f11670d = i11;
        xVar.f11671e = i12;
        xVar.f11672f = new w(audioTrack3);
        xVar.f11673g = audioTrack3.getSampleRate();
        xVar.f11674h = z6 && i7 < 23 && (i10 == 5 || i10 == 6);
        boolean zF = je.e0.F(i10);
        xVar.f11681q = zF;
        xVar.f11675i = zF ? je.e0.O(xVar.f11673g, i12 / i11) : -9223372036854775807L;
        xVar.f11684t = 0L;
        xVar.f11685u = 0L;
        xVar.f11686v = 0L;
        xVar.f11680p = false;
        xVar.f11689y = -9223372036854775807L;
        xVar.f11690z = -9223372036854775807L;
        xVar.f11682r = 0L;
        xVar.f11679o = 0L;
        xVar.j = 1.0f;
        if (m()) {
            if (i7 >= 21) {
                this.f11551v.setVolume(this.N);
            } else {
                AudioTrack audioTrack4 = this.f11551v;
                float f2 = this.N;
                audioTrack4.setStereoVolume(f2, f2);
            }
        }
        this.Y.getClass();
        d0 d0Var = this.Z;
        if (d0Var != null && i7 >= 23) {
            b0.a(this.f11551v, d0Var);
        }
        this.L = true;
        return true;
    }

    public final boolean m() {
        return this.f11551v != null;
    }

    public final void o() {
        if (this.U) {
            return;
        }
        this.U = true;
        long jI = i();
        x xVar = this.f11540i;
        xVar.A = xVar.b();
        xVar.f11689y = SystemClock.elapsedRealtime() * 1000;
        xVar.B = jI;
        this.f11551v.stop();
        this.E = 0;
    }

    public final void p(long j) throws Exception {
        ByteBuffer byteBuffer;
        if (!this.f11550u.d()) {
            ByteBuffer byteBuffer2 = this.O;
            if (byteBuffer2 == null) {
                byteBuffer2 = n.f11577a;
            }
            u(j, byteBuffer2);
            return;
        }
        while (!this.f11550u.c()) {
            do {
                k kVar = this.f11550u;
                if (kVar.d()) {
                    ByteBuffer byteBuffer3 = kVar.f11558c[kVar.b()];
                    if (!byteBuffer3.hasRemaining()) {
                        kVar.e(n.f11577a);
                    }
                    byteBuffer = byteBuffer3;
                } else {
                    byteBuffer = n.f11577a;
                }
                if (byteBuffer.hasRemaining()) {
                    u(j, byteBuffer);
                } else {
                    ByteBuffer byteBuffer4 = this.O;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    k kVar2 = this.f11550u;
                    ByteBuffer byteBuffer5 = this.O;
                    if (kVar2.d() && !kVar2.f11559d) {
                        kVar2.e(byteBuffer5);
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    public final void q() {
        d();
        ei.c0 c0VarListIterator = this.f11536f.listIterator(0);
        while (c0VarListIterator.hasNext()) {
            ((n) c0VarListIterator.next()).reset();
        }
        ei.c0 c0VarListIterator2 = this.f11538g.listIterator(0);
        while (c0VarListIterator2.hasNext()) {
            ((n) c0VarListIterator2.next()).reset();
        }
        k kVar = this.f11550u;
        if (kVar != null) {
            ei.e0 e0Var = kVar.f11556a;
            for (int i7 = 0; i7 < e0Var.size(); i7++) {
                n nVar = (n) e0Var.get(i7);
                nVar.flush();
                nVar.reset();
            }
            kVar.f11558c = new ByteBuffer[0];
            l lVar = l.f11561e;
            kVar.f11559d = false;
        }
        this.V = false;
        this.f11533d0 = false;
    }

    public final void r() {
        if (m()) {
            try {
                this.f11551v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.B.f5574d).setPitch(this.B.f5575e).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                je.b.O("DefaultAudioSink", "Failed to set playback params", e10);
            }
            PlaybackParameters playbackParameters = new PlaybackParameters(this.f11551v.getPlaybackParams().getSpeed(), this.f11551v.getPlaybackParams().getPitch());
            this.B = playbackParameters;
            float f2 = playbackParameters.f5574d;
            x xVar = this.f11540i;
            xVar.j = f2;
            w wVar = xVar.f11672f;
            if (wVar != null) {
                wVar.a();
            }
            xVar.d();
        }
    }

    public final boolean s() {
        e0 e0Var = this.f11549t;
        return e0Var != null && e0Var.j && je.e0.f13788a >= 23;
    }

    public final boolean t(Format format, AudioAttributes audioAttributes) {
        int i7;
        int iO;
        int playbackOffloadSupport;
        int i10 = je.e0.f13788a;
        if (i10 >= 29 && (i7 = this.f11541l) != 0) {
            String str = format.I;
            str.getClass();
            int iC = je.o.c(str, format.F);
            if (iC == 0 || (iO = je.e0.o(format.V)) == 0) {
                return false;
            }
            AudioFormat audioFormatF = f(format.W, iO, iC);
            android.media.AudioAttributes audioAttributes2 = (android.media.AudioAttributes) audioAttributes.a().f21117d;
            if (i10 >= 31) {
                playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatF, audioAttributes2);
            } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatF, audioAttributes2)) {
                playbackOffloadSupport = (i10 == 30 && je.e0.f13791d.startsWith("Pixel")) ? 2 : 1;
            } else {
                playbackOffloadSupport = 0;
            }
            if (playbackOffloadSupport != 0) {
                if (playbackOffloadSupport == 1) {
                    return ((format.Y != 0 || format.Z != 0) && (i7 == 1)) ? false : true;
                }
                if (playbackOffloadSupport == 2) {
                    return true;
                }
                throw new IllegalStateException();
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fc  */
    public final void u(long j, ByteBuffer byteBuffer) throws Exception {
        ByteBuffer byteBuffer2;
        int iWrite;
        ga.l lVar;
        gc.z zVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.Q;
            if (byteBuffer3 != null) {
                je.b.g(byteBuffer3 == byteBuffer);
            } else {
                this.Q = byteBuffer;
                if (je.e0.f13788a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.R;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.R = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.R, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.S = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i7 = je.e0.f13788a;
            if (i7 < 21) {
                long j5 = this.H;
                x xVar = this.f11540i;
                int iB = xVar.f11671e - ((int) (j5 - (xVar.b() * ((long) xVar.f11670d))));
                if (iB > 0) {
                    iWrite = this.f11551v.write(this.R, this.S, Math.min(iRemaining2, iB));
                    if (iWrite > 0) {
                        this.S += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
                byteBuffer2 = byteBuffer;
            } else if (this.a0) {
                je.b.k(j != -9223372036854775807L);
                if (j == Long.MIN_VALUE) {
                    j = this.f11529b0;
                } else {
                    this.f11529b0 = j;
                }
                AudioTrack audioTrack = this.f11551v;
                if (i7 >= 26) {
                    byteBuffer2 = byteBuffer;
                    iWrite = audioTrack.write(byteBuffer2, iRemaining2, 1, j * 1000);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.D == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.D = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.D.putInt(1431633921);
                    }
                    if (this.E == 0) {
                        this.D.putInt(4, iRemaining2);
                        this.D.putLong(8, j * 1000);
                        this.D.position(0);
                        this.E = iRemaining2;
                    }
                    int iRemaining3 = this.D.remaining();
                    if (iRemaining3 <= 0) {
                        iWrite = audioTrack.write(byteBuffer2, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.E = 0;
                        } else {
                            this.E -= iWrite;
                        }
                    } else {
                        int iWrite2 = audioTrack.write(this.D, iRemaining3, 1);
                        if (iWrite2 < 0) {
                            this.E = 0;
                            iWrite = iWrite2;
                        } else if (iWrite2 < iRemaining3) {
                            iWrite = 0;
                        } else {
                            iWrite = audioTrack.write(byteBuffer2, iRemaining2, 1);
                            if (iWrite < 0) {
                                this.E = 0;
                            } else {
                                this.E -= iWrite;
                            }
                        }
                    }
                }
            } else {
                byteBuffer2 = byteBuffer;
                iWrite = this.f11551v.write(byteBuffer2, iRemaining2, 1);
            }
            this.f11531c0 = SystemClock.elapsedRealtime();
            androidx.recyclerview.widget.h hVar = this.f11544o;
            if (iWrite < 0) {
                t tVar = new t(iWrite, this.f11549t.f11491a, ((i7 >= 24 && iWrite == -6) || iWrite == -32) && this.I > 0);
                ga.l lVar2 = this.f11547r;
                if (lVar2 != null) {
                    lVar2.q(tVar);
                }
                if (tVar.f11649e) {
                    this.f11552w = f.f11500c;
                    throw tVar;
                }
                hVar.N(tVar);
                return;
            }
            hVar.f2615i = null;
            if (n(this.f11551v)) {
                if (this.I > 0) {
                    this.f11535e0 = false;
                }
                if (this.V && (lVar = this.f11547r) != null && iWrite < iRemaining2 && !this.f11535e0 && (zVar = ((m0) lVar.f9547e).f11576n1) != null) {
                    zVar.f9950a.f9611d0 = true;
                }
            }
            int i10 = this.f11549t.f11493c;
            if (i10 == 0) {
                this.H += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i10 != 0) {
                    je.b.k(byteBuffer2 == this.O);
                    this.I = (((long) this.J) * ((long) this.P)) + this.I;
                }
                this.Q = null;
            }
        }
    }
}
