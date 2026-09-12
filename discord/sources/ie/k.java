package ie;

import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet f11746c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f11747d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f11748e;

    public k(int i7, String str, o oVar) {
        this.f11744a = i7;
        this.f11745b = str;
        this.f11748e = oVar;
    }

    public final boolean a(long j, long j5) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f11747d;
            if (i7 >= arrayList.size()) {
                return false;
            }
            j jVar = (j) arrayList.get(i7);
            long j7 = jVar.f11742a;
            long j10 = jVar.f11743b;
            if (j10 == -1) {
                if (j >= j7) {
                    return true;
                }
            } else if (j5 != -1 && j7 <= j && j + j5 <= j7 + j10) {
                return true;
            }
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f11744a == kVar.f11744a && this.f11745b.equals(kVar.f11745b) && this.f11746c.equals(kVar.f11746c) && this.f11748e.equals(kVar.f11748e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11748e.hashCode() + a3.e.d(this.f11744a * 31, 31, this.f11745b);
    }
}
