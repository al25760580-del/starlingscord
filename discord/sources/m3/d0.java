package m3;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f15392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fh.g f15393b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f15392a = new f0();
        } else {
            f15392a = new e0();
        }
        f15393b = new fh.g(Float.class, "translationAlpha", 10);
        new fh.g(Rect.class, "clipBounds", 11);
    }

    public static void a(View view, int i7, int i10, int i11, int i12) {
        f15392a.K(view, i7, i10, i11, i12);
    }

    public static void b(int i7, View view) {
        f15392a.H(i7, view);
    }
}
