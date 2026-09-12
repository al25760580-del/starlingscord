package cl;

import android.os.Build;
import android.os.VibrationAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import com.mkuczera.haptic.NativeHapticFeedbackSpec;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f3734c;

    public d(int i7, float f2, f fVar) {
        this.f3732a = i7;
        this.f3733b = f2;
        this.f3734c = fVar;
    }

    @Override // cl.a
    public final void a(Vibrator vibrator) {
        int i7 = this.f3732a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31) {
            return;
        }
        try {
            if (vibrator.hasVibrator() && vibrator.arePrimitivesSupported(i7)[0]) {
                VibrationEffect vibrationEffectCompose = VibrationEffect.startComposition().addPrimitive(i7, this.f3733b).compose();
                if (i10 >= 33) {
                    vibrator.vibrate(vibrationEffectCompose, new VibrationAttributes.Builder().setUsage(18).build());
                    return;
                } else {
                    vibrator.vibrate(vibrationEffectCompose);
                    return;
                }
            }
        } catch (Exception e10) {
            Log.w(NativeHapticFeedbackSpec.NAME, "VibrateWithComposition failed", e10);
        }
        this.f3734c.a(vibrator);
    }
}
