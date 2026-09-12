package yr;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements a0 {
    @Override // yr.a0
    public final e0 a(Locale locale) {
        boolean zEquals = locale.getLanguage().equals("en");
        int iB = f0.e.b(1);
        if (iB == 0) {
            return zEquals ? e0.f23531a : e0.f23532b;
        }
        if (iB == 1) {
            return zEquals ? e0.f23533c : e0.f23534d;
        }
        throw new UnsupportedOperationException("CARDINALS");
    }
}
