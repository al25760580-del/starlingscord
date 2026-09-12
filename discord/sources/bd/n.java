package bd;

import android.media.MediaCodecInfo;
import java.util.List;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i10, double d6) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            String str = e0.f13789b;
            if (!str.equals("sabrina") && !str.equals("boreal")) {
                String str2 = e0.f13791d;
                if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                    MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i7, i10, (int) d6);
                    for (int i11 = 0; i11 < supportedPerformancePoints.size(); i11++) {
                        if (supportedPerformancePoints.get(i11).covers(performancePoint)) {
                            return 2;
                        }
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
}
