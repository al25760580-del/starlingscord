package ic;

import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11646e;

    /* JADX WARN: Illegal instructions before constructor call */
    public s(int i7, int i10, int i11, int i12, Format format, boolean z5, RuntimeException runtimeException) {
        StringBuilder sbR = a3.e.r(i7, "AudioTrack init failed ", i10, " Config(", ", ");
        a3.e.z(sbR, i11, ", ", i12, ") ");
        sbR.append(format);
        sbR.append(z5 ? " (recoverable)" : "");
        super(sbR.toString(), runtimeException);
        this.f11645d = i7;
        this.f11646e = z5;
    }
}
