package sh;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends FilterInputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0 f19984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f19985e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f19986i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f19987v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f19988w;

    public b0(InputStream inputStream) {
        super(inputStream);
        this.f19984d = new z0();
        this.f19985e = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
        this.f19987v = false;
        this.f19988w = false;
    }

    public final z c() {
        byte[] bArr;
        if (this.f19986i > 0) {
            do {
                bArr = this.f19985e;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f19987v || this.f19988w) {
            return new z(null, -1L, -1, false, false, null);
        }
        boolean zF = f(30);
        z0 z0Var = this.f19984d;
        if (!zF) {
            this.f19987v = true;
            return z0Var.b();
        }
        z zVarB = z0Var.b();
        if (zVarB.f20249e) {
            this.f19988w = true;
            return zVarB;
        }
        if (zVarB.f20246b == 4294967295L) {
            throw new l0("Files bigger than 4GiB are not supported.");
        }
        int i7 = z0Var.f20256f - 30;
        int length = this.f19985e.length;
        long j = i7;
        if (j > length) {
            do {
                length += length;
            } while (length < j);
            this.f19985e = Arrays.copyOf(this.f19985e, length);
        }
        if (!f(i7)) {
            this.f19987v = true;
            return z0Var.b();
        }
        z zVarB2 = z0Var.b();
        this.f19986i = zVarB2.f20246b;
        return zVarB2;
    }

    public final boolean f(int i7) {
        int iMax = Math.max(0, super.read(this.f19985e, 0, i7));
        z0 z0Var = this.f19984d;
        if (iMax != i7) {
            int i10 = i7 - iMax;
            if (Math.max(0, super.read(this.f19985e, iMax, i10)) != i10) {
                z0Var.a(this.f19985e, 0, iMax);
                return false;
            }
        }
        z0Var.a(this.f19985e, 0, i7);
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) {
        long j = this.f19986i;
        if (j <= 0 || this.f19987v) {
            return -1;
        }
        int iMax = Math.max(0, super.read(bArr, i7, (int) Math.min(j, i10)));
        this.f19986i -= (long) iMax;
        if (iMax != 0) {
            return iMax;
        }
        this.f19987v = true;
        return 0;
    }
}
