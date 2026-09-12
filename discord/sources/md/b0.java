package md;

import ag.a1;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.Timeline;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends g {
    public static final MediaItem O;
    public final a[] H;
    public final Timeline[] I;
    public final ArrayList J;
    public final i8.c K;
    public int L;
    public long[][] M;
    public a1 N;

    static {
        gc.j0 j0Var = new gc.j0();
        ei.c0 c0Var = ei.e0.f8303e;
        ei.r0 r0Var = ei.r0.f8352w;
        List list = Collections.EMPTY_LIST;
        O = new MediaItem("MergingMediaSource", new gc.l0(j0Var), null, new gc.o0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), MediaMetadata.f5540f0, gc.q0.f9821i);
    }

    public b0(a... aVarArr) {
        i8.c cVar = new i8.c(12);
        this.H = aVarArr;
        this.K = cVar;
        this.J = new ArrayList(Arrays.asList(aVarArr));
        this.L = -1;
        this.I = new Timeline[aVarArr.length];
        this.M = new long[0][];
        new HashMap();
        ei.p.c(8, "expectedKeys");
        ei.p.c(2, "expectedValuesPerKey");
        ei.t tVarA = ei.t.a();
        new ei.m0();
        if (!tVarA.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    @Override // md.a
    public final q b(s sVar, he.q qVar, long j) {
        a[] aVarArr = this.H;
        int length = aVarArr.length;
        q[] qVarArr = new q[length];
        Timeline[] timelineArr = this.I;
        int iB = timelineArr[0].b(sVar.f15689a);
        for (int i7 = 0; i7 < length; i7++) {
            qVarArr[i7] = aVarArr[i7].b(sVar.b(timelineArr[i7].l(iB)), qVar, j - this.M[iB][i7]);
        }
        return new a0(this.K, this.M[iB], qVarArr);
    }

    @Override // md.a
    public final MediaItem i() {
        a[] aVarArr = this.H;
        return aVarArr.length > 0 ? aVarArr[0].i() : O;
    }

    @Override // md.a
    public final void k() throws a1 {
        a1 a1Var = this.N;
        if (a1Var != null) {
            throw a1Var;
        }
        Iterator it = this.E.values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).f15614a.k();
        }
    }

    @Override // md.a
    public final void m(he.u0 u0Var) {
        this.G = u0Var;
        this.F = je.e0.m(null);
        int i7 = 0;
        while (true) {
            a[] aVarArr = this.H;
            if (i7 >= aVarArr.length) {
                return;
            }
            z(Integer.valueOf(i7), aVarArr[i7]);
            i7++;
        }
    }

    @Override // md.a
    public final void q(q qVar) {
        a0 a0Var = (a0) qVar;
        int i7 = 0;
        while (true) {
            a[] aVarArr = this.H;
            if (i7 >= aVarArr.length) {
                return;
            }
            a aVar = aVarArr[i7];
            q qVar2 = a0Var.f15586d[i7];
            if (qVar2 instanceof y) {
                qVar2 = ((y) qVar2).f15732d;
            }
            aVar.q(qVar2);
            i7++;
        }
    }

    @Override // md.g, md.a
    public final void s() {
        super.s();
        Arrays.fill(this.I, (Object) null);
        this.L = -1;
        this.N = null;
        ArrayList arrayList = this.J;
        arrayList.clear();
        Collections.addAll(arrayList, this.H);
    }

    @Override // md.g
    public final s v(Object obj, s sVar) {
        if (((Integer) obj).intValue() == 0) {
            return sVar;
        }
        return null;
    }

    @Override // md.g
    public final void y(Object obj, a aVar, Timeline timeline) {
        Integer num = (Integer) obj;
        if (this.N != null) {
            return;
        }
        if (this.L == -1) {
            this.L = timeline.h();
        } else if (timeline.h() != this.L) {
            this.N = new a1();
            return;
        }
        int length = this.M.length;
        Timeline[] timelineArr = this.I;
        if (length == 0) {
            this.M = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.L, timelineArr.length);
        }
        ArrayList arrayList = this.J;
        arrayList.remove(aVar);
        timelineArr[num.intValue()] = timeline;
        if (arrayList.isEmpty()) {
            o(timelineArr[0]);
        }
    }
}
