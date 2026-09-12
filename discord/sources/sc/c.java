package sc;

import a5.l0;
import com.google.android.exoplayer2.metadata.Metadata;
import ei.e0;
import gc.h1;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import je.v;
import je.w;
import org.webrtc.PeerConnection;
import pc.h;
import pc.k;
import pc.l;
import pc.m;
import pc.n;
import pc.o;
import pc.p;
import pc.u;
import pc.x;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f19834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x f19835f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Metadata f19837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p f19838i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f19839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f19840m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f19841n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f19830a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f19831b = new w(new byte[PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19832c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f19833d = new n();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19836g = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    @Override // pc.k
    public final int d(l lVar, n nVar) throws h1, EOFException, InterruptedIOException {
        p pVar;
        Metadata metadata;
        u oVar;
        long j;
        long j5;
        boolean zK;
        long j7;
        int i7 = this.f19836g;
        boolean z5 = true;
        int i10 = 0;
        if (i7 == 0) {
            boolean z6 = !this.f19832c;
            ((h) lVar).f17897x = 0;
            h hVar = (h) lVar;
            long jM = hVar.m();
            Metadata metadataV = a.a.v(lVar, z6);
            hVar.u((int) (hVar.m() - jM));
            this.f19837h = metadataV;
            this.f19836g = 1;
            return 0;
        }
        byte[] bArr = this.f19830a;
        if (i7 == 1) {
            ((h) lVar).g(bArr, 0, bArr.length, false);
            ((h) lVar).f17897x = 0;
            this.f19836g = 2;
            return 0;
        }
        int i11 = 3;
        if (i7 == 2) {
            w wVar = new w(4);
            ((h) lVar).a(wVar.f13860a, 0, 4, false);
            if (wVar.v() != 1716281667) {
                throw h1.a("Failed to read FLAC stream marker.", null);
            }
            this.f19836g = 3;
            return 0;
        }
        int i12 = 7;
        if (i7 == 3) {
            ?? r5 = 0;
            p pVar2 = this.f19838i;
            boolean z7 = false;
            while (!z7) {
                ((h) lVar).f17897x = r5;
                byte[] bArr2 = new byte[4];
                v vVar = new v(bArr2, 4);
                h hVar2 = (h) lVar;
                hVar2.g(bArr2, r5, 4, r5);
                boolean zH = vVar.h();
                int i13 = vVar.i(i12);
                int i14 = vVar.i(24) + 4;
                if (i13 == 0) {
                    byte[] bArr3 = new byte[38];
                    hVar2.a(bArr3, r5, 38, r5);
                    pVar2 = new p(bArr3, 4);
                } else {
                    if (pVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    Metadata metadataA = pVar2.f17918l;
                    if (i13 == i11) {
                        w wVar2 = new w(i14);
                        hVar2.a(wVar2.f13860a, r5, i14, r5);
                        pVar = new p(pVar2.f17909a, pVar2.f17910b, pVar2.f17911c, pVar2.f17912d, pVar2.f17913e, pVar2.f17915g, pVar2.f17916h, pVar2.j, a.a.x(wVar2), pVar2.f17918l);
                    } else if (i13 == 4) {
                        w wVar3 = new w(i14);
                        hVar2.a(wVar3.f13860a, 0, i14, false);
                        wVar3.G(4);
                        Metadata metadataL = l0.L(Arrays.asList((String[]) l0.N(wVar3, false, false).f20946d));
                        if (metadataA == null) {
                            metadata = metadataL;
                        } else {
                            if (metadataL != null) {
                                metadataA = metadataA.a(metadataL.f5693d);
                            }
                            metadata = metadataA;
                        }
                        pVar = new p(pVar2.f17909a, pVar2.f17910b, pVar2.f17911c, pVar2.f17912d, pVar2.f17913e, pVar2.f17915g, pVar2.f17916h, pVar2.j, pVar2.k, metadata);
                    } else if (i13 == 6) {
                        w wVar4 = new w(i14);
                        hVar2.a(wVar4.f13860a, 0, i14, false);
                        wVar4.G(4);
                        Metadata metadata2 = new Metadata(e0.r(fd.b.a(wVar4)));
                        if (metadataA != null) {
                            metadata2 = metadataA.a(metadata2.f5693d);
                        }
                        pVar = new p(pVar2.f17909a, pVar2.f17910b, pVar2.f17911c, pVar2.f17912d, pVar2.f17913e, pVar2.f17915g, pVar2.f17916h, pVar2.j, pVar2.k, metadata2);
                    } else {
                        hVar2.u(i14);
                    }
                    pVar2 = pVar;
                }
                int i15 = je.e0.f13788a;
                this.f19838i = pVar2;
                z7 = zH;
                r5 = 0;
                i11 = 3;
                i12 = 7;
            }
            this.f19838i.getClass();
            this.j = Math.max(this.f19838i.f17911c, 6);
            x xVar = this.f19835f;
            int i16 = je.e0.f13788a;
            xVar.e(this.f19838i.c(bArr, this.f19837h));
            this.f19836g = 4;
            return 0;
        }
        if (i7 == 4) {
            ((h) lVar).f17897x = 0;
            w wVar5 = new w(2);
            h hVar3 = (h) lVar;
            hVar3.g(wVar5.f13860a, 0, 2, false);
            int iZ = wVar5.z();
            if ((iZ >> 2) != 16382) {
                hVar3.f17897x = 0;
                throw h1.a("First frame does not start with sync code.", null);
            }
            hVar3.f17897x = 0;
            this.k = iZ;
            m mVar = this.f19834e;
            int i17 = je.e0.f13788a;
            long j10 = hVar3.f17895v;
            long j11 = hVar3.f17894i;
            this.f19838i.getClass();
            p pVar3 = this.f19838i;
            if (pVar3.k != null) {
                oVar = new o(pVar3, j10, 0);
                i10 = 0;
            } else if (j11 == -1 || pVar3.j <= 0) {
                i10 = 0;
                oVar = new o(pVar3.b());
            } else {
                int i18 = this.k;
                int i19 = pVar3.f17911c;
                mi.a aVar = new mi.a(3, pVar3);
                a aVar2 = new a(pVar3, i18);
                long jB = pVar3.b();
                long j12 = pVar3.j;
                int i20 = pVar3.f17912d;
                if (i20 > 0) {
                    j = ((((long) i20) + ((long) i19)) / 2) + 1;
                } else {
                    int i21 = pVar3.f17909a;
                    j = (((((i21 != pVar3.f17910b || i21 <= 0) ? 4096L : i21) * ((long) pVar3.f17915g)) * ((long) pVar3.f17916h)) / 8) + 64;
                }
                b bVar = new b(aVar, aVar2, jB, j12, j10, j11, j, Math.max(6, i19));
                this.f19839l = bVar;
                oVar = (pc.a) bVar.f17883c;
            }
            mVar.c(oVar);
            this.f19836g = 5;
            return i10;
        }
        if (i7 != 5) {
            throw new IllegalStateException();
        }
        this.f19835f.getClass();
        this.f19838i.getClass();
        b bVar2 = this.f19839l;
        if (bVar2 != null && ((pc.b) bVar2.f17885e) != null) {
            return bVar2.v(lVar, nVar);
        }
        if (this.f19841n == -1) {
            p pVar4 = this.f19838i;
            ((h) lVar).f17897x = 0;
            h hVar4 = (h) lVar;
            hVar4.b(1, false);
            byte[] bArr4 = new byte[1];
            hVar4.g(bArr4, 0, 1, false);
            boolean z10 = (bArr4[0] & 1) == 1;
            hVar4.b(2, false);
            i12 = z10 ? 7 : 6;
            w wVar6 = new w(i12);
            byte[] bArr5 = wVar6.f13860a;
            int i22 = 0;
            while (i22 < i12) {
                int iR = hVar4.r(bArr5, i22, i12 - i22);
                if (iR == -1) {
                    break;
                }
                i22 += iR;
            }
            wVar6.E(i22);
            hVar4.f17897x = 0;
            try {
                long jA = wVar6.A();
                if (!z10) {
                    jA *= (long) pVar4.f17910b;
                }
                j7 = jA;
            } catch (NumberFormatException unused) {
                z5 = false;
                j7 = 0;
            }
            if (!z5) {
                throw h1.a(null, null);
            }
            this.f19841n = j7;
        } else {
            w wVar7 = this.f19831b;
            int i23 = wVar7.f13862c;
            if (i23 < 32768) {
                int i24 = ((h) lVar).read(wVar7.f13860a, i23, PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS - i23);
                z5 = i24 == -1;
                if (!z5) {
                    wVar7.E(i23 + i24);
                } else if (wVar7.a() == 0) {
                    long j13 = this.f19841n * 1000000;
                    p pVar5 = this.f19838i;
                    int i25 = je.e0.f13788a;
                    this.f19835f.c(j13 / ((long) pVar5.f17913e), 1, this.f19840m, 0, null);
                    return -1;
                }
            } else {
                z5 = false;
            }
            int i26 = wVar7.f13861b;
            int i27 = this.f19840m;
            int i28 = this.j;
            if (i27 < i28) {
                wVar7.G(Math.min(i28 - i27, wVar7.a()));
            }
            this.f19838i.getClass();
            int i29 = wVar7.f13861b;
            while (true) {
                int i30 = wVar7.f13862c - 16;
                n nVar2 = this.f19833d;
                if (i29 > i30) {
                    if (z5) {
                        while (true) {
                            int i31 = wVar7.f13862c;
                            if (i29 <= i31 - this.j) {
                                wVar7.F(i29);
                                try {
                                    zK = zs.a.k(wVar7, this.f19838i, this.k, nVar2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zK = false;
                                }
                                if (wVar7.f13861b > wVar7.f13862c) {
                                    zK = false;
                                }
                                if (zK) {
                                    wVar7.F(i29);
                                    j5 = nVar2.f17905a;
                                    break;
                                }
                                i29++;
                            } else {
                                wVar7.F(i31);
                            }
                        }
                    } else {
                        wVar7.F(i29);
                    }
                    j5 = -1;
                    break;
                }
                wVar7.F(i29);
                if (zs.a.k(wVar7, this.f19838i, this.k, nVar2)) {
                    wVar7.F(i29);
                    j5 = nVar2.f17905a;
                    break;
                }
                i29++;
            }
            int i32 = wVar7.f13861b - i26;
            wVar7.F(i26);
            this.f19835f.d(i32, wVar7);
            int i33 = this.f19840m + i32;
            this.f19840m = i33;
            if (j5 != -1) {
                long j14 = this.f19841n * 1000000;
                p pVar6 = this.f19838i;
                int i34 = je.e0.f13788a;
                this.f19835f.c(j14 / ((long) pVar6.f17913e), 1, i33, 0, null);
                this.f19840m = 0;
                this.f19841n = j5;
            }
            if (wVar7.a() < 16) {
                int iA = wVar7.a();
                byte[] bArr6 = wVar7.f13860a;
                System.arraycopy(bArr6, wVar7.f13861b, bArr6, 0, iA);
                wVar7.F(0);
                wVar7.E(iA);
            }
        }
        return 0;
    }

    @Override // pc.k
    public final void e(m mVar) {
        this.f19834e = mVar;
        this.f19835f = mVar.x(0, 1);
        mVar.q();
    }

    @Override // pc.k
    public final boolean f(l lVar) {
        a.a.v(lVar, false);
        w wVar = new w(4);
        ((h) lVar).g(wVar.f13860a, 0, 4, false);
        return wVar.v() == 1716281667;
    }

    @Override // pc.k
    public final void g(long j, long j5) {
        if (j == 0) {
            this.f19836g = 0;
        } else {
            b bVar = this.f19839l;
            if (bVar != null) {
                bVar.C(j5);
            }
        }
        this.f19841n = j5 != 0 ? -1L : 0L;
        this.f19840m = 0;
        this.f19831b.C(0);
    }

    @Override // pc.k
    public final void release() {
    }
}
