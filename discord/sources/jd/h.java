package jd;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f13747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f13748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13750i;
    public final int j;
    public final int k;

    public h(long j, boolean z5, boolean z6, boolean z7, ArrayList arrayList, long j5, boolean z10, long j7, int i7, int i10, int i11) {
        this.f13742a = j;
        this.f13743b = z5;
        this.f13744c = z6;
        this.f13745d = z7;
        this.f13747f = Collections.unmodifiableList(arrayList);
        this.f13746e = j5;
        this.f13748g = z10;
        this.f13749h = j7;
        this.f13750i = i7;
        this.j = i10;
        this.k = i11;
    }

    public h(Parcel parcel) {
        this.f13742a = parcel.readLong();
        this.f13743b = parcel.readByte() == 1;
        this.f13744c = parcel.readByte() == 1;
        this.f13745d = parcel.readByte() == 1;
        int i7 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i7);
        for (int i10 = 0; i10 < i7; i10++) {
            arrayList.add(new g(parcel.readInt(), parcel.readLong()));
        }
        this.f13747f = Collections.unmodifiableList(arrayList);
        this.f13746e = parcel.readLong();
        this.f13748g = parcel.readByte() == 1;
        this.f13749h = parcel.readLong();
        this.f13750i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
    }
}
