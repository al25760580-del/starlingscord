package cs;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class v extends Reader {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BufferedSource f7494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Charset f7495e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7496i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InputStreamReader f7497v;

    public v(BufferedSource source, Charset charset) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f7494d = source;
        this.f7495e = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Unit unit;
        this.f7496i = true;
        InputStreamReader inputStreamReader = this.f7497v;
        if (inputStreamReader == null) {
            unit = null;
        } else {
            inputStreamReader.close();
            unit = Unit.f14616a;
        }
        if (unit == null) {
            this.f7494d.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cbuf, int i7, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(cbuf, "cbuf");
        if (this.f7496i) {
            throw new IOException("Stream closed");
        }
        InputStreamReader inputStreamReader = this.f7497v;
        if (inputStreamReader == null) {
            BufferedSource bufferedSource = this.f7494d;
            inputStreamReader = new InputStreamReader(bufferedSource.k0(), ds.b.r(bufferedSource, this.f7495e));
            this.f7497v = inputStreamReader;
        }
        return inputStreamReader.read(cbuf, i7, i10);
    }
}
