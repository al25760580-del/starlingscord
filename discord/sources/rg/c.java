package rg;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.appcompat.widget.c3;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends d2.b {
    public static final Parcelable.Creator<c> CREATOR = new c3(10);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19418i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f19419v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f19420w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f19421x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f19422y;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f19418i = parcel.readInt();
        this.f19419v = parcel.readInt();
        this.f19420w = parcel.readInt() == 1;
        this.f19421x = parcel.readInt() == 1;
        this.f19422y = parcel.readInt() == 1;
    }

    @Override // d2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f19418i);
        parcel.writeInt(this.f19419v);
        parcel.writeInt(this.f19420w ? 1 : 0);
        parcel.writeInt(this.f19421x ? 1 : 0);
        parcel.writeInt(this.f19422y ? 1 : 0);
    }

    public c(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f19418i = bottomSheetBehavior.N;
        this.f19419v = bottomSheetBehavior.f6278e;
        this.f19420w = bottomSheetBehavior.f6272b;
        this.f19421x = bottomSheetBehavior.I;
        this.f19422y = bottomSheetBehavior.J;
    }
}
