package mn;

import a5.l0;
import android.graphics.RectF;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {
    public final float E;
    public final float F;
    public final boolean G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f15913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15914e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f15915i = System.currentTimeMillis();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f15916v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f15917w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f15918x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f15919y;

    public a(c cVar, long j, float f2, float f7, float f10, float f11, float f12, float f13, boolean z5) {
        this.f15913d = new WeakReference(cVar);
        this.f15914e = j;
        this.f15916v = f2;
        this.f15917w = f7;
        this.f15918x = f10;
        this.f15919y = f11;
        this.E = f12;
        this.F = f13;
        this.G = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = (c) this.f15913d.get();
        if (cVar == null) {
            return;
        }
        RectF rectF = cVar.M;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f15915i;
        long j = this.f15914e;
        float fMin = Math.min(j, jCurrentTimeMillis);
        float f2 = j;
        float f7 = (fMin / f2) - 1.0f;
        float f10 = (f7 * f7 * f7) + 1.0f;
        float f11 = (this.f15918x * f10) + 0.0f;
        float f12 = (f10 * this.f15919y) + 0.0f;
        float fR = l0.r(fMin, this.F, f2);
        if (fMin < f2) {
            float[] fArr = cVar.f15929e;
            cVar.d(f11 - (fArr[0] - this.f15916v), f12 - (fArr[1] - this.f15917w));
            if (!this.G) {
                cVar.i(this.E + fR, rectF.centerX(), rectF.centerY());
            }
            if (cVar.g(cVar.f15928d)) {
                return;
            }
            cVar.post(this);
        }
    }
}
