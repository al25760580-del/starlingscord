package mc;

import android.net.Uri;
import android.text.TextUtils;
import he.s0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5.g f15525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f15528d;

    public e0(String str, boolean z5, a5.g gVar) {
        je.b.g((z5 && TextUtils.isEmpty(str)) ? false : true);
        this.f15525a = gVar;
        this.f15526b = str;
        this.f15527c = z5;
        this.f15528d = new HashMap();
    }

    public static byte[] b(a5.g gVar, String str, byte[] bArr, Map map) throws h0 {
        Map map2;
        List list;
        s0 s0Var = new s0(gVar.createDataSource());
        Map map3 = Collections.EMPTY_MAP;
        Uri uri = Uri.parse(str);
        je.b.m(uri, "The uri must be set.");
        he.p pVar = new he.p(uri, 0L, 2, bArr, map, 0L, -1L, null, 1);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            try {
                he.n nVar = new he.n(s0Var, pVar);
                try {
                    byte[] bArrT = je.e0.T(nVar);
                    je.e0.g(nVar);
                    return bArrT;
                } catch (he.d0 e10) {
                    try {
                        int i11 = e10.f10597v;
                        String str2 = null;
                        if ((i11 == 307 || i11 == 308) && i10 < 5 && (map2 = e10.f10598w) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(i7);
                        }
                        if (str2 == null) {
                            throw e10;
                        }
                        i10++;
                        he.o oVarA = pVar.a();
                        oVarA.f10640a = Uri.parse(str2);
                        pVar = oVarA.a();
                        je.e0.g(nVar);
                    } catch (Throwable th2) {
                        je.e0.g(nVar);
                        throw th2;
                    }
                }
            } catch (Exception e11) {
                s0Var.f10700i.getClass();
                s0Var.f10698d.s();
                throw new h0(e11);
            }
        }
    }

    public final byte[] a(UUID uuid, x xVar) throws h0 {
        String str;
        String str2 = xVar.f15576b;
        if (this.f15527c || TextUtils.isEmpty(str2)) {
            str2 = this.f15526b;
        }
        if (TextUtils.isEmpty(str2)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            je.b.m(uri, "The uri must be set.");
            new he.p(uri, 0L, 1, null, map, 0L, -1L, null, 0);
            throw new h0(new IllegalStateException("No license URL"));
        }
        HashMap map2 = new HashMap();
        UUID uuid2 = gc.h.f9673e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = gc.h.f9671c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map2.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map2.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f15528d) {
            map2.putAll(this.f15528d);
        }
        return b(this.f15525a, str2, xVar.f15575a, map2);
    }

    public final byte[] c(y yVar) {
        return b(this.f15525a, yVar.f15578b + "&signedRequest=" + je.e0.n(yVar.f15577a), null, Collections.EMPTY_MAP);
    }
}
