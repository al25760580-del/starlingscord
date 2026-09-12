package wh;

import a5.l0;
import android.util.Base64;
import ci.d0;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements IntegrityManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f22269a;

    public d(g gVar) {
        this.f22269a = gVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        g gVar = this.f22269a;
        ci.d dVar = gVar.f22282e;
        if (dVar == null) {
            return l0.u(new a(-2, null));
        }
        if (ci.f.a(gVar.f22280c) < 82380000) {
            return l0.u(new a(-14, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.b(), 10);
            Long lA = integrityTokenRequest.a();
            gVar.f22278a.b("requestIntegrityToken(%s)", integrityTokenRequest);
            ig.g gVar2 = new ig.g();
            dVar.a().post(new d0(dVar, gVar2, gVar2, new e(gVar, gVar2, bArrDecode, lA, gVar2, integrityTokenRequest)));
            return gVar2.f11763a;
        } catch (IllegalArgumentException e10) {
            return l0.u(new a(-13, e10));
        }
    }
}
