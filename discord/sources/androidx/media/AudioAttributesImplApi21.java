package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f2418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2419b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f2418a.equals(((AudioAttributesImplApi21) obj).f2418a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2418a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2418a;
    }
}
