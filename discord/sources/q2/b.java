package q2;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f18588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18589b;

    public b(float[] fArr) {
        this.f18588a = fArr;
        this.f18589b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f18588a;
        int iMin = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f7 = this.f18589b;
        float f10 = (f2 - (iMin * f7)) / f7;
        float f11 = fArr[iMin];
        return kk.b.c(fArr[iMin + 1], f11, f10, f11);
    }
}
