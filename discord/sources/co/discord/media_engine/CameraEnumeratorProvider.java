package co.discord.media_engine;

import android.content.Context;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.webrtc.Camera1Enumerator;
import org.webrtc.Camera2Enumerator;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0006H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lco/discord/media_engine/CameraEnumeratorProvider;", "", "()V", "TAG", "", "enumerator", "Lorg/webrtc/CameraEnumerator;", "createCapturer", "Lorg/webrtc/CameraVideoCapturer;", "cameraName", "get", "init", "", "context", "Landroid/content/Context;", "forceCamera1", "", "maybeInit", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CameraEnumeratorProvider {

    @NotNull
    public static final CameraEnumeratorProvider INSTANCE = new CameraEnumeratorProvider();

    @NotNull
    private static final String TAG = "CameraEnumeratorProvider";
    private static CameraEnumerator enumerator;

    private CameraEnumeratorProvider() {
    }

    @NotNull
    public static final CameraVideoCapturer createCapturer(@NotNull String cameraName) {
        Intrinsics.checkNotNullParameter(cameraName, "cameraName");
        CameraVideoCapturer cameraVideoCapturerCreateCapturer = get().createCapturer(cameraName, null);
        Intrinsics.checkNotNullExpressionValue(cameraVideoCapturerCreateCapturer, "createCapturer(...)");
        return cameraVideoCapturerCreateCapturer;
    }

    @NotNull
    public static final synchronized CameraEnumerator get() {
        CameraEnumerator camera1Enumerator;
        camera1Enumerator = enumerator;
        if (camera1Enumerator == null) {
            Log.i(TAG, "init was never called. Use Camera 1 API by default.");
            camera1Enumerator = new Camera1Enumerator();
        }
        return camera1Enumerator;
    }

    public static final synchronized void maybeInit(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (enumerator == null) {
            INSTANCE.init(context, false);
        }
    }

    public final synchronized void init(@NotNull Context context, boolean forceCamera1) {
        CameraEnumerator camera1Enumerator;
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (forceCamera1) {
                Log.i(TAG, "Override: Forcing Camera 1 API");
                camera1Enumerator = new Camera1Enumerator();
            } else if (Camera2Enumerator.isSupported(context)) {
                Log.i(TAG, "Use Camera 2 API");
                camera1Enumerator = new Camera2Enumerator(context.getApplicationContext());
            } else {
                Log.i(TAG, "Camera 2 API is not supported. Use Camera 1 API");
                camera1Enumerator = new Camera1Enumerator();
            }
            enumerator = camera1Enumerator;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
