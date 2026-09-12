package com.google.android.exoplayer2.upstream.cache;

import a3.e;
import af.c;
import ag.a1;
import android.database.SQLException;
import android.os.ConditionVariable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import ei.e1;
import ei.h0;
import ie.a;
import ie.b;
import ie.f;
import ie.g;
import ie.i;
import ie.j;
import ie.k;
import ie.l;
import ie.m;
import ie.o;
import ie.q;
import ie.s;
import ie.t;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class SimpleCache implements b {
    public static final HashSet j = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f5839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f5840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f5841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f5842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f5843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Random f5844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f5847i;

    public SimpleCache(File file, q qVar, kc.a aVar) {
        boolean zAdd;
        c cVar = new c();
        cVar.f393d = new HashMap();
        cVar.f394e = new SparseArray();
        cVar.f395i = new SparseBooleanArray();
        cVar.f396v = new SparseBooleanArray();
        l lVar = new l(aVar);
        r9.a aVar2 = new r9.a(new File(file, "cached_content_index.exi"));
        cVar.f397w = lVar;
        cVar.f398x = aVar2;
        g gVar = new g(aVar);
        synchronized (SimpleCache.class) {
            zAdd = j.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f5839a = file;
        this.f5840b = qVar;
        this.f5841c = cVar;
        this.f5842d = gVar;
        this.f5843e = new HashMap();
        this.f5844f = new Random();
        this.f5845g = true;
        this.f5846h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new s(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void a(SimpleCache simpleCache) {
        long j5;
        g gVar = simpleCache.f5842d;
        c cVar = simpleCache.f5841c;
        File file = simpleCache.f5839a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (a e10) {
                simpleCache.f5847i = e10;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            je.b.r("SimpleCache", str);
            simpleCache.f5847i = new a(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                j5 = -1;
                break;
            }
            File file2 = fileArrListFiles[i7];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j5 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    je.b.r("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i7++;
        }
        simpleCache.f5846h = j5;
        if (j5 == -1) {
            try {
                simpleCache.f5846h = f(file);
            } catch (IOException e11) {
                String str2 = "Failed to create cache UID: " + file;
                je.b.s("SimpleCache", str2, e11);
                simpleCache.f5847i = new a(str2, e11);
                return;
            }
        }
        try {
            cVar.D(simpleCache.f5846h);
            if (gVar != null) {
                gVar.c(simpleCache.f5846h);
                HashMap mapB = gVar.b();
                simpleCache.i(file, true, fileArrListFiles, mapB);
                gVar.d(mapB.keySet());
            } else {
                simpleCache.i(file, true, fileArrListFiles, null);
            }
            e1 it = h0.m(((HashMap) cVar.f393d).keySet()).iterator();
            while (it.hasNext()) {
                cVar.K((String) it.next());
            }
            try {
                cVar.O();
            } catch (IOException e12) {
                je.b.s("SimpleCache", "Storing index file failed", e12);
            }
        } catch (IOException e13) {
            String str3 = "Failed to initialize cache indices: " + file;
            je.b.s("SimpleCache", str3, e13);
            simpleCache.f5847i = new a(str3, e13);
        }
    }

    public static void e(File file) throws a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        je.b.r("SimpleCache", str);
        throw new a(str);
    }

    public static long f(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, kk.b.j(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public final void b(t tVar) {
        String str = tVar.f11736d;
        this.f5841c.A(str).f11746c.add(tVar);
        ArrayList arrayList = (ArrayList) this.f5843e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((q) arrayList.get(size)).b(this, tVar);
            }
        }
        this.f5840b.b(this, tVar);
    }

    public final synchronized void c(String str, g gVar) {
        d();
        c cVar = this.f5841c;
        k kVarA = cVar.A(str);
        o oVar = kVarA.f11748e;
        o oVarB = oVar.b(gVar);
        kVarA.f11748e = oVarB;
        if (!oVarB.equals(oVar)) {
            ((m) cVar.f397w).c(kVarA);
        }
        try {
            this.f5841c.O();
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    public final synchronized void d() {
        a aVar = this.f5847i;
        if (aVar != null) {
            throw aVar;
        }
    }

    public final synchronized o g(String str) {
        k kVarY;
        kVarY = this.f5841c.y(str);
        return kVarY != null ? kVarY.f11748e : o.f11754c;
    }

    public final t h(long j5, long j7, String str) {
        t tVar;
        long j10;
        k kVarY = this.f5841c.y(str);
        if (kVarY == null) {
            return new t(str, j5, j7, -9223372036854775807L, null);
        }
        while (true) {
            t tVar2 = new t(kVarY.f11745b, j5, -1L, -9223372036854775807L, null);
            TreeSet treeSet = kVarY.f11746c;
            tVar = (t) treeSet.floor(tVar2);
            if (tVar == null || tVar.f11737e + tVar.f11738i <= j5) {
                t tVar3 = (t) treeSet.ceiling(tVar2);
                if (tVar3 != null) {
                    long jMin = tVar3.f11737e - j5;
                    if (j7 != -1) {
                        jMin = Math.min(jMin, j7);
                    }
                    j10 = jMin;
                } else {
                    j10 = j7;
                }
                tVar = new t(kVarY.f11745b, j5, j10, -9223372036854775807L, null);
            }
            if (!tVar.f11739v || tVar.f11740w.length() == tVar.f11738i) {
                break;
            }
            l();
        }
        return tVar;
    }

    public final void i(File file, boolean z5, File[] fileArr, Map map) {
        long j5;
        long j7;
        if (fileArr == null || fileArr.length == 0) {
            if (z5) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z5 && name.indexOf(46) == -1) {
                i(file2, false, file2.listFiles(), map);
            } else if (!z5 || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                f fVar = map != null ? (f) map.remove(name) : null;
                if (fVar != null) {
                    j5 = fVar.f11730a;
                    j7 = fVar.f11731b;
                } else {
                    j5 = -1;
                    j7 = -9223372036854775807L;
                }
                t tVarB = t.b(file2, j5, j7, this.f5841c);
                if (tVarB != null) {
                    b(tVarB);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void j(t tVar) {
        k kVarY = this.f5841c.y(tVar.f11736d);
        kVarY.getClass();
        long j5 = tVar.f11737e;
        ArrayList arrayList = kVarY.f11747d;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((j) arrayList.get(i7)).f11742a == j5) {
                arrayList.remove(i7);
                this.f5841c.K(kVarY.f11745b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    public final void k(i iVar) {
        String str = iVar.f11736d;
        long j5 = iVar.f11738i;
        File file = iVar.f11740w;
        c cVar = this.f5841c;
        k kVarY = cVar.y(str);
        if (kVarY == null || !kVarY.f11746c.remove(iVar)) {
            return;
        }
        if (file != null) {
            file.delete();
        }
        g gVar = this.f5842d;
        if (gVar != null) {
            String name = file.getName();
            try {
                ((String) gVar.f11734b).getClass();
                try {
                    ((kc.a) gVar.f11733a).getWritableDatabase().delete((String) gVar.f11734b, "name = ?", new String[]{name});
                } catch (SQLException e10) {
                    throw new a1(e10);
                }
            } catch (IOException unused) {
                e.y("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        cVar.K(kVarY.f11745b);
        ArrayList arrayList = (ArrayList) this.f5843e.get(iVar.f11736d);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                q qVar = (q) arrayList.get(size);
                qVar.f11757a.remove(iVar);
                qVar.f11758b -= j5;
            }
        }
        q qVar2 = this.f5840b;
        qVar2.f11757a.remove(iVar);
        qVar2.f11758b -= j5;
    }

    public final void l() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.f5841c.f393d).values()).iterator();
        while (it.hasNext()) {
            for (i iVar : ((k) it.next()).f11746c) {
                if (iVar.f11740w.length() != iVar.f11738i) {
                    arrayList.add(iVar);
                }
            }
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            k((i) arrayList.get(i7));
        }
    }

    public final synchronized t m(long j5, long j7, String str) {
        d();
        t tVarH = h(j5, j7, str);
        if (tVarH.f11739v) {
            return n(str, tVarH);
        }
        k kVarA = this.f5841c.A(str);
        long j10 = tVarH.f11738i;
        ArrayList arrayList = kVarA.f11747d;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            j jVar = (j) arrayList.get(i7);
            long j11 = jVar.f11742a;
            if (j11 <= j5) {
                long j12 = jVar.f11743b;
                if (j12 == -1 || j11 + j12 > j5) {
                    return null;
                }
            } else {
                if (j10 == -1 || j5 + j10 > j11) {
                    return null;
                }
            }
        }
        arrayList.add(new j(j5, j10));
        return tVarH;
    }

    public final t n(String str, t tVar) {
        boolean z5;
        File file;
        long j5 = tVar.f11738i;
        File file2 = tVar.f11740w;
        if (!this.f5845g) {
            return tVar;
        }
        file2.getClass();
        String name = file2.getName();
        long j7 = tVar.f11738i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        g gVar = this.f5842d;
        if (gVar != null) {
            try {
                gVar.e(j7, jCurrentTimeMillis, name);
            } catch (IOException unused) {
                jCurrentTimeMillis = jCurrentTimeMillis;
                je.b.N("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z5 = false;
        } else {
            z5 = true;
        }
        k kVarY = this.f5841c.y(str);
        TreeSet treeSet = kVarY.f11746c;
        je.b.k(treeSet.remove(tVar));
        file2.getClass();
        if (z5) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileC = t.c(parentFile, kVarY.f11744a, tVar.f11737e, jCurrentTimeMillis);
            if (file2.renameTo(fileC)) {
                file = fileC;
            } else {
                je.b.N("CachedContent", "Failed to rename " + file2 + " to " + fileC);
                file = file2;
            }
        } else {
            file = file2;
        }
        je.b.k(tVar.f11739v);
        t tVar2 = new t(tVar.f11736d, tVar.f11737e, tVar.f11738i, jCurrentTimeMillis, file);
        treeSet.add(tVar2);
        ArrayList arrayList = (ArrayList) this.f5843e.get(tVar.f11736d);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                q qVar = (q) arrayList.get(size);
                qVar.f11757a.remove(tVar);
                qVar.f11758b -= j5;
                qVar.b(this, tVar2);
            }
        }
        q qVar2 = this.f5840b;
        qVar2.f11757a.remove(tVar);
        qVar2.f11758b -= j5;
        qVar2.b(this, tVar2);
        return tVar2;
    }
}
