package na;

import com.facebook.imagepipeline.image.ImageInfo;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public interface c extends Closeable, ImageInfo, v9.a {
    k G();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getHeight();

    int getWidth();

    boolean h0();

    boolean isClosed();

    int j();
}
