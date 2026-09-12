package q;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import com.discord.chrome_custom_tabs.TrackedCustomTab$engagementSignalsCallback$1;

/* JADX INFO: loaded from: classes.dex */
public final class m extends Binder implements b.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f18574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f18575g;

    public m(TrackedCustomTab$engagementSignalsCallback$1 trackedCustomTab$engagementSignalsCallback$1) {
        this.f18575g = trackedCustomTab$engagementSignalsCallback$1;
        attachInterface(this, b.e.f3012c);
        this.f18574f = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        final boolean z5;
        String str = b.e.f3012c;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        final n nVar = this.f18575g;
        Handler handler = this.f18574f;
        if (i7 == 2) {
            z5 = parcel.readInt() != 0;
            final Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
            final int i11 = 1;
            handler.post(new Runnable() { // from class: q.l
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            nVar.onSessionEnded(z5, bundle);
                            break;
                        default:
                            nVar.onVerticalScrollEvent(z5, bundle);
                            break;
                    }
                }
            });
            return true;
        }
        if (i7 == 3) {
            handler.post(new ab.a(nVar, parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null), 12));
            return true;
        }
        if (i7 != 4) {
            return super.onTransact(i7, parcel, parcel2, i10);
        }
        z5 = parcel.readInt() != 0;
        final Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
        final int i12 = 0;
        handler.post(new Runnable() { // from class: q.l
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        nVar.onSessionEnded(z5, bundle2);
                        break;
                    default:
                        nVar.onVerticalScrollEvent(z5, bundle2);
                        break;
                }
            }
        });
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
