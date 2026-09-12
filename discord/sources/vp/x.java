package vp;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends d {
    public static final int[] E;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21924e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f21925i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d f21926v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f21927w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f21928x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f21929y = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i7 = 1;
        int i10 = 1;
        while (i7 > 0) {
            arrayList.add(Integer.valueOf(i7));
            int i11 = i10 + i7;
            i10 = i7;
            i7 = i11;
        }
        arrayList.add(Integer.MAX_VALUE);
        E = new int[arrayList.size()];
        int i12 = 0;
        while (true) {
            int[] iArr = E;
            if (i12 >= iArr.length) {
                return;
            }
            iArr[i12] = ((Integer) arrayList.get(i12)).intValue();
            i12++;
        }
    }

    public x(d dVar, d dVar2) {
        this.f21925i = dVar;
        this.f21926v = dVar2;
        int size = dVar.size();
        this.f21927w = size;
        this.f21924e = dVar2.size() + size;
        this.f21928x = Math.max(dVar.h(), dVar2.h()) + 1;
    }

    @Override // vp.d
    public final void e(int i7, int i10, int i11, byte[] bArr) {
        int i12 = i7 + i11;
        d dVar = this.f21925i;
        int i13 = this.f21927w;
        if (i12 <= i13) {
            dVar.e(i7, i10, i11, bArr);
            return;
        }
        d dVar2 = this.f21926v;
        if (i7 >= i13) {
            dVar2.e(i7 - i13, i10, i11, bArr);
            return;
        }
        int i14 = i13 - i7;
        dVar.e(i7, i10, i14, bArr);
        dVar2.e(0, i10 + i14, i11 - i14, bArr);
    }

    public final boolean equals(Object obj) {
        int iP;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            int size = dVar.size();
            int i7 = this.f21924e;
            if (i7 == size) {
                if (i7 == 0) {
                    return true;
                }
                if (this.f21929y == 0 || (iP = dVar.p()) == 0 || this.f21929y == iP) {
                    io.sentry.cache.tape.c cVar = new io.sentry.cache.tape.c(this);
                    t tVarA = cVar.a();
                    io.sentry.cache.tape.c cVar2 = new io.sentry.cache.tape.c(dVar);
                    t tVarA2 = cVar2.a();
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        int length = tVarA.f21919e.length - i10;
                        int length2 = tVarA2.f21919e.length - i11;
                        int iMin = Math.min(length, length2);
                        if (!(i10 == 0 ? tVarA.v(tVarA2, i11, iMin) : tVarA2.v(tVarA, i10, iMin))) {
                            break;
                        }
                        i12 += iMin;
                        if (i12 >= i7) {
                            if (i12 == i7) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == length) {
                            tVarA = cVar.a();
                            i10 = 0;
                        } else {
                            i10 += iMin;
                        }
                        if (iMin == length2) {
                            tVarA2 = cVar2.a();
                            i11 = 0;
                        } else {
                            i11 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // vp.d
    public final int h() {
        return this.f21928x;
    }

    public final int hashCode() {
        int iM = this.f21929y;
        if (iM == 0) {
            int i7 = this.f21924e;
            iM = m(i7, 0, i7);
            if (iM == 0) {
                iM = 1;
            }
            this.f21929y = iM;
        }
        return iM;
    }

    @Override // vp.d
    public final boolean i() {
        return this.f21924e >= E[this.f21928x];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new w(this);
    }

    @Override // vp.d
    public final boolean j() {
        int iO = this.f21925i.o(0, 0, this.f21927w);
        d dVar = this.f21926v;
        return dVar.o(iO, 0, dVar.size()) == 0;
    }

    @Override // vp.d
    public final int m(int i7, int i10, int i11) {
        int i12 = i10 + i11;
        d dVar = this.f21925i;
        int i13 = this.f21927w;
        if (i12 <= i13) {
            return dVar.m(i7, i10, i11);
        }
        d dVar2 = this.f21926v;
        if (i10 >= i13) {
            return dVar2.m(i7, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return dVar2.m(dVar.m(i7, i10, i14), 0, i11 - i14);
    }

    @Override // vp.d
    public final int o(int i7, int i10, int i11) {
        int i12 = i10 + i11;
        d dVar = this.f21925i;
        int i13 = this.f21927w;
        if (i12 <= i13) {
            return dVar.o(i7, i10, i11);
        }
        d dVar2 = this.f21926v;
        if (i10 >= i13) {
            return dVar2.o(i7, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return dVar2.o(dVar.o(i7, i10, i14), 0, i11 - i14);
    }

    @Override // vp.d
    public final int p() {
        return this.f21929y;
    }

    @Override // vp.d
    public final String r() {
        byte[] bArr;
        int i7 = this.f21924e;
        if (i7 == 0) {
            bArr = p.f21915a;
        } else {
            byte[] bArr2 = new byte[i7];
            e(0, 0, i7, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // vp.d
    public final int size() {
        return this.f21924e;
    }

    @Override // vp.d
    public final void t(OutputStream outputStream, int i7, int i10) {
        int i11 = i7 + i10;
        d dVar = this.f21925i;
        int i12 = this.f21927w;
        if (i11 <= i12) {
            dVar.t(outputStream, i7, i10);
            return;
        }
        d dVar2 = this.f21926v;
        if (i7 >= i12) {
            dVar2.t(outputStream, i7 - i12, i10);
            return;
        }
        int i13 = i12 - i7;
        dVar.t(outputStream, i7, i13);
        dVar2.t(outputStream, 0, i10 - i13);
    }
}
