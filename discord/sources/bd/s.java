package bd;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.gms.internal.play_billing.v1;
import com.reactnativecommunity.webview.RNCWebViewManager;
import hc.c0;
import ic.o0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import je.e0;
import mc.a0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s extends gc.e {

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final byte[] f3188b1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public long A0;
    public int B0;
    public int C0;
    public ByteBuffer D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public int K0;
    public final k L;
    public int L0;
    public final t M;
    public int M0;
    public final boolean N;
    public boolean N0;
    public final float O;
    public boolean O0;
    public final lc.f P;
    public boolean P0;
    public final lc.f Q;
    public long Q0;
    public final lc.f R;
    public long R0;
    public final h S;
    public boolean S0;
    public final ArrayList T;
    public boolean T0;
    public final MediaCodec.BufferInfo U;
    public boolean U0;
    public final ArrayDeque V;
    public boolean V0;
    public final o0 W;
    public com.google.android.exoplayer2.b W0;
    public Format X;
    public DecoderCounters X0;
    public Format Y;
    public r Y0;
    public mc.k Z;
    public long Z0;
    public mc.k a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f3189a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public MediaCrypto f3190b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f3191c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final long f3192d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f3193e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f3194f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public l f3195g0;
    public Format h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public MediaFormat f3196i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f3197j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f3198k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ArrayDeque f3199l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public q f3200m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public o f3201n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f3202o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f3203p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f3204q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f3205r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f3206s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f3207t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f3208u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f3209v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f3210w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f3211x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f3212y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public i f3213z0;

    public s(int i7, k kVar, boolean z5, float f2) {
        super(i7);
        this.L = kVar;
        this.M = t.f3214e;
        this.N = z5;
        this.O = f2;
        this.P = new lc.f(0);
        this.Q = new lc.f(0);
        this.R = new lc.f(2);
        h hVar = new h(2);
        hVar.H = 32;
        this.S = hVar;
        this.T = new ArrayList();
        this.U = new MediaCodec.BufferInfo();
        this.f3193e0 = 1.0f;
        this.f3194f0 = 1.0f;
        this.f3192d0 = -9223372036854775807L;
        this.V = new ArrayDeque();
        k0(r.f3184d);
        hVar.i(0);
        hVar.f15010v.order(ByteOrder.nativeOrder());
        o0 o0Var = new o0();
        o0Var.f11594c = ic.n.f11577a;
        o0Var.f11593b = 0;
        o0Var.f11592a = 2;
        this.W = o0Var;
        this.f3198k0 = -1.0f;
        this.f3202o0 = 0;
        this.K0 = 0;
        this.B0 = -1;
        this.C0 = -1;
        this.A0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.R0 = -9223372036854775807L;
        this.Z0 = -9223372036854775807L;
        this.L0 = 0;
        this.M0 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r24v0, types: [bd.s, gc.e] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.nio.Buffer, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r5v15, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    public final boolean A(long j, long j5) throws com.google.android.exoplayer2.b {
        h hVar;
        String str;
        ?? r5;
        ByteBuffer byteBuffer;
        ?? r15;
        je.b.k(!this.T0);
        h hVar2 = this.S;
        int i7 = hVar2.G;
        if (i7 > 0) {
            hVar = hVar2;
            if (d0(j, j5, null, hVar2.f15010v, this.C0, 0, i7, hVar2.f15012x, hVar2.c(Integer.MIN_VALUE), hVar2.c(4), this.Y)) {
                Y(hVar.F);
                hVar.e();
            }
        }
        hVar = hVar2;
        if (this.S0) {
            this.T0 = true;
            return false;
        }
        ?? r6 = 0;
        boolean z5 = this.H0;
        lc.f fVar = this.R;
        if (z5) {
            je.b.k(hVar.k(fVar));
            this.H0 = false;
        }
        if (this.I0) {
            if (hVar.G > 0) {
                return true;
            }
            D();
            this.I0 = false;
            Q();
            if (!this.G0) {
                return false;
            }
        }
        je.b.k(!this.S0);
        e4.r rVar = this.f9603i;
        rVar.y();
        fVar.e();
        while (true) {
            fVar.e();
            int iT = t(rVar, fVar, r6);
            if (iT == -5) {
                V(rVar);
                break;
            }
            if (iT != -4) {
                if (iT == -3) {
                    break;
                }
                throw new IllegalStateException();
            }
            if (fVar.c(4)) {
                this.S0 = true;
                break;
            }
            byte[] bArr = null;
            if (this.U0) {
                Format format = this.X;
                format.getClass();
                this.Y = format;
                W(format, null);
                this.U0 = r6;
            }
            fVar.j();
            Format format2 = this.X;
            if (format2 != null && (str = format2.I) != null && str.equals("audio/opus")) {
                ?? r7 = this.X.K;
                o0 o0Var = this.W;
                o0Var.getClass();
                fVar.f15010v.getClass();
                if (fVar.f15010v.limit() - fVar.f15010v.position() == 0) {
                    hVar = hVar;
                } else {
                    if (o0Var.f11592a == 2 && (r7.size() == 1 || r7.size() == 3)) {
                        bArr = (byte[]) r7.get(r6);
                    }
                    ?? r10 = fVar.f15010v;
                    int iPosition = r10.position();
                    int iLimit = r10.limit();
                    int i10 = iLimit - iPosition;
                    int i11 = (i10 + 255) / 255;
                    int i12 = i11 + 27 + i10;
                    if (o0Var.f11592a == 2) {
                        int length = bArr != null ? bArr.length + 28 : 47;
                        i12 = (length == true ? 1 : 0) + 44 + i12;
                        r5 = length;
                    } else {
                        r5 = r6;
                    }
                    if (((ByteBuffer) o0Var.f11594c).capacity() < i12) {
                        o0Var.f11594c = ByteBuffer.allocate(i12).order(ByteOrder.LITTLE_ENDIAN);
                    } else {
                        ((ByteBuffer) o0Var.f11594c).clear();
                    }
                    ByteBuffer byteBuffer2 = (ByteBuffer) o0Var.f11594c;
                    if (o0Var.f11592a == 2) {
                        if (bArr != null) {
                            o0.a(byteBuffer2, 0L, 0, 1, true);
                            byteBuffer = byteBuffer2;
                            long length2 = bArr.length;
                            ls.l.d((length2 >> 8) == 0 ? 1 : r6, "out of range: %s", length2);
                            byteBuffer.put((byte) length2);
                            byteBuffer.put(bArr);
                            byteBuffer.putInt(22, e0.l(byteBuffer.arrayOffset(), bArr.length + 28, 0, byteBuffer.array()));
                            byteBuffer.position(bArr.length + 28);
                        } else {
                            byteBuffer = byteBuffer2;
                            byteBuffer.put(o0.f11590d);
                        }
                        byteBuffer.put(o0.f11591e);
                        r15 = 0;
                    } else {
                        hVar = hVar;
                        byteBuffer = byteBuffer2;
                        r15 = r6;
                    }
                    int iF = o0Var.f11593b + ((int) ((ic.a.f(r10.get(r15), r10.limit() > 1 ? r10.get(1) : (byte) 0) * 48000) / 1000000));
                    o0Var.f11593b = iF;
                    o0.a(byteBuffer, iF, o0Var.f11592a, i11, false);
                    for (int i13 = 0; i13 < i11; i13++) {
                        if (i10 >= 255) {
                            byteBuffer.put((byte) -1);
                            i10 -= 255;
                        } else {
                            byteBuffer.put((byte) i10);
                            i10 = 0;
                        }
                    }
                    while (iPosition < iLimit) {
                        byteBuffer.put(r10.get(iPosition));
                        iPosition++;
                    }
                    r10.position(r10.limit());
                    byteBuffer.flip();
                    if (o0Var.f11592a == 2) {
                        byteBuffer.putInt(r5 + 66, e0.l(byteBuffer.arrayOffset() + r5 + 44, byteBuffer.limit() - byteBuffer.position(), 0, byteBuffer.array()));
                    } else {
                        byteBuffer.putInt(22, e0.l(byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position(), 0, byteBuffer.array()));
                    }
                    o0Var.f11592a++;
                    o0Var.f11594c = byteBuffer;
                    fVar.e();
                    fVar.i(((ByteBuffer) o0Var.f11594c).remaining());
                    fVar.f15010v.put((ByteBuffer) o0Var.f11594c);
                    fVar.j();
                }
                hVar = hVar;
            }
            if (!hVar.k(fVar)) {
                this.H0 = true;
                break;
            }
            r6 = 0;
        }
        if (hVar.G > 0) {
            hVar.j();
        }
        return hVar.G > 0 || this.S0 || this.I0;
    }

    public abstract DecoderReuseEvaluation B(o oVar, Format format, Format format2);

    public m C(IllegalStateException illegalStateException, o oVar) {
        return new m(illegalStateException, oVar);
    }

    public final void D() {
        this.I0 = false;
        this.S.e();
        this.R.e();
        this.H0 = false;
        this.G0 = false;
        o0 o0Var = this.W;
        o0Var.getClass();
        o0Var.f11594c = ic.n.f11577a;
        o0Var.f11593b = 0;
        o0Var.f11592a = 2;
    }

    public final boolean E() throws com.google.android.exoplayer2.b {
        if (!this.N0) {
            p0();
            return true;
        }
        this.L0 = 1;
        if (this.f3204q0 || this.f3206s0) {
            this.M0 = 3;
            return false;
        }
        this.M0 = 2;
        return true;
    }

    public final boolean F(long j, long j5) throws com.google.android.exoplayer2.b {
        boolean z5;
        MediaCodec.BufferInfo bufferInfo;
        boolean zD0;
        int iM;
        boolean z6;
        int i7 = this.C0;
        MediaCodec.BufferInfo bufferInfo2 = this.U;
        if (i7 < 0) {
            if (this.f3207t0 && this.O0) {
                try {
                    iM = this.f3195g0.m(bufferInfo2);
                } catch (IllegalStateException unused) {
                    c0();
                    if (this.T0) {
                        f0();
                    }
                }
            } else {
                iM = this.f3195g0.m(bufferInfo2);
            }
            if (iM < 0) {
                if (iM != -2) {
                    if (this.f3212y0 && (this.S0 || this.L0 == 2)) {
                        c0();
                        return false;
                    }
                    return false;
                }
                this.P0 = true;
                MediaFormat outputFormat = this.f3195g0.getOutputFormat();
                if (this.f3202o0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.f3211x0 = true;
                    return true;
                }
                if (this.f3209v0) {
                    outputFormat.setInteger("channel-count", 1);
                }
                this.f3196i0 = outputFormat;
                this.f3197j0 = true;
                return true;
            }
            if (this.f3211x0) {
                this.f3211x0 = false;
                this.f3195g0.releaseOutputBuffer(iM, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                c0();
                return false;
            }
            this.C0 = iM;
            ByteBuffer outputBuffer = this.f3195g0.getOutputBuffer(iM);
            this.D0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo2.offset);
                this.D0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f3208u0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j7 = this.Q0;
                if (j7 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j7;
                }
            }
            long j10 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.T;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z6 = false;
                    break;
                }
                if (((Long) arrayList.get(i10)).longValue() == j10) {
                    arrayList.remove(i10);
                    z6 = true;
                    break;
                }
                i10++;
            }
            this.E0 = z6;
            long j11 = this.R0;
            long j12 = bufferInfo2.presentationTimeUs;
            this.F0 = j11 == j12;
            q0(j12);
        }
        if (this.f3207t0 && this.O0) {
            try {
                z5 = false;
                bufferInfo = bufferInfo2;
                try {
                    zD0 = d0(j, j5, this.f3195g0, this.D0, this.C0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.E0, this.F0, this.Y);
                } catch (IllegalStateException unused2) {
                    c0();
                    if (!this.T0) {
                        return z5;
                    }
                    f0();
                    return z5;
                }
            } catch (IllegalStateException unused3) {
                z5 = false;
            }
        } else {
            z5 = false;
            bufferInfo = bufferInfo2;
            zD0 = d0(j, j5, this.f3195g0, this.D0, this.C0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.E0, this.F0, this.Y);
        }
        if (!zD0) {
            return z5;
        }
        Y(bufferInfo.presentationTimeUs);
        boolean z7 = (bufferInfo.flags & 4) != 0 ? true : z5;
        this.C0 = -1;
        this.D0 = null;
        if (!z7) {
            return r15;
        }
        c0();
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0190  */
    /* JADX WARN: Code duplicated, block: B:108:0x0198  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b7 A[LOOP:2: B:115:0x01b5->B:116:0x01b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:120:0x01db  */
    /* JADX WARN: Code duplicated, block: B:122:0x0218  */
    /* JADX WARN: Code duplicated, block: B:125:0x0221  */
    /* JADX WARN: Code duplicated, block: B:128:0x022e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0236  */
    /* JADX WARN: Code duplicated, block: B:132:0x0245  */
    /* JADX WARN: Code duplicated, block: B:136:0x0264  */
    /* JADX WARN: Code duplicated, block: B:139:0x026c A[Catch: CryptoException -> 0x0275, TRY_ENTER, TryCatch #2 {CryptoException -> 0x0275, blocks: (B:139:0x026c, B:143:0x0277), top: B:157:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0277 A[Catch: CryptoException -> 0x0275, TRY_LEAVE, TryCatch #2 {CryptoException -> 0x0275, blocks: (B:139:0x026c, B:143:0x0277), top: B:157:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:153:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[LOOP:0: B:30:0x0072->B:32:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e8 A[Catch: CryptoException -> 0x00fa, TRY_LEAVE, TryCatch #0 {CryptoException -> 0x00fa, blocks: (B:60:0x00e2, B:63:0x00e8), top: B:153:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x010a  */
    /* JADX WARN: Code duplicated, block: B:76:0x011e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0128  */
    /* JADX WARN: Code duplicated, block: B:80:0x012c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0130  */
    /* JADX WARN: Code duplicated, block: B:86:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x0151  */
    /* JADX WARN: Code duplicated, block: B:92:0x015a  */
    /* JADX WARN: Code duplicated, block: B:93:0x015c  */
    /* JADX WARN: Code duplicated, block: B:96:0x017a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x017c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0180  */
    public final boolean G() throws com.google.android.exoplayer2.b {
        lc.c cVar;
        int iPosition;
        e4.r rVar;
        int iT;
        boolean zC;
        long jMax;
        i iVar;
        ArrayDeque arrayDeque;
        Format format;
        ByteBuffer byteBuffer;
        int i7;
        int i10;
        int iJ;
        ByteBuffer byteBuffer2;
        int iPosition2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        l lVar = this.f3195g0;
        if (lVar != null && this.L0 != 2 && !this.S0) {
            int i16 = this.B0;
            lc.f fVar = this.Q;
            if (i16 < 0) {
                int iK = lVar.k();
                this.B0 = iK;
                if (iK >= 0) {
                    fVar.f15010v = this.f3195g0.getInputBuffer(iK);
                    fVar.e();
                    if (this.L0 == 1) {
                        if (!this.f3212y0) {
                            this.O0 = true;
                            this.f3195g0.i(0L, this.B0, 0, 4);
                            this.B0 = -1;
                            fVar.f15010v = null;
                        }
                        this.L0 = 2;
                        return false;
                    }
                    if (this.f3210w0) {
                        this.f3210w0 = false;
                        fVar.f15010v.put(f3188b1);
                        this.f3195g0.i(0L, this.B0, 38, 0);
                        this.B0 = -1;
                        fVar.f15010v = null;
                        this.N0 = true;
                        return true;
                    }
                    if (this.K0 == 1) {
                        for (i15 = 0; i15 < this.h0.K.size(); i15++) {
                            fVar.f15010v.put((byte[]) this.h0.K.get(i15));
                        }
                        this.K0 = 2;
                    }
                    ByteBuffer byteBuffer3 = fVar.f15010v;
                    cVar = fVar.f15009i;
                    iPosition = byteBuffer3.position();
                    rVar = this.f9603i;
                    rVar.y();
                    try {
                        iT = t(rVar, fVar, 0);
                        if (i() || fVar.c(536870912)) {
                            this.R0 = this.Q0;
                        }
                        if (iT != -3) {
                            if (iT == -5) {
                                if (this.K0 == 2) {
                                    fVar.e();
                                    this.K0 = 1;
                                }
                                V(rVar);
                                return true;
                            }
                            if (fVar.c(4)) {
                                if (!this.N0 || fVar.c(1)) {
                                    zC = fVar.c(1073741824);
                                    if (zC) {
                                        if (iPosition == 0) {
                                            cVar.getClass();
                                        } else {
                                            if (cVar.f15003d == null) {
                                                int[] iArr = new int[1];
                                                cVar.f15003d = iArr;
                                                cVar.f15008i.numBytesOfClearData = iArr;
                                            }
                                            int[] iArr2 = cVar.f15003d;
                                            iArr2[0] = iArr2[0] + iPosition;
                                        }
                                    }
                                    if (this.f3203p0 && !zC) {
                                        byteBuffer2 = fVar.f15010v;
                                        iPosition2 = byteBuffer2.position();
                                        i11 = 0;
                                        i12 = 0;
                                        while (true) {
                                            i13 = i11 + 1;
                                            if (i13 >= iPosition2) {
                                                byteBuffer2.clear();
                                                break;
                                            }
                                            i14 = byteBuffer2.get(i11) & 255;
                                            if (i12 == 3) {
                                                if (i14 == 1 && (byteBuffer2.get(i13) & 31) == 7) {
                                                    ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                                                    byteBufferDuplicate.position(i11 - 3);
                                                    byteBufferDuplicate.limit(iPosition2);
                                                    byteBuffer2.position(0);
                                                    byteBuffer2.put(byteBufferDuplicate);
                                                    break;
                                                }
                                            } else if (i14 == 0) {
                                                i12++;
                                            }
                                            if (i14 != 0) {
                                                i12 = 0;
                                            }
                                            i11 = i13;
                                        }
                                        if (fVar.f15010v.position() != 0) {
                                            this.f3203p0 = false;
                                        }
                                    }
                                    jMax = fVar.f15012x;
                                    iVar = this.f3213z0;
                                    if (iVar != null) {
                                        format = this.X;
                                        if (iVar.f3165c == 0) {
                                            iVar.f3164b = jMax;
                                        }
                                        if (!iVar.f3163a) {
                                            byteBuffer = fVar.f15010v;
                                            byteBuffer.getClass();
                                            i10 = 0;
                                            for (i7 = 0; i7 < 4; i7++) {
                                                i10 = (i10 << 8) | (byteBuffer.get(i7) & 255);
                                            }
                                            iJ = ic.a.j(i10);
                                            if (iJ == -1) {
                                                iVar.f3163a = true;
                                                iVar.f3165c = 0L;
                                                iVar.f3164b = fVar.f15012x;
                                                je.b.N("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                                jMax = fVar.f15012x;
                                            } else {
                                                jMax = Math.max(0L, ((iVar.f3165c - 529) * 1000000) / format.W) + iVar.f3164b;
                                                iVar.f3165c += (long) iJ;
                                            }
                                        }
                                        long j = this.Q0;
                                        i iVar2 = this.f3213z0;
                                        Format format2 = this.X;
                                        iVar2.getClass();
                                        this.Q0 = Math.max(j, Math.max(0L, ((iVar2.f3165c - 529) * 1000000) / format2.W) + iVar2.f3164b);
                                    }
                                    if (fVar.c(Integer.MIN_VALUE)) {
                                        this.T.add(Long.valueOf(jMax));
                                    }
                                    if (this.U0) {
                                        arrayDeque = this.V;
                                        if (arrayDeque.isEmpty()) {
                                            this.Y0.f3187c.a(jMax, this.X);
                                        } else {
                                            ((r) arrayDeque.peekLast()).f3187c.a(jMax, this.X);
                                        }
                                        this.U0 = false;
                                    }
                                    this.Q0 = Math.max(this.Q0, jMax);
                                    fVar.j();
                                    if (fVar.c(268435456)) {
                                        O(fVar);
                                    }
                                    a0(fVar);
                                    try {
                                        if (zC) {
                                            this.f3195g0.d(this.B0, cVar, jMax);
                                        } else {
                                            this.f3195g0.i(jMax, this.B0, fVar.f15010v.limit(), 0);
                                        }
                                        this.B0 = -1;
                                        fVar.f15010v = null;
                                        this.N0 = true;
                                        this.K0 = 0;
                                        this.X0.f5672c++;
                                        return true;
                                    } catch (MediaCodec.CryptoException e10) {
                                        throw f(e10, this.X, false, e0.s(e10.getErrorCode()));
                                    }
                                }
                                fVar.e();
                                if (this.K0 == 2) {
                                    this.K0 = 1;
                                    return true;
                                }
                                return true;
                            }
                            if (this.K0 == 2) {
                                fVar.e();
                                this.K0 = 1;
                            }
                            this.S0 = true;
                            if (!this.N0) {
                                c0();
                                return false;
                            }
                            try {
                                if (this.f3212y0) {
                                    this.O0 = true;
                                    this.f3195g0.i(0L, this.B0, 0, 4);
                                    this.B0 = -1;
                                    fVar.f15010v = null;
                                    return false;
                                }
                            } catch (MediaCodec.CryptoException e11) {
                                throw f(e11, this.X, false, e0.s(e11.getErrorCode()));
                            }
                        }
                    } catch (lc.e e12) {
                        S(e12);
                        e0(0);
                        H();
                        return true;
                    }
                }
            } else {
                if (this.L0 == 1) {
                    if (!this.f3212y0) {
                        this.O0 = true;
                        this.f3195g0.i(0L, this.B0, 0, 4);
                        this.B0 = -1;
                        fVar.f15010v = null;
                    }
                    this.L0 = 2;
                    return false;
                }
                if (this.f3210w0) {
                    this.f3210w0 = false;
                    fVar.f15010v.put(f3188b1);
                    this.f3195g0.i(0L, this.B0, 38, 0);
                    this.B0 = -1;
                    fVar.f15010v = null;
                    this.N0 = true;
                    return true;
                }
                if (this.K0 == 1) {
                    while (i15 < this.h0.K.size()) {
                        fVar.f15010v.put((byte[]) this.h0.K.get(i15));
                    }
                    this.K0 = 2;
                }
                ByteBuffer byteBuffer4 = fVar.f15010v;
                cVar = fVar.f15009i;
                iPosition = byteBuffer4.position();
                rVar = this.f9603i;
                rVar.y();
                iT = t(rVar, fVar, 0);
                if (i()) {
                    this.R0 = this.Q0;
                } else {
                    this.R0 = this.Q0;
                }
                if (iT != -3) {
                    if (iT == -5) {
                        if (this.K0 == 2) {
                            fVar.e();
                            this.K0 = 1;
                        }
                        V(rVar);
                        return true;
                    }
                    if (fVar.c(4)) {
                        if (this.N0) {
                            zC = fVar.c(1073741824);
                            if (zC) {
                                if (iPosition == 0) {
                                    cVar.getClass();
                                } else {
                                    if (cVar.f15003d == null) {
                                        int[] iArr3 = new int[1];
                                        cVar.f15003d = iArr3;
                                        cVar.f15008i.numBytesOfClearData = iArr3;
                                    }
                                    int[] iArr4 = cVar.f15003d;
                                    iArr4[0] = iArr4[0] + iPosition;
                                }
                            }
                            if (this.f3203p0) {
                                byteBuffer2 = fVar.f15010v;
                                iPosition2 = byteBuffer2.position();
                                i11 = 0;
                                i12 = 0;
                                while (true) {
                                    i13 = i11 + 1;
                                    if (i13 >= iPosition2) {
                                        byteBuffer2.clear();
                                        break;
                                    }
                                    i14 = byteBuffer2.get(i11) & 255;
                                    if (i12 == 3) {
                                        if (i14 == 1) {
                                            ByteBuffer byteBufferDuplicate2 = byteBuffer2.duplicate();
                                            byteBufferDuplicate2.position(i11 - 3);
                                            byteBufferDuplicate2.limit(iPosition2);
                                            byteBuffer2.position(0);
                                            byteBuffer2.put(byteBufferDuplicate2);
                                            break;
                                        }
                                    } else if (i14 == 0) {
                                        i12++;
                                    }
                                    if (i14 != 0) {
                                        i12 = 0;
                                    }
                                    i11 = i13;
                                }
                                if (fVar.f15010v.position() != 0) {
                                    this.f3203p0 = false;
                                }
                            }
                            jMax = fVar.f15012x;
                            iVar = this.f3213z0;
                            if (iVar != null) {
                                format = this.X;
                                if (iVar.f3165c == 0) {
                                    iVar.f3164b = jMax;
                                }
                                if (!iVar.f3163a) {
                                    byteBuffer = fVar.f15010v;
                                    byteBuffer.getClass();
                                    i10 = 0;
                                    while (i7 < 4) {
                                        i10 = (i10 << 8) | (byteBuffer.get(i7) & 255);
                                    }
                                    iJ = ic.a.j(i10);
                                    if (iJ == -1) {
                                        iVar.f3163a = true;
                                        iVar.f3165c = 0L;
                                        iVar.f3164b = fVar.f15012x;
                                        je.b.N("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                        jMax = fVar.f15012x;
                                    } else {
                                        jMax = Math.max(0L, ((iVar.f3165c - 529) * 1000000) / format.W) + iVar.f3164b;
                                        iVar.f3165c += (long) iJ;
                                    }
                                }
                                long j5 = this.Q0;
                                i iVar3 = this.f3213z0;
                                Format format3 = this.X;
                                iVar3.getClass();
                                this.Q0 = Math.max(j5, Math.max(0L, ((iVar3.f3165c - 529) * 1000000) / format3.W) + iVar3.f3164b);
                            }
                            if (fVar.c(Integer.MIN_VALUE)) {
                                this.T.add(Long.valueOf(jMax));
                            }
                            if (this.U0) {
                                arrayDeque = this.V;
                                if (arrayDeque.isEmpty()) {
                                    ((r) arrayDeque.peekLast()).f3187c.a(jMax, this.X);
                                } else {
                                    this.Y0.f3187c.a(jMax, this.X);
                                }
                                this.U0 = false;
                            }
                            this.Q0 = Math.max(this.Q0, jMax);
                            fVar.j();
                            if (fVar.c(268435456)) {
                                O(fVar);
                            }
                            a0(fVar);
                            if (zC) {
                                this.f3195g0.d(this.B0, cVar, jMax);
                            } else {
                                this.f3195g0.i(jMax, this.B0, fVar.f15010v.limit(), 0);
                            }
                            this.B0 = -1;
                            fVar.f15010v = null;
                            this.N0 = true;
                            this.K0 = 0;
                            this.X0.f5672c++;
                            return true;
                        }
                        zC = fVar.c(1073741824);
                        if (zC) {
                            if (iPosition == 0) {
                                cVar.getClass();
                            } else {
                                if (cVar.f15003d == null) {
                                    int[] iArr5 = new int[1];
                                    cVar.f15003d = iArr5;
                                    cVar.f15008i.numBytesOfClearData = iArr5;
                                }
                                int[] iArr6 = cVar.f15003d;
                                iArr6[0] = iArr6[0] + iPosition;
                            }
                        }
                        if (this.f3203p0) {
                            byteBuffer2 = fVar.f15010v;
                            iPosition2 = byteBuffer2.position();
                            i11 = 0;
                            i12 = 0;
                            while (true) {
                                i13 = i11 + 1;
                                if (i13 >= iPosition2) {
                                    byteBuffer2.clear();
                                    break;
                                }
                                i14 = byteBuffer2.get(i11) & 255;
                                if (i12 == 3) {
                                    if (i14 == 1) {
                                        ByteBuffer byteBufferDuplicate3 = byteBuffer2.duplicate();
                                        byteBufferDuplicate3.position(i11 - 3);
                                        byteBufferDuplicate3.limit(iPosition2);
                                        byteBuffer2.position(0);
                                        byteBuffer2.put(byteBufferDuplicate3);
                                        break;
                                    }
                                } else if (i14 == 0) {
                                    i12++;
                                }
                                if (i14 != 0) {
                                    i12 = 0;
                                }
                                i11 = i13;
                            }
                            if (fVar.f15010v.position() != 0) {
                                this.f3203p0 = false;
                            }
                        }
                        jMax = fVar.f15012x;
                        iVar = this.f3213z0;
                        if (iVar != null) {
                            format = this.X;
                            if (iVar.f3165c == 0) {
                                iVar.f3164b = jMax;
                            }
                            if (!iVar.f3163a) {
                                byteBuffer = fVar.f15010v;
                                byteBuffer.getClass();
                                i10 = 0;
                                while (i7 < 4) {
                                    i10 = (i10 << 8) | (byteBuffer.get(i7) & 255);
                                }
                                iJ = ic.a.j(i10);
                                if (iJ == -1) {
                                    iVar.f3163a = true;
                                    iVar.f3165c = 0L;
                                    iVar.f3164b = fVar.f15012x;
                                    je.b.N("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                    jMax = fVar.f15012x;
                                } else {
                                    jMax = Math.max(0L, ((iVar.f3165c - 529) * 1000000) / format.W) + iVar.f3164b;
                                    iVar.f3165c += (long) iJ;
                                }
                            }
                            long j7 = this.Q0;
                            i iVar4 = this.f3213z0;
                            Format format4 = this.X;
                            iVar4.getClass();
                            this.Q0 = Math.max(j7, Math.max(0L, ((iVar4.f3165c - 529) * 1000000) / format4.W) + iVar4.f3164b);
                        }
                        if (fVar.c(Integer.MIN_VALUE)) {
                            this.T.add(Long.valueOf(jMax));
                        }
                        if (this.U0) {
                            arrayDeque = this.V;
                            if (arrayDeque.isEmpty()) {
                                ((r) arrayDeque.peekLast()).f3187c.a(jMax, this.X);
                            } else {
                                this.Y0.f3187c.a(jMax, this.X);
                            }
                            this.U0 = false;
                        }
                        this.Q0 = Math.max(this.Q0, jMax);
                        fVar.j();
                        if (fVar.c(268435456)) {
                            O(fVar);
                        }
                        a0(fVar);
                        if (zC) {
                            this.f3195g0.d(this.B0, cVar, jMax);
                        } else {
                            this.f3195g0.i(jMax, this.B0, fVar.f15010v.limit(), 0);
                        }
                        this.B0 = -1;
                        fVar.f15010v = null;
                        this.N0 = true;
                        this.K0 = 0;
                        this.X0.f5672c++;
                        return true;
                        return true;
                    }
                    if (this.K0 == 2) {
                        fVar.e();
                        this.K0 = 1;
                    }
                    this.S0 = true;
                    if (!this.N0) {
                        c0();
                        return false;
                    }
                    if (this.f3212y0) {
                        this.O0 = true;
                        this.f3195g0.i(0L, this.B0, 0, 4);
                        this.B0 = -1;
                        fVar.f15010v = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void H() {
        try {
            this.f3195g0.flush();
        } finally {
            h0();
        }
    }

    public final boolean I() {
        if (this.f3195g0 == null) {
            return false;
        }
        int i7 = this.M0;
        if (i7 == 3 || this.f3204q0 || ((this.f3205r0 && !this.P0) || (this.f3206s0 && this.O0))) {
            f0();
            return true;
        }
        if (i7 == 2) {
            int i10 = e0.f13788a;
            je.b.k(i10 >= 23);
            if (i10 >= 23) {
                try {
                    p0();
                } catch (com.google.android.exoplayer2.b e10) {
                    je.b.O("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    f0();
                    return true;
                }
            }
        }
        H();
        return false;
    }

    public final List J(boolean z5) {
        Format format = this.X;
        t tVar = this.M;
        ArrayList arrayListM = M(tVar, format, z5);
        if (!arrayListM.isEmpty() || !z5) {
            return arrayListM;
        }
        ArrayList arrayListM2 = M(tVar, this.X, false);
        if (!arrayListM2.isEmpty()) {
            je.b.N("MediaCodecRenderer", "Drm session requires secure decoder for " + this.X.I + ", but no secure decoder available. Trying to proceed with " + arrayListM2 + ".");
        }
        return arrayListM2;
    }

    public boolean K() {
        return false;
    }

    public abstract float L(float f2, Format[] formatArr);

    public abstract ArrayList M(t tVar, Format format, boolean z5);

    public abstract j N(o oVar, Format format, MediaCrypto mediaCrypto, float f2);

    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:186:0x0388  */
    /* JADX WARN: Code duplicated, block: B:231:0x041f  */
    /* JADX WARN: Code duplicated, block: B:258:0x047b  */
    public final void P(o oVar, MediaCrypto mediaCrypto) {
        float fL;
        int i7;
        boolean z5;
        boolean z6;
        char c8;
        String string;
        String str;
        String str2;
        String str3;
        String str4 = oVar.f3172a;
        int i10 = e0.f13788a;
        if (i10 < 23) {
            fL = -1.0f;
        } else {
            float f2 = this.f3194f0;
            Format[] formatArr = this.F;
            formatArr.getClass();
            fL = L(f2, formatArr);
        }
        if (fL <= this.O) {
            fL = -1.0f;
        }
        b0(this.X);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        j jVarN = N(oVar, this.X, mediaCrypto, fL);
        if (i10 >= 31) {
            c0 c0Var = this.f9606x;
            c0Var.getClass();
            p.a(jVarN, c0Var);
        }
        try {
            je.b.c("createCodec:" + str4);
            this.f3195g0 = this.L.h(jVarN);
            je.b.t();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (oVar.d(this.X)) {
                jElapsedRealtime2 = jElapsedRealtime2;
                fL = fL;
                jElapsedRealtime = jElapsedRealtime;
            } else {
                Format format = this.X;
                if (format == null) {
                    string = "null";
                } else {
                    String str5 = format.f5526e;
                    String str6 = format.f5528i;
                    int i11 = format.W;
                    int i12 = format.V;
                    float f7 = format.P;
                    ke.b bVar = format.U;
                    int i13 = format.O;
                    int i14 = format.N;
                    mc.i iVar = format.L;
                    String str7 = format.F;
                    int i15 = format.E;
                    int i16 = format.f5529v;
                    int i17 = format.f5530w;
                    StringBuilder sbN = kk.b.n("id=");
                    sbN.append(format.f5524d);
                    sbN.append(", mimeType=");
                    sbN.append(format.I);
                    int i18 = -1;
                    if (i15 != -1) {
                        sbN.append(", bitrate=");
                        sbN.append(i15);
                    }
                    if (str7 != null) {
                        sbN.append(", codecs=");
                        sbN.append(str7);
                    }
                    if (iVar != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        int i19 = 0;
                        c8 = ',';
                        while (i19 < iVar.f15561v) {
                            UUID uuid = iVar.f15558d[i19].f15554e;
                            if (uuid.equals(gc.h.f9670b)) {
                                linkedHashSet.add("cenc");
                            } else if (uuid.equals(gc.h.f9671c)) {
                                linkedHashSet.add("clearkey");
                            } else if (uuid.equals(gc.h.f9673e)) {
                                linkedHashSet.add("playready");
                            } else if (uuid.equals(gc.h.f9672d)) {
                                linkedHashSet.add("widevine");
                            } else {
                                if (uuid.equals(gc.h.f9669a)) {
                                    linkedHashSet.add("universal");
                                } else {
                                    linkedHashSet.add("unknown (" + uuid + ")");
                                }
                                i19++;
                                iVar = iVar;
                            }
                            i19++;
                            iVar = iVar;
                        }
                        sbN.append(", drm=[");
                        new a5.h(String.valueOf(','), 1).a(sbN, linkedHashSet);
                        sbN.append(']');
                        i18 = -1;
                    } else {
                        c8 = ',';
                    }
                    if (i14 != i18 && i13 != i18) {
                        sbN.append(", res=");
                        sbN.append(i14);
                        sbN.append("x");
                        sbN.append(i13);
                    }
                    if (bVar != null) {
                        int i20 = bVar.f14329i;
                        int i21 = bVar.f14328e;
                        int i22 = bVar.f14327d;
                        if (i22 != -1 && i21 != -1 && i20 != -1) {
                            sbN.append(", color=");
                            if (i22 == -1 || i21 == -1 || i20 == -1) {
                                str = "NA";
                            } else {
                                if (i22 == -1) {
                                    str2 = "Unset color space";
                                } else if (i22 == 6) {
                                    str2 = "BT2020";
                                } else if (i22 != 1) {
                                    str2 = i22 != 2 ? "Undefined color space" : "BT601";
                                } else {
                                    str2 = "BT709";
                                }
                                if (i21 == -1) {
                                    str3 = "Unset color range";
                                } else if (i21 != 1) {
                                    str3 = i21 != 2 ? "Undefined color range" : "Limited range";
                                } else {
                                    str3 = "Full range";
                                }
                                String strA = ke.b.a(i20);
                                int i23 = e0.f13788a;
                                Locale locale = Locale.US;
                                str = str2 + "/" + str3 + "/" + strA;
                            }
                            sbN.append(str);
                        }
                    }
                    if (f7 != -1.0f) {
                        sbN.append(", fps=");
                        sbN.append(f7);
                    }
                    if (i12 != -1) {
                        sbN.append(", channels=");
                        sbN.append(i12);
                    }
                    if (i11 != -1) {
                        sbN.append(", sample_rate=");
                        sbN.append(i11);
                    }
                    if (str6 != null) {
                        sbN.append(", language=");
                        sbN.append(str6);
                    }
                    if (str5 != null) {
                        sbN.append(", label=");
                        sbN.append(str5);
                    }
                    if (i16 != 0) {
                        ArrayList arrayList = new ArrayList();
                        if ((i16 & 4) != 0) {
                            arrayList.add("auto");
                        }
                        if ((i16 & 1) != 0) {
                            arrayList.add("default");
                        }
                        if ((i16 & 2) != 0) {
                            arrayList.add("forced");
                        }
                        sbN.append(", selectionFlags=[");
                        new a5.h(String.valueOf(c8), 1).a(sbN, arrayList);
                        sbN.append("]");
                    }
                    if (i17 != 0) {
                        ArrayList arrayList2 = new ArrayList();
                        if ((i17 & 1) != 0) {
                            arrayList2.add("main");
                        }
                        if ((i17 & 2) != 0) {
                            arrayList2.add("alt");
                        }
                        if ((i17 & 4) != 0) {
                            arrayList2.add("supplementary");
                        }
                        if ((i17 & 8) != 0) {
                            arrayList2.add("commentary");
                        }
                        if ((i17 & 16) != 0) {
                            arrayList2.add("dub");
                        }
                        if ((i17 & 32) != 0) {
                            arrayList2.add("emergency");
                        }
                        if ((i17 & 64) != 0) {
                            arrayList2.add("caption");
                        }
                        if ((i17 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                            arrayList2.add("subtitle");
                        }
                        if ((i17 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                            arrayList2.add("sign");
                        }
                        if ((i17 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
                            arrayList2.add("describes-video");
                        }
                        if ((i17 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                            arrayList2.add("describes-music");
                        }
                        if ((i17 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
                            arrayList2.add("enhanced-intelligibility");
                        }
                        if ((i17 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                            arrayList2.add("transcribes-dialog");
                        }
                        if ((i17 & 8192) != 0) {
                            arrayList2.add("easy-read");
                        }
                        if ((i17 & 16384) != 0) {
                            arrayList2.add("trick-play");
                        }
                        sbN.append(", roleFlags=[");
                        new a5.h(String.valueOf(c8), 1).a(sbN, arrayList2);
                        sbN.append("]");
                    }
                    string = sbN.toString();
                }
                Locale locale2 = Locale.US;
                str4 = str4;
                je.b.N("MediaCodecRenderer", s0.g.f("Format exceeds selected codec's capabilities [", string, ", ", str4, "]"));
            }
            this.f3201n0 = oVar;
            this.f3198k0 = fL;
            this.h0 = this.X;
            int i24 = e0.f13788a;
            if (i24 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str4)) {
                String str8 = e0.f13791d;
                if (str8.startsWith("SM-T585") || str8.startsWith("SM-A510") || str8.startsWith("SM-A520") || str8.startsWith("SM-J700")) {
                    i7 = 2;
                } else if (i24 < 24) {
                    i7 = 0;
                } else {
                    i7 = 0;
                }
            } else if (i24 < 24 || !("OMX.Nvidia.h264.decode".equals(str4) || "OMX.Nvidia.h264.decode.secure".equals(str4))) {
                i7 = 0;
            } else {
                String str9 = e0.f13789b;
                if ("flounder".equals(str9) || "flounder_lte".equals(str9) || "grouper".equals(str9) || "tilapia".equals(str9)) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
            }
            this.f3202o0 = i7;
            this.f3203p0 = i24 < 21 && this.h0.K.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str4);
            this.f3204q0 = i24 < 18 || (i24 == 18 && ("OMX.SEC.avc.dec".equals(str4) || "OMX.SEC.avc.dec.secure".equals(str4))) || (i24 == 19 && e0.f13791d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str4) || "OMX.Exynos.avc.dec.secure".equals(str4)));
            this.f3205r0 = i24 == 29 && "c2.android.aac.decoder".equals(str4);
            if (i24 > 23 || !"OMX.google.vorbis.decoder".equals(str4)) {
                if (i24 <= 19) {
                    String str10 = e0.f13789b;
                    z5 = ("hb2000".equals(str10) || "stvm8".equals(str10)) && ("OMX.amlogic.avc.decoder.awesome".equals(str4) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str4));
                }
            }
            this.f3206s0 = z5;
            this.f3207t0 = i24 == 21 && "OMX.google.aac.decoder".equals(str4);
            if (i24 < 21 && "OMX.SEC.mp3.dec".equals(str4) && "samsung".equals(e0.f13790c)) {
                String str11 = e0.f13789b;
                if (str11.startsWith("baffin") || str11.startsWith("grand") || str11.startsWith("fortuna") || str11.startsWith("gprimelte") || str11.startsWith("j2y18lte") || str11.startsWith("ms01")) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            this.f3208u0 = z6;
            this.f3209v0 = i24 <= 18 && this.h0.V == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str4);
            this.f3212y0 = (i24 <= 25 && "OMX.rk.video_decoder.avc".equals(str4)) || (i24 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str4)) || ((i24 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str4) || "OMX.bcm.vdec.avc.tunnel".equals(str4) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str4) || "OMX.bcm.vdec.hevc.tunnel".equals(str4) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) || (("Amazon".equals(e0.f13790c) && "AFTS".equals(e0.f13791d) && oVar.f3177f) || K()));
            this.f3195g0.getClass();
            if ("c2.android.mp3.decoder".equals(str4)) {
                this.f3213z0 = new i();
            }
            if (this.f9607y == 2) {
                this.A0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.X0.f5670a++;
            T(jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime, str4);
        } catch (Throwable th2) {
            je.b.t();
            throw th2;
        }
    }

    public final void Q() throws com.google.android.exoplayer2.b {
        Format format;
        if (this.f3195g0 != null || this.G0 || (format = this.X) == null) {
            return;
        }
        if (this.a0 == null && m0(format)) {
            Format format2 = this.X;
            D();
            String str = format2.I;
            boolean zEquals = "audio/mp4a-latm".equals(str);
            h hVar = this.S;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                hVar.getClass();
                hVar.H = 32;
            } else {
                hVar.getClass();
                hVar.H = 1;
            }
            this.G0 = true;
            return;
        }
        j0(this.a0);
        String str2 = this.X.I;
        mc.k kVar = this.Z;
        if (kVar != null) {
            lc.b bVarF = kVar.f();
            if (this.f3190b0 == null) {
                if (bVarF == null) {
                    if (this.Z.getError() == null) {
                        return;
                    }
                } else if (bVarF instanceof a0) {
                    a0 a0Var = (a0) bVarF;
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(a0Var.f15486a, a0Var.f15487b);
                        this.f3190b0 = mediaCrypto;
                        this.f3191c0 = !a0Var.f15488c && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e10) {
                        throw f(e10, this.X, false, 6006);
                    }
                }
            }
            if (a0.f15485d && (bVarF instanceof a0)) {
                int state = this.Z.getState();
                if (state == 1) {
                    mc.j error = this.Z.getError();
                    error.getClass();
                    throw f(error, this.X, false, error.f15562d);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            R(this.f3190b0, this.f3191c0);
        } catch (q e11) {
            throw f(e11, this.X, false, RNCWebViewManager.COMMAND_RELEASE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0053 A[SYNTHETIC] */
    public final void R(MediaCrypto mediaCrypto, boolean z5) throws q {
        q qVar;
        String str;
        q qVar2;
        String diagnosticInfo;
        if (this.f3199l0 == null) {
            try {
                List listJ = J(z5);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f3199l0 = arrayDeque;
                if (this.N) {
                    arrayDeque.addAll(listJ);
                } else {
                    ArrayList arrayList = (ArrayList) listJ;
                    if (!arrayList.isEmpty()) {
                        this.f3199l0.add((o) arrayList.get(0));
                    }
                }
                this.f3200m0 = null;
            } catch (w e10) {
                throw new q(this.X, e10, z5, -49998);
            }
        }
        if (this.f3199l0.isEmpty()) {
            throw new q(this.X, null, z5, -49999);
        }
        o oVar = (o) this.f3199l0.peekFirst();
        while (this.f3195g0 == null) {
            o oVar2 = (o) this.f3199l0.peekFirst();
            if (!l0(oVar2)) {
                return;
            }
            try {
                P(oVar2, mediaCrypto);
            } catch (Exception e11) {
                if (oVar2 != oVar) {
                    throw e11;
                }
                try {
                    je.b.N("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                    Thread.sleep(50L);
                    P(oVar2, mediaCrypto);
                } catch (Exception e12) {
                    je.b.O("MediaCodecRenderer", "Failed to initialize decoder: " + oVar2, e12);
                    this.f3199l0.removeFirst();
                    Format format = this.X;
                    String str2 = "Decoder init failed: " + oVar2.f3172a + ", " + format;
                    String str3 = format.I;
                    if (e0.f13788a >= 21) {
                        if (e12 instanceof MediaCodec.CodecException) {
                            diagnosticInfo = ((MediaCodec.CodecException) e12).getDiagnosticInfo();
                        } else {
                            diagnosticInfo = null;
                        }
                        str = diagnosticInfo;
                    } else {
                        str = null;
                    }
                    qVar = new q(str2, e12, str3, z5, oVar2, str);
                    S(qVar);
                    qVar2 = this.f3200m0;
                    if (qVar2 == null) {
                        this.f3200m0 = qVar;
                    } else {
                        this.f3200m0 = new q(qVar2.getMessage(), qVar2.getCause(), qVar2.f3180d, qVar2.f3181e, qVar2.f3182i, qVar2.f3183v);
                    }
                    if (!this.f3199l0.isEmpty()) {
                        throw this.f3200m0;
                    }
                }
                je.b.O("MediaCodecRenderer", "Failed to initialize decoder: " + oVar2, e12);
                this.f3199l0.removeFirst();
                Format format2 = this.X;
                String str4 = "Decoder init failed: " + oVar2.f3172a + ", " + format2;
                String str5 = format2.I;
                if (e0.f13788a >= 21) {
                    if (e12 instanceof MediaCodec.CodecException) {
                        diagnosticInfo = ((MediaCodec.CodecException) e12).getDiagnosticInfo();
                    } else {
                        diagnosticInfo = null;
                    }
                    str = diagnosticInfo;
                } else {
                    str = null;
                }
                qVar = new q(str4, e12, str5, z5, oVar2, str);
                S(qVar);
                qVar2 = this.f3200m0;
                if (qVar2 == null) {
                    this.f3200m0 = qVar;
                } else {
                    this.f3200m0 = new q(qVar2.getMessage(), qVar2.getCause(), qVar2.f3180d, qVar2.f3181e, qVar2.f3182i, qVar2.f3183v);
                }
                if (!this.f3199l0.isEmpty()) {
                    throw this.f3200m0;
                }
            }
        }
        this.f3199l0 = null;
    }

    public abstract void S(Exception exc);

    public abstract void T(long j, long j5, String str);

    public abstract void U(String str);

    /* JADX WARN: Code duplicated, block: B:73:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ec  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ae, code lost:
    
        if (r14 != false) goto L127;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.exoplayer2.decoder.DecoderReuseEvaluation V(e4.r r14) throws com.google.android.exoplayer2.b {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.s.V(e4.r):com.google.android.exoplayer2.decoder.DecoderReuseEvaluation");
    }

    public abstract void W(Format format, MediaFormat mediaFormat);

    public void Y(long j) {
        this.Z0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.V;
            if (arrayDeque.isEmpty() || j < ((r) arrayDeque.peek()).f3185a) {
                return;
            }
            k0((r) arrayDeque.poll());
            Z();
        }
    }

    public abstract void Z();

    public abstract void a0(lc.f fVar);

    public final void c0() throws com.google.android.exoplayer2.b {
        int i7 = this.M0;
        if (i7 == 1) {
            H();
            return;
        }
        if (i7 == 2) {
            H();
            p0();
        } else if (i7 != 3) {
            this.T0 = true;
            g0();
        } else {
            f0();
            Q();
        }
    }

    public abstract boolean d0(long j, long j5, l lVar, ByteBuffer byteBuffer, int i7, int i10, int i11, long j7, boolean z5, boolean z6, Format format);

    public final boolean e0(int i7) throws com.google.android.exoplayer2.b {
        e4.r rVar = this.f9603i;
        rVar.y();
        lc.f fVar = this.P;
        fVar.e();
        int iT = t(rVar, fVar, i7 | 4);
        if (iT == -5) {
            V(rVar);
            return true;
        }
        if (iT != -4 || !fVar.c(4)) {
            return false;
        }
        this.S0 = true;
        c0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f0() {
        try {
            l lVar = this.f3195g0;
            if (lVar != null) {
                lVar.release();
                this.X0.f5671b++;
                U(this.f3201n0.f3172a);
            }
            this.f3195g0 = null;
            try {
                MediaCrypto mediaCrypto = this.f3190b0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f3190b0 = null;
                j0(null);
                i0();
            }
        } catch (Throwable th2) {
            this.f3195g0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f3190b0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
                this.f3190b0 = null;
                j0(null);
                i0();
            }
        }
    }

    public void h0() {
        this.B0 = -1;
        this.Q.f15010v = null;
        this.C0 = -1;
        this.D0 = null;
        this.A0 = -9223372036854775807L;
        this.O0 = false;
        this.N0 = false;
        this.f3210w0 = false;
        this.f3211x0 = false;
        this.E0 = false;
        this.F0 = false;
        this.T.clear();
        this.Q0 = -9223372036854775807L;
        this.R0 = -9223372036854775807L;
        this.Z0 = -9223372036854775807L;
        i iVar = this.f3213z0;
        if (iVar != null) {
            iVar.f3164b = 0L;
            iVar.f3165c = 0L;
            iVar.f3163a = false;
        }
        this.L0 = 0;
        this.M0 = 0;
        this.K0 = this.J0 ? 1 : 0;
    }

    public final void i0() {
        h0();
        this.W0 = null;
        this.f3213z0 = null;
        this.f3199l0 = null;
        this.f3201n0 = null;
        this.h0 = null;
        this.f3196i0 = null;
        this.f3197j0 = false;
        this.P0 = false;
        this.f3198k0 = -1.0f;
        this.f3202o0 = 0;
        this.f3203p0 = false;
        this.f3204q0 = false;
        this.f3205r0 = false;
        this.f3206s0 = false;
        this.f3207t0 = false;
        this.f3208u0 = false;
        this.f3209v0 = false;
        this.f3212y0 = false;
        this.J0 = false;
        this.K0 = 0;
        this.f3191c0 = false;
    }

    public final void j0(mc.k kVar) {
        mc.k kVar2 = this.Z;
        if (kVar2 != kVar) {
            if (kVar != null) {
                kVar.b(null);
            }
            if (kVar2 != null) {
                kVar2.d(null);
            }
        }
        this.Z = kVar;
    }

    @Override // gc.e
    public boolean k() {
        boolean zIsReady;
        if (this.X != null) {
            if (i()) {
                zIsReady = this.I;
            } else {
                md.o0 o0Var = this.E;
                o0Var.getClass();
                zIsReady = o0Var.isReady();
            }
            if (!zIsReady) {
                if ((this.C0 >= 0) || (this.A0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.A0)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void k0(r rVar) {
        this.Y0 = rVar;
        if (rVar.f3186b != -9223372036854775807L) {
            this.f3189a1 = true;
            X();
        }
    }

    @Override // gc.e
    public void l() {
        this.X = null;
        k0(r.f3184d);
        this.V.clear();
        I();
    }

    public boolean l0(o oVar) {
        return true;
    }

    public boolean m0(Format format) {
        return false;
    }

    @Override // gc.e
    public void n(long j, boolean z5) throws com.google.android.exoplayer2.b {
        int i7;
        this.S0 = false;
        this.T0 = false;
        this.V0 = false;
        if (this.G0) {
            this.S.e();
            this.R.e();
            this.H0 = false;
            o0 o0Var = this.W;
            o0Var.getClass();
            o0Var.f11594c = ic.n.f11577a;
            o0Var.f11593b = 0;
            o0Var.f11592a = 2;
        } else if (I()) {
            Q();
        }
        v1 v1Var = this.Y0.f3187c;
        synchronized (v1Var) {
            i7 = v1Var.f6155e;
        }
        if (i7 > 0) {
            this.U0 = true;
        }
        this.Y0.f3187c.b();
        this.V.clear();
    }

    public abstract int n0(t tVar, Format format);

    public final boolean o0(Format format) throws com.google.android.exoplayer2.b {
        if (e0.f13788a >= 23 && this.f3195g0 != null && this.M0 != 3 && this.f9607y != 0) {
            float f2 = this.f3194f0;
            Format[] formatArr = this.F;
            formatArr.getClass();
            float fL = L(f2, formatArr);
            float f7 = this.f3198k0;
            if (f7 != fL) {
                if (fL == -1.0f) {
                    if (this.N0) {
                        this.L0 = 1;
                        this.M0 = 3;
                        return false;
                    }
                    f0();
                    Q();
                    return false;
                }
                if (f7 != -1.0f || fL > this.O) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fL);
                    this.f3195g0.setParameters(bundle);
                    this.f3198k0 = fL;
                }
            }
        }
        return true;
    }

    public final void p0() throws com.google.android.exoplayer2.b {
        lc.b bVarF = this.a0.f();
        if (bVarF instanceof a0) {
            try {
                this.f3190b0.setMediaDrmSession(((a0) bVarF).f15487b);
            } catch (MediaCryptoException e10) {
                throw f(e10, this.X, false, 6006);
            }
        }
        j0(this.a0);
        this.L0 = 0;
        this.M0 = 0;
    }

    public final void q0(long j) {
        Object objN;
        Object objO;
        v1 v1Var = this.Y0.f3187c;
        synchronized (v1Var) {
            objN = v1Var.n(j, true);
        }
        Format format = (Format) objN;
        if (format == null && this.f3189a1 && this.f3196i0 != null) {
            v1 v1Var2 = this.Y0.f3187c;
            synchronized (v1Var2) {
                objO = v1Var2.f6155e == 0 ? null : v1Var2.o();
            }
            format = (Format) objO;
        }
        if (format != null) {
            this.Y = format;
        } else if (!this.f3197j0 || this.Y == null) {
            return;
        }
        W(this.Y, this.f3196i0);
        this.f3197j0 = false;
        this.f3189a1 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r2 >= r7) goto L14;
     */
    @Override // gc.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(com.google.android.exoplayer2.Format[] r6, long r7, long r9) {
        /*
            r5 = this;
            bd.r r6 = r5.Y0
            long r6 = r6.f3186b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L16
            bd.r r6 = new bd.r
            r6.<init>(r0, r9)
            r5.k0(r6)
            return
        L16:
            java.util.ArrayDeque r6 = r5.V
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L42
            long r7 = r5.Q0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L2e
            long r2 = r5.Z0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L42
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L42
        L2e:
            bd.r r6 = new bd.r
            r6.<init>(r0, r9)
            r5.k0(r6)
            bd.r r6 = r5.Y0
            long r6 = r6.f3186b
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L41
            r5.Z()
        L41:
            return
        L42:
            bd.r r7 = new bd.r
            long r0 = r5.Q0
            r7.<init>(r0, r9)
            r6.add(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.s.s(com.google.android.exoplayer2.Format[], long, long):void");
    }

    @Override // gc.e
    public void u(long j, long j5) throws com.google.android.exoplayer2.b {
        boolean z5 = false;
        if (this.V0) {
            this.V0 = false;
            c0();
        }
        com.google.android.exoplayer2.b bVar = this.W0;
        if (bVar != null) {
            this.W0 = null;
            throw bVar;
        }
        try {
            if (this.T0) {
                g0();
                return;
            }
            if (this.X != null || e0(2)) {
                Q();
                if (this.G0) {
                    je.b.c("bypassRender");
                    while (A(j, j5)) {
                    }
                    je.b.t();
                } else if (this.f3195g0 != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    je.b.c("drainAndFeed");
                    while (F(j, j5)) {
                        long j7 = this.f3192d0;
                        if (!(j7 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j7)) {
                            break;
                        }
                    }
                    while (G()) {
                        long j10 = this.f3192d0;
                        if (!(j10 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j10)) {
                            break;
                        }
                    }
                    je.b.t();
                } else {
                    DecoderCounters decoderCounters = this.X0;
                    int i7 = decoderCounters.f5673d;
                    md.o0 o0Var = this.E;
                    o0Var.getClass();
                    decoderCounters.f5673d = i7 + o0Var.f(j - this.G);
                    e0(1);
                }
                synchronized (this.X0) {
                }
            }
        } catch (IllegalStateException e10) {
            int i10 = e0.f13788a;
            if (i10 < 21 || !(e10 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e10.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e10;
                }
            }
            S(e10);
            if (i10 >= 21) {
                if (e10 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e10).isRecoverable() : false) {
                    z5 = true;
                }
            }
            if (z5) {
                f0();
            }
            throw f(C(e10, this.f3201n0), this.X, z5, 4003);
        }
    }

    @Override // gc.e
    public void x(float f2, float f7) throws com.google.android.exoplayer2.b {
        this.f3193e0 = f2;
        this.f3194f0 = f7;
        o0(this.h0);
    }

    @Override // gc.e
    public final int y(Format format) throws com.google.android.exoplayer2.b {
        try {
            return n0(this.M, format);
        } catch (w e10) {
            throw f(e10, format, false, 4002);
        }
    }

    @Override // gc.e
    public final int z() {
        return 8;
    }

    public void X() {
    }

    public void g0() {
    }

    public void O(lc.f fVar) {
    }

    public void b0(Format format) {
    }
}
