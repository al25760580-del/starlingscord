package wh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import ci.b0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends bg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f22275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ig.g f22276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f22277i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ig.g gVar2) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback", 2);
        Objects.requireNonNull(gVar);
        this.f22277i = gVar;
        this.f22275g = new b0("OnRequestIntegrityTokenCallback");
        this.f22276h = gVar2;
    }

    @Override // bg.a
    public final boolean r(int i7, Parcel parcel) {
        if (i7 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) ci.s.a(parcel);
        ci.s.b(parcel);
        g gVar = this.f22277i;
        ci.d dVar = gVar.f22282e;
        ig.g gVar2 = this.f22276h;
        dVar.c(gVar2);
        this.f22275g.b("onRequestIntegrityToken", new Object[0]);
        gVar.f22281d.getClass();
        int i10 = bundle.getInt("error");
        a aVar = null;
        if (i10 != 0) {
            bundle.getBoolean("is.error.remediable");
            aVar = new a(i10, null);
        }
        if (aVar != null) {
            gVar2.c(aVar);
            return true;
        }
        String string = bundle.getString("token");
        if (string == null) {
            gVar2.c(new a(-100, null));
            return true;
        }
        bundle.getLong("request.token.sid");
        s0.g.c(Process.myUid(), "UID: [", Process.myPid(), "]  PID: [", "] ").concat("IntegrityDialogWrapper");
        gVar2.d(new i(string));
        return true;
    }
}
