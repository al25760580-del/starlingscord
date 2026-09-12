package vk;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.core.view.e1;
import com.linkedin.android.litr.render.OboeAudioProcessor;
import h5.m;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qk.b f21702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f21703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f21704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f21709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final po.d f21710i;
    public final k8.a j;
    public a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f21711l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedBlockingDeque f21712m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f21713n;

    public b(qk.b encoder) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        this.f21702a = encoder;
        this.f21703b = n0.f14659d;
        this.f21705d = -1;
        this.f21706e = -1;
        this.f21707f = -1;
        this.f21708g = -1;
        this.f21709h = 1.0d;
        this.f21710i = new po.d(8);
        this.j = new k8.a();
        this.f21711l = new AtomicBoolean(false);
        this.f21712m = new LinkedBlockingDeque();
        this.f21713n = new m(4, this);
    }

    @Override // vk.e
    public final boolean a() {
        return !this.f21703b.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    @Override // vk.e
    public final void b(qk.a aVar, long j) {
        if (this.f21711l.get()) {
            return;
        }
        int iCeil = ((int) Math.ceil(((double) (aVar.f18916c.size / (this.f21705d * 2))) * this.f21709h)) * this.f21706e * 2;
        po.d dVar = this.f21710i;
        ByteBuffer byteBufferB = (ByteBuffer) ((LinkedBlockingQueue) dVar.f18079e).poll();
        if (byteBufferB == null) {
            byteBufferB = dVar.b(iCeil);
        } else {
            if (byteBufferB.capacity() < iCeil) {
                byteBufferB = dVar.b(iCeil);
            }
            if (byteBufferB == null) {
                byteBufferB = dVar.b(iCeil);
            }
        }
        qk.a aVar2 = new qk.a(aVar.f18914a, byteBufferB, new MediaCodec.BufferInfo());
        a aVar3 = this.k;
        if (aVar3 != null) {
            aVar3.b(aVar, aVar2);
        }
        Iterator it = this.f21703b.iterator();
        if (it.hasNext()) {
            throw g.a(it);
        }
        this.f21712m.add(aVar2);
    }

    @Override // vk.e
    public final void c(Surface surface, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        d(mediaFormat, mediaFormat2);
        this.f21711l.set(false);
        this.f21713n.start();
        Iterator it = this.f21703b.iterator();
        if (it.hasNext()) {
            throw g.a(it);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    @Override // vk.e
    public final void d(MediaFormat format, MediaFormat format2) {
        Number numberC;
        Number numberC2;
        Number numberC3;
        Number defaultValue = -1;
        if (format != null) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            numberC = e1.c(format, "channel-count");
            if (numberC == null) {
                numberC = defaultValue;
            }
        } else {
            numberC = defaultValue;
        }
        if (format2 != null) {
            Intrinsics.checkNotNullParameter(format2, "format");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            numberC2 = e1.c(format2, "channel-count");
            if (numberC2 == null) {
                numberC2 = defaultValue;
            }
        } else {
            numberC2 = defaultValue;
        }
        if (format != null) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            numberC3 = e1.c(format, "sample-rate");
            if (numberC3 == null) {
                numberC3 = defaultValue;
            }
        } else {
            numberC3 = defaultValue;
        }
        if (format2 != null) {
            Intrinsics.checkNotNullParameter(format2, "format");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Number numberC4 = e1.c(format2, "sample-rate");
            if (numberC4 != null) {
                defaultValue = numberC4;
            }
        }
        int i7 = this.f21705d;
        if ((numberC instanceof Integer) && i7 == numberC.intValue()) {
            int i10 = this.f21706e;
            if ((numberC2 instanceof Integer) && i10 == numberC2.intValue()) {
                int i11 = this.f21707f;
                if ((numberC3 instanceof Integer) && i11 == numberC3.intValue()) {
                    int i12 = this.f21708g;
                    if ((defaultValue instanceof Integer) && i12 == defaultValue.intValue()) {
                        return;
                    }
                }
            }
        }
        a aVar = this.k;
        if (aVar != null) {
            aVar.release();
        }
        this.j.getClass();
        this.k = (format != null && format2 != null && format.containsKey("sample-rate") && format2.containsKey("sample-rate") && format.containsKey("channel-count") && format2.containsKey("channel-count") && (format.getInteger("sample-rate") != format2.getInteger("sample-rate") || format.getInteger("channel-count") != format2.getInteger("channel-count"))) ? new OboeAudioProcessor(format.getInteger("channel-count"), format.getInteger("sample-rate"), format2.getInteger("channel-count"), format2.getInteger("sample-rate")) : new kh.f(18);
        this.f21705d = numberC.intValue();
        this.f21706e = numberC2.intValue();
        this.f21707f = numberC3.intValue();
        this.f21708g = defaultValue.intValue();
        this.f21704c = 1000000.0d / defaultValue.doubleValue();
        this.f21709h = defaultValue.doubleValue() / numberC3.doubleValue();
    }

    @Override // vk.e
    public final void release() {
        this.f21711l.set(true);
        a aVar = this.k;
        if (aVar != null) {
            aVar.release();
        }
        ((LinkedBlockingQueue) this.f21710i.f18079e).clear();
        Iterator it = this.f21703b.iterator();
        if (it.hasNext()) {
            throw g.a(it);
        }
    }
}
