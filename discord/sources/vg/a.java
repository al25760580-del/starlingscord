package vg;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends View.BaseSavedState {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new rf.b(21);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21666d;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" CheckedState=");
        int i7 = this.f21666d;
        if (i7 != 1) {
            str = i7 != 2 ? "unchecked" : ReactProgressBarViewManager.PROP_INDETERMINATE;
        } else {
            str = "checked";
        }
        return com.discord.chat.presentation.list.a.k(sb2, str, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeValue(Integer.valueOf(this.f21666d));
    }
}
