package k2;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f14259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f14260b;

    public r(int i7) {
        this.f14259a = new SparseArray(i7);
    }

    public final void a(u uVar, int i7, int i10) {
        int iA = uVar.a(i7);
        SparseArray sparseArray = this.f14259a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(iA);
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(uVar.a(i7), rVar);
        }
        if (i10 > i7) {
            rVar.a(uVar, i7 + 1, i10);
        } else {
            rVar.f14260b = uVar;
        }
    }
}
