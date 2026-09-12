package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends View.BaseSavedState {
    public static final Parcelable.Creator<p0> CREATOR = new af.m(13);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1067d;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeByte(this.f1067d ? (byte) 1 : (byte) 0);
    }
}
