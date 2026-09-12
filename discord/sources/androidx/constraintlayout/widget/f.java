package androidx.constraintlayout.widget;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f1366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f1367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f1369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f1370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f1372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f1373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1374i;
    public int[] j;
    public boolean[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1375l;

    public final void a(float f2, int i7) {
        int i10 = this.f1371f;
        int[] iArr = this.f1369d;
        if (i10 >= iArr.length) {
            this.f1369d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f1370e;
            this.f1370e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f1369d;
        int i11 = this.f1371f;
        iArr2[i11] = i7;
        float[] fArr2 = this.f1370e;
        this.f1371f = i11 + 1;
        fArr2[i11] = f2;
    }

    public final void b(int i7, int i10) {
        int i11 = this.f1368c;
        int[] iArr = this.f1366a;
        if (i11 >= iArr.length) {
            this.f1366a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f1367b;
            this.f1367b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f1366a;
        int i12 = this.f1368c;
        iArr3[i12] = i7;
        int[] iArr4 = this.f1367b;
        this.f1368c = i12 + 1;
        iArr4[i12] = i10;
    }

    public final void c(int i7, String str) {
        int i10 = this.f1374i;
        int[] iArr = this.f1372g;
        if (i10 >= iArr.length) {
            this.f1372g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f1373h;
            this.f1373h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f1372g;
        int i11 = this.f1374i;
        iArr2[i11] = i7;
        String[] strArr2 = this.f1373h;
        this.f1374i = i11 + 1;
        strArr2[i11] = str;
    }

    public final void d(int i7, boolean z5) {
        int i10 = this.f1375l;
        int[] iArr = this.j;
        if (i10 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.k;
            this.k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i11 = this.f1375l;
        iArr2[i11] = i7;
        boolean[] zArr2 = this.k;
        this.f1375l = i11 + 1;
        zArr2[i11] = z5;
    }
}
