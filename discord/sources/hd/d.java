package hd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends j {
    public static final Parcelable.Creator<d> CREATOR = new fd.a(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10553e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10554i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f10555v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String[] f10556w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j[] f10557x;

    public d(String str, boolean z5, boolean z6, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f10553e = str;
        this.f10554i = z5;
        this.f10555v = z6;
        this.f10556w = strArr;
        this.f10557x = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f10554i == dVar.f10554i && this.f10555v == dVar.f10555v && e0.a(this.f10553e, dVar.f10553e) && Arrays.equals(this.f10556w, dVar.f10556w) && Arrays.equals(this.f10557x, dVar.f10557x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (((527 + (this.f10554i ? 1 : 0)) * 31) + (this.f10555v ? 1 : 0)) * 31;
        String str = this.f10553e;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10553e);
        parcel.writeByte(this.f10554i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10555v ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f10556w);
        j[] jVarArr = this.f10557x;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i7 = e0.f13788a;
        this.f10553e = string;
        this.f10554i = parcel.readByte() != 0;
        this.f10555v = parcel.readByte() != 0;
        this.f10556w = parcel.createStringArray();
        int i10 = parcel.readInt();
        this.f10557x = new j[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f10557x[i11] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
