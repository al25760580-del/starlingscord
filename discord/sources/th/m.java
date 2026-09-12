package th;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends ci.a {
    public m(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback", 2);
    }

    public final void m(Bundle bundle) {
        Parcel parcelJ = j();
        int i7 = h.f20776a;
        parcelJ.writeInt(1);
        bundle.writeToParcel(parcelJ, 0);
        k(3, parcelJ);
    }
}
