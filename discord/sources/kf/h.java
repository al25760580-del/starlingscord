package kf;

import android.content.Context;
import ye.i;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends i {
    public static int k = 1;

    public synchronized int c() {
        int i7;
        try {
            i7 = k;
            if (i7 == 1) {
                Context context = this.f23301a;
                xe.e eVar = xe.e.f22922d;
                int iB = eVar.b(context, 12451000);
                if (iB == 0) {
                    i7 = 4;
                    k = 4;
                } else if (eVar.a(context, null, iB) != null || mf.d.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i7 = 2;
                    k = 2;
                } else {
                    i7 = 3;
                    k = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i7;
    }
}
