package fe;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import ei.x;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9090e;

    public f(Format format, int i7) {
        this.f9089d = (format.f5529v & 1) != 0;
        this.f9090e = DefaultTrackSelector.d(i7, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        return x.f8383a.c(this.f9090e, fVar.f9090e).c(this.f9089d, fVar.f9089d).e();
    }
}
