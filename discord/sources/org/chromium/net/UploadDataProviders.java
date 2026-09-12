package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new vs.c(new pf.b(11, file));
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new vs.c(new op.c(11, parcelFileDescriptor));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new vs.a(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr, int i7, int i10) {
        return new vs.a(ByteBuffer.wrap(bArr, i7, i10).slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return new vs.a(ByteBuffer.wrap(bArr, 0, bArr.length).slice());
    }
}
