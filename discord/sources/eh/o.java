package eh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.c3;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends d2.b {
    public static final Parcelable.Creator<o> CREATOR = new c3(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Bundle f8270i;

    public o(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8270i = parcel.readBundle(classLoader == null ? o.class.getClassLoader() : classLoader);
    }

    @Override // d2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeBundle(this.f8270i);
    }
}
