package hj;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends FilterInputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10800e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(InputStream inputStream, int i7, int i10) {
        super(inputStream);
        this.f10799d = i10;
        this.f10800e = i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.f10799d) {
            case 0:
                break;
        }
        return Math.min(super.available(), this.f10800e);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f10799d) {
            case 0:
                if (this.f10800e <= 0) {
                    return -1;
                }
                int i7 = super.read();
                if (i7 < 0) {
                    return i7;
                }
                this.f10800e--;
                return i7;
            default:
                if (this.f10800e <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 < 0) {
                    return i10;
                }
                this.f10800e--;
                return i10;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        switch (this.f10799d) {
            case 0:
                int iSkip = (int) super.skip(Math.min(j, this.f10800e));
                if (iSkip >= 0) {
                    this.f10800e -= iSkip;
                }
                return iSkip;
            default:
                long jSkip = super.skip(Math.min(j, this.f10800e));
                if (jSkip >= 0) {
                    this.f10800e = (int) (((long) this.f10800e) - jSkip);
                }
                return jSkip;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        switch (this.f10799d) {
            case 0:
                int i11 = this.f10800e;
                if (i11 <= 0) {
                    return -1;
                }
                int i12 = super.read(bArr, i7, Math.min(i10, i11));
                if (i12 < 0) {
                    return i12;
                }
                this.f10800e -= i12;
                return i12;
            default:
                int i13 = this.f10800e;
                if (i13 <= 0) {
                    return -1;
                }
                int i14 = super.read(bArr, i7, Math.min(i10, i13));
                if (i14 < 0) {
                    return i14;
                }
                this.f10800e -= i14;
                return i14;
        }
    }
}
