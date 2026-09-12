package md;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import gc.u1;
import gc.v1;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends Timeline {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaItem f15664e;

    public n(MediaItem mediaItem) {
        this.f15664e = mediaItem;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int b(Object obj) {
        return obj == m.f15661w ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final u1 f(int i7, u1 u1Var, boolean z5) {
        u1Var.i(z5 ? 0 : null, z5 ? m.f15661w : null, 0, -9223372036854775807L, 0L, nd.b.f16555x, true);
        return u1Var;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int h() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Object l(int i7) {
        return m.f15661w;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final v1 m(int i7, v1 v1Var, long j) {
        v1Var.b(v1.O, this.f15664e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        v1Var.I = true;
        return v1Var;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int o() {
        return 1;
    }
}
