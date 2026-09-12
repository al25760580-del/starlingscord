package v2;

import a5.i0;
import androidx.collection.SparseArrayCompat;
import androidx.fragment.app.e1;
import androidx.lifecycle.y0;
import ue.d;

/* JADX INFO: loaded from: classes.dex */
public class b extends y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e1 f21371d = new e1(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArrayCompat f21372b = new SparseArrayCompat(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21373c = false;

    @Override // androidx.lifecycle.y0
    public final void b() {
        SparseArrayCompat sparseArrayCompat = this.f21372b;
        int iG = sparseArrayCompat.g();
        for (int i7 = 0; i7 < iG; i7++) {
            a aVar = (a) sparseArrayCompat.h(i7);
            d dVar = aVar.f21368l;
            dVar.a();
            dVar.f21105c = true;
            i0 i0Var = aVar.f21370n;
            if (i0Var != null) {
                aVar.g(i0Var);
            }
            a aVar2 = dVar.f21103a;
            if (aVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (aVar2 != aVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            dVar.f21103a = null;
            if (i0Var != null) {
                boolean z5 = i0Var.f214e;
            }
            dVar.f21106d = true;
            dVar.f21104b = false;
            dVar.f21105c = false;
            dVar.f21107e = false;
        }
        int i10 = sparseArrayCompat.f1226v;
        Object[] objArr = sparseArrayCompat.f1225i;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        sparseArrayCompat.f1226v = 0;
        sparseArrayCompat.f1223d = false;
    }
}
