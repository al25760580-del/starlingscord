package s1;

import android.os.CancellationSignal;
import android.util.Log;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static boolean a(CancellationSignal cancellationSignal) {
        if (cancellationSignal == null) {
            Log.i("PlayServicesImpl", "No cancellationSignal found");
            return false;
        }
        if (!cancellationSignal.isCanceled()) {
            return false;
        }
        Log.i("PlayServicesImpl", "the flow has been canceled");
        return true;
    }

    public static void b(CancellationSignal cancellationSignal, Function0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (a(cancellationSignal)) {
            return;
        }
        callback.invoke();
    }
}
