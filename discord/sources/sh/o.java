package sh;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends bg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a5.o f20131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f20132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f20133i;
    public final s1 j;
    public final g0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e1 f20134l;

    public o(Context context, s sVar, s1 s1Var, g0 g0Var, e1 e1Var) {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService", 4);
        this.f20131g = new a5.o("AssetPackExtractionService", 2);
        this.f20132h = context;
        this.f20133i = sVar;
        this.j = s1Var;
        this.k = g0Var;
        this.f20134l = e1Var;
    }

    @Override // bg.a
    public final boolean r(int i7, Parcel parcel) {
        String[] packagesForUid;
        th.m mVar = null;
        if (i7 != 2) {
            if (i7 != 3) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                mVar = iInterfaceQueryLocalInterface instanceof th.m ? (th.m) iInterfaceQueryLocalInterface : new th.m(strongBinder);
            }
            th.h.b(parcel);
            this.f20131g.a("clearAssetPackStorage AIDL call", new Object[0]);
            Context context = this.f20132h;
            if (!th.c.a(context) || (packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid())) == null || !Arrays.asList(packagesForUid).contains("com.android.vending")) {
                mVar.m(new Bundle());
                return true;
            }
            s.g(this.f20133i.d());
            Bundle bundle = new Bundle();
            Parcel parcelJ = mVar.j();
            parcelJ.writeInt(1);
            bundle.writeToParcel(parcelJ, 0);
            mVar.k(4, parcelJ);
            return true;
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) th.h.a(parcel);
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
            mVar = iInterfaceQueryLocalInterface2 instanceof th.m ? (th.m) iInterfaceQueryLocalInterface2 : new th.m(strongBinder2);
        }
        th.h.b(parcel);
        synchronized (this) {
            this.f20131g.a("updateServiceState AIDL call", new Object[0]);
            if (th.c.a(this.f20132h)) {
                String[] packagesForUid2 = this.f20132h.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                if (packagesForUid2 != null && Arrays.asList(packagesForUid2).contains("com.android.vending")) {
                    int i10 = bundle2.getInt("action_type");
                    g0 g0Var = this.k;
                    synchronized (g0Var.f20042e) {
                        g0Var.f20042e.add(mVar);
                    }
                    if (i10 == 1) {
                        this.f20134l.b(bundle2);
                        this.j.e(true);
                        this.k.f20045w = this.f20134l.a(bundle2);
                        this.f20132h.bindService(new Intent(this.f20132h, (Class<?>) ExtractionForegroundService.class), this.k, 1);
                        return true;
                    }
                    if (i10 != 2) {
                        this.f20131g.b("Unknown action type received: %d", Integer.valueOf(i10));
                        mVar.m(new Bundle());
                        return true;
                    }
                    this.j.e(false);
                    g0 g0Var2 = this.k;
                    g0Var2.f20041d.a("Stopping foreground installation service.", new Object[0]);
                    g0Var2.f20043i.unbindService(g0Var2);
                    ExtractionForegroundService extractionForegroundService = g0Var2.f20044v;
                    if (extractionForegroundService != null) {
                        synchronized (extractionForegroundService) {
                            extractionForegroundService.stopForeground(true);
                            extractionForegroundService.stopSelf();
                        }
                    }
                    g0Var2.a();
                    return true;
                }
            }
            mVar.m(new Bundle());
            return true;
        }
    }
}
