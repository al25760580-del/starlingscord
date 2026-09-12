package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2612a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        switch (this.f2612a) {
            case 0:
                return f2 * f2 * f2 * f2 * f2;
            case 1:
            default:
                float f7 = f2 - 1.0f;
                return (f7 * f7 * f7 * f7 * f7) + 1.0f;
        }
    }
}
