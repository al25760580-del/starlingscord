package sc;

import je.w;
import pc.d;
import pc.e;
import pc.l;
import pc.n;
import pc.p;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f19827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19828e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f19829i = new n();

    public a(p pVar, int i7) {
        this.f19827d = pVar;
        this.f19828e = i7;
    }

    public final long a(l lVar) {
        n nVar;
        p pVar;
        int iR;
        while (true) {
            long jM = lVar.m();
            long length = lVar.getLength() - 6;
            nVar = this.f19829i;
            pVar = this.f19827d;
            if (jM >= length) {
                break;
            }
            long jM2 = lVar.m();
            byte[] bArr = new byte[2];
            int i7 = 0;
            boolean zK = false;
            lVar.C(bArr, 0, 2);
            int i10 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i11 = this.f19828e;
            if (i10 != i11) {
                lVar.t();
                lVar.n((int) (jM2 - lVar.getPosition()));
            } else {
                w wVar = new w(16);
                System.arraycopy(bArr, 0, wVar.f13860a, 0, 2);
                byte[] bArr2 = wVar.f13860a;
                while (i7 < 14 && (iR = lVar.r(bArr2, 2 + i7, 14 - i7)) != -1) {
                    i7 += iR;
                }
                wVar.E(i7);
                lVar.t();
                lVar.n((int) (jM2 - lVar.getPosition()));
                zK = zs.a.k(wVar, pVar, i11, nVar);
            }
            if (zK) {
                break;
            }
            lVar.n(1);
        }
        if (lVar.m() < lVar.getLength() - 6) {
            return nVar.f17905a;
        }
        lVar.n((int) (lVar.getLength() - lVar.m()));
        return pVar.j;
    }

    @Override // pc.e
    public final d c(l lVar, long j) {
        long position = lVar.getPosition();
        long jA = a(lVar);
        long jM = lVar.m();
        lVar.n(Math.max(6, this.f19827d.f17911c));
        long jA2 = a(lVar);
        long jM2 = lVar.m();
        if (jA > j || jA2 <= j) {
            return jA2 <= j ? new d(-2, jA2, jM2) : new d(-1, jA, position);
        }
        return new d(0, -9223372036854775807L, jM);
    }
}
