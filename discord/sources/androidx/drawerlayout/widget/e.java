package androidx.drawerlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.c3;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d2.b {
    public static final Parcelable.Creator<e> CREATOR = new c3(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1985i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1986v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1987w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1988x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1989y;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1985i = 0;
        this.f1985i = parcel.readInt();
        this.f1986v = parcel.readInt();
        this.f1987w = parcel.readInt();
        this.f1988x = parcel.readInt();
        this.f1989y = parcel.readInt();
    }

    @Override // d2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f1985i);
        parcel.writeInt(this.f1986v);
        parcel.writeInt(this.f1987w);
        parcel.writeInt(this.f1988x);
        parcel.writeInt(this.f1989y);
    }
}
