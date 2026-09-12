package d5;

import c5.g;
import c5.w;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f7600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f7607h;

    public b(String str, String str2, long j, long j5, long j7, long j10, List list) {
        this.f7601b = str;
        this.f7602c = "".equals(str2) ? null : str2;
        this.f7603d = j;
        this.f7604e = j5;
        this.f7605f = j7;
        this.f7606g = j10;
        this.f7607h = list;
    }

    public static b a(com.google.firebase.messaging.d dVar) throws IOException {
        if (c.j(dVar) != 538247942) {
            throw new IOException();
        }
        String strL = c.l(dVar);
        String strL2 = c.l(dVar);
        long jK = c.k(dVar);
        long jK2 = c.k(dVar);
        long jK3 = c.k(dVar);
        long jK4 = c.k(dVar);
        int iJ = c.j(dVar);
        if (iJ < 0) {
            throw new IOException(kk.b.h(iJ, "readHeaderList size="));
        }
        List arrayList = iJ == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i7 = 0; i7 < iJ; i7++) {
            arrayList.add(new g(c.l(dVar).intern(), c.l(dVar).intern()));
        }
        return new b(strL, strL2, jK, jK2, jK3, jK4, arrayList);
    }

    public final c5.b b(byte[] bArr) {
        c5.b bVar = new c5.b();
        bVar.f3469a = bArr;
        bVar.f3470b = this.f7602c;
        bVar.f3471c = this.f7603d;
        bVar.f3472d = this.f7604e;
        bVar.f3473e = this.f7605f;
        bVar.f3474f = this.f7606g;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List<g> list = this.f7607h;
        for (g gVar : list) {
            treeMap.put(gVar.f3489a, gVar.f3490b);
        }
        bVar.f3475g = treeMap;
        bVar.f3476h = Collections.unmodifiableList(list);
        return bVar;
    }

    public final boolean c(BufferedOutputStream bufferedOutputStream) {
        try {
            c.n(bufferedOutputStream, 538247942);
            c.p(bufferedOutputStream, this.f7601b);
            String str = this.f7602c;
            if (str == null) {
                str = "";
            }
            c.p(bufferedOutputStream, str);
            c.o(bufferedOutputStream, this.f7603d);
            c.o(bufferedOutputStream, this.f7604e);
            c.o(bufferedOutputStream, this.f7605f);
            c.o(bufferedOutputStream, this.f7606g);
            List<g> list = this.f7607h;
            if (list != null) {
                c.n(bufferedOutputStream, list.size());
                for (g gVar : list) {
                    c.p(bufferedOutputStream, gVar.f3489a);
                    c.p(bufferedOutputStream, gVar.f3490b);
                }
            } else {
                c.n(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            return true;
        } catch (IOException e10) {
            w.b("%s", e10.toString());
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public b(String str, c5.b bVar) {
        String str2 = bVar.f3470b;
        long j = bVar.f3471c;
        long j5 = bVar.f3472d;
        long j7 = bVar.f3473e;
        long j10 = bVar.f3474f;
        ?? arrayList = bVar.f3476h;
        if (arrayList == 0) {
            Map map = bVar.f3475g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new g((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j5, j7, j10, arrayList);
    }
}
