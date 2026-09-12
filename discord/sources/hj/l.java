package hj;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile l f10880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f10881b;

    static {
        l lVar = new l();
        Map map = Collections.EMPTY_MAP;
        f10881b = lVar;
    }

    public static l a() {
        l lVar;
        l lVar2 = f10880a;
        if (lVar2 != null) {
            return lVar2;
        }
        synchronized (l.class) {
            try {
                lVar = f10880a;
                if (lVar == null) {
                    Class cls = k.f10869a;
                    l lVar3 = null;
                    if (cls != null) {
                        try {
                            lVar3 = (l) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    lVar = lVar3 != null ? lVar3 : f10881b;
                    f10880a = lVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }
}
