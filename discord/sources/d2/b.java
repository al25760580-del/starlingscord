package d2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.c3;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Parcelable f7578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f7577e = new a();
    public static final Parcelable.Creator<b> CREATOR = new c3(5);

    public b() {
        this.f7578d = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f7578d, i7);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f7578d = parcelable == f7577e ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f7578d = parcelable == null ? f7577e : parcelable;
    }
}
