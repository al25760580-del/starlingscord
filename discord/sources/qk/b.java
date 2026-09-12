package qk;

import android.media.MediaCodec;
import android.media.MediaFormat;
import org.webrtc.MediaStreamTrack;
import rk.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaCodec f18918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaCodec.BufferInfo f18921e;

    public b(int i7) {
        this.f18917a = i7;
        switch (i7) {
            case 1:
                this.f18919c = true;
                this.f18921e = new MediaCodec.BufferInfo();
                break;
            default:
                this.f18921e = new MediaCodec.BufferInfo();
                break;
        }
    }

    public void a(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("mime") && mediaFormat.getString("mime").startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            if (!mediaFormat.containsKey("color-format")) {
                mediaFormat.setInteger("color-format", 2130708361);
            }
            if (!mediaFormat.containsKey("frame-rate")) {
                mediaFormat.setInteger("frame-rate", 30);
            }
        }
        this.f18918b = xk.a.c(mediaFormat, null, true, 6, 3, 4);
        this.f18919c = false;
    }

    public void b(a aVar) {
        MediaCodec mediaCodec = this.f18918b;
        int i7 = aVar.f18914a;
        MediaCodec.BufferInfo bufferInfo = aVar.f18916c;
        mediaCodec.queueInputBuffer(i7, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
    }

    public final void c() throws e {
        switch (this.f18917a) {
            case 0:
                MediaCodec mediaCodec = this.f18918b;
                if (mediaCodec == null) {
                    throw new IllegalStateException("Codec is not initialized");
                }
                if (this.f18919c) {
                    return;
                }
                try {
                    mediaCodec.start();
                    this.f18919c = true;
                    return;
                } catch (Exception e10) {
                    throw new e(10, null, e10);
                }
            default:
                try {
                    if (this.f18920d) {
                        return;
                    }
                    this.f18918b.start();
                    this.f18920d = true;
                    return;
                } catch (Exception e11) {
                    throw new e(10, null, e11);
                }
        }
    }
}
