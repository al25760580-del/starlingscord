package lg;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f15071a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q2.a f15072b = new q2.a(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q2.a f15073c = new q2.a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q2.a f15074d = new q2.a(q2.a.f18587e);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f15075e = new DecelerateInterpolator();

    public static float a(float f2, float f7, float f10) {
        return kk.b.c(f7, f2, f10, f2);
    }

    public static float b(float f2, float f7, float f10, float f11, float f12) {
        if (f12 <= f10) {
            return f2;
        }
        return f12 >= f11 ? f7 : a(f2, f7, (f12 - f10) / (f11 - f10));
    }

    public static int c(int i7, int i10, float f2) {
        return Math.round(f2 * (i10 - i7)) + i7;
    }
}
