package wc;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import gc.g0;
import gc.h1;
import hd.i;
import ic.n0;
import java.io.EOFException;
import je.e0;
import je.w;
import org.webrtc.PeerConnection;
import pc.j;
import pc.k;
import pc.l;
import pc.m;
import pc.n;
import pc.q;
import pc.r;
import pc.x;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f22097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f22098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f22099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f22100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f22101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m f22102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f22103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x f22104i;
    public int j;
    public Metadata k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f22105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f22106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f22107n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22108o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f22109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f22110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f22111r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f22112s;

    public d(int i7) {
        this(-9223372036854775807L);
    }

    public final a a(l lVar, boolean z5) {
        w wVar = this.f22097b;
        lVar.C(wVar.f13860a, 0, 4);
        wVar.F(0);
        int iG = wVar.g();
        n0 n0Var = this.f22098c;
        n0Var.d(iG);
        return new a(lVar.getLength(), lVar.getPosition(), n0Var.f11582e, n0Var.f11579b, z5);
    }

    public final boolean b(l lVar) {
        f fVar = this.f22109p;
        if (fVar != null) {
            long jA = fVar.a();
            if (jA == -1 || lVar.m() <= jA - 4) {
            }
            return true;
        }
        try {
            return !lVar.g(this.f22097b.f13860a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    public final boolean c(l lVar, boolean z5) throws h1, EOFException {
        int iM;
        int i7;
        int iE;
        int i10 = z5 ? PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS : 131072;
        lVar.t();
        if (lVar.getPosition() == 0) {
            w wVar = (w) this.f22100e.f17922d;
            Metadata metadataE = null;
            int i11 = 0;
            while (true) {
                try {
                    lVar.C(wVar.f13860a, 0, 10);
                    wVar.F(0);
                    if (wVar.w() != 4801587) {
                        break;
                    }
                    wVar.G(3);
                    int iT = wVar.t();
                    int i12 = iT + 10;
                    if (metadataE == null) {
                        byte[] bArr = new byte[i12];
                        System.arraycopy(wVar.f13860a, 0, bArr, 0, 10);
                        lVar.C(bArr, 10, iT);
                        metadataE = new i(null).E(bArr, i12);
                    } else {
                        lVar.n(iT);
                    }
                    i11 += i12;
                } catch (EOFException unused) {
                }
            }
            lVar.t();
            lVar.n(i11);
            this.k = metadataE;
            if (metadataE != null) {
                this.f22099d.b(metadataE);
            }
            iM = (int) lVar.m();
            if (!z5) {
                lVar.u(iM);
            }
            i7 = 0;
        } else {
            iM = 0;
            i7 = 0;
        }
        int i13 = i7;
        int i14 = i13;
        while (true) {
            if (b(lVar)) {
                if (i13 > 0) {
                    break;
                }
                throw new EOFException();
            }
            w wVar2 = this.f22097b;
            wVar2.F(0);
            int iG = wVar2.g();
            if ((i7 == 0 || ((-128000) & iG) == (((long) i7) & (-128000))) && (iE = ic.a.e(iG)) != -1) {
                i13++;
                if (i13 != 1) {
                    if (i13 == 4) {
                        break;
                    }
                } else {
                    this.f22098c.d(iG);
                    i7 = iG;
                }
                lVar.n(iE - 4);
            } else {
                int i15 = i14 + 1;
                if (i14 == i10) {
                    if (z5) {
                        return false;
                    }
                    throw h1.a("Searched too many bytes.", null);
                }
                if (z5) {
                    lVar.t();
                    lVar.n(iM + i15);
                } else {
                    lVar.u(1);
                }
                i13 = 0;
                i14 = i15;
                i7 = 0;
            }
        }
        if (z5) {
            lVar.u(iM + i14);
        } else {
            lVar.t();
        }
        this.j = i7;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0244  */
    /* JADX WARN: Code duplicated, block: B:108:0x0251  */
    /* JADX WARN: Code duplicated, block: B:110:0x0257  */
    /* JADX WARN: Code duplicated, block: B:114:0x0263  */
    /* JADX WARN: Code duplicated, block: B:116:0x0269  */
    /* JADX WARN: Code duplicated, block: B:118:0x026f  */
    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:122:0x0290 A[EDGE_INSN: B:122:0x0290->B:123:0x0295 BREAK  A[LOOP:1: B:115:0x0267->B:121:0x028d]] */
    /* JADX WARN: Code duplicated, block: B:125:0x02a7 A[LOOP:2: B:124:0x02a5->B:125:0x02a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:127:0x02d6 A[LOOP:0: B:109:0x0255->B:127:0x02d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x02da A[EDGE_INSN: B:128:0x02da->B:129:0x02dc BREAK  A[LOOP:0: B:109:0x0255->B:127:0x02d6]] */
    /* JADX WARN: Code duplicated, block: B:131:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:132:0x02eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:138:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:139:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /* JADX WARN: Code duplicated, block: B:141:0x033c  */
    /* JADX WARN: Code duplicated, block: B:143:0x034a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0353  */
    /* JADX WARN: Code duplicated, block: B:148:0x035f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:151:0x036d  */
    /* JADX WARN: Code duplicated, block: B:170:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:173:0x0401  */
    /* JADX WARN: Code duplicated, block: B:176:0x040f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0412  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:180:0x041a  */
    /* JADX WARN: Code duplicated, block: B:190:0x02da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:70:0x018b  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x0222 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0224  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // pc.k
    public final int d(l lVar, n nVar) throws Throwable {
        int i7;
        int i10;
        long j;
        f fVar;
        w wVar;
        Throwable th2;
        long j5;
        long j7;
        long j10;
        int iA;
        int i11;
        int iG;
        w wVar2;
        int i12;
        int iG2;
        q qVar;
        pc.h hVar;
        int iG3;
        f fVarA;
        q qVar2;
        int i13;
        int i14;
        int iX;
        h hVar2;
        Metadata metadata;
        long j11;
        c cVar;
        f fVarA2;
        cd.b[] bVarArr;
        int length;
        int i15;
        cd.b bVar;
        hd.l lVar2;
        int[] iArr;
        long jI;
        int length2;
        long[] jArr;
        long[] jArr2;
        long j12;
        int i16;
        cd.b[] bVarArr2;
        int length3;
        int i17;
        cd.b bVar2;
        hd.n nVar2;
        q qVar3;
        int iU;
        this = this;
        je.b.l(this.f22103h);
        int i18 = e0.f13788a;
        int i19 = this.j;
        n0 n0Var = this.f22098c;
        if (i19 == 0) {
            try {
                this.c(lVar, false);
                fVar = this.f22109p;
                wVar = this.f22097b;
                if (fVar == null) {
                    wVar2 = new w(n0Var.f11579b);
                    j = 1000000;
                    ((pc.h) lVar).g(wVar2.f13860a, 0, n0Var.f11579b, false);
                    i12 = 21;
                    if ((n0Var.f11578a & 1) != 0) {
                        if (n0Var.f11581d != 1) {
                            i12 = 36;
                        }
                    } else if (n0Var.f11581d == 1) {
                        i12 = 13;
                    }
                    th2 = null;
                    j5 = 0;
                    if (wVar2.f13862c >= i12 + 4) {
                        wVar2.F(i12);
                        iG2 = wVar2.g();
                        if (iG2 != 1483304551 && iG2 != 1231971951) {
                            if (wVar2.f13862c >= 40) {
                                wVar2.F(36);
                                if (wVar2.g() == 1447187017) {
                                    iG2 = 1447187017;
                                } else {
                                    iG2 = 0;
                                }
                            } else {
                                iG2 = 0;
                            }
                        }
                    } else if (wVar2.f13862c >= 40) {
                        wVar2.F(36);
                        if (wVar2.g() == 1447187017) {
                            iG2 = 1447187017;
                        } else {
                            iG2 = 0;
                        }
                    } else {
                        iG2 = 0;
                    }
                    qVar = this.f22099d;
                    if (iG2 != 1483304551 || iG2 == 1231971951) {
                        hVar = (pc.h) lVar;
                        long j13 = hVar.f17894i;
                        long j14 = hVar.f17895v;
                        int i20 = n0Var.f11583f;
                        int i21 = n0Var.f11580c;
                        iG3 = wVar2.g();
                        if ((iG3 & 1) == 1 || (iX = wVar2.x()) == 0) {
                            fVarA = null;
                        } else {
                            long jP = e0.P(iX, ((long) i20) * 1000000, i21);
                            if ((iG3 & 6) != 6) {
                                hVar2 = new h(j14, n0Var.f11579b, jP, -1L, null);
                            } else {
                                long jV = wVar2.v();
                                long[] jArr3 = new long[100];
                                for (int i22 = 0; i22 < 100; i22++) {
                                    jArr3[i22] = wVar2.u();
                                }
                                if (j13 != -1) {
                                    long j15 = j14 + jV;
                                    if (j13 != j15) {
                                        StringBuilder sbM = kk.b.m(j13, "XING data size mismatch: ", ", ");
                                        sbM.append(j15);
                                        je.b.N("XingSeeker", sbM.toString());
                                    }
                                }
                                hVar2 = new h(j14, n0Var.f11579b, jP, jV, jArr3);
                            }
                            fVarA = hVar2;
                        }
                        qVar2 = qVar;
                        if (fVarA != null && (qVar2.f17920a == -1 || qVar2.f17921b == -1)) {
                            hVar.f17897x = 0;
                            hVar.b(i12 + 141, false);
                            hVar.g(wVar.f13860a, 0, 3, false);
                            wVar.F(0);
                            int iW = wVar.w();
                            i13 = iW >> 12;
                            i14 = iW & 4095;
                            if (i13 <= 0 || i14 > 0) {
                                qVar2.f17920a = i13;
                                qVar2.f17921b = i14;
                            }
                        }
                        hVar.u(n0Var.f11579b);
                        if (fVarA == null && !fVarA.c() && iG2 == 1231971951) {
                            this = this;
                            lVar = lVar;
                            fVarA = this.a(lVar, false);
                        } else {
                            this = this;
                            lVar = lVar;
                        }
                    } else {
                        if (iG2 == 1447187017) {
                            pc.h hVar3 = (pc.h) lVar;
                            long j16 = hVar3.f17894i;
                            long j17 = hVar3.f17895v;
                            wVar2.G(10);
                            int iG4 = wVar2.g();
                            if (iG4 > 0) {
                                int i23 = n0Var.f11580c;
                                long jP2 = e0.P(iG4, ((long) (i23 >= 32000 ? 1152 : 576)) * 1000000, i23);
                                int iZ = wVar2.z();
                                int iZ2 = wVar2.z();
                                int iZ3 = wVar2.z();
                                wVar2.G(2);
                                long j18 = j17 + ((long) n0Var.f11579b);
                                long[] jArr4 = new long[iZ];
                                long[] jArr5 = new long[iZ];
                                long j19 = j17;
                                int i24 = 0;
                                while (true) {
                                    if (i24 >= iZ) {
                                        long[] jArr6 = jArr5;
                                        qVar3 = qVar;
                                        if (j16 != -1 && j16 != j19) {
                                            StringBuilder sbM2 = kk.b.m(j16, "VBRI data size mismatch: ", ", ");
                                            sbM2.append(j19);
                                            je.b.N("VbriSeeker", sbM2.toString());
                                        }
                                        fVarA = new g(jArr4, jArr6, jP2, j19);
                                        break;
                                    }
                                    long[] jArr7 = jArr5;
                                    qVar3 = qVar;
                                    jArr4[i24] = (((long) i24) * jP2) / ((long) iZ);
                                    jArr7[i24] = Math.max(j19, j18);
                                    if (iZ3 == 1) {
                                        iU = wVar2.u();
                                    } else if (iZ3 == 2) {
                                        iU = wVar2.z();
                                    } else if (iZ3 == 3) {
                                        iU = wVar2.w();
                                    } else {
                                        if (iZ3 != 4) {
                                            fVarA = null;
                                            break;
                                        }
                                        iU = wVar2.x();
                                    }
                                    j19 += ((long) iU) * ((long) iZ2);
                                    i24++;
                                    qVar = qVar3;
                                    iZ3 = iZ3;
                                    jArr5 = jArr7;
                                }
                            } else {
                                fVarA = null;
                                qVar3 = qVar;
                            }
                            hVar3.u(n0Var.f11579b);
                        } else {
                            qVar3 = qVar;
                            ((pc.h) lVar).f17897x = 0;
                            fVarA = null;
                        }
                        qVar2 = qVar3;
                    }
                    metadata = this.k;
                    pc.h hVar4 = (pc.h) lVar;
                    j11 = hVar4.f17895v;
                    if (metadata != null) {
                        cVar = null;
                        break;
                    }
                    bVarArr = metadata.f5693d;
                    length = bVarArr.length;
                    i15 = 0;
                    while (true) {
                        if (i15 < length) {
                            cVar = null;
                            break;
                        }
                        bVar = bVarArr[i15];
                        if (bVar instanceof hd.l) {
                            lVar2 = (hd.l) bVar;
                            iArr = lVar2.f10577w;
                            if (metadata != null) {
                                jI = -9223372036854775807L;
                                break;
                            }
                            bVarArr2 = metadata.f5693d;
                            length3 = bVarArr2.length;
                            i17 = 0;
                            while (true) {
                                if (i17 < length3) {
                                    jI = -9223372036854775807L;
                                    break;
                                }
                                bVar2 = bVarArr2[i17];
                                if (bVar2 instanceof hd.n) {
                                    nVar2 = (hd.n) bVar2;
                                    if (nVar2.f10570d.equals("TLEN")) {
                                        jI = e0.I(Long.parseLong((String) nVar2.f10583v.get(0)));
                                        break;
                                    }
                                }
                                i17++;
                            }
                            length2 = iArr.length;
                            int i25 = length2 + 1;
                            jArr = new long[i25];
                            jArr2 = new long[i25];
                            jArr[0] = j11;
                            jArr2[0] = 0;
                            j12 = 0;
                            i16 = 1;
                            while (i16 <= length2) {
                                int i26 = i16 - 1;
                                long j20 = j11 + ((long) (lVar2.f10575i + iArr[i26]));
                                j12 += (long) (lVar2.f10576v + lVar2.f10578x[i26]);
                                jArr[i16] = j20;
                                jArr2[i16] = j12;
                                i16++;
                                length2 = length2;
                                j11 = j20;
                            }
                            cVar = new c(jI, jArr, jArr2);
                            break;
                        }
                        i15++;
                    }
                    if (this.f22110q) {
                        fVarA2 = new e(-9223372036854775807L);
                    } else {
                        if (cVar != null) {
                            fVarA = cVar;
                        } else if (fVarA == null) {
                            fVarA = null;
                        }
                        if (fVarA != null) {
                            fVarA.c();
                            fVarA2 = fVarA;
                        } else {
                            fVarA2 = this.a(lVar, false);
                        }
                    }
                    this.f22109p = fVarA2;
                    this.f22102g.c(fVarA2);
                    x xVar = this.f22104i;
                    g0 g0Var = new g0();
                    g0Var.k = (String) n0Var.f11584g;
                    g0Var.f9644l = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                    g0Var.f9656x = n0Var.f11581d;
                    g0Var.f9657y = n0Var.f11580c;
                    g0Var.A = qVar2.f17920a;
                    g0Var.B = qVar2.f17921b;
                    g0Var.f9643i = this.k;
                    xVar.e(new Format(g0Var));
                    this.f22107n = hVar4.f17895v;
                } else {
                    lVar = lVar;
                    th2 = null;
                    j = 1000000;
                    j5 = 0;
                    j7 = this.f22107n;
                    if (j7 != 0) {
                        j10 = ((pc.h) lVar).f17895v;
                        if (j10 < j7) {
                            ((pc.h) lVar).u((int) (j7 - j10));
                        }
                    }
                }
                if (this.f22108o == 0) {
                    ((pc.h) lVar).f17897x = 0;
                    if (b(lVar)) {
                        i7 = -1;
                        i10 = -1;
                    } else {
                        wVar.F(0);
                        iG = wVar.g();
                        if (((-128000) & iG) == (((long) this.j) & (-128000)) || ic.a.e(iG) == -1) {
                            ((pc.h) lVar).u(1);
                            this.j = 0;
                        } else {
                            n0Var.d(iG);
                            if (this.f22105l == -9223372036854775807L) {
                                this.f22105l = this.f22109p.b(((pc.h) lVar).f17895v);
                                long j21 = this.f22096a;
                                if (j21 != -9223372036854775807L) {
                                    this.f22105l = (j21 - this.f22109p.b(j5)) + this.f22105l;
                                }
                            }
                            this.f22108o = n0Var.f11579b;
                            f fVar2 = this.f22109p;
                            if (fVar2 instanceof b) {
                                b bVar3 = (b) fVar2;
                                long j22 = (((this.f22106m + ((long) n0Var.f11583f)) * j) / ((long) n0Var.f11580c)) + this.f22105l;
                                long j23 = ((pc.h) lVar).f17895v;
                                if (!bVar3.d(j22)) {
                                    throw th2;
                                }
                                if (this.f22111r && bVar3.d(this.f22112s)) {
                                    this.f22111r = false;
                                    this.f22104i = this.f22103h;
                                }
                            }
                            iA = this.f22104i.a(lVar, this.f22108o, true);
                            if (iA == -1) {
                                i7 = -1;
                                i10 = -1;
                            } else {
                                i11 = this.f22108o - iA;
                                this.f22108o = i11;
                                if (i11 <= 0) {
                                    this.f22104i.c(((this.f22106m * j) / ((long) n0Var.f11580c)) + this.f22105l, 1, n0Var.f11579b, 0, null);
                                    this.f22106m += (long) n0Var.f11583f;
                                    this.f22108o = 0;
                                    i10 = 0;
                                    i7 = -1;
                                }
                            }
                        }
                        i7 = -1;
                        i10 = 0;
                    }
                } else {
                    iA = this.f22104i.a(lVar, this.f22108o, true);
                    if (iA == -1) {
                        i7 = -1;
                        i10 = -1;
                    } else {
                        i11 = this.f22108o - iA;
                        this.f22108o = i11;
                        if (i11 <= 0) {
                            i7 = -1;
                            i10 = 0;
                        } else {
                            this.f22104i.c(((this.f22106m * j) / ((long) n0Var.f11580c)) + this.f22105l, 1, n0Var.f11579b, 0, null);
                            this.f22106m += (long) n0Var.f11583f;
                            this.f22108o = 0;
                            i10 = 0;
                            i7 = -1;
                        }
                    }
                }
            } catch (EOFException unused) {
                i7 = -1;
                i10 = -1;
                j = 1000000;
            }
        } else {
            fVar = this.f22109p;
            wVar = this.f22097b;
            if (fVar == null) {
                wVar2 = new w(n0Var.f11579b);
                j = 1000000;
                ((pc.h) lVar).g(wVar2.f13860a, 0, n0Var.f11579b, false);
                i12 = 21;
                if ((n0Var.f11578a & 1) != 0) {
                    if (n0Var.f11581d != 1) {
                        i12 = 36;
                    }
                } else if (n0Var.f11581d == 1) {
                    i12 = 13;
                }
                th2 = null;
                j5 = 0;
                if (wVar2.f13862c >= i12 + 4) {
                    wVar2.F(i12);
                    iG2 = wVar2.g();
                    if (iG2 != 1483304551) {
                        if (wVar2.f13862c >= 40) {
                            wVar2.F(36);
                            if (wVar2.g() == 1447187017) {
                                iG2 = 1447187017;
                            } else {
                                iG2 = 0;
                            }
                        } else {
                            iG2 = 0;
                        }
                    }
                } else if (wVar2.f13862c >= 40) {
                    wVar2.F(36);
                    if (wVar2.g() == 1447187017) {
                        iG2 = 1447187017;
                    } else {
                        iG2 = 0;
                    }
                } else {
                    iG2 = 0;
                }
                qVar = this.f22099d;
                if (iG2 != 1483304551) {
                    hVar = (pc.h) lVar;
                    long j110 = hVar.f17894i;
                    long j111 = hVar.f17895v;
                    int i27 = n0Var.f11583f;
                    int i28 = n0Var.f11580c;
                    iG3 = wVar2.g();
                    if ((iG3 & 1) == 1) {
                        fVarA = null;
                    } else {
                        fVarA = null;
                    }
                    qVar2 = qVar;
                    if (fVarA != null) {
                        hVar.f17897x = 0;
                        hVar.b(i12 + 141, false);
                        hVar.g(wVar.f13860a, 0, 3, false);
                        wVar.F(0);
                        int iW2 = wVar.w();
                        i13 = iW2 >> 12;
                        i14 = iW2 & 4095;
                        if (i13 <= 0) {
                            qVar2.f17920a = i13;
                            qVar2.f17921b = i14;
                        } else {
                            qVar2.f17920a = i13;
                            qVar2.f17921b = i14;
                        }
                    }
                    hVar.u(n0Var.f11579b);
                    if (fVarA == null) {
                        this = this;
                        lVar = lVar;
                    } else {
                        this = this;
                        lVar = lVar;
                    }
                } else {
                    hVar = (pc.h) lVar;
                    long j112 = hVar.f17894i;
                    long j113 = hVar.f17895v;
                    int i29 = n0Var.f11583f;
                    int i210 = n0Var.f11580c;
                    iG3 = wVar2.g();
                    if ((iG3 & 1) == 1) {
                        fVarA = null;
                    } else {
                        fVarA = null;
                    }
                    qVar2 = qVar;
                    if (fVarA != null) {
                        hVar.f17897x = 0;
                        hVar.b(i12 + 141, false);
                        hVar.g(wVar.f13860a, 0, 3, false);
                        wVar.F(0);
                        int iW3 = wVar.w();
                        i13 = iW3 >> 12;
                        i14 = iW3 & 4095;
                        if (i13 <= 0) {
                            qVar2.f17920a = i13;
                            qVar2.f17921b = i14;
                        } else {
                            qVar2.f17920a = i13;
                            qVar2.f17921b = i14;
                        }
                    }
                    hVar.u(n0Var.f11579b);
                    if (fVarA == null) {
                        this = this;
                        lVar = lVar;
                    } else {
                        this = this;
                        lVar = lVar;
                    }
                }
                metadata = this.k;
                pc.h hVar5 = (pc.h) lVar;
                j11 = hVar5.f17895v;
                if (metadata != null) {
                    cVar = null;
                    break;
                }
                bVarArr = metadata.f5693d;
                length = bVarArr.length;
                i15 = 0;
                while (true) {
                    if (i15 < length) {
                        cVar = null;
                        break;
                    }
                    bVar = bVarArr[i15];
                    if (bVar instanceof hd.l) {
                        lVar2 = (hd.l) bVar;
                        iArr = lVar2.f10577w;
                        if (metadata != null) {
                            jI = -9223372036854775807L;
                            break;
                        }
                        bVarArr2 = metadata.f5693d;
                        length3 = bVarArr2.length;
                        i17 = 0;
                        while (true) {
                            if (i17 < length3) {
                                jI = -9223372036854775807L;
                                break;
                            }
                            bVar2 = bVarArr2[i17];
                            if (bVar2 instanceof hd.n) {
                                nVar2 = (hd.n) bVar2;
                                if (nVar2.f10570d.equals("TLEN")) {
                                    jI = e0.I(Long.parseLong((String) nVar2.f10583v.get(0)));
                                    break;
                                }
                            }
                            i17++;
                        }
                        length2 = iArr.length;
                        int i211 = length2 + 1;
                        jArr = new long[i211];
                        jArr2 = new long[i211];
                        jArr[0] = j11;
                        jArr2[0] = 0;
                        j12 = 0;
                        i16 = 1;
                        while (i16 <= length2) {
                            int i212 = i16 - 1;
                            long j24 = j11 + ((long) (lVar2.f10575i + iArr[i212]));
                            j12 += (long) (lVar2.f10576v + lVar2.f10578x[i212]);
                            jArr[i16] = j24;
                            jArr2[i16] = j12;
                            i16++;
                            length2 = length2;
                            j11 = j24;
                        }
                        cVar = new c(jI, jArr, jArr2);
                        break;
                    }
                    i15++;
                }
                if (this.f22110q) {
                    fVarA2 = new e(-9223372036854775807L);
                } else {
                    if (cVar != null) {
                        fVarA = cVar;
                    } else if (fVarA == null) {
                        fVarA = null;
                    }
                    if (fVarA != null) {
                        fVarA.c();
                        fVarA2 = fVarA;
                    } else {
                        fVarA2 = this.a(lVar, false);
                    }
                }
                this.f22109p = fVarA2;
                this.f22102g.c(fVarA2);
                x xVar2 = this.f22104i;
                g0 g0Var2 = new g0();
                g0Var2.k = (String) n0Var.f11584g;
                g0Var2.f9644l = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                g0Var2.f9656x = n0Var.f11581d;
                g0Var2.f9657y = n0Var.f11580c;
                g0Var2.A = qVar2.f17920a;
                g0Var2.B = qVar2.f17921b;
                g0Var2.f9643i = this.k;
                xVar2.e(new Format(g0Var2));
                this.f22107n = hVar5.f17895v;
            } else {
                lVar = lVar;
                th2 = null;
                j = 1000000;
                j5 = 0;
                j7 = this.f22107n;
                if (j7 != 0) {
                    j10 = ((pc.h) lVar).f17895v;
                    if (j10 < j7) {
                        ((pc.h) lVar).u((int) (j7 - j10));
                    }
                }
            }
            if (this.f22108o == 0) {
                ((pc.h) lVar).f17897x = 0;
                if (b(lVar)) {
                    i7 = -1;
                    i10 = -1;
                } else {
                    wVar.F(0);
                    iG = wVar.g();
                    if (((-128000) & iG) == (((long) this.j) & (-128000))) {
                    }
                    ((pc.h) lVar).u(1);
                    this.j = 0;
                    i7 = -1;
                    i10 = 0;
                }
            } else {
                iA = this.f22104i.a(lVar, this.f22108o, true);
                if (iA == -1) {
                    i7 = -1;
                    i10 = -1;
                } else {
                    i11 = this.f22108o - iA;
                    this.f22108o = i11;
                    if (i11 <= 0) {
                        i7 = -1;
                        i10 = 0;
                    } else {
                        this.f22104i.c(((this.f22106m * j) / ((long) n0Var.f11580c)) + this.f22105l, 1, n0Var.f11579b, 0, null);
                        this.f22106m += (long) n0Var.f11583f;
                        this.f22108o = 0;
                        i10 = 0;
                        i7 = -1;
                    }
                }
            }
        }
        if (i10 == i7) {
            f fVar3 = this.f22109p;
            if (fVar3 instanceof b) {
                if (fVar3.i() != ((this.f22106m * j) / ((long) n0Var.f11580c)) + this.f22105l) {
                    f fVar4 = this.f22109p;
                    ((b) fVar4).getClass();
                    this.f22102g.c(fVar4);
                }
            }
        }
        return i10;
    }

    @Override // pc.k
    public final void e(m mVar) {
        this.f22102g = mVar;
        x xVarX = mVar.x(0, 1);
        this.f22103h = xVarX;
        this.f22104i = xVarX;
        this.f22102g.q();
    }

    @Override // pc.k
    public final boolean f(l lVar) {
        return c(lVar, true);
    }

    @Override // pc.k
    public final void g(long j, long j5) {
        this.j = 0;
        this.f22105l = -9223372036854775807L;
        this.f22106m = 0L;
        this.f22108o = 0;
        this.f22112s = j5;
        f fVar = this.f22109p;
        if (!(fVar instanceof b) || ((b) fVar).d(j5)) {
            return;
        }
        this.f22111r = true;
        this.f22104i = this.f22101f;
    }

    public d(long j) {
        this.f22096a = j;
        this.f22097b = new w(10);
        this.f22098c = new n0();
        this.f22099d = new q();
        this.f22105l = -9223372036854775807L;
        this.f22100e = new r(0);
        j jVar = new j();
        this.f22101f = jVar;
        this.f22104i = jVar;
    }

    @Override // pc.k
    public final void release() {
    }
}
