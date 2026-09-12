package m3;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends e0 {
    @Override // sa.a
    public final void G(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // m3.e0, sa.a
    public final void H(int i7, View view) {
        view.setTransitionVisibility(i7);
    }

    @Override // m3.e0
    public final void K(View view, int i7, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i7, i10, i11, i12);
    }

    @Override // m3.e0
    public final void L(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // m3.e0
    public final void M(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }

    @Override // sa.a
    public final float p(View view) {
        return view.getTransitionAlpha();
    }
}
