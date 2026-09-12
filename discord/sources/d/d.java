package d;

import af.m;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new m(24);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f7515d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        synchronized (this) {
            try {
                if (this.f7515d == null) {
                    this.f7515d = new c(this);
                }
                parcel.writeStrongBinder(this.f7515d.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(int i7, Bundle bundle) {
    }
}
