package af;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f implements ye.c {
    public static final xe.d[] U = new xe.d[0];
    public v E;
    public b F;
    public IInterface G;
    public final ArrayList H;
    public b0 I;
    public int J;
    public final i K;
    public final i L;
    public final int M;
    public final String N;
    public volatile String O;
    public xe.b P;
    public boolean Q;
    public volatile e0 R;
    public final AtomicInteger S;
    public final Set T;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile String f419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a3.n f420e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f421i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i0 f422v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z f423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f424x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f425y;

    public f(Context context, Looper looper, int i7, c cVar, ye.j jVar, ye.k kVar, int i10) {
        synchronized (i0.f447g) {
            try {
                if (i0.f448h == null) {
                    i0.f448h = new i0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i0 i0Var = i0.f448h;
        Object obj = xe.e.f22921c;
        w.g(jVar);
        w.g(kVar);
        i iVar = new i(jVar);
        i iVar2 = new i(kVar);
        String str = (String) cVar.f396v;
        Object obj2 = xe.e.f22921c;
        this.f419d = null;
        this.f424x = new Object();
        this.f425y = new Object();
        this.H = new ArrayList();
        this.J = 1;
        this.P = null;
        this.Q = false;
        this.R = null;
        this.S = new AtomicInteger(0);
        w.h(context, "Context must not be null");
        this.f421i = context;
        w.h(looper, "Looper must not be null");
        w.h(i0Var, "Supervisor must not be null");
        this.f422v = i0Var;
        this.f423w = new z(this, looper);
        this.M = i7;
        this.K = iVar;
        this.L = iVar2;
        this.N = str;
        Set set = (Set) cVar.f394e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.T = set;
    }

    @Override // ye.c
    public final Set a() {
        return k() ? this.T : Collections.EMPTY_SET;
    }

    @Override // ye.c
    public final void b(String str) {
        this.f419d = str;
        disconnect();
    }

    @Override // ye.c
    public final void c(b bVar) {
        this.F = bVar;
        u(2, null);
    }

    @Override // ye.c
    public final boolean d() {
        boolean z5;
        synchronized (this.f424x) {
            int i7 = this.J;
            z5 = true;
            if (i7 != 2 && i7 != 3) {
                z5 = false;
            }
        }
        return z5;
    }

    @Override // ye.c
    public final void disconnect() {
        this.S.incrementAndGet();
        ArrayList arrayList = this.H;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    u uVar = (u) arrayList.get(i7);
                    synchronized (uVar) {
                        uVar.f485a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f425y) {
            this.E = null;
        }
        u(1, null);
    }

    @Override // ye.c
    public final void e() {
        if (!isConnected() || this.f420e == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // ye.c
    public final void f(g gVar, Set set) {
        Bundle bundleN = n();
        String str = Build.VERSION.SDK_INT < 31 ? this.O : this.O;
        int i7 = this.M;
        int i10 = xe.f.f22923a;
        Scope[] scopeArr = e.L;
        Bundle bundle = new Bundle();
        xe.d[] dVarArr = e.M;
        e eVar = new e(6, i7, i10, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        eVar.f411v = this.f421i.getPackageName();
        eVar.f414y = bundleN;
        if (set != null) {
            eVar.f413x = (Scope[]) set.toArray(new Scope[0]);
        }
        if (k()) {
            eVar.E = new Account("<<default account>>", "com.google");
            if (gVar != null) {
                eVar.f412w = gVar.asBinder();
            }
        }
        eVar.F = U;
        eVar.G = m();
        if (s()) {
            eVar.J = true;
        }
        try {
            synchronized (this.f425y) {
                try {
                    v vVar = this.E;
                    if (vVar != null) {
                        vVar.j(new a0(this, this.S.get()), eVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i11 = this.S.get();
            z zVar = this.f423w;
            zVar.sendMessage(zVar.obtainMessage(6, i11, 3));
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i12 = this.S.get();
            c0 c0Var = new c0(this, 8, null, null);
            z zVar2 = this.f423w;
            zVar2.sendMessage(zVar2.obtainMessage(1, i12, -1, c0Var));
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i13 = this.S.get();
            c0 c0Var2 = new c0(this, 8, null, null);
            z zVar3 = this.f423w;
            zVar3.sendMessage(zVar3.obtainMessage(1, i13, -1, c0Var2));
        }
    }

    @Override // ye.c
    public abstract int g();

    @Override // ye.c
    public final xe.d[] h() {
        e0 e0Var = this.R;
        if (e0Var == null) {
            return null;
        }
        return e0Var.f416e;
    }

    @Override // ye.c
    public final void i(po.d dVar) {
        ((ze.m) dVar.f18079e).f23955r.K.post(new s9.a(4, dVar));
    }

    @Override // ye.c
    public final boolean isConnected() {
        boolean z5;
        synchronized (this.f424x) {
            z5 = this.J == 4;
        }
        return z5;
    }

    @Override // ye.c
    public final String j() {
        return this.f419d;
    }

    @Override // ye.c
    public boolean k() {
        return false;
    }

    public abstract IInterface l(IBinder iBinder);

    public xe.d[] m() {
        return U;
    }

    public Bundle n() {
        return new Bundle();
    }

    public final IInterface o() {
        IInterface iInterface;
        synchronized (this.f424x) {
            try {
                if (this.J == 5) {
                    throw new DeadObjectException();
                }
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.G;
                w.h(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    public abstract String p();

    public abstract String q();

    public boolean r() {
        return g() >= 211700000;
    }

    public boolean s() {
        return this instanceof ve.a;
    }

    public final /* synthetic */ boolean t(int i7, int i10, IInterface iInterface) {
        synchronized (this.f424x) {
            try {
                if (this.J != i7) {
                    return false;
                }
                u(i10, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void u(int i7, IInterface iInterface) {
        a3.n nVar;
        w.b((i7 == 4) == (iInterface != null));
        synchronized (this.f424x) {
            try {
                this.J = i7;
                this.G = iInterface;
                Bundle bundle = null;
                if (i7 == 1) {
                    b0 b0Var = this.I;
                    if (b0Var != null) {
                        i0 i0Var = this.f422v;
                        String str = this.f420e.f105a;
                        w.g(str);
                        this.f420e.getClass();
                        if (this.N == null) {
                            this.f421i.getClass();
                        }
                        i0Var.b(str, b0Var, this.f420e.f106b);
                        this.I = null;
                    }
                } else if (i7 == 2 || i7 == 3) {
                    b0 b0Var2 = this.I;
                    if (b0Var2 != null && (nVar = this.f420e) != null) {
                        String str2 = nVar.f105a;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(str2);
                        sb2.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb2.toString());
                        i0 i0Var2 = this.f422v;
                        String str3 = this.f420e.f105a;
                        w.g(str3);
                        this.f420e.getClass();
                        if (this.N == null) {
                            this.f421i.getClass();
                        }
                        i0Var2.b(str3, b0Var2, this.f420e.f106b);
                        this.S.incrementAndGet();
                    }
                    b0 b0Var3 = new b0(this, this.S.get());
                    this.I = b0Var3;
                    String strQ = q();
                    boolean zR = r();
                    this.f420e = new a3.n(strQ, zR);
                    if (zR && g() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f420e.f105a)));
                    }
                    i0 i0Var3 = this.f422v;
                    String str4 = this.f420e.f105a;
                    w.g(str4);
                    this.f420e.getClass();
                    String name = this.N;
                    if (name == null) {
                        name = this.f421i.getClass().getName();
                    }
                    xe.b bVarA = i0Var3.a(new f0(str4, this.f420e.f106b), b0Var3, name);
                    if (!(bVarA.f22910e == 0)) {
                        String str5 = this.f420e.f105a;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(str5);
                        sb3.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb3.toString());
                        int i10 = bVarA.f22910e;
                        if (i10 == -1) {
                            i10 = 16;
                        }
                        if (bVarA.f22911i != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", bVarA.f22911i);
                        }
                        int i11 = this.S.get();
                        d0 d0Var = new d0(this, i10, bundle);
                        z zVar = this.f423w;
                        zVar.sendMessage(zVar.obtainMessage(7, i11, -1, d0Var));
                    }
                } else if (i7 == 4) {
                    w.g(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
