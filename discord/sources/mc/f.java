package mc;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import com.google.android.exoplayer2.Format;
import ei.e1;
import ei.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f15529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f15530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f15531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f15532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f15533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f15534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f15535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e4.e f15536i;
    public final o9.d j;
    public final ga.l k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f15537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f15538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f15539n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set f15540o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z f15542q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f15543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f15544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Looper f15545t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Handler f15546u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f15547v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hc.c0 f15548w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile bd.d f15549x;

    public f(UUID uuid, e0 e0Var, HashMap map, boolean z5, int[] iArr, boolean z6, o9.d dVar) {
        uuid.getClass();
        je.b.f("Use C.CLEARKEY_UUID instead", !gc.h.f9670b.equals(uuid));
        this.f15529b = uuid;
        this.f15530c = d0.f15517v;
        this.f15531d = e0Var;
        this.f15532e = map;
        this.f15533f = z5;
        this.f15534g = iArr;
        this.f15535h = z6;
        this.j = dVar;
        this.f15536i = new e4.e(14, (byte) 0);
        this.k = new ga.l(23, this);
        this.f15538m = new ArrayList();
        this.f15539n = Collections.newSetFromMap(new IdentityHashMap());
        this.f15540o = Collections.newSetFromMap(new IdentityHashMap());
        this.f15537l = LogThrottleSingleton.RATE_LIMIT_FIVE_MINUTES;
    }

    public static boolean g(c cVar) {
        cVar.m();
        if (cVar.f15507o != 1) {
            return false;
        }
        if (je.e0.f13788a >= 19) {
            j error = cVar.getError();
            error.getClass();
            if (!(error.getCause() instanceof ResourceBusyException)) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList j(i iVar, UUID uuid, boolean z5) {
        ArrayList arrayList = new ArrayList(iVar.f15561v);
        for (int i7 = 0; i7 < iVar.f15561v; i7++) {
            h hVar = iVar.f15558d[i7];
            if ((hVar.a(uuid) || (gc.h.f9671c.equals(uuid) && hVar.a(gc.h.f9670b))) && (hVar.f15557w != null || z5)) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    @Override // mc.s
    public final void a() {
        z bVar;
        l(true);
        int i7 = this.f15541p;
        this.f15541p = i7 + 1;
        if (i7 != 0) {
            return;
        }
        if (this.f15542q == null) {
            UUID uuid = this.f15529b;
            this.f15530c.getClass();
            try {
                try {
                    bVar = new d0(uuid);
                } catch (i0 unused) {
                    je.b.r("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    bVar = new i8.b(12);
                }
                this.f15542q = bVar;
                bVar.f(new fj.c(26, this));
                return;
            } catch (UnsupportedSchemeException e10) {
                throw new i0(e10);
            } catch (Exception e11) {
                throw new i0(e11);
            }
        }
        if (this.f15537l == -9223372036854775807L) {
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f15538m;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((c) arrayList.get(i10)).b(null);
            i10++;
        }
    }

    @Override // mc.s
    public final int b(Format format) {
        l(false);
        z zVar = this.f15542q;
        zVar.getClass();
        int iS = zVar.s();
        i iVar = format.L;
        if (iVar == null) {
            int iH = je.o.h(format.I);
            int i7 = 0;
            while (true) {
                int[] iArr = this.f15534g;
                if (i7 >= iArr.length) {
                    i7 = -1;
                    break;
                }
                if (iArr[i7] == iH) {
                    break;
                }
                i7++;
            }
            if (i7 == -1) {
                return 0;
            }
        } else if (this.f15547v == null) {
            UUID uuid = this.f15529b;
            if (j(iVar, uuid, true).isEmpty()) {
                if (iVar.f15561v == 1 && iVar.f15558d[0].a(gc.h.f9670b)) {
                    je.b.N("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = iVar.f15560i;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : je.e0.f13788a < 25)) {
                return 1;
            }
        }
        return iS;
    }

    @Override // mc.s
    public final k c(n nVar, Format format) {
        l(false);
        je.b.k(this.f15541p > 0);
        je.b.l(this.f15545t);
        return f(this.f15545t, nVar, format, true);
    }

    @Override // mc.s
    public final r d(n nVar, Format format) {
        je.b.k(this.f15541p > 0);
        je.b.l(this.f15545t);
        e eVar = new e(this, nVar);
        Handler handler = this.f15546u;
        handler.getClass();
        handler.post(new io.sentry.react.d(7, eVar, format));
        return eVar;
    }

    @Override // mc.s
    public final void e(Looper looper, hc.c0 c0Var) {
        synchronized (this) {
            try {
                Looper looper2 = this.f15545t;
                if (looper2 == null) {
                    this.f15545t = looper;
                    this.f15546u = new Handler(looper);
                } else {
                    je.b.k(looper2 == looper);
                    this.f15546u.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f15548w = c0Var;
    }

    public final k f(Looper looper, n nVar, Format format, boolean z5) {
        ArrayList arrayListJ;
        if (this.f15549x == null) {
            this.f15549x = new bd.d(this, looper, 4);
        }
        i iVar = format.L;
        int i7 = 0;
        c cVar = null;
        if (iVar == null) {
            int iH = je.o.h(format.I);
            z zVar = this.f15542q;
            zVar.getClass();
            if (zVar.s() != 2 || !a0.f15485d) {
                int[] iArr = this.f15534g;
                while (true) {
                    if (i7 >= iArr.length) {
                        i7 = -1;
                        break;
                    }
                    if (iArr[i7] == iH) {
                        break;
                    }
                    i7++;
                }
                if (i7 != -1 && zVar.s() != 1) {
                    c cVar2 = this.f15543r;
                    if (cVar2 == null) {
                        ei.c0 c0Var = ei.e0.f8303e;
                        c cVarI = i(r0.f8352w, true, null, z5);
                        this.f15538m.add(cVarI);
                        this.f15543r = cVarI;
                    } else {
                        cVar2.b(null);
                    }
                    return this.f15543r;
                }
            }
            return null;
        }
        if (this.f15547v == null) {
            arrayListJ = j(iVar, this.f15529b, false);
            if (arrayListJ.isEmpty()) {
                d dVar = new d("Media does not support uuid: " + this.f15529b);
                je.b.s("DefaultDrmSessionMgr", "DRM error", dVar);
                if (nVar != null) {
                    nVar.d(dVar);
                }
                return new w(new j(6003, dVar));
            }
        } else {
            arrayListJ = null;
        }
        if (this.f15533f) {
            for (c cVar3 : this.f15538m) {
                if (je.e0.a(cVar3.f15495a, arrayListJ)) {
                    cVar = cVar3;
                    break;
                }
            }
        } else {
            cVar = this.f15544s;
        }
        if (cVar != null) {
            cVar.b(nVar);
            return cVar;
        }
        c cVarI2 = i(arrayListJ, false, nVar, z5);
        if (!this.f15533f) {
            this.f15544s = cVarI2;
        }
        this.f15538m.add(cVarI2);
        return cVarI2;
    }

    public final c h(List list, boolean z5, n nVar) {
        this.f15542q.getClass();
        boolean z6 = this.f15535h | z5;
        z zVar = this.f15542q;
        byte[] bArr = this.f15547v;
        Looper looper = this.f15545t;
        looper.getClass();
        hc.c0 c0Var = this.f15548w;
        c0Var.getClass();
        c cVar = new c(this.f15529b, zVar, this.f15536i, this.k, list, z6, z5, bArr, this.f15532e, this.f15531d, looper, this.j, c0Var);
        cVar.b(nVar);
        if (this.f15537l != -9223372036854775807L) {
            cVar.b(null);
        }
        return cVar;
    }

    public final c i(List list, boolean z5, n nVar, boolean z6) {
        c cVarH = h(list, z5, nVar);
        boolean zG = g(cVarH);
        long j = this.f15537l;
        Set set = this.f15540o;
        if (zG && !set.isEmpty()) {
            e1 it = ei.h0.m(set).iterator();
            while (it.hasNext()) {
                ((k) it.next()).d(null);
            }
            cVarH.d(nVar);
            if (j != -9223372036854775807L) {
                cVarH.d(null);
            }
            cVarH = h(list, z5, nVar);
        }
        if (g(cVarH) && z6) {
            Set set2 = this.f15539n;
            if (!set2.isEmpty()) {
                e1 it2 = ei.h0.m(set2).iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    e1 it3 = ei.h0.m(set).iterator();
                    while (it3.hasNext()) {
                        ((k) it3.next()).d(null);
                    }
                }
                cVarH.d(nVar);
                if (j != -9223372036854775807L) {
                    cVarH.d(null);
                }
                return h(list, z5, nVar);
            }
        }
        return cVarH;
    }

    public final void k() {
        if (this.f15542q != null && this.f15541p == 0 && this.f15538m.isEmpty() && this.f15539n.isEmpty()) {
            z zVar = this.f15542q;
            zVar.getClass();
            zVar.release();
            this.f15542q = null;
        }
    }

    public final void l(boolean z5) {
        if (z5 && this.f15545t == null) {
            je.b.O("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f15545t;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            je.b.O("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f15545t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // mc.s
    public final void release() {
        l(true);
        int i7 = this.f15541p - 1;
        this.f15541p = i7;
        if (i7 != 0) {
            return;
        }
        if (this.f15537l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f15538m);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((c) arrayList.get(i10)).d(null);
            }
        }
        e1 it = ei.h0.m(this.f15539n).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
        k();
    }
}
