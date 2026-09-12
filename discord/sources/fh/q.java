package fh;

import android.graphics.Matrix;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f9248a = new float[2];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f9249b = {1.0f, 0.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f9250c = new Matrix();

    public final void a(float f2) {
        float[] fArr = this.f9249b;
        float fAtan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
        float[] fArr2 = this.f9248a;
        double d6 = f2;
        double d7 = fAtan2;
        fArr2[0] = (float) ((Math.cos(d7) * d6) + ((double) fArr2[0]));
        fArr2[1] = (float) ((Math.sin(d7) * d6) + ((double) fArr2[1]));
    }

    public final void b() {
        Arrays.fill(this.f9248a, 0.0f);
        float[] fArr = this.f9249b;
        Arrays.fill(fArr, 0.0f);
        fArr[0] = 1.0f;
        this.f9250c.reset();
    }

    public final void c(float f2) {
        Matrix matrix = this.f9250c;
        matrix.reset();
        matrix.setRotate(f2);
        matrix.mapPoints(this.f9248a);
        matrix.mapPoints(this.f9249b);
    }
}
