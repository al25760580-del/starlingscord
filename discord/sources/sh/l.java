package sh;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p0 f20089i;
    public final g1 j;

    public l(m mVar, ig.g gVar, p0 p0Var, g1 g1Var) {
        super(mVar, gVar);
        this.f20089i = p0Var;
        this.j = g1Var;
    }

    @Override // sh.h, th.l
    public final void b(int i7, Bundle bundle) {
        super.b(i7, bundle);
        this.f20049g.d(x.a(bundle, this.f20089i, this.j));
    }
}
