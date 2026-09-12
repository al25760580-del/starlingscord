package cl;

import android.os.Build;
import android.os.VibrationAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import com.mkuczera.haptic.NativeHapticFeedbackSpec;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f3736a;

    public f(long[] jArr) {
        this.f3736a = jArr;
    }

    @Override // cl.a
    public final void a(Vibrator vibrator) {
        try {
            if (vibrator.hasVibrator()) {
                int i7 = Build.VERSION.SDK_INT;
                long[] jArr = this.f3736a;
                if (i7 >= 33) {
                    vibrator.vibrate(VibrationEffect.createWaveform(jArr, -1), new VibrationAttributes.Builder().setUsage(18).build());
                } else if (i7 >= 26) {
                    vibrator.vibrate(VibrationEffect.createWaveform(jArr, -1));
                } else {
                    vibrator.vibrate(jArr, -1);
                }
            }
        } catch (Exception e10) {
            Log.w(NativeHapticFeedbackSpec.NAME, "VibrateWithDuration failed", e10);
        }
    }
}
