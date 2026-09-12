package sg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.c3;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends d2.b {
    public static final Parcelable.Creator<b> CREATOR = new c3(11);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19944i;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f19944i = parcel.readInt() == 1;
    }

    @Override // d2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f19944i ? 1 : 0);
    }
}
