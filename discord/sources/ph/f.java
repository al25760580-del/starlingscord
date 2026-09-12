package ph;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.agesignals.AgeSignalsResult;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends bg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cg.b f18037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ig.g f18038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f18039i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ig.g gVar2) {
        super("com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback", 1);
        Objects.requireNonNull(gVar);
        this.f18039i = gVar;
        this.f18037g = new cg.b("OnCheckAgeSignalsCallback", 0);
        this.f18038h = gVar2;
    }

    @Override // bg.a
    public final boolean s(int i7, Parcel parcel) {
        cg.b bVar = this.f18037g;
        ig.g gVar = this.f18038h;
        g gVar2 = this.f18039i;
        if (i7 == 1) {
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) cg.a.a(parcel);
            cg.a.b(parcel);
            gVar2.f18043c.c(gVar);
            bVar.c("onCompleteCheckAgeSignals", new Object[0]);
            gVar.d(new j(AgeSignalsResult.g("age.range.source", bundle), AgeSignalsResult.g("age.range.lower", bundle), AgeSignalsResult.g("age.range.upper", bundle), bundle.containsKey("significant.change.approval.date") ? new Date(bundle.getLong("significant.change.approval.date")) : null, AgeSignalsResult.g("significant.change.status", bundle), bundle.containsKey("install.id") ? bundle.getString("install.id") : null));
            return true;
        }
        if (i7 != 3) {
            return false;
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) cg.a.a(parcel);
        cg.a.b(parcel);
        gVar2.f18043c.c(gVar);
        int i10 = bundle2.getInt("error.code");
        bVar.a(Integer.valueOf(i10));
        gVar.c(new a(i10, 0));
        return true;
    }
}
