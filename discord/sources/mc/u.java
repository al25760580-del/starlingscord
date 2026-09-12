package mc;

import android.media.MediaDrm;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {
    public static boolean a(Throwable th2) {
        return th2 instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th2) {
        return je.e0.s(je.e0.t(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
    }
}
