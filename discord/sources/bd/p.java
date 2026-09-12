package bd;

import android.media.metrics.LogSessionId;
import hc.b0;
import hc.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {
    public static void a(j jVar, c0 c0Var) {
        b0 b0Var = c0Var.f10412a;
        b0Var.getClass();
        LogSessionId logSessionId = b0Var.f10406a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        jVar.f3167b.setString("log-session-id", logSessionId.getStringId());
    }
}
