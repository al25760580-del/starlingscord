package bd;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface l {
    void a(ke.h hVar, Handler handler);

    void d(int i7, lc.c cVar, long j);

    void flush();

    ByteBuffer getInputBuffer(int i7);

    ByteBuffer getOutputBuffer(int i7);

    MediaFormat getOutputFormat();

    void i(long j, int i7, int i10, int i11);

    void j(int i7, long j);

    int k();

    int m(MediaCodec.BufferInfo bufferInfo);

    void p(int i7);

    void release();

    void releaseOutputBuffer(int i7, boolean z5);

    void setOutputSurface(Surface surface);

    void setParameters(Bundle bundle);
}
