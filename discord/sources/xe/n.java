package xe;

import af.k0;
import af.w;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n extends bg.a implements k0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22939g;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 7);
        w.b(bArr.length == 25);
        this.f22939g = Arrays.hashCode(bArr);
    }

    public static byte[] A(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k0) {
            try {
                k0 k0Var = (k0) obj;
                if (((n) k0Var).f22939g == this.f22939g) {
                    return Arrays.equals(z(), (byte[]) lf.b.A(new lf.b(((n) k0Var).z())));
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22939g;
    }

    @Override // bg.a
    public final boolean y(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 == 1) {
            lf.b bVar = new lf.b(z());
            parcel2.writeNoException();
            yf.g.b(parcel2, bVar);
            return true;
        }
        if (i7 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f22939g);
        return true;
    }

    public abstract byte[] z();
}
