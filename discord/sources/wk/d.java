package wk;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import com.linkedin.android.litr.io.MediaRange;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;
import rk.e;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22336m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22337n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22338o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public vk.d f22339p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MediaFormat f22340q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MediaFormat f22341r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public vk.c f22342s;

    /* JADX WARN: Code duplicated, block: B:67:0x016e  */
    @Override // wk.c
    public final int e() throws e {
        String str;
        int i7;
        int i10;
        String str2;
        boolean z5;
        int iB;
        vk.d dVar = this.f22339p;
        qk.b bVar = this.f22330e;
        boolean z6 = bVar.f18920d;
        MediaCodec.BufferInfo bufferInfo = bVar.f18921e;
        if (!z6) {
            return -3;
        }
        qk.b bVar2 = this.f22329d;
        boolean z7 = bVar2.f18919c;
        MediaCodec.BufferInfo bufferInfo2 = bVar2.f18921e;
        if (!z7) {
            return -3;
        }
        if (this.f22336m == 5) {
            this.f22336m = b();
        }
        int i11 = this.f22336m;
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
                        Log.d("d", "EoS reached on the input stream");
                        iB = 4;
                    } else {
                        mediaRange.getClass();
                        if (sampleTime >= LongCompanionObject.MAX_VALUE) {
                            aVar2.f18916c.set(0, 0, -1L, 4);
                            bVar2.b(aVar2);
                            iB = b();
                            Log.d("d", "Selection end reached on the input stream");
                        } else {
                            aVar2.f18916c.set(0, sampleData, sampleTime, sampleFlags);
                            bVar2.b(aVar2);
                            aVar.advance();
                        }
                    }
                } else if (iDequeueInputBuffer != -1) {
                    Log.e("d", "Unhandled value " + iDequeueInputBuffer + " when decoding an input frame");
                }
                iB = 2;
            } else {
                iB = 2;
            }
            this.f22336m = iB;
        }
        if (this.f22337n != 4) {
            int iDequeueOutputBuffer = bVar2.f18918b.dequeueOutputBuffer(bufferInfo2, 0L);
            if (iDequeueOutputBuffer >= 0) {
                qk.a aVar3 = iDequeueOutputBuffer >= 0 ? new qk.a(iDequeueOutputBuffer, bVar2.f18918b.getOutputBuffer(iDequeueOutputBuffer), bufferInfo2) : null;
                if (aVar3 == null) {
                    throw new e(11, null, null);
                }
                MediaCodec.BufferInfo bufferInfo3 = aVar3.f18916c;
                if ((bufferInfo3.flags & 4) != 0) {
                    Log.d("d", "EoS on decoder output stream");
                    bVar2.f18918b.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    bVar.f18918b.signalEndOfInputStream();
                    str = "Unhandled value ";
                    i10 = 4;
                } else {
                    long j = bufferInfo3.presentationTimeUs;
                    mediaRange.getClass();
                    boolean z10 = j >= 0;
                    bVar2.f18918b.releaseOutputBuffer(iDequeueOutputBuffer, z10);
                    vk.c cVar = this.f22342s;
                    if (cVar != null) {
                        str2 = "Unhandled value ";
                        double d6 = cVar.f21716c + cVar.f21714a;
                        cVar.f21716c = d6;
                        int i12 = cVar.f21717d;
                        cVar.f21717d = i12 + 1;
                        if (i12 != 0) {
                            double d7 = cVar.f21715b;
                            if (d6 > d7) {
                                cVar.f21716c = d6 - d7;
                            } else {
                                z5 = false;
                            }
                        }
                        if (z10 || !z5) {
                            str = str2;
                            i10 = 3;
                        } else {
                            dVar.b(null, TimeUnit.MICROSECONDS.toNanos(bufferInfo3.presentationTimeUs));
                            i10 = 2;
                            str = str2;
                        }
                    } else {
                        str2 = "Unhandled value ";
                    }
                    z5 = true;
                    if (z10) {
                        str = str2;
                        i10 = 3;
                    } else {
                        str = str2;
                        i10 = 3;
                    }
                }
            } else {
                if (iDequeueOutputBuffer == -2) {
                    str = "Unhandled value ";
                    MediaFormat mediaFormat = this.f22340q;
                    MediaFormat outputFormat = bVar2.f18918b.getOutputFormat();
                    c.a(mediaFormat, outputFormat);
                    this.f22340q = outputFormat;
                    dVar.getClass();
                    Log.d("d", "Decoder output format changed: " + this.f22340q);
                } else if (iDequeueOutputBuffer != -1) {
                    str = "Unhandled value ";
                    Log.e("d", str + iDequeueOutputBuffer + " when receiving decoded input frame");
                } else {
                    str = "Unhandled value ";
                }
                i10 = 2;
            }
            this.f22337n = i10;
        } else {
            str = "Unhandled value ";
        }
        if (this.f22338o != 4) {
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
                    Log.d("d", "Encoder produced EoS, we are done");
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
                    Log.e("d", str + iDequeueOutputBuffer2 + " when receiving encoded output frame");
                }
                i7 = 2;
            } else {
                MediaFormat outputFormat2 = bVar.f18918b.getOutputFormat();
                if (!this.f22334i) {
                    c.a(this.f22340q, outputFormat2);
                    this.j = outputFormat2;
                    this.f22341r = outputFormat2;
                    int i14 = this.f22333h;
                    bVar3.a(outputFormat2, i14);
                    this.f22333h = i14;
                    this.f22334i = true;
                    dVar.getClass();
                }
                Log.d("d", "Encoder output format received " + outputFormat2);
                i7 = 1;
            }
            this.f22338o = i7;
        }
        int i15 = this.f22338o;
        int i16 = i15 == 1 ? 1 : 2;
        int i17 = this.f22336m;
        if ((i17 == 4 || i17 == 5) && this.f22337n == 4 && i15 == 4) {
            return 4;
        }
        if (this.f22337n == 3) {
            return 3;
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
        if (!bVar2.f18920d) {
            bVar2.f18918b.release();
            bVar2.f18920d = true;
        }
        this.f22339p.release();
    }
}
