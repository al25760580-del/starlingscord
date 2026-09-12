package ij;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11805c;

    public /* synthetic */ f(int i7, int i10, int i11) {
        this.f11803a = i11;
        this.f11804b = i7;
        this.f11805c = i10;
    }

    public static rp.b a(f fVar) {
        return new rp.b(fVar.f11804b + fVar.f11805c, 1, 1);
    }

    public static rp.b b() {
        return new rp.b(0, 1, 1);
    }

    public abstract byte[] c();

    public abstract byte[] d(byte[] bArr, int i7);

    public boolean e() {
        return false;
    }

    public f f() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public String toString() {
        char c8;
        switch (this.f11803a) {
            case 0:
                int i7 = this.f11804b;
                byte[] bArrD = new byte[i7];
                int i10 = this.f11805c;
                StringBuilder sb2 = new StringBuilder((i7 + 1) * i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    bArrD = d(bArrD, i11);
                    for (int i12 = 0; i12 < i7; i12++) {
                        int i13 = bArrD[i12] & 255;
                        if (i13 < 64) {
                            c8 = '#';
                        } else if (i13 < 128) {
                            c8 = '+';
                        } else {
                            c8 = i13 < 192 ? '.' : ' ';
                        }
                        sb2.append(c8);
                    }
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
