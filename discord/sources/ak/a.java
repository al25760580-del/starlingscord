package ak;

import e4.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f630e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f631a = new int[929];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f632b = new int[929];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f634d;

    public a() {
        int i7 = 1;
        for (int i10 = 0; i10 < 929; i10++) {
            this.f631a[i10] = i7;
            i7 = (i7 * 3) % 929;
        }
        for (int i11 = 0; i11 < 928; i11++) {
            this.f632b[this.f631a[i11]] = i11;
        }
        this.f633c = new c(this, new int[]{0});
        this.f634d = new c(this, new int[]{1});
    }

    public final int a(int i7, int i10) {
        return (i7 + i10) % 929;
    }

    public final int b(int i7) {
        if (i7 == 0) {
            throw new ArithmeticException();
        }
        return this.f631a[928 - this.f632b[i7]];
    }

    public final int c(int i7, int i10) {
        if (i7 == 0 || i10 == 0) {
            return 0;
        }
        int[] iArr = this.f632b;
        return this.f631a[(iArr[i7] + iArr[i10]) % 928];
    }
}
