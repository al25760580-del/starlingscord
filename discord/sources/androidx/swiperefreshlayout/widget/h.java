package androidx.swiperefreshlayout.widget;

import af.m;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class h extends View.BaseSavedState {
    public static final Parcelable.Creator<h> CREATOR = new m(19);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2780d;

    public h(Parcelable parcelable, boolean z5) {
        super(parcelable);
        this.f2780d = z5;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeByte(this.f2780d ? (byte) 1 : (byte) 0);
    }

    public h(Parcel parcel) {
        super(parcel);
        this.f2780d = parcel.readByte() != 0;
    }
}
