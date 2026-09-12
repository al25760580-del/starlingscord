package mn;

import a5.l0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f15920d;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f15923v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f15924w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f15925x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f15926y;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f15922i = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15921e = 200;

    public b(c cVar, float f2, float f7, float f10, float f11) {
        this.f15920d = new WeakReference(cVar);
        this.f15923v = f2;
        this.f15924w = f7;
        this.f15925x = f10;
        this.f15926y = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = (c) this.f15920d.get();
        if (cVar == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f15922i;
        long j = this.f15921e;
        float fMin = Math.min(j, jCurrentTimeMillis);
        float f2 = j;
        float fR = l0.r(fMin, this.f15924w, f2);
        if (fMin >= f2) {
            cVar.setImageToWrapCropBounds(true);
        } else {
            cVar.i(this.f15923v + fR, this.f15925x, this.f15926y);
            cVar.post(this);
        }
    }
}
