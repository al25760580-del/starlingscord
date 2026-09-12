package a5;

import android.os.Parcel;
import com.google.android.gms.internal.play_billing.w4;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends bg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4 f175g;

    public c0(w4 w4Var) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", 3);
        this.f175g = w4Var;
    }

    @Override // bg.a
    public final boolean t(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 != 1) {
            return false;
        }
        int i10 = parcel.readInt();
        bg.a.v(parcel);
        this.f175g.a(Integer.valueOf(i10));
        return true;
    }
}
