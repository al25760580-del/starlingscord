package ad;

import java.util.NoSuchElementException;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements xc.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f342d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f343e = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f344i = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f345v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f346w;

    public e() {
        int[] iArr = new int[16];
        this.f346w = iArr;
        this.f345v = iArr.length - 1;
    }

    @Override // xc.d
    public int a() {
        return -1;
    }

    @Override // xc.d
    public int b() {
        return this.f342d;
    }

    @Override // xc.d
    public int c() {
        w wVar = (w) this.f346w;
        int i7 = this.f343e;
        if (i7 == 8) {
            return wVar.u();
        }
        if (i7 == 16) {
            return wVar.z();
        }
        int i10 = this.f344i;
        this.f344i = i10 + 1;
        if (i10 % 2 != 0) {
            return this.f345v & 15;
        }
        int iU = wVar.u();
        this.f345v = iU;
        return (iU & 240) >> 4;
    }

    public void d(int i7) {
        int i10 = this.f344i;
        int[] iArr = (int[]) this.f346w;
        if (i10 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i11 = this.f342d;
            int i12 = length2 - i11;
            System.arraycopy(iArr, i11, iArr2, 0, i12);
            System.arraycopy((int[]) this.f346w, 0, iArr2, i12, i11);
            this.f342d = 0;
            this.f343e = this.f344i - 1;
            this.f346w = iArr2;
            this.f345v = length - 1;
        }
        int i13 = (this.f343e + 1) & this.f345v;
        this.f343e = i13;
        ((int[]) this.f346w)[i13] = i7;
        this.f344i++;
    }

    public int e() {
        int i7 = this.f344i;
        if (i7 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = (int[]) this.f346w;
        int i10 = this.f342d;
        int i11 = iArr[i10];
        this.f342d = (i10 + 1) & this.f345v;
        this.f344i = i7 - 1;
        return i11;
    }
}
