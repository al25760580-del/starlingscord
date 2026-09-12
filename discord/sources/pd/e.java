package pd;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import gc.o0;
import gc.u1;
import gc.v1;
import java.util.List;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Timeline {
    public final long E;
    public final qd.c F;
    public final MediaItem G;
    public final o0 H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17959e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f17960i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f17961v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f17962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f17963x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f17964y;

    public e(long j, long j5, long j7, int i7, long j10, long j11, long j12, qd.c cVar, MediaItem mediaItem, o0 o0Var) {
        je.b.k(cVar.f18718d == (o0Var != null));
        this.f17959e = j;
        this.f17960i = j5;
        this.f17961v = j7;
        this.f17962w = i7;
        this.f17963x = j10;
        this.f17964y = j11;
        this.E = j12;
        this.F = cVar;
        this.G = mediaItem;
        this.H = o0Var;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f17962w) >= 0 && iIntValue < h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final u1 f(int i7, u1 u1Var, boolean z5) {
        je.b.j(i7, h());
        qd.c cVar = this.F;
        String str = z5 ? cVar.b(i7).f18746a : null;
        Integer numValueOf = z5 ? Integer.valueOf(this.f17962w + i7) : null;
        long jD = cVar.d(i7);
        long jI = e0.I(cVar.b(i7).f18747b - cVar.b(0).f18747b) - this.f17963x;
        u1Var.getClass();
        u1Var.i(str, numValueOf, 0, jD, jI, nd.b.f16555x, false);
        return u1Var;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int h() {
        return this.F.f18725m.size();
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Object l(int i7) {
        je.b.j(i7, h());
        return Integer.valueOf(this.f17962w + i7);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c8  */
    @Override // com.google.android.exoplayer2.Timeline
    public final v1 m(int i7, v1 v1Var, long j) {
        boolean z5;
        long j5;
        boolean z6;
        long j7;
        h hVarC;
        je.b.j(i7, 1);
        qd.c cVar = this.F;
        boolean z7 = cVar.f18718d;
        long jB = this.E;
        if (z7 && cVar.f18719e != -9223372036854775807L && cVar.f18716b == -9223372036854775807L) {
            long j10 = 0;
            if (j > 0) {
                jB += j;
                if (jB > this.f17964y) {
                    z5 = true;
                    jB = -9223372036854775807L;
                    j5 = -9223372036854775807L;
                }
                Object obj = v1.O;
                if (cVar.f18718d || cVar.f18719e == j5 || cVar.f18716b != j5) {
                    z6 = false;
                } else {
                    z6 = z5;
                }
                v1Var.b(obj, this.G, cVar, this.f17959e, this.f17960i, this.f17961v, true, z6, this.H, jB, this.f17964y, 0, h() - 1, this.f17963x);
                return v1Var;
            }
            long j11 = this.f17963x + jB;
            long jD = cVar.d(0);
            int i10 = 0;
            while (i10 < cVar.f18725m.size() - 1 && j11 >= jD) {
                j11 -= jD;
                i10++;
                jD = cVar.d(i10);
            }
            qd.h hVarB = cVar.b(i10);
            List list = hVarB.f18748c;
            z5 = true;
            int size = list.size();
            j5 = -9223372036854775807L;
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    j7 = j10;
                    i11 = -1;
                    break;
                }
                j7 = j10;
                if (((qd.a) list.get(i11)).f18706b == 2) {
                    break;
                }
                i11++;
                j10 = j7;
            }
            if (i11 != -1 && (hVarC = ((qd.m) ((qd.a) hVarB.f18748c.get(i11)).f18707c.get(0)).c()) != null && hVarC.z(jD) != j7) {
                jB = (hVarC.b(hVarC.p(j11, jD)) + jB) - j11;
            }
        } else {
            z5 = true;
            j5 = -9223372036854775807L;
        }
        Object obj2 = v1.O;
        if (cVar.f18718d) {
            z6 = false;
        } else {
            z6 = false;
        }
        v1Var.b(obj2, this.G, cVar, this.f17959e, this.f17960i, this.f17961v, true, z6, this.H, jB, this.f17964y, 0, h() - 1, this.f17963x);
        return v1Var;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int o() {
        return 1;
    }
}
