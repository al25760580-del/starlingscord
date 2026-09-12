package we;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import e4.l;
import hi.o;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements ServiceConnection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22206d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Messenger f22207e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l f22208i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayDeque f22209v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SparseArray f22210w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f22211x;

    public i(k kVar) {
        this.f22211x = kVar;
        eg.a aVar = new eg.a(Looper.getMainLooper(), new mh.e(1, this));
        Looper.getMainLooper();
        this.f22207e = new Messenger(aVar);
        this.f22209v = new ArrayDeque();
        this.f22210w = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i7 = this.f22206d;
            if (i7 == 0) {
                throw new IllegalStateException();
            }
            if (i7 != 1 && i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                this.f22206d = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f22206d = 4;
            ef.a.a().b((Context) this.f22211x.f22220c, this);
            ag.b bVar = new ag.b(8, str, securityException);
            Iterator it = this.f22209v.iterator();
            while (it.hasNext()) {
                ((j) it.next()).b(bVar);
            }
            this.f22209v.clear();
            for (int i10 = 0; i10 < this.f22210w.size(); i10++) {
                ((j) this.f22210w.valueAt(i10)).b(bVar);
            }
            this.f22210w.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f22206d == 2 && this.f22209v.isEmpty() && this.f22210w.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f22206d = 3;
                ef.a.a().b((Context) this.f22211x.f22220c, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean d(j jVar) throws Throwable {
        Throwable th2;
        try {
            try {
                int i7 = this.f22206d;
                try {
                    if (i7 != 0) {
                        if (i7 == 1) {
                            this.f22209v.add(jVar);
                            return true;
                        }
                        if (i7 != 2) {
                            return false;
                        }
                        this.f22209v.add(jVar);
                        ((ScheduledExecutorService) this.f22211x.f22221d).execute(new h(this, 0));
                        return true;
                    }
                    this.f22209v.add(jVar);
                    if (this.f22206d != 0) {
                        throw new IllegalStateException();
                    }
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                    }
                    this.f22206d = 1;
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    try {
                        ef.a aVarA = ef.a.a();
                        Context context = (Context) this.f22211x.f22220c;
                        try {
                            if (aVarA.c(context, context.getClass().getName(), intent, this, 1, null)) {
                                ((ScheduledExecutorService) this.f22211x.f22221d).schedule(new h(this, 1), 30L, TimeUnit.SECONDS);
                            } else {
                                a("Unable to bind to service");
                            }
                        } catch (SecurityException e10) {
                            e = e10;
                            b("Unable to bind to service", e);
                        }
                    } catch (SecurityException e11) {
                        e = e11;
                    }
                    return true;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        throw th2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f22211x.f22221d).execute(new o(22, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f22211x.f22221d).execute(new h(this, 2));
    }
}
