package zc;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f23871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23872e;

    public u(int i7) {
        this.f23868a = i7;
        byte[] bArr = new byte[131];
        this.f23871d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i7, int i10) {
        if (this.f23869b) {
            int i11 = i10 - i7;
            byte[] bArr2 = this.f23871d;
            int length = bArr2.length;
            int i12 = this.f23872e;
            if (length < i12 + i11) {
                this.f23871d = Arrays.copyOf(bArr2, (i12 + i11) * 2);
            }
            System.arraycopy(bArr, i7, this.f23871d, this.f23872e, i11);
            this.f23872e += i11;
        }
    }

    public final boolean b(int i7) {
        if (!this.f23869b) {
            return false;
        }
        this.f23872e -= i7;
        this.f23869b = false;
        this.f23870c = true;
        return true;
    }

    public final void c() {
        this.f23869b = false;
        this.f23870c = false;
    }

    public final void d(int i7) {
        je.b.k(!this.f23869b);
        boolean z5 = i7 == this.f23868a;
        this.f23869b = z5;
        if (z5) {
            this.f23872e = 3;
            this.f23870c = false;
        }
    }
}
