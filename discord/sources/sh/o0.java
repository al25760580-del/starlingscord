package sh;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends OutputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0 f20135d = new z0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f20136e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n1 f20137i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f20138v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f20139w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FileOutputStream f20140x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public z f20141y;

    public o0(File file, n1 n1Var) {
        this.f20136e = file;
        this.f20137i = n1Var;
    }

    @Override // java.io.OutputStream
    public final void write(int i7) {
        write(new byte[]{(byte) i7}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        int i13 = i7;
        int i14 = i10;
        while (i14 > 0) {
            if (this.f20138v == 0 && this.f20139w == 0) {
                z0 z0Var = this.f20135d;
                int iA = z0Var.a(bArr, i13, i14);
                if (iA == -1) {
                    return;
                }
                i13 += iA;
                i14 -= iA;
                z zVarB = z0Var.b();
                this.f20141y = zVarB;
                boolean z5 = zVarB.f20249e;
                n1 n1Var = this.f20137i;
                if (z5) {
                    this.f20138v = 0L;
                    byte[] bArr2 = zVarB.f20250f;
                    n1Var.k(bArr2, bArr2.length);
                    this.f20139w = this.f20141y.f20250f.length;
                } else if (zVarB.f20247c == 0) {
                    String str = zVarB.f20245a;
                    if (!(str == null ? false : str.endsWith("/"))) {
                        n1Var.i(this.f20141y.f20250f);
                        File file = new File(this.f20136e, this.f20141y.f20245a);
                        file.getParentFile().mkdirs();
                        this.f20138v = this.f20141y.f20246b;
                        this.f20140x = new FileOutputStream(file);
                    } else {
                        byte[] bArr3 = this.f20141y.f20250f;
                        n1Var.k(bArr3, bArr3.length);
                        this.f20138v = this.f20141y.f20246b;
                    }
                } else {
                    byte[] bArr4 = this.f20141y.f20250f;
                    n1Var.k(bArr4, bArr4.length);
                    this.f20138v = this.f20141y.f20246b;
                }
            }
            int iMin = i14;
            String str2 = this.f20141y.f20245a;
            if (str2 == null ? false : str2.endsWith("/")) {
                i14 = iMin;
            } else {
                long j = iMin;
                z zVar = this.f20141y;
                if (zVar.f20249e) {
                    i11 = i13;
                    this.f20137i.d(this.f20139w, bArr, i11, iMin);
                    i12 = iMin;
                    this.f20139w += j;
                } else {
                    i11 = i13;
                    i12 = iMin;
                    if (zVar.f20247c == 0) {
                        iMin = (int) Math.min(j, this.f20138v);
                        this.f20140x.write(bArr, i11, iMin);
                        long j5 = this.f20138v - ((long) iMin);
                        this.f20138v = j5;
                        if (j5 == 0) {
                            this.f20140x.close();
                        }
                    } else {
                        iMin = (int) Math.min(j, this.f20138v);
                        z zVar2 = this.f20141y;
                        this.f20137i.d((((long) zVar2.f20250f.length) + zVar2.f20246b) - this.f20138v, bArr, i11, iMin);
                        this.f20138v -= (long) iMin;
                    }
                }
                i13 = i11 + iMin;
                i14 = i12 - iMin;
            }
        }
    }
}
