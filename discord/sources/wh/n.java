package wh;

import android.os.Bundle;
import ci.b0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b0 f22298i;
    public final /* synthetic */ com.google.android.play.core.integrity.c j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.google.android.play.core.integrity.c cVar, ig.g gVar) {
        super(cVar, gVar);
        Objects.requireNonNull(cVar);
        this.j = cVar;
        this.f22298i = new b0("OnWarmUpIntegrityTokenCallback");
    }

    @Override // wh.m, ci.x
    public final void i(Bundle bundle) {
        super.i(bundle);
        this.f22298i.b("onWarmUpExpressIntegrityToken", new Object[0]);
        ye.e eVarJ = this.j.f6513d.j(bundle);
        ig.g gVar = this.f22296g;
        if (eVarJ != null) {
            gVar.c(eVarJ);
        } else {
            gVar.d(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
