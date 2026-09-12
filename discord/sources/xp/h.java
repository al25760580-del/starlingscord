package xp;

import java.util.Comparator;
import vo.l0;
import vo.q0;
import vo.u;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Comparator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f23001e = new h(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23002d;

    public /* synthetic */ h(int i7) {
        this.f23002d = i7;
    }

    public static int b(vo.l lVar) {
        if (e.m(lVar)) {
            return 8;
        }
        if (lVar instanceof vo.k) {
            return 7;
        }
        if (lVar instanceof l0) {
            return ((l0) lVar).V() == null ? 6 : 5;
        }
        if (lVar instanceof u) {
            return ((u) lVar).V() == null ? 4 : 3;
        }
        if (lVar instanceof vo.f) {
            return 2;
        }
        return lVar instanceof q0 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        switch (this.f23002d) {
            case 0:
                vo.l lVar = (vo.l) obj;
                vo.l lVar2 = (vo.l) obj2;
                int iB = b(lVar2) - b(lVar);
                if (iB != 0) {
                    numValueOf = Integer.valueOf(iB);
                } else if (e.m(lVar) && e.m(lVar2)) {
                    numValueOf = 0;
                } else {
                    int iCompareTo = lVar.getName().f21269d.compareTo(lVar2.getName().f21269d);
                    numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            default:
                return tn.a.a(bq.e.g((vo.f) obj).f21262a.f21265a, bq.e.g((vo.f) obj2).f21262a.f21265a);
        }
    }
}
