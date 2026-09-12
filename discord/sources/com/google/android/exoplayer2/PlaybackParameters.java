package com.google.android.exoplayer2;

import gc.g;
import java.util.Locale;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class PlaybackParameters implements g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final PlaybackParameters f5573v = new PlaybackParameters(1.0f, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f5574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f5575e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5576i;

    static {
        int i7 = e0.f13788a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public PlaybackParameters(float f2, float f7) {
        je.b.g(f2 > 0.0f);
        je.b.g(f7 > 0.0f);
        this.f5574d = f2;
        this.f5575e = f7;
        this.f5576i = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PlaybackParameters.class == obj.getClass()) {
            PlaybackParameters playbackParameters = (PlaybackParameters) obj;
            if (this.f5574d == playbackParameters.f5574d && this.f5575e == playbackParameters.f5575e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f5575e) + ((Float.floatToRawIntBits(this.f5574d) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f5574d), Float.valueOf(this.f5575e)};
        int i7 = e0.f13788a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
