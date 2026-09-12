package yc;

import gc.h1;
import java.io.EOFException;
import je.w;
import pc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f23255f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f23256g = new w(255);

    public final boolean a(l lVar, boolean z5) throws h1, EOFException {
        boolean zG;
        boolean zG2;
        this.f23250a = 0;
        this.f23251b = 0L;
        this.f23252c = 0;
        this.f23253d = 0;
        this.f23254e = 0;
        w wVar = this.f23256g;
        wVar.C(27);
        try {
            zG = lVar.g(wVar.f13860a, 0, 27, z5);
        } catch (EOFException e10) {
            if (!z5) {
                throw e10;
            }
            zG = false;
        }
        if (zG && wVar.v() == 1332176723) {
            if (wVar.u() == 0) {
                this.f23250a = wVar.u();
                this.f23251b = wVar.j();
                wVar.l();
                wVar.l();
                wVar.l();
                int iU = wVar.u();
                this.f23252c = iU;
                this.f23253d = iU + 27;
                wVar.C(iU);
                try {
                    zG2 = lVar.g(wVar.f13860a, 0, this.f23252c, z5);
                } catch (EOFException e11) {
                    if (!z5) {
                        throw e11;
                    }
                    zG2 = false;
                }
                if (zG2) {
                    for (int i7 = 0; i7 < this.f23252c; i7++) {
                        int iU2 = wVar.u();
                        this.f23255f[i7] = iU2;
                        this.f23254e += iU2;
                    }
                    return true;
                }
            } else if (!z5) {
                throw h1.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(l lVar, long j) {
        boolean zG;
        je.b.g(lVar.getPosition() == lVar.m());
        w wVar = this.f23256g;
        wVar.C(4);
        while (true) {
            if (j != -1 && lVar.getPosition() + 4 >= j) {
                break;
            }
            try {
                zG = lVar.g(wVar.f13860a, 0, 4, true);
            } catch (EOFException unused) {
                zG = false;
            }
            if (!zG) {
                break;
            }
            wVar.F(0);
            if (wVar.v() == 1332176723) {
                lVar.t();
                return true;
            }
            lVar.u(1);
        }
        do {
            if (j != -1 && lVar.getPosition() >= j) {
                break;
            }
        } while (lVar.D() != -1);
        return false;
    }
}
