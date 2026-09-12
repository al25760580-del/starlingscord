package wk;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import com.linkedin.android.litr.io.MediaRange;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;
import rk.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22319m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22320n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22321o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MediaFormat f22322p;

    @Override // wk.c
    public final int e() throws e {
        int i7;
        int i10;
        int iB;
        qk.b bVar = this.f22330e;
        boolean z5 = bVar.f18920d;
        MediaCodec.BufferInfo bufferInfo = bVar.f18921e;
        if (!z5) {
            return -3;
        }
        qk.b bVar2 = this.f22329d;
        boolean z6 = bVar2.f18919c;
        MediaCodec.BufferInfo bufferInfo2 = bVar2.f18921e;
        if (!z6) {
            return -3;
        }
        if (this.f22319m == 5) {
            this.f22319m = b();
        }
        int i11 = this.f22319m;
        MediaRange mediaRange = this.f22331f;
        if (i11 != 4 && i11 != 5) {
            uk.a aVar = this.f22326a;
            int sampleTrackIndex = aVar.getSampleTrackIndex();
            if (sampleTrackIndex == this.f22332g || sampleTrackIndex == -1) {
                int iDequeueInputBuffer = bVar2.f18918b.dequeueInputBuffer(0L);
                if (iDequeueInputBuffer >= 0) {
                    qk.a aVar2 = iDequeueInputBuffer >= 0 ? new qk.a(iDequeueInputBuffer, bVar2.f18918b.getInputBuffer(iDequeueInputBuffer), null) : null;
                    if (aVar2 == null) {
                        throw new e(11, null, null);
                    }
                    int sampleData = aVar.readSampleData(aVar2.f18915b, 0);
                    long sampleTime = aVar.getSampleTime();
                    int sampleFlags = aVar.getSampleFlags();
                    if (sampleData < 0 || (sampleFlags & 4) != 0) {
                        aVar2.f18916c.set(0, 0, -1L, 4);
                        bVar2.b(aVar2);
                        Log.d("a", "EoS reached on the input stream");
                        iB = 4;
                    } else {
                        mediaRange.getClass();
                        if (sampleTime >= LongCompanionObject.MAX_VALUE) {
                            aVar2.f18916c.set(0, 0, -1L, 4);
                            bVar2.b(aVar2);
                            iB = b();
                            Log.d("a", "Selection end reached on the input stream");
                        } else {
                            aVar2.f18916c.set(0, sampleData, sampleTime, sampleFlags);
                            bVar2.b(aVar2);
                            aVar.advance();
                        }
                    }
                } else if (iDequeueInputBuffer != -1) {
                    Log.e("a", "Unhandled value " + iDequeueInputBuffer + " when decoding an input frame");
                }
                iB = 2;
            } else {
                iB = 2;
            }
            this.f22319m = iB;
        }
        int i12 = this.f22320n;
        vk.e eVar = this.f22328c;
        if (i12 != 4) {
            int iDequeueOutputBuffer = bVar2.f18918b.dequeueOutputBuffer(bufferInfo2, 0L);
            if (iDequeueOutputBuffer >= 0) {
                qk.a aVar3 = iDequeueOutputBuffer >= 0 ? new qk.a(iDequeueOutputBuffer, bVar2.f18918b.getOutputBuffer(iDequeueOutputBuffer), bufferInfo2) : null;
                if (aVar3 == null) {
                    throw new e(11, null, null);
                }
                MediaCodec.BufferInfo bufferInfo3 = aVar3.f18916c;
                long j = bufferInfo3.presentationTimeUs;
                mediaRange.getClass();
                if (j >= 0 || (bufferInfo3.flags & 4) != 0) {
                    bufferInfo3.presentationTimeUs = j;
                    eVar.b(aVar3, TimeUnit.MICROSECONDS.toNanos(j));
                }
                bVar2.f18918b.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((bufferInfo3.flags & 4) != 0) {
                    Log.d("a", "EoS on decoder output stream");
                    i10 = 4;
                }
                this.f22320n = i10;
            } else if (iDequeueOutputBuffer == -2) {
                MediaFormat outputFormat = bVar2.f18918b.getOutputFormat();
                this.f22322p = outputFormat;
                eVar.d(outputFormat, this.j);
                Log.d("a", "Decoder output format changed: " + this.f22322p);
            } else if (iDequeueOutputBuffer != -1) {
                Log.e("a", "Unhandled value " + iDequeueOutputBuffer + " when receiving decoded input frame");
            }
            i10 = 2;
            this.f22320n = i10;
        }
        if (this.f22321o != 4) {
            int iDequeueOutputBuffer2 = bVar.f18918b.dequeueOutputBuffer(bufferInfo, 0L);
            uk.b bVar3 = this.f22327b;
            if (iDequeueOutputBuffer2 >= 0) {
                qk.a aVar4 = iDequeueOutputBuffer2 >= 0 ? new qk.a(iDequeueOutputBuffer2, bVar.f18918b.getOutputBuffer(iDequeueOutputBuffer2), bufferInfo) : null;
                if (aVar4 == null) {
                    throw new e(11, null, null);
                }
                MediaCodec.BufferInfo bufferInfo4 = aVar4.f18916c;
                int i13 = bufferInfo4.flags;
                if ((i13 & 4) != 0) {
                    Log.d("a", "Encoder produced EoS, we are done");
                    this.f22335l = 1.0f;
                    i7 = 4;
                } else {
                    if (bufferInfo4.size > 0 && (i13 & 2) == 0) {
                        bVar3.c(this.f22333h, aVar4.f18915b, bufferInfo4);
                        long j5 = this.k;
                        if (j5 > 0) {
                            this.f22335l = bufferInfo4.presentationTimeUs / j5;
                        }
                    }
                    i7 = 2;
                }
                bVar.f18918b.releaseOutputBuffer(iDequeueOutputBuffer2, false);
            } else if (iDequeueOutputBuffer2 != -2) {
                if (iDequeueOutputBuffer2 != -1) {
                    Log.e("a", "Unhandled value " + iDequeueOutputBuffer2 + " when receiving encoded output frame");
                }
                i7 = 2;
            } else {
                MediaFormat outputFormat2 = bVar.f18918b.getOutputFormat();
                if (!this.f22334i) {
                    c.a(this.f22322p, outputFormat2);
                    this.j = outputFormat2;
                    int i14 = this.f22333h;
                    bVar3.a(outputFormat2, i14);
                    this.f22333h = i14;
                    this.f22334i = true;
                    eVar.d(this.f22322p, this.j);
                }
                Log.d("a", "Encoder output format received " + outputFormat2);
                i7 = 1;
            }
            this.f22321o = i7;
        }
        int i15 = this.f22321o;
        int i16 = i15 == 1 ? 1 : 2;
        int i17 = this.f22319m;
        if ((i17 == 4 || i17 == 5) && this.f22320n == 4 && i15 == 4) {
            return 4;
        }
        return i16;
    }

    @Override // wk.c
    public final void f() throws e {
        this.f22326a.selectTrack(this.f22332g);
        this.f22330e.c();
        this.f22329d.c();
    }

    @Override // wk.c
    public final void g() {
        this.f22328c.release();
        qk.b bVar = this.f22330e;
        if (bVar.f18920d) {
            bVar.f18918b.stop();
            bVar.f18920d = false;
        }
        if (!bVar.f18919c) {
            bVar.f18918b.release();
            bVar.f18919c = true;
        }
        qk.b bVar2 = this.f22329d;
        if (bVar2.f18919c) {
            bVar2.f18918b.stop();
            bVar2.f18919c = false;
        }
        if (bVar2.f18920d) {
            return;
        }
        bVar2.f18918b.release();
        bVar2.f18920d = true;
    }
}
