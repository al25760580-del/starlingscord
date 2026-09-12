package bh;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.appcompat.widget.c3;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends SparseArray implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new c3(4);

    public g(Parcel parcel, ClassLoader classLoader) {
        int i7 = parcel.readInt();
        int[] iArr = new int[i7];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        for (int i10 = 0; i10 < i7; i10++) {
            put(iArr[i10], parcelableArray[i10]);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = keyAt(i10);
            parcelableArr[i10] = (Parcelable) valueAt(i10);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i7);
    }
}
