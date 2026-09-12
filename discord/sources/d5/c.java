package d5;

import android.os.SystemClock;
import android.text.TextUtils;
import c5.w;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import s0.g;
import sh.s;
import sh.s0;
import sh.u0;
import sh.v0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7609e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f7610i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f7611v;

    public /* synthetic */ c(v0 v0Var, String str, int i7, long j) {
        this.f7610i = v0Var;
        this.f7611v = str;
        this.f7608d = i7;
        this.f7609e = j;
    }

    public static String d(String str) {
        int length = str.length() / 2;
        StringBuilder sbN = kk.b.n(String.valueOf(str.substring(0, length).hashCode()));
        sbN.append(String.valueOf(str.substring(length).hashCode()));
        return sbN.toString();
    }

    public static int i(com.google.firebase.messaging.d dVar) throws IOException {
        int i7 = dVar.read();
        if (i7 != -1) {
            return i7;
        }
        throw new EOFException();
    }

    public static int j(com.google.firebase.messaging.d dVar) {
        return (i(dVar) << 24) | i(dVar) | (i(dVar) << 8) | (i(dVar) << 16);
    }

    public static long k(com.google.firebase.messaging.d dVar) {
        return (((long) i(dVar)) & 255) | ((((long) i(dVar)) & 255) << 8) | ((((long) i(dVar)) & 255) << 16) | ((((long) i(dVar)) & 255) << 24) | ((((long) i(dVar)) & 255) << 32) | ((((long) i(dVar)) & 255) << 40) | ((((long) i(dVar)) & 255) << 48) | ((255 & ((long) i(dVar))) << 56);
    }

    public static String l(com.google.firebase.messaging.d dVar) {
        return new String(m(dVar, k(dVar)), "UTF-8");
    }

    public static byte[] m(com.google.firebase.messaging.d dVar, long j) throws IOException {
        long j5 = dVar.f6571e - dVar.f6572i;
        if (j >= 0 && j <= j5) {
            int i7 = (int) j;
            if (i7 == j) {
                byte[] bArr = new byte[i7];
                new DataInputStream(dVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbM = kk.b.m(j, "streamToBytes length=", ", maxLength=");
        sbM.append(j5);
        throw new IOException(sbM.toString());
    }

    public static void n(BufferedOutputStream bufferedOutputStream, int i7) {
        bufferedOutputStream.write(i7 & 255);
        bufferedOutputStream.write((i7 >> 8) & 255);
        bufferedOutputStream.write((i7 >> 16) & 255);
        bufferedOutputStream.write((i7 >> 24) & 255);
    }

    public static void o(BufferedOutputStream bufferedOutputStream, long j) {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }

    public static void p(BufferedOutputStream bufferedOutputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        o(bufferedOutputStream, bytes.length);
        bufferedOutputStream.write(bytes, 0, bytes.length);
    }

    @Override // sh.u0
    public Object a() {
        int i7;
        v0 v0Var = (v0) this.f7610i;
        String str = (String) this.f7611v;
        long j = this.f7609e;
        List listAsList = Arrays.asList(str);
        v0Var.getClass();
        s0 s0Var = (s0) ((Map) v0Var.b(new io.sentry.internal.debugmeta.c(v0Var, listAsList, 20, false))).get(str);
        if (s0Var == null || (i7 = s0Var.f20176c.f20164d) == 5 || i7 == 6 || i7 == 4) {
            v0.f20207g.b(g.e("Could not find pack ", str, " while trying to complete it"), new Object[0]);
        }
        s sVar = v0Var.f20208a;
        int i10 = this.f7608d;
        if (sVar.c(i10, j, str).exists()) {
            s.g(sVar.c(i10, j, str));
        }
        s0Var.f20176c.f20164d = 4;
        return null;
    }

    public synchronized c5.b b(String str) {
        b bVar = (b) ((LinkedHashMap) this.f7610i).get(str);
        if (bVar == null) {
            return null;
        }
        File fileC = c(str);
        try {
            com.google.firebase.messaging.d dVar = new com.google.firebase.messaging.d(new BufferedInputStream(new FileInputStream(fileC)), fileC.length());
            try {
                b bVarA = b.a(dVar);
                if (TextUtils.equals(str, bVarA.f7601b)) {
                    c5.b bVarB = bVar.b(m(dVar, dVar.f6571e - dVar.f6572i));
                    dVar.close();
                    return bVarB;
                }
                w.b("%s: key=%s, found=%s", fileC.getAbsolutePath(), str, bVarA.f7601b);
                b bVar2 = (b) ((LinkedHashMap) this.f7610i).remove(str);
                if (bVar2 != null) {
                    this.f7609e -= bVar2.f7600a;
                }
                dVar.close();
                return null;
            } catch (Throwable th2) {
                dVar.close();
                throw th2;
            }
        } catch (IOException e10) {
            w.b("%s: %s", fileC.getAbsolutePath(), e10.toString());
            synchronized (this) {
                boolean zDelete = c(str).delete();
                b bVar3 = (b) ((LinkedHashMap) this.f7610i).remove(str);
                if (bVar3 != null) {
                    this.f7609e -= bVar3.f7600a;
                }
                if (!zDelete) {
                    w.b("Could not delete cache entry for key=%s, filename=%s", str, d(str));
                }
                return null;
            }
        }
    }

    public File c(String str) {
        return new File(((io.sentry.internal.debugmeta.c) this.f7611v).v0(), d(str));
    }

    public synchronized void e() {
        File fileV0 = ((io.sentry.internal.debugmeta.c) this.f7611v).v0();
        if (!fileV0.exists()) {
            if (!fileV0.mkdirs()) {
                w.c("Unable to create cache dir %s", fileV0.getAbsolutePath());
            }
            return;
        }
        File[] fileArrListFiles = fileV0.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            try {
                long length = file.length();
                com.google.firebase.messaging.d dVar = new com.google.firebase.messaging.d(new BufferedInputStream(new FileInputStream(file)), length);
                try {
                    b bVarA = b.a(dVar);
                    bVarA.f7600a = length;
                    h(bVarA.f7601b, bVarA);
                    dVar.close();
                } catch (Throwable th2) {
                    dVar.close();
                    throw th2;
                }
            } catch (IOException unused) {
                file.delete();
            }
        }
    }

    public void f() {
        long j = this.f7609e;
        int i7 = this.f7608d;
        if (j < i7) {
            return;
        }
        int i10 = 0;
        if (w.f3524a) {
            w.d("Pruning old cache entries.", new Object[0]);
        }
        long j5 = this.f7609e;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = ((LinkedHashMap) this.f7610i).entrySet().iterator();
        while (it.hasNext()) {
            b bVar = (b) ((Map.Entry) it.next()).getValue();
            if (c(bVar.f7601b).delete()) {
                this.f7609e -= bVar.f7600a;
            } else {
                String str = bVar.f7601b;
                w.b("Could not delete cache entry for key=%s, filename=%s", str, d(str));
            }
            it.remove();
            i10++;
            if (this.f7609e < i7 * 0.9f) {
                break;
            }
        }
        if (w.f3524a) {
            w.d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i10), Long.valueOf(this.f7609e - j5), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    public synchronized void g(String str, c5.b bVar) {
        long j = this.f7609e;
        byte[] bArr = bVar.f3469a;
        long length = j + ((long) bArr.length);
        int i7 = this.f7608d;
        if (length > i7 && bArr.length > i7 * 0.9f) {
            return;
        }
        File fileC = c(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileC));
            b bVar2 = new b(str, bVar);
            if (!bVar2.c(bufferedOutputStream)) {
                bufferedOutputStream.close();
                w.b("Failed to write header for %s", fileC.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(bVar.f3469a);
            bufferedOutputStream.close();
            bVar2.f7600a = fileC.length();
            h(str, bVar2);
            f();
        } catch (IOException unused) {
            if (!fileC.delete()) {
                w.b("Could not clean up file %s", fileC.getAbsolutePath());
            }
            if (!((io.sentry.internal.debugmeta.c) this.f7611v).v0().exists()) {
                w.b("Re-initializing cache after external clearing.", new Object[0]);
                ((LinkedHashMap) this.f7610i).clear();
                this.f7609e = 0L;
                e();
            }
        }
    }

    public void h(String str, b bVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7610i;
        if (linkedHashMap.containsKey(str)) {
            this.f7609e = (bVar.f7600a - ((b) linkedHashMap.get(str)).f7600a) + this.f7609e;
        } else {
            this.f7609e += bVar.f7600a;
        }
        linkedHashMap.put(str, bVar);
    }

    public c(io.sentry.internal.debugmeta.c cVar) {
        this.f7610i = new LinkedHashMap(16, 0.75f, true);
        this.f7609e = 0L;
        this.f7611v = cVar;
        this.f7608d = 5242880;
    }
}
