package androidx.core.view;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o1 f1715a;

    public p1(int i7, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f1715a = new n1(l1.b(i7, interpolator, j));
        } else {
            this.f1715a = new k1(i7, interpolator, j);
        }
    }
}
