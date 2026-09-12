package ue;

import af.w;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import ye.n;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends BasePendingResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21114a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ye.l lVar, int i7) {
        super(lVar);
        this.f21114a = i7;
        w.h(lVar, "GoogleApiClient must not be null");
        w.h(qe.a.f18785a, "Api must not be null");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ n E(Status status) {
        int i7 = this.f21114a;
        return status;
    }

    public final void F(ye.c cVar) {
        switch (this.f21114a) {
            case 0:
                e eVar = (e) cVar;
                k kVar = (k) eVar.o();
                f fVar = new f(this, 0);
                GoogleSignInOptions googleSignInOptions = eVar.V;
                Parcel parcelR = kVar.r();
                int i7 = uf.f.f21125a;
                parcelR.writeStrongBinder(fVar);
                uf.f.c(parcelR, googleSignInOptions);
                kVar.s(102, parcelR);
                break;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.o();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.V;
                Parcel parcelR2 = kVar2.r();
                int i10 = uf.f.f21125a;
                parcelR2.writeStrongBinder(fVar2);
                uf.f.c(parcelR2, googleSignInOptions2);
                kVar2.s(103, parcelR2);
                break;
        }
    }

    public final void G(Status status) {
        w.a("Failed result must not be success", !(status.f5936d <= 0));
        setResult(E(status));
    }
}
