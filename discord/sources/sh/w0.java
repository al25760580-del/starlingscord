package sh;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a5.o f20223d = new a5.o("ExtractorTaskFinder", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f20224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f20225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f20226c;

    public w0(v0 v0Var, s sVar, a0 a0Var) {
        this.f20224a = v0Var;
        this.f20225b = sVar;
        this.f20226c = a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x03d5 A[PHI: r11
      0x03d5: PHI (r11v2 hj.j) = (r11v1 hj.j), (r11v4 hj.j) binds: [B:24:0x009d, B:36:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    public final hj.j a() {
        a5.o oVar;
        hj.j c1Var;
        hj.j jVar;
        a5.o oVar2;
        a1 a1Var;
        p1 p1Var;
        a0 a0Var;
        ArrayList arrayList;
        d0 d0Var;
        j1 j1Var;
        int iA;
        s sVar = this.f20225b;
        v0 v0Var = this.f20224a;
        try {
            v0Var.f20211d.lock();
            ArrayList arrayList2 = new ArrayList();
            for (s0 s0Var : v0Var.f20210c.values()) {
                if (m0.c(s0Var.f20176c.f20164d)) {
                    arrayList2.add(s0Var);
                }
            }
            if (arrayList2.isEmpty()) {
                jVar = null;
            } else {
                HashMap mapN = sVar.n();
                Iterator it = arrayList2.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    oVar = f20223d;
                    if (!zHasNext) {
                        c1Var = null;
                        break;
                    }
                    s0 s0Var2 = (s0) it.next();
                    r0 r0Var = s0Var2.f20176c;
                    Long l6 = (Long) mapN.get(r0Var.f20161a);
                    if (l6 != null && r0Var.f20162b == l6.longValue()) {
                        oVar.a("Found promote pack task for session %s with pack %s.", Integer.valueOf(s0Var2.f20174a), r0Var.f20161a);
                        int i7 = s0Var2.f20174a;
                        String str = r0Var.f20161a;
                        c1Var = new l1(i7, str, (int) s.b(new File(sVar.d(), str), true), s0Var2.f20175b, r0Var.f20162b);
                        break;
                    }
                }
                if (c1Var == null) {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            c1Var = null;
                            break;
                        }
                        s0 s0Var3 = (s0) it2.next();
                        try {
                            r0 r0Var2 = s0Var3.f20176c;
                            if (sVar.h(s0Var3.f20175b, r0Var2.f20162b, r0Var2.f20161a) == r0Var2.f20166f.size()) {
                                oVar.a("Found final move task for session %s with pack %s.", Integer.valueOf(s0Var3.f20174a), r0Var2.f20161a);
                                c1Var = new c1(s0Var3.f20174a, r0Var2.f20161a, s0Var3.f20175b, r0Var2.f20162b, r0Var2.f20163c);
                                break;
                            }
                        } catch (IOException e10) {
                            throw new l0("Failed to check number of completed merges for session " + s0Var3.f20174a + ", pack " + s0Var3.f20176c.f20161a, e10, s0Var3.f20174a);
                        }
                    }
                    if (c1Var == null) {
                        Iterator it3 = arrayList2.iterator();
                        loop3: while (true) {
                            if (!it3.hasNext()) {
                                oVar2 = oVar;
                                a1Var = null;
                                break;
                            }
                            s0 s0Var4 = (s0) it3.next();
                            r0 r0Var3 = s0Var4.f20176c;
                            if (m0.c(r0Var3.f20164d)) {
                                for (t0 t0Var : r0Var3.f20166f) {
                                    a5.o oVar3 = oVar;
                                    if (this.f20225b.l(s0Var4.f20175b, r0Var3.f20161a, r0Var3.f20162b, t0Var.f20188a).exists()) {
                                        oVar2 = oVar3;
                                        oVar2.a("Found merge task for session %s with pack %s and slice %s.", Integer.valueOf(s0Var4.f20174a), r0Var3.f20161a, t0Var.f20188a);
                                        a1Var = new a1(s0Var4.f20174a, r0Var3.f20161a, s0Var4.f20175b, r0Var3.f20162b, t0Var.f20188a);
                                        break loop3;
                                    }
                                    oVar = oVar3;
                                }
                            }
                        }
                        if (a1Var == null) {
                            Iterator it4 = arrayList2.iterator();
                            loop5: while (true) {
                                if (!it4.hasNext()) {
                                    p1Var = null;
                                    break;
                                }
                                s0 s0Var5 = (s0) it4.next();
                                r0 r0Var4 = s0Var5.f20176c;
                                if (m0.c(r0Var4.f20164d)) {
                                    for (t0 t0Var2 : r0Var4.f20166f) {
                                        if (b(s0Var5, t0Var2)) {
                                            if (this.f20225b.k(s0Var5.f20175b, r0Var4.f20161a, r0Var4.f20162b, t0Var2.f20188a).exists()) {
                                                oVar2.a("Found verify task for session %s with pack %s and slice %s.", Integer.valueOf(s0Var5.f20174a), r0Var4.f20161a, t0Var2.f20188a);
                                                p1Var = new p1(s0Var5.f20174a, r0Var4.f20161a, s0Var5.f20175b, r0Var4.f20162b, t0Var2.f20188a, t0Var2.f20189b);
                                                break loop5;
                                            }
                                        }
                                    }
                                }
                            }
                            if (p1Var == null) {
                                Iterator it5 = arrayList2.iterator();
                                loop7: while (true) {
                                    boolean zHasNext2 = it5.hasNext();
                                    int i10 = 2;
                                    a0Var = this.f20226c;
                                    if (!zHasNext2) {
                                        arrayList = arrayList2;
                                        d0Var = null;
                                        break;
                                    }
                                    s0 s0Var6 = (s0) it5.next();
                                    r0 r0Var5 = s0Var6.f20176c;
                                    if (m0.c(r0Var5.f20164d)) {
                                        for (t0 t0Var3 : r0Var5.f20166f) {
                                            int i11 = t0Var3.f20193f;
                                            boolean z5 = i11 == 1 || i11 == i10;
                                            String str2 = t0Var3.f20188a;
                                            ArrayList arrayList3 = t0Var3.f20191d;
                                            if (!z5) {
                                                s sVar2 = this.f20225b;
                                                r0 r0Var6 = s0Var6.f20176c;
                                                arrayList = arrayList2;
                                                Iterator it6 = it5;
                                                try {
                                                    iA = new n1(sVar2, r0Var6.f20161a, s0Var6.f20175b, r0Var6.f20162b, t0Var3.f20188a).a();
                                                } catch (IOException e11) {
                                                    oVar2.b("Slice checkpoint corrupt, restarting extraction. %s", e11);
                                                    iA = 0;
                                                }
                                                if (iA != -1 && ((q0) arrayList3.get(iA)).f20155a) {
                                                    oVar2.a("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", Integer.valueOf(t0Var3.f20192e), Integer.valueOf(s0Var6.f20174a), s0Var6.f20176c.f20161a, str2, Integer.valueOf(iA));
                                                    ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStreamA = a0Var.a(s0Var6.f20174a, iA, s0Var6.f20176c.f20161a, str2);
                                                    int i12 = s0Var6.f20174a;
                                                    r0 r0Var7 = s0Var6.f20176c;
                                                    String str3 = r0Var7.f20161a;
                                                    int i13 = s0Var6.f20175b;
                                                    long j = r0Var7.f20162b;
                                                    String str4 = r0Var7.f20163c;
                                                    String str5 = t0Var3.f20188a;
                                                    int i14 = t0Var3.f20192e;
                                                    int size = arrayList3.size();
                                                    r0 r0Var8 = s0Var6.f20176c;
                                                    d0Var = new d0(i12, str3, i13, j, str4, str5, i14, iA, size, r0Var8.f20165e, r0Var8.f20164d, autoCloseInputStreamA);
                                                    break loop7;
                                                }
                                                it5 = it6;
                                                arrayList2 = arrayList;
                                                i10 = 2;
                                            }
                                        }
                                    }
                                }
                                if (d0Var == null) {
                                    Iterator it7 = arrayList.iterator();
                                    loop9: while (true) {
                                        if (!it7.hasNext()) {
                                            j1Var = null;
                                            break;
                                        }
                                        s0 s0Var7 = (s0) it7.next();
                                        r0 r0Var9 = s0Var7.f20176c;
                                        if (m0.c(r0Var9.f20164d)) {
                                            for (t0 t0Var4 : r0Var9.f20166f) {
                                                int i15 = t0Var4.f20193f;
                                                boolean z6 = i15 == 1 || i15 == 2;
                                                String str6 = t0Var4.f20188a;
                                                if (z6 && ((q0) t0Var4.f20191d.get(0)).f20155a && !b(s0Var7, t0Var4)) {
                                                    oVar2.a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", Integer.valueOf(t0Var4.f20193f), Integer.valueOf(s0Var7.f20174a), s0Var7.f20176c.f20161a, str6);
                                                    ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStreamA2 = a0Var.a(s0Var7.f20174a, 0, s0Var7.f20176c.f20161a, str6);
                                                    int i16 = s0Var7.f20174a;
                                                    String str7 = s0Var7.f20176c.f20161a;
                                                    int iB = (int) s.b(new File(sVar.d(), str7), true);
                                                    String str8 = s0Var7.f20176c.f20161a;
                                                    j1Var = new j1(i16, str7, iB, s.b(new File(new File(sVar.d(), str8), String.valueOf((int) s.b(new File(sVar.d(), str8), true))), true), s0Var7.f20175b, s0Var7.f20176c.f20162b, t0Var4.f20193f, t0Var4.f20188a, t0Var4.f20190c, autoCloseInputStreamA2);
                                                    break loop9;
                                                }
                                            }
                                        }
                                    }
                                    if (j1Var != null) {
                                        v0Var.f20211d.unlock();
                                        return j1Var;
                                    }
                                    jVar = null;
                                } else {
                                    jVar = d0Var;
                                }
                            } else {
                                jVar = p1Var;
                            }
                        } else {
                            jVar = a1Var;
                        }
                    } else {
                        jVar = c1Var;
                    }
                } else {
                    jVar = c1Var;
                }
            }
            v0Var.f20211d.unlock();
            return jVar;
        } catch (Throwable th2) {
            v0Var.f20211d.unlock();
            throw th2;
        }
    }

    public final boolean b(s0 s0Var, t0 t0Var) {
        r0 r0Var = s0Var.f20176c;
        String str = r0Var.f20161a;
        long j = r0Var.f20162b;
        int i7 = s0Var.f20175b;
        String str2 = t0Var.f20188a;
        a5.o oVar = n1.f20123h;
        s sVar = this.f20225b;
        sVar.getClass();
        File file = new File(new File(new File(new File(sVar.c(i7, j, str), "_slices"), "_metadata"), str2), "checkpoint.dat");
        if (file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    Properties properties = new Properties();
                    properties.load(fileInputStream);
                    fileInputStream.close();
                    if (properties.getProperty("fileStatus") == null) {
                        oVar.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                        return false;
                    }
                    if (Integer.parseInt(properties.getProperty("fileStatus")) == 4) {
                        return true;
                    }
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                oVar.b("Could not read checkpoint while checking if extraction finished. %s", e10);
                return false;
            }
        }
        return false;
    }
}
