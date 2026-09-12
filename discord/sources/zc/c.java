package zc;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements pc.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f23674a = new b(null, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je.w f23675b = new je.w(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23676c;

    @Override // pc.k
    public final int d(pc.l lVar, pc.n nVar) throws EOFException, InterruptedIOException {
        je.w wVar = this.f23675b;
        int i7 = ((pc.h) lVar).read(wVar.f13860a, 0, 16384);
        if (i7 == -1) {
            return -1;
        }
        wVar.F(0);
        wVar.E(i7);
        boolean z5 = this.f23676c;
        b bVar = this.f23674a;
        if (!z5) {
            bVar.f(4, 0L);
            this.f23676c = true;
        }
        bVar.c(wVar);
        return 0;
    }

    @Override // pc.k
    public final void e(pc.m mVar) {
        this.f23674a.e(mVar, new d0(0, 1));
        mVar.q();
        mVar.c(new pc.o(-9223372036854775807L));
    }

    @Override // pc.k
    public final boolean f(pc.l lVar) throws EOFException, InterruptedIOException {
        pc.h hVar;
        int i7;
        je.w wVar = new je.w(10);
        int i10 = 0;
        while (true) {
            hVar = (pc.h) lVar;
            hVar.g(wVar.f13860a, 0, 10, false);
            wVar.F(0);
            if (wVar.w() != 4801587) {
                break;
            }
            wVar.G(3);
            int iT = wVar.t();
            i10 += iT + 10;
            hVar.b(iT, false);
        }
        hVar.f17897x = 0;
        hVar.b(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            int i13 = 7;
            hVar.g(wVar.f13860a, 0, 7, false);
            wVar.F(0);
            int iZ = wVar.z();
            if (iZ == 44096 || iZ == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = wVar.f13860a;
                if (bArr.length < 7) {
                    i7 = -1;
                } else {
                    int i14 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i14 == 65535) {
                        i14 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i13 = 4;
                    }
                    if (iZ == 44097) {
                        i13 += 2;
                    }
                    i7 = i14 + i13;
                }
                if (i7 == -1) {
                    break;
                }
                hVar.b(i7 - 7, false);
            } else {
                hVar.f17897x = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    break;
                }
                hVar.b(i12, false);
                i11 = 0;
            }
        }
        return false;
    }

    @Override // pc.k
    public final void g(long j, long j5) {
        this.f23676c = false;
        this.f23674a.a();
    }

    @Override // pc.k
    public final void release() {
    }
}
