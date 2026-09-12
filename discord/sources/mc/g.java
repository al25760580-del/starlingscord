package mc;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import ei.e1;
import gc.n0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15550a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n0 f15551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f15552c;

    public static f a(n0 n0Var) {
        a5.g gVar = new a5.g(1);
        Uri uri = n0Var.f9786e;
        e0 e0Var = new e0(uri == null ? null : uri.toString(), n0Var.f9790x, gVar);
        e1 it = n0Var.f9787i.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (e0Var.f15528d) {
                e0Var.f15528d.put(str, str2);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = gc.h.f9669a;
        o9.d dVar = new o9.d(-1, 3);
        UUID uuid2 = n0Var.f9785d;
        uuid2.getClass();
        boolean z5 = n0Var.f9788v;
        boolean z6 = n0Var.f9789w;
        int[] iArrP = mo.c0.P(n0Var.f9791y);
        int length = iArrP.length;
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = iArrP[i7];
            je.b.g(i10 == 2 || i10 == 1);
        }
        f fVar = new f(uuid2, e0Var, map, z5, (int[]) iArrP.clone(), z6, dVar);
        byte[] bArr = n0Var.E;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        je.b.k(fVar.f15538m.isEmpty());
        fVar.f15547v = bArrCopyOf;
        return fVar;
    }

    public final s b(MediaItem mediaItem) {
        f fVar;
        mediaItem.f5534e.getClass();
        n0 n0Var = mediaItem.f5534e.f9813i;
        if (n0Var == null || je.e0.f13788a < 18) {
            return s.f15573a;
        }
        synchronized (this.f15550a) {
            try {
                if (!n0Var.equals(this.f15551b)) {
                    this.f15551b = n0Var;
                    this.f15552c = a(n0Var);
                }
                fVar = this.f15552c;
                fVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }
}
