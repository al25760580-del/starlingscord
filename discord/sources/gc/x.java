package gc;

import android.media.MediaFormat;
import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements ke.o, le.a, k1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ke.o f9933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public le.a f9934e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ke.o f9935i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public le.a f9936v;

    @Override // le.a
    public final void a(long j, float[] fArr) {
        le.a aVar = this.f9936v;
        if (aVar != null) {
            aVar.a(j, fArr);
        }
        le.a aVar2 = this.f9934e;
        if (aVar2 != null) {
            aVar2.a(j, fArr);
        }
    }

    @Override // le.a
    public final void b() {
        le.a aVar = this.f9936v;
        if (aVar != null) {
            aVar.b();
        }
        le.a aVar2 = this.f9934e;
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @Override // gc.k1
    public final void c(int i7, Object obj) {
        if (i7 == 7) {
            this.f9933d = (ke.o) obj;
            return;
        }
        if (i7 == 8) {
            this.f9934e = (le.a) obj;
            return;
        }
        if (i7 != 10000) {
            return;
        }
        le.k kVar = (le.k) obj;
        if (kVar == null) {
            this.f9935i = null;
            this.f9936v = null;
        } else {
            this.f9935i = kVar.getVideoFrameMetadataListener();
            this.f9936v = kVar.getCameraMotionListener();
        }
    }

    @Override // ke.o
    public final void d(long j, long j5, Format format, MediaFormat mediaFormat) {
        long j7;
        long j10;
        Format format2;
        MediaFormat mediaFormat2;
        ke.o oVar = this.f9935i;
        if (oVar != null) {
            oVar.d(j, j5, format, mediaFormat);
            mediaFormat2 = mediaFormat;
            format2 = format;
            j10 = j5;
            j7 = j;
        } else {
            j7 = j;
            j10 = j5;
            format2 = format;
            mediaFormat2 = mediaFormat;
        }
        ke.o oVar2 = this.f9933d;
        if (oVar2 != null) {
            oVar2.d(j7, j10, format2, mediaFormat2);
        }
    }
}
