package wk;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f22323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MediaCodec.BufferInfo f22324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22325o;

    public b(uk.a aVar, int i7, uk.b bVar, int i10) {
        super(i7, i10, null, null, null, aVar, bVar, null);
    }

    @Override // wk.c
    public final int e() {
        int i7 = this.f22325o;
        if (i7 == 4) {
            return i7;
        }
        if (i7 == 5) {
            this.f22325o = b();
            return 4;
        }
        boolean z5 = this.f22334i;
        long j = this.k;
        int i10 = this.f22332g;
        uk.b bVar = this.f22327b;
        uk.a aVar = this.f22326a;
        if (!z5) {
            MediaFormat trackFormat = aVar.getTrackFormat(i10);
            this.j = trackFormat;
            if (j > 0) {
                trackFormat.setLong("durationUs", j);
            }
            MediaFormat mediaFormat = this.j;
            int i11 = this.f22333h;
            bVar.a(mediaFormat, i11);
            this.f22333h = i11;
            this.f22334i = true;
            this.f22323m = ByteBuffer.allocate(this.j.containsKey("max-input-size") ? this.j.getInteger("max-input-size") : 1048576);
            this.f22325o = 1;
            return 1;
        }
        int sampleTrackIndex = aVar.getSampleTrackIndex();
        if (sampleTrackIndex != -1 && sampleTrackIndex != i10) {
            this.f22325o = 2;
            return 2;
        }
        this.f22325o = 2;
        int sampleData = aVar.readSampleData(this.f22323m, 0);
        long sampleTime = aVar.getSampleTime();
        int sampleFlags = aVar.getSampleFlags();
        if (sampleData < 0 || (sampleFlags & 4) != 0) {
            this.f22323m.clear();
            this.f22335l = 1.0f;
            this.f22325o = 4;
            Log.d("b", "Reach EoS on input stream");
        } else {
            this.f22331f.getClass();
            if (sampleTime >= LongCompanionObject.MAX_VALUE) {
                this.f22323m.clear();
                this.f22335l = 1.0f;
                MediaCodec.BufferInfo bufferInfo = this.f22324n;
                bufferInfo.set(0, 0, sampleTime, bufferInfo.flags | 4);
                bVar.c(this.f22333h, this.f22323m, this.f22324n);
                this.f22325o = b();
                Log.d("b", "Reach selection end on input stream");
            } else {
                if (sampleTime >= 0) {
                    int i12 = (sampleFlags & 1) != 0 ? 1 : 0;
                    if (j > 0) {
                        this.f22335l = sampleTime / j;
                    }
                    this.f22324n.set(0, sampleData, sampleTime, i12);
                    bVar.c(this.f22333h, this.f22323m, this.f22324n);
                }
                aVar.advance();
            }
        }
        return this.f22325o;
    }

    @Override // wk.c
    public final void f() {
        this.f22326a.selectTrack(this.f22332g);
        this.f22324n = new MediaCodec.BufferInfo();
    }

    @Override // wk.c
    public final void g() {
        ByteBuffer byteBuffer = this.f22323m;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.f22323m = null;
        }
    }

    @Override // wk.c
    public final void c() {
    }

    @Override // wk.c
    public final void d() {
    }
}
