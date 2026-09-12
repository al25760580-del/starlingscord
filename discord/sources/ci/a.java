package ci;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f3675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3676h;

    public /* synthetic */ a(IBinder iBinder, String str, int i7) {
        this.f3674f = i7;
        this.f3675g = iBinder;
        this.f3676h = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f3674f) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.f3675g;
    }

    public Parcel j() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f3676h);
        return parcelObtain;
    }

    public void k(int i7, Parcel parcel) {
        switch (this.f3674f) {
            case 0:
                try {
                    this.f3675g.transact(i7, parcel, null, 1);
                    return;
                } finally {
                    parcel.recycle();
                }
            default:
                try {
                    this.f3675g.transact(i7, parcel, null, 1);
                    return;
                } finally {
                    parcel.recycle();
                }
        }
    }

    public Parcel r() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f3676h);
        return parcelObtain;
    }

    public void s(int i7, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f3675g.transact(i7, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel t(int i7, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f3675g.transact(i7, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }

    public Parcel u() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f3676h);
        return parcelObtain;
    }

    public Parcel v() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f3676h);
        return parcelObtain;
    }

    public Parcel w(int i7, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f3675g.transact(i7, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }

    public void x(int i7, Parcel parcel) {
        try {
            this.f3675g.transact(i7, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
