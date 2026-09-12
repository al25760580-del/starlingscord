package bd;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f3153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f3154c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f3159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaFormat f3160i;
    public MediaCodec.CodecException j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3161l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IllegalStateException f3162m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3152a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ad.e f3155d = new ad.e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ad.e f3156e = new ad.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f3157f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f3158g = new ArrayDeque();

    public g(HandlerThread handlerThread) {
        this.f3153b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f3158g;
        if (!arrayDeque.isEmpty()) {
            this.f3160i = (MediaFormat) arrayDeque.getLast();
        }
        ad.e eVar = this.f3155d;
        eVar.f342d = 0;
        eVar.f343e = -1;
        eVar.f344i = 0;
        ad.e eVar2 = this.f3156e;
        eVar2.f342d = 0;
        eVar2.f343e = -1;
        eVar2.f344i = 0;
        this.f3157f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f3152a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        synchronized (this.f3152a) {
            this.f3155d.d(i7);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f3152a) {
            try {
                MediaFormat mediaFormat = this.f3160i;
                if (mediaFormat != null) {
                    this.f3156e.d(-2);
                    this.f3158g.add(mediaFormat);
                    this.f3160i = null;
                }
                this.f3156e.d(i7);
                this.f3157f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f3152a) {
            this.f3156e.d(-2);
            this.f3158g.add(mediaFormat);
            this.f3160i = null;
        }
    }
}
