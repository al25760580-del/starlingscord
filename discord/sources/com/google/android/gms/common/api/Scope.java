package com.google.android.gms.common.api;

import af.w;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bf.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import ls.d;
import ye.q;

/* JADX INFO: loaded from: classes3.dex */
public final class Scope extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new q(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5932e;

    public Scope(int i7, String str) {
        w.e(str, "scopeUri must not be null or empty");
        this.f5931d = i7;
        this.f5932e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f5932e.equals(((Scope) obj).f5932e);
    }

    public final int hashCode() {
        return this.f5932e.hashCode();
    }

    public final String toString() {
        return this.f5932e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = d.T(20293, parcel);
        d.S(parcel, 1, 4);
        parcel.writeInt(this.f5931d);
        d.O(this.f5932e, parcel, 2);
        d.U(iT, parcel);
    }
}
