package ad;

import android.util.Pair;
import gc.h1;
import java.io.EOFException;
import java.io.InterruptedIOException;
import je.e0;
import je.w;
import pc.h;
import pc.k;
import pc.l;
import pc.m;
import pc.n;
import pc.x;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f341g;

    /* JADX WARN: Code duplicated, block: B:57:0x0181  */
    @Override // pc.k
    public final int d(l lVar, n nVar) throws h1, EOFException, InterruptedIOException {
        byte[] bArr;
        int i7;
        je.b.l(this.f336b);
        int i10 = e0.f13788a;
        int i11 = this.f337c;
        int iW = 4;
        if (i11 == 0) {
            je.b.k(((h) lVar).f17895v == 0);
            int i12 = this.f340f;
            if (i12 != -1) {
                ((h) lVar).u(i12);
                this.f337c = 4;
                return 0;
            }
            if (!com.facebook.imagepipeline.nativecode.c.h(lVar)) {
                throw h1.a("Unsupported or unrecognized wav file type.", null);
            }
            h hVar = (h) lVar;
            hVar.u((int) (hVar.m() - hVar.f17895v));
            this.f337c = 1;
            return 0;
        }
        long j = -1;
        if (i11 == 1) {
            w wVar = new w(8);
            f fVarB = f.b(lVar, wVar);
            if (fVarB.f347a != 1685272116) {
                ((h) lVar).f17897x = 0;
            } else {
                h hVar2 = (h) lVar;
                hVar2.b(8, false);
                wVar.F(0);
                hVar2.g(wVar.f13860a, 0, 8, false);
                j = wVar.j();
                hVar2.u(((int) fVarB.f348b) + 8);
            }
            this.f338d = j;
            this.f337c = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                je.b.k(this.f341g != -1);
                long j5 = this.f341g - ((h) lVar).f17895v;
                b bVar = this.f339e;
                bVar.getClass();
                return bVar.a(lVar, j5) ? -1 : 0;
            }
            ((h) lVar).f17897x = 0;
            f fVarK = com.facebook.imagepipeline.nativecode.c.K(1684108385, lVar, new w(8));
            h hVar3 = (h) lVar;
            hVar3.u(8);
            Pair pairCreate = Pair.create(Long.valueOf(hVar3.f17895v), Long.valueOf(fVarK.f348b));
            this.f340f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j7 = this.f338d;
            if (j7 != -1 && jLongValue == 4294967295L) {
                jLongValue = j7;
            }
            long j10 = ((long) this.f340f) + jLongValue;
            this.f341g = j10;
            long j11 = hVar3.f17894i;
            if (j11 != -1 && j10 > j11) {
                je.b.N("WavExtractor", "Data exceeds input length: " + this.f341g + ", " + j11);
                this.f341g = j11;
            }
            b bVar2 = this.f339e;
            bVar2.getClass();
            bVar2.c(this.f340f, this.f341g);
            this.f337c = 4;
            return 0;
        }
        w wVar2 = new w(16);
        long j12 = com.facebook.imagepipeline.nativecode.c.K(1718449184, lVar, wVar2).f348b;
        je.b.k(j12 >= 16);
        h hVar4 = (h) lVar;
        hVar4.g(wVar2.f13860a, 0, 16, false);
        wVar2.F(0);
        int iN = wVar2.n();
        int iN2 = wVar2.n();
        int iM = wVar2.m();
        wVar2.m();
        int iN3 = wVar2.n();
        int iN4 = wVar2.n();
        int i13 = ((int) j12) - 16;
        if (i13 > 0) {
            bArr = new byte[i13];
            hVar4.g(bArr, 0, i13, false);
        } else {
            bArr = e0.f13793f;
        }
        hVar4.u((int) (hVar4.m() - hVar4.f17895v));
        e eVar = new e();
        eVar.f342d = iN2;
        eVar.f343e = iM;
        eVar.f344i = iN3;
        eVar.f345v = iN4;
        eVar.f346w = bArr;
        if (iN == 17) {
            this.f339e = new a(this.f335a, this.f336b, eVar);
        } else if (iN == 6) {
            this.f339e = new c(this.f335a, this.f336b, eVar, "audio/g711-alaw", -1);
        } else if (iN == 7) {
            this.f339e = new c(this.f335a, this.f336b, eVar, "audio/g711-mlaw", -1);
        } else {
            if (iN == 1) {
                iW = e0.w(iN4);
                i7 = iW;
            } else {
                if (iN != 3) {
                    if (iN == 65534) {
                        iW = e0.w(iN4);
                        i7 = iW;
                    }
                } else if (iN4 == 32) {
                    i7 = iW;
                }
                i7 = 0;
            }
            if (i7 == 0) {
                throw h1.c("Unsupported WAV format type: " + iN);
            }
            this.f339e = new c(this.f335a, this.f336b, eVar, "audio/raw", i7);
        }
        this.f337c = 3;
        return 0;
    }

    @Override // pc.k
    public final void e(m mVar) {
        this.f335a = mVar;
        this.f336b = mVar.x(0, 1);
        mVar.q();
    }

    @Override // pc.k
    public final boolean f(l lVar) {
        return com.facebook.imagepipeline.nativecode.c.h(lVar);
    }

    @Override // pc.k
    public final void g(long j, long j5) {
        this.f337c = j == 0 ? 0 : 4;
        b bVar = this.f339e;
        if (bVar != null) {
            bVar.b(j5);
        }
    }

    @Override // pc.k
    public final void release() {
    }
}
