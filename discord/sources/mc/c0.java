package mc;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, hc.c0 c0Var) {
        hc.b0 b0Var = c0Var.f10412a;
        b0Var.getClass();
        LogSessionId logSessionId = b0Var.f10406a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(logSessionId);
    }
}
