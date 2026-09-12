package af;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends bf.a {

    @NonNull
    public static final Parcelable.Creator<e> CREATOR = new m(7);
    public static final Scope[] L = new Scope[0];
    public static final xe.d[] M = new xe.d[0];
    public Account E;
    public xe.d[] F;
    public xe.d[] G;
    public final boolean H;
    public final int I;
    public boolean J;
    public final String K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f409e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f410i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f411v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public IBinder f412w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Scope[] f413x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Bundle f414y;

    public e(int i7, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, xe.d[] dVarArr, xe.d[] dVarArr2, boolean z5, int i12, boolean z6, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? L : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        xe.d[] dVarArr3 = M;
        xe.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f408d = i7;
        this.f409e = i10;
        this.f410i = i11;
        if ("com.google.android.gms".equals(str)) {
            this.f411v = "com.google.android.gms";
        } else {
            this.f411v = str;
        }
        if (i7 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = a.f388g;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                g j0Var = iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new j0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 5);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        j0 j0Var2 = (j0) j0Var;
                        Parcel parcelT = j0Var2.t(2, j0Var2.u());
                        Account account3 = (Account) yf.g.a(parcelT, Account.CREATOR);
                        parcelT.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th2) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th2;
                }
            }
            this.E = account2;
        } else {
            this.f412w = iBinder;
            this.E = account;
        }
        this.f413x = scopeArr2;
        this.f414y = bundle2;
        this.F = dVarArr4;
        this.G = dVarArr3;
        this.H = z5;
        this.I = i12;
        this.J = z6;
        this.K = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        m.a(this, parcel, i7);
    }
}
