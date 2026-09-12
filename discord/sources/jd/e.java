package jd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new fd.a(26);
    public final List E;
    public final boolean F;
    public final long G;
    public final int H;
    public final int I;
    public final int J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13734e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f13735i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f13736v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f13737w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f13738x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f13739y;

    public e(long j, boolean z5, boolean z6, boolean z7, boolean z10, long j5, long j7, List list, boolean z11, long j10, int i7, int i10, int i11) {
        this.f13733d = j;
        this.f13734e = z5;
        this.f13735i = z6;
        this.f13736v = z7;
        this.f13737w = z10;
        this.f13738x = j5;
        this.f13739y = j7;
        this.E = Collections.unmodifiableList(list);
        this.F = z11;
        this.G = j10;
        this.H = i7;
        this.I = i10;
        this.J = i11;
    }

    @Override // jd.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f13738x);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return a3.e.n(sb2, this.f13739y, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f13733d);
        parcel.writeByte(this.f13734e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f13735i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f13736v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f13737w ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f13738x);
        parcel.writeLong(this.f13739y);
        List list = this.E;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) list.get(i10);
            parcel.writeInt(dVar.f13730a);
            parcel.writeLong(dVar.f13731b);
            parcel.writeLong(dVar.f13732c);
        }
        parcel.writeByte(this.F ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
        parcel.writeInt(this.J);
    }

    public e(Parcel parcel) {
        this.f13733d = parcel.readLong();
        this.f13734e = parcel.readByte() == 1;
        this.f13735i = parcel.readByte() == 1;
        this.f13736v = parcel.readByte() == 1;
        this.f13737w = parcel.readByte() == 1;
        this.f13738x = parcel.readLong();
        this.f13739y = parcel.readLong();
        int i7 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i7);
        for (int i10 = 0; i10 < i7; i10++) {
            arrayList.add(new d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.E = Collections.unmodifiableList(arrayList);
        this.F = parcel.readByte() == 1;
        this.G = parcel.readLong();
        this.H = parcel.readInt();
        this.I = parcel.readInt();
        this.J = parcel.readInt();
    }
}
