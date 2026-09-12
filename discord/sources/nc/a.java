package nc;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends UploadDataProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f16540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16541e;

    public a(byte[] bArr) {
        this.f16540d = bArr;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.f16540d.length;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = this.f16540d;
        int iMin = Math.min(iRemaining, bArr.length - this.f16541e);
        byteBuffer.put(bArr, this.f16541e, iMin);
        this.f16541e += iMin;
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.f16541e = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
