package s0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f19683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f19684b;

    public static long a(h hVar, long j) {
        q qVar = hVar.f19674d;
        ArrayList arrayList = hVar.k;
        if (qVar instanceof l) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = (e) arrayList.get(i7);
            if (eVar instanceof h) {
                h hVar2 = (h) eVar;
                if (hVar2.f19674d != qVar) {
                    jMin = Math.min(jMin, a(hVar2, ((long) hVar2.f19676f) + j));
                }
            }
        }
        h hVar3 = qVar.f19700i;
        h hVar4 = qVar.f19699h;
        if (hVar != hVar3) {
            return jMin;
        }
        long j5 = j - qVar.j();
        return Math.min(Math.min(jMin, a(hVar4, j5)), j5 - ((long) hVar4.f19676f));
    }

    public static long b(h hVar, long j) {
        q qVar = hVar.f19674d;
        ArrayList arrayList = hVar.k;
        if (qVar instanceof l) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = (e) arrayList.get(i7);
            if (eVar instanceof h) {
                h hVar2 = (h) eVar;
                if (hVar2.f19674d != qVar) {
                    jMax = Math.max(jMax, b(hVar2, ((long) hVar2.f19676f) + j));
                }
            }
        }
        h hVar3 = qVar.f19699h;
        h hVar4 = qVar.f19700i;
        if (hVar != hVar3) {
            return jMax;
        }
        long j5 = qVar.j() + j;
        return Math.max(Math.max(jMax, b(hVar4, j5)), j5 - ((long) hVar4.f19676f));
    }
}
