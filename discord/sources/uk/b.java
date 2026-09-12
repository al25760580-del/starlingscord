package uk;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedList f21174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediaMuxer f21176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediaFormat[] f21177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ParcelFileDescriptor f21178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21180g;

    public b(Context context, Uri uri, int i7, int i10, int i11) throws rk.c {
        MediaMuxer mediaMuxer;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rwt");
                this.f21178e = parcelFileDescriptorOpenFileDescriptor;
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    throw new IOException("Inaccessible URI " + uri);
                }
                mediaMuxer = io.sentry.android.replay.screenshot.a.b(this.f21178e.getFileDescriptor(), i11);
            } else {
                if (!"file".equalsIgnoreCase(uri.getScheme()) || uri.getPath() == null) {
                    throw new rk.c(3, uri, i11, new Throwable());
                }
                mediaMuxer = new MediaMuxer(uri.getPath(), i11);
            }
            b(mediaMuxer, i7, i10);
        } catch (IOException e10) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.f21178e;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                    this.f21178e = null;
                }
            } catch (IOException unused) {
            }
            throw new rk.c(2, uri, i11, e10);
        } catch (IllegalArgumentException e11) {
            throw new rk.c(1, uri, i11, e11);
        }
    }

    public final int a(MediaFormat mediaFormat, int i7) {
        this.f21177d[i7] = mediaFormat;
        int i10 = this.f21179f + 1;
        this.f21179f = i10;
        if (i10 == this.f21180g) {
            Log.d("b", "All tracks added, starting MediaMuxer, writing out " + this.f21174a.size() + " queued samples");
            for (MediaFormat mediaFormat2 : this.f21177d) {
                this.f21176c.addTrack(mediaFormat2);
            }
            this.f21176c.start();
            this.f21175b = true;
            while (!this.f21174a.isEmpty()) {
                c cVar = (c) this.f21174a.removeFirst();
                this.f21176c.writeSampleData(cVar.f21181a, cVar.f21182b, cVar.f21183c);
            }
        }
        return i7;
    }

    public final void b(MediaMuxer mediaMuxer, int i7, int i10) {
        this.f21180g = i7;
        this.f21176c = mediaMuxer;
        mediaMuxer.setOrientationHint(i10);
        this.f21179f = 0;
        this.f21175b = false;
        this.f21174a = new LinkedList();
        this.f21177d = new MediaFormat[i7];
    }

    public final void c(int i7, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (!this.f21175b) {
            this.f21174a.addLast(new c(i7, byteBuffer, bufferInfo));
        } else if (byteBuffer == null) {
            Log.e("b", "Trying to write a null buffer, skipping");
        } else {
            this.f21176c.writeSampleData(i7, byteBuffer, bufferInfo);
        }
    }
}
