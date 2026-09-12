package ag;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class q1 extends af.f {
    @Override // af.f, ye.c
    public final int g() {
        return 13000000;
    }

    @Override // af.f
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return iInterfaceQueryLocalInterface instanceof s1 ? (s1) iInterfaceQueryLocalInterface : new s1(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // af.f
    public final xe.d[] m() {
        return new xe.d[]{nf.a.f16804b, nf.a.f16803a};
    }

    @Override // af.f
    public final Bundle n() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // af.f
    public final String p() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // af.f
    public final String q() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // af.f
    public final boolean s() {
        return true;
    }
}
