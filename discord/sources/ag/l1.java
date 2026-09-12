package ag;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ByteArrayInputStream f537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k1 f538e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f539i = new byte[8];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final m1 f540v = new m1();

    public l1(ByteArrayInputStream byteArrayInputStream) {
        this.f537d = byteArrayInputStream;
    }

    public final long c() {
        u(ByteCompanionObject.MIN_VALUE);
        q();
        long jN = n();
        if (jN < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (jN > 0) {
            this.f540v.f545d.push(Long.valueOf(jN));
        }
        return jN;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f537d.close();
        this.f540v.k();
    }

    public final long f() {
        boolean z5;
        i();
        byte b10 = this.f538e.f533a;
        if (b10 == 0) {
            z5 = true;
        } else {
            if (b10 != 32) {
                throw new IllegalStateException(kk.b.h((this.f538e.f533a >> 5) & 7, "expected major type 0 or 1 but found "));
            }
            z5 = false;
        }
        long jN = n();
        if (jN >= 0) {
            return z5 ? jN : ~jN;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long g() {
        u((byte) -96);
        q();
        long jN = n();
        if (jN < 0 || jN > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (jN > 0) {
            this.f540v.f545d.push(Long.valueOf(jN + jN));
        }
        return jN;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        if (r0 != (-2)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ag.k1 i() {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.l1.i():ag.k1");
    }

    public final boolean l() {
        u((byte) -32);
        if (this.f538e.f534b > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int iN = (int) n();
        if (iN == 20) {
            return false;
        }
        if (iN == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    public final long n() throws IOException {
        byte b10 = this.f538e.f534b;
        if (b10 < 24) {
            long j = b10;
            this.f538e = null;
            return j;
        }
        if (b10 == 24) {
            int i7 = this.f537d.read();
            if (i7 == -1) {
                throw new EOFException();
            }
            this.f538e = null;
            return ((long) i7) & 255;
        }
        byte[] bArr = this.f539i;
        if (b10 == 25) {
            y(bArr, 2);
            return ((((long) bArr[0]) & 255) << 8) | (((long) bArr[1]) & 255);
        }
        if (b10 == 26) {
            y(bArr, 4);
            return ((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (((long) bArr[3]) & 255);
        }
        if (b10 != 27) {
            k1 k1Var = this.f538e;
            throw new IOException(a3.e.g(k1Var.f534b, (k1Var.f533a >> 5) & 7, "invalid additional information ", " for major type "));
        }
        y(bArr, 8);
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((((long) bArr[4]) & 255) << 24) | ((((long) bArr[5]) & 255) << 16) | ((((long) bArr[6]) & 255) << 8) | (((long) bArr[7]) & 255);
    }

    public final void q() {
        i();
        if (this.f538e.f534b == 31) {
            throw new IllegalStateException(kk.b.h(this.f538e.f534b, "expected definite length but found "));
        }
    }

    public final void u(byte b10) {
        i();
        if (this.f538e.f533a != b10) {
            throw new IllegalStateException(a3.e.g((b10 >> 5) & 7, (this.f538e.f533a >> 5) & 7, "expected major type ", " but found "));
        }
    }

    public final void y(byte[] bArr, int i7) throws IOException {
        int i10 = 0;
        while (i10 != i7) {
            int i11 = this.f537d.read(bArr, i10, i7 - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
        this.f538e = null;
    }

    public final byte[] z() {
        q();
        long jN = n();
        if (jN < 0 || jN > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (this.f537d.available() < jN) {
            throw new EOFException();
        }
        int i7 = (int) jN;
        byte[] bArr = new byte[i7];
        y(bArr, i7);
        return bArr;
    }
}
