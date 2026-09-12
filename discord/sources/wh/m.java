package wh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ci.x;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends bg.a implements x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ig.g f22296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.integrity.c f22297h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.google.android.play.core.integrity.c cVar, ig.g gVar) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback", 2);
        Objects.requireNonNull(cVar);
        this.f22297h = cVar;
        this.f22296g = gVar;
    }

    public void d(Bundle bundle) {
        this.f22297h.f6514e.c(this.f22296g);
    }

    @Override // ci.x
    public void i(Bundle bundle) {
        this.f22297h.f6514e.c(this.f22296g);
    }

    @Override // bg.a
    public final boolean r(int i7, Parcel parcel) {
        if (i7 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) ci.s.a(parcel);
            ci.s.b(parcel);
            i(bundle);
            return true;
        }
        if (i7 == 3) {
            Parcelable.Creator creator2 = Bundle.CREATOR;
            Bundle bundle2 = (Bundle) ci.s.a(parcel);
            ci.s.b(parcel);
            d(bundle2);
            return true;
        }
        ig.g gVar = this.f22296g;
        com.google.android.play.core.integrity.c cVar = this.f22297h;
        if (i7 == 4) {
            Parcelable.Creator creator3 = Bundle.CREATOR;
            ci.s.b(parcel);
            cVar.f6514e.c(gVar);
            return true;
        }
        if (i7 != 5) {
            return false;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        ci.s.b(parcel);
        cVar.f6514e.c(gVar);
        return true;
    }
}
