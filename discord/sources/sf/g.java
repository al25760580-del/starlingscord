package sf;

import ag.p1;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import e4.l;
import kotlin.jvm.internal.Intrinsics;
import ye.i;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends i {
    public static final l k = new l("IdentityCredentials.API", new p1(8), new ye.d());

    public final ig.l c(GetCredentialRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        lh.d dVarF = lh.d.f();
        dVarF.f15092e = new xe.d[]{bg.c.f3230a};
        dVarF.f15091d = new po.d(2, request);
        dVarF.f15089b = 32701;
        ig.l lVarB = b(0, dVarF.e());
        Intrinsics.checkNotNullExpressionValue(lVarB, "doRead(...)");
        return lVarB;
    }
}
