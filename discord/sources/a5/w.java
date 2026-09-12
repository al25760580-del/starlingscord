package a5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.android.billingclient.api.BillingResult;
import com.discord.jank_stats.JankRecordStore;
import com.google.android.gms.internal.play_billing.p4;
import com.google.android.gms.internal.play_billing.q4;
import com.google.android.gms.internal.play_billing.r4;
import com.google.android.gms.internal.play_billing.s3;
import com.google.android.gms.internal.play_billing.s4;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.t4;
import com.google.android.gms.internal.play_billing.u3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.internal.play_billing.y3;
import com.google.android.gms.internal.play_billing.z1;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class w implements ServiceConnection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.m f270e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.m f271i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b f272v;

    public w(b bVar, c cVar) {
        this.f272v = bVar;
        z1 z1Var = bVar.D;
        this.f270e = new com.google.android.gms.internal.play_billing.m(z1Var);
        this.f271i = new com.google.android.gms.internal.play_billing.m(z1Var);
        this.f269d = cVar;
    }

    public final Long a(boolean z5) {
        try {
            if (z5) {
                synchronized (this.f272v.f148a) {
                    try {
                        com.google.android.gms.internal.play_billing.m mVar = this.f270e;
                        if (!mVar.f6050b) {
                            return null;
                        }
                        long jD = mVar.f6049a.d();
                        if (!mVar.f6050b) {
                            throw new IllegalStateException("This stopwatch is already stopped.");
                        }
                        mVar.f6050b = false;
                        long j = (jD - mVar.f6052d) + mVar.f6051c;
                        mVar.f6051c = j;
                        return Long.valueOf(TimeUnit.MILLISECONDS.convert(j, TimeUnit.NANOSECONDS));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            synchronized (this.f272v.f148a) {
                try {
                    com.google.android.gms.internal.play_billing.m mVar2 = this.f271i;
                    if (!mVar2.f6050b) {
                        return null;
                    }
                    long jD2 = mVar2.f6049a.d();
                    if (!mVar2.f6050b) {
                        throw new IllegalStateException("This stopwatch is already stopped.");
                    }
                    mVar2.f6050b = false;
                    long j5 = (jD2 - mVar2.f6052d) + mVar2.f6051c;
                    mVar2.f6051c = j5;
                    return Long.valueOf(TimeUnit.MILLISECONDS.convert(j5, TimeUnit.NANOSECONDS));
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Exception getting connection establishment duration.", th4);
            return null;
        }
        com.google.android.gms.internal.play_billing.r.i("BillingClient", "Exception getting connection establishment duration.", th4);
        return null;
    }

    public final void b(BillingResult billingResult, int i7, String str, boolean z5, int i10) {
        try {
            w3 w3VarS = x3.s();
            int i11 = billingResult.f3788a;
            w3VarS.c();
            x3.r((x3) w3VarS.f5994e, i11);
            String str2 = billingResult.f3790c;
            w3VarS.c();
            x3.u((x3) w3VarS.f5994e, str2);
            w3VarS.c();
            x3.x((x3) w3VarS.f5994e, i7);
            w3VarS.c();
            x3.v((x3) w3VarS.f5994e, i10);
            if (str != null) {
                w3VarS.c();
                x3.t((x3) w3VarS.f5994e, str);
            }
            Long lA = a(z5);
            b bVar = this.f272v;
            if (!z5) {
                p4 p4VarR = q4.r();
                p4VarR.c();
                q4.s((q4) p4VarR.f5994e, (x3) w3VarS.a());
                if (lA != null) {
                    long jLongValue = lA.longValue();
                    p4VarR.c();
                    q4.t((q4) p4VarR.f5994e, jLongValue);
                }
                bVar.f155h.Y((q4) p4VarR.a());
                return;
            }
            s4 s4VarR = t4.r();
            s4VarR.e(false);
            s4VarR.f();
            s4VarR.c();
            t4.v((t4) s4VarR.f5994e, i10);
            if (lA != null) {
                long jLongValue2 = lA.longValue();
                s4VarR.c();
                t4.u((t4) s4VarR.f5994e, jLongValue2);
            }
            s3 s3VarU = t3.u();
            s3VarU.e(w3VarS);
            s3VarU.c();
            t3.t((t3) s3VarU.f5994e, 6);
            s3VarU.f(s4VarR);
            bVar.B((t3) s3VarU.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void c(int i7, boolean z5) {
        try {
            Long lA = a(z5);
            b bVar = this.f272v;
            if (!z5) {
                p4 p4VarR = q4.r();
                w3 w3VarS = x3.s();
                w3VarS.c();
                x3.r((x3) w3VarS.f5994e, 0);
                w3VarS.c();
                x3.v((x3) w3VarS.f5994e, i7);
                p4VarR.c();
                q4.s((q4) p4VarR.f5994e, (x3) w3VarS.a());
                if (lA != null) {
                    long jLongValue = lA.longValue();
                    p4VarR.c();
                    q4.t((q4) p4VarR.f5994e, jLongValue);
                }
                bVar.f155h.Y((q4) p4VarR.a());
                return;
            }
            u3 u3VarS = v3.s();
            u3VarS.c();
            v3.r((v3) u3VarS.f5994e, 6);
            s4 s4VarR = t4.r();
            s4VarR.e(false);
            s4VarR.f();
            s4VarR.c();
            t4.v((t4) s4VarR.f5994e, i7);
            if (lA != null) {
                long jLongValue2 = lA.longValue();
                s4VarR.c();
                t4.u((t4) s4VarR.f5994e, jLongValue2);
            }
            u3VarS.c();
            v3.w((v3) u3VarS.f5994e, (t4) s4VarR.a());
            bVar.C((v3) u3VarS.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void d(BillingResult billingResult) {
        b bVar = this.f272v;
        synchronized (bVar.f148a) {
            try {
                if (bVar.f149b == 3) {
                    return;
                }
                try {
                    this.f269d.onBillingSetupFinished(billingResult);
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.r.i("BillingClient", "Exception while calling onBillingSetupFinished.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void e(Exception exc, boolean z5, int i7) {
        int i10;
        com.google.android.gms.internal.play_billing.r.i("BillingClient", "Exception while invoking initialize AIDL method", exc);
        boolean z6 = exc instanceof DeadObjectException;
        if (z6) {
            i10 = 132;
        } else if (exc instanceof RemoteException) {
            i10 = 134;
        } else {
            i10 = exc instanceof SecurityException ? 133 : 131;
        }
        int i11 = i10;
        String strA = f0.a(exc);
        this.f272v.E(0);
        b(z6 ? h0.f197h : h0.f195f, i11, strA, z5, i7);
        d(z6 ? h0.f197h : h0.f195f);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    public final void f(Exception exc, boolean z5) {
        int i7;
        int i10;
        String strA;
        BillingResult billingResult;
        BillingResult billingResult2;
        com.google.android.gms.internal.play_billing.r.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", exc);
        boolean z6 = exc instanceof DeadObjectException;
        if (z6) {
            i10 = 91;
        } else {
            if (!(exc instanceof RemoteException)) {
                if (exc instanceof SecurityException) {
                    i10 = 92;
                } else {
                    i7 = 42;
                }
                if (f0.e.a(i7, 42)) {
                    strA = f0.a(exc);
                } else {
                    strA = null;
                }
                String str = strA;
                this.f272v.E(0);
                if (z6) {
                    billingResult = h0.f197h;
                } else {
                    billingResult = h0.f195f;
                }
                b(billingResult, i7, str, z5, 0);
                if (z6) {
                    billingResult2 = h0.f197h;
                } else {
                    billingResult2 = h0.f195f;
                }
                d(billingResult2);
            }
            i10 = 90;
        }
        i7 = i10;
        if (f0.e.a(i7, 42)) {
            strA = f0.a(exc);
        } else {
            strA = null;
        }
        String str2 = strA;
        this.f272v.E(0);
        if (z6) {
            billingResult = h0.f197h;
        } else {
            billingResult = h0.f195f;
        }
        b(billingResult, i7, str2, z5, 0);
        if (z6) {
            billingResult2 = h0.f197h;
        } else {
            billingResult2 = h0.f195f;
        }
        d(billingResult2);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z5;
        com.google.android.gms.internal.play_billing.r.h("BillingClient", "Billing service died.");
        try {
            b bVar = this.f272v;
            synchronized (bVar.f148a) {
                z5 = true;
                if (bVar.f149b != 1) {
                    z5 = false;
                }
            }
            if (z5) {
                e4.r rVar = bVar.f155h;
                s3 s3VarU = t3.u();
                s3VarU.c();
                t3.t((t3) s3VarU.f5994e, 6);
                w3 w3VarS = x3.s();
                w3VarS.c();
                x3.x((x3) w3VarS.f5994e, 110);
                s3VarU.e(w3VarS);
                s4 s4VarR = t4.r();
                s4VarR.e(false);
                s4VarR.f();
                s3VarU.f(s4VarR);
                rVar.Q((t3) s3VarU.a());
            } else {
                bVar.f155h.V(y3.r());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Unable to log.", th2);
        }
        b bVar2 = this.f272v;
        synchronized (bVar2.f148a) {
            if (bVar2.f149b != 3 && bVar2.f149b != 0) {
                bVar2.E(0);
                bVar2.G();
                try {
                    this.f269d.onBillingServiceDisconnected();
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.r.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.d bVar;
        com.google.android.gms.internal.play_billing.r.g("BillingClient", "Billing service connected.");
        b bVar2 = this.f272v;
        synchronized (bVar2.f148a) {
            try {
                if (bVar2.f149b == 3) {
                    return;
                }
                int i7 = com.google.android.gms.internal.play_billing.c.f5985g;
                int i10 = 1;
                if (iBinder == null) {
                    bVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    bVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.d ? (com.google.android.gms.internal.play_billing.d) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.b(iBinder, "com.android.vending.billing.IInAppBillingService", 1);
                }
                bVar2.f156i = bVar;
                if (b.j(new v(0, this), JankRecordStore.FLUSH_INTERVAL_MS, new a3.h(i10, this), bVar2.k(), bVar2.i()) == null) {
                    BillingResult billingResultN = bVar2.n();
                    bVar2.D(25, billingResultN);
                    d(billingResultN);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z5;
        com.google.android.gms.internal.play_billing.r.h("BillingClient", "Billing service disconnected.");
        try {
            b bVar = this.f272v;
            synchronized (bVar.f148a) {
                z5 = true;
                if (bVar.f149b != 1) {
                    z5 = false;
                }
            }
            if (z5) {
                e4.r rVar = bVar.f155h;
                s3 s3VarU = t3.u();
                s3VarU.c();
                t3.t((t3) s3VarU.f5994e, 6);
                w3 w3VarS = x3.s();
                w3VarS.c();
                x3.x((x3) w3VarS.f5994e, 109);
                s3VarU.e(w3VarS);
                s4 s4VarR = t4.r();
                s4VarR.e(false);
                s4VarR.f();
                s3VarU.f(s4VarR);
                rVar.Q((t3) s3VarU.a());
            } else {
                bVar.f155h.Z(r4.r());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Unable to log.", th2);
        }
        b bVar2 = this.f272v;
        synchronized (bVar2.f148a) {
            try {
                if (com.facebook.imagepipeline.nativecode.b.f4926e) {
                    if (bVar2.f149b != 3 && bVar2.f149b != 0) {
                        com.google.android.gms.internal.play_billing.m mVar = this.f271i;
                        mVar.f6051c = 0L;
                        mVar.f6050b = false;
                        mVar.a();
                    }
                    return;
                }
                com.google.android.gms.internal.play_billing.m mVar2 = this.f271i;
                mVar2.f6051c = 0L;
                mVar2.f6050b = false;
                mVar2.a();
                if (bVar2.f149b == 3) {
                    return;
                }
                bVar2.E(0);
                try {
                    this.f269d.onBillingServiceDisconnected();
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.r.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
