package n2;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {
    public g(byte[] bArr) {
        super(bArr);
        this.f16242d.mark(Integer.MAX_VALUE);
    }

    public final void f(long j) throws IOException {
        int i7 = this.f16243e;
        if (i7 > j) {
            this.f16243e = 0;
            this.f16242d.reset();
        } else {
            j -= (long) i7;
        }
        c((int) j);
    }

    public g(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f16242d.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
