package vd;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.text.CueGroup;
import e4.r;
import ei.r0;
import gc.o;
import gc.w;
import java.util.List;
import je.e0;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gc.e implements Handler.Callback {
    public final Handler L;
    public final w M;
    public final i N;
    public final r O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public Format T;
    public g U;
    public j V;
    public d W;
    public d X;
    public int Y;
    public long Z;
    public long a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f21661b0;

    public k(w wVar, Looper looper) {
        Handler handler;
        super(3);
        this.M = wVar;
        if (looper == null) {
            handler = null;
        } else {
            int i7 = e0.f13788a;
            handler = new Handler(looper, this);
        }
        this.L = handler;
        this.N = i.f21660a;
        this.O = new r(7);
        this.Z = -9223372036854775807L;
        this.a0 = -9223372036854775807L;
        this.f21661b0 = -9223372036854775807L;
    }

    public final long A() {
        if (this.Y == -1) {
            return LongCompanionObject.MAX_VALUE;
        }
        this.W.getClass();
        return this.Y >= this.W.o() ? LongCompanionObject.MAX_VALUE : this.W.h(this.Y);
    }

    public final long B(long j) {
        je.b.k(j != -9223372036854775807L);
        je.b.k(this.a0 != -9223372036854775807L);
        return j - this.a0;
    }

    public final void C() {
        g aVar;
        byte b10 = 1;
        this.R = true;
        Format format = this.T;
        format.getClass();
        this.N.getClass();
        String str = format.I;
        int i7 = format.a0;
        List list = format.K;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    b10 = !str.equals("application/dvbsubs") ? (byte) -1 : (byte) 0;
                    break;
                case -1248334819:
                    if (!str.equals("application/pgs")) {
                        b10 = -1;
                    }
                    break;
                case -1026075066:
                    b10 = !str.equals("application/x-mp4-vtt") ? (byte) -1 : (byte) 2;
                    break;
                case -1004728940:
                    b10 = !str.equals("text/vtt") ? (byte) -1 : (byte) 3;
                    break;
                case 691401887:
                    b10 = !str.equals("application/x-quicktime-tx3g") ? (byte) -1 : (byte) 4;
                    break;
                case 822864842:
                    b10 = !str.equals("text/x-ssa") ? (byte) -1 : (byte) 5;
                    break;
                case 930165504:
                    b10 = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 6;
                    break;
                case 1201784583:
                    b10 = !str.equals("text/x-exoplayer-cues") ? (byte) -1 : (byte) 7;
                    break;
                case 1566015601:
                    b10 = !str.equals("application/cea-608") ? (byte) -1 : (byte) 8;
                    break;
                case 1566016562:
                    b10 = !str.equals("application/cea-708") ? (byte) -1 : (byte) 9;
                    break;
                case 1668750253:
                    b10 = !str.equals("application/x-subrip") ? (byte) -1 : (byte) 10;
                    break;
                case 1693976202:
                    b10 = !str.equals("application/ttml+xml") ? (byte) -1 : (byte) 11;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    aVar = new ee.a(list);
                    break;
                case 1:
                    aVar = new yd.b();
                    break;
                case 2:
                    aVar = new ee.a();
                    break;
                case 3:
                    aVar = new ee.j();
                    break;
                case 4:
                    aVar = new de.a(list);
                    break;
                case 5:
                    aVar = new ae.a(list);
                    break;
                case 6:
                case 8:
                    aVar = new wd.c(str, i7);
                    break;
                case 7:
                    aVar = new lh.d(2);
                    break;
                case 9:
                    aVar = new wd.f(i7, list);
                    break;
                case 10:
                    aVar = new be.a();
                    break;
                case 11:
                    aVar = new ce.d();
                    break;
            }
            this.U = aVar;
            return;
        }
        throw new IllegalArgumentException(a3.e.l("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final void D() {
        this.V = null;
        this.Y = -1;
        d dVar = this.W;
        if (dVar != null) {
            dVar.e();
            this.W = null;
        }
        d dVar2 = this.X;
        if (dVar2 != null) {
            dVar2.e();
            this.X = null;
        }
    }

    @Override // gc.e
    public final String h() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        CueGroup cueGroup = (CueGroup) message.obj;
        ei.e0 e0Var = cueGroup.f5726d;
        w wVar = this.M;
        wVar.f9916d.f5654l.e(27, new o(1, e0Var));
        com.google.android.exoplayer2.c cVar = wVar.f9916d;
        cVar.f5640b0 = cueGroup;
        cVar.f5654l.e(27, new o(2, cueGroup));
        return true;
    }

    @Override // gc.e
    public final boolean j() {
        return this.Q;
    }

    @Override // gc.e
    public final boolean k() {
        return true;
    }

    @Override // gc.e
    public final void l() {
        this.T = null;
        this.Z = -9223372036854775807L;
        r0 r0Var = r0.f8352w;
        B(this.f21661b0);
        CueGroup cueGroup = new CueGroup(r0Var);
        Handler handler = this.L;
        if (handler != null) {
            handler.obtainMessage(0, cueGroup).sendToTarget();
        } else {
            w wVar = this.M;
            wVar.f9916d.f5654l.e(27, new o(1, cueGroup.f5726d));
            com.google.android.exoplayer2.c cVar = wVar.f9916d;
            cVar.f5640b0 = cueGroup;
            cVar.f5654l.e(27, new o(2, cueGroup));
        }
        this.a0 = -9223372036854775807L;
        this.f21661b0 = -9223372036854775807L;
        D();
        g gVar = this.U;
        gVar.getClass();
        gVar.release();
        this.U = null;
        this.S = 0;
    }

    @Override // gc.e
    public final void n(long j, boolean z5) {
        this.f21661b0 = j;
        r0 r0Var = r0.f8352w;
        B(this.f21661b0);
        CueGroup cueGroup = new CueGroup(r0Var);
        Handler handler = this.L;
        if (handler != null) {
            handler.obtainMessage(0, cueGroup).sendToTarget();
        } else {
            w wVar = this.M;
            wVar.f9916d.f5654l.e(27, new o(1, cueGroup.f5726d));
            com.google.android.exoplayer2.c cVar = wVar.f9916d;
            cVar.f5640b0 = cueGroup;
            cVar.f5654l.e(27, new o(2, cueGroup));
        }
        this.P = false;
        this.Q = false;
        this.Z = -9223372036854775807L;
        if (this.S == 0) {
            D();
            g gVar = this.U;
            gVar.getClass();
            gVar.flush();
            return;
        }
        D();
        g gVar2 = this.U;
        gVar2.getClass();
        gVar2.release();
        this.U = null;
        this.S = 0;
        C();
    }

    @Override // gc.e
    public final void s(Format[] formatArr, long j, long j5) {
        this.a0 = j5;
        this.T = formatArr[0];
        if (this.U != null) {
            this.S = 1;
        } else {
            C();
        }
    }

    @Override // gc.e
    public final void u(long j, long j5) {
        boolean z5;
        int i7;
        String str;
        int i10;
        long jH;
        r rVar = this.O;
        this.f21661b0 = j;
        if (this.I) {
            long j7 = this.Z;
            if (j7 != -9223372036854775807L && j >= j7) {
                D();
                this.Q = true;
            }
        }
        if (this.Q) {
            return;
        }
        d dVar = this.X;
        w wVar = this.M;
        Handler handler = this.L;
        if (dVar == null) {
            g gVar = this.U;
            gVar.getClass();
            gVar.b(j);
            try {
                g gVar2 = this.U;
                gVar2.getClass();
                this.X = (d) gVar2.c();
            } catch (h e10) {
                je.b.s("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.T, e10);
                r0 r0Var = r0.f8352w;
                B(this.f21661b0);
                CueGroup cueGroup = new CueGroup(r0Var);
                if (handler != null) {
                    handler.obtainMessage(0, cueGroup).sendToTarget();
                } else {
                    wVar.f9916d.f5654l.e(27, new o(1, cueGroup.f5726d));
                    com.google.android.exoplayer2.c cVar = wVar.f9916d;
                    cVar.f5640b0 = cueGroup;
                    cVar.f5654l.e(27, new o(2, cueGroup));
                }
                D();
                g gVar3 = this.U;
                gVar3.getClass();
                gVar3.release();
                this.U = null;
                this.S = 0;
                C();
                return;
            }
        }
        if (this.f9607y != 2) {
            return;
        }
        if (this.W != null) {
            long jA = A();
            z5 = false;
            while (jA <= j) {
                this.Y++;
                jA = A();
                z5 = true;
            }
        } else {
            z5 = false;
        }
        d dVar2 = this.X;
        if (dVar2 == null) {
            i7 = 1;
            str = "Subtitle decoding failed. streamFormat=";
        } else if (dVar2.c(4)) {
            if (!z5 && A() == LongCompanionObject.MAX_VALUE) {
                if (this.S == 2) {
                    D();
                    g gVar4 = this.U;
                    gVar4.getClass();
                    gVar4.release();
                    this.U = null;
                    this.S = 0;
                    C();
                } else {
                    D();
                    this.Q = true;
                }
            }
            i7 = 1;
            str = "Subtitle decoding failed. streamFormat=";
        } else {
            i7 = 1;
            str = "Subtitle decoding failed. streamFormat=";
            if (dVar2.f15014i <= j) {
                d dVar3 = this.W;
                if (dVar3 != null) {
                    dVar3.e();
                }
                this.Y = dVar2.f(j);
                this.W = dVar2;
                this.X = null;
                z5 = true;
            }
        }
        if (z5) {
            this.W.getClass();
            int iF = this.W.f(j);
            if (iF == 0 || this.W.o() == 0) {
                jH = this.W.f15014i;
            } else if (iF == -1) {
                d dVar4 = this.W;
                jH = dVar4.h(dVar4.o() - 1);
            } else {
                jH = this.W.h(iF - 1);
            }
            B(jH);
            CueGroup cueGroup2 = new CueGroup(this.W.l(j));
            if (handler != null) {
                handler.obtainMessage(0, cueGroup2).sendToTarget();
            } else {
                wVar.f9916d.f5654l.e(27, new o(1, cueGroup2.f5726d));
                com.google.android.exoplayer2.c cVar2 = wVar.f9916d;
                cVar2.f5640b0 = cueGroup2;
                cVar2.f5654l.e(27, new o(2, cueGroup2));
            }
        }
        if (this.S == 2) {
            return;
        }
        while (!this.P) {
            try {
                j jVar = this.V;
                if (jVar == null) {
                    g gVar5 = this.U;
                    gVar5.getClass();
                    jVar = (j) gVar5.d();
                    if (jVar == null) {
                        return;
                    } else {
                        this.V = jVar;
                    }
                }
                if (this.S == i7) {
                    jVar.f14999e = 4;
                    g gVar6 = this.U;
                    gVar6.getClass();
                    gVar6.a(jVar);
                    this.V = null;
                    this.S = 2;
                    return;
                }
                int iT = t(rVar, jVar, 0);
                if (iT == -4) {
                    if (jVar.c(4)) {
                        this.P = true;
                        this.R = false;
                        i10 = 1;
                    } else {
                        Format format = (Format) rVar.f8035i;
                        if (format == null) {
                            return;
                        }
                        jVar.F = format.M;
                        jVar.j();
                        i10 = 1;
                        this.R &= !jVar.c(1);
                    }
                    if (!this.R) {
                        g gVar7 = this.U;
                        gVar7.getClass();
                        gVar7.a(jVar);
                        this.V = null;
                    }
                } else {
                    i10 = 1;
                    if (iT == -3) {
                        return;
                    }
                }
                i7 = i10;
            } catch (h e11) {
                je.b.s("TextRenderer", str + this.T, e11);
                r0 r0Var2 = r0.f8352w;
                B(this.f21661b0);
                CueGroup cueGroup3 = new CueGroup(r0Var2);
                if (handler != null) {
                    handler.obtainMessage(0, cueGroup3).sendToTarget();
                } else {
                    wVar.f9916d.f5654l.e(27, new o(1, cueGroup3.f5726d));
                    com.google.android.exoplayer2.c cVar3 = wVar.f9916d;
                    cVar3.f5640b0 = cueGroup3;
                    cVar3.f5654l.e(27, new o(2, cueGroup3));
                }
                D();
                g gVar8 = this.U;
                gVar8.getClass();
                gVar8.release();
                this.U = null;
                this.S = 0;
                C();
                return;
            }
        }
    }

    @Override // gc.e
    public final int y(Format format) {
        this.N.getClass();
        String str = format.I;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) {
            return gc.e.e(format.f5525d0 == 0 ? 4 : 2, 0, 0);
        }
        return je.o.k(format.I) ? gc.e.e(1, 0, 0) : gc.e.e(0, 0, 0);
    }
}
