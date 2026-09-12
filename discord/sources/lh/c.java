package lh;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.appcompat.widget.c3;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends d2.b {
    public static final Parcelable.Creator<c> CREATOR = new c3(7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15087i;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f15087i = parcel.readInt();
    }

    @Override // d2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f15087i);
    }

    public c(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f15087i = sideSheetBehavior.f6423h;
    }
}
