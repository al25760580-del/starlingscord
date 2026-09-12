package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new af.m(20);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f6327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f6328e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f6329i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final q f6330v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f6331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f6332x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f6333y;

    public b(q qVar, q qVar2, d dVar, q qVar3, int i7) {
        Objects.requireNonNull(qVar, "start cannot be null");
        Objects.requireNonNull(qVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f6327d = qVar;
        this.f6328e = qVar2;
        this.f6330v = qVar3;
        this.f6331w = i7;
        this.f6329i = dVar;
        if (qVar3 != null && qVar.f6375d.compareTo(qVar3.f6375d) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (qVar3 != null && qVar3.f6375d.compareTo(qVar2.f6375d) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i7 < 0 || i7 > z.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f6333y = qVar.v(qVar2) + 1;
        this.f6332x = (qVar2.f6377i - qVar.f6377i) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6327d.equals(bVar.f6327d) && this.f6328e.equals(bVar.f6328e) && Objects.equals(this.f6330v, bVar.f6330v) && this.f6331w == bVar.f6331w && this.f6329i.equals(bVar.f6329i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6327d, this.f6328e, this.f6330v, Integer.valueOf(this.f6331w), this.f6329i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f6327d, 0);
        parcel.writeParcelable(this.f6328e, 0);
        parcel.writeParcelable(this.f6330v, 0);
        parcel.writeParcelable(this.f6329i, 0);
        parcel.writeInt(this.f6331w);
    }
}
