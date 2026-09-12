package md;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.Timeline;
import gc.u1;
import gc.v1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends Timeline {
    public static final Object K = new Object();
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final Object H;
    public final MediaItem I;
    public final gc.o0 J;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15697e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f15698i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f15699v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f15700w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f15701x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f15702y;

    static {
        gc.j0 j0Var = new gc.j0();
        gc.m0 m0Var = new gc.m0();
        m0Var.f9775c = ei.w0.f8376y;
        ei.c0 c0Var = ei.e0.f8303e;
        ei.r0 r0Var = ei.r0.f8352w;
        m0Var.f9779g = r0Var;
        List list = Collections.EMPTY_LIST;
        gc.q0 q0Var = gc.q0.f9821i;
        Uri uri = Uri.EMPTY;
        je.b.k(m0Var.f9774b == null || m0Var.f9773a != null);
        if (uri != null) {
            new gc.p0(uri, null, m0Var.f9773a != null ? new gc.n0(m0Var) : null, null, list, null, r0Var);
        }
        new gc.l0(j0Var);
        MediaMetadata mediaMetadata = MediaMetadata.f5540f0;
    }

    public s0(long j, boolean z5, boolean z6, MediaItem mediaItem) {
        this(j, j, 0L, 0L, z5, false, z6, null, mediaItem);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int b(Object obj) {
        return K.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final u1 f(int i7, u1 u1Var, boolean z5) {
        je.b.j(i7, 1);
        Object obj = z5 ? K : null;
        long j = -this.f15701x;
        u1Var.getClass();
        u1Var.i(null, obj, 0, this.f15699v, j, nd.b.f16555x, false);
        return u1Var;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int h() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Object l(int i7) {
        je.b.j(i7, 1);
        return K;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d A[PHI: r1
      0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.Timeline
    public final v1 m(int i7, v1 v1Var, long j) {
        long j5;
        je.b.j(i7, 1);
        long j7 = this.f15702y;
        boolean z5 = this.F;
        if (!z5 || this.G || j == 0) {
            j5 = j7;
        } else {
            long j10 = this.f15700w;
            if (j10 != -9223372036854775807L) {
                j7 += j;
                if (j7 <= j10) {
                    j5 = j7;
                }
            }
            j5 = -9223372036854775807L;
        }
        v1Var.b(v1.O, this.I, this.H, this.f15697e, this.f15698i, -9223372036854775807L, this.E, z5, this.J, j5, this.f15700w, 0, 0, this.f15701x);
        return v1Var;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int o() {
        return 1;
    }

    public s0(long j, long j5, long j7, long j10, boolean z5, boolean z6, boolean z7, Object obj, MediaItem mediaItem) {
        this(-9223372036854775807L, -9223372036854775807L, j, j5, j7, j10, z5, z6, false, obj, mediaItem, z7 ? mediaItem.f5536v : null);
    }

    public s0(long j, long j5, long j7, long j10, long j11, long j12, boolean z5, boolean z6, boolean z7, Object obj, MediaItem mediaItem, gc.o0 o0Var) {
        this.f15697e = j;
        this.f15698i = j5;
        this.f15699v = j7;
        this.f15700w = j10;
        this.f15701x = j11;
        this.f15702y = j12;
        this.E = z5;
        this.F = z6;
        this.G = z7;
        this.H = obj;
        mediaItem.getClass();
        this.I = mediaItem;
        this.J = o0Var;
    }
}
