package bd;

import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3181e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f3182i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f3183v;

    public q(Format format, w wVar, boolean z5, int i7) {
        this("Decoder init failed: [" + i7 + "], " + format, wVar, format.I, z5, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i7 < 0 ? "neg_" : "") + Math.abs(i7));
    }

    public q(String str, Throwable th2, String str2, boolean z5, o oVar, String str3) {
        super(str, th2);
        this.f3180d = str2;
        this.f3181e = z5;
        this.f3182i = oVar;
        this.f3183v = str3;
    }
}
