package v0;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.appcompat.widget.c3;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d2.b {
    public static final Parcelable.Creator<e> CREATOR = new c3(12);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SparseArray f21339i;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i7 = parcel.readInt();
        int[] iArr = new int[i7];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f21339i = new SparseArray(i7);
        for (int i10 = 0; i10 < i7; i10++) {
            this.f21339i.append(iArr[i10], parcelableArray[i10]);
        }
    }

    @Override // d2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        SparseArray sparseArray = this.f21339i;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = this.f21339i.keyAt(i10);
            parcelableArr[i10] = (Parcelable) this.f21339i.valueAt(i10);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i7);
    }
}
