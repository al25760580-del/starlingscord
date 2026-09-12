package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile k f1880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f1881b;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        k kVar = new k();
        Map map = Collections.EMPTY_MAP;
        f1881b = kVar;
    }

    public static k a() {
        k kVar;
        k kVar2 = f1880a;
        if (kVar2 != null) {
            return kVar2;
        }
        synchronized (k.class) {
            try {
                kVar = f1880a;
                if (kVar == null) {
                    Class cls = j.f1877a;
                    if (cls != null) {
                        try {
                            kVar = (k) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                            kVar = f1881b;
                        }
                    } else {
                        kVar = f1881b;
                    }
                    f1880a = kVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }
}
