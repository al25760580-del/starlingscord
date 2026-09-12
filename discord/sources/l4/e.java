package l4;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class e extends View.BaseSavedState {
    public static final Parcelable.Creator<e> CREATOR = new jf.b(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14833e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f14834i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14835v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f14836w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14837x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14838y;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeString(this.f14832d);
        parcel.writeFloat(this.f14834i);
        parcel.writeInt(this.f14835v ? 1 : 0);
        parcel.writeString(this.f14836w);
        parcel.writeInt(this.f14837x);
        parcel.writeInt(this.f14838y);
    }
}
