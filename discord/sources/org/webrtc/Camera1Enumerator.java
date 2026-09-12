package org.webrtc;

import android.hardware.Camera;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class Camera1Enumerator implements CameraEnumerator {
    private static final String TAG = "Camera1Enumerator";
    private static List<List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats;
    private final boolean captureToTexture;

    public Camera1Enumerator() {
        this(true);
    }

    public static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(List<int[]> list) {
        ArrayList arrayList = new ArrayList();
        for (int[] iArr : list) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    public static List<Size> convertSizes(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : list) {
            arrayList.add(new Size(size.width, size.height));
        }
        return arrayList;
    }

    private static List<CameraEnumerationAndroid.CaptureFormat> enumerateFormats(int i7) {
        int i10;
        Logging.d(TAG, "Get supported formats for camera index " + i7 + ".");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Camera cameraOpen = null;
        try {
            try {
                Logging.d(TAG, "Opening camera with index " + i7);
                cameraOpen = Camera.open(i7);
                Camera.Parameters parameters = cameraOpen.getParameters();
                cameraOpen.release();
                ArrayList arrayList = new ArrayList();
                try {
                    List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                    int i11 = 0;
                    if (supportedPreviewFpsRange != null) {
                        int[] iArr = supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
                        i11 = iArr[0];
                        i10 = iArr[1];
                    } else {
                        i10 = 0;
                    }
                    for (Camera.Size size : parameters.getSupportedPreviewSizes()) {
                        arrayList.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, i11, i10));
                    }
                } catch (Exception e10) {
                    Logging.e(TAG, "getSupportedFormats() failed on camera index " + i7, e10);
                }
                Logging.d(TAG, "Get supported formats for camera index " + i7 + " done. Time spent: " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms.");
                return arrayList;
            } catch (RuntimeException e11) {
                Logging.e(TAG, "Open camera failed on camera index " + i7, e11);
                ArrayList arrayList2 = new ArrayList();
                if (cameraOpen != null) {
                    cameraOpen.release();
                }
                return arrayList2;
            }
        } catch (Throwable th2) {
            if (cameraOpen != null) {
                cameraOpen.release();
            }
            throw th2;
        }
    }

    public static int getCameraIndex(String str) {
        Logging.d(TAG, "getCameraIndex: " + str);
        for (int i7 = 0; i7 < Camera.getNumberOfCameras(); i7++) {
            if (str.equals(getDeviceName(i7))) {
                return i7;
            }
        }
        throw new IllegalArgumentException(a3.e.l("No such camera: ", str));
    }

    private static Camera.CameraInfo getCameraInfo(int i7) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i7, cameraInfo);
            return cameraInfo;
        } catch (Exception e10) {
            Logging.e(TAG, "getCameraInfo failed on index " + i7, e10);
            return null;
        }
    }

    public static String getDeviceName(int i7) {
        Camera.CameraInfo cameraInfo = getCameraInfo(i7);
        if (cameraInfo == null) {
            return null;
        }
        String str = cameraInfo.facing == 1 ? "front" : "back";
        int i10 = cameraInfo.orientation;
        StringBuilder sbO = com.discord.chat.presentation.list.a.o("Camera ", ", Facing ", str, i7, ", Orientation ");
        sbO.append(i10);
        return sbO.toString();
    }

    @Override // org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera1Capturer(str, cameraEventsHandler, this.captureToTexture);
    }

    @Override // org.webrtc.CameraEnumerator
    public String[] getDeviceNames() {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < Camera.getNumberOfCameras(); i7++) {
            String deviceName = getDeviceName(i7);
            if (deviceName != null) {
                arrayList.add(deviceName);
                Logging.d(TAG, "Index: " + i7 + ". " + deviceName);
            } else {
                Logging.e(TAG, "Index: " + i7 + ". Failed to query camera name.");
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // org.webrtc.CameraEnumerator
    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getSupportedFormats(getCameraIndex(str));
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isBackFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 0;
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isFrontFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 1;
    }

    public Camera1Enumerator(boolean z5) {
        this.captureToTexture = z5;
    }

    public static synchronized List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(int i7) {
        try {
            if (cachedSupportedFormats == null) {
                cachedSupportedFormats = new ArrayList();
                for (int i10 = 0; i10 < Camera.getNumberOfCameras(); i10++) {
                    cachedSupportedFormats.add(enumerateFormats(i10));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return cachedSupportedFormats.get(i7);
    }
}
