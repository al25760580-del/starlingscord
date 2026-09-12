package yr;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f23531a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f23532b = new c0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f23533c = new c0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f23534d = new c0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f23535e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ConcurrentHashMap f23536f = new ConcurrentHashMap();

    public static e0 a(Locale locale) {
        ConcurrentHashMap concurrentHashMap;
        int iB = f0.e.b(1);
        if (iB == 0) {
            concurrentHashMap = f23535e;
        } else {
            if (iB != 1) {
                throw new UnsupportedOperationException("CARDINALS");
            }
            concurrentHashMap = f23536f;
        }
        e0 e0Var = null;
        if (!concurrentHashMap.isEmpty()) {
            if (!locale.getCountry().equals("")) {
                e0Var = (e0) concurrentHashMap.get(locale.getLanguage() + '_' + locale.getCountry());
            }
            if (e0Var == null) {
                e0Var = (e0) concurrentHashMap.get(locale.getLanguage());
            }
        }
        return e0Var == null ? d0.f23530a.a(locale) : e0Var;
    }
}
