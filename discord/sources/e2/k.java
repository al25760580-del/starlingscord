package e2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes.dex */
public final class k extends OutputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f7879e;

    public /* synthetic */ k(BufferedSink bufferedSink, int i7) {
        this.f7878d = i7;
        this.f7879e = bufferedSink;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f7878d) {
            case 0:
            case 1:
                break;
            default:
                ((rs.o) this.f7879e).close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f7878d) {
            case 0:
                ((FileOutputStream) this.f7879e).flush();
                break;
            case 1:
                break;
            default:
                rs.o oVar = (rs.o) this.f7879e;
                if (!oVar.f19592i) {
                    oVar.flush();
                }
                break;
        }
    }

    public String toString() {
        switch (this.f7878d) {
            case 1:
                return ((Buffer) this.f7879e) + ".outputStream()";
            case 2:
                return ((rs.o) this.f7879e) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i7) throws IOException {
        switch (this.f7878d) {
            case 0:
                ((FileOutputStream) this.f7879e).write(i7);
                return;
            case 1:
                ((Buffer) this.f7879e).U(i7);
                return;
            default:
                rs.o oVar = (rs.o) this.f7879e;
                if (oVar.f19592i) {
                    throw new IOException("closed");
                }
                oVar.f19591e.U((byte) i7);
                oVar.c();
                return;
        }
    }

    public k(FileOutputStream fileOutputStream) {
        this.f7878d = 0;
        Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
        this.f7879e = fileOutputStream;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i7, int i10) {
        switch (this.f7878d) {
            case 0:
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                ((FileOutputStream) this.f7879e).write(bytes, i7, i10);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(bytes, "data");
                ((Buffer) this.f7879e).m1269write(bytes, i7, i10);
                return;
            default:
                Intrinsics.checkNotNullParameter(bytes, "data");
                rs.o oVar = (rs.o) this.f7879e;
                if (!oVar.f19592i) {
                    oVar.f19591e.m1269write(bytes, i7, i10);
                    oVar.c();
                    return;
                }
                throw new IOException("closed");
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] b10) throws IOException {
        switch (this.f7878d) {
            case 0:
                Intrinsics.checkNotNullParameter(b10, "b");
                ((FileOutputStream) this.f7879e).write(b10);
                break;
            default:
                super.write(b10);
                break;
        }
    }

    private final void c() {
    }

    private final void f() {
    }

    private final void g() {
    }
}
