package mg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.c3;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends d2.b {
    public static final Parcelable.Creator<d> CREATOR = new c3(8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15769i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15770v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15771w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f15772x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f15773y;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f15769i = parcel.readByte() != 0;
        this.f15770v = parcel.readByte() != 0;
        this.f15771w = parcel.readInt();
        this.f15772x = parcel.readFloat();
        this.f15773y = parcel.readByte() != 0;
    }

    @Override // d2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeByte(this.f15769i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15770v ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f15771w);
        parcel.writeFloat(this.f15772x);
        parcel.writeByte(this.f15773y ? (byte) 1 : (byte) 0);
    }
}
