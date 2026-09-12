package ie;

import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f11714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public he.p f11717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public File f11719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OutputStream f11720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f11721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f11722i;
    public r j;

    public d(SimpleCache simpleCache) {
        simpleCache.getClass();
        this.f11714a = simpleCache;
        this.f11715b = 104857600L;
        this.f11716c = 20480;
    }

    public final void a() {
        OutputStream outputStream = this.f11720g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            e0.g(this.f11720g);
            this.f11720g = null;
            File file = this.f11719f;
            this.f11719f = null;
            b bVar = this.f11714a;
            long j = this.f11721h;
            SimpleCache simpleCache = (SimpleCache) bVar;
            synchronized (simpleCache) {
                if (file.exists()) {
                    if (j == 0) {
                        file.delete();
                        return;
                    }
                    t tVarB = t.b(file, j, -9223372036854775807L, simpleCache.f5841c);
                    tVarB.getClass();
                    k kVarY = simpleCache.f5841c.y(tVarB.f11736d);
                    kVarY.getClass();
                    je.b.k(kVarY.a(tVarB.f11737e, tVarB.f11738i));
                    long jA = n.a(kVarY.f11748e);
                    if (jA != -1) {
                        je.b.k(tVarB.f11737e + tVarB.f11738i <= jA);
                    }
                    if (simpleCache.f5842d == null) {
                        simpleCache.b(tVarB);
                        simpleCache.f5841c.O();
                        simpleCache.notifyAll();
                        return;
                    }
                    try {
                        simpleCache.f5842d.e(tVarB.f11738i, tVarB.f11741x, file.getName());
                        simpleCache.b(tVarB);
                        try {
                            simpleCache.f5841c.O();
                            simpleCache.notifyAll();
                            return;
                        } catch (IOException e10) {
                            throw new a(e10);
                        }
                    } catch (IOException e11) {
                        throw new a(e11);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            e0.g(this.f11720g);
            this.f11720g = null;
            File file2 = this.f11719f;
            this.f11719f = null;
            file2.delete();
            throw th2;
        }
    }

    public final void b(he.p pVar) {
        File fileC;
        long j = pVar.f10655g;
        long jMin = j == -1 ? -1L : Math.min(j - this.f11722i, this.f11718e);
        b bVar = this.f11714a;
        String str = pVar.f10656h;
        int i7 = e0.f13788a;
        long j5 = pVar.f10654f + this.f11722i;
        SimpleCache simpleCache = (SimpleCache) bVar;
        synchronized (simpleCache) {
            try {
                simpleCache.d();
                k kVarY = simpleCache.f5841c.y(str);
                kVarY.getClass();
                je.b.k(kVarY.a(j5, jMin));
                if (!simpleCache.f5839a.exists()) {
                    SimpleCache.e(simpleCache.f5839a);
                    simpleCache.l();
                }
                q qVar = simpleCache.f5840b;
                if (jMin != -1) {
                    qVar.a(simpleCache, jMin);
                } else {
                    qVar.getClass();
                }
                File file = new File(simpleCache.f5839a, Integer.toString(simpleCache.f5844f.nextInt(10)));
                if (!file.exists()) {
                    SimpleCache.e(file);
                }
                fileC = t.c(file, kVarY.f11744a, j5, System.currentTimeMillis());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f11719f = fileC;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f11719f);
        if (this.f11716c > 0) {
            r rVar = this.j;
            if (rVar == null) {
                this.j = new r(fileOutputStream, this.f11716c);
            } else {
                rVar.c(fileOutputStream);
            }
            this.f11720g = this.j;
        } else {
            this.f11720g = fileOutputStream;
        }
        this.f11721h = 0L;
    }
}
