package af;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends bg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f390h;

    public a0(f fVar, int i7) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 7);
        this.f389g = fVar;
        this.f390h = i7;
    }

    @Override // bg.a
    public final boolean y(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 == 1) {
            int i10 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) yf.g.a(parcel, Bundle.CREATOR);
            yf.g.c(parcel);
            w.h(this.f389g, "onPostInitComplete can be called only once per call to getRemoteService");
            f fVar = this.f389g;
            int i11 = this.f390h;
            fVar.getClass();
            c0 c0Var = new c0(fVar, i10, strongBinder, bundle);
            z zVar = fVar.f423w;
            zVar.sendMessage(zVar.obtainMessage(1, i11, -1, c0Var));
            this.f389g = null;
        } else if (i7 == 2) {
            parcel.readInt();
            yf.g.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i7 != 3) {
                return false;
            }
            int i12 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            e0 e0Var = (e0) yf.g.a(parcel, e0.CREATOR);
            yf.g.c(parcel);
            f fVar2 = this.f389g;
            w.h(fVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            w.g(e0Var);
            fVar2.R = e0Var;
            if (fVar2.s()) {
                d dVar = e0Var.f418v;
                i iVarA = i.a();
                j jVar = dVar == null ? null : dVar.f401d;
                synchronized (iVarA) {
                    try {
                        if (jVar == null) {
                            jVar = i.f445c;
                        } else {
                            j jVar2 = (j) iVarA.f446a;
                            if (jVar2 == null || jVar2.f456d < jVar.f456d) {
                            }
                        }
                        iVarA.f446a = jVar;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            Bundle bundle2 = e0Var.f415d;
            w.h(this.f389g, "onPostInitComplete can be called only once per call to getRemoteService");
            f fVar3 = this.f389g;
            int i13 = this.f390h;
            fVar3.getClass();
            c0 c0Var2 = new c0(fVar3, i12, strongBinder2, bundle2);
            z zVar2 = fVar3.f423w;
            zVar2.sendMessage(zVar2.obtainMessage(1, i13, -1, c0Var2));
            this.f389g = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
