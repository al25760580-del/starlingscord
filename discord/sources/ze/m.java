package ze;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.discord.jank_stats.JankRecordStore;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.play_billing.u0;
import io.sentry.h4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements ye.j, ye.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ye.c f23946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f23947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e4.c f23948i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f23949l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v f23950m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23951n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f23955r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedList f23945f = new LinkedList();
    public final HashSet j = new HashSet();
    public final HashMap k = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f23952o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public xe.b f23953p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f23954q = 0;

    public m(e eVar, ye.i iVar) {
        this.f23955r = eVar;
        Looper looper = eVar.K.getLooper();
        e4.m mVarA = iVar.a();
        af.c cVar = new af.c((String) mVarA.f7994i, (String) mVarA.f7995v, (s.f) mVarA.f7993e);
        zs.a aVar = (zs.a) iVar.f23303c.f7989e;
        af.w.g(aVar);
        ye.c cVarD = aVar.d(iVar.f23301a, looper, cVar, iVar.f23304d, this, this);
        String str = iVar.f23302b;
        if (str != null && (cVarD instanceof af.f)) {
            ((af.f) cVarD).O = str;
        }
        if (str != null && (cVarD instanceof h)) {
            a3.e.x(cVarD);
            throw null;
        }
        this.f23946g = cVarD;
        this.f23947h = iVar.f23305e;
        this.f23948i = new e4.c(26);
        this.f23949l = iVar.f23307g;
        if (!cVarD.k()) {
            this.f23950m = null;
            return;
        }
        Context context = eVar.f23934w;
        eg.a aVar2 = eVar.K;
        e4.m mVarA2 = iVar.a();
        this.f23950m = new v(context, aVar2, new af.c((String) mVarA2.f7994i, (String) mVarA2.f7995v, (s.f) mVarA2.f7993e));
    }

    public final void a(xe.b bVar) {
        HashSet hashSet = this.j;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (af.w.j(bVar, xe.b.f22908x)) {
                this.f23946g.e();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        af.w.c(this.f23955r.K);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z5) {
        af.w.c(this.f23955r.K);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f23945f.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            if (!z5 || zVar.f23984a == 2) {
                if (status != null) {
                    zVar.a(status);
                } else {
                    zVar.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f23945f;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            z zVar = (z) arrayList.get(i7);
            if (!this.f23946g.isConnected()) {
                return;
            }
            if (h(zVar)) {
                linkedList.remove(zVar);
            }
        }
    }

    public final void e() {
        e eVar = this.f23955r;
        af.w.c(eVar.K);
        this.f23953p = null;
        a(xe.b.f22908x);
        eg.a aVar = eVar.K;
        if (this.f23951n) {
            a aVar2 = this.f23947h;
            aVar.removeMessages(11, aVar2);
            aVar.removeMessages(9, aVar2);
            this.f23951n = false;
        }
        Iterator it = this.k.values().iterator();
        if (it.hasNext()) {
            throw s0.g.a(it);
        }
        d();
        g();
    }

    public final void f(int i7) {
        e eVar = this.f23955r;
        eg.a aVar = eVar.K;
        af.w.c(eVar.K);
        this.f23953p = null;
        this.f23951n = true;
        String strJ = this.f23946g.j();
        e4.c cVar = this.f23948i;
        cVar.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i7 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i7 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (strJ != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(strJ);
        }
        cVar.X(true, new Status(20, sb2.toString(), null, null));
        a aVar2 = this.f23947h;
        aVar.sendMessageDelayed(Message.obtain(aVar, 9, aVar2), JankRecordStore.FIRST_FLUSH_DELAY_MS);
        aVar.sendMessageDelayed(Message.obtain(aVar, 11, aVar2), 120000L);
        ((SparseIntArray) eVar.f23936y.f8034e).clear();
        Iterator it = this.k.values().iterator();
        if (it.hasNext()) {
            throw s0.g.a(it);
        }
    }

    public final void g() {
        e eVar = this.f23955r;
        eg.a aVar = eVar.K;
        a aVar2 = this.f23947h;
        aVar.removeMessages(12, aVar2);
        aVar.sendMessageDelayed(aVar.obtainMessage(12, aVar2), eVar.f23930d);
    }

    public final boolean h(z zVar) {
        xe.d dVar;
        if (!(zVar instanceof r)) {
            e4.c cVar = this.f23948i;
            ye.c cVar2 = this.f23946g;
            zVar.d(cVar, cVar2.k());
            try {
                zVar.c(this);
                return true;
            } catch (DeadObjectException unused) {
                k(1);
                cVar2.b("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        r rVar = (r) zVar;
        xe.d[] dVarArrG = rVar.g(this);
        if (dVarArrG == null || dVarArrG.length == 0) {
            dVar = null;
            break;
        }
        xe.d[] dVarArrH = this.f23946g.h();
        if (dVarArrH == null) {
            dVarArrH = new xe.d[0];
        }
        s.e eVar = new s.e(dVarArrH.length);
        for (xe.d dVar2 : dVarArrH) {
            eVar.put(dVar2.f22917d, Long.valueOf(dVar2.h()));
        }
        int length = dVarArrG.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                dVar = null;
                break;
            }
            dVar = dVarArrG[i7];
            Long l6 = (Long) eVar.get(dVar.f22917d);
            if (l6 == null || l6.longValue() < dVar.h()) {
                break;
            }
            i7++;
        }
        if (dVar == null) {
            e4.c cVar3 = this.f23948i;
            ye.c cVar4 = this.f23946g;
            zVar.d(cVar3, cVar4.k());
            try {
                zVar.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                k(1);
                cVar4.b("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.f23946g.getClass().getName() + " could not execute call because it requires feature (" + dVar.f22917d + ", " + dVar.h() + ").");
        if (!this.f23955r.L || !rVar.f(this)) {
            rVar.b(new ye.o(dVar));
            return true;
        }
        n nVar = new n(this.f23947h, dVar);
        int iIndexOf = this.f23952o.indexOf(nVar);
        if (iIndexOf >= 0) {
            n nVar2 = (n) this.f23952o.get(iIndexOf);
            this.f23955r.K.removeMessages(15, nVar2);
            eg.a aVar = this.f23955r.K;
            aVar.sendMessageDelayed(Message.obtain(aVar, 15, nVar2), JankRecordStore.FIRST_FLUSH_DELAY_MS);
        } else {
            this.f23952o.add(nVar);
            eg.a aVar2 = this.f23955r.K;
            aVar2.sendMessageDelayed(Message.obtain(aVar2, 15, nVar), JankRecordStore.FIRST_FLUSH_DELAY_MS);
            eg.a aVar3 = this.f23955r.K;
            aVar3.sendMessageDelayed(Message.obtain(aVar3, 16, nVar), 120000L);
            xe.b bVar = new xe.b(2, null, null);
            if (!i(bVar)) {
                this.f23955r.d(bVar, this.f23949l);
            }
        }
        return false;
    }

    public final boolean i(xe.b bVar) {
        AtomicReference atomicReference;
        synchronized (e.O) {
            try {
                e eVar = this.f23955r;
                if (eVar.H == null || !eVar.I.contains(this.f23947h)) {
                    return false;
                }
                k kVar = this.f23955r.H;
                int i7 = this.f23949l;
                kVar.getClass();
                a0 a0Var = new a0(bVar, i7);
                loop0: do {
                    atomicReference = kVar.f23939i;
                    do {
                        if (atomicReference.compareAndSet(null, a0Var)) {
                            kVar.f23940v.post(new u0(kVar, a0Var, 27, false));
                            break loop0;
                        }
                    } while (atomicReference.get() == null);
                } while (atomicReference.get() == null);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ye.k
    public final void j(xe.b bVar) {
        n(bVar, null);
    }

    @Override // ye.j
    public final void k(int i7) {
        Looper looperMyLooper = Looper.myLooper();
        eg.a aVar = this.f23955r.K;
        if (looperMyLooper == aVar.getLooper()) {
            f(i7);
        } else {
            aVar.post(new com.google.android.material.datepicker.g(i7, 5, this));
        }
    }

    public final void l() {
        e eVar = this.f23955r;
        af.w.c(eVar.K);
        ye.c cVar = this.f23946g;
        if (cVar.isConnected() || cVar.d()) {
            return;
        }
        try {
            e4.r rVar = eVar.f23936y;
            Context context = eVar.f23934w;
            SparseIntArray sparseIntArray = (SparseIntArray) rVar.f8034e;
            af.w.g(context);
            int iG = cVar.g();
            int iB = ((SparseIntArray) rVar.f8034e).get(iG, -1);
            if (iB == -1) {
                iB = 0;
                int i7 = 0;
                while (true) {
                    if (i7 >= sparseIntArray.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i7);
                    if (iKeyAt > iG && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (iB == -1) {
                    iB = ((xe.e) rVar.f8035i).b(context, iG);
                }
                sparseIntArray.put(iG, iB);
            }
            if (iB != 0) {
                xe.b bVar = new xe.b(iB, null, null);
                Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + bVar.toString());
                n(bVar, null);
                return;
            }
            h4 h4Var = new h4();
            h4Var.f12715f = eVar;
            h4Var.f12713d = null;
            h4Var.f12714e = null;
            h4Var.f12710a = false;
            h4Var.f12711b = cVar;
            h4Var.f12712c = this.f23947h;
            if (cVar.k()) {
                v vVar = this.f23950m;
                af.w.g(vVar);
                Handler handler = vVar.f23975h;
                af.c cVar2 = vVar.k;
                gg.a aVar = vVar.f23977l;
                if (aVar != null) {
                    aVar.disconnect();
                }
                cVar2.f398x = Integer.valueOf(System.identityHashCode(vVar));
                vVar.f23977l = (gg.a) vVar.f23976i.d(vVar.f23974g, handler.getLooper(), cVar2, (fg.a) cVar2.f397w, vVar, vVar);
                vVar.f23978m = h4Var;
                Set set = vVar.j;
                if (set == null || set.isEmpty()) {
                    handler.post(new s9.a(5, vVar));
                } else {
                    gg.a aVar2 = vVar.f23977l;
                    aVar2.getClass();
                    aVar2.c(new af.i(aVar2));
                }
            }
            try {
                cVar.c(h4Var);
            } catch (SecurityException e10) {
                n(new xe.b(10, null, null), e10);
            }
        } catch (IllegalStateException e11) {
            n(new xe.b(10, null, null), e11);
        }
    }

    public final void m(z zVar) {
        af.w.c(this.f23955r.K);
        boolean zIsConnected = this.f23946g.isConnected();
        LinkedList linkedList = this.f23945f;
        if (zIsConnected) {
            if (h(zVar)) {
                g();
                return;
            } else {
                linkedList.add(zVar);
                return;
            }
        }
        linkedList.add(zVar);
        xe.b bVar = this.f23953p;
        if (bVar == null || bVar.f22910e == 0 || bVar.f22911i == null) {
            l();
        } else {
            n(bVar, null);
        }
    }

    public final void n(xe.b bVar, RuntimeException runtimeException) {
        gg.a aVar;
        af.w.c(this.f23955r.K);
        v vVar = this.f23950m;
        if (vVar != null && (aVar = vVar.f23977l) != null) {
            aVar.disconnect();
        }
        af.w.c(this.f23955r.K);
        this.f23953p = null;
        ((SparseIntArray) this.f23955r.f23936y.f8034e).clear();
        a(bVar);
        if ((this.f23946g instanceof cf.c) && bVar.f22910e != 24) {
            e eVar = this.f23955r;
            eVar.f23931e = true;
            eg.a aVar2 = eVar.K;
            aVar2.sendMessageDelayed(aVar2.obtainMessage(19), LogThrottleSingleton.RATE_LIMIT_FIVE_MINUTES);
        }
        if (bVar.f22910e == 4) {
            b(e.N);
            return;
        }
        if (this.f23945f.isEmpty()) {
            this.f23953p = bVar;
            return;
        }
        if (runtimeException != null) {
            af.w.c(this.f23955r.K);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f23955r.L) {
            b(e.e(this.f23947h, bVar));
            return;
        }
        c(e.e(this.f23947h, bVar), null, true);
        if (this.f23945f.isEmpty() || i(bVar) || this.f23955r.d(bVar, this.f23949l)) {
            return;
        }
        if (bVar.f22910e == 18) {
            this.f23951n = true;
        }
        if (!this.f23951n) {
            b(e.e(this.f23947h, bVar));
            return;
        }
        e eVar2 = this.f23955r;
        a aVar3 = this.f23947h;
        eg.a aVar4 = eVar2.K;
        aVar4.sendMessageDelayed(Message.obtain(aVar4, 9, aVar3), JankRecordStore.FIRST_FLUSH_DELAY_MS);
    }

    public final void o(xe.b bVar) {
        af.w.c(this.f23955r.K);
        ye.c cVar = this.f23946g;
        cVar.b("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(bVar));
        n(bVar, null);
    }

    @Override // ye.j
    public final void onConnected() {
        Looper looperMyLooper = Looper.myLooper();
        eg.a aVar = this.f23955r.K;
        if (looperMyLooper == aVar.getLooper()) {
            e();
        } else {
            aVar.post(new s9.a(3, this));
        }
    }

    public final void p() {
        af.w.c(this.f23955r.K);
        Status status = e.M;
        b(status);
        this.f23948i.X(false, status);
        for (g gVar : (g[]) this.k.keySet().toArray(new g[0])) {
            m(new y(new ig.g()));
        }
        a(new xe.b(4, null, null));
        ye.c cVar = this.f23946g;
        if (cVar.isConnected()) {
            cVar.i(new po.d(9, this));
        }
    }
}
