package mc;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {
    public static boolean a(Throwable th2) {
        return th2 instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th2) {
        return th2 instanceof NotProvisionedException;
    }
}
