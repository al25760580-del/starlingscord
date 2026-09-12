package p0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparable {
    public int I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17758d;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f17762w;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17759e = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17760i = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f17761v = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f17763x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float[] f17764y = new float[9];
    public final float[] E = new float[9];
    public b[] F = new b[16];
    public int G = 0;
    public int H = 0;

    public e(int i7) {
        this.I = i7;
    }

    public final void a(b bVar) {
        int i7 = 0;
        while (true) {
            int i10 = this.G;
            if (i7 >= i10) {
                b[] bVarArr = this.F;
                if (i10 >= bVarArr.length) {
                    this.F = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.F;
                int i11 = this.G;
                bVarArr2[i11] = bVar;
                this.G = i11 + 1;
                return;
            }
            if (this.F[i7] == bVar) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final void b(b bVar) {
        int i7 = this.G;
        int i10 = 0;
        while (i10 < i7) {
            if (this.F[i10] == bVar) {
                while (i10 < i7 - 1) {
                    b[] bVarArr = this.F;
                    int i11 = i10 + 1;
                    bVarArr[i10] = bVarArr[i11];
                    i10 = i11;
                }
                this.G--;
                return;
            }
            i10++;
        }
    }

    public final void c() {
        this.I = 5;
        this.f17761v = 0;
        this.f17759e = -1;
        this.f17760i = -1;
        this.f17762w = 0.0f;
        this.f17763x = false;
        int i7 = this.G;
        for (int i10 = 0; i10 < i7; i10++) {
            this.F[i10] = null;
        }
        this.G = 0;
        this.H = 0;
        this.f17758d = false;
        Arrays.fill(this.E, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f17759e - ((e) obj).f17759e;
    }

    public final void d(c cVar, float f2) {
        this.f17762w = f2;
        this.f17763x = true;
        int i7 = this.G;
        this.f17760i = -1;
        for (int i10 = 0; i10 < i7; i10++) {
            this.F[i10].h(cVar, this, false);
        }
        this.G = 0;
    }

    public final void e(c cVar, b bVar) {
        int i7 = this.G;
        for (int i10 = 0; i10 < i7; i10++) {
            this.F[i10].i(cVar, bVar, false);
        }
        this.G = 0;
    }

    public final String toString() {
        return "" + this.f17759e;
    }
}
