package co.discord.media_engine.internal;

import androidx.annotation.NonNull;
import co.discord.media_engine.CameraEnumeratorProvider;
import java.util.Locale;
import org.webrtc.CameraEnumerator;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceInfo {
    private static CameraEnumerator enumerator() {
        return CameraEnumeratorProvider.get();
    }

    @NonNull
    private String getDeviceFacingString(int i7) {
        if (getDeviceFrontFacing(i7)) {
            return "front";
        }
        return getDeviceBackFacing(i7) ? "back" : "unknown";
    }

    public boolean getDeviceBackFacing(int i7) {
        return enumerator().isBackFacing(getDeviceName(i7));
    }

    public boolean getDeviceFrontFacing(int i7) {
        return enumerator().isFrontFacing(getDeviceName(i7));
    }

    @NonNull
    public String getDeviceGuid(int i7) {
        Locale locale = Locale.US;
        return "android_camera_" + i7 + "_" + getDeviceFacingString(i7) + "_facing";
    }

    @NonNull
    public String getDeviceName(int i7) {
        return enumerator().getDeviceNames()[i7];
    }

    public int numberOfDevices() {
        return enumerator().getDeviceNames().length;
    }
}
