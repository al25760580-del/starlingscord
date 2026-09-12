package jd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new fd.a(28);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13751d;

    public i(Parcel parcel) {
        int i7 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i7);
        for (int i10 = 0; i10 < i7; i10++) {
            arrayList.add(new h(parcel));
        }
        this.f13751d = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.f13751d;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = (h) list.get(i10);
            parcel.writeLong(hVar.f13742a);
            parcel.writeByte(hVar.f13743b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f13744c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f13745d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f13747f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i11 = 0; i11 < size2; i11++) {
                g gVar = (g) list2.get(i11);
                parcel.writeInt(gVar.f13740a);
                parcel.writeLong(gVar.f13741b);
            }
            parcel.writeLong(hVar.f13746e);
            parcel.writeByte(hVar.f13748g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.f13749h);
            parcel.writeInt(hVar.f13750i);
            parcel.writeInt(hVar.j);
            parcel.writeInt(hVar.k);
        }
    }

    public i(ArrayList arrayList) {
        this.f13751d = Collections.unmodifiableList(arrayList);
    }
}
