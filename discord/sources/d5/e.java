package d5;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f7613d;

    public e(a aVar, int i7) {
        this.f7613d = aVar;
        ((ByteArrayOutputStream) this).buf = aVar.a(Math.max(i7, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER));
    }

    public final void c(int i7) {
        int i10 = ((ByteArrayOutputStream) this).count;
        if (i10 + i7 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i11 = (i10 + i7) * 2;
        a aVar = this.f7613d;
        byte[] bArrA = aVar.a(i11);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrA, 0, ((ByteArrayOutputStream) this).count);
        aVar.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrA;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7613d.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f7613d.b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i7, int i10) {
        c(i10);
        super.write(bArr, i7, i10);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i7) {
        c(1);
        super.write(i7);
    }
}
