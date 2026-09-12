package nh;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.widget.c3;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends d2.b {
    public static final Parcelable.Creator<z> CREATOR = new c3(9);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f16923i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16924v;

    public z(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f16923i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f16924v = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f16923i) + "}";
    }

    @Override // d2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        TextUtils.writeToParcel(this.f16923i, parcel, i7);
        parcel.writeInt(this.f16924v ? 1 : 0);
    }
}
