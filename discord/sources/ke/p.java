package ke;

import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {
    public static void a(Surface surface, float f2) {
        try {
            surface.setFrameRate(f2, f2 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            je.b.s("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
