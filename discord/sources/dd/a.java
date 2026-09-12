package dd;

import af.m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements cd.b {
    public static final Parcelable.Creator<a> CREATOR = new m(25);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7615e;

    public a(int i7, String str) {
        this.f7614d = i7;
        this.f7615e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f7614d);
        sb2.append(",url=");
        return com.discord.chat.presentation.list.a.k(sb2, this.f7615e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f7615e);
        parcel.writeInt(this.f7614d);
    }
}
