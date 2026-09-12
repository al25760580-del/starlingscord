package cl;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import com.mkuczera.haptic.NativeHapticFeedbackSpec;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3735a;

    public e(int i7) {
        this.f3735a = i7;
    }

    @Override // cl.a
    public final void a(Vibrator vibrator) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        try {
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(VibrationEffect.createPredefined(this.f3735a));
            }
        } catch (Exception e10) {
            Log.w(NativeHapticFeedbackSpec.NAME, "VibrateWithCreatePredefined failed", e10);
        }
    }
}
