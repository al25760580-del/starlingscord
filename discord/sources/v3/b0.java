package v3;

import android.content.Context;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f21388a = q.f("WorkerFactory");

    public static p a(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = f21388a;
        p pVar = null;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(p.class);
        } catch (Throwable th2) {
            q.d().c(str2, "Invalid class: " + str, th2);
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                pVar = (p) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th3) {
                q.d().c(str2, "Could not instantiate " + str, th3);
            }
        }
        if (pVar == null || !pVar.f21416v) {
            return pVar;
        }
        throw new IllegalStateException(s0.g.f("WorkerFactory (", b0.class.getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
