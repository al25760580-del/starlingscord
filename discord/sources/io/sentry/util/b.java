package io.sentry.util;

import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Writer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13221d = 0;

    public static int c(char c8) {
        if (c8 <= 127) {
            return 1;
        }
        return (c8 > 2047 && !Character.isSurrogate(c8)) ? 3 : 2;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i7, int i10) {
        for (int i11 = i7; i11 < i7 + i10; i11++) {
            this.f13221d += (long) c(cArr[i11]);
        }
    }

    @Override // java.io.Writer
    public final void write(int i7) {
        this.f13221d += (long) c((char) i7);
    }

    @Override // java.io.Writer
    public final void write(String str, int i7, int i10) {
        for (int i11 = i7; i11 < i7 + i10; i11++) {
            this.f13221d += (long) c(str.charAt(i11));
        }
    }
}
