package org.chromium.net;

/* JADX INFO: loaded from: classes.dex */
public abstract class QuicException extends NetworkException {
    public QuicException(String str, Throwable th2) {
        super(str, th2);
    }

    public int getConnectionCloseSource() {
        return 0;
    }

    public abstract int getQuicDetailedErrorCode();
}
