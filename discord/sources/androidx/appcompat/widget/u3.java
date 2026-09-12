package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u3 extends d2.b {
    public static final Parcelable.Creator<u3> CREATOR = new c3(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1132i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1133v;

    public u3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1132i = parcel.readInt();
        this.f1133v = parcel.readInt() != 0;
    }

    @Override // d2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f1132i);
        parcel.writeInt(this.f1133v ? 1 : 0);
    }
}
