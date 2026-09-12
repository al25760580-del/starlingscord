package j8;

import ag.t;
import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.cache.common.CacheKey;
import e4.m;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f13686m = TimeUnit.HOURS.toMillis(2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f13687n = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f13691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s8.a f13693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f13694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q8.c f13695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i8.b f13696i;
    public final bd.i j;
    public final u8.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f13697l = new Object();

    public g(h hVar, q8.c cVar, f fVar, i8.c cVar2, i8.b bVar, ExecutorService executorService) {
        s8.a aVar;
        this.f13688a = fVar.f13684a;
        long j = fVar.f13685b;
        this.f13689b = j;
        this.f13690c = j;
        s8.a aVar2 = s8.a.f19795h;
        synchronized (s8.a.class) {
            try {
                if (s8.a.f19795h == null) {
                    s8.a.f19795h = new s8.a();
                }
                aVar = s8.a.f19795h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f13693f = aVar;
        this.f13694g = hVar;
        this.f13695h = cVar;
        this.f13692e = -1L;
        this.f13696i = bVar;
        bd.i iVar = new bd.i();
        iVar.f3163a = false;
        iVar.f3164b = -1L;
        iVar.f3165c = -1L;
        this.j = iVar;
        this.k = u8.c.f20951a;
        this.f13691d = new HashSet();
        new CountDownLatch(0);
    }

    public final void a() {
        synchronized (this.f13697l) {
            try {
                this.f13694g.e();
                this.f13691d.clear();
            } catch (IOException | NullPointerException e10) {
                i8.b bVar = this.f13696i;
                e10.getMessage();
                bVar.getClass();
            }
            bd.i iVar = this.j;
            synchronized (iVar) {
                iVar.f3163a = false;
                iVar.f3165c = -1L;
                iVar.f3164b = -1L;
            }
        }
    }

    public final void b(long j) throws IOException {
        h hVar = this.f13694g;
        try {
            ArrayList<a> arrayListD = d(hVar.c());
            bd.i iVar = this.j;
            long jA = iVar.a() - j;
            int i7 = 0;
            long j5 = 0;
            for (a aVar : arrayListD) {
                if (j5 > jA) {
                    break;
                }
                long jD = hVar.d(aVar);
                this.f13691d.remove(aVar.f13666a);
                if (jD > 0) {
                    i7++;
                    j5 += jD;
                    j.b().d();
                }
            }
            iVar.b(-j5, -i7);
            hVar.b();
        } catch (IOException e10) {
            e10.getMessage();
            this.f13696i.getClass();
            throw e10;
        }
    }

    public final h8.a c(CacheKey cacheKey) {
        h8.a aVarA;
        j jVarB = j.b();
        jVarB.f13707e = cacheKey;
        try {
            try {
                synchronized (this.f13697l) {
                    try {
                        ArrayList arrayListA = zs.a.A(cacheKey);
                        String str = null;
                        aVarA = null;
                        for (int i7 = 0; i7 < arrayListA.size() && (aVarA = this.f13694g.a(cacheKey, (str = (String) arrayListA.get(i7)))) == null; i7++) {
                        }
                        if (aVarA == null) {
                            this.f13691d.remove(str);
                        } else {
                            str.getClass();
                            this.f13691d.add(str);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                jVarB.d();
                return aVarA;
            } catch (IOException unused) {
                this.f13696i.getClass();
                jVarB.d();
                return null;
            }
        } catch (Throwable th3) {
            jVarB.d();
            throw th3;
        }
    }

    public final ArrayList d(Collection collection) {
        this.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() + f13686m;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.a() > jCurrentTimeMillis) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        this.f13695h.getClass();
        Collections.sort(arrayList2, new t(5));
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final boolean e(CacheKey cacheKey) {
        synchronized (this.f13697l) {
            if (f(cacheKey)) {
                return true;
            }
            try {
                ArrayList arrayListA = zs.a.A(cacheKey);
                for (int i7 = 0; i7 < arrayListA.size(); i7++) {
                    String str = (String) arrayListA.get(i7);
                    if (this.f13694g.g(cacheKey, str)) {
                        this.f13691d.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public final boolean f(CacheKey cacheKey) {
        synchronized (this.f13697l) {
            try {
                ArrayList arrayListA = zs.a.A(cacheKey);
                for (int i7 = 0; i7 < arrayListA.size(); i7++) {
                    if (this.f13691d.contains((String) arrayListA.get(i7))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final h8.a g(CacheKey cacheKey, bc.i iVar) {
        String strS;
        h8.a aVarT;
        j jVarB = j.b();
        jVarB.f13707e = cacheKey;
        synchronized (this.f13697l) {
            strS = zs.a.s(cacheKey);
            try {
            } catch (Throwable th2) {
                jVarB.d();
                throw th2;
            }
        }
        try {
            m mVarJ = j(strS, cacheKey);
            boolean z5 = true;
            try {
                mVarJ.N(iVar);
                synchronized (this.f13697l) {
                    aVarT = mVarJ.t();
                    this.f13691d.add(strS);
                    this.j.b(aVarT.f10388a.length(), 1L);
                }
                aVarT.f10388a.length();
                this.j.a();
                File file = (File) mVarJ.f7994i;
                if (file.exists() && !file.delete()) {
                    z5 = false;
                }
                if (!z5) {
                    o8.a.d(g.class, "Failed to delete temp file");
                }
                jVarB.d();
                return aVarT;
            } catch (Throwable th3) {
                File file2 = (File) mVarJ.f7994i;
                if (file2.exists() && !file2.delete()) {
                    z5 = false;
                }
                if (!z5) {
                    o8.a.d(g.class, "Failed to delete temp file");
                }
                throw th3;
            }
        } catch (IOException e10) {
            o8.a.e(g.class, "Failed inserting a file into the cache", e10);
            throw e10;
        }
    }

    public final boolean h() {
        boolean z5;
        boolean z6;
        long j;
        this.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        bd.i iVar = this.j;
        synchronized (iVar) {
            z5 = iVar.f3163a;
        }
        boolean z7 = false;
        long jMax = -1;
        if (z5) {
            long j5 = this.f13692e;
            if (j5 != -1 && jCurrentTimeMillis - j5 <= f13687n) {
                return false;
            }
        }
        this.k.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j7 = f13686m + jCurrentTimeMillis2;
        try {
            Iterator it = this.f13694g.c().iterator();
            boolean z10 = false;
            int i7 = 0;
            long j10 = 0;
            while (true) {
                z6 = z7;
                if (!it.hasNext()) {
                    break;
                }
                try {
                    a aVar = (a) it.next();
                    i7++;
                    if (aVar.f13668c < 0) {
                        aVar.f13668c = aVar.f13667b.f10388a.length();
                    }
                    j10 += aVar.f13668c;
                    if (aVar.a() > j7) {
                        if (aVar.f13668c < 0) {
                            aVar.f13668c = aVar.f13667b.f10388a.length();
                        }
                        jMax = Math.max(aVar.a() - jCurrentTimeMillis2, jMax);
                        z10 = true;
                    }
                    z7 = z6;
                } catch (IOException e10) {
                    e = e10;
                }
                e = e10;
                i8.b bVar = this.f13696i;
                e.getMessage();
                bVar.getClass();
                return z6;
            }
            if (z10) {
                this.f13696i.getClass();
            }
            bd.i iVar2 = this.j;
            synchronized (iVar2) {
                j = iVar2.f3165c;
            }
            long j11 = i7;
            if (j != j11 || this.j.a() != j10) {
                bd.i iVar3 = this.j;
                synchronized (iVar3) {
                    iVar3.f3165c = j11;
                    iVar3.f3164b = j10;
                    iVar3.f3163a = true;
                }
            }
            this.f13692e = jCurrentTimeMillis2;
            return true;
        } catch (IOException e11) {
            e = e11;
            z6 = z7;
        }
    }

    public final void i(CacheKey cacheKey) {
        synchronized (this.f13697l) {
            try {
                ArrayList arrayListA = zs.a.A(cacheKey);
                for (int i7 = 0; i7 < arrayListA.size(); i7++) {
                    String str = (String) arrayListA.get(i7);
                    this.f13694g.remove(str);
                    this.f13691d.remove(str);
                }
            } catch (IOException e10) {
                i8.b bVar = this.f13696i;
                e10.getMessage();
                bVar.getClass();
            }
        }
    }

    public final m j(String str, CacheKey cacheKey) {
        synchronized (this.f13697l) {
            boolean zH = h();
            k();
            long jA = this.j.a();
            if (jA > this.f13690c && !zH) {
                bd.i iVar = this.j;
                synchronized (iVar) {
                    iVar.f3163a = false;
                    iVar.f3165c = -1L;
                    iVar.f3164b = -1L;
                }
                h();
            }
            long j = this.f13690c;
            if (jA > j) {
                b((j * 9) / 10);
            }
        }
        return this.f13694g.f(cacheKey, str);
    }

    public final void k() {
        long availableBlocksLong;
        char c8 = this.f13694g.isExternal() ? (char) 2 : (char) 1;
        s8.a aVar = this.f13693f;
        long jA = this.f13689b - this.j.a();
        aVar.a();
        aVar.a();
        ReentrantLock reentrantLock = aVar.f19802f;
        if (reentrantLock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - aVar.f19801e > s8.a.f19796i) {
                    aVar.f19797a = s8.a.b(aVar.f19797a, aVar.f19798b);
                    aVar.f19799c = s8.a.b(aVar.f19799c, aVar.f19800d);
                    aVar.f19801e = SystemClock.uptimeMillis();
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        StatFs statFs = c8 == 1 ? aVar.f19797a : aVar.f19799c;
        if (statFs != null) {
            availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } else {
            availableBlocksLong = 0;
        }
        if (availableBlocksLong <= 0 || availableBlocksLong < jA) {
            this.f13690c = this.f13688a;
        } else {
            this.f13690c = this.f13689b;
        }
    }
}
