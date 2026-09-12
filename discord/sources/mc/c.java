package mc;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.source.LoadEventInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f15496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4.e f15497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ga.l f15498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f15500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f15501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final je.d f15502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o9.d f15503i;
    public final hc.c0 j;
    public final g0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final UUID f15504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Looper f15505m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bd.d f15506n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15507o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15508p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HandlerThread f15509q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f15510r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public lc.b f15511s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j f15512t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f15513u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f15514v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x f15515w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public y f15516x;

    public c(UUID uuid, z zVar, e4.e eVar, ga.l lVar, List list, boolean z5, boolean z6, byte[] bArr, HashMap map, e0 e0Var, Looper looper, o9.d dVar, hc.c0 c0Var) {
        this.f15504l = uuid;
        this.f15497c = eVar;
        this.f15498d = lVar;
        this.f15496b = zVar;
        this.f15499e = z5;
        this.f15500f = z6;
        if (bArr != null) {
            this.f15514v = bArr;
            this.f15495a = null;
        } else {
            list.getClass();
            this.f15495a = Collections.unmodifiableList(list);
        }
        this.f15501g = map;
        this.k = e0Var;
        this.f15502h = new je.d();
        this.f15503i = dVar;
        this.j = c0Var;
        this.f15507o = 2;
        this.f15505m = looper;
        this.f15506n = new bd.d(this, looper, 3);
    }

    @Override // mc.k
    public final UUID a() {
        m();
        return this.f15504l;
    }

    @Override // mc.k
    public final void b(n nVar) {
        m();
        if (this.f15508p < 0) {
            je.b.r("DefaultDrmSession", "Session reference count less than zero: " + this.f15508p);
            this.f15508p = 0;
        }
        if (nVar != null) {
            je.d dVar = this.f15502h;
            synchronized (dVar.f13777d) {
                try {
                    ArrayList arrayList = new ArrayList(dVar.f13780v);
                    arrayList.add(nVar);
                    dVar.f13780v = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) dVar.f13778e.get(nVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(dVar.f13779i);
                        hashSet.add(nVar);
                        dVar.f13779i = Collections.unmodifiableSet(hashSet);
                    }
                    dVar.f13778e.put(nVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        int i7 = this.f15508p + 1;
        this.f15508p = i7;
        if (i7 == 1) {
            je.b.k(this.f15507o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f15509q = handlerThread;
            handlerThread.start();
            this.f15510r = new a(this, this.f15509q.getLooper());
            if (k()) {
                g(true);
            }
        } else if (nVar != null && h() && this.f15502h.a(nVar) == 1) {
            nVar.c(this.f15507o);
        }
        f fVar = (f) this.f15498d.f9547e;
        if (fVar.f15537l != -9223372036854775807L) {
            fVar.f15540o.remove(this);
            Handler handler = fVar.f15546u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // mc.k
    public final boolean c() {
        m();
        return this.f15499e;
    }

    @Override // mc.k
    public final void d(n nVar) {
        m();
        int i7 = this.f15508p;
        if (i7 <= 0) {
            je.b.r("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i7 - 1;
        this.f15508p = i10;
        if (i10 == 0) {
            this.f15507o = 0;
            bd.d dVar = this.f15506n;
            int i11 = je.e0.f13788a;
            dVar.removeCallbacksAndMessages(null);
            a aVar = this.f15510r;
            synchronized (aVar) {
                aVar.removeCallbacksAndMessages(null);
                aVar.f15483a = true;
            }
            this.f15510r = null;
            this.f15509q.quit();
            this.f15509q = null;
            this.f15511s = null;
            this.f15512t = null;
            this.f15515w = null;
            this.f15516x = null;
            byte[] bArr = this.f15513u;
            if (bArr != null) {
                this.f15496b.o(bArr);
                this.f15513u = null;
            }
        }
        if (nVar != null) {
            je.d dVar2 = this.f15502h;
            synchronized (dVar2.f13777d) {
                try {
                    Integer num = (Integer) dVar2.f13778e.get(nVar);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(dVar2.f13780v);
                        arrayList.remove(nVar);
                        dVar2.f13780v = Collections.unmodifiableList(arrayList);
                        if (num.intValue() == 1) {
                            dVar2.f13778e.remove(nVar);
                            HashSet hashSet = new HashSet(dVar2.f13779i);
                            hashSet.remove(nVar);
                            dVar2.f13779i = Collections.unmodifiableSet(hashSet);
                        } else {
                            dVar2.f13778e.put(nVar, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f15502h.a(nVar) == 0) {
                nVar.e();
            }
        }
        ga.l lVar = this.f15498d;
        int i12 = this.f15508p;
        f fVar = (f) lVar.f9547e;
        if (i12 == 1 && fVar.f15541p > 0 && fVar.f15537l != -9223372036854775807L) {
            fVar.f15540o.add(this);
            Handler handler = fVar.f15546u;
            handler.getClass();
            handler.postAtTime(new io.sentry.android.core.p(23, this), this, SystemClock.uptimeMillis() + fVar.f15537l);
        } else if (i12 == 0) {
            fVar.f15538m.remove(this);
            if (fVar.f15543r == this) {
                fVar.f15543r = null;
            }
            if (fVar.f15544s == this) {
                fVar.f15544s = null;
            }
            e4.e eVar = fVar.f15536i;
            HashSet hashSet2 = (HashSet) eVar.f7971e;
            hashSet2.remove(this);
            if (((c) eVar.f7972i) == this) {
                eVar.f7972i = null;
                if (!hashSet2.isEmpty()) {
                    c cVar = (c) hashSet2.iterator().next();
                    eVar.f7972i = cVar;
                    y yVarE = cVar.f15496b.e();
                    cVar.f15516x = yVarE;
                    a aVar2 = cVar.f15510r;
                    int i13 = je.e0.f13788a;
                    yVarE.getClass();
                    aVar2.getClass();
                    aVar2.obtainMessage(0, new b(LoadEventInfo.f5695c.getAndIncrement(), true, SystemClock.elapsedRealtime(), yVarE)).sendToTarget();
                }
            }
            if (fVar.f15537l != -9223372036854775807L) {
                Handler handler2 = fVar.f15546u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                fVar.f15540o.remove(this);
            }
        }
        fVar.k();
    }

    @Override // mc.k
    public final boolean e(String str) {
        m();
        byte[] bArr = this.f15513u;
        je.b.l(bArr);
        return this.f15496b.m(bArr, str);
    }

    @Override // mc.k
    public final lc.b f() {
        m();
        return this.f15511s;
    }

    public final void g(boolean z5) {
        long jMin;
        long j;
        Set set;
        if (this.f15500f) {
            return;
        }
        byte[] bArr = this.f15513u;
        int i7 = je.e0.f13788a;
        byte[] bArr2 = this.f15514v;
        if (bArr2 == null) {
            l(bArr, 1, z5);
            return;
        }
        if (this.f15507o != 4) {
            try {
                this.f15496b.n(bArr, bArr2);
            } catch (Exception e10) {
                i(1, e10);
                return;
            }
        }
        if (gc.h.f9672d.equals(this.f15504l)) {
            m();
            byte[] bArr3 = this.f15513u;
            Pair pair = null;
            Map mapC = bArr3 == null ? null : this.f15496b.c(bArr3);
            if (mapC != null) {
                long j5 = -9223372036854775807L;
                try {
                    String str = (String) mapC.get("LicenseDurationRemaining");
                    j = str != null ? Long.parseLong(str) : -9223372036854775807L;
                } catch (NumberFormatException unused) {
                }
                Long lValueOf = Long.valueOf(j);
                try {
                    String str2 = (String) mapC.get("PlaybackDurationRemaining");
                    if (str2 != null) {
                        j5 = Long.parseLong(str2);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j5));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = LongCompanionObject.MAX_VALUE;
        }
        if (jMin <= 60) {
            je.b.q("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            l(bArr, 2, z5);
            return;
        }
        if (jMin <= 0) {
            i(2, new f0());
            return;
        }
        this.f15507o = 4;
        je.d dVar = this.f15502h;
        synchronized (dVar.f13777d) {
            set = dVar.f13779i;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((n) it.next()).b();
        }
    }

    @Override // mc.k
    public final j getError() {
        m();
        if (this.f15507o == 1) {
            return this.f15512t;
        }
        return null;
    }

    @Override // mc.k
    public final int getState() {
        m();
        return this.f15507o;
    }

    public final boolean h() {
        int i7 = this.f15507o;
        return i7 == 3 || i7 == 4;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    public final void i(int i7, Exception exc) {
        int iB;
        Set set;
        int i10 = je.e0.f13788a;
        if (i10 >= 21 && u.a(exc)) {
            iB = u.b(exc);
        } else if (i10 >= 23 && v.a(exc)) {
            iB = 6006;
        } else if (i10 >= 18 && t.b(exc)) {
            iB = 6002;
        } else if (i10 >= 18 && t.a(exc)) {
            iB = 6007;
        } else if (exc instanceof i0) {
            iB = 6001;
        } else if (exc instanceof d) {
            iB = 6003;
        } else if (exc instanceof f0) {
            iB = 6008;
        } else if (i7 == 1) {
            iB = 6006;
        } else if (i7 == 2) {
            iB = 6004;
        } else {
            if (i7 != 3) {
                throw new IllegalArgumentException();
            }
            iB = 6002;
        }
        this.f15512t = new j(iB, exc);
        je.b.s("DefaultDrmSession", "DRM session error", exc);
        je.d dVar = this.f15502h;
        synchronized (dVar.f13777d) {
            set = dVar.f13779i;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((n) it.next()).d(exc);
        }
        if (this.f15507o != 4) {
            this.f15507o = 1;
        }
    }

    public final void j(Exception exc, boolean z5) {
        if (!(exc instanceof NotProvisionedException)) {
            i(z5 ? 1 : 2, exc);
            return;
        }
        e4.e eVar = this.f15497c;
        ((HashSet) eVar.f7971e).add(this);
        if (((c) eVar.f7972i) != null) {
            return;
        }
        eVar.f7972i = this;
        y yVarE = this.f15496b.e();
        this.f15516x = yVarE;
        a aVar = this.f15510r;
        int i7 = je.e0.f13788a;
        yVarE.getClass();
        aVar.getClass();
        aVar.obtainMessage(0, new b(LoadEventInfo.f5695c.getAndIncrement(), true, SystemClock.elapsedRealtime(), yVarE)).sendToTarget();
    }

    public final boolean k() {
        Set set;
        if (h()) {
            return true;
        }
        try {
            byte[] bArrJ = this.f15496b.j();
            this.f15513u = bArrJ;
            this.f15496b.a(bArrJ, this.j);
            this.f15511s = this.f15496b.h(this.f15513u);
            this.f15507o = 3;
            je.d dVar = this.f15502h;
            synchronized (dVar.f13777d) {
                set = dVar.f13779i;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((n) it.next()).c(3);
            }
            this.f15513u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            e4.e eVar = this.f15497c;
            ((HashSet) eVar.f7971e).add(this);
            if (((c) eVar.f7972i) == null) {
                eVar.f7972i = this;
                y yVarE = this.f15496b.e();
                this.f15516x = yVarE;
                a aVar = this.f15510r;
                int i7 = je.e0.f13788a;
                yVarE.getClass();
                aVar.getClass();
                aVar.obtainMessage(0, new b(LoadEventInfo.f5695c.getAndIncrement(), true, SystemClock.elapsedRealtime(), yVarE)).sendToTarget();
            }
            return false;
        } catch (Exception e10) {
            i(1, e10);
            return false;
        }
    }

    public final void l(byte[] bArr, int i7, boolean z5) {
        try {
            x xVarR = this.f15496b.r(bArr, this.f15495a, i7, this.f15501g);
            this.f15515w = xVarR;
            a aVar = this.f15510r;
            int i10 = je.e0.f13788a;
            xVarR.getClass();
            aVar.getClass();
            aVar.obtainMessage(1, new b(LoadEventInfo.f5695c.getAndIncrement(), z5, SystemClock.elapsedRealtime(), xVarR)).sendToTarget();
        } catch (Exception e10) {
            j(e10, true);
        }
    }

    public final void m() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f15505m;
        if (threadCurrentThread != looper.getThread()) {
            je.b.O("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
