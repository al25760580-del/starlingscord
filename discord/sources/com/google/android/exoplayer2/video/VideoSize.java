package com.google.android.exoplayer2.video;

import com.facebook.imageutils.JfifUtil;
import gc.g;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoSize implements g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final VideoSize f5848w = new VideoSize(0, 0, 0, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5850e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5851i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f5852v;

    static {
        int i7 = e0.f13788a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public VideoSize(int i7, int i10, int i11, float f2) {
        this.f5849d = i7;
        this.f5850e = i10;
        this.f5851i = i11;
        this.f5852v = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoSize) {
            VideoSize videoSize = (VideoSize) obj;
            if (this.f5849d == videoSize.f5849d && this.f5850e == videoSize.f5850e && this.f5851i == videoSize.f5851i && this.f5852v == videoSize.f5852v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f5852v) + ((((((JfifUtil.MARKER_EOI + this.f5849d) * 31) + this.f5850e) * 31) + this.f5851i) * 31);
    }
}
