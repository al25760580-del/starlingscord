package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import rs.m;

/* JADX INFO: loaded from: classes.dex */
public interface BufferedSource extends Source, ReadableByteChannel {
    String E(Charset charset);

    ByteString L();

    boolean N(long j);

    String S();

    String V();

    long Z(Sink sink);

    int b0(m mVar);

    void d0(long j);

    Buffer h();

    long i0();

    InputStream k0();

    ByteString m(long j);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j);

    byte[] t();

    void v(Buffer buffer, long j);

    String w(long j);
}
