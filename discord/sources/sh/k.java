package sh;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f20080i;
    public final String j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f20081l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, ig.g gVar, int i7, String str, int i10) {
        super(mVar, gVar);
        this.f20081l = mVar;
        this.f20080i = i7;
        this.j = str;
        this.k = i10;
    }

    @Override // sh.h, th.l
    public final void m(Bundle bundle) {
        m mVar = this.f20081l;
        mVar.f20099d.d(this.f20049g);
        m.f20094g.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i7 = this.k;
        if (i7 > 0) {
            mVar.j(this.f20080i, i7 - 1, this.j);
        }
    }
}
