package okio;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public interface BufferedSink extends Sink, WritableByteChannel {
    BufferedSink A(String str);

    long J(Source source);

    BufferedSink K(long j);

    BufferedSink X(ByteString byteString);

    BufferedSink f0(long j);

    @Override // okio.Sink, java.io.Flushable
    void flush();

    OutputStream g0();

    Buffer h();

    BufferedSink p();

    BufferedSink write(byte[] bArr);

    BufferedSink write(byte[] bArr, int i7, int i10);

    BufferedSink writeByte(int i7);

    BufferedSink writeInt(int i7);

    BufferedSink writeShort(int i7);
}
