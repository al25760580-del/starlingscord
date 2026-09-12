package n2;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DataInputStream f16242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16243e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ByteOrder f16244i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f16245v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f16246w;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.f16246w = bArr.length;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f16242d.available();
    }

    public final void c(int i7) throws IOException {
        int i10 = 0;
        while (i10 < i7) {
            int i11 = i7 - i10;
            DataInputStream dataInputStream = this.f16242d;
            int iSkip = (int) dataInputStream.skip(i11);
            if (iSkip <= 0) {
                if (this.f16245v == null) {
                    this.f16245v = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f16245v, 0, Math.min(8192, i11));
                if (iSkip == -1) {
                    throw new EOFException(s0.g.d(i7, "Reached EOF while skipping ", " bytes."));
                }
            }
            i10 += iSkip;
        }
        this.f16243e += i10;
    }

    @Override // java.io.InputStream
    public final void mark(int i7) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f16243e++;
        return this.f16242d.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f16243e++;
        return this.f16242d.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f16243e++;
        int i7 = this.f16242d.read();
        if (i7 >= 0) {
            return (byte) i7;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f16243e += 2;
        return this.f16242d.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i7, int i10) throws IOException {
        this.f16243e += i10;
        this.f16242d.readFully(bArr, i7, i10);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f16243e += 4;
        DataInputStream dataInputStream = this.f16242d;
        int i7 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        if ((i7 | i10 | i11 | i12) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f16244i;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i12 << 24) + (i11 << 16) + (i10 << 8) + i7;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i7 << 24) + (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IOException("Invalid byte order: " + this.f16244i);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j;
        long j5;
        this.f16243e += 8;
        DataInputStream dataInputStream = this.f16242d;
        int i7 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        if ((i7 | i10 | i11 | i12 | i13 | i14 | i15 | i16) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f16244i;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j = (((long) i16) << 56) + (((long) i15) << 48) + (((long) i14) << 40) + (((long) i13) << 32) + (((long) i12) << 24) + (((long) i11) << 16) + (((long) i10) << 8);
            j5 = i7;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f16244i);
            }
            j = (((long) i7) << 56) + (((long) i10) << 48) + (((long) i11) << 40) + (((long) i12) << 32) + (((long) i13) << 24) + (((long) i14) << 16) + (((long) i15) << 8);
            j5 = i16;
        }
        return j + j5;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f16243e += 2;
        DataInputStream dataInputStream = this.f16242d;
        int i7 = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i7 | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f16244i;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i10 << 8) + i7);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i7 << 8) + i10);
        }
        throw new IOException("Invalid byte order: " + this.f16244i);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f16243e += 2;
        return this.f16242d.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f16243e++;
        return this.f16242d.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f16243e += 2;
        DataInputStream dataInputStream = this.f16242d;
        int i7 = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i7 | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f16244i;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i10 << 8) + i7;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i7 << 8) + i10;
        }
        throw new IOException("Invalid byte order: " + this.f16244i);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i7) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        int i11 = this.f16242d.read(bArr, i7, i10);
        this.f16243e += i11;
        return i11;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f16243e += bArr.length;
        this.f16242d.readFully(bArr);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f16242d = dataInputStream;
        dataInputStream.mark(0);
        this.f16243e = 0;
        this.f16244i = byteOrder;
        this.f16246w = inputStream instanceof b ? ((b) inputStream).f16246w : -1;
    }
}
