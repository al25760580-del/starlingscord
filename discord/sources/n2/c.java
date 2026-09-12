package n2;

import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class c extends FilterOutputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DataOutputStream f16247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteOrder f16248e;

    public c(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f16247d = new DataOutputStream(outputStream);
        this.f16248e = byteOrder;
    }

    public final void c(int i7) throws IOException {
        this.f16247d.write(i7);
    }

    public final void f(int i7) throws IOException {
        ByteOrder byteOrder = this.f16248e;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        DataOutputStream dataOutputStream = this.f16247d;
        if (byteOrder == byteOrder2) {
            dataOutputStream.write(i7 & 255);
            dataOutputStream.write((i7 >>> 8) & 255);
            dataOutputStream.write((i7 >>> 16) & 255);
            dataOutputStream.write((i7 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            dataOutputStream.write((i7 >>> 24) & 255);
            dataOutputStream.write((i7 >>> 16) & 255);
            dataOutputStream.write((i7 >>> 8) & 255);
            dataOutputStream.write(i7 & 255);
        }
    }

    public final void g(short s2) throws IOException {
        ByteOrder byteOrder = this.f16248e;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        DataOutputStream dataOutputStream = this.f16247d;
        if (byteOrder == byteOrder2) {
            dataOutputStream.write(s2 & 255);
            dataOutputStream.write((s2 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            dataOutputStream.write((s2 >>> 8) & 255);
            dataOutputStream.write(s2 & 255);
        }
    }

    public final void i(long j) throws IOException {
        if (j > 4294967295L) {
            throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
        }
        f((int) j);
    }

    public final void l(int i7) throws IOException {
        if (i7 > 65535) {
            throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
        }
        g((short) i7);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f16247d.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i10) throws IOException {
        this.f16247d.write(bArr, i7, i10);
    }
}
