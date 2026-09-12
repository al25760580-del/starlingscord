package zc;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements pc.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f23638a = new b(null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je.w f23639b = new je.w(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23640c;

    @Override // pc.k
    public final int d(pc.l lVar, pc.n nVar) throws EOFException, InterruptedIOException {
        je.w wVar = this.f23639b;
        int i7 = ((pc.h) lVar).read(wVar.f13860a, 0, 2786);
        if (i7 == -1) {
            return -1;
        }
        wVar.F(0);
        wVar.E(i7);
        boolean z5 = this.f23640c;
        b bVar = this.f23638a;
        if (!z5) {
            bVar.f(4, 0L);
            this.f23640c = true;
        }
        bVar.c(wVar);
        return 0;
    }

    @Override // pc.k
    public final void e(pc.m mVar) {
        this.f23638a.e(mVar, new d0(0, 1));
        mVar.q();
        mVar.c(new pc.o(-9223372036854775807L));
    }

    @Override // pc.k
    public final boolean f(pc.l lVar) throws EOFException, InterruptedIOException {
        pc.h hVar;
        int iC;
        je.w wVar = new je.w(10);
        int i7 = 0;
        while (true) {
            hVar = (pc.h) lVar;
            hVar.g(wVar.f13860a, 0, 10, false);
            wVar.F(0);
            if (wVar.w() != 4801587) {
                break;
            }
            wVar.G(3);
            int iT = wVar.t();
            i7 += iT + 10;
            hVar.b(iT, false);
        }
        hVar.f17897x = 0;
        hVar.b(i7, false);
        int i10 = 0;
        int i11 = i7;
        while (true) {
            hVar.g(wVar.f13860a, 0, 6, false);
            wVar.F(0);
            if (wVar.z() != 2935) {
                hVar.f17897x = 0;
                i11++;
                if (i11 - i7 >= 8192) {
                    break;
                }
                hVar.b(i11, false);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                byte[] bArr = wVar.f13860a;
                if (bArr.length < 6) {
                    iC = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iC = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b10 = bArr[4];
                    iC = ic.a.c((b10 & 192) >> 6, b10 & 63);
                }
                if (iC == -1) {
                    break;
                }
                hVar.b(iC - 6, false);
            }
        }
        return false;
    }

    @Override // pc.k
    public final void g(long j, long j5) {
        this.f23640c = false;
        this.f23638a.a();
    }

    @Override // pc.k
    public final void release() {
    }
}
