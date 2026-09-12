package ic;

import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11649e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Format f11650i;

    public t(int i7, Format format, boolean z5) {
        super(kk.b.h(i7, "AudioTrack write failed: "));
        this.f11649e = z5;
        this.f11648d = i7;
        this.f11650i = format;
    }
}
