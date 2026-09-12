package zc;

import androidx.recyclerview.widget.RecyclerView;
import gc.h1;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements pc.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je.w f23681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final je.v f23682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public pc.m f23683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f23684f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23687i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f23679a = new e(true, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je.w f23680b = new je.w(RecyclerView.ItemAnimator.FLAG_MOVED);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f23685g = -1;

    public d(int i7) {
        je.w wVar = new je.w(10);
        this.f23681c = wVar;
        byte[] bArr = wVar.f13860a;
        this.f23682d = new je.v(bArr, bArr.length);
    }

    @Override // pc.k
    public final int d(pc.l lVar, pc.n nVar) throws h1, EOFException, InterruptedIOException {
        je.b.l(this.f23683e);
        long j = ((pc.h) lVar).f17894i;
        je.w wVar = this.f23680b;
        int i7 = ((pc.h) lVar).read(wVar.f13860a, 0, RecyclerView.ItemAnimator.FLAG_MOVED);
        boolean z5 = i7 == -1;
        if (!this.f23687i) {
            this.f23683e.c(new pc.o(-9223372036854775807L));
            this.f23687i = true;
        }
        if (z5) {
            return -1;
        }
        wVar.F(0);
        wVar.E(i7);
        boolean z6 = this.f23686h;
        e eVar = this.f23679a;
        if (!z6) {
            eVar.f(4, this.f23684f);
            this.f23686h = true;
        }
        eVar.c(wVar);
        return 0;
    }

    @Override // pc.k
    public final void e(pc.m mVar) {
        this.f23683e = mVar;
        this.f23679a.e(mVar, new d0(0, 1));
        mVar.q();
    }

    @Override // pc.k
    public final boolean f(pc.l lVar) throws EOFException, InterruptedIOException {
        int i7 = 0;
        while (true) {
            je.w wVar = this.f23681c;
            lVar.C(wVar.f13860a, 0, 10);
            wVar.F(0);
            if (wVar.w() != 4801587) {
                break;
            }
            wVar.G(3);
            int iT = wVar.t();
            i7 += iT + 10;
            lVar.n(iT);
        }
        lVar.t();
        lVar.n(i7);
        if (this.f23685g == -1) {
            this.f23685g = i7;
        }
        int i10 = i7;
        int i11 = 0;
        int i12 = 0;
        do {
            je.w wVar2 = this.f23681c;
            pc.h hVar = (pc.h) lVar;
            hVar.g(wVar2.f13860a, 0, 2, false);
            wVar2.F(0);
            if ((wVar2.z() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                hVar.g(wVar2.f13860a, 0, 4, false);
                je.v vVar = this.f23682d;
                vVar.p(14);
                int i13 = vVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    hVar.f17897x = 0;
                    hVar.b(i10, false);
                } else {
                    hVar.b(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                hVar.f17897x = 0;
                hVar.b(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - i7 < 8192);
        return false;
    }

    @Override // pc.k
    public final void g(long j, long j5) {
        this.f23686h = false;
        this.f23679a.a();
        this.f23684f = j5;
    }

    @Override // pc.k
    public final void release() {
    }
}
