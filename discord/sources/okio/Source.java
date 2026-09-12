package okio;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface Source extends Closeable {
    long read(Buffer buffer, long j);

    Timeout timeout();
}
