package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d3 extends d2.b {
    public static final Parcelable.Creator<d3> CREATOR = new c3(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f931i;

    public d3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f931i = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" isIconified=");
        return com.discord.chat.presentation.list.a.m(sb2, this.f931i, "}");
    }

    @Override // d2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeValue(Boolean.valueOf(this.f931i));
    }
}
