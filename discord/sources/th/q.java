package th;

import a5.d0;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import androidx.datastore.preferences.protobuf.d1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f20787n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a5.o f20789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20790c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f20795h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d0 f20797l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f20798m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f20791d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f20792e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f20793f = new Object();
    public final cg.d j = new cg.d(2, this);
    public final AtomicInteger k = new AtomicInteger(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f20796i = new WeakReference(null);

    public q(Context context, a5.o oVar, String str, Intent intent) {
        this.f20788a = context;
        this.f20789b = oVar;
        this.f20790c = str;
        this.f20795h = intent;
    }

    public static void b(q qVar, o oVar) {
        k kVar = qVar.f20798m;
        a5.o oVar2 = qVar.f20789b;
        ArrayList<o> arrayList = qVar.f20791d;
        if (kVar != null || qVar.f20794g) {
            if (!qVar.f20794g) {
                oVar.run();
                return;
            } else {
                oVar2.d("Waiting to bind to the service.", new Object[0]);
                arrayList.add(oVar);
                return;
            }
        }
        oVar2.d("Initiate binding to the service.", new Object[0]);
        arrayList.add(oVar);
        d0 d0Var = new d0(3, qVar);
        qVar.f20797l = d0Var;
        qVar.f20794g = true;
        if (qVar.f20788a.bindService(qVar.f20795h, d0Var, 1)) {
            return;
        }
        oVar2.d("Failed to bind to the service.", new Object[0]);
        qVar.f20794g = false;
        for (o oVar3 : arrayList) {
            d1 d1Var = new d1("Failed to bind to the service.");
            ig.g gVar = oVar3.f20784d;
            if (gVar != null) {
                gVar.c(d1Var);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f20787n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f20790c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f20790c, 10);
                    handlerThread.start();
                    map.put(this.f20790c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f20790c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(o oVar, ig.g gVar) {
        a().post(new sh.c(this, oVar.f20784d, gVar, oVar));
    }

    public final void d(ig.g gVar) {
        synchronized (this.f20793f) {
            this.f20792e.remove(gVar);
        }
        a().post(new p(0, this));
    }

    public final void e() {
        HashSet hashSet = this.f20792e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ig.g) it.next()).c(new RemoteException(String.valueOf(this.f20790c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
