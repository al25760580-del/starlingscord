package ci;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f3684o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f3686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3687c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f3692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e0 f3693i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a5.d0 f3695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IInterface f3696n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f3688d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f3689e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3690f = new Object();
    public final cg.d k = new cg.d(1, this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f3694l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    public d(Context context, b0 b0Var, String str, Intent intent, e0 e0Var) {
        this.f3685a = context;
        this.f3686b = b0Var;
        this.f3687c = str;
        this.f3692h = intent;
        this.f3693i = e0Var;
    }

    public static void b(d dVar, c0 c0Var) {
        IInterface iInterface = dVar.f3696n;
        ArrayList arrayList = dVar.f3688d;
        b0 b0Var = dVar.f3686b;
        if (iInterface != null || dVar.f3691g) {
            if (!dVar.f3691g) {
                c0Var.run();
                return;
            } else {
                b0Var.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(c0Var);
                return;
            }
        }
        b0Var.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(c0Var);
        a5.d0 d0Var = new a5.d0(dVar);
        dVar.f3695m = d0Var;
        dVar.f3691g = true;
        if (dVar.f3685a.bindService(dVar.f3692h, d0Var, 1)) {
            return;
        }
        b0Var.b("Failed to bind to the service.", new Object[0]);
        dVar.f3691g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c0) it.next()).a(new e("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f3684o;
        synchronized (map) {
            try {
                String str = this.f3687c;
                if (!map.containsKey(str)) {
                    HandlerThread handlerThread = new HandlerThread(str, 10);
                    handlerThread.start();
                    map.put(str, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(ig.g gVar) {
        synchronized (this.f3690f) {
            this.f3689e.remove(gVar);
        }
        a().post(new c(this));
    }
}
