package ur;

import android.os.SystemClock;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements as.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f21314a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f21315b;

    static {
        Method method = null;
        try {
            Method method2 = SystemClock.class.getMethod("elapsedRealtimeNanos", null);
            method2.invoke(null, null);
            method = method2;
        } catch (IllegalAccessException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        f21315b = method;
    }

    @Override // as.d
    public final long a() {
        Method method = f21315b;
        if (method != null) {
            try {
                return ((Long) method.invoke(null, f21314a)).longValue();
            } catch (IllegalAccessException e10) {
                e10.printStackTrace(System.err);
            } catch (InvocationTargetException e11) {
                e11.printStackTrace(System.err);
            }
        }
        return yk.a.C(SystemClock.elapsedRealtime(), 1000000L);
    }

    @Override // as.d
    public final String b() {
        return "Dalvik";
    }
}
