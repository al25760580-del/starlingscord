package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends ci.a implements d {
    public final Bundle A(String str, String str2, Bundle bundle) {
        Parcel parcelV = v();
        parcelV.writeInt(9);
        parcelV.writeString(str);
        parcelV.writeString(str2);
        int i7 = e.f5997a;
        parcelV.writeInt(1);
        bundle.writeToParcel(parcelV, 0);
        Parcel parcelW = w(12, parcelV);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) e.a(parcelW);
        parcelW.recycle();
        return bundle2;
    }

    public final Bundle B(String str, String str2, String str3) {
        Parcel parcelV = v();
        parcelV.writeInt(3);
        parcelV.writeString(str);
        parcelV.writeString(str2);
        parcelV.writeString(str3);
        parcelV.writeString(null);
        Parcel parcelW = w(3, parcelV);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) e.a(parcelW);
        parcelW.recycle();
        return bundle;
    }

    public final Bundle C(int i7, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelV = v();
        parcelV.writeInt(i7);
        parcelV.writeString(str);
        parcelV.writeString(str2);
        parcelV.writeString(str3);
        parcelV.writeString(null);
        int i10 = e.f5997a;
        parcelV.writeInt(1);
        bundle.writeToParcel(parcelV, 0);
        Parcel parcelW = w(8, parcelV);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) e.a(parcelW);
        parcelW.recycle();
        return bundle2;
    }

    public final Bundle D(String str, String str2, String str3) {
        Parcel parcelV = v();
        parcelV.writeInt(3);
        parcelV.writeString(str);
        parcelV.writeString(str2);
        parcelV.writeString(str3);
        Parcel parcelW = w(4, parcelV);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) e.a(parcelW);
        parcelW.recycle();
        return bundle;
    }

    public final Bundle E(int i7, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelV = v();
        parcelV.writeInt(i7);
        parcelV.writeString(str);
        parcelV.writeString(str2);
        parcelV.writeString(str3);
        int i10 = e.f5997a;
        parcelV.writeInt(1);
        bundle.writeToParcel(parcelV, 0);
        Parcel parcelW = w(11, parcelV);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) e.a(parcelW);
        parcelW.recycle();
        return bundle2;
    }

    public final Bundle F(int i7, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelV = v();
        parcelV.writeInt(i7);
        parcelV.writeString(str);
        parcelV.writeString(str2);
        int i10 = e.f5997a;
        parcelV.writeInt(1);
        bundle.writeToParcel(parcelV, 0);
        parcelV.writeInt(1);
        bundle2.writeToParcel(parcelV, 0);
        Parcel parcelW = w(901, parcelV);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) e.a(parcelW);
        parcelW.recycle();
        return bundle3;
    }

    public final void G(String str, Bundle bundle, a5.x xVar) {
        Parcel parcelV = v();
        parcelV.writeInt(18);
        parcelV.writeString(str);
        int i7 = e.f5997a;
        parcelV.writeInt(1);
        bundle.writeToParcel(parcelV, 0);
        parcelV.writeStrongBinder(xVar);
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f3675g.transact(1301, parcelV, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcelV.recycle();
            parcelObtain.recycle();
        }
    }

    public final void H(String str, Bundle bundle, a5.y yVar) {
        Parcel parcelV = v();
        parcelV.writeInt(25);
        parcelV.writeString(str);
        int i7 = e.f5997a;
        parcelV.writeInt(1);
        bundle.writeToParcel(parcelV, 0);
        parcelV.writeStrongBinder(yVar);
        x(2101, parcelV);
    }

    public final int y(int i7, String str, String str2) {
        Parcel parcelV = v();
        parcelV.writeInt(i7);
        parcelV.writeString(str);
        parcelV.writeString(str2);
        Parcel parcelW = w(1, parcelV);
        int i10 = parcelW.readInt();
        parcelW.recycle();
        return i10;
    }

    public final int z(int i7, String str, String str2, Bundle bundle) {
        Parcel parcelV = v();
        parcelV.writeInt(i7);
        parcelV.writeString(str);
        parcelV.writeString(str2);
        int i10 = e.f5997a;
        parcelV.writeInt(1);
        bundle.writeToParcel(parcelV, 0);
        Parcel parcelW = w(10, parcelV);
        int i11 = parcelW.readInt();
        parcelW.recycle();
        return i11;
    }
}
