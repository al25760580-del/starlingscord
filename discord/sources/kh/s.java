package kh;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14525c;

    @Override // kh.t
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f14526a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f14524b, this.f14525c);
        path.transform(matrix);
    }
}
