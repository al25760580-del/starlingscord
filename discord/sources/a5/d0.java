package a5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements ServiceConnection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f177e;

    public /* synthetic */ d0(int i7, Object obj) {
        this.f176d = i7;
        this.f177e = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.i fVar;
        switch (this.f176d) {
            case 0:
                com.google.android.gms.internal.play_billing.r.g("BillingClientTesting", "Billing Override Service connected.");
                e0 e0Var = (e0) this.f177e;
                int i7 = com.google.android.gms.internal.play_billing.g.f6012g;
                if (iBinder == null) {
                    fVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    fVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.i ? (com.google.android.gms.internal.play_billing.i) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.f(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 1);
                }
                e0Var.G = fVar;
                e0Var.F = 2;
                e0Var.P(26);
                break;
            case 1:
                cg.h hVar = (cg.h) this.f177e;
                hVar.f3663b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                hVar.a().post(new cg.g(this, iBinder));
                break;
            case 2:
                ci.d dVar = (ci.d) this.f177e;
                dVar.f3686b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                dVar.a().post(new ci.b(this, iBinder));
                break;
            case 3:
                th.q qVar = (th.q) this.f177e;
                qVar.f20789b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                qVar.a().post(new sh.g(this, iBinder));
                break;
            default:
                zh.g gVar = (zh.g) this.f177e;
                gVar.f23996b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                gVar.a().post(new yh.d(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f176d) {
            case 0:
                com.google.android.gms.internal.play_billing.r.h("BillingClientTesting", "Billing Override Service disconnected.");
                e0 e0Var = (e0) this.f177e;
                e0Var.G = null;
                e0Var.F = 0;
                break;
            case 1:
                cg.h hVar = (cg.h) this.f177e;
                hVar.f3663b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                hVar.a().post(new cg.f(this));
                break;
            case 2:
                ci.d dVar = (ci.d) this.f177e;
                dVar.f3686b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                dVar.a().post(new ci.c(this));
                break;
            case 3:
                th.q qVar = (th.q) this.f177e;
                qVar.f20789b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                qVar.a().post(new th.p(1, this));
                break;
            default:
                zh.g gVar = (zh.g) this.f177e;
                gVar.f23996b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                gVar.a().post(new zh.f(1, this));
                break;
        }
    }

    public /* synthetic */ d0(cg.h hVar) {
        this.f176d = 1;
        Objects.requireNonNull(hVar);
        this.f177e = hVar;
    }

    public /* synthetic */ d0(ci.d dVar) {
        this.f176d = 2;
        Objects.requireNonNull(dVar);
        this.f177e = dVar;
    }
}
