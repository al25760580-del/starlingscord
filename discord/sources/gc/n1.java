package gc;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 extends Timeline {
    public static final /* synthetic */ int H = 0;
    public final Timeline[] E;
    public final Object[] F;
    public final HashMap G;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9792e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final md.r0 f9793i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f9794v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f9795w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f9796x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f9797y;

    /* JADX WARN: Illegal instructions before constructor call */
    public n1(ArrayList arrayList, md.r0 r0Var) {
        Timeline[] timelineArr = new Timeline[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i7 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            timelineArr[i10] = ((y0) it.next()).b();
            i10++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i7] = ((y0) it2.next()).a();
            i7++;
        }
        this(timelineArr, objArr, r0Var);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int a(boolean z5) {
        if (this.f9792e != 0) {
            int iQ = 0;
            if (z5) {
                int[] iArr = this.f9793i.f15695b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                Timeline[] timelineArr = this.E;
                if (!timelineArr[iQ].p()) {
                    return timelineArr[iQ].a(z5) + this.f9797y[iQ];
                }
                iQ = q(iQ, z5);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.G.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.E[iIntValue].b(obj3)) != -1) {
                return this.f9796x[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int c(boolean z5) {
        int iR;
        int i7 = this.f9792e;
        if (i7 != 0) {
            if (z5) {
                int[] iArr = this.f9793i.f15695b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i7 - 1;
            }
            do {
                Timeline[] timelineArr = this.E;
                if (!timelineArr[iR].p()) {
                    return timelineArr[iR].c(z5) + this.f9797y[iR];
                }
                iR = r(iR, z5);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int e(int i7, int i10, boolean z5) {
        int[] iArr = this.f9797y;
        int iD = je.e0.d(iArr, i7 + 1, false, false);
        int i11 = iArr[iD];
        Timeline[] timelineArr = this.E;
        int iE = timelineArr[iD].e(i7 - i11, i10 != 2 ? i10 : 0, z5);
        if (iE != -1) {
            return i11 + iE;
        }
        int iQ = q(iD, z5);
        while (iQ != -1 && timelineArr[iQ].p()) {
            iQ = q(iQ, z5);
        }
        if (iQ != -1) {
            return timelineArr[iQ].a(z5) + iArr[iQ];
        }
        if (i10 == 2) {
            return a(z5);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final u1 f(int i7, u1 u1Var, boolean z5) {
        int[] iArr = this.f9796x;
        int iD = je.e0.d(iArr, i7 + 1, false, false);
        int i10 = this.f9797y[iD];
        this.E[iD].f(i7 - iArr[iD], u1Var, z5);
        u1Var.f9888i += i10;
        if (z5) {
            Object obj = this.F[iD];
            Object obj2 = u1Var.f9887e;
            obj2.getClass();
            u1Var.f9887e = Pair.create(obj, obj2);
        }
        return u1Var;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final u1 g(Object obj, u1 u1Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.G.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i7 = this.f9797y[iIntValue];
        this.E[iIntValue].g(obj3, u1Var);
        u1Var.f9888i += i7;
        u1Var.f9887e = obj;
        return u1Var;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int h() {
        return this.f9795w;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int k(int i7, int i10, boolean z5) {
        int[] iArr = this.f9797y;
        int iD = je.e0.d(iArr, i7 + 1, false, false);
        int i11 = iArr[iD];
        Timeline[] timelineArr = this.E;
        int iK = timelineArr[iD].k(i7 - i11, i10 != 2 ? i10 : 0, z5);
        if (iK != -1) {
            return i11 + iK;
        }
        int iR = r(iD, z5);
        while (iR != -1 && timelineArr[iR].p()) {
            iR = r(iR, z5);
        }
        if (iR != -1) {
            return timelineArr[iR].c(z5) + iArr[iR];
        }
        if (i10 == 2) {
            return c(z5);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Object l(int i7) {
        int[] iArr = this.f9796x;
        int iD = je.e0.d(iArr, i7 + 1, false, false);
        return Pair.create(this.F[iD], this.E[iD].l(i7 - iArr[iD]));
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final v1 m(int i7, v1 v1Var, long j) {
        int[] iArr = this.f9797y;
        int iD = je.e0.d(iArr, i7 + 1, false, false);
        int i10 = iArr[iD];
        int i11 = this.f9796x[iD];
        this.E[iD].m(i7 - i10, v1Var, j);
        Object objCreate = this.F[iD];
        if (!v1.O.equals(v1Var.f9909d)) {
            objCreate = Pair.create(objCreate, v1Var.f9909d);
        }
        v1Var.f9909d = objCreate;
        v1Var.L += i11;
        v1Var.M += i11;
        return v1Var;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int o() {
        return this.f9794v;
    }

    public final int q(int i7, boolean z5) {
        if (!z5) {
            if (i7 < this.f9792e - 1) {
                return i7 + 1;
            }
            return -1;
        }
        md.r0 r0Var = this.f9793i;
        int i10 = r0Var.f15696c[i7] + 1;
        int[] iArr = r0Var.f15695b;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public final int r(int i7, boolean z5) {
        if (!z5) {
            if (i7 > 0) {
                return i7 - 1;
            }
            return -1;
        }
        md.r0 r0Var = this.f9793i;
        int i10 = r0Var.f15696c[i7] - 1;
        if (i10 >= 0) {
            return r0Var.f15695b[i10];
        }
        return -1;
    }

    public n1(Timeline[] timelineArr, Object[] objArr, md.r0 r0Var) {
        this.f9793i = r0Var;
        this.f9792e = r0Var.f15695b.length;
        int length = timelineArr.length;
        this.E = timelineArr;
        this.f9796x = new int[length];
        this.f9797y = new int[length];
        this.F = objArr;
        this.G = new HashMap();
        int length2 = timelineArr.length;
        int i7 = 0;
        int iO = 0;
        int iH = 0;
        int i10 = 0;
        while (i7 < length2) {
            Timeline timeline = timelineArr[i7];
            this.E[i10] = timeline;
            this.f9797y[i10] = iO;
            this.f9796x[i10] = iH;
            iO += timeline.o();
            iH += this.E[i10].h();
            this.G.put(objArr[i10], Integer.valueOf(i10));
            i7++;
            i10++;
        }
        this.f9794v = iO;
        this.f9795w = iH;
    }
}
