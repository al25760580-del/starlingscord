package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new af.m(15);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f2109e;

    public c(Parcel parcel) {
        this.f2108d = parcel.createStringArrayList();
        this.f2109e = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f2108d);
        parcel.writeTypedList(this.f2109e);
    }
}
