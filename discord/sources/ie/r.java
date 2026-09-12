package ie;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends BufferedOutputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11759d;

    public final void c(OutputStream outputStream) {
        je.b.k(this.f11759d);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f11759d = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f11759d = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i7 = e0.f13788a;
        throw th;
    }
}
