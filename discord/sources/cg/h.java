package cg;

import a5.d0;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f3661n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f3663b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f3669h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d0 f3671l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public qh.d f3672m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f3665d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f3666e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3667f = new Object();
    public final d j = new d(0, this);
    public final AtomicInteger k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3664c = "AgeSignalsService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f3670i = new WeakReference(null);

    public h(Context context, b bVar, Intent intent) {
        this.f3662a = context;
        this.f3663b = bVar;
        this.f3669h = intent;
    }

    public static void b(h hVar, c cVar) {
        qh.d dVar = hVar.f3672m;
        ArrayList arrayList = hVar.f3665d;
        b bVar = hVar.f3663b;
        if (dVar != null || hVar.f3668g) {
            if (!hVar.f3668g) {
                cVar.run();
                return;
            } else {
                bVar.c("Waiting to bind to the service.", new Object[0]);
                arrayList.add(cVar);
                return;
            }
        }
        bVar.c("Initiate binding to the service.", new Object[0]);
        arrayList.add(cVar);
        d0 d0Var = new d0(hVar);
        hVar.f3671l = d0Var;
        hVar.f3668g = true;
        if (hVar.f3662a.bindService(hVar.f3669h, d0Var, 1)) {
            return;
        }
        bVar.c("Failed to bind to the service.", new Object[0]);
        hVar.f3668g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(new i("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f3661n;
        synchronized (map) {
            try {
                String str = this.f3664c;
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
        synchronized (this.f3667f) {
            this.f3666e.remove(gVar);
        }
        a().post(new f(this));
    }
}
