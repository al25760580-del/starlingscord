package on;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ByteArrayOutputStream {
    public d(byte[] bArr) {
        super(0);
        ((ByteArrayOutputStream) this).buf = bArr;
    }

    public final ByteBuffer c(int i7) {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        if (bArr.length < i7) {
            int length = bArr.length << 1;
            if (length - i7 < 0) {
                length = i7;
            }
            if (length - 2147483639 > 0) {
                if (i7 < 0) {
                    throw new OutOfMemoryError();
                }
                length = i7 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            ((ByteArrayOutputStream) this).buf = Arrays.copyOf(bArr, length);
        }
        return ByteBuffer.wrap(((ByteArrayOutputStream) this).buf);
    }

    public final byte[] f() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public final void g(int i7) {
        ((ByteArrayOutputStream) this).count = i7;
    }
}
