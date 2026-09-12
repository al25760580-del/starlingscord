package kh;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final RectF f14517h = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f14520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f14522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f14523g;

    public r(float f2, float f7, float f10, float f11) {
        this.f14518b = f2;
        this.f14519c = f7;
        this.f14520d = f10;
        this.f14521e = f11;
    }

    @Override // kh.t
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f14526a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f2 = this.f14520d;
        float f7 = this.f14521e;
        RectF rectF = f14517h;
        rectF.set(this.f14518b, this.f14519c, f2, f7);
        path.arcTo(rectF, this.f14522f, this.f14523g, false);
        path.transform(matrix);
    }
}
