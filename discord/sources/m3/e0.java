package m3;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.e1;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends sa.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f15396g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f15397h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f15398i = true;
    public static boolean j = true;

    @Override // sa.a
    public void H(int i7, View view) {
        if (Build.VERSION.SDK_INT == 28) {
            super.H(i7, view);
        } else if (j) {
            try {
                e1.n(i7, view);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }

    public void K(View view, int i7, int i10, int i11, int i12) {
        if (f15398i) {
            try {
                e1.l(view, i7, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                f15398i = false;
            }
        }
    }

    public void L(View view, Matrix matrix) {
        if (f15396g) {
            try {
                e1.p(view, matrix);
            } catch (NoSuchMethodError unused) {
                f15396g = false;
            }
        }
    }

    public void M(ViewGroup viewGroup, Matrix matrix) {
        if (f15397h) {
            try {
                e1.q(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                f15397h = false;
            }
        }
    }
}
