package q;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import androidx.appcompat.widget.u0;
import com.discord.chrome_custom_tabs.TrackedCustomTab$callback$1;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Binder implements b.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f18568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a f18569g;

    public g(TrackedCustomTab$callback$1 trackedCustomTab$callback$1) {
        this.f18569g = trackedCustomTab$callback$1;
        attachInterface(this, b.a.f3008a);
        this.f18568f = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        String str = b.a.f3008a;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.f18568f;
        a aVar = this.f18569g;
        switch (i7) {
            case 2:
                int i11 = parcel.readInt();
                Bundle bundle = (Bundle) android.support.v4.media.session.b.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new u0(this, i11, bundle, 2));
                    return true;
                }
                return true;
            case 3:
                String string = parcel.readString();
                Bundle bundle2 = (Bundle) android.support.v4.media.session.b.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new c(this, string, bundle2, 0));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) android.support.v4.media.session.b.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new d(this, bundle3, 0));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String string2 = parcel.readString();
                Bundle bundle4 = (Bundle) android.support.v4.media.session.b.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new c(this, string2, bundle4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int i12 = parcel.readInt();
                Uri uri = (Uri) android.support.v4.media.session.b.a(parcel, Uri.CREATOR);
                boolean z5 = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) android.support.v4.media.session.b.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new e(this, i12, uri, z5, bundle5));
                    return true;
                }
                return true;
            case 7:
                Bundle bundleExtraCallbackWithResult = aVar == null ? null : aVar.extraCallbackWithResult(parcel.readString(), (Bundle) android.support.v4.media.session.b.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                if (bundleExtraCallbackWithResult == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundleExtraCallbackWithResult.writeToParcel(parcel2, 1);
                return true;
            case 8:
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                Bundle bundle6 = (Bundle) android.support.v4.media.session.b.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new d4.c(this, i13, i14, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) android.support.v4.media.session.b.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle7, 1));
                    return true;
                }
                return true;
            case 10:
                int i15 = parcel.readInt();
                int i16 = parcel.readInt();
                int i17 = parcel.readInt();
                int i18 = parcel.readInt();
                int i19 = parcel.readInt();
                Bundle bundle8 = (Bundle) android.support.v4.media.session.b.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new f(this, i15, i16, i17, i18, i19, bundle8));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) android.support.v4.media.session.b.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new d(this, bundle9, 1));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) android.support.v4.media.session.b.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle10, 0));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i7, parcel, parcel2, i10);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
