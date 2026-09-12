package af;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements ServiceConnection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f392e;

    public b0(f fVar, int i7) {
        this.f392e = fVar;
        this.f391d = i7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i7;
        int i10;
        f fVar = this.f392e;
        if (iBinder == null) {
            synchronized (fVar.f424x) {
                i7 = fVar.J;
            }
            if (i7 == 3) {
                fVar.Q = true;
                i10 = 5;
            } else {
                i10 = 4;
            }
            z zVar = fVar.f423w;
            zVar.sendMessage(zVar.obtainMessage(i10, fVar.S.get(), 16));
            return;
        }
        synchronized (fVar.f425y) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                fVar.E = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof v)) ? new v(iBinder) : (v) iInterfaceQueryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f fVar2 = this.f392e;
        int i11 = this.f391d;
        fVar2.getClass();
        d0 d0Var = new d0(fVar2, 0, null);
        z zVar2 = fVar2.f423w;
        zVar2.sendMessage(zVar2.obtainMessage(7, i11, -1, d0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        f fVar = this.f392e;
        synchronized (fVar.f425y) {
            fVar.E = null;
        }
        f fVar2 = this.f392e;
        int i7 = this.f391d;
        z zVar = fVar2.f423w;
        zVar.sendMessage(zVar.obtainMessage(6, i7, 1));
    }
}
