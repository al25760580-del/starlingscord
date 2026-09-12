package co.discord.media_engine;

import androidx.annotation.NonNull;
import org.webrtc.EglBase;
import org.webrtc.EglHelper;

/* JADX INFO: loaded from: classes.dex */
public final class SharedEglBaseContext {
    private static EglBase eglBase_;

    @NonNull
    public static synchronized EglBase.Context getEglContext() {
        try {
            if (eglBase_ == null) {
                eglBase_ = EglHelper.create();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return eglBase_.getEglBaseContext();
    }
}
