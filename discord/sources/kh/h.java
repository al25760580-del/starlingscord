package kh;

import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends sa.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14478g;

    public h(int i7) {
        this.f14478g = i7;
    }

    @Override // sa.a
    public final void I(Object obj, float f2) {
        i iVar = (i) obj;
        float[] fArr = iVar.Z;
        if (fArr != null) {
            int i7 = this.f14478g;
            if (fArr[i7] != f2) {
                fArr[i7] = f2;
                mi.a aVar = iVar.f14481b0;
                if (aVar != null) {
                    float fI = iVar.i();
                    MaterialButton materialButton = (MaterialButton) aVar.f15798e;
                    int i10 = (int) (fI * 0.11f);
                    if (materialButton.U != i10) {
                        materialButton.U = i10;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                iVar.invalidateSelf();
            }
        }
    }

    @Override // sa.a
    public final float q(Object obj) {
        float[] fArr = ((i) obj).Z;
        if (fArr != null) {
            return fArr[this.f14478g];
        }
        return 0.0f;
    }
}
