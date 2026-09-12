package uf;

import ag.p1;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import e4.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends ye.i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l f21121l = new l("Auth.Api.Identity.SignIn.API", new p1(9), new ye.d());
    public final String k;

    public b(Context context, re.h hVar) {
        super(context, null, f21121l, hVar, ye.h.f23298c);
        this.k = e.a();
    }

    public final re.g c(Intent intent) throws ye.e {
        Status status = Status.f5935y;
        if (intent == null) {
            throw new ye.e(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : ls.l.p(byteArrayExtra, creator));
        if (status2 == null) {
            throw new ye.e(Status.F);
        }
        if (status2.f5936d > 0) {
            throw new ye.e(status2);
        }
        Parcelable.Creator<re.g> creator2 = re.g.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        re.g gVar = (re.g) (byteArrayExtra2 != null ? ls.l.p(byteArrayExtra2, creator2) : null);
        if (gVar != null) {
            return gVar;
        }
        throw new ye.e(status);
    }
}
