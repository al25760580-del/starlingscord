package qk;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteBuffer f18915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaCodec.BufferInfo f18916c;

    public a(int i7, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f18914a = i7;
        this.f18915b = byteBuffer;
        if (bufferInfo == null) {
            this.f18916c = new MediaCodec.BufferInfo();
        } else {
            this.f18916c = bufferInfo;
        }
    }
}
