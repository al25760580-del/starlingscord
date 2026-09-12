package f1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.core.view.e1;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f8790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f8791b;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f8790a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f8791b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return e1.f();
        }
        try {
            return ((Boolean) f8791b.invoke(null, Long.valueOf(f8790a))).booleanValue();
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }
}
