package we;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Messenger f22200d;

    public f(IBinder iBinder) {
        this.f22200d = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f22200d;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((f) obj).f22200d;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f22200d;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        Messenger messenger = this.f22200d;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
