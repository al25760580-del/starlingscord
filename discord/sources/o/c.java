package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import gn.h;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17072b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f17073c = Executors.newFixedThreadPool(4, new b());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Handler f17074d;

    public static Handler T(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.h.c(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
