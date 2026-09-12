package o3;

import android.os.Parcel;
import android.util.SparseIntArray;
import s.e;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f17108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f17109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17113i;
    public int j;
    public int k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e(0), new e(0), new e(0));
    }

    @Override // o3.a
    public final b a() {
        Parcel parcel = this.f17109e;
        int iDataPosition = parcel.dataPosition();
        int i7 = this.j;
        if (i7 == this.f17110f) {
            i7 = this.f17111g;
        }
        return new b(parcel, iDataPosition, i7, com.discord.chat.presentation.list.a.k(new StringBuilder(), this.f17112h, "  "), this.f17105a, this.f17106b, this.f17107c);
    }

    @Override // o3.a
    public final boolean e(int i7) {
        while (this.j < this.f17111g) {
            int i10 = this.k;
            if (i10 == i7) {
                return true;
            }
            if (String.valueOf(i10).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            int i11 = this.j;
            Parcel parcel = this.f17109e;
            parcel.setDataPosition(i11);
            int i12 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += i12;
        }
        return this.k == i7;
    }

    @Override // o3.a
    public final void i(int i7) {
        int i10 = this.f17113i;
        SparseIntArray sparseIntArray = this.f17108d;
        Parcel parcel = this.f17109e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(iDataPosition - i11);
            parcel.setDataPosition(iDataPosition);
        }
        this.f17113i = i7;
        sparseIntArray.put(i7, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i7);
    }

    public b(Parcel parcel, int i7, int i10, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f17108d = new SparseIntArray();
        this.f17113i = -1;
        this.k = -1;
        this.f17109e = parcel;
        this.f17110f = i7;
        this.f17111g = i10;
        this.j = i7;
        this.f17112h = str;
    }
}
