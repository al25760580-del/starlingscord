package sh;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements ServiceConnection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a5.o f20041d = new a5.o("ExtractionForegroundServiceConnection", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f20042e = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f20043i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ExtractionForegroundService f20044v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Notification f20045w;

    public g0(Context context) {
        this.f20043i = context;
    }

    public final void a() {
        ArrayList arrayList;
        synchronized (this.f20042e) {
            arrayList = new ArrayList(this.f20042e);
            this.f20042e.clear();
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            th.m mVar = (th.m) arrayList.get(i7);
            try {
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                Parcel parcelJ = mVar.j();
                int i10 = th.h.f20776a;
                parcelJ.writeInt(1);
                bundle.writeToParcel(parcelJ, 0);
                parcelJ.writeInt(1);
                bundle2.writeToParcel(parcelJ, 0);
                mVar.k(2, parcelJ);
            } catch (RemoteException unused) {
                this.f20041d.b("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f20041d.a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((f0) iBinder).f20035f;
        this.f20044v = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.f20045w);
        a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
