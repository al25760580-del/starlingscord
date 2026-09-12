package pp;

import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends vp.n {
    public static final e M;
    public static final a N = new a(2);
    public int E;
    public int F;
    public h G;
    public List H;
    public int I;
    public int J;
    public byte K;
    public int L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vp.d f18252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18253e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f18254i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f18255v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f18256w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public double f18257x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18258y;

    static {
        e eVar = new e();
        M = eVar;
        eVar.i();
    }

    public e() {
        this.K = (byte) -1;
        this.L = -1;
        this.f18252d = vp.d.f21871d;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.K;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f18253e & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128 && !this.G.b()) {
            this.K = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.H.size(); i7++) {
            if (!((e) this.H.get(i7)).b()) {
                this.K = (byte) 0;
                return false;
            }
        }
        this.K = (byte) 1;
        return true;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.L;
        if (i7 != -1) {
            return i7;
        }
        int iC = (this.f18253e & 1) == 1 ? v1.c(1, this.f18254i.f18242d) : 0;
        if ((this.f18253e & 2) == 2) {
            long j = this.f18255v;
            iC += v1.i((j >> 63) ^ (j << 1)) + v1.j(2);
        }
        if ((this.f18253e & 4) == 4) {
            iC += v1.j(3) + 4;
        }
        if ((this.f18253e & 8) == 8) {
            iC += v1.j(4) + 8;
        }
        if ((this.f18253e & 16) == 16) {
            iC += v1.d(5, this.f18258y);
        }
        if ((this.f18253e & 32) == 32) {
            iC += v1.d(6, this.E);
        }
        if ((this.f18253e & 64) == 64) {
            iC += v1.d(7, this.F);
        }
        if ((this.f18253e & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            iC += v1.f(8, this.G);
        }
        for (int i10 = 0; i10 < this.H.size(); i10++) {
            iC += v1.f(9, (vp.a) this.H.get(i10));
        }
        if ((this.f18253e & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            iC += v1.d(10, this.J);
        }
        if ((this.f18253e & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            iC += v1.d(11, this.I);
        }
        int size = this.f18252d.size() + iC;
        this.L = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        return c.g();
    }

    @Override // vp.a
    public final vp.i e() {
        c cVarG = c.g();
        cVarG.h(this);
        return cVarG;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        if ((this.f18253e & 1) == 1) {
            v1Var.q(1, this.f18254i.f18242d);
        }
        if ((this.f18253e & 2) == 2) {
            long j = this.f18255v;
            v1Var.C(2, 0);
            v1Var.B((j >> 63) ^ (j << 1));
        }
        if ((this.f18253e & 4) == 4) {
            float f2 = this.f18256w;
            v1Var.C(3, 5);
            v1Var.y(Float.floatToRawIntBits(f2));
        }
        if ((this.f18253e & 8) == 8) {
            double d6 = this.f18257x;
            v1Var.C(4, 1);
            v1Var.z(Double.doubleToRawLongBits(d6));
        }
        if ((this.f18253e & 16) == 16) {
            v1Var.r(5, this.f18258y);
        }
        if ((this.f18253e & 32) == 32) {
            v1Var.r(6, this.E);
        }
        if ((this.f18253e & 64) == 64) {
            v1Var.r(7, this.F);
        }
        if ((this.f18253e & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            v1Var.t(8, this.G);
        }
        for (int i7 = 0; i7 < this.H.size(); i7++) {
            v1Var.t(9, (vp.a) this.H.get(i7));
        }
        if ((this.f18253e & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            v1Var.r(10, this.J);
        }
        if ((this.f18253e & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            v1Var.r(11, this.I);
        }
        v1Var.w(this.f18252d);
    }

    public final void i() {
        this.f18254i = d.BYTE;
        this.f18255v = 0L;
        this.f18256w = 0.0f;
        this.f18257x = 0.0d;
        this.f18258y = 0;
        this.E = 0;
        this.F = 0;
        this.G = h.f18301y;
        this.H = Collections.EMPTY_LIST;
        this.I = 0;
        this.J = 0;
    }

    public e(c cVar) {
        this.K = (byte) -1;
        this.L = -1;
        this.f18252d = cVar.f21889d;
    }

    public e(vp.e eVar, vp.g gVar) {
        g gVar2;
        this.K = (byte) -1;
        this.L = -1;
        i();
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        boolean z5 = false;
        char c8 = 0;
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            int iK = eVar.k();
                            d dVarB = d.b(iK);
                            if (dVarB == null) {
                                v1VarM.A(iN);
                                v1VarM.A(iK);
                            } else {
                                this.f18253e |= 1;
                                this.f18254i = dVarB;
                                continue;
                            }
                            break;
                        case 16:
                            this.f18253e |= 2;
                            long jL = eVar.l();
                            this.f18255v = (-(jL & 1)) ^ (jL >>> 1);
                            continue;
                        case 29:
                            this.f18253e |= 4;
                            this.f18256w = Float.intBitsToFloat(eVar.i());
                            continue;
                        case 33:
                            this.f18253e |= 8;
                            this.f18257x = Double.longBitsToDouble(eVar.j());
                            continue;
                        case 40:
                            this.f18253e |= 16;
                            this.f18258y = eVar.k();
                            continue;
                        case 48:
                            this.f18253e |= 32;
                            this.E = eVar.k();
                            continue;
                        case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                            this.f18253e |= 64;
                            this.F = eVar.k();
                            continue;
                        case 66:
                            if ((this.f18253e & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                                h hVar = this.G;
                                hVar.getClass();
                                gVar2 = new g(0);
                                gVar2.f18291v = Collections.EMPTY_LIST;
                                gVar2.j(hVar);
                            } else {
                                gVar2 = null;
                            }
                            h hVar2 = (h) eVar.g(h.E, gVar);
                            this.G = hVar2;
                            if (gVar2 != null) {
                                gVar2.j(hVar2);
                                this.G = gVar2.f();
                            }
                            this.f18253e |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                            continue;
                        case 74:
                            if ((c8 & 256) != 256) {
                                this.H = new ArrayList();
                                c8 = 256;
                            }
                            this.H.add(eVar.g(N, gVar));
                            continue;
                        case 80:
                            this.f18253e |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                            this.J = eVar.k();
                            continue;
                        case 88:
                            this.f18253e |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            this.I = eVar.k();
                            continue;
                        default:
                            if (!eVar.q(iN, v1VarM)) {
                                break;
                            }
                            break;
                    }
                    z5 = true;
                } catch (Throwable th2) {
                    if ((c8 & 256) == 256) {
                        this.H = Collections.unmodifiableList(this.H);
                    }
                    try {
                        v1VarM.l();
                    } catch (IOException unused) {
                    } finally {
                        this.f18252d = cVar.g();
                    }
                    throw th2;
                }
            } catch (vp.q e10) {
                e10.f21916d = this;
                throw e10;
            } catch (IOException e11) {
                vp.q qVar = new vp.q(e11.getMessage());
                qVar.f21916d = this;
                throw qVar;
            }
        }
        if ((c8 & 256) == 256) {
            this.H = Collections.unmodifiableList(this.H);
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18252d = cVar.g();
        }
    }
}
