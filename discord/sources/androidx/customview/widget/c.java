package androidx.customview.widget;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        float f7 = f2 - 1.0f;
        return (f7 * f7 * f7 * f7 * f7) + 1.0f;
    }
}
