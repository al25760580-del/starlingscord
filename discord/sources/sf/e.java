package sf;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends af.f {
    @Override // af.f, ye.c
    public final int g() {
        return 17895000;
    }

    @Override // af.f
    public final IInterface l(IBinder iBinder) {
        Intrinsics.checkNotNullParameter(iBinder, "iBinder");
        int i7 = c.f19941g;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new b(iBinder);
    }

    @Override // af.f
    public final xe.d[] m() {
        xe.d[] ALL_FEATURES = bg.c.f3233d;
        Intrinsics.checkNotNullExpressionValue(ALL_FEATURES, "ALL_FEATURES");
        return ALL_FEATURES;
    }

    @Override // af.f
    public final String p() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // af.f
    public final String q() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // af.f
    public final boolean r() {
        return true;
    }

    @Override // af.f
    public final boolean s() {
        return true;
    }
}
