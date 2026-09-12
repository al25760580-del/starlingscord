package af;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends bf.a {
    public static final Parcelable.Creator<t> CREATOR = new m(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IBinder f481e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final xe.b f482i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f483v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f484w;

    public t(int i7, IBinder iBinder, xe.b bVar, boolean z5, boolean z6) {
        this.f480d = i7;
        this.f481e = iBinder;
        this.f482i = bVar;
        this.f483v = z5;
        this.f484w = z6;
    }

    public final boolean equals(Object obj) {
        Object j0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!this.f482i.equals(tVar.f482i)) {
            return false;
        }
        Object j0Var2 = null;
        IBinder iBinder = this.f481e;
        if (iBinder == null) {
            j0Var = null;
        } else {
            int i7 = a.f388g;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            j0Var = iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new j0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 5);
        }
        IBinder iBinder2 = tVar.f481e;
        if (iBinder2 != null) {
            int i10 = a.f388g;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            j0Var2 = iInterfaceQueryLocalInterface2 instanceof g ? (g) iInterfaceQueryLocalInterface2 : new j0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 5);
        }
        return w.j(j0Var, j0Var2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f480d);
        IBinder iBinder = this.f481e;
        if (iBinder != null) {
            int iT2 = ls.d.T(2, parcel);
            parcel.writeStrongBinder(iBinder);
            ls.d.U(iT2, parcel);
        }
        ls.d.N(parcel, 3, this.f482i, i7);
        ls.d.S(parcel, 4, 4);
        parcel.writeInt(this.f483v ? 1 : 0);
        ls.d.S(parcel, 5, 4);
        parcel.writeInt(this.f484w ? 1 : 0);
        ls.d.U(iT, parcel);
    }
}
